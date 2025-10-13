package e.c.b.b.c.e;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* loaded from: classes.dex */
final class o4 {
    static int a(int i2) {
        return (int) (Integer.rotateLeft((int) (i2 * (-862048943)), 15) * 461845907);
    }

    static int b(@NullableDecl Object obj) {
        return a(obj == null ? 0 : obj.hashCode());
    }
}