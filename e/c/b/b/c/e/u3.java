package e.c.b.b.c.e;

import java.io.Serializable;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* loaded from: classes.dex */
public final class u3 {
    public static <T> r3<T> a(r3<T> r3Var) {
        return ((r3Var instanceof w3) || (r3Var instanceof t3)) ? r3Var : r3Var instanceof Serializable ? new t3(r3Var) : new w3(r3Var);
    }

    public static <T> r3<T> b(@NullableDecl T t) {
        return new v3(t);
    }
}