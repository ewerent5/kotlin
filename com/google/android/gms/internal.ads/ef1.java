package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class ef1 implements zg1<Bundle> {
    public final wo1 a;

    public ef1(wo1 wo1Var) {
        this.a = wo1Var;
    }

    @Override // com.google.android.gms.internal.ads.zg1
    public final /* bridge */ /* synthetic */ void a(Bundle bundle) {
        Bundle bundle2 = bundle;
        wo1 wo1Var = this.a;
        if (wo1Var != null) {
            bundle2.putBoolean("render_in_browser", wo1Var.b());
            bundle2.putBoolean("disable_ml", this.a.c());
        }
    }
}