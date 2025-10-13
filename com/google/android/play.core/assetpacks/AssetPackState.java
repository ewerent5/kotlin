package com.google.android.play.core.assetpacks;

import android.os.Bundle;

/* loaded from: classes.dex */
public abstract class AssetPackState {
    public static AssetPackState d(String str, int i2, int i3, long j2, long j3, double d2, int i4, String str2) {
        return new z(str, i2, i3, j2, j3, (int) Math.rint(100.0d * d2), i4, str2);
    }

    static AssetPackState e(Bundle bundle, String str, o0 o0Var, t tVar) {
        int iA = tVar.a(bundle.getInt(e.c.b.d.a.b.i0.a("status", str)), str);
        int i2 = bundle.getInt(e.c.b.d.a.b.i0.a("error_code", str));
        long j2 = bundle.getLong(e.c.b.d.a.b.i0.a("bytes_downloaded", str));
        long j3 = bundle.getLong(e.c.b.d.a.b.i0.a("total_bytes_to_download", str));
        double dB = o0Var.b(str);
        long j4 = bundle.getLong(e.c.b.d.a.b.i0.a("pack_version", str));
        long j5 = bundle.getLong(e.c.b.d.a.b.i0.a("pack_base_version", str));
        int i3 = 1;
        if (iA == 4 && j5 != 0 && j5 != j4) {
            i3 = 2;
        }
        return d(str, iA, i2, j2, j3, dB, i3, bundle.getString(e.c.b.d.a.b.i0.a("pack_version_tag", str), ""));
    }

    public abstract int a();

    public abstract String b();

    public abstract long c();

    public abstract int f();

    public abstract String g();

    public abstract int h();

    public abstract long i();

    public abstract int j();
}