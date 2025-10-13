package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.util.Pair;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* loaded from: classes.dex */
public final class p4 {
    private final String a;

    /* renamed from: b, reason: collision with root package name */
    private final String f11103b;

    /* renamed from: c, reason: collision with root package name */
    private final String f11104c;

    /* renamed from: d, reason: collision with root package name */
    private final long f11105d;

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ i4 f11106e;

    private p4(i4 i4Var, String str, long j2) {
        this.f11106e = i4Var;
        com.google.android.gms.common.internal.p.f(str);
        com.google.android.gms.common.internal.p.a(j2 > 0);
        this.a = String.valueOf(str).concat(":start");
        this.f11103b = String.valueOf(str).concat(":count");
        this.f11104c = String.valueOf(str).concat(":value");
        this.f11105d = j2;
    }

    private final void c() {
        this.f11106e.d();
        long jA = this.f11106e.zzl().a();
        SharedPreferences.Editor editorEdit = this.f11106e.z().edit();
        editorEdit.remove(this.f11103b);
        editorEdit.remove(this.f11104c);
        editorEdit.putLong(this.a, jA);
        editorEdit.apply();
    }

    private final long d() {
        return this.f11106e.z().getLong(this.a, 0L);
    }

    public final Pair<String, Long> a() {
        long jAbs;
        this.f11106e.d();
        this.f11106e.d();
        long jD = d();
        if (jD == 0) {
            c();
            jAbs = 0;
        } else {
            jAbs = Math.abs(jD - this.f11106e.zzl().a());
        }
        long j2 = this.f11105d;
        if (jAbs < j2) {
            return null;
        }
        if (jAbs > (j2 << 1)) {
            c();
            return null;
        }
        String string = this.f11106e.z().getString(this.f11104c, null);
        long j3 = this.f11106e.z().getLong(this.f11103b, 0L);
        c();
        return (string == null || j3 <= 0) ? i4.f10923c : new Pair<>(string, Long.valueOf(j3));
    }

    public final void b(String str, long j2) {
        this.f11106e.d();
        if (d() == 0) {
            c();
        }
        if (str == null) {
            str = "";
        }
        long j3 = this.f11106e.z().getLong(this.f11103b, 0L);
        if (j3 <= 0) {
            SharedPreferences.Editor editorEdit = this.f11106e.z().edit();
            editorEdit.putString(this.f11104c, str);
            editorEdit.putLong(this.f11103b, 1L);
            editorEdit.apply();
            return;
        }
        long j4 = j3 + 1;
        boolean z = (this.f11106e.g().C0().nextLong() & Long.MAX_VALUE) < Long.MAX_VALUE / j4;
        SharedPreferences.Editor editorEdit2 = this.f11106e.z().edit();
        if (z) {
            editorEdit2.putString(this.f11104c, str);
        }
        editorEdit2.putLong(this.f11103b, j4);
        editorEdit2.apply();
    }
}