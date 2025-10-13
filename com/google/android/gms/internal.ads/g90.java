package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.ads.internal.zzs;
import org.json.JSONException;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class g90 implements jd0 {

    /* renamed from: e, reason: collision with root package name */
    private final Context f6086e;

    /* renamed from: f, reason: collision with root package name */
    private final qp1 f6087f;

    /* renamed from: g, reason: collision with root package name */
    private final kr f6088g;

    /* renamed from: h, reason: collision with root package name */
    private final zzg f6089h;

    /* renamed from: i, reason: collision with root package name */
    private final qw0 f6090i;

    public g90(Context context, qp1 qp1Var, kr krVar, zzg zzgVar, qw0 qw0Var) {
        this.f6086e = context;
        this.f6087f = qp1Var;
        this.f6088g = krVar;
        this.f6089h = zzgVar;
        this.f6090i = qw0Var;
    }

    @Override // com.google.android.gms.internal.ads.jd0
    public final void R(kp1 kp1Var) {
    }

    @Override // com.google.android.gms.internal.ads.jd0
    public final void f(ql qlVar) throws JSONException {
        if (((Boolean) c.c().b(w3.i2)).booleanValue()) {
            zzs.zzk().zzb(this.f6086e, this.f6088g, this.f6087f.f8429f, this.f6089h.zzn());
        }
        this.f6090i.c();
    }
}