package okhttp3.internal.ws;

import ch.qos.logback.core.joran.action.Action;
import i.y.d.l;
import j.f;
import j.i;

/* compiled from: WebSocketProtocol.kt */
/* loaded from: classes3.dex */
public final class WebSocketProtocol {
    public static final String ACCEPT_MAGIC = "258EAFA5-E914-47DA-95CA-C5AB0DC85B11";
    public static final int B0_FLAG_FIN = 128;
    public static final int B0_FLAG_RSV1 = 64;
    public static final int B0_FLAG_RSV2 = 32;
    public static final int B0_FLAG_RSV3 = 16;
    public static final int B0_MASK_OPCODE = 15;
    public static final int B1_FLAG_MASK = 128;
    public static final int B1_MASK_LENGTH = 127;
    public static final int CLOSE_CLIENT_GOING_AWAY = 1001;
    public static final long CLOSE_MESSAGE_MAX = 123;
    public static final int CLOSE_NO_STATUS_CODE = 1005;
    public static final WebSocketProtocol INSTANCE = new WebSocketProtocol();
    public static final int OPCODE_BINARY = 2;
    public static final int OPCODE_CONTINUATION = 0;
    public static final int OPCODE_CONTROL_CLOSE = 8;
    public static final int OPCODE_CONTROL_PING = 9;
    public static final int OPCODE_CONTROL_PONG = 10;
    public static final int OPCODE_FLAG_CONTROL = 8;
    public static final int OPCODE_TEXT = 1;
    public static final long PAYLOAD_BYTE_MAX = 125;
    public static final int PAYLOAD_LONG = 127;
    public static final int PAYLOAD_SHORT = 126;
    public static final long PAYLOAD_SHORT_MAX = 65535;

    private WebSocketProtocol() {
    }

    public final String acceptHeader(String str) {
        l.d(str, Action.KEY_ATTRIBUTE);
        return i.f16464f.d(str + ACCEPT_MAGIC).s().a();
    }

    public final String closeCodeExceptionMessage(int i2) {
        if (i2 < 1000 || i2 >= 5000) {
            return "Code must be in range [1000,5000): " + i2;
        }
        if ((1004 > i2 || 1006 < i2) && (1015 > i2 || 2999 < i2)) {
            return null;
        }
        return "Code " + i2 + " is reserved and may not be used.";
    }

    public final void toggleMask(f.a aVar, byte[] bArr) {
        l.d(aVar, "cursor");
        l.d(bArr, Action.KEY_ATTRIBUTE);
        int length = bArr.length;
        int i2 = 0;
        do {
            byte[] bArr2 = aVar.f16459i;
            int i3 = aVar.f16460j;
            int i4 = aVar.f16461k;
            if (bArr2 != null) {
                while (i3 < i4) {
                    int i5 = i2 % length;
                    bArr2[i3] = (byte) (bArr2[i3] ^ bArr[i5]);
                    i3++;
                    i2 = i5 + 1;
                }
            }
        } while (aVar.b() != -1);
    }

    public final void validateCloseCode(int i2) {
        String strCloseCodeExceptionMessage = closeCodeExceptionMessage(i2);
        if (strCloseCodeExceptionMessage == null) {
            return;
        }
        l.b(strCloseCodeExceptionMessage);
        throw new IllegalArgumentException(strCloseCodeExceptionMessage.toString());
    }
}