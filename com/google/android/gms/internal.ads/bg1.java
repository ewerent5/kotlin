package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class bg1 implements zg1<Bundle> {
    private final String a;

    /* renamed from: b, reason: collision with root package name */
    private final String f5103b;

    public bg1(String str, String str2) {
        this.a = str;
        this.f5103b = str2;
    }

    @Override // com.google.android.gms.internal.ads.zg1
    public final /* bridge */ /* synthetic */ void a(Bundle bundle) {
        Bundle bundle2 = bundle;
        if (((Boolean) c.c().b(w3.V4)).booleanValue()) {
            bundle2.putString("request_id", this.f5103b);
        } else {
            bundle2.putString("request_id", this.a);
        }
    }
}