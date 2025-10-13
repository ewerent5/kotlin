package com.google.android.gms.common;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.util.Log;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.p;
import javax.annotation.CheckReturnValue;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
@CheckReturnValue
/* loaded from: classes.dex */
public class k {

    @Nullable
    private static k a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f4763b;

    /* renamed from: c, reason: collision with root package name */
    private volatile String f4764c;

    public k(@RecentlyNonNull Context context) {
        this.f4763b = context.getApplicationContext();
    }

    @RecentlyNonNull
    public static k a(@RecentlyNonNull Context context) {
        p.j(context);
        synchronized (k.class) {
            if (a == null) {
                b0.a(context);
                a = new k(context);
            }
        }
        return a;
    }

    @Nullable
    static final x d(PackageInfo packageInfo, x... xVarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr == null) {
            return null;
        }
        if (signatureArr.length != 1) {
            Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
            return null;
        }
        y yVar = new y(packageInfo.signatures[0].toByteArray());
        for (int i2 = 0; i2 < xVarArr.length; i2++) {
            if (xVarArr[i2].equals(yVar)) {
                return xVarArr[i2];
            }
        }
        return null;
    }

    public static final boolean e(@RecentlyNonNull PackageInfo packageInfo, boolean z) {
        if (packageInfo != null && packageInfo.signatures != null) {
            if ((z ? d(packageInfo, a0.a) : d(packageInfo, a0.a[0])) != null) {
                return true;
            }
        }
        return false;
    }

    @SuppressLint({"PackageManagerGetSignatures"})
    private final l0 f(String str, boolean z, boolean z2) throws PackageManager.NameNotFoundException {
        l0 l0VarD;
        ApplicationInfo applicationInfo;
        if (str == null) {
            return l0.d("null pkg");
        }
        if (str.equals(this.f4764c)) {
            return l0.b();
        }
        if (b0.d()) {
            l0VarD = b0.b(str, j.e(this.f4763b), false, false);
        } else {
            try {
                PackageInfo packageInfo = this.f4763b.getPackageManager().getPackageInfo(str, 64);
                boolean zE = j.e(this.f4763b);
                if (packageInfo == null) {
                    l0VarD = l0.d("null pkg");
                } else {
                    Signature[] signatureArr = packageInfo.signatures;
                    if (signatureArr == null || signatureArr.length != 1) {
                        l0VarD = l0.d("single cert required");
                    } else {
                        y yVar = new y(packageInfo.signatures[0].toByteArray());
                        String str2 = packageInfo.packageName;
                        l0 l0VarC = b0.c(str2, yVar, zE, false);
                        l0VarD = (!l0VarC.f4766b || (applicationInfo = packageInfo.applicationInfo) == null || (applicationInfo.flags & 2) == 0 || !b0.c(str2, yVar, false, true).f4766b) ? l0VarC : l0.d("debuggable release cert app rejected");
                    }
                }
            } catch (PackageManager.NameNotFoundException e2) {
                return l0.e(str.length() != 0 ? "no pkg ".concat(str) : new String("no pkg "), e2);
            }
        }
        if (l0VarD.f4766b) {
            this.f4764c = str;
        }
        return l0VarD;
    }

    public boolean b(@RecentlyNonNull PackageInfo packageInfo) {
        if (packageInfo == null) {
            return false;
        }
        if (e(packageInfo, false)) {
            return true;
        }
        if (e(packageInfo, true)) {
            if (j.e(this.f4763b)) {
                return true;
            }
            Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
        }
        return false;
    }

    public boolean c(int i2) throws PackageManager.NameNotFoundException {
        l0 l0VarD;
        int length;
        String[] packagesForUid = this.f4763b.getPackageManager().getPackagesForUid(i2);
        if (packagesForUid != null && (length = packagesForUid.length) != 0) {
            l0VarD = null;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    p.j(l0VarD);
                    break;
                }
                l0VarD = f(packagesForUid[i3], false, false);
                if (l0VarD.f4766b) {
                    break;
                }
                i3++;
            }
        } else {
            l0VarD = l0.d("no pkgs");
        }
        l0VarD.f();
        return l0VarD.f4766b;
    }
}