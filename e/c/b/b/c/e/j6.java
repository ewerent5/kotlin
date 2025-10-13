package e.c.b.b.c.e;

import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-measurement-base@@18.0.0 */
/* loaded from: classes.dex */
final class j6 extends l6 {

    /* renamed from: e, reason: collision with root package name */
    private int f14640e = 0;

    /* renamed from: f, reason: collision with root package name */
    private final int f14641f;

    /* renamed from: g, reason: collision with root package name */
    private final /* synthetic */ g6 f14642g;

    j6(g6 g6Var) {
        this.f14642g = g6Var;
        this.f14641f = g6Var.c();
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        return this.f14640e < this.f14641f;
    }

    @Override // e.c.b.b.c.e.p6
    public final byte zza() {
        int i2 = this.f14640e;
        if (i2 >= this.f14641f) {
            throw new NoSuchElementException();
        }
        this.f14640e = i2 + 1;
        return this.f14642g.o(i2);
    }
}