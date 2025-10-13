package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final /* synthetic */ class jn1 implements zl1 {
    private final gm a;

    /* renamed from: b */
    private final String f6785b;

    /* renamed from: c */
    private final String f6786c;

    jn1(gm gmVar, String str, String str2) {
        this.a = gmVar;
        this.f6785b = str;
        this.f6786c = str2;
    }

    @Override // com.google.android.gms.internal.ads.zl1
    public final void zza(Object obj) {
        gm gmVar = this.a;
        ((in) obj).R(new sn(gmVar.zzb(), gmVar.zzc()), this.f6785b, this.f6786c);
    }
}