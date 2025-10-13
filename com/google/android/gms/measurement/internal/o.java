package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;
import ch.qos.logback.core.CoreConstants;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* loaded from: classes.dex */
public final class o {
    final String a;

    /* renamed from: b, reason: collision with root package name */
    final String f11067b;

    /* renamed from: c, reason: collision with root package name */
    private final String f11068c;

    /* renamed from: d, reason: collision with root package name */
    final long f11069d;

    /* renamed from: e, reason: collision with root package name */
    final long f11070e;

    /* renamed from: f, reason: collision with root package name */
    final q f11071f;

    private o(z4 z4Var, String str, String str2, String str3, long j2, long j3, q qVar) {
        com.google.android.gms.common.internal.p.f(str2);
        com.google.android.gms.common.internal.p.f(str3);
        com.google.android.gms.common.internal.p.j(qVar);
        this.a = str2;
        this.f11067b = str3;
        this.f11068c = TextUtils.isEmpty(str) ? null : str;
        this.f11069d = j2;
        this.f11070e = j3;
        if (j3 != 0 && j3 > j2) {
            z4Var.zzq().D().c("Event created with reverse previous/current timestamps. appId, name", v3.s(str2), v3.s(str3));
        }
        this.f11071f = qVar;
    }

    final o a(z4 z4Var, long j2) {
        return new o(z4Var, this.f11068c, this.a, this.f11067b, this.f11069d, j2, this.f11071f);
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.f11067b;
        String strValueOf = String.valueOf(this.f11071f);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 33 + String.valueOf(str2).length() + strValueOf.length());
        sb.append("Event{appId='");
        sb.append(str);
        sb.append("', name='");
        sb.append(str2);
        sb.append("', params=");
        sb.append(strValueOf);
        sb.append(CoreConstants.CURLY_RIGHT);
        return sb.toString();
    }

    o(z4 z4Var, String str, String str2, String str3, long j2, long j3, Bundle bundle) {
        q qVar;
        com.google.android.gms.common.internal.p.f(str2);
        com.google.android.gms.common.internal.p.f(str3);
        this.a = str2;
        this.f11067b = str3;
        this.f11068c = TextUtils.isEmpty(str) ? null : str;
        this.f11069d = j2;
        this.f11070e = j3;
        if (j3 != 0 && j3 > j2) {
            z4Var.zzq().D().b("Event created with reverse previous/current timestamps. appId", v3.s(str2));
        }
        if (bundle != null && !bundle.isEmpty()) {
            Bundle bundle2 = new Bundle(bundle);
            Iterator<String> it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next == null) {
                    z4Var.zzq().A().a("Param name can't be null");
                    it.remove();
                } else {
                    Object objC = z4Var.B().C(next, bundle2.get(next));
                    if (objC == null) {
                        z4Var.zzq().D().b("Param value can't be null", z4Var.C().u(next));
                        it.remove();
                    } else {
                        z4Var.B().I(bundle2, next, objC);
                    }
                }
            }
            qVar = new q(bundle2);
        } else {
            qVar = new q(new Bundle());
        }
        this.f11071f = qVar;
    }
}