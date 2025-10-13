package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.query.QueryInfo;
import java.util.Random;
import java.util.WeakHashMap;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public final class ta3 {
    private static final ta3 a = new ta3();

    /* renamed from: b, reason: collision with root package name */
    private final xq f9103b;

    /* renamed from: c, reason: collision with root package name */
    private final ra3 f9104c;

    /* renamed from: d, reason: collision with root package name */
    private final String f9105d;

    /* renamed from: e, reason: collision with root package name */
    private final kr f9106e;

    /* renamed from: f, reason: collision with root package name */
    private final Random f9107f;

    /* renamed from: g, reason: collision with root package name */
    private final WeakHashMap<QueryInfo, String> f9108g;

    protected ta3() {
        xq xqVar = new xq();
        ra3 ra3Var = new ra3(new l93(), new k93(), new i2(), new q8(), new mn(), new uj(), new r8());
        String strF = xq.f();
        kr krVar = new kr(0, 210890000, true, false, false);
        Random random = new Random();
        WeakHashMap<QueryInfo, String> weakHashMap = new WeakHashMap<>();
        this.f9103b = xqVar;
        this.f9104c = ra3Var;
        this.f9105d = strF;
        this.f9106e = krVar;
        this.f9107f = random;
        this.f9108g = weakHashMap;
    }

    public static xq a() {
        return a.f9103b;
    }

    public static ra3 b() {
        return a.f9104c;
    }

    public static String c() {
        return a.f9105d;
    }

    public static kr d() {
        return a.f9106e;
    }

    public static Random e() {
        return a.f9107f;
    }

    public static WeakHashMap<QueryInfo, String> f() {
        return a.f9108g;
    }
}