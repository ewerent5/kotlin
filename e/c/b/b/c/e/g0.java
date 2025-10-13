package e.c.b.b.c.e;

import android.os.Bundle;
import e.c.b.b.c.e.h;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@18.0.0 */
/* loaded from: classes.dex */
final class g0 extends h.a {

    /* renamed from: i, reason: collision with root package name */
    private final /* synthetic */ Long f14535i;

    /* renamed from: j, reason: collision with root package name */
    private final /* synthetic */ String f14536j;

    /* renamed from: k, reason: collision with root package name */
    private final /* synthetic */ String f14537k;

    /* renamed from: l, reason: collision with root package name */
    private final /* synthetic */ Bundle f14538l;

    /* renamed from: m, reason: collision with root package name */
    private final /* synthetic */ boolean f14539m;
    private final /* synthetic */ boolean n;
    private final /* synthetic */ h o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    g0(h hVar, Long l2, String str, String str2, Bundle bundle, boolean z, boolean z2) {
        super(hVar);
        this.o = hVar;
        this.f14535i = l2;
        this.f14536j = str;
        this.f14537k = str2;
        this.f14538l = bundle;
        this.f14539m = z;
        this.n = z2;
    }

    @Override // e.c.b.b.c.e.h.a
    final void a() {
        Long l2 = this.f14535i;
        this.o.f14570m.logEvent(this.f14536j, this.f14537k, this.f14538l, this.f14539m, this.n, l2 == null ? this.f14571e : l2.longValue());
    }
}