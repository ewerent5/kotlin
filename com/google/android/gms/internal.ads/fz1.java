package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.util.Base64;
import android.view.MotionEvent;
import android.view.View;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class fz1 implements ox1 {
    private final Object a;

    /* renamed from: b, reason: collision with root package name */
    private final gz1 f5988b;

    /* renamed from: c, reason: collision with root package name */
    private final rz1 f5989c;

    /* renamed from: d, reason: collision with root package name */
    private final lx1 f5990d;

    fz1(Object obj, gz1 gz1Var, rz1 rz1Var, lx1 lx1Var) {
        this.a = obj;
        this.f5988b = gz1Var;
        this.f5989c = rz1Var;
        this.f5990d = lx1Var;
    }

    private static String i(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        ms1 ms1VarD = nt1.D();
        ms1VarD.s(bh1.DG);
        ms1VarD.q(ci2.H(bArr));
        return Base64.encodeToString(ms1VarD.n().i(), 11);
    }

    private final synchronized byte[] j(Map<String, String> map, Map<String, Object> map2) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
        } catch (Exception e2) {
            this.f5990d.d(2007, System.currentTimeMillis() - jCurrentTimeMillis, e2);
            return null;
        }
        return (byte[]) this.a.getClass().getDeclaredMethod("xss", Map.class, Map.class).invoke(this.a, null, map2);
    }

    @Override // com.google.android.gms.internal.ads.ox1
    public final synchronized String a(Context context, String str, String str2, View view, Activity activity) {
        Map<String, Object> mapZzd;
        mapZzd = this.f5989c.zzd();
        mapZzd.put("f", "c");
        mapZzd.put("ctx", context);
        mapZzd.put("cs", str2);
        mapZzd.put("aid", null);
        mapZzd.put("view", view);
        mapZzd.put("act", activity);
        return i(j(null, mapZzd));
    }

    @Override // com.google.android.gms.internal.ads.ox1
    public final synchronized void b(String str, MotionEvent motionEvent) {
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            HashMap map = new HashMap();
            map.put("t", new Throwable());
            map.put("aid", null);
            map.put("evt", motionEvent);
            this.a.getClass().getDeclaredMethod("he", Map.class).invoke(this.a, map);
            this.f5990d.c(3003, System.currentTimeMillis() - jCurrentTimeMillis);
        } catch (Exception e2) {
            throw new pz1(2005, e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.ox1
    public final synchronized String c(Context context, String str) {
        Map<String, Object> mapZzb;
        mapZzb = this.f5989c.zzb();
        mapZzb.put("f", "q");
        mapZzb.put("ctx", context);
        mapZzb.put("aid", null);
        return i(j(null, mapZzb));
    }

    @Override // com.google.android.gms.internal.ads.ox1
    public final synchronized String d(Context context, String str, View view, Activity activity) {
        Map<String, Object> mapZzc;
        mapZzc = this.f5989c.zzc();
        mapZzc.put("f", "v");
        mapZzc.put("ctx", context);
        mapZzc.put("aid", null);
        mapZzc.put("view", view);
        mapZzc.put("act", null);
        return i(j(null, mapZzc));
    }

    final gz1 e() {
        return this.f5988b;
    }

    final synchronized boolean f() {
        try {
        } catch (Exception e2) {
            throw new pz1(2001, e2);
        }
        return ((Boolean) this.a.getClass().getDeclaredMethod("init", new Class[0]).invoke(this.a, new Object[0])).booleanValue();
    }

    public final synchronized void g() {
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            this.a.getClass().getDeclaredMethod("close", new Class[0]).invoke(this.a, new Object[0]);
            this.f5990d.c(3001, System.currentTimeMillis() - jCurrentTimeMillis);
        } catch (Exception e2) {
            throw new pz1(2003, e2);
        }
    }

    public final synchronized int h() {
        try {
        } catch (Exception e2) {
            throw new pz1(2006, e2);
        }
        return ((Integer) this.a.getClass().getDeclaredMethod("lcs", new Class[0]).invoke(this.a, new Object[0])).intValue();
    }
}