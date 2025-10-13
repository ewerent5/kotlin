package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
final class pa3 extends sa3<b7> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ View f8129b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ HashMap f8130c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ HashMap f8131d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ ra3 f8132e;

    pa3(ra3 ra3Var, View view, HashMap map, HashMap map2) {
        this.f8132e = ra3Var;
        this.f8129b = view;
        this.f8130c = map;
        this.f8131d = map2;
    }

    @Override // com.google.android.gms.internal.ads.sa3
    protected final /* bridge */ /* synthetic */ b7 a() {
        ra3.l(this.f8129b.getContext(), "native_ad_view_holder_delegate");
        return new s2();
    }

    @Override // com.google.android.gms.internal.ads.sa3
    public final /* bridge */ /* synthetic */ b7 b() {
        return this.f8132e.f8629g.c(this.f8129b, this.f8130c, this.f8131d);
    }

    @Override // com.google.android.gms.internal.ads.sa3
    public final /* bridge */ /* synthetic */ b7 c(h0 h0Var) {
        return h0Var.zzj(e.c.b.b.b.d.m4(this.f8129b), e.c.b.b.b.d.m4(this.f8130c), e.c.b.b.b.d.m4(this.f8131d));
    }
}