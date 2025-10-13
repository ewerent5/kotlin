package ch.qos.logback.core.spi;

import ch.qos.logback.core.Appender;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public class AppenderAttachableImpl<E> implements AppenderAttachable<E> {
    static final long START = System.currentTimeMillis();
    private final CopyOnWriteArrayList<Appender<E>> appenderList = new CopyOnWriteArrayList<>();

    @Override // ch.qos.logback.core.spi.AppenderAttachable
    public void addAppender(Appender<E> appender) {
        if (appender == null) {
            throw new IllegalArgumentException("Null argument disallowed");
        }
        this.appenderList.addIfAbsent(appender);
    }

    public int appendLoopOnAppenders(E e2) {
        Iterator<Appender<E>> it = this.appenderList.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            it.next().doAppend(e2);
            i2++;
        }
        return i2;
    }

    @Override // ch.qos.logback.core.spi.AppenderAttachable
    public void detachAndStopAllAppenders() {
        Iterator<Appender<E>> it = this.appenderList.iterator();
        while (it.hasNext()) {
            it.next().stop();
        }
        this.appenderList.clear();
    }

    @Override // ch.qos.logback.core.spi.AppenderAttachable
    public boolean detachAppender(Appender<E> appender) {
        if (appender == null) {
            return false;
        }
        return this.appenderList.remove(appender);
    }

    @Override // ch.qos.logback.core.spi.AppenderAttachable
    public boolean detachAppender(String str) {
        if (str == null) {
            return false;
        }
        Iterator<Appender<E>> it = this.appenderList.iterator();
        while (it.hasNext()) {
            Appender<E> next = it.next();
            if (str.equals(next.getName())) {
                return this.appenderList.remove(next);
            }
        }
        return false;
    }

    @Override // ch.qos.logback.core.spi.AppenderAttachable
    public Appender<E> getAppender(String str) {
        if (str == null) {
            return null;
        }
        Iterator<Appender<E>> it = this.appenderList.iterator();
        while (it.hasNext()) {
            Appender<E> next = it.next();
            if (str.equals(next.getName())) {
                return next;
            }
        }
        return null;
    }

    @Override // ch.qos.logback.core.spi.AppenderAttachable
    public boolean isAttached(Appender<E> appender) {
        if (appender == null) {
            return false;
        }
        Iterator<Appender<E>> it = this.appenderList.iterator();
        while (it.hasNext()) {
            if (it.next() == appender) {
                return true;
            }
        }
        return false;
    }

    @Override // ch.qos.logback.core.spi.AppenderAttachable
    public Iterator<Appender<E>> iteratorForAppenders() {
        return this.appenderList.iterator();
    }
}