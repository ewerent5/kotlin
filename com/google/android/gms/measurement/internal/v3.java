package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* loaded from: classes.dex */
public final class v3 extends w5 {

    /* renamed from: c, reason: collision with root package name */
    private char f11285c;

    /* renamed from: d, reason: collision with root package name */
    private long f11286d;

    /* renamed from: e, reason: collision with root package name */
    private String f11287e;

    /* renamed from: f, reason: collision with root package name */
    private final x3 f11288f;

    /* renamed from: g, reason: collision with root package name */
    private final x3 f11289g;

    /* renamed from: h, reason: collision with root package name */
    private final x3 f11290h;

    /* renamed from: i, reason: collision with root package name */
    private final x3 f11291i;

    /* renamed from: j, reason: collision with root package name */
    private final x3 f11292j;

    /* renamed from: k, reason: collision with root package name */
    private final x3 f11293k;

    /* renamed from: l, reason: collision with root package name */
    private final x3 f11294l;

    /* renamed from: m, reason: collision with root package name */
    private final x3 f11295m;
    private final x3 n;

    v3(z4 z4Var) {
        super(z4Var);
        this.f11285c = (char) 0;
        this.f11286d = -1L;
        this.f11288f = new x3(this, 6, false, false);
        this.f11289g = new x3(this, 6, true, false);
        this.f11290h = new x3(this, 6, false, true);
        this.f11291i = new x3(this, 5, false, false);
        this.f11292j = new x3(this, 5, true, false);
        this.f11293k = new x3(this, 5, false, true);
        this.f11294l = new x3(this, 4, false, false);
        this.f11295m = new x3(this, 3, false, false);
        this.n = new x3(this, 2, false, false);
    }

    private final String K() {
        String str;
        synchronized (this) {
            if (this.f11287e == null) {
                this.f11287e = this.a.H() != null ? this.a.H() : "FA";
            }
            str = this.f11287e;
        }
        return str;
    }

    protected static Object s(String str) {
        if (str == null) {
            return null;
        }
        return new a4(str);
    }

    private static String t(boolean z, Object obj) {
        String className;
        if (obj == null) {
            return "";
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf(((Integer) obj).intValue());
        }
        int i2 = 0;
        if (obj instanceof Long) {
            if (!z) {
                return String.valueOf(obj);
            }
            Long l2 = (Long) obj;
            if (Math.abs(l2.longValue()) < 100) {
                return String.valueOf(obj);
            }
            String str = String.valueOf(obj).charAt(0) == '-' ? "-" : "";
            String strValueOf = String.valueOf(Math.abs(l2.longValue()));
            long jRound = Math.round(Math.pow(10.0d, strValueOf.length() - 1));
            long jRound2 = Math.round(Math.pow(10.0d, strValueOf.length()) - 1.0d);
            StringBuilder sb = new StringBuilder(str.length() + 43 + str.length());
            sb.append(str);
            sb.append(jRound);
            sb.append("...");
            sb.append(str);
            sb.append(jRound2);
            return sb.toString();
        }
        if (obj instanceof Boolean) {
            return String.valueOf(obj);
        }
        if (!(obj instanceof Throwable)) {
            return obj instanceof a4 ? ((a4) obj).a : z ? "-" : String.valueOf(obj);
        }
        Throwable th = (Throwable) obj;
        StringBuilder sb2 = new StringBuilder(z ? th.getClass().getName() : th.toString());
        String strZ = z(z4.class.getCanonicalName());
        StackTraceElement[] stackTrace = th.getStackTrace();
        int length = stackTrace.length;
        while (true) {
            if (i2 >= length) {
                break;
            }
            StackTraceElement stackTraceElement = stackTrace[i2];
            if (!stackTraceElement.isNativeMethod() && (className = stackTraceElement.getClassName()) != null && z(className).equals(strZ)) {
                sb2.append(": ");
                sb2.append(stackTraceElement);
                break;
            }
            i2++;
        }
        return sb2.toString();
    }

