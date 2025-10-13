package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.common.api.a;

/* loaded from: classes.dex */
public class u<T extends IInterface> extends h<T> {

    /* renamed from: d, reason: collision with root package name */
    private final a.h<T> f4736d;

    @Override // com.google.android.gms.common.internal.b
    protected T createServiceInterface(IBinder iBinder) {
        return (T) this.f4736d.createServiceInterface(iBinder);
    }

    public a.h<T> g() {
        return this.f4736d;
    }

    @Override // com.google.android.gms.common.internal.h, com.google.android.gms.common.internal.b, com.google.android.gms.common.api.a.f
    public int getMinApkVersion() {
        return super.getMinApkVersion();
    }

    @Override // com.google.android.gms.common.internal.b
    protected String getServiceDescriptor() {
        return this.f4736d.getServiceDescriptor();
    }

    @Override // com.google.android.gms.common.internal.b
    protected String getStartServiceAction() {
        return this.f4736d.getStartServiceAction();
    }
}