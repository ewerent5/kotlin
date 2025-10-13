package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class a72 implements e72 {
    final /* synthetic */ h62 a;

    a72(h62 h62Var) {
        this.a = h62Var;
    }

    @Override // com.google.android.gms.internal.ads.e72
    public final <Q> h62<Q> a(Class<Q> cls) {
        if (this.a.zze().equals(cls)) {
            return this.a;
        }
        throw new InternalError("This should never be called, as we always first check supportedPrimitives.");
    }

    @Override // com.google.android.gms.internal.ads.e72
    public final h62<?> zzb() {
        return this.a;
    }

    @Override // com.google.android.gms.internal.ads.e72
    public final Class<?> zzc() {
        return this.a.getClass();
    }

    @Override // com.google.android.gms.internal.ads.e72
    public final Set<Class<?>> zzd() {
        return Collections.singleton(this.a.zze());
    }

    @Override // com.google.android.gms.internal.ads.e72
    public final Class<?> zze() {
        return null;
    }
}