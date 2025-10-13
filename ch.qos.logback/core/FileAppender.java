package ch.qos.logback.core;

import ch.qos.logback.core.recovery.ResilientFileOutputStream;
import ch.qos.logback.core.util.EnvUtil;
import ch.qos.logback.core.util.FileUtil;
import java.io.File;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;

/* loaded from: classes.dex */
public class FileAppender<E> extends OutputStreamAppender<E> {
    protected boolean append = true;
    protected String fileName = null;
    private boolean prudent = false;
    private boolean initialized = false;
    private boolean lazyInit = false;

    private String getAbsoluteFilePath(String str) {
        return (!EnvUtil.isAndroidOS() || new File(str).isAbsolute()) ? str : FileUtil.prefixRelativePath(this.context.getProperty(CoreConstants.DATA_DIR_KEY), str);
    }

    private void safeWrite(E e2) throws IOException {
        FileChannel channel = ((ResilientFileOutputStream) getOutputStream()).getChannel();
        if (channel == null) {
            return;
        }
        FileLock fileLockLock = null;
        try {
            fileLockLock = channel.lock();
            long jPosition = channel.position();
            long size = channel.size();
            if (size != jPosition) {
                channel.position(size);
            }
            super.writeOut(e2);
        } finally {
            if (fileLockLock != null) {
                fileLockLock.release();
            }
        }
    }

    public String getFile() {
        return this.fileName;
    }

    public boolean getLazy() {
        return this.lazyInit;
    }

    public boolean isAppend() {
        return this.append;
    }

    public boolean isPrudent() {
        return this.prudent;
    }

    protected boolean openFile(String str) {
        String absoluteFilePath = getAbsoluteFilePath(str);
        synchronized (this.lock) {
            File file = new File(absoluteFilePath);
            if (FileUtil.isParentDirectoryCreationRequired(file) && !FileUtil.createMissingParentDirectories(file)) {
                addError("Failed to create parent directories for [" + file.getAbsolutePath() + "]");
            }
            ResilientFileOutputStream resilientFileOutputStream = new ResilientFileOutputStream(file, this.append);
            resilientFileOutputStream.setContext(this.context);
            setOutputStream(resilientFileOutputStream);
        }
        return true;
    }

    public final String rawFileProperty() {
        return this.fileName;
    }

    public void setAppend(boolean z) {
        this.append = z;
    }

    public void setFile(String str) {
        this.fileName = str == null ? null : str.trim();
    }

    public void setLazy(boolean z) {
        this.lazyInit = z;
    }

    public void setPrudent(boolean z) {
        this.prudent = z;
    }

    @Override // ch.qos.logback.core.OutputStreamAppender, ch.qos.logback.core.UnsynchronizedAppenderBase, ch.qos.logback.core.spi.LifeCycle
    public void start() {
        String file = getFile();
        boolean z = true;
        if (file != null) {
            String absoluteFilePath = getAbsoluteFilePath(file);
            addInfo("File property is set to [" + absoluteFilePath + "]");
            if (this.prudent && !isAppend()) {
                setAppend(true);
                addWarn("Setting \"Append\" property to true on account of \"Prudent\" mode");
            }
            if (this.lazyInit) {
                setOutputStream(new NOPOutputStream());
            } else {
                try {
                    openFile(absoluteFilePath);
                } catch (IOException e2) {
                    addError("openFile(" + absoluteFilePath + "," + this.append + ") failed", e2);
                }
            }
            z = false;
        } else {
            addError("\"File\" property not set for appender named [" + this.name + "]");
        }
        if (z) {
            return;
        }
        super.start();
    }

    @Override // ch.qos.logback.core.OutputStreamAppender
    protected void subAppend(E e2) {
        if (!this.initialized && this.lazyInit) {
            this.initialized = true;
            try {
                openFile(getFile());
            } catch (IOException e3) {
                this.started = false;
                addError("openFile(" + this.fileName + "," + this.append + ") failed", e3);
            }
        }
        super.subAppend(e2);
    }

    @Override // ch.qos.logback.core.OutputStreamAppender
    protected void writeOut(E e2) throws IOException {
        if (this.prudent) {
            safeWrite(e2);
        } else {
            super.writeOut(e2);
        }
    }
}