package e.c.b.b.c.e;

import e.c.b.b.c.e.h;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@18.0.0 */
/* loaded from: classes.dex */
final class b0 extends h.a {

    /* renamed from: j, reason: collision with root package name */
    private final /* synthetic */ String f14384j;

    /* renamed from: k, reason: collision with root package name */
    private final /* synthetic */ Object f14385k;
    private final /* synthetic */ h n;

    /* renamed from: i, reason: collision with root package name */
    private final /* synthetic */ int f14383i = 5;

    /* renamed from: l, reason: collision with root package name */
    private final /* synthetic */ Object f14386l = null;

    /* renamed from: m, reason: collision with root package name */
    private final /* synthetic */ Object f14387m = null;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    b0(h hVar, boolean z, int i2, String str, Object obj, Object obj2, Object obj3) {
        super(false);
        this.n = hVar;
        this.f14384j = str;
        this.f14385k = obj;
    }

    @Override // e.c.b.b.c.e.h.a
    final void a() {
        this.n.f14570m.logHealthData(this.f14383i, this.f14384j, e.c.b.b.b.d.m4(this.f14385k), e.c.b.b.b.d.m4(null), e.c.b.b.b.d.m4(null));
    }
}