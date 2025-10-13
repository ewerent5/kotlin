package okhttp3.internal.http2;

import i.a0.a;
import i.y.d.g;
import i.y.d.l;
import j$.util.Spliterator;
import j.d0;
import j.e0;
import j.f;
import j.h;
import j.i;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import okhttp3.internal.Util;
import okhttp3.internal.http2.Hpack;

/* compiled from: Http2Reader.kt */
/* loaded from: classes3.dex */
public final class Http2Reader implements Closeable {
    public static final Companion Companion = new Companion(null);
    private static final Logger logger;
    private final boolean client;
    private final ContinuationSource continuation;
    private final Hpack.Reader hpackReader;
    private final h source;

    /* compiled from: Http2Reader.kt */
    public static final class Companion {
        private Companion() {
        }

        public final Logger getLogger() {
            return Http2Reader.logger;
        }

        public final int lengthWithoutPadding(int i2, int i3, int i4) throws IOException {
            if ((i3 & 8) != 0) {
                i2--;
            }
            if (i4 <= i2) {
                return i2 - i4;
            }
            throw new IOException("PROTOCOL_ERROR padding " + i4 + " > remaining length " + i2);
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }
    }

    /* compiled from: Http2Reader.kt */
    public static final class ContinuationSource implements d0 {
        private int flags;
        private int left;
        private int length;
        private int padding;
        private final h source;
        private int streamId;

        public ContinuationSource(h hVar) {
            l.d(hVar, "source");
            this.source = hVar;
        }

        private final void readContinuationHeader() throws IOException {
            int i2 = this.streamId;
            int medium = Util.readMedium(this.source);
            this.left = medium;
            this.length = medium;
            int iAnd = Util.and(this.source.readByte(), 255);
            this.flags = Util.and(this.source.readByte(), 255);
            Companion companion = Http2Reader.Companion;
            if (companion.getLogger().isLoggable(Level.FINE)) {
                companion.getLogger().fine(Http2.INSTANCE.frameLog(true, this.streamId, this.length, iAnd, this.flags));
            }
            int i3 = this.source.readInt() & Integer.MAX_VALUE;
            this.streamId = i3;
            if (iAnd == 9) {
                if (i3 != i2) {
                    throw new IOException("TYPE_CONTINUATION streamId changed");
                }
            } else {
                throw new IOException(iAnd + " != TYPE_CONTINUATION");
            }
        }

        @Override // j.d0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        public final int getFlags() {
            return this.flags;
        }

        public final int getLeft() {
            return this.left;
        }

        public final int getLength() {
            return this.length;
        }

        public final int getPadding() {
            return this.padding;
        }

        public final int getStreamId() {
            return this.streamId;
        }

        @Override // j.d0
        public long read(f fVar, long j2) throws IOException {
            l.d(fVar, "sink");
            while (true) {
                int i2 = this.left;
                if (i2 != 0) {
                    long j3 = this.source.read(fVar, Math.min(j2, i2));
                    if (j3 == -1) {
                        return -1L;
                    }
                    this.left -= (int) j3;
                    return j3;
                }
                this.source.h(this.padding);
                this.padding = 0;
                if ((this.flags & 4) != 0) {
                    return -1L;
                }
                readContinuationHeader();
            }
        }

        public final void setFlags(int i2) {
            this.flags = i2;
        }

        public final void setLeft(int i2) {
            this.left = i2;
        }

        public final void setLength(int i2) {
            this.length = i2;
        }

        public final void setPadding(int i2) {
            this.padding = i2;
        }

        public final void setStreamId(int i2) {
            this.streamId = i2;
        }

