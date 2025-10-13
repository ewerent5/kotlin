package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class gb0 extends sf0<ib0> {

    /* renamed from: f, reason: collision with root package name */
    private boolean f6099f;

    public gb0(Set<nh0<ib0>> set) {
        super(set);
        this.f6099f = false;
    }

    public final synchronized void zza() {
        if (this.f6099f) {
            return;
        }
        J0(fb0.a);
        this.f6099f = true;
    }
}