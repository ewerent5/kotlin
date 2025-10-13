package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.overlay.zzp;
import com.google.android.gms.ads.internal.overlay.zzw;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class kq0 implements c93, b9, zzp, d9, zzw {

    /* renamed from: e, reason: collision with root package name */
    private c93 f7045e;

    /* renamed from: f, reason: collision with root package name */
    private b9 f7046f;

    /* renamed from: g, reason: collision with root package name */
    private zzp f7047g;

    /* renamed from: h, reason: collision with root package name */
    private d9 f7048h;

    /* renamed from: i, reason: collision with root package name */
    private zzw f7049i;

    /* synthetic */ kq0(fq0 fq0Var) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void c(c93 c93Var, b9 b9Var, zzp zzpVar, d9 d9Var, zzw zzwVar) {
        this.f7045e = c93Var;
        this.f7046f = b9Var;
        this.f7047g = zzpVar;
        this.f7048h = d9Var;
        this.f7049i = zzwVar;
    }

    @Override // com.google.android.gms.internal.ads.d9
    public final synchronized void G(String str, String str2) {
        d9 d9Var = this.f7048h;
        if (d9Var != null) {
            d9Var.G(str, str2);
        }
    }

    @Override // com.google.android.gms.internal.ads.b9
    public final synchronized void a(String str, Bundle bundle) {
        b9 b9Var = this.f7046f;
        if (b9Var != null) {
            b9Var.a(str, bundle);
        }
    }

    @Override // com.google.android.gms.internal.ads.c93
    public final synchronized void onAdClicked() {
        c93 c93Var = this.f7045e;
        if (c93Var != null) {
            c93Var.onAdClicked();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final synchronized void zzbJ() {
        zzp zzpVar = this.f7047g;
        if (zzpVar != null) {
            zzpVar.zzbJ();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final synchronized void zzbo() {
        zzp zzpVar = this.f7047g;
        if (zzpVar != null) {
            zzpVar.zzbo();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final synchronized void zzbr() {
        zzp zzpVar = this.f7047g;
        if (zzpVar != null) {
            zzpVar.zzbr();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final synchronized void zzbs() {
        zzp zzpVar = this.f7047g;
        if (zzpVar != null) {
            zzpVar.zzbs();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final synchronized void zzbt(int i2) {
        zzp zzpVar = this.f7047g;
        if (zzpVar != null) {
            zzpVar.zzbt(i2);
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzw
    public final synchronized void zzf() {
        zzw zzwVar = this.f7049i;
        if (zzwVar != null) {
            zzwVar.zzf();
        }
    }
}