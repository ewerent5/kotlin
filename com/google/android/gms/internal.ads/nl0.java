package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class nl0 implements v13 {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ String f7730e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ ol0 f7731f;

    nl0(ol0 ol0Var, String str) {
        this.f7731f = ol0Var;
        this.f7730e = str;
    }

    @Override // com.google.android.gms.internal.ads.v13
    public final void c0(u13 u13Var) {
        if (u13Var.f9355j) {
            this.f7731f.C.put(this.f7730e, Boolean.TRUE);
            ol0 ol0Var = this.f7731f;
            ol0Var.F(ol0Var.t.Y(), this.f7731f.t.zzj(), this.f7731f.t.zzk(), true);
        }
    }
}