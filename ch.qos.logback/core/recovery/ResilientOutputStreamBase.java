package ch.qos.logback.core.recovery;

import ch.qos.logback.core.Context;
import ch.qos.logback.core.status.ErrorStatus;
import ch.qos.logback.core.status.InfoStatus;
import ch.qos.logback.core.status.Status;
import ch.qos.logback.core.status.StatusManager;
import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes.dex */
public abstract class ResilientOutputStreamBase extends OutputStream {
    static final int STATUS_COUNT_LIMIT = 8;
    private Context context;
    protected OutputStream os;
    private RecoveryCoordinator recoveryCoordinator;
    private int noContextWarning = 0;
    private int statusCount = 0;
    protected boolean presumedClean = true;

    private boolean isPresumedInError() {
        return (this.recoveryCoordinator == null || this.presumedClean) ? false : true;
    }

    private void postSuccessfulWrite() {
        if (this.recoveryCoordinator != null) {
            this.recoveryCoordinator = null;
            this.statusCount = 0;
            addStatus(new InfoStatus("Recovered from IO failure on " + getDescription(), this));
        }
    }

    public void addStatus(Status status) {
        Context context = this.context;
        if (context != null) {
            StatusManager statusManager = context.getStatusManager();
            if (statusManager != null) {
                statusManager.add(status);
                return;
            }
            return;
        }
        int i2 = this.noContextWarning;
        this.noContextWarning = i2 + 1;
        if (i2 == 0) {
            System.out.println("LOGBACK: No context given for " + this);
        }
    }

    void addStatusIfCountNotOverLimit(Status status) {
        int i2 = this.statusCount + 1;
        this.statusCount = i2;
        if (i2 < 8) {
            addStatus(status);
        }
        if (this.statusCount == 8) {
            addStatus(status);
            addStatus(new InfoStatus("Will supress future messages regarding " + getDescription(), this));
        }
    }

    void attemptRecovery() {
        try {
            close();
        } catch (IOException unused) {
        }
        addStatusIfCountNotOverLimit(new InfoStatus("Attempting to recover from IO failure on " + getDescription(), this));
        try {
            this.os = openNewOutputStream();
            this.presumedClean = true;
        } catch (IOException e2) {
            addStatusIfCountNotOverLimit(new ErrorStatus("Failed to open " + getDescription(), this, e2));
        }
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        OutputStream outputStream = this.os;
        if (outputStream != null) {
            outputStream.close();
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        OutputStream outputStream = this.os;
        if (outputStream != null) {
            try {
                outputStream.flush();
                postSuccessfulWrite();
            } catch (IOException e2) {
                postIOFailure(e2);
            }
        }
    }

    public Context getContext() {
        return this.context;
    }

    abstract String getDescription();

    abstract OutputStream openNewOutputStream();

    void postIOFailure(IOException iOException) {
        addStatusIfCountNotOverLimit(new ErrorStatus("IO failure while writing to " + getDescription(), this, iOException));
        this.presumedClean = false;
        if (this.recoveryCoordinator == null) {
            this.recoveryCoordinator = new RecoveryCoordinator();
        }
    }

    public void setContext(Context context) {
        this.context = context;
    }

    @Override // java.io.OutputStream
    public void write(int i2) throws IOException {
        if (isPresumedInError()) {
            if (this.recoveryCoordinator.isTooSoon()) {
                return;
            }
            attemptRecovery();
        } else {
            try {
                this.os.write(i2);
                postSuccessfulWrite();
            } catch (IOException e2) {
                postIOFailure(e2);
            }
        }
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i2, int i3) throws IOException {
        if (isPresumedInError()) {
            if (this.recoveryCoordinator.isTooSoon()) {
                return;
            }
            attemptRecovery();
        } else {
            try {
                this.os.write(bArr, i2, i3);
                postSuccessfulWrite();
            } catch (IOException e2) {
                postIOFailure(e2);
            }
        }
    }
}