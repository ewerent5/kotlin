package okhttp3.internal.ws;

import i.y.d.l;
import j.f;
import j.h;
import j.i;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import java.util.zip.DataFormatException;
import okhttp3.internal.Util;
import okhttp3.internal.http2.Settings;

/* compiled from: WebSocketReader.kt */
/* loaded from: classes3.dex */
public final class WebSocketReader implements Closeable {
    private boolean closed;
    private final f controlFrameBuffer;
    private final FrameCallback frameCallback;
    private long frameLength;
    private final boolean isClient;
    private boolean isControlFrame;
    private boolean isFinalFrame;
    private final f.a maskCursor;
    private final byte[] maskKey;
    private final f messageFrameBuffer;
    private MessageInflater messageInflater;
    private final boolean noContextTakeover;
    private int opcode;
    private final boolean perMessageDeflate;
    private boolean readingCompressedMessage;
    private final h source;

    /* compiled from: WebSocketReader.kt */
    public interface FrameCallback {
        void onReadClose(int i2, String str);

        void onReadMessage(i iVar);

        void onReadMessage(String str);

        void onReadPing(i iVar);

        void onReadPong(i iVar);
    }

    public WebSocketReader(boolean z, h hVar, FrameCallback frameCallback, boolean z2, boolean z3) {
        l.d(hVar, "source");
        l.d(frameCallback, "frameCallback");
        this.isClient = z;
        this.source = hVar;
        this.frameCallback = frameCallback;
        this.perMessageDeflate = z2;
        this.noContextTakeover = z3;
        this.controlFrameBuffer = new f();
        this.messageFrameBuffer = new f();
        this.maskKey = z ? null : new byte[4];
        this.maskCursor = z ? null : new f.a();
    }

    private final void readControlFrame() throws ProtocolException, EOFException {
        String strL0;
        long j2 = this.frameLength;
        if (j2 > 0) {
            this.source.M(this.controlFrameBuffer, j2);
            if (!this.isClient) {
                f fVar = this.controlFrameBuffer;
                f.a aVar = this.maskCursor;
                l.b(aVar);
                fVar.Z(aVar);
                this.maskCursor.d(0L);
                WebSocketProtocol webSocketProtocol = WebSocketProtocol.INSTANCE;
                f.a aVar2 = this.maskCursor;
                byte[] bArr = this.maskKey;
                l.b(bArr);
                webSocketProtocol.toggleMask(aVar2, bArr);
                this.maskCursor.close();
            }
        }
        switch (this.opcode) {
            case 8:
                short s = 1005;
                long jY0 = this.controlFrameBuffer.y0();
                if (jY0 == 1) {
                    throw new ProtocolException("Malformed close payload length of 1.");
                }
                if (jY0 != 0) {
                    s = this.controlFrameBuffer.readShort();
                    strL0 = this.controlFrameBuffer.l0();
                    String strCloseCodeExceptionMessage = WebSocketProtocol.INSTANCE.closeCodeExceptionMessage(s);
                    if (strCloseCodeExceptionMessage != null) {
                        throw new ProtocolException(strCloseCodeExceptionMessage);
                    }
                } else {
                    strL0 = "";
                }
                this.frameCallback.onReadClose(s, strL0);
                this.closed = true;
                return;
            case 9:
                this.frameCallback.onReadPing(this.controlFrameBuffer.o0());
                return;
            case 10:
                this.frameCallback.onReadPong(this.controlFrameBuffer.o0());
                return;
            default:
                throw new ProtocolException("Unknown control opcode: " + Util.toHexString(this.opcode));
        }
    }

