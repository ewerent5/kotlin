package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.security.GeneralSecurityException;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class qz1 {
    private static final HashMap<String, Class<?>> a = new HashMap<>();

    /* renamed from: b, reason: collision with root package name */
    private final Context f8546b;

    /* renamed from: c, reason: collision with root package name */
    private final rz1 f8547c;

    /* renamed from: d, reason: collision with root package name */
    private final lx1 f8548d;

    /* renamed from: e, reason: collision with root package name */
    private final hx1 f8549e;

    /* renamed from: f, reason: collision with root package name */
    private fz1 f8550f;

    /* renamed from: g, reason: collision with root package name */
    private final Object f8551g = new Object();

    public qz1(Context context, rz1 rz1Var, lx1 lx1Var, hx1 hx1Var) {
        this.f8546b = context;
        this.f8547c = rz1Var;
        this.f8548d = lx1Var;
        this.f8549e = hx1Var;
    }

    private final synchronized Class<?> d(gz1 gz1Var) {
        String strD = gz1Var.a().D();
        HashMap<String, Class<?>> map = a;
        Class<?> cls = map.get(strD);
        if (cls != null) {
            return cls;
        }
        try {
            if (!this.f8549e.a(gz1Var.b())) {
                throw new pz1(2026, "VM did not pass signature verification");
            }
            try {
                File fileC = gz1Var.c();
                if (!fileC.exists()) {
                    fileC.mkdirs();
                }
                Class clsLoadClass = new DexClassLoader(gz1Var.b().getAbsolutePath(), fileC.getAbsolutePath(), null, this.f8546b.getClassLoader()).loadClass("com.google.ccc.abuse.droidguard.DroidGuard");
                map.put(strD, clsLoadClass);
                return clsLoadClass;
            } catch (ClassNotFoundException | IllegalArgumentException | SecurityException e2) {
                throw new pz1(2008, e2);
            }
        } catch (GeneralSecurityException e3) {
            throw new pz1(2026, e3);
        }
    }

    public final boolean a(gz1 gz1Var) throws pz1 {
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            try {
                fz1 fz1Var = new fz1(d(gz1Var).getDeclaredConstructor(Context.class, String.class, byte[].class, Object.class, Bundle.class, Integer.TYPE).newInstance(this.f8546b, "msa-r", gz1Var.d(), null, new Bundle(), 2), gz1Var, this.f8547c, this.f8548d);
                if (!fz1Var.f()) {
                    throw new pz1(4000, "init failed");
                }
                int iH = fz1Var.h();
                if (iH != 0) {
                    StringBuilder sb = new StringBuilder(15);
                    sb.append("ci: ");
                    sb.append(iH);
                    throw new pz1(4001, sb.toString());
                }
                synchronized (this.f8551g) {
                    fz1 fz1Var2 = this.f8550f;
                    if (fz1Var2 != null) {
                        try {
                            fz1Var2.g();
                        } catch (pz1 e2) {
                            this.f8548d.d(e2.a(), -1L, e2);
                        }
                        this.f8550f = fz1Var;
                    } else {
                        this.f8550f = fz1Var;
                    }
                }
                this.f8548d.c(3000, System.currentTimeMillis() - jCurrentTimeMillis);
                return true;
            } catch (Exception e3) {
                throw new pz1(2004, e3);
            }
        } catch (pz1 e4) {
            this.f8548d.d(e4.a(), System.currentTimeMillis() - jCurrentTimeMillis, e4);
            return false;
        } catch (Exception e5) {
            this.f8548d.d(4010, System.currentTimeMillis() - jCurrentTimeMillis, e5);
            return false;
        }
    }

    public final ox1 b() {
        fz1 fz1Var;
        synchronized (this.f8551g) {
            fz1Var = this.f8550f;
        }
        return fz1Var;
    }

    public final gz1 c() {
        synchronized (this.f8551g) {
            fz1 fz1Var = this.f8550f;
            if (fz1Var == null) {
                return null;
            }
            return fz1Var.e();
        }
    }
}