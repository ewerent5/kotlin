package okhttp3.logging;

import i.y.d.l;
import j.f;
import java.io.EOFException;

/* compiled from: utf8.kt */
/* loaded from: classes3.dex */
public final class Utf8Kt {
    public static final boolean isProbablyUtf8(f fVar) {
        l.d(fVar, "$this$isProbablyUtf8");
        try {
            f fVar2 = new f();
            fVar.j(fVar2, 0L, i.a0.f.e(fVar.y0(), 64L));
            for (int i2 = 0; i2 < 16; i2++) {
                if (fVar2.H()) {
                    return true;
                }
                int iR0 = fVar2.r0();
                if (Character.isISOControl(iR0) && !Character.isWhitespace(iR0)) {
                    return false;
                }
            }
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }
}