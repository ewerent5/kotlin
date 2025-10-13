package okhttp3;

import ch.qos.logback.classic.net.SyslogAppender;
import i.y.d.g;
import i.y.d.l;
import j.d0;
import j.e0;
import j.f;
import j.h;
import j.i;
import j.q;
import j.t;
import java.io.Closeable;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import okhttp3.internal.http1.HeadersReader;

/* compiled from: MultipartReader.kt */
/* loaded from: classes3.dex */
public final class MultipartReader implements Closeable {
    public static final Companion Companion = new Companion(null);
    private static final t afterBoundaryOptions;
    private final String boundary;
    private boolean closed;
    private final i crlfDashDashBoundary;
    private PartSource currentPart;
    private final i dashDashBoundary;
    private boolean noMoreParts;
    private int partCount;
    private final h source;

    /* compiled from: MultipartReader.kt */
    public static final class Companion {
        private Companion() {
        }

        public final t getAfterBoundaryOptions() {
            return MultipartReader.afterBoundaryOptions;
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }
    }

    /* compiled from: MultipartReader.kt */
    public static final class Part implements Closeable {
        private final h body;
        private final Headers headers;

        public Part(Headers headers, h hVar) {
            l.d(headers, "headers");
            l.d(hVar, "body");
            this.headers = headers;
            this.body = hVar;
        }

        public final h body() {
            return this.body;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.body.close();
        }

        public final Headers headers() {
            return this.headers;
        }
    }

    /* compiled from: MultipartReader.kt */
    private final class PartSource implements d0 {
        private final e0 timeout = new e0();

        public PartSource() {
        }

