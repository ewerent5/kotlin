package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class mg1 implements zg1<Bundle> {
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final String f7486b;

    /* renamed from: c, reason: collision with root package name */
    public final String f7487c;

    /* renamed from: d, reason: collision with root package name */
    public final String f7488d;

    /* renamed from: e, reason: collision with root package name */
    public final Long f7489e;

    public mg1(String str, String str2, String str3, String str4, Long l2) {
        this.a = str;
        this.f7486b = str2;
        this.f7487c = str3;
        this.f7488d = str4;
        this.f7489e = l2;
    }

    @Override // com.google.android.gms.internal.ads.zg1
    public final /* bridge */ /* synthetic */ void a(Bundle bundle) {
        Bundle bundle2 = bundle;
        cq1.e(bundle2, "gmp_app_id", this.a);
        cq1.e(bundle2, "fbs_aiid", this.f7486b);
        cq1.e(bundle2, "fbs_aeid", this.f7487c);
        cq1.e(bundle2, "apm_id_origin", this.f7488d);
        Long l2 = this.f7489e;
        if (l2 != null) {
            bundle2.putLong("sai_timeout", l2.longValue());
        }
    }
}