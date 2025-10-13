package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.b;

/* loaded from: classes.dex */
abstract class a0<T> extends t {

    /* renamed from: b, reason: collision with root package name */
    protected final e.c.b.b.e.i<T> f4561b;

    public a0(int i2, e.c.b.b.e.i<T> iVar) {
        super(i2);
        this.f4561b = iVar;
    }

    @Override // com.google.android.gms.common.api.internal.k
    public void b(Status status) {
        this.f4561b.d(new com.google.android.gms.common.api.b(status));
    }

    @Override // com.google.android.gms.common.api.internal.k
    public final void c(b.a<?> aVar) throws DeadObjectException {
        try {
            i(aVar);
        } catch (DeadObjectException e2) {
            b(k.a(e2));
            throw e2;
        } catch (RemoteException e3) {
            b(k.a(e3));
        } catch (RuntimeException e4) {
            e(e4);
        }
    }

    @Override // com.google.android.gms.common.api.internal.k
    public void e(RuntimeException runtimeException) {
        this.f4561b.d(runtimeException);
    }

    protected abstract void i(b.a<?> aVar);
}