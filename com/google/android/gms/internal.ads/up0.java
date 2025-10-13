package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class up0 extends f7 {

    /* renamed from: e, reason: collision with root package name */
    private final String f9527e;

    /* renamed from: f, reason: collision with root package name */
    private final ol0 f9528f;

    /* renamed from: g, reason: collision with root package name */
    private final tl0 f9529g;

    public up0(String str, ol0 ol0Var, tl0 tl0Var) {
        this.f9527e = str;
        this.f9528f = ol0Var;
        this.f9529g = tl0Var;
    }

    @Override // com.google.android.gms.internal.ads.g7
    public final void C2(Bundle bundle) {
        this.f9528f.y(bundle);
    }

    @Override // com.google.android.gms.internal.ads.g7
    public final void K(Bundle bundle) {
        this.f9528f.A(bundle);
    }

    @Override // com.google.android.gms.internal.ads.g7
    public final l6 a() {
        return this.f9529g.Z();
    }

    @Override // com.google.android.gms.internal.ads.g7
    public final boolean h2(Bundle bundle) {
        return this.f9528f.z(bundle);
    }

    @Override // com.google.android.gms.internal.ads.g7
    public final e.c.b.b.b.b zzb() {
        return e.c.b.b.b.d.m4(this.f9528f);
    }

    @Override // com.google.android.gms.internal.ads.g7
    public final String zzc() {
        return this.f9529g.b0();
    }

    @Override // com.google.android.gms.internal.ads.g7
    public final List<?> zzd() {
        return this.f9529g.c0();
    }

    @Override // com.google.android.gms.internal.ads.g7
    public final String zze() {
        return this.f9529g.c();
    }

    @Override // com.google.android.gms.internal.ads.g7
    public final t6 zzf() {
        return this.f9529g.m();
    }

    @Override // com.google.android.gms.internal.ads.g7
    public final String zzg() {
        return this.f9529g.e();
    }

    @Override // com.google.android.gms.internal.ads.g7
    public final String zzh() {
        return this.f9529g.l();
    }

    @Override // com.google.android.gms.internal.ads.g7
    public final Bundle zzi() {
        return this.f9529g.d();
    }

    @Override // com.google.android.gms.internal.ads.g7
    public final void zzj() {
        this.f9528f.b();
    }

    @Override // com.google.android.gms.internal.ads.g7
    public final n1 zzk() {
        return this.f9529g.Y();
    }

    @Override // com.google.android.gms.internal.ads.g7
    public final e.c.b.b.b.b zzp() {
        return this.f9529g.g();
    }

    @Override // com.google.android.gms.internal.ads.g7
    public final String zzq() {
        return this.f9527e;
    }
}