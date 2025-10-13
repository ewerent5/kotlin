package ch.qos.logback.core;

import ch.qos.logback.core.encoder.Encoder;
import ch.qos.logback.core.encoder.LayoutWrappingEncoder;
import ch.qos.logback.core.spi.DeferredProcessingAware;
import ch.qos.logback.core.spi.LogbackLock;
import ch.qos.logback.core.status.ErrorStatus;
import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes.dex */
public class OutputStreamAppender<E> extends UnsynchronizedAppenderBase<E> {
    protected Encoder<E> encoder;
    protected LogbackLock lock = new LogbackLock();
    private OutputStream outputStream;

    @Override // ch.qos.logback.core.UnsynchronizedAppenderBase
    protected void append(E e2) {
        if (isStarted()) {
            subAppend(e2);
        }
    }

    protected void closeOutputStream() throws IOException {
        if (this.outputStream != null) {
            try {
                encoderClose();
                this.outputStream.close();
                this.outputStream = null;
            } catch (IOException e2) {
                addStatus(new ErrorStatus("Could not close output stream for OutputStreamAppender.", this, e2));
            }
        }
    }

    void encoderClose() {
        Encoder<E> encoder = this.encoder;
        if (encoder == null || this.outputStream == null) {
            return;
        }
        try {
            encoder.close();
        } catch (IOException e2) {
            this.started = false;
            addStatus(new ErrorStatus("Failed to write footer for appender named [" + this.name + "].", this, e2));
        }
    }

    void encoderInit() {
        OutputStream outputStream;
        Encoder<E> encoder = this.encoder;
        if (encoder == null || (outputStream = this.outputStream) == null) {
            return;
        }
        try {
            encoder.init(outputStream);
        } catch (IOException e2) {
            this.started = false;
            addStatus(new ErrorStatus("Failed to initialize encoder for appender named [" + this.name + "].", this, e2));
        }
    }

    public Encoder<E> getEncoder() {
        return this.encoder;
    }

    public OutputStream getOutputStream() {
        return this.outputStream;
    }

    public void setEncoder(Encoder<E> encoder) {
        this.encoder = encoder;
    }

    public void setLayout(Layout<E> layout) {
        addWarn("This appender no longer admits a layout as a sub-component, set an encoder instead.");
        addWarn("To ensure compatibility, wrapping your layout in LayoutWrappingEncoder.");
        addWarn("See also http://logback.qos.ch/codes.html#layoutInsteadOfEncoder for details");
        LayoutWrappingEncoder layoutWrappingEncoder = new LayoutWrappingEncoder();
        layoutWrappingEncoder.setLayout(layout);
        layoutWrappingEncoder.setContext(this.context);
        this.encoder = layoutWrappingEncoder;
    }

    public void setOutputStream(OutputStream outputStream) {
        synchronized (this.lock) {
            closeOutputStream();
            this.outputStream = outputStream;
            if (this.encoder == null) {
                addWarn("Encoder has not been set. Cannot invoke its init method.");
            } else {
                encoderInit();
            }
        }
    }

    @Override // ch.qos.logback.core.UnsynchronizedAppenderBase, ch.qos.logback.core.spi.LifeCycle
    public void start() {
        int i2;
        if (this.encoder == null) {
            addStatus(new ErrorStatus("No encoder set for the appender named \"" + this.name + "\".", this));
            i2 = 1;
        } else {
            i2 = 0;
        }
        if (this.outputStream == null) {
            addStatus(new ErrorStatus("No output stream set for the appender named \"" + this.name + "\".", this));
            i2++;
        }
        if (i2 == 0) {
            super.start();
        }
    }

    @Override // ch.qos.logback.core.UnsynchronizedAppenderBase, ch.qos.logback.core.spi.LifeCycle
    public void stop() {
        synchronized (this.lock) {
            closeOutputStream();
            super.stop();
        }
    }

    protected void subAppend(E e2) {
        if (isStarted()) {
            try {
                if (e2 instanceof DeferredProcessingAware) {
                    ((DeferredProcessingAware) e2).prepareForDeferredProcessing();
                }
                synchronized (this.lock) {
                    writeOut(e2);
                }
            } catch (IOException e3) {
                this.started = false;
                addStatus(new ErrorStatus("IO failure in appender", this, e3));
            }
        }
    }

    protected void writeOut(E e2) {
        this.encoder.doEncode(e2);
    }
}