package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final /* synthetic */ class eg1 implements d42 {
    private final hg1 a;

    /* renamed from: b */
    private final String f5632b;

    /* renamed from: c */
    private final List f5633c;

    /* renamed from: d */
    private final Bundle f5634d;

    eg1(hg1 hg1Var, String str, List list, Bundle bundle) {
        this.a = hg1Var;
        this.f5632b = str;
        this.f5633c = list;
        this.f5634d = bundle;
    }

    @Override // com.google.android.gms.internal.ads.d42
    public final g52 zza() {
        return this.a.a(this.f5632b, this.f5633c, this.f5634d);
    }
}