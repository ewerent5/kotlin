package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class x50 implements mo2<Boolean> {
    private final wo2<qp1> a;

    public x50(wo2<qp1> wo2Var) {
        this.a = wo2Var;
    }

    @Override // com.google.android.gms.internal.ads.wo2
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Boolean zzb() {
        boolean z = true;
        if (((ga0) this.a).a().a() == null) {
            if (!((Boolean) c.c().b(w3.I3)).booleanValue()) {
                z = false;
            }
        }
        return Boolean.valueOf(z);
    }
}