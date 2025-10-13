package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final /* synthetic */ class sr0 implements rx {

    /* renamed from: e */
    private final wr f8966e;

    sr0(wr wrVar) {
        this.f8966e = wrVar;
    }

    @Override // com.google.android.gms.internal.ads.rx
    public final void zza(boolean z) {
        wr wrVar = this.f8966e;
        if (z) {
            wrVar.zzc(null);
        } else {
            wrVar.zzd(new Exception("Ad Web View failed to load."));
        }
    }
}