    static String u(boolean z, String str, Object obj, Object obj2, Object obj3) {
        String str2 = "";
        if (str == null) {
            str = "";
        }
        String strT = t(z, obj);
        String strT2 = t(z, obj2);
        String strT3 = t(z, obj3);
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
            str2 = ": ";
        }
        String str3 = ", ";
        if (!TextUtils.isEmpty(strT)) {
            sb.append(str2);
            sb.append(strT);
            str2 = ", ";
        }
        if (TextUtils.isEmpty(strT2)) {
            str3 = str2;
        } else {
            sb.append(str2);
            sb.append(strT2);
        }
        if (!TextUtils.isEmpty(strT3)) {
            sb.append(str3);
            sb.append(strT3);
        }
        return sb.toString();
    }

    private static String z(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        int iLastIndexOf = str.lastIndexOf(46);
        return iLastIndexOf == -1 ? str : str.substring(0, iLastIndexOf);
    }

    public final x3 A() {
        return this.f11288f;
    }

    public final x3 B() {
        return this.f11289g;
    }

    public final x3 C() {
        return this.f11290h;
    }

    public final x3 D() {
        return this.f11291i;
    }

    public final x3 E() {
        return this.f11292j;
    }

    public final x3 F() {
        return this.f11293k;
    }

    public final x3 G() {
        return this.f11294l;
    }

    public final x3 H() {
        return this.f11295m;
    }

    public final x3 I() {
        return this.n;
    }

    public final String J() {
        Pair<String, Long> pairA = h().f10925e.a();
        if (pairA == null || pairA == i4.f10923c) {
            return null;
        }
        String strValueOf = String.valueOf(pairA.second);
        String str = (String) pairA.first;
        StringBuilder sb = new StringBuilder(strValueOf.length() + 1 + String.valueOf(str).length());
        sb.append(strValueOf);
        sb.append(":");
        sb.append(str);
        return sb.toString();
    }

    @Override // com.google.android.gms.measurement.internal.x5
    public final /* bridge */ /* synthetic */ void b() {
        super.b();
    }

    @Override // com.google.android.gms.measurement.internal.x5
    public final /* bridge */ /* synthetic */ void c() {
        super.c();
    }

    @Override // com.google.android.gms.measurement.internal.x5
    public final /* bridge */ /* synthetic */ void d() {
        super.d();
    }

    @Override // com.google.android.gms.measurement.internal.x5
    public final /* bridge */ /* synthetic */ l e() {
        return super.e();
    }

    @Override // com.google.android.gms.measurement.internal.x5
    public final /* bridge */ /* synthetic */ t3 f() {
        return super.f();
    }

    @Override // com.google.android.gms.measurement.internal.x5
    public final /* bridge */ /* synthetic */ da g() {
        return super.g();
    }

    @Override // com.google.android.gms.measurement.internal.x5
    public final /* bridge */ /* synthetic */ i4 h() {
        return super.h();
    }

    @Override // com.google.android.gms.measurement.internal.x5
    public final /* bridge */ /* synthetic */ c i() {
        return super.i();
    }

    @Override // com.google.android.gms.measurement.internal.w5
    protected final boolean o() {
        return false;
    }

    protected final void v(int i2, String str) {
        Log.println(i2, K(), str);
    }

    protected final void w(int i2, boolean z, boolean z2, String str, Object obj, Object obj2, Object obj3) {
        if (!z && x(i2)) {
            v(i2, u(false, str, obj, obj2, obj3));
        }
        if (z2 || i2 < 5) {
            return;
        }
        com.google.android.gms.common.internal.p.j(str);
        w4 w4VarZ = this.a.z();
        if (w4VarZ == null) {
            v(6, "Scheduler not set. Not logging error/warn");
        } else {
            if (!w4VarZ.k()) {
                v(6, "Scheduler not initialized. Not logging error/warn");
                return;
            }
            if (i2 < 0) {
                i2 = 0;
            }
            w4VarZ.u(new y3(this, i2 >= 9 ? 8 : i2, str, obj, obj2, obj3));
        }
    }

    protected final boolean x(int i2) {
        return Log.isLoggable(K(), i2);
    }

    @Override // com.google.android.gms.measurement.internal.x5, com.google.android.gms.measurement.internal.z5
    public final /* bridge */ /* synthetic */ com.google.android.gms.common.util.f zzl() {
        return super.zzl();
    }

    @Override // com.google.android.gms.measurement.internal.x5, com.google.android.gms.measurement.internal.z5
    public final /* bridge */ /* synthetic */ Context zzm() {
        return super.zzm();
    }

    @Override // com.google.android.gms.measurement.internal.x5, com.google.android.gms.measurement.internal.z5
    public final /* bridge */ /* synthetic */ w4 zzp() {
        return super.zzp();
    }

    @Override // com.google.android.gms.measurement.internal.x5, com.google.android.gms.measurement.internal.z5
    public final /* bridge */ /* synthetic */ v3 zzq() {
        return super.zzq();
    }

    @Override // com.google.android.gms.measurement.internal.x5, com.google.android.gms.measurement.internal.z5
    public final /* bridge */ /* synthetic */ ta zzt() {
        return super.zzt();
    }
}