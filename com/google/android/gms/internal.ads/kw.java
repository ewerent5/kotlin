package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.overlay.zzp;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class kw implements zzp {

    /* renamed from: e, reason: collision with root package name */
    private final ew f7104e;

    /* renamed from: f, reason: collision with root package name */
    private final zzp f7105f;

    public kw(ew ewVar, zzp zzpVar) {
        this.f7104e = ewVar;
        this.f7105f = zzpVar;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzbJ() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzbo() {
        zzp zzpVar = this.f7105f;
        if (zzpVar != null) {
            zzpVar.zzbo();
        }
        this.f7104e.t();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzbr() {
        zzp zzpVar = this.f7105f;
        if (zzpVar != null) {
            zzpVar.zzbr();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzbs() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzbt(int i2) {
        zzp zzpVar = this.f7105f;
        if (zzpVar != null) {
            zzpVar.zzbt(i2);
        }
        this.f7104e.X();
    }
}