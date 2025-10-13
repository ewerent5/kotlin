package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.zzg;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class ro extends lp {

    /* renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.common.util.f f8687b;

    /* renamed from: c, reason: collision with root package name */
    private final wo2<Context> f8688c;

    /* renamed from: d, reason: collision with root package name */
    private final wo2<zzg> f8689d;

    /* renamed from: e, reason: collision with root package name */
    private final wo2<kp> f8690e;

    /* renamed from: f, reason: collision with root package name */
    private final wo2<io> f8691f;

    /* renamed from: g, reason: collision with root package name */
    private final wo2<com.google.android.gms.common.util.f> f8692g;

    /* renamed from: h, reason: collision with root package name */
    private final wo2<ko> f8693h;

    /* renamed from: i, reason: collision with root package name */
    private final wo2<mo> f8694i;

    /* renamed from: j, reason: collision with root package name */
    private final wo2<qp> f8695j;

    /* synthetic */ ro(Context context, com.google.android.gms.common.util.f fVar, zzg zzgVar, kp kpVar, oo ooVar) {
        this.f8687b = fVar;
        mo2 mo2VarA = no2.a(context);
        this.f8688c = mo2VarA;
        mo2 mo2VarA2 = no2.a(zzgVar);
        this.f8689d = mo2VarA2;
        mo2 mo2VarA3 = no2.a(kpVar);
        this.f8690e = mo2VarA3;
        this.f8691f = lo2.a(new jo(mo2VarA, mo2VarA2, mo2VarA3));
        mo2 mo2VarA4 = no2.a(fVar);
        this.f8692g = mo2VarA4;
        wo2<ko> wo2VarA = lo2.a(new lo(mo2VarA4, mo2VarA2, mo2VarA3));
        this.f8693h = wo2VarA;
        no noVar = new no(mo2VarA4, wo2VarA);
        this.f8694i = noVar;
        this.f8695j = lo2.a(new tp(mo2VarA, noVar));
    }

    @Override // com.google.android.gms.internal.ads.lp
    final io a() {
        return this.f8691f.zzb();
    }

    @Override // com.google.android.gms.internal.ads.lp
    final mo b() {
        return new mo(this.f8687b, this.f8693h.zzb());
    }

    @Override // com.google.android.gms.internal.ads.lp
    final qp c() {
        return this.f8695j.zzb();
    }
}