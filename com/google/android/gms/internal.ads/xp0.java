package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.internal.zzs;
import java.util.Arrays;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class xp0 extends i7 {

    /* renamed from: e */
    private final Context f10209e;

    /* renamed from: f */
    private final tl0 f10210f;

    /* renamed from: g */
    private tm0 f10211g;

    /* renamed from: h */
    private ol0 f10212h;

    public xp0(Context context, tl0 tl0Var, tm0 tm0Var, ol0 ol0Var) {
        this.f10209e = context;
        this.f10210f = tl0Var;
        this.f10211g = tm0Var;
        this.f10212h = ol0Var;
    }

    @Override // com.google.android.gms.internal.ads.k7
    public final boolean a() {
        ol0 ol0Var = this.f10212h;
        return (ol0Var == null || ol0Var.i()) && this.f10210f.p() != null && this.f10210f.o() == null;
    }

    @Override // com.google.android.gms.internal.ads.k7
    public final t6 b(String str) {
        return this.f10210f.r().get(str);
    }

    @Override // com.google.android.gms.internal.ads.k7
    public final void y1(e.c.b.b.b.b bVar) {
        ol0 ol0Var;
        Object objY = e.c.b.b.b.d.Y(bVar);
        if (!(objY instanceof View) || this.f10210f.q() == null || (ol0Var = this.f10212h) == null) {
            return;
        }
        ol0Var.j((View) objY);
    }

    @Override // com.google.android.gms.internal.ads.k7
    public final String zze(String str) {
        return this.f10210f.u().get(str);
    }

    @Override // com.google.android.gms.internal.ads.k7
    public final List<String> zzg() {
        c.e.g<String, c6> gVarR = this.f10210f.r();
        c.e.g<String, String> gVarU = this.f10210f.u();
        String[] strArr = new String[gVarR.size() + gVarU.size()];
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < gVarR.size()) {
            strArr[i4] = gVarR.i(i3);
            i3++;
            i4++;
        }
        while (i2 < gVarU.size()) {
            strArr[i4] = gVarU.i(i2);
            i2++;
            i4++;
        }
        return Arrays.asList(strArr);
    }

    @Override // com.google.android.gms.internal.ads.k7
    public final String zzh() {
        return this.f10210f.n();
    }

    @Override // com.google.android.gms.internal.ads.k7
    public final void zzi(String str) {
        ol0 ol0Var = this.f10212h;
        if (ol0Var != null) {
            ol0Var.w(str);
        }
    }

    @Override // com.google.android.gms.internal.ads.k7
    public final void zzj() {
        ol0 ol0Var = this.f10212h;
        if (ol0Var != null) {
            ol0Var.x();
        }
    }

    @Override // com.google.android.gms.internal.ads.k7
    public final n1 zzk() {
        return this.f10210f.Y();
    }

    @Override // com.google.android.gms.internal.ads.k7
    public final void zzl() {
        ol0 ol0Var = this.f10212h;
        if (ol0Var != null) {
            ol0Var.b();
        }
        this.f10212h = null;
        this.f10211g = null;
    }

    @Override // com.google.android.gms.internal.ads.k7
    public final e.c.b.b.b.b zzm() {
        return e.c.b.b.b.d.m4(this.f10209e);
    }

    @Override // com.google.android.gms.internal.ads.k7
    public final boolean zzn(e.c.b.b.b.b bVar) {
        tm0 tm0Var;
        Object objY = e.c.b.b.b.d.Y(bVar);
        if (!(objY instanceof ViewGroup) || (tm0Var = this.f10211g) == null || !tm0Var.d((ViewGroup) objY)) {
            return false;
        }
        this.f10210f.o().l0(new wp0(this));
        return true;
    }

    @Override // com.google.android.gms.internal.ads.k7
    public final boolean zzp() {
        e.c.b.b.b.b bVarQ = this.f10210f.q();
        if (bVarQ == null) {
            er.zzi("Trying to start OMID session before creation.");
            return false;
        }
        zzs.zzr().H(bVarQ);
        if (!((Boolean) c.c().b(w3.o3)).booleanValue() || this.f10210f.p() == null) {
            return true;
        }
        this.f10210f.p().e0("onSdkLoaded", new c.e.a());
        return true;
    }

    @Override // com.google.android.gms.internal.ads.k7
    public final void zzr() {
        String strT = this.f10210f.t();
        if ("Google".equals(strT)) {
            er.zzi("Illegal argument specified for omid partner name.");
            return;
        }
        ol0 ol0Var = this.f10212h;
        if (ol0Var != null) {
            ol0Var.h(strT, false);
        }
    }
}