        @Override // j.d0
        public e0 timeout() {
            return this.source.timeout();
        }
    }

    /* compiled from: Http2Reader.kt */
    public interface Handler {
        void ackSettings();

        void alternateService(int i2, String str, i iVar, String str2, int i3, long j2);

        void data(boolean z, int i2, h hVar, int i3);

        void goAway(int i2, ErrorCode errorCode, i iVar);

        void headers(boolean z, int i2, int i3, List<Header> list);

        void ping(boolean z, int i2, int i3);

        void priority(int i2, int i3, int i4, boolean z);

        void pushPromise(int i2, int i3, List<Header> list);

        void rstStream(int i2, ErrorCode errorCode);

        void settings(boolean z, Settings settings);

        void windowUpdate(int i2, long j2);
    }

    static {
        Logger logger2 = Logger.getLogger(Http2.class.getName());
        l.c(logger2, "Logger.getLogger(Http2::class.java.name)");
        logger = logger2;
    }

    public Http2Reader(h hVar, boolean z) {
        l.d(hVar, "source");
        this.source = hVar;
        this.client = z;
        ContinuationSource continuationSource = new ContinuationSource(hVar);
        this.continuation = continuationSource;
        this.hpackReader = new Hpack.Reader(continuationSource, Spliterator.CONCURRENT, 0, 4, null);
    }

    private final void readData(Handler handler, int i2, int i3, int i4) throws IOException {
        if (i4 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
        }
        boolean z = (i3 & 1) != 0;
        if ((i3 & 32) != 0) {
            throw new IOException("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
        }
        int iAnd = (i3 & 8) != 0 ? Util.and(this.source.readByte(), 255) : 0;
        handler.data(z, i4, this.source, Companion.lengthWithoutPadding(i2, i3, iAnd));
        this.source.h(iAnd);
    }

    private final void readGoAway(Handler handler, int i2, int i3, int i4) throws IOException {
        if (i2 < 8) {
            throw new IOException("TYPE_GOAWAY length < 8: " + i2);
        }
        if (i4 != 0) {
            throw new IOException("TYPE_GOAWAY streamId != 0");
        }
        int i5 = this.source.readInt();
        int i6 = this.source.readInt();
        int i7 = i2 - 8;
        ErrorCode errorCodeFromHttp2 = ErrorCode.Companion.fromHttp2(i6);
        if (errorCodeFromHttp2 == null) {
            throw new IOException("TYPE_GOAWAY unexpected error code: " + i6);
        }
        i iVarO = i.f16463e;
        if (i7 > 0) {
            iVarO = this.source.o(i7);
        }
        handler.goAway(i5, errorCodeFromHttp2, iVarO);
    }

    private final List<Header> readHeaderBlock(int i2, int i3, int i4, int i5) throws IOException {
        this.continuation.setLeft(i2);
        ContinuationSource continuationSource = this.continuation;
        continuationSource.setLength(continuationSource.getLeft());
        this.continuation.setPadding(i3);
        this.continuation.setFlags(i4);
        this.continuation.setStreamId(i5);
        this.hpackReader.readHeaders();
        return this.hpackReader.getAndResetHeaderList();
    }

    private final void readHeaders(Handler handler, int i2, int i3, int i4) throws IOException {
        if (i4 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
        }
        boolean z = (i3 & 1) != 0;
        int iAnd = (i3 & 8) != 0 ? Util.and(this.source.readByte(), 255) : 0;
        if ((i3 & 32) != 0) {
            readPriority(handler, i4);
            i2 -= 5;
        }
        handler.headers(z, i4, -1, readHeaderBlock(Companion.lengthWithoutPadding(i2, i3, iAnd), iAnd, i3, i4));
    }

    private final void readPing(Handler handler, int i2, int i3, int i4) throws IOException {
        if (i2 != 8) {
            throw new IOException("TYPE_PING length != 8: " + i2);
        }
        if (i4 != 0) {
            throw new IOException("TYPE_PING streamId != 0");
        }
        handler.ping((i3 & 1) != 0, this.source.readInt(), this.source.readInt());
    }

    private final void readPriority(Handler handler, int i2, int i3, int i4) throws IOException {
        if (i2 == 5) {
            if (i4 == 0) {
                throw new IOException("TYPE_PRIORITY streamId == 0");
            }
            readPriority(handler, i4);
        } else {
            throw new IOException("TYPE_PRIORITY length: " + i2 + " != 5");
        }
    }

    private final void readPushPromise(Handler handler, int i2, int i3, int i4) throws IOException {
        if (i4 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
        }
        int iAnd = (i3 & 8) != 0 ? Util.and(this.source.readByte(), 255) : 0;
        handler.pushPromise(i4, this.source.readInt() & Integer.MAX_VALUE, readHeaderBlock(Companion.lengthWithoutPadding(i2 - 4, i3, iAnd), iAnd, i3, i4));
    }

    private final void readRstStream(Handler handler, int i2, int i3, int i4) throws IOException {
        if (i2 != 4) {
            throw new IOException("TYPE_RST_STREAM length: " + i2 + " != 4");
        }
        if (i4 == 0) {
            throw new IOException("TYPE_RST_STREAM streamId == 0");
        }
        int i5 = this.source.readInt();
        ErrorCode errorCodeFromHttp2 = ErrorCode.Companion.fromHttp2(i5);
        if (errorCodeFromHttp2 != null) {
            handler.rstStream(i4, errorCodeFromHttp2);
            return;
        }
        throw new IOException("TYPE_RST_STREAM unexpected error code: " + i5);
    }

    private final void readSettings(Handler handler, int i2, int i3, int i4) throws IOException {
        int i5;
        if (i4 != 0) {
            throw new IOException("TYPE_SETTINGS streamId != 0");
        }
        if ((i3 & 1) != 0) {
            if (i2 != 0) {
                throw new IOException("FRAME_SIZE_ERROR ack frame should be empty!");
            }
            handler.ackSettings();
            return;
        }
        if (i2 % 6 != 0) {
            throw new IOException("TYPE_SETTINGS length % 6 != 0: " + i2);
        }
        Settings settings = new Settings();
        a aVarH = i.a0.f.h(i.a0.f.i(0, i2), 6);
        int iA = aVarH.a();
        int iC = aVarH.c();
        int iE = aVarH.e();
        if (iE < 0 ? iA >= iC : iA <= iC) {
            while (true) {
                int iAnd = Util.and(this.source.readShort(), Settings.DEFAULT_INITIAL_WINDOW_SIZE);
                i5 = this.source.readInt();
                if (iAnd != 2) {
                    if (iAnd == 3) {
                        iAnd = 4;
                    } else if (iAnd == 4) {
                        iAnd = 7;
                        if (i5 < 0) {
                            throw new IOException("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1");
                        }
                    } else if (iAnd == 5 && (i5 < 16384 || i5 > 16777215)) {
                        break;
                    }
                } else if (i5 != 0 && i5 != 1) {
                    throw new IOException("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1");
                }
                settings.set(iAnd, i5);
                if (iA == iC) {
                    break;
                } else {
                    iA += iE;
                }
            }
            throw new IOException("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: " + i5);
        }
        handler.settings(false, settings);
    }

    private final void readWindowUpdate(Handler handler, int i2, int i3, int i4) throws IOException {
        if (i2 != 4) {
            throw new IOException("TYPE_WINDOW_UPDATE length !=4: " + i2);
        }
        long jAnd = Util.and(this.source.readInt(), 2147483647L);
        if (jAnd == 0) {
            throw new IOException("windowSizeIncrement was 0");
        }
        handler.windowUpdate(i4, jAnd);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.source.close();
    }

    public final boolean nextFrame(boolean z, Handler handler) throws IOException {
        l.d(handler, "handler");
        try {
            this.source.L0(9L);
            int medium = Util.readMedium(this.source);
            if (medium > 16384) {
                throw new IOException("FRAME_SIZE_ERROR: " + medium);
            }
            int iAnd = Util.and(this.source.readByte(), 255);
            int iAnd2 = Util.and(this.source.readByte(), 255);
            int i2 = this.source.readInt() & Integer.MAX_VALUE;
            Logger logger2 = logger;
            if (logger2.isLoggable(Level.FINE)) {
                logger2.fine(Http2.INSTANCE.frameLog(true, i2, medium, iAnd, iAnd2));
            }
            if (z && iAnd != 4) {
                throw new IOException("Expected a SETTINGS frame but was " + Http2.INSTANCE.formattedType$okhttp(iAnd));
            }
            switch (iAnd) {
                case 0:
                    readData(handler, medium, iAnd2, i2);
                    return true;
                case 1:
                    readHeaders(handler, medium, iAnd2, i2);
                    return true;
                case 2:
                    readPriority(handler, medium, iAnd2, i2);
                    return true;
                case 3:
                    readRstStream(handler, medium, iAnd2, i2);
                    return true;
                case 4:
                    readSettings(handler, medium, iAnd2, i2);
                    return true;
                case 5:
                    readPushPromise(handler, medium, iAnd2, i2);
                    return true;
                case 6:
                    readPing(handler, medium, iAnd2, i2);
                    return true;
                case 7:
                    readGoAway(handler, medium, iAnd2, i2);
                    return true;
                case 8:
                    readWindowUpdate(handler, medium, iAnd2, i2);
                    return true;
                default:
                    this.source.h(medium);
                    return true;
            }
        } catch (EOFException unused) {
            return false;
        }
    }

    public final void readConnectionPreface(Handler handler) throws IOException {
        l.d(handler, "handler");
        if (this.client) {
            if (!nextFrame(true, handler)) {
                throw new IOException("Required SETTINGS preface not received");
            }
            return;
        }
        h hVar = this.source;
        i iVar = Http2.CONNECTION_PREFACE;
        i iVarO = hVar.o(iVar.u());
        Logger logger2 = logger;
        if (logger2.isLoggable(Level.FINE)) {
            logger2.fine(Util.format("<< CONNECTION " + iVarO.k(), new Object[0]));
        }
        if (!l.a(iVar, iVarO)) {
            throw new IOException("Expected a connection header but was " + iVarO.x());
        }
    }

    private final void readPriority(Handler handler, int i2) {
        int i3 = this.source.readInt();
        handler.priority(i2, i3 & Integer.MAX_VALUE, Util.and(this.source.readByte(), 255) + 1, (i3 & ((int) 2147483648L)) != 0);
    }
}