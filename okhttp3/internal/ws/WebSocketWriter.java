package okhttp3.internal.ws;

import i.y.d.l;
import j.f;
import j.g;
import j.i;
import java.io.Closeable;
import java.io.IOException;
import java.util.Random;

/* compiled from: WebSocketWriter.kt */
/* loaded from: classes3.dex */
public final class WebSocketWriter implements Closeable {
    private final boolean isClient;
    private final f.a maskCursor;
    private final byte[] maskKey;
    private final f messageBuffer;
    private MessageDeflater messageDeflater;
    private final long minimumDeflateSize;
    private final boolean noContextTakeover;
    private final boolean perMessageDeflate;
    private final Random random;
    private final g sink;
    private final f sinkBuffer;
    private boolean writerClosed;

    public WebSocketWriter(boolean z, g gVar, Random random, boolean z2, boolean z3, long j2) {
        l.d(gVar, "sink");
        l.d(random, "random");
        this.isClient = z;
        this.sink = gVar;
        this.random = random;
        this.perMessageDeflate = z2;
        this.noContextTakeover = z3;
        this.minimumDeflateSize = j2;
        this.messageBuffer = new f();
        this.sinkBuffer = gVar.e();
        this.maskKey = z ? new byte[4] : null;
        this.maskCursor = z ? new f.a() : null;
    }

    private final void writeControlFrame(int i2, i iVar) throws IOException {
        if (this.writerClosed) {
            throw new IOException("closed");
        }
        int iU = iVar.u();
        if (!(((long) iU) <= 125)) {
            throw new IllegalArgumentException("Payload size must be less than or equal to 125".toString());
        }
        this.sinkBuffer.I(i2 | 128);
        if (this.isClient) {
            this.sinkBuffer.I(iU | 128);
            Random random = this.random;
            byte[] bArr = this.maskKey;
            l.b(bArr);
            random.nextBytes(bArr);
            this.sinkBuffer.A0(this.maskKey);
            if (iU > 0) {
                long jY0 = this.sinkBuffer.y0();
                this.sinkBuffer.B0(iVar);
                f fVar = this.sinkBuffer;
                f.a aVar = this.maskCursor;
                l.b(aVar);
                fVar.Z(aVar);
                this.maskCursor.d(jY0);
                WebSocketProtocol.INSTANCE.toggleMask(this.maskCursor, this.maskKey);
                this.maskCursor.close();
            }
        } else {
            this.sinkBuffer.I(iU);
            this.sinkBuffer.B0(iVar);
        }
        this.sink.flush();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        MessageDeflater messageDeflater = this.messageDeflater;
        if (messageDeflater != null) {
            messageDeflater.close();
        }
    }

    public final Random getRandom() {
        return this.random;
    }

    public final g getSink() {
        return this.sink;
    }

    public final void writeClose(int i2, i iVar) {
        i iVarO0 = i.f16463e;
        if (i2 != 0 || iVar != null) {
            if (i2 != 0) {
                WebSocketProtocol.INSTANCE.validateCloseCode(i2);
            }
            f fVar = new f();
            fVar.u(i2);
            if (iVar != null) {
                fVar.B0(iVar);
            }
            iVarO0 = fVar.o0();
        }
        try {
            writeControlFrame(8, iVarO0);
        } finally {
            this.writerClosed = true;
        }
    }

    public final void writeMessageFrame(int i2, i iVar) throws IOException {
        l.d(iVar, "data");
        if (this.writerClosed) {
            throw new IOException("closed");
        }
        this.messageBuffer.B0(iVar);
        int i3 = i2 | 128;
        if (this.perMessageDeflate && iVar.u() >= this.minimumDeflateSize) {
            MessageDeflater messageDeflater = this.messageDeflater;
            if (messageDeflater == null) {
                messageDeflater = new MessageDeflater(this.noContextTakeover);
                this.messageDeflater = messageDeflater;
            }
            messageDeflater.deflate(this.messageBuffer);
            i3 |= 64;
        }
        long jY0 = this.messageBuffer.y0();
        this.sinkBuffer.I(i3);
        int i4 = this.isClient ? 128 : 0;
        if (jY0 <= 125) {
            this.sinkBuffer.I(((int) jY0) | i4);
        } else if (jY0 <= WebSocketProtocol.PAYLOAD_SHORT_MAX) {
            this.sinkBuffer.I(i4 | WebSocketProtocol.PAYLOAD_SHORT);
            this.sinkBuffer.u((int) jY0);
        } else {
            this.sinkBuffer.I(i4 | 127);
            this.sinkBuffer.a1(jY0);
        }
        if (this.isClient) {
            Random random = this.random;
            byte[] bArr = this.maskKey;
            l.b(bArr);
            random.nextBytes(bArr);
            this.sinkBuffer.A0(this.maskKey);
            if (jY0 > 0) {
                f fVar = this.messageBuffer;
                f.a aVar = this.maskCursor;
                l.b(aVar);
                fVar.Z(aVar);
                this.maskCursor.d(0L);
                WebSocketProtocol.INSTANCE.toggleMask(this.maskCursor, this.maskKey);
                this.maskCursor.close();
            }
        }
        this.sinkBuffer.write(this.messageBuffer, jY0);
        this.sink.t();
    }

    public final void writePing(i iVar) throws IOException {
        l.d(iVar, "payload");
        writeControlFrame(9, iVar);
    }

    public final void writePong(i iVar) throws IOException {
        l.d(iVar, "payload");
        writeControlFrame(10, iVar);
    }
}