package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class jc0 extends sf0<gx1> implements b9 {

    /* renamed from: f, reason: collision with root package name */
    private final Bundle f6731f;

    public jc0(Set<nh0<gx1>> set) {
        super(set);
        this.f6731f = new Bundle();
    }

    public final synchronized Bundle K0() {
        return new Bundle(this.f6731f);
    }

    @Override // com.google.android.gms.internal.ads.b9
    public final synchronized void a(String str, Bundle bundle) {
        this.f6731f.putAll(bundle);
        J0(ic0.a);
    }
}