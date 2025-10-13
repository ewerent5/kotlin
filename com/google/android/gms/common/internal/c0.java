package com.google.android.gms.common.internal;

import android.app.PendingIntent;
import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
/* loaded from: classes.dex */
abstract class c0 extends m0<Boolean> {

    /* renamed from: d, reason: collision with root package name */
    public final int f4677d;

    /* renamed from: e, reason: collision with root package name */
    public final Bundle f4678e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ b f4679f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected c0(b bVar, int i2, Bundle bundle) {
        super(bVar, Boolean.TRUE);
        this.f4679f = bVar;
        this.f4677d = i2;
        this.f4678e = bundle;
    }

    @Override // com.google.android.gms.common.internal.m0
    protected final void a() {
    }

    @Override // com.google.android.gms.common.internal.m0
    protected final /* bridge */ /* synthetic */ void b(Boolean bool) {
        com.google.android.gms.common.b bVar;
        if (this.f4677d != 0) {
            this.f4679f.zzp(1, null);
            Bundle bundle = this.f4678e;
            bVar = new com.google.android.gms.common.b(this.f4677d, bundle != null ? (PendingIntent) bundle.getParcelable(b.KEY_PENDING_INTENT) : null);
        } else {
            if (f()) {
                return;
            }
            this.f4679f.zzp(1, null);
            bVar = new com.google.android.gms.common.b(8, null);
        }
        g(bVar);
    }

    protected abstract boolean f();

    protected abstract void g(com.google.android.gms.common.b bVar);
}