        @Override // j.d0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (l.a(MultipartReader.this.currentPart, this)) {
                MultipartReader.this.currentPart = null;
            }
        }

        @Override // j.d0
        public long read(f fVar, long j2) {
            l.d(fVar, "sink");
            if (!(j2 >= 0)) {
                throw new IllegalArgumentException(("byteCount < 0: " + j2).toString());
            }
            if (!l.a(MultipartReader.this.currentPart, this)) {
                throw new IllegalStateException("closed".toString());
            }
            e0 e0VarTimeout = MultipartReader.this.source.timeout();
            e0 e0Var = this.timeout;
            long jTimeoutNanos = e0VarTimeout.timeoutNanos();
            long jA = e0.Companion.a(e0Var.timeoutNanos(), e0VarTimeout.timeoutNanos());
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            e0VarTimeout.timeout(jA, timeUnit);
            if (!e0VarTimeout.hasDeadline()) {
                if (e0Var.hasDeadline()) {
                    e0VarTimeout.deadlineNanoTime(e0Var.deadlineNanoTime());
                }
                try {
                    long jCurrentPartBytesRemaining = MultipartReader.this.currentPartBytesRemaining(j2);
                    long j3 = jCurrentPartBytesRemaining == 0 ? -1L : MultipartReader.this.source.read(fVar, jCurrentPartBytesRemaining);
                    e0VarTimeout.timeout(jTimeoutNanos, timeUnit);
                    if (e0Var.hasDeadline()) {
                        e0VarTimeout.clearDeadline();
                    }
                    return j3;
                } catch (Throwable th) {
                    e0VarTimeout.timeout(jTimeoutNanos, TimeUnit.NANOSECONDS);
                    if (e0Var.hasDeadline()) {
                        e0VarTimeout.clearDeadline();
                    }
                    throw th;
                }
            }
            long jDeadlineNanoTime = e0VarTimeout.deadlineNanoTime();
            if (e0Var.hasDeadline()) {
                e0VarTimeout.deadlineNanoTime(Math.min(e0VarTimeout.deadlineNanoTime(), e0Var.deadlineNanoTime()));
            }
            try {
                long jCurrentPartBytesRemaining2 = MultipartReader.this.currentPartBytesRemaining(j2);
                long j4 = jCurrentPartBytesRemaining2 == 0 ? -1L : MultipartReader.this.source.read(fVar, jCurrentPartBytesRemaining2);
                e0VarTimeout.timeout(jTimeoutNanos, timeUnit);
                if (e0Var.hasDeadline()) {
                    e0VarTimeout.deadlineNanoTime(jDeadlineNanoTime);
                }
                return j4;
            } catch (Throwable th2) {
                e0VarTimeout.timeout(jTimeoutNanos, TimeUnit.NANOSECONDS);
                if (e0Var.hasDeadline()) {
                    e0VarTimeout.deadlineNanoTime(jDeadlineNanoTime);
                }
                throw th2;
            }
        }

        @Override // j.d0
        public e0 timeout() {
            return this.timeout;
        }
    }

    static {
        t.a aVar = t.f16482f;
        i.a aVar2 = i.f16464f;
        afterBoundaryOptions = aVar.d(aVar2.d("\r\n"), aVar2.d("--"), aVar2.d(" "), aVar2.d(SyslogAppender.DEFAULT_STACKTRACE_PATTERN));
    }

    public MultipartReader(h hVar, String str) {
        l.d(hVar, "source");
        l.d(str, "boundary");
        this.source = hVar;
        this.boundary = str;
        this.dashDashBoundary = new f().Y("--").Y(str).o0();
        this.crlfDashDashBoundary = new f().Y("\r\n--").Y(str).o0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long currentPartBytesRemaining(long j2) {
        this.source.L0(this.crlfDashDashBoundary.u());
        long jB = this.source.e().B(this.crlfDashDashBoundary);
        return jB == -1 ? Math.min(j2, (this.source.e().y0() - this.crlfDashDashBoundary.u()) + 1) : Math.min(j2, jB);
    }

    public final String boundary() {
        return this.boundary;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.closed) {
            return;
        }
        this.closed = true;
        this.currentPart = null;
        this.source.close();
    }

    public final Part nextPart() throws ProtocolException {
        if (!(!this.closed)) {
            throw new IllegalStateException("closed".toString());
        }
        if (this.noMoreParts) {
            return null;
        }
        if (this.partCount == 0 && this.source.e0(0L, this.dashDashBoundary)) {
            this.source.h(this.dashDashBoundary.u());
        } else {
            while (true) {
                long jCurrentPartBytesRemaining = currentPartBytesRemaining(8192L);
                if (jCurrentPartBytesRemaining == 0) {
                    break;
                }
                this.source.h(jCurrentPartBytesRemaining);
            }
            this.source.h(this.crlfDashDashBoundary.u());
        }
        boolean z = false;
        while (true) {
            int iR0 = this.source.R0(afterBoundaryOptions);
            if (iR0 == -1) {
                throw new ProtocolException("unexpected characters after boundary");
            }
            if (iR0 == 0) {
                this.partCount++;
                Headers headers = new HeadersReader(this.source).readHeaders();
                PartSource partSource = new PartSource();
                this.currentPart = partSource;
                return new Part(headers, q.d(partSource));
            }
            if (iR0 == 1) {
                if (z) {
                    throw new ProtocolException("unexpected characters after boundary");
                }
                if (this.partCount == 0) {
                    throw new ProtocolException("expected at least 1 part");
                }
                this.noMoreParts = true;
                return null;
            }
            if (iR0 == 2 || iR0 == 3) {
                z = true;
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MultipartReader(ResponseBody responseBody) throws ProtocolException {
        String strParameter;
        l.d(responseBody, "response");
        h hVarSource = responseBody.source();
        MediaType mediaTypeContentType = responseBody.contentType();
        if (mediaTypeContentType != null && (strParameter = mediaTypeContentType.parameter("boundary")) != null) {
            this(hVarSource, strParameter);
            return;
        }
        throw new ProtocolException("expected the Content-Type to have a boundary parameter");
    }
}