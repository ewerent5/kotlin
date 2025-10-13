package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import okhttp3.HttpUrl;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* loaded from: classes.dex */
public final class t3 extends w5 {

    /* renamed from: c */
    private static final AtomicReference<String[]> f11230c = new AtomicReference<>();

    /* renamed from: d */
    private static final AtomicReference<String[]> f11231d = new AtomicReference<>();

    /* renamed from: e */
    private static final AtomicReference<String[]> f11232e = new AtomicReference<>();

    t3(z4 z4Var) {
        super(z4Var);
    }

    private static String s(String str, String[] strArr, String[] strArr2, AtomicReference<String[]> atomicReference) {
        String str2;
        com.google.android.gms.common.internal.p.j(strArr);
        com.google.android.gms.common.internal.p.j(strArr2);
        com.google.android.gms.common.internal.p.j(atomicReference);
        com.google.android.gms.common.internal.p.a(strArr.length == strArr2.length);
        for (int i2 = 0; i2 < strArr.length; i2++) {
            if (da.w0(str, strArr[i2])) {
                synchronized (atomicReference) {
                    String[] strArr3 = atomicReference.get();
                    if (strArr3 == null) {
                        strArr3 = new String[strArr2.length];
                        atomicReference.set(strArr3);
                    }
                    if (strArr3[i2] == null) {
                        strArr3[i2] = strArr2[i2] + "(" + strArr[i2] + ")";
                    }
                    str2 = strArr3[i2];
                }
                return str2;
            }
        }
        return str;
    }

    private final String t(Object[] objArr) {
        if (objArr == null) {
            return HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (Object obj : objArr) {
            String strP = obj instanceof Bundle ? p((Bundle) obj) : String.valueOf(obj);
            if (strP != null) {
                if (sb.length() != 1) {
                    sb.append(", ");
                }
                sb.append(strP);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    private final boolean w() {
        return this.a.E() && this.a.zzq().x(3);
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

    protected final String p(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        if (!w()) {
            return bundle.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Bundle[{");
        for (String str : bundle.keySet()) {
            if (sb.length() != 8) {
                sb.append(", ");
            }
            sb.append(u(str));
            sb.append("=");
            Object obj = bundle.get(str);
            sb.append(obj instanceof Bundle ? t(new Object[]{obj}) : obj instanceof Object[] ? t((Object[]) obj) : obj instanceof ArrayList ? t(((ArrayList) obj).toArray()) : String.valueOf(obj));
        }
        sb.append("}]");
        return sb.toString();
    }

    protected final String q(r rVar) {
        if (rVar == null) {
            return null;
        }
        if (!w()) {
            return rVar.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("origin=");
        sb.append(rVar.f11171g);
        sb.append(",name=");
        sb.append(r(rVar.f11169e));
        sb.append(",params=");
        q qVar = rVar.f11170f;
        sb.append(qVar != null ? !w() ? qVar.toString() : p(qVar.K()) : null);
        return sb.toString();
    }

    protected final String r(String str) {
        if (str == null) {
            return null;
        }
        return !w() ? str : s(str, b6.f10768c, b6.a, f11230c);
    }

    protected final String u(String str) {
        if (str == null) {
            return null;
        }
        return !w() ? str : s(str, a6.f10747b, a6.a, f11231d);
    }

    protected final String v(String str) {
        if (str == null) {
            return null;
        }
        if (!w()) {
            return str;
        }
        if (!str.startsWith("_exp_")) {
            return s(str, d6.f10810b, d6.a, f11232e);
        }
        return "experiment_id(" + str + ")";
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