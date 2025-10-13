package e.c.b.b.c.e;

import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-base@@18.0.0 */
/* loaded from: classes.dex */
final class y9 extends ea {

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ t9 f14952f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private y9(t9 t9Var) {
        super(t9Var, null);
        this.f14952f = t9Var;
    }

    @Override // e.c.b.b.c.e.ea, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, j$.util.Set, j$.util.Collection, j$.lang.Iterable
    public final Iterator<Map.Entry<K, V>> iterator() {
        return new v9(this.f14952f, null);
    }

    /* synthetic */ y9(t9 t9Var, w9 w9Var) {
        this(t9Var);
    }
}