    private final void readHeader() throws IOException {
        boolean z;
        if (this.closed) {
            throw new IOException("closed");
        }
        long jTimeoutNanos = this.source.timeout().timeoutNanos();
        this.source.timeout().clearTimeout();
        try {
            int iAnd = Util.and(this.source.readByte(), 255);
            this.source.timeout().timeout(jTimeoutNanos, TimeUnit.NANOSECONDS);
            int i2 = iAnd & 15;
            this.opcode = i2;
            boolean z2 = (iAnd & 128) != 0;
            this.isFinalFrame = z2;
            boolean z3 = (iAnd & 8) != 0;
            this.isControlFrame = z3;
            if (z3 && !z2) {
                throw new ProtocolException("Control frames must be final.");
            }
            boolean z4 = (iAnd & 64) != 0;
            if (i2 == 1 || i2 == 2) {
                if (!z4) {
                    z = false;
                } else {
                    if (!this.perMessageDeflate) {
                        throw new ProtocolException("Unexpected rsv1 flag");
                    }
                    z = true;
                }
                this.readingCompressedMessage = z;
            } else if (z4) {
                throw new ProtocolException("Unexpected rsv1 flag");
            }
            if ((iAnd & 32) != 0) {
                throw new ProtocolException("Unexpected rsv2 flag");
            }
            if ((iAnd & 16) != 0) {
                throw new ProtocolException("Unexpected rsv3 flag");
            }
            int iAnd2 = Util.and(this.source.readByte(), 255);
            boolean z5 = (iAnd2 & 128) != 0;
            if (z5 == this.isClient) {
                throw new ProtocolException(this.isClient ? "Server-sent frames must not be masked." : "Client-sent frames must be masked.");
            }
            long j2 = iAnd2 & 127;
            this.frameLength = j2;
            if (j2 == WebSocketProtocol.PAYLOAD_SHORT) {
                this.frameLength = Util.and(this.source.readShort(), Settings.DEFAULT_INITIAL_WINDOW_SIZE);
            } else if (j2 == 127) {
                long j3 = this.source.readLong();
                this.frameLength = j3;
                if (j3 < 0) {
                    throw new ProtocolException("Frame length 0x" + Util.toHexString(this.frameLength) + " > 0x7FFFFFFFFFFFFFFF");
                }
            }
            if (this.isControlFrame && this.frameLength > 125) {
                throw new ProtocolException("Control frame must be less than 125B.");
            }
            if (z5) {
                h hVar = this.source;
                byte[] bArr = this.maskKey;
                l.b(bArr);
                hVar.readFully(bArr);
            }
        } catch (Throwable th) {
            this.source.timeout().timeout(jTimeoutNanos, TimeUnit.NANOSECONDS);
            throw th;
        }
    }

    private final void readMessage() throws IOException {
        while (!this.closed) {
            long j2 = this.frameLength;
            if (j2 > 0) {
                this.source.M(this.messageFrameBuffer, j2);
                if (!this.isClient) {
                    f fVar = this.messageFrameBuffer;
                    f.a aVar = this.maskCursor;
                    l.b(aVar);
                    fVar.Z(aVar);
                    this.maskCursor.d(this.messageFrameBuffer.y0() - this.frameLength);
                    WebSocketProtocol webSocketProtocol = WebSocketProtocol.INSTANCE;
                    f.a aVar2 = this.maskCursor;
                    byte[] bArr = this.maskKey;
                    l.b(bArr);
                    webSocketProtocol.toggleMask(aVar2, bArr);
                    this.maskCursor.close();
                }
            }
            if (this.isFinalFrame) {
                return;
            }
            readUntilNonControlFrame();
            if (this.opcode != 0) {
                throw new ProtocolException("Expected continuation opcode. Got: " + Util.toHexString(this.opcode));
            }
        }
        throw new IOException("closed");
    }

    private final void readMessageFrame() throws DataFormatException, IOException {
        int i2 = this.opcode;
        if (i2 != 1 && i2 != 2) {
            throw new ProtocolException("Unknown opcode: " + Util.toHexString(i2));
        }
        readMessage();
        if (this.readingCompressedMessage) {
            MessageInflater messageInflater = this.messageInflater;
            if (messageInflater == null) {
                messageInflater = new MessageInflater(this.noContextTakeover);
                this.messageInflater = messageInflater;
            }
            messageInflater.inflate(this.messageFrameBuffer);
        }
        if (i2 == 1) {
            this.frameCallback.onReadMessage(this.messageFrameBuffer.l0());
        } else {
            this.frameCallback.onReadMessage(this.messageFrameBuffer.o0());
        }
    }

    private final void readUntilNonControlFrame() throws IOException {
        while (!this.closed) {
            readHeader();
            if (!this.isControlFrame) {
                return;
            } else {
                readControlFrame();
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        MessageInflater messageInflater = this.messageInflater;
        if (messageInflater != null) {
            messageInflater.close();
        }
    }

    public final h getSource() {
        return this.source;
    }

    public final void processNextFrame() {
        readHeader();
        if (this.isControlFrame) {
            readControlFrame();
        } else {
            readMessageFrame();
        }
    }
}