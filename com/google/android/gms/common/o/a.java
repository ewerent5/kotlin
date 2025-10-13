package com.google.android.gms.common.o;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.util.Log;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.a1;
import com.google.android.gms.common.internal.p;
import com.google.android.gms.common.p.c;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.NoSuchElementException;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
/* loaded from: classes.dex */
public class a {
    private static final Object a = new Object();

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    private static volatile a f4769b;

    /* renamed from: c, reason: collision with root package name */
    @RecentlyNonNull
    public ConcurrentHashMap<ServiceConnection, ServiceConnection> f4770c = new ConcurrentHashMap<>();

    private a() {
    }

    @RecentlyNonNull
    public static a b() {
        if (f4769b == null) {
            synchronized (a) {
                if (f4769b == null) {
                    f4769b = new a();
                }
            }
        }
        a aVar = f4769b;
        p.j(aVar);
        return aVar;
    }

    @SuppressLint({"UntrackedBindService"})
    private final boolean e(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i2, boolean z) {
        ComponentName component = intent.getComponent();
        if (component != null) {
            String packageName = component.getPackageName();
            "com.google.android.gms".equals(packageName);
            try {
                if ((c.a(context).c(packageName, 0).flags & 2097152) != 0) {
                    Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
                    return false;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        if (!f(serviceConnection)) {
            return context.bindService(intent, serviceConnection, i2);
        }
        ServiceConnection serviceConnection2 = (ServiceConnection) this.f4770c.putIfAbsent(serviceConnection, serviceConnection);
        if (serviceConnection2 != null && serviceConnection != serviceConnection2) {
            Log.w("ConnectionTracker", String.format("Duplicate binding with the same ServiceConnection: %s, %s, %s.", serviceConnection, str, intent.getAction()));
        }
        try {
            boolean zBindService = context.bindService(intent, serviceConnection, i2);
            if (zBindService) {
                return zBindService;
            }
            return false;
        } finally {
            this.f4770c.remove(serviceConnection, serviceConnection);
        }
    }

    private static boolean f(ServiceConnection serviceConnection) {
        return !(serviceConnection instanceof a1);
    }

    @SuppressLint({"UntrackedBindService"})
    private static void g(Context context, ServiceConnection serviceConnection) {
        try {
            context.unbindService(serviceConnection);
        } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused) {
        }
    }

    public boolean a(@RecentlyNonNull Context context, @RecentlyNonNull Intent intent, @RecentlyNonNull ServiceConnection serviceConnection, int i2) {
        return e(context, context.getClass().getName(), intent, serviceConnection, i2, true);
    }

    @SuppressLint({"UntrackedBindService"})
    public void c(@RecentlyNonNull Context context, @RecentlyNonNull ServiceConnection serviceConnection) {
        if (!f(serviceConnection) || !this.f4770c.containsKey(serviceConnection)) {
            g(context, serviceConnection);
            return;
        }
        try {
            g(context, (ServiceConnection) this.f4770c.get(serviceConnection));
        } finally {
            this.f4770c.remove(serviceConnection);
        }
    }

    public final boolean d(@RecentlyNonNull Context context, @RecentlyNonNull String str, @RecentlyNonNull Intent intent, @RecentlyNonNull ServiceConnection serviceConnection, int i2) {
        return e(context, str, intent, serviceConnection, i2, true);
    }
}