package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;

/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
/* loaded from: classes.dex */
public final class n0 extends d0 {

    /* renamed from: e, reason: collision with root package name */
    private b f4709e;

    /* renamed from: f, reason: collision with root package name */
    private final int f4710f;

    public n0(b bVar, int i2) {
        this.f4709e = bVar;
        this.f4710f = i2;
    }

    @Override // com.google.android.gms.common.internal.m
    public final void f3(int i2, IBinder iBinder, r0 r0Var) {
        b bVar = this.f4709e;
        p.k(bVar, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
        p.j(r0Var);
        b.zzo(bVar, r0Var);
        i2(i2, iBinder, r0Var.f4725e);
    }

    @Override // com.google.android.gms.common.internal.m
    public final void i2(int i2, IBinder iBinder, Bundle bundle) {
        p.k(this.f4709e, "onPostInitComplete can be called only once per call to getRemoteService");
        this.f4709e.onPostInitHandler(i2, iBinder, bundle, this.f4710f);
        this.f4709e = null;
    }

    @Override // com.google.android.gms.common.internal.m
    public final void l1(int i2, Bundle bundle) {
        Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
    }
}