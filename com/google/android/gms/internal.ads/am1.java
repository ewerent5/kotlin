package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class am1 {
    public static <T> void a(AtomicReference<T> atomicReference, zl1<T> zl1Var) {
        T t = atomicReference.get();
        if (t == null) {
            return;
        }
        try {
            zl1Var.zza(t);
        } catch (RemoteException e2) {
            er.zzl("#007 Could not call remote method.", e2);
        } catch (NullPointerException e3) {
            er.zzj("NullPointerException occurs when invoking a method from a delegating listener.", e3);
        }
    }
}