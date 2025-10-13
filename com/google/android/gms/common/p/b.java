package com.google.android.gms.common.p;

import android.annotation.TargetApi;
import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.os.Binder;
import android.os.Process;
import androidx.annotation.RecentlyNonNull;
import c.h.k.d;
import com.google.android.gms.common.util.n;

/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
/* loaded from: classes.dex */
public class b {

    @RecentlyNonNull
    protected final Context a;

    public b(@RecentlyNonNull Context context) {
        this.a = context;
    }

    public int a(@RecentlyNonNull String str) {
        return this.a.checkCallingOrSelfPermission(str);
    }

    public int b(@RecentlyNonNull String str, @RecentlyNonNull String str2) {
        return this.a.getPackageManager().checkPermission(str, str2);
    }

    @RecentlyNonNull
    public ApplicationInfo c(@RecentlyNonNull String str, int i2) {
        return this.a.getPackageManager().getApplicationInfo(str, i2);
    }

    @RecentlyNonNull
    public CharSequence d(@RecentlyNonNull String str) {
        return this.a.getPackageManager().getApplicationLabel(this.a.getPackageManager().getApplicationInfo(str, 0));
    }

    @RecentlyNonNull
    public d<CharSequence, Drawable> e(@RecentlyNonNull String str) throws PackageManager.NameNotFoundException {
        ApplicationInfo applicationInfo = this.a.getPackageManager().getApplicationInfo(str, 0);
        return d.a(this.a.getPackageManager().getApplicationLabel(applicationInfo), this.a.getPackageManager().getApplicationIcon(applicationInfo));
    }

    @RecentlyNonNull
    public PackageInfo f(@RecentlyNonNull String str, int i2) {
        return this.a.getPackageManager().getPackageInfo(str, i2);
    }

    public boolean g() {
        String nameForUid;
        if (Binder.getCallingUid() == Process.myUid()) {
            return a.a(this.a);
        }
        if (!n.k() || (nameForUid = this.a.getPackageManager().getNameForUid(Binder.getCallingUid())) == null) {
            return false;
        }
        return this.a.getPackageManager().isInstantApp(nameForUid);
    }

    @TargetApi(19)
    public final boolean h(int i2, @RecentlyNonNull String str) {
        if (n.f()) {
            try {
                AppOpsManager appOpsManager = (AppOpsManager) this.a.getSystemService("appops");
                if (appOpsManager == null) {
                    throw new NullPointerException("context.getSystemService(Context.APP_OPS_SERVICE) is null");
                }
                appOpsManager.checkPackage(i2, str);
                return true;
            } catch (SecurityException unused) {
                return false;
            }
        }
        String[] packagesForUid = this.a.getPackageManager().getPackagesForUid(i2);
        if (str != null && packagesForUid != null) {
            for (String str2 : packagesForUid) {
                if (str.equals(str2)) {
                    return true;
                }
            }
        }
        return false;
    }
}