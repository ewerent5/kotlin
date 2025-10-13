package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
final class t8 extends t7 {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ v8 f9088e;

    /* synthetic */ t8(v8 v8Var, s8 s8Var) {
        this.f9088e = v8Var;
    }

    @Override // com.google.android.gms.internal.ads.u7
    public final void y4(k7 k7Var, String str) {
        if (this.f9088e.f9668b == null) {
            return;
        }
        this.f9088e.f9668b.onCustomClick(this.f9088e.f(k7Var), str);
    }
}