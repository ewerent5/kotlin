package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzs;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class d21 implements tt1 {

    /* renamed from: e, reason: collision with root package name */
    private final a21 f5415e;

    d21(a21 a21Var) {
        this.f5415e = a21Var;
    }

    @Override // com.google.android.gms.internal.ads.tt1
    public final void A(lt1 lt1Var, String str) {
        if (((Boolean) c.c().b(w3.o4)).booleanValue() && lt1.RENDERER == lt1Var && this.f5415e.f() != 0) {
            this.f5415e.g(zzs.zzj().c() - this.f5415e.f());
        }
    }

    @Override // com.google.android.gms.internal.ads.tt1
    public final void m(lt1 lt1Var, String str) {
    }

    @Override // com.google.android.gms.internal.ads.tt1
    public final void o(lt1 lt1Var, String str) {
        if (((Boolean) c.c().b(w3.o4)).booleanValue() && lt1.RENDERER == lt1Var) {
            this.f5415e.e(zzs.zzj().c());
        }
    }

    @Override // com.google.android.gms.internal.ads.tt1
    public final void z(lt1 lt1Var, String str, Throwable th) {
        if (((Boolean) c.c().b(w3.o4)).booleanValue() && lt1.RENDERER == lt1Var && this.f5415e.f() != 0) {
            this.f5415e.g(zzs.zzj().c() - this.f5415e.f());
        }
    }
}