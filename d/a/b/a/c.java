package d.a.b.a;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public class c {
    private static final CharsetDecoder a = Charset.forName("UTF-16LE").newDecoder();

    /* renamed from: b, reason: collision with root package name */
    private static final CharsetDecoder f14112b = Charset.forName("UTF-8").newDecoder();

    /* renamed from: c, reason: collision with root package name */
    private static final Logger f14113c = Logger.getLogger(c.class.getName());

    /* renamed from: d, reason: collision with root package name */
    private int[] f14114d;

    /* renamed from: e, reason: collision with root package name */
    private byte[] f14115e;

    /* renamed from: f, reason: collision with root package name */
    private int[] f14116f;

    /* renamed from: g, reason: collision with root package name */
    private int[] f14117g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f14118h;

    private c() {
    }

    private String a(int i2, int i3) {
        try {
            return (this.f14118h ? f14112b : a).decode(ByteBuffer.wrap(this.f14115e, i2, i3)).toString();
        } catch (CharacterCodingException e2) {
            f14113c.log(Level.WARNING, (String) null, (Throwable) e2);
            return null;
        }
    }

    private static final int c(byte[] bArr, int i2) {
        return (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8);
    }

    private static final int[] e(byte[] bArr, int i2) {
        byte b2 = bArr[i2];
        boolean z = (b2 & 128) != 0;
        int i3 = b2 & 127;
        return !z ? new int[]{i3, 1} : new int[]{(bArr[i2 + 1] & 255) | (i3 << 8), 2};
    }

    public static c f(d.c.b bVar) throws IOException {
        bVar.b(1835009);
        int i2 = bVar.readInt();
        int i3 = bVar.readInt();
        int i4 = bVar.readInt();
        int i5 = bVar.readInt();
        int i6 = bVar.readInt();
        int i7 = bVar.readInt();
        c cVar = new c();
        cVar.f14118h = (i5 & 256) != 0;
        cVar.f14114d = bVar.a(i3);
        if (i4 != 0) {
            cVar.f14116f = bVar.a(i4);
        }
        int i8 = (i7 == 0 ? i2 : i7) - i6;
        if (i8 % 4 != 0) {
            throw new IOException("String data size is not multiple of 4 (" + i8 + ").");
        }
        byte[] bArr = new byte[i8];
        cVar.f14115e = bArr;
        bVar.readFully(bArr);
        if (i7 != 0) {
            int i9 = i2 - i7;
            if (i9 % 4 != 0) {
                throw new IOException("Style data size is not multiple of 4 (" + i9 + ").");
            }
            cVar.f14117g = bVar.a(i9 / 4);
        }
        return cVar;
    }

    public int b(String str) {
        if (str == null) {
            return -1;
        }
        int i2 = 0;
        while (true) {
            int[] iArr = this.f14114d;
            if (i2 == iArr.length) {
                return -1;
            }
            int i3 = iArr[i2];
            int iC = c(this.f14115e, i3);
            if (iC == str.length()) {
                int i4 = 0;
                while (i4 != iC) {
                    i3 += 2;
                    if (str.charAt(i4) != c(this.f14115e, i3)) {
                        break;
                    }
                    i4++;
                }
                if (i4 == iC) {
                    return i2;
                }
            }
            i2++;
        }
    }

    public String d(int i2) {
        int[] iArr;
        int i3;
        int iC;
        if (i2 < 0 || (iArr = this.f14114d) == null || i2 >= iArr.length) {
            return null;
        }
        int i4 = iArr[i2];
        if (this.f14118h) {
            int i5 = i4 + e(this.f14115e, i4)[1];
            int[] iArrE = e(this.f14115e, i5);
            i3 = i5 + iArrE[1];
            iC = iArrE[0];
        } else {
            iC = c(this.f14115e, i4) * 2;
            i3 = i4 + 2;
        }
        return a(i3, iC);
    }
}