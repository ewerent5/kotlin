package j;

import ch.qos.logback.core.CoreConstants;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* compiled from: AsyncTimeout.kt */
/* loaded from: classes3.dex */
public class d extends e0 {
    public static final a Companion = new a(null);
    private static final long IDLE_TIMEOUT_MILLIS;
    private static final long IDLE_TIMEOUT_NANOS;
    private static final int TIMEOUT_WRITE_SIZE = 65536;
    private static d head;
    private boolean inQueue;
    private d next;
    private long timeoutAt;

    /* compiled from: AsyncTimeout.kt */
    public static final class a {
        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean d(d dVar) {
            synchronized (d.class) {
                for (d dVar2 = d.head; dVar2 != null; dVar2 = dVar2.next) {
                    if (dVar2.next == dVar) {
                        dVar2.next = dVar.next;
                        dVar.next = null;
                        return false;
                    }
                }
                return true;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void e(d dVar, long j2, boolean z) {
            synchronized (d.class) {
                if (d.head == null) {
                    d.head = new d();
                    new b().start();
                }
                long jNanoTime = System.nanoTime();
                if (j2 != 0 && z) {
                    dVar.timeoutAt = Math.min(j2, dVar.deadlineNanoTime() - jNanoTime) + jNanoTime;
                } else if (j2 != 0) {
                    dVar.timeoutAt = j2 + jNanoTime;
                } else {
                    if (!z) {
                        throw new AssertionError();
                    }
                    dVar.timeoutAt = dVar.deadlineNanoTime();
                }
                long jRemainingNanos = dVar.remainingNanos(jNanoTime);
                d dVar2 = d.head;
                i.y.d.l.b(dVar2);
                while (dVar2.next != null) {
                    d dVar3 = dVar2.next;
                    i.y.d.l.b(dVar3);
                    if (jRemainingNanos < dVar3.remainingNanos(jNanoTime)) {
                        break;
                    }
                    dVar2 = dVar2.next;
                    i.y.d.l.b(dVar2);
                }
                dVar.next = dVar2.next;
                dVar2.next = dVar;
                if (dVar2 == d.head) {
                    d.class.notify();
                }
                i.s sVar = i.s.a;
            }
        }

        public final d c() throws InterruptedException {
            d dVar = d.head;
            i.y.d.l.b(dVar);
            d dVar2 = dVar.next;
            if (dVar2 == null) {
                long jNanoTime = System.nanoTime();
                d.class.wait(d.IDLE_TIMEOUT_MILLIS);
                d dVar3 = d.head;
                i.y.d.l.b(dVar3);
                if (dVar3.next != null || System.nanoTime() - jNanoTime < d.IDLE_TIMEOUT_NANOS) {
                    return null;
                }
                return d.head;
            }
            long jRemainingNanos = dVar2.remainingNanos(System.nanoTime());
            if (jRemainingNanos > 0) {
                long j2 = jRemainingNanos / 1000000;
                d.class.wait(j2, (int) (jRemainingNanos - (1000000 * j2)));
                return null;
            }
            d dVar4 = d.head;
            i.y.d.l.b(dVar4);
            dVar4.next = dVar2.next;
            dVar2.next = null;
            return dVar2;
        }

        public /* synthetic */ a(i.y.d.g gVar) {
            this();
        }
    }

    /* compiled from: AsyncTimeout.kt */
    private static final class b extends Thread {
        public b() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            d dVarC;
            while (true) {
                try {
                    synchronized (d.class) {
                        dVarC = d.Companion.c();
                        if (dVarC == d.head) {
                            d.head = null;
                            return;
                        }
                        i.s sVar = i.s.a;
                    }
                    if (dVarC != null) {
                        dVarC.timedOut();
                    }
                } catch (InterruptedException unused) {
                }
            }
        }
    }

    /* compiled from: AsyncTimeout.kt */
    public static final class c implements b0 {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ b0 f16450f;

        c(b0 b0Var) {
            this.f16450f = b0Var;
        }

        @Override // j.b0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public d timeout() {
            return d.this;
        }

        @Override // j.b0, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            d dVar = d.this;
            dVar.enter();
            try {
                this.f16450f.close();
                i.s sVar = i.s.a;
                if (dVar.exit()) {
                    throw dVar.access$newTimeoutException(null);
                }
            } catch (IOException e2) {
                if (!dVar.exit()) {
                    throw e2;
                }
                throw dVar.access$newTimeoutException(e2);
            } finally {
                dVar.exit();
            }
        }

        @Override // j.b0, java.io.Flushable
        public void flush() throws IOException {
            d dVar = d.this;
            dVar.enter();
            try {
                this.f16450f.flush();
                i.s sVar = i.s.a;
                if (dVar.exit()) {
                    throw dVar.access$newTimeoutException(null);
                }
            } catch (IOException e2) {
                if (!dVar.exit()) {
                    throw e2;
                }
                throw dVar.access$newTimeoutException(e2);
            } finally {
                dVar.exit();
            }
        }

