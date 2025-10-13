package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdError;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public class s81 extends yf {

    /* renamed from: e */
    private final oa0 f8833e;

    /* renamed from: f */
    private final gb0 f8834f;

    /* renamed from: g */
    private final wb0 f8835g;

    /* renamed from: h */
    private final bc0 f8836h;

    /* renamed from: i */
    private final ef0 f8837i;

    /* renamed from: j */
    private final vc0 f8838j;

    /* renamed from: k */
    private final ii0 f8839k;

    /* renamed from: l */
    private final af0 f8840l;

    /* renamed from: m */
    private final bb0 f8841m;

    public s81(oa0 oa0Var, gb0 gb0Var, wb0 wb0Var, bc0 bc0Var, ef0 ef0Var, vc0 vc0Var, ii0 ii0Var, af0 af0Var, bb0 bb0Var) {
        this.f8833e = oa0Var;
        this.f8834f = gb0Var;
        this.f8835g = wb0Var;
        this.f8836h = bc0Var;
        this.f8837i = ef0Var;
        this.f8838j = vc0Var;
        this.f8839k = ii0Var;
        this.f8840l = af0Var;
        this.f8841m = bb0Var;
    }

    public void A4(xm xmVar) {
    }

    @Override // com.google.android.gms.internal.ads.zf
    public final void D4(int i2, String str) {
    }

    @Override // com.google.android.gms.internal.ads.zf
    public final void H3(k7 k7Var, String str) {
    }

    @Override // com.google.android.gms.internal.ads.zf
    public final void S3(String str, String str2) {
        this.f8837i.G(str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zf
    public final void W(int i2) {
    }

    @Override // com.google.android.gms.internal.ads.zf
    public final void Y1(g93 g93Var) {
        this.f8841m.e0(mq1.c(8, g93Var));
    }

    public void a() {
        this.f8839k.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zf
    @Deprecated
    public final void g1(int i2) {
        Y1(new g93(i2, "", AdError.UNDEFINED_DOMAIN, null, null));
    }

    @Override // com.google.android.gms.internal.ads.zf
    public final void o1(String str) {
        Y1(new g93(0, str, AdError.UNDEFINED_DOMAIN, null, null));
    }

    @Override // com.google.android.gms.internal.ads.zf
    public final void v0(g93 g93Var) {
    }

    public void w3(tm tmVar) {
    }

    @Override // com.google.android.gms.internal.ads.zf
    public final void zze() {
        this.f8833e.onAdClicked();
    }

    @Override // com.google.android.gms.internal.ads.zf
    public final void zzf() {
        this.f8838j.zzbt(4);
    }

    @Override // com.google.android.gms.internal.ads.zf
    public final void zzh() {
        this.f8835g.K0();
    }

    @Override // com.google.android.gms.internal.ads.zf
    public final void zzi() {
        this.f8838j.zzbo();
        this.f8840l.K0();
    }

    @Override // com.google.android.gms.internal.ads.zf
    public final void zzj() {
        this.f8836h.b0();
    }

    public void zzk() {
        this.f8834f.zza();
        this.f8840l.zza();
    }

    public void zzn() {
        this.f8839k.K0();
    }

    @Override // com.google.android.gms.internal.ads.zf
    public final void zzq() {
        this.f8839k.zza();
    }

    public void zzt() {
    }

    @Override // com.google.android.gms.internal.ads.zf
    public final void zzu() {
        this.f8839k.zzd();
    }
}