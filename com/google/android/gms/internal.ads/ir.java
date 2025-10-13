package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public final class ir {
    public static <T> T a(Context context, String str, gr<IBinder, T> grVar) throws hr {
        try {
            return grVar.zza(c(context).d(str));
        } catch (Exception e2) {
            throw new hr(e2);
        }
    }

    public static Context b(Context context) {
        return c(context).b();
    }

    private static DynamiteModule c(Context context) throws hr {
        try {
            return DynamiteModule.e(context, DynamiteModule.a, ModuleDescriptor.MODULE_ID);
        } catch (Exception e2) {
            throw new hr(e2);
        }
    }
}