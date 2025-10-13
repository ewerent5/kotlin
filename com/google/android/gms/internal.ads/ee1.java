package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class ee1 implements zg1<Bundle> {
    private final String a;

    /* renamed from: b, reason: collision with root package name */
    private final String f5629b;

    /* renamed from: c, reason: collision with root package name */
    private final Bundle f5630c;

    /* synthetic */ ee1(String str, String str2, Bundle bundle, de1 de1Var) {
        this.a = str;
        this.f5629b = str2;
        this.f5630c = bundle;
    }

    @Override // com.google.android.gms.internal.ads.zg1
    public final /* bridge */ /* synthetic */ void a(Bundle bundle) {
        Bundle bundle2 = bundle;
        bundle2.putString("consent_string", this.a);
        bundle2.putString("fc_consent", this.f5629b);
        bundle2.putBundle("iab_consent_info", this.f5630c);
    }
}