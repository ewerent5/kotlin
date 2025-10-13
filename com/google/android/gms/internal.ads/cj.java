package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
final class cj extends t7 {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ ej f5323e;

    /* synthetic */ cj(ej ejVar, bj bjVar) {
        this.f5323e = ejVar;
    }

    @Override // com.google.android.gms.internal.ads.u7
    public final void y4(k7 k7Var, String str) {
        if (this.f5323e.f5649b == null) {
            return;
        }
        this.f5323e.f5649b.onCustomClick(this.f5323e.f(k7Var), str);
    }
}