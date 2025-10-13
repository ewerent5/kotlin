package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.nonagon.signalgeneration.zza;
import com.google.android.gms.ads.nonagon.signalgeneration.zzb;
import com.google.android.gms.ads.nonagon.signalgeneration.zzt;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class n00 implements zza {
    private ba0 a;

    /* renamed from: b, reason: collision with root package name */
    private zzt f7604b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ p00 f7605c;

    /* synthetic */ n00(p00 p00Var, dz dzVar) {
        this.f7605c = p00Var;
    }

    @Override // com.google.android.gms.ads.nonagon.signalgeneration.zza
    public final zzb zza() {
        ro2.c(this.a, ba0.class);
        ro2.c(this.f7604b, zzt.class);
        return new o00(this.f7605c, this.f7604b, new y70(), new av0(), this.a, new tq1(), null, null, null);
    }

    @Override // com.google.android.gms.ads.nonagon.signalgeneration.zza
    public final /* bridge */ /* synthetic */ zza zzb(zzt zztVar) {
        this.f7604b = zztVar;
        return this;
    }

    @Override // com.google.android.gms.ads.nonagon.signalgeneration.zza
    public final /* bridge */ /* synthetic */ zza zzc(ba0 ba0Var) {
        this.a = ba0Var;
        return this;
    }
}