package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class b72 implements e72 {
    final /* synthetic */ n62 a;

    b72(n62 n62Var) {
        this.a = n62Var;
    }

    @Override // com.google.android.gms.internal.ads.e72
    public final <Q> h62<Q> a(Class<Q> cls) throws GeneralSecurityException {
        try {
            return new j62(this.a, cls);
        } catch (IllegalArgumentException e2) {
            throw new GeneralSecurityException("Primitive type not supported", e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.e72
    public final h62<?> zzb() {
        n62 n62Var = this.a;
        return new j62(n62Var, n62Var.h());
    }

    @Override // com.google.android.gms.internal.ads.e72
    public final Class<?> zzc() {
        return this.a.getClass();
    }

    @Override // com.google.android.gms.internal.ads.e72
    public final Set<Class<?>> zzd() {
        return this.a.g();
    }

    @Override // com.google.android.gms.internal.ads.e72
    public final Class<?> zze() {
        return null;
    }
}