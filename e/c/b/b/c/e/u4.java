package e.c.b.b.c.e;

import java.io.Serializable;
import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* loaded from: classes.dex */
public class u4<K, V> extends z3<K, V> implements Serializable {

    /* renamed from: e, reason: collision with root package name */
    private final transient s4<K, ? extends n4<V>> f14871e;

    /* renamed from: f, reason: collision with root package name */
    private final transient int f14872f;

    u4(s4<K, ? extends n4<V>> s4Var, int i2) {
        this.f14871e = s4Var;
        this.f14872f = i2;
    }

    @Override // e.c.b.b.c.e.a4
    public final boolean a(@NullableDecl Object obj) {
        return obj != null && super.a(obj);
    }

    @Override // e.c.b.b.c.e.a4
    public /* bridge */ /* synthetic */ boolean equals(@NullableDecl Object obj) {
        return super.equals(obj);
    }

    @Override // e.c.b.b.c.e.a4
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // e.c.b.b.c.e.a4
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    @Override // e.c.b.b.c.e.a4, e.c.b.b.c.e.a5
    public final /* synthetic */ Map zza() {
        return this.f14871e;
    }
}