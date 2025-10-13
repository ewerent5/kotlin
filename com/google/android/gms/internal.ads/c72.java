package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class c72 implements e72 {
    final /* synthetic */ z62 a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ n62 f5278b;

    c72(z62 z62Var, n62 n62Var) {
        this.a = z62Var;
        this.f5278b = n62Var;
    }

    @Override // com.google.android.gms.internal.ads.e72
    public final <Q> h62<Q> a(Class<Q> cls) throws GeneralSecurityException {
        try {
            return new y62(this.a, this.f5278b, cls);
        } catch (IllegalArgumentException e2) {
            throw new GeneralSecurityException("Primitive type not supported", e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.e72
    public final h62<?> zzb() {
        z62 z62Var = this.a;
        return new y62(z62Var, this.f5278b, z62Var.h());
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
        return this.f5278b.getClass();
    }
}