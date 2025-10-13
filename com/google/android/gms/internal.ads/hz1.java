package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.io.File;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class hz1 {
    private final File a;

    /* renamed from: b */
    final File f6447b;

    /* renamed from: c */
    private final SharedPreferences f6448c;

    /* renamed from: d */
    private final sr2 f6449d;

    public hz1(Context context, sr2 sr2Var) {
        this.f6448c = context.getSharedPreferences("pcvmspf", 0);
        File dir = context.getDir("pccache", 0);
        iz1.d(dir, false);
        this.a = dir;
        File dir2 = context.getDir("tmppccache", 0);
        iz1.d(dir2, true);
        this.f6447b = dir2;
        this.f6449d = sr2Var;
    }

    static String b(yr2 yr2Var) {
        return com.google.android.gms.common.util.k.a(yr2Var.d().O());
    }

    private final File e() {
        File file = new File(this.a, Integer.toString(this.f6449d.zza()));
        if (!file.exists()) {
            file.mkdir();
        }
        return file;
    }

    private final String f() {
        int iZza = this.f6449d.zza();
        StringBuilder sb = new StringBuilder(17);
        sb.append("FBAMTD");
        sb.append(iZza);
        return sb.toString();
    }

    private final String g() {
        int iZza = this.f6449d.zza();
        StringBuilder sb = new StringBuilder(17);
        sb.append("LATMTD");
        sb.append(iZza);
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:85:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a(com.google.android.gms.internal.ads.vr2 r8, com.google.android.gms.internal.ads.nz1 r9) {
        /*
            Method dump skipped, instructions count: 382
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.hz1.a(com.google.android.gms.internal.ads.vr2, com.google.android.gms.internal.ads.nz1):boolean");
    }

    public final gz1 c(int i2) {
        yr2 yr2VarD = d(1);
        if (yr2VarD == null) {
            return null;
        }
        String strD = yr2VarD.D();
        File fileA = iz1.a(strD, "pcam.jar", e());
        if (!fileA.exists()) {
            fileA = iz1.a(strD, "pcam", e());
        }
        return new gz1(yr2VarD, fileA, iz1.a(strD, "pcbc", e()), iz1.a(strD, "pcopt", e()));
    }

    final yr2 d(int i2) {
        String string = i2 == 1 ? this.f6448c.getString(g(), null) : this.f6448c.getString(f(), null);
        if (!TextUtils.isEmpty(string)) {
            try {
                yr2 yr2VarI = yr2.I(ci2.H(com.google.android.gms.common.util.k.c(string)));
                String strD = yr2VarI.D();
                File fileA = iz1.a(strD, "pcam.jar", e());
                if (!fileA.exists()) {
                    fileA = iz1.a(strD, "pcam", e());
                }
                File fileA2 = iz1.a(strD, "pcbc", e());
                if (fileA.exists()) {
                    if (fileA2.exists()) {
                        return yr2VarI;
                    }
                }
            } catch (qj2 unused) {
            }
        }
        return null;
    }
}