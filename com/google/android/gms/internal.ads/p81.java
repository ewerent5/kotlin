package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdError;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class p81 implements yb0 {
    boolean a = false;

    /* renamed from: b */
    final /* synthetic */ m31 f8119b;

    /* renamed from: c */
    final /* synthetic */ wr f8120c;

    /* renamed from: d */
    final /* synthetic */ q81 f8121d;

    p81(q81 q81Var, m31 m31Var, wr wrVar) {
        this.f8121d = q81Var;
        this.f8119b = m31Var;
        this.f8120c = wrVar;
    }

    private final void b(g93 g93Var) {
        this.f8120c.zzd(new o31(true == ((Boolean) c.c().b(w3.E3)).booleanValue() ? 3 : 1, g93Var));
    }

    @Override // com.google.android.gms.internal.ads.yb0
    public final synchronized void a(int i2, String str) {
        if (this.a) {
            return;
        }
        this.a = true;
        if (str == null) {
            str = q81.e(this.f8119b.a, i2);
        }
        b(new g93(i2, str, AdError.UNDEFINED_DOMAIN, null, null));
    }

    @Override // com.google.android.gms.internal.ads.yb0
    public final synchronized void x(g93 g93Var) {
        this.a = true;
        b(g93Var);
    }

    @Override // com.google.android.gms.internal.ads.yb0
    public final synchronized void zza() {
        this.f8120c.zzc(null);
    }

    @Override // com.google.android.gms.internal.ads.yb0
    public final void zzb(int i2) {
        if (this.a) {
            return;
        }
        b(new g93(i2, q81.e(this.f8119b.a, i2), AdError.UNDEFINED_DOMAIN, null, null));
    }
}