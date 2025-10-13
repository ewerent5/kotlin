package j.f0;

import i.y.d.l;
import j.f;
import j.t;
import j.y;
import java.io.EOFException;

/* compiled from: Buffer.kt */
/* loaded from: classes3.dex */
public final class a {
    private static final byte[] a = j.b.a("0123456789abcdef");

    public static final byte[] a() {
        return a;
    }

    public static final boolean b(y yVar, int i2, byte[] bArr, int i3, int i4) {
        l.d(yVar, "segment");
        l.d(bArr, "bytes");
        int i5 = yVar.f16502d;
        byte[] bArr2 = yVar.f16500b;
        while (i3 < i4) {
            if (i2 == i5) {
                yVar = yVar.f16505g;
                l.b(yVar);
                byte[] bArr3 = yVar.f16500b;
                bArr2 = bArr3;
                i2 = yVar.f16501c;
                i5 = yVar.f16502d;
            }
            if (bArr2[i2] != bArr[i3]) {
                return false;
            }
            i2++;
            i3++;
        }
        return true;
    }

    public static final String c(f fVar, long j2) throws EOFException {
        l.d(fVar, "$this$readUtf8Line");
        if (j2 > 0) {
            long j3 = j2 - 1;
            if (fVar.v(j3) == ((byte) 13)) {
                String strQ0 = fVar.q0(j3);
                fVar.h(2L);
                return strQ0;
            }
        }
        String strQ02 = fVar.q0(j2);
        fVar.h(1L);
        return strQ02;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x005d, code lost:
    
        if (r19 == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005f, code lost:
    
        return -2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0060, code lost:
    
        return r10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final int d(j.f r17, j.t r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 177
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j.f0.a.d(j.f, j.t, boolean):int");
    }

    public static /* synthetic */ int e(f fVar, t tVar, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        return d(fVar, tVar, z);
    }
}