        public String toString() {
            return "AsyncTimeout.sink(" + this.f16450f + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        @Override // j.b0
        public void write(f fVar, long j2) throws IOException {
            i.y.d.l.d(fVar, "source");
            j.c.b(fVar.y0(), 0L, j2);
            while (true) {
                long j3 = 0;
                if (j2 <= 0) {
                    return;
                }
                y yVar = fVar.f16453e;
                i.y.d.l.b(yVar);
                while (true) {
                    if (j3 >= d.TIMEOUT_WRITE_SIZE) {
                        break;
                    }
                    j3 += yVar.f16502d - yVar.f16501c;
                    if (j3 >= j2) {
                        j3 = j2;
                        break;
                    } else {
                        yVar = yVar.f16505g;
                        i.y.d.l.b(yVar);
                    }
                }
                d dVar = d.this;
                dVar.enter();
                try {
                    this.f16450f.write(fVar, j3);
                    i.s sVar = i.s.a;
                    if (dVar.exit()) {
                        throw dVar.access$newTimeoutException(null);
                    }
                    j2 -= j3;
                } catch (IOException e2) {
                    if (!dVar.exit()) {
                        throw e2;
                    }
                    throw dVar.access$newTimeoutException(e2);
                } finally {
                    dVar.exit();
                }
            }
        }
    }

    /* compiled from: AsyncTimeout.kt */
    /* renamed from: j.d$d, reason: collision with other inner class name */
    public static final class C0210d implements d0 {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ d0 f16452f;

        C0210d(d0 d0Var) {
            this.f16452f = d0Var;
        }

        @Override // j.d0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public d timeout() {
            return d.this;
        }

        @Override // j.d0, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            d dVar = d.this;
            dVar.enter();
            try {
                this.f16452f.close();
                i.s sVar = i.s.a;
                if (dVar.exit()) {
                    throw dVar.access$newTimeoutException(null);
                }
            } catch (IOException e2) {
                if (!dVar.exit()) {
                    throw e2;
                }
                throw dVar.access$newTimeoutException(e2);
            } finally {
                dVar.exit();
            }
        }

        @Override // j.d0
        public long read(f fVar, long j2) throws IOException {
            i.y.d.l.d(fVar, "sink");
            d dVar = d.this;
            dVar.enter();
            try {
                long j3 = this.f16452f.read(fVar, j2);
                if (dVar.exit()) {
                    throw dVar.access$newTimeoutException(null);
                }
                return j3;
            } catch (IOException e2) {
                if (dVar.exit()) {
                    throw dVar.access$newTimeoutException(e2);
                }
                throw e2;
            } finally {
                dVar.exit();
            }
        }

        public String toString() {
            return "AsyncTimeout.source(" + this.f16452f + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    static {
        long millis = TimeUnit.SECONDS.toMillis(60L);
        IDLE_TIMEOUT_MILLIS = millis;
        IDLE_TIMEOUT_NANOS = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long remainingNanos(long j2) {
        return this.timeoutAt - j2;
    }

    public final IOException access$newTimeoutException(IOException iOException) {
        return newTimeoutException(iOException);
    }

    public final void enter() {
        if (!(!this.inQueue)) {
            throw new IllegalStateException("Unbalanced enter/exit".toString());
        }
        long jTimeoutNanos = timeoutNanos();
        boolean zHasDeadline = hasDeadline();
        if (jTimeoutNanos != 0 || zHasDeadline) {
            this.inQueue = true;
            Companion.e(this, jTimeoutNanos, zHasDeadline);
        }
    }

    public final boolean exit() {
        if (!this.inQueue) {
            return false;
        }
        this.inQueue = false;
        return Companion.d(this);
    }

    protected IOException newTimeoutException(IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    public final b0 sink(b0 b0Var) {
        i.y.d.l.d(b0Var, "sink");
        return new c(b0Var);
    }

    public final d0 source(d0 d0Var) {
        i.y.d.l.d(d0Var, "source");
        return new C0210d(d0Var);
    }

    protected void timedOut() {
    }

    public final <T> T withTimeout(i.y.c.a<? extends T> aVar) throws IOException {
        i.y.d.l.d(aVar, "block");
        enter();
        try {
            try {
                T tInvoke = aVar.invoke();
                i.y.d.k.b(1);
                if (exit()) {
                    throw access$newTimeoutException(null);
                }
                i.y.d.k.a(1);
                return tInvoke;
            } catch (IOException e2) {
                if (exit()) {
                    throw access$newTimeoutException(e2);
                }
                throw e2;
            }
        } catch (Throwable th) {
            i.y.d.k.b(1);
            exit();
            i.y.d.k.a(1);
            throw th;
        }
    }
}