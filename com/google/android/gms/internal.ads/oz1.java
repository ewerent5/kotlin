package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import java.io.File;
import java.util.HashSet;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class oz1 {
    private static final Object a = new Object();

    /* renamed from: b */
    private final Context f8042b;

    /* renamed from: c */
    private final SharedPreferences f8043c;

    /* renamed from: d */
    private final String f8044d;

    /* renamed from: e */
    private final vy1 f8045e;

    /* renamed from: f */
    private boolean f8046f;

    public oz1(Context context, sr2 sr2Var, vy1 vy1Var, boolean z) {
        this.f8046f = false;
        this.f8042b = context;
        this.f8044d = Integer.toString(sr2Var.zza());
        this.f8043c = context.getSharedPreferences("pcvmspf", 0);
        this.f8045e = vy1Var;
        this.f8046f = z;
    }

    private final File e(String str) {
        return new File(new File(this.f8042b.getDir("pccache", 0), this.f8044d), str);
    }

    private final String f() {
        String strValueOf = String.valueOf(this.f8044d);
        return strValueOf.length() != 0 ? "FBAMTD".concat(strValueOf) : new String("FBAMTD");
    }

    private final String g() {
        String strValueOf = String.valueOf(this.f8044d);
        return strValueOf.length() != 0 ? "LATMTD".concat(strValueOf) : new String("LATMTD");
    }

    private static String h(vr2 vr2Var) {
        xr2 xr2VarL = yr2.L();
        xr2VarL.q(vr2Var.D().D());
        xr2VarL.r(vr2Var.D().E());
        xr2VarL.t(vr2Var.D().G());
        xr2VarL.u(vr2Var.D().H());
        xr2VarL.s(vr2Var.D().F());
        return com.google.android.gms.common.util.k.a(xr2VarL.n().d().O());
    }

    private final void i(int i2, long j2) {
        vy1 vy1Var = this.f8045e;
        if (vy1Var != null) {
            vy1Var.zza(i2, j2);
        }
    }

    private final void j(int i2, long j2, String str) {
        vy1 vy1Var = this.f8045e;
        if (vy1Var != null) {
            vy1Var.zzb(i2, j2, str);
        }
    }

    private final yr2 k(int i2) {
        String string = i2 == 1 ? this.f8043c.getString(g(), null) : this.f8043c.getString(f(), null);
        if (string == null) {
            return null;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            return yr2.J(ci2.H(com.google.android.gms.common.util.k.c(string)), this.f8046f ? qi2.a() : qi2.b());
        } catch (qj2 unused) {
            return null;
        } catch (NullPointerException unused2) {
            i(2029, jCurrentTimeMillis);
            return null;
        } catch (RuntimeException unused3) {
            i(2032, jCurrentTimeMillis);
            return null;
        }
    }

    public final boolean a(vr2 vr2Var, nz1 nz1Var) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (a) {
            yr2 yr2VarK = k(1);
            String strD = vr2Var.D().D();
            if (yr2VarK != null && yr2VarK.D().equals(strD)) {
                i(4014, jCurrentTimeMillis);
                return false;
            }
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            File fileE = e(strD);
            if (fileE.exists()) {
                String str = true != fileE.isDirectory() ? "0" : "1";
                String str2 = true != fileE.isFile() ? "0" : "1";
                StringBuilder sb = new StringBuilder(str.length() + 5 + str2.length());
                sb.append("d:");
                sb.append(str);
                sb.append(",f:");
                sb.append(str2);
                j(4023, jCurrentTimeMillis2, sb.toString());
                i(4015, jCurrentTimeMillis2);
            } else if (!fileE.mkdirs()) {
                String str3 = true != fileE.canWrite() ? "0" : "1";
                j(4024, jCurrentTimeMillis2, str3.length() != 0 ? "cw:".concat(str3) : new String("cw:"));
                i(4015, jCurrentTimeMillis2);
                return false;
            }
            File fileE2 = e(strD);
            File file = new File(fileE2, "pcam.jar");
            File file2 = new File(fileE2, "pcbc");
            if (!iz1.b(file, vr2Var.E().O())) {
                i(4016, jCurrentTimeMillis);
                return false;
            }
            if (!iz1.b(file2, vr2Var.F().O())) {
                i(4017, jCurrentTimeMillis);
                return false;
            }
            if (nz1Var != null && !nz1Var.a(file)) {
                i(4018, jCurrentTimeMillis);
                iz1.e(fileE2);
                return false;
            }
            String strH = h(vr2Var);
            long jCurrentTimeMillis3 = System.currentTimeMillis();
            String string = this.f8043c.getString(g(), null);
            SharedPreferences.Editor editorEdit = this.f8043c.edit();
            editorEdit.putString(g(), strH);
            if (string != null) {
                editorEdit.putString(f(), string);
            }
            if (!editorEdit.commit()) {
                i(4019, jCurrentTimeMillis3);
                return false;
            }
            HashSet hashSet = new HashSet();
            yr2 yr2VarK2 = k(1);
            if (yr2VarK2 != null) {
                hashSet.add(yr2VarK2.D());
            }
            yr2 yr2VarK3 = k(2);
            if (yr2VarK3 != null) {
                hashSet.add(yr2VarK3.D());
            }
            for (File file3 : new File(this.f8042b.getDir("pccache", 0), this.f8044d).listFiles()) {
                if (!hashSet.contains(file3.getName())) {
                    iz1.e(file3);
                }
            }
            i(5014, jCurrentTimeMillis);
            return true;
        }
    }

    public final boolean b(vr2 vr2Var) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (a) {
            if (!iz1.b(new File(e(vr2Var.D().D()), "pcbc"), vr2Var.F().O())) {
                i(4020, jCurrentTimeMillis);
                return false;
            }
            String strH = h(vr2Var);
            SharedPreferences.Editor editorEdit = this.f8043c.edit();
            editorEdit.putString(g(), strH);
            boolean zCommit = editorEdit.commit();
            if (zCommit) {
                i(5015, jCurrentTimeMillis);
            } else {
                i(4021, jCurrentTimeMillis);
            }
            return zCommit;
        }
    }

    public final gz1 c(int i2) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (a) {
            yr2 yr2VarK = k(1);
            if (yr2VarK == null) {
                i(4022, jCurrentTimeMillis);
                return null;
            }
            File fileE = e(yr2VarK.D());
            File file = new File(fileE, "pcam.jar");
            if (!file.exists()) {
                file = new File(fileE, "pcam");
            }
            File file2 = new File(fileE, "pcbc");
            File file3 = new File(fileE, "pcopt");
            i(5016, jCurrentTimeMillis);
            return new gz1(yr2VarK, file, file2, file3);
        }
    }

    public final boolean d(int i2) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (a) {
            yr2 yr2VarK = k(1);
            if (yr2VarK == null) {
                i(4025, jCurrentTimeMillis);
                return false;
            }
            File fileE = e(yr2VarK.D());
            if (!new File(fileE, "pcam.jar").exists()) {
                i(4026, jCurrentTimeMillis);
                return false;
            }
            if (new File(fileE, "pcbc").exists()) {
                i(5019, jCurrentTimeMillis);
                return true;
            }
            i(4027, jCurrentTimeMillis);
            return false;
        }
    }
}