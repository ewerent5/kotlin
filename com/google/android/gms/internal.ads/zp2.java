package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class zp2 implements rz1 {
    private final nx1 a;

    /* renamed from: b, reason: collision with root package name */
    private final fy1 f10625b;

    /* renamed from: c, reason: collision with root package name */
    private final nq2 f10626c;

    /* renamed from: d, reason: collision with root package name */
    private final yp2 f10627d;

    zp2(nx1 nx1Var, fy1 fy1Var, nq2 nq2Var, yp2 yp2Var) {
        this.a = nx1Var;
        this.f10625b = fy1Var;
        this.f10626c = nq2Var;
        this.f10627d = yp2Var;
    }

    private final Map<String, Object> b() {
        HashMap map = new HashMap();
        u91 u91VarC = this.f10625b.c();
        map.put("v", this.a.a());
        map.put("gms", Boolean.valueOf(this.a.c()));
        map.put("int", u91VarC.s0());
        map.put("up", Boolean.valueOf(this.f10627d.a()));
        map.put("t", new Throwable());
        return map;
    }

    final void a(View view) {
        this.f10626c.a(view);
    }

    @Override // com.google.android.gms.internal.ads.rz1
    public final Map<String, Object> zzb() {
        Map<String, Object> mapB = b();
        u91 u91VarB = this.f10625b.b();
        mapB.put("gai", Boolean.valueOf(this.a.b()));
        mapB.put("did", u91VarB.t0());
        mapB.put("dst", Integer.valueOf(u91VarB.u0().zza()));
        mapB.put("doo", Boolean.valueOf(u91VarB.v0()));
        return mapB;
    }

    @Override // com.google.android.gms.internal.ads.rz1
    public final Map<String, Object> zzc() {
        return b();
    }

    @Override // com.google.android.gms.internal.ads.rz1
    public final Map<String, Object> zzd() {
        Map<String, Object> mapB = b();
        mapB.put("lts", Long.valueOf(this.f10626c.c()));
        return mapB;
    }
}