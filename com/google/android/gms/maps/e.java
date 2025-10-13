package com.google.android.gms.maps;

import android.content.Context;
import android.os.RemoteException;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.maps.i.s;
import com.google.android.gms.maps.i.u;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-maps@@17.0.1 */
/* loaded from: classes.dex */
public final class e {

    @GuardedBy("MapsInitializer.class")
    private static boolean a = false;

    public static synchronized int a(@RecentlyNonNull Context context) {
        com.google.android.gms.common.internal.p.k(context, "Context is null");
        if (a) {
            return 0;
        }
        try {
            u uVarA = s.a(context);
            try {
                b.c(uVarA.zzf());
                com.google.android.gms.maps.model.b.b(uVarA.zzg());
                a = true;
                return 0;
            } catch (RemoteException e2) {
                throw new com.google.android.gms.maps.model.h(e2);
            }
        } catch (com.google.android.gms.common.g e3) {
            return e3.f4652e;
        }
    }
}