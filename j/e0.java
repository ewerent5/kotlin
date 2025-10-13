package j;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* compiled from: Timeout.kt */
/* loaded from: classes3.dex */
public class e0 {
    public static final b Companion = new b(null);
    public static final e0 NONE = new a();
    private long deadlineNanoTime;
    private boolean hasDeadline;
    private long timeoutNanos;

    /* compiled from: Timeout.kt */
    public static final class a extends e0 {
        a() {
        }

        @Override // j.e0
        public e0 deadlineNanoTime(long j2) {
            return this;
        }

        @Override // j.e0
        public void throwIfReached() {
        }

        @Override // j.e0
        public e0 timeout(long j2, TimeUnit timeUnit) {
            i.y.d.l.d(timeUnit, "unit");
            return this;
        }
    }

    /* compiled from: Timeout.kt */
    public static final class b {
        private b() {
        }

        public final long a(long j2, long j3) {
            return (j2 != 0 && (j3 == 0 || j2 < j3)) ? j2 : j3;
        }

        public /* synthetic */ b(i.y.d.g gVar) {
            this();
        }
    }

    public e0 clearDeadline() {
        this.hasDeadline = false;
        return this;
    }

    public e0 clearTimeout() {
        this.timeoutNanos = 0L;
        return this;
    }

    public final e0 deadline(long j2, TimeUnit timeUnit) {
        i.y.d.l.d(timeUnit, "unit");
        if (j2 > 0) {
            return deadlineNanoTime(System.nanoTime() + timeUnit.toNanos(j2));
        }
        throw new IllegalArgumentException(("duration <= 0: " + j2).toString());
    }

    public long deadlineNanoTime() {
        if (this.hasDeadline) {
            return this.deadlineNanoTime;
        }
        throw new IllegalStateException("No deadline".toString());
    }

    public boolean hasDeadline() {
        return this.hasDeadline;
    }

    public final void intersectWith(e0 e0Var, i.y.c.a<i.s> aVar) {
        i.y.d.l.d(e0Var, "other");
        i.y.d.l.d(aVar, "block");
        long jTimeoutNanos = timeoutNanos();
        long jA = Companion.a(e0Var.timeoutNanos(), timeoutNanos());
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        timeout(jA, timeUnit);
        if (!hasDeadline()) {
            if (e0Var.hasDeadline()) {
                deadlineNanoTime(e0Var.deadlineNanoTime());
            }
            try {
                aVar.invoke();
                i.y.d.k.b(1);
                timeout(jTimeoutNanos, timeUnit);
                if (e0Var.hasDeadline()) {
                    clearDeadline();
                }
                i.y.d.k.a(1);
                return;
            } catch (Throwable th) {
                i.y.d.k.b(1);
                timeout(jTimeoutNanos, TimeUnit.NANOSECONDS);
                if (e0Var.hasDeadline()) {
                    clearDeadline();
                }
                i.y.d.k.a(1);
                throw th;
            }
        }
        long jDeadlineNanoTime = deadlineNanoTime();
        if (e0Var.hasDeadline()) {
            deadlineNanoTime(Math.min(deadlineNanoTime(), e0Var.deadlineNanoTime()));
        }
        try {
            aVar.invoke();
            i.y.d.k.b(1);
            timeout(jTimeoutNanos, timeUnit);
            if (e0Var.hasDeadline()) {
                deadlineNanoTime(jDeadlineNanoTime);
            }
            i.y.d.k.a(1);
        } catch (Throwable th2) {
            i.y.d.k.b(1);
            timeout(jTimeoutNanos, TimeUnit.NANOSECONDS);
            if (e0Var.hasDeadline()) {
                deadlineNanoTime(jDeadlineNanoTime);
            }
            i.y.d.k.a(1);
            throw th2;
        }
    }

    public void throwIfReached() throws InterruptedIOException {
        if (Thread.interrupted()) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        }
        if (this.hasDeadline && this.deadlineNanoTime - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public e0 timeout(long j2, TimeUnit timeUnit) {
        i.y.d.l.d(timeUnit, "unit");
        if (j2 >= 0) {
            this.timeoutNanos = timeUnit.toNanos(j2);
            return this;
        }
        throw new IllegalArgumentException(("timeout < 0: " + j2).toString());
    }

    public long timeoutNanos() {
        return this.timeoutNanos;
    }

    public final void waitUntilNotified(Object obj) throws InterruptedException, InterruptedIOException {
        i.y.d.l.d(obj, "monitor");
        try {
            boolean zHasDeadline = hasDeadline();
            long jTimeoutNanos = timeoutNanos();
            long jNanoTime = 0;
            if (!zHasDeadline && jTimeoutNanos == 0) {
                obj.wait();
                return;
            }
            long jNanoTime2 = System.nanoTime();
            if (zHasDeadline && jTimeoutNanos != 0) {
                jTimeoutNanos = Math.min(jTimeoutNanos, deadlineNanoTime() - jNanoTime2);
            } else if (zHasDeadline) {
                jTimeoutNanos = deadlineNanoTime() - jNanoTime2;
            }
            if (jTimeoutNanos > 0) {
                long j2 = jTimeoutNanos / 1000000;
                Long.signum(j2);
                obj.wait(j2, (int) (jTimeoutNanos - (1000000 * j2)));
                jNanoTime = System.nanoTime() - jNanoTime2;
            }
            if (jNanoTime >= jTimeoutNanos) {
                throw new InterruptedIOException("timeout");
            }
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        }
    }

    public e0 deadlineNanoTime(long j2) {
        this.hasDeadline = true;
        this.deadlineNanoTime = j2;
        return this;
    }
}