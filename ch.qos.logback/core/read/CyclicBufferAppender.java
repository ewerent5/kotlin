package ch.qos.logback.core.read;

import ch.qos.logback.core.AppenderBase;
import ch.qos.logback.core.helpers.CyclicBuffer;
import com.google.android.gms.ads.AdRequest;

/* loaded from: classes.dex */
public class CyclicBufferAppender<E> extends AppenderBase<E> {
    CyclicBuffer<E> cb;
    int maxSize = AdRequest.MAX_CONTENT_URL_LENGTH;

    @Override // ch.qos.logback.core.AppenderBase
    protected void append(E e2) {
        if (isStarted()) {
            this.cb.add(e2);
        }
    }

    public E get(int i2) {
        if (isStarted()) {
            return this.cb.get(i2);
        }
        return null;
    }

    public int getLength() {
        if (isStarted()) {
            return this.cb.length();
        }
        return 0;
    }

    public int getMaxSize() {
        return this.maxSize;
    }

    public void reset() {
        this.cb.clear();
    }

    public void setMaxSize(int i2) {
        this.maxSize = i2;
    }

    @Override // ch.qos.logback.core.AppenderBase, ch.qos.logback.core.spi.LifeCycle
    public void start() {
        this.cb = new CyclicBuffer<>(this.maxSize);
        super.start();
    }

    @Override // ch.qos.logback.core.AppenderBase, ch.qos.logback.core.spi.LifeCycle
    public void stop() {
        this.cb = null;
        super.stop();
    }
}