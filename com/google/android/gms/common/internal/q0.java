package com.google.android.gms.common.internal;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
/* loaded from: classes.dex */
public final class q0 extends c0 {

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ b f4719g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(b bVar, int i2, Bundle bundle) {
        super(bVar, i2, null);
        this.f4719g = bVar;
    }

    @Override // com.google.android.gms.common.internal.c0
    protected final boolean f() {
        this.f4719g.zzc.a(com.google.android.gms.common.b.f4622e);
        return true;
    }

    @Override // com.google.android.gms.common.internal.c0
    protected final void g(com.google.android.gms.common.b bVar) {
        if (this.f4719g.enableLocalFallback() && b.zzg(this.f4719g)) {
            b.zzc(this.f4719g, 16);
        } else {
            this.f4719g.zzc.a(bVar);
            this.f4719g.onConnectionFailed(bVar);
        }
    }
}