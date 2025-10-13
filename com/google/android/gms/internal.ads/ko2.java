package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class ko2<T> implements mo2<T> {
    private wo2<T> a;

    public static <T> void a(wo2<T> wo2Var, wo2<T> wo2Var2) {
        ko2 ko2Var = (ko2) wo2Var;
        if (ko2Var.a != null) {
            throw new IllegalStateException();
        }
        ko2Var.a = wo2Var2;
    }

    @Override // com.google.android.gms.internal.ads.wo2
    public final T zzb() {
        wo2<T> wo2Var = this.a;
        if (wo2Var != null) {
            return wo2Var.zzb();
        }
        throw new IllegalStateException();
    }
}