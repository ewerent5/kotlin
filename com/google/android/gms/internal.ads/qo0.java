package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final /* synthetic */ class qo0 implements e42 {
    private final g52 a;

    qo0(g52 g52Var) {
        this.a = g52Var;
    }

    @Override // com.google.android.gms.internal.ads.e42
    public final g52 zza(Object obj) {
        return obj != null ? this.a : y42.b(new e71(1, "Retrieve required value in native ad response failed."));
    }
}