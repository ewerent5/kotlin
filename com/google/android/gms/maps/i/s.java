package com.google.android.gms.maps.i;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule;

/* compiled from: com.google.android.gms:play-services-maps@@17.0.1 */
/* loaded from: classes.dex */
public final class s {
    private static final String a = "s";

    /* renamed from: b, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    private static Context f10682b;

    /* renamed from: c, reason: collision with root package name */
    private static u f10683c;

    public static u a(Context context) throws com.google.android.gms.common.g {
        u tVar;
        com.google.android.gms.common.internal.p.j(context);
        u uVar = f10683c;
        if (uVar != null) {
            return uVar;
        }
        int iF = com.google.android.gms.common.i.f(context, 13400000);
        if (iF != 0) {
            throw new com.google.android.gms.common.g(iF);
        }
        Log.i(a, "Making Creator dynamically");
        try {
            IBinder iBinder = (IBinder) c(((ClassLoader) com.google.android.gms.common.internal.p.j(b(context).getClassLoader())).loadClass("com.google.android.gms.maps.internal.CreatorImpl"));
            if (iBinder == null) {
                tVar = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.ICreator");
                tVar = iInterfaceQueryLocalInterface instanceof u ? (u) iInterfaceQueryLocalInterface : new t(iBinder);
            }
            f10683c = tVar;
            try {
                tVar.zzh(e.c.b.b.b.d.m4(b(context).getResources()), com.google.android.gms.common.i.f4657f);
                return f10683c;
            } catch (RemoteException e2) {
                throw new com.google.android.gms.maps.model.h(e2);
            }
        } catch (ClassNotFoundException unused) {
            throw new IllegalStateException("Unable to find dynamic class com.google.android.gms.maps.internal.CreatorImpl");
        }
    }

    private static Context b(Context context) {
        Context contextC;
        Context context2 = f10682b;
        if (context2 != null) {
            return context2;
        }
        try {
            contextC = DynamiteModule.e(context, DynamiteModule.a, "com.google.android.gms.maps_dynamite").b();
        } catch (Exception e2) {
            Log.e(a, "Failed to load maps module, use legacy", e2);
            contextC = com.google.android.gms.common.i.c(context);
        }
        f10682b = contextC;
        return contextC;
    }

    private static <T> T c(Class cls) {
        try {
            return (T) cls.newInstance();
        } catch (IllegalAccessException unused) {
            String name = cls.getName();
            throw new IllegalStateException(name.length() != 0 ? "Unable to call the default constructor of ".concat(name) : new String("Unable to call the default constructor of "));
        } catch (InstantiationException unused2) {
            String name2 = cls.getName();
            throw new IllegalStateException(name2.length() != 0 ? "Unable to instantiate the dynamic class ".concat(name2) : new String("Unable to instantiate the dynamic class "));
        }
    }
}