package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* loaded from: classes.dex */
public final class z3 {
    public String a;

    /* renamed from: b, reason: collision with root package name */
    private String f11364b;

    /* renamed from: c, reason: collision with root package name */
    private long f11365c;

    /* renamed from: d, reason: collision with root package name */
    public Bundle f11366d;

    private z3(String str, String str2, Bundle bundle, long j2) {
        this.a = str;
        this.f11364b = str2;
        this.f11366d = bundle == null ? new Bundle() : bundle;
        this.f11365c = j2;
    }

    public static z3 b(r rVar) {
        return new z3(rVar.f11169e, rVar.f11171g, rVar.f11170f.K(), rVar.f11172h);
    }

    public final r a() {
        return new r(this.a, new q(new Bundle(this.f11366d)), this.f11364b, this.f11365c);
    }

    public final String toString() {
        String str = this.f11364b;
        String str2 = this.a;
        String strValueOf = String.valueOf(this.f11366d);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 21 + String.valueOf(str2).length() + strValueOf.length());
        sb.append("origin=");
        sb.append(str);
        sb.append(",name=");
        sb.append(str2);
        sb.append(",params=");
        sb.append(strValueOf);
        return sb.toString();
    }
}