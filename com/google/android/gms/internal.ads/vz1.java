package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class vz1 {
    boolean a;

    /* renamed from: b, reason: collision with root package name */
    wz1 f9821b;

    public vz1(Context context, String str, String str2) throws wy1 {
        wz1 wz1Var;
        try {
            try {
                try {
                    IBinder iBinderD = DynamiteModule.e(context, DynamiteModule.a, ModuleDescriptor.MODULE_ID).d("com.google.android.gms.ads.clearcut.GassDynamiteClearcutLogger");
                    if (iBinderD == null) {
                        wz1Var = null;
                    } else {
                        IInterface iInterfaceQueryLocalInterface = iBinderD.queryLocalInterface("com.google.android.gms.gass.internal.clearcut.IClearcut");
                        wz1Var = iInterfaceQueryLocalInterface instanceof wz1 ? (wz1) iInterfaceQueryLocalInterface : new wz1(iBinderD);
                    }
                    this.f9821b = wz1Var;
                    this.f9821b.Y(e.c.b.b.b.d.m4(context), str, null);
                    this.a = true;
                } catch (Exception e2) {
                    throw new wy1(e2);
                }
            } catch (RemoteException | wy1 | NullPointerException unused) {
                Log.d("GASS", "Cannot dynamite load clearcut");
            }
        } catch (Exception e3) {
            throw new wy1(e3);
        }
    }

    public final tz1 a(byte[] bArr) {
        return new tz1(this, bArr, null);
    }
}