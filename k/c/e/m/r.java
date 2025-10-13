package k.c.e.m;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;

/* compiled from: NetworkAvailabliltyCheck.java */
/* loaded from: classes3.dex */
public class r implements h {
    private final ConnectivityManager a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f16662b = "Android-x86".equalsIgnoreCase(Build.BRAND);

    /* renamed from: c, reason: collision with root package name */
    private final boolean f16663c;

    public r(Context context) {
        this.a = (ConnectivityManager) context.getSystemService("connectivity");
        this.f16663c = context.getPackageManager().checkPermission("android.permission.ACCESS_NETWORK_STATE", context.getPackageName()) == 0;
    }

    @Override // k.c.e.m.h
    public boolean a() {
        if (!this.f16663c) {
            return true;
        }
        NetworkInfo activeNetworkInfo = this.a.getActiveNetworkInfo();
        if (activeNetworkInfo == null) {
            return false;
        }
        if (activeNetworkInfo.isConnected()) {
            return true;
        }
        return Build.VERSION.SDK_INT > 13 && this.f16662b && activeNetworkInfo.getType() == 9;
    }
}