package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
abstract class sa3<T> {
    private static final h0 a;

    static {
        h0 f0Var = null;
        try {
            Object objNewInstance = ra3.class.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            if (objNewInstance instanceof IBinder) {
                IBinder iBinder = (IBinder) objNewInstance;
                if (iBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IClientApi");
                    f0Var = iInterfaceQueryLocalInterface instanceof h0 ? (h0) iInterfaceQueryLocalInterface : new f0(iBinder);
                }
            } else {
                er.zzi("ClientApi class is not an instance of IBinder.");
            }
        } catch (Exception unused) {
            er.zzi("Failed to instantiate ClientApi class.");
        }
        a = f0Var;
    }

    sa3() {
    }

    private final T e() {
        h0 h0Var = a;
        if (h0Var == null) {
            er.zzi("ClientApi class cannot be loaded.");
            return null;
        }
        try {
            return c(h0Var);
        } catch (RemoteException e2) {
            er.zzj("Cannot invoke local loader using ClientApi class.", e2);
            return null;
        }
    }

    private final T f() {
        try {
            return b();
        } catch (RemoteException e2) {
            er.zzj("Cannot invoke remote loader.", e2);
            return null;
        }
    }

    protected abstract T a();

    protected abstract T b();

    protected abstract T c(h0 h0Var);

    public final T d(Context context, boolean z) {
        boolean z2;
        T tE;
        if (!z) {
            ta3.a();
            if (!xq.n(context, 12451000)) {
                er.zzd("Google Play Services is not available.");
                z = true;
            }
        }
        boolean z3 = false;
        boolean z4 = z | (!(DynamiteModule.a(context, ModuleDescriptor.MODULE_ID) <= DynamiteModule.c(context, ModuleDescriptor.MODULE_ID)));
        w3.a(context);
        if (g5.a.e().booleanValue()) {
            z2 = false;
        } else if (g5.f6041b.e().booleanValue()) {
            z2 = true;
            z3 = true;
        } else {
            z3 = z4;
            z2 = false;
        }
        if (z3) {
            tE = e();
            if (tE == null && !z2) {
                tE = f();
            }
        } else {
            T tF = f();
            if (tF == null) {
                if (ta3.e().nextInt(r5.a.e().intValue()) == 0) {
                    Bundle bundle = new Bundle();
                    bundle.putString("action", "dynamite_load");
                    bundle.putInt("is_missing", 1);
                    ta3.a().e(context, ta3.d().f7054e, "gmob-apps", bundle, true);
                }
            }
            tE = tF == null ? e() : tF;
        }
        return tE == null ? a() : tE;
    }
}