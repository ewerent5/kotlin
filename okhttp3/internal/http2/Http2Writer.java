package okhttp3.internal.http2;

import i.y.d.l;
import j.f;
import j.g;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import okhttp3.internal.Util;
import okhttp3.internal.http2.Hpack;

/* compiled from: Http2Writer.kt */
/* loaded from: classes3.dex */
public final class Http2Writer implements Closeable {
    public static final Companion Companion = new Companion(null);
    private static final Logger logger = Logger.getLogger(Http2.class.getName());
    private final boolean client;
    private boolean closed;
    private final f hpackBuffer;
    private final Hpack.Writer hpackWriter;
    private int maxFrameSize;
    private final g sink;

    /* compiled from: Http2Writer.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i.y.d.g gVar) {
            this();
        }
    }

    public Http2Writer(g gVar, boolean z) {
        l.d(gVar, "sink");
        this.sink = gVar;
        this.client = z;
        f fVar = new f();
        this.hpackBuffer = fVar;
        this.maxFrameSize = 16384;
        this.hpackWriter = new Hpack.Writer(0, false, fVar, 3, null);
    }

    private final void writeContinuationFrames(int i2, long j2) {
        while (j2 > 0) {
            long jMin = Math.min(this.maxFrameSize, j2);
            j2 -= jMin;
            frameHeader(i2, (int) jMin, 9, j2 == 0 ? 4 : 0);
            this.sink.write(this.hpackBuffer, jMin);
        }
    }

    public final synchronized void applyAndAckSettings(Settings settings) {
        l.d(settings, "peerSettings");
        if (this.closed) {
            throw new IOException("closed");
        }
        this.maxFrameSize = settings.getMaxFrameSize(this.maxFrameSize);
        if (settings.getHeaderTableSize() != -1) {
            this.hpackWriter.resizeHeaderTable(settings.getHeaderTableSize());
        }
        frameHeader(0, 0, 4, 1);
        this.sink.flush();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        this.closed = true;
        this.sink.close();
    }

    public final synchronized void connectionPreface() {
        if (this.closed) {
            throw new IOException("closed");
        }
        if (this.client) {
            Logger logger2 = logger;
            if (logger2.isLoggable(Level.FINE)) {
                logger2.fine(Util.format(">> CONNECTION " + Http2.CONNECTION_PREFACE.k(), new Object[0]));
            }
            this.sink.B0(Http2.CONNECTION_PREFACE);
            this.sink.flush();
        }
    }

    public final synchronized void data(boolean z, int i2, f fVar, int i3) {
        if (this.closed) {
            throw new IOException("closed");
        }
        dataFrame(i2, z ? 1 : 0, fVar, i3);
    }

    public final void dataFrame(int i2, int i3, f fVar, int i4) {
        frameHeader(i2, i4, 0, i3);
        if (i4 > 0) {
            g gVar = this.sink;
            l.b(fVar);
            gVar.write(fVar, i4);
        }
    }

    public final synchronized void flush() {
        if (this.closed) {
            throw new IOException("closed");
        }
        this.sink.flush();
    }

    public final void frameHeader(int i2, int i3, int i4, int i5) {
        Logger logger2 = logger;
        if (logger2.isLoggable(Level.FINE)) {
            logger2.fine(Http2.INSTANCE.frameLog(false, i2, i3, i4, i5));
        }
        if (!(i3 <= this.maxFrameSize)) {
            throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + this.maxFrameSize + ": " + i3).toString());
        }
        if (!((((int) 2147483648L) & i2) == 0)) {
            throw new IllegalArgumentException(("reserved bit set: " + i2).toString());
        }
        Util.writeMedium(this.sink, i3);
        this.sink.I(i4 & 255);
        this.sink.I(i5 & 255);
        this.sink.y(i2 & Integer.MAX_VALUE);
    }

    public final Hpack.Writer getHpackWriter() {
        return this.hpackWriter;
    }

    public final synchronized void goAway(int i2, ErrorCode errorCode, byte[] bArr) {
        l.d(errorCode, "errorCode");
        l.d(bArr, "debugData");
        if (this.closed) {
            throw new IOException("closed");
        }
        if (!(errorCode.getHttpCode() != -1)) {
            throw new IllegalArgumentException("errorCode.httpCode == -1".toString());
        }
        frameHeader(0, bArr.length + 8, 7, 0);
        this.sink.y(i2);
        this.sink.y(errorCode.getHttpCode());
        if (!(bArr.length == 0)) {
            this.sink.A0(bArr);
        }
        this.sink.flush();
    }

    public final synchronized void headers(boolean z, int i2, List<Header> list) {
        l.d(list, "headerBlock");
        if (this.closed) {
            throw new IOException("closed");
        }
        this.hpackWriter.writeHeaders(list);
        long jY0 = this.hpackBuffer.y0();
        long jMin = Math.min(this.maxFrameSize, jY0);
        int i3 = jY0 == jMin ? 4 : 0;
        if (z) {
            i3 |= 1;
        }
        frameHeader(i2, (int) jMin, 1, i3);
        this.sink.write(this.hpackBuffer, jMin);
        if (jY0 > jMin) {
            writeContinuationFrames(i2, jY0 - jMin);
        }
    }

    public final int maxDataLength() {
        return this.maxFrameSize;
    }

    public final synchronized void ping(boolean z, int i2, int i3) {
        if (this.closed) {
            throw new IOException("closed");
        }
        frameHeader(0, 8, 6, z ? 1 : 0);
        this.sink.y(i2);
        this.sink.y(i3);
        this.sink.flush();
    }

    public final synchronized void pushPromise(int i2, int i3, List<Header> list) {
        l.d(list, "requestHeaders");
        if (this.closed) {
            throw new IOException("closed");
        }
        this.hpackWriter.writeHeaders(list);
        long jY0 = this.hpackBuffer.y0();
        int iMin = (int) Math.min(this.maxFrameSize - 4, jY0);
        long j2 = iMin;
        frameHeader(i2, iMin + 4, 5, jY0 == j2 ? 4 : 0);
        this.sink.y(i3 & Integer.MAX_VALUE);
        this.sink.write(this.hpackBuffer, j2);
        if (jY0 > j2) {
            writeContinuationFrames(i2, jY0 - j2);
        }
    }

    public final synchronized void rstStream(int i2, ErrorCode errorCode) {
        l.d(errorCode, "errorCode");
        if (this.closed) {
            throw new IOException("closed");
        }
        if (!(errorCode.getHttpCode() != -1)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        frameHeader(i2, 4, 3, 0);
        this.sink.y(errorCode.getHttpCode());
        this.sink.flush();
    }

    public final synchronized void settings(Settings settings) {
        l.d(settings, "settings");
        if (this.closed) {
            throw new IOException("closed");
        }
        int i2 = 0;
        frameHeader(0, settings.size() * 6, 4, 0);
        while (i2 < 10) {
            if (settings.isSet(i2)) {
                this.sink.u(i2 != 4 ? i2 != 7 ? i2 : 4 : 3);
                this.sink.y(settings.get(i2));
            }
            i2++;
        }
        this.sink.flush();
    }

    public final synchronized void windowUpdate(int i2, long j2) {
        if (this.closed) {
            throw new IOException("closed");
        }
        if (!(j2 != 0 && j2 <= 2147483647L)) {
            throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j2).toString());
        }
        frameHeader(i2, 4, 8, 0);
        this.sink.y((int) j2);
        this.sink.flush();
    }
}