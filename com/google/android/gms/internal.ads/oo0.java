package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final /* synthetic */ class oo0 implements e42 {
    private final g52 a;

    oo0(g52 g52Var) {
        this.a = g52Var;
    }

    @Override // com.google.android.gms.internal.ads.e42
    public final g52 zza(Object obj) throws e71 {
        g52 g52Var = this.a;
        ew ewVar = (ew) obj;
        if (ewVar == null || ewVar.zzh() == null) {
            throw new e71(1, "Retrieve video view in instream ad response failed.");
        }
        return g52Var;
    }
}