package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.b;

/* loaded from: classes.dex */
public final class b0 extends a0<Boolean> {

    /* renamed from: c */
    private final f<?> f4586c;

    public b0(f<?> fVar, e.c.b.b.e.i<Boolean> iVar) {
        super(4, iVar);
        this.f4586c = fVar;
    }

    @Override // com.google.android.gms.common.api.internal.a0, com.google.android.gms.common.api.internal.k
    public final /* bridge */ /* synthetic */ void b(Status status) {
        super.b(status);
    }

    @Override // com.google.android.gms.common.api.internal.k
    public final /* bridge */ /* synthetic */ void d(h hVar, boolean z) {
    }

    @Override // com.google.android.gms.common.api.internal.a0, com.google.android.gms.common.api.internal.k
    public final /* bridge */ /* synthetic */ void e(RuntimeException runtimeException) {
        super.e(runtimeException);
    }

    @Override // com.google.android.gms.common.api.internal.t
    public final com.google.android.gms.common.d[] g(b.a<?> aVar) {
        if (aVar.u().get(this.f4586c) == null) {
            return null;
        }
        throw null;
    }

    @Override // com.google.android.gms.common.api.internal.t
    public final boolean h(b.a<?> aVar) {
        if (aVar.u().get(this.f4586c) == null) {
            return false;
        }
        throw null;
    }

    @Override // com.google.android.gms.common.api.internal.a0
    public final void i(b.a<?> aVar) {
        if (aVar.u().remove(this.f4586c) == null) {
            this.f4561b.e(Boolean.FALSE);
        } else {
            aVar.l();
            throw null;
        }
    }
}