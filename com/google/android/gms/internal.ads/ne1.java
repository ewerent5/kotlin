package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class ne1 implements zg1<Bundle> {
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f7695b;

    public ne1(String str, boolean z) {
        this.a = str;
        this.f7695b = z;
    }

    @Override // com.google.android.gms.internal.ads.zg1
    public final /* bridge */ /* synthetic */ void a(Bundle bundle) {
        Bundle bundle2 = bundle;
        bundle2.putString("gct", this.a);
        if (this.f7695b) {
            bundle2.putString("de", "1");
        }
    }
}