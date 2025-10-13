package e.c.b.b.c.e;

import java.util.Map;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* loaded from: classes.dex */
final class d4<K, V> extends i4<Map.Entry<K, V>> {

    /* renamed from: i, reason: collision with root package name */
    private final /* synthetic */ b4 f14460i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    d4(b4 b4Var) {
        super(b4Var, null);
        this.f14460i = b4Var;
    }

    @Override // e.c.b.b.c.e.i4
    final /* synthetic */ Object a(int i2) {
        return new k4(this.f14460i, i2);
    }
}