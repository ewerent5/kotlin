package androidx.work.impl.k.f;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import androidx.work.h;

/* compiled from: NetworkStateTracker.java */
/* loaded from: classes.dex */
public class e extends d<androidx.work.impl.k.b> {

    /* renamed from: g, reason: collision with root package name */
    static final String f2281g = h.f("NetworkStateTracker");

    /* renamed from: h, reason: collision with root package name */
    private final ConnectivityManager f2282h;

    /* renamed from: i, reason: collision with root package name */
    private b f2283i;

    /* renamed from: j, reason: collision with root package name */
    private a f2284j;

    /* compiled from: NetworkStateTracker.java */
    private class a extends BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null || intent.getAction() == null || !intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE")) {
                return;
            }
            h.c().a(e.f2281g, "Network broadcast received", new Throwable[0]);
            e eVar = e.this;
            eVar.d(eVar.g());
        }
    }

    /* compiled from: NetworkStateTracker.java */
    private class b extends ConnectivityManager.NetworkCallback {
        b() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            h.c().a(e.f2281g, String.format("Network capabilities changed: %s", networkCapabilities), new Throwable[0]);
            e eVar = e.this;
            eVar.d(eVar.g());
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            h.c().a(e.f2281g, "Network connection lost", new Throwable[0]);
            e eVar = e.this;
            eVar.d(eVar.g());
        }
    }

    public e(Context context, androidx.work.impl.utils.k.a aVar) {
        super(context, aVar);
        this.f2282h = (ConnectivityManager) this.f2275c.getSystemService("connectivity");
        if (j()) {
            this.f2283i = new b();
        } else {
            this.f2284j = new a();
        }
    }

    private boolean i() {
        if (Build.VERSION.SDK_INT < 23) {
            return false;
        }
        NetworkCapabilities networkCapabilities = this.f2282h.getNetworkCapabilities(this.f2282h.getActiveNetwork());
        return networkCapabilities != null && networkCapabilities.hasCapability(16);
    }

    private static boolean j() {
        return Build.VERSION.SDK_INT >= 24;
    }

    @Override // androidx.work.impl.k.f.d
    public void e() {
        if (j()) {
            h.c().a(f2281g, "Registering network callback", new Throwable[0]);
            this.f2282h.registerDefaultNetworkCallback(this.f2283i);
        } else {
            h.c().a(f2281g, "Registering broadcast receiver", new Throwable[0]);
            this.f2275c.registerReceiver(this.f2284j, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }
    }

    @Override // androidx.work.impl.k.f.d
    public void f() {
        if (!j()) {
            h.c().a(f2281g, "Unregistering broadcast receiver", new Throwable[0]);
            this.f2275c.unregisterReceiver(this.f2284j);
            return;
        }
        try {
            h.c().a(f2281g, "Unregistering network callback", new Throwable[0]);
            this.f2282h.unregisterNetworkCallback(this.f2283i);
        } catch (IllegalArgumentException e2) {
            h.c().b(f2281g, "Received exception while unregistering network callback", e2);
        }
    }

    androidx.work.impl.k.b g() {
        NetworkInfo activeNetworkInfo = this.f2282h.getActiveNetworkInfo();
        return new androidx.work.impl.k.b(activeNetworkInfo != null && activeNetworkInfo.isConnected(), i(), c.h.g.a.a(this.f2282h), (activeNetworkInfo == null || activeNetworkInfo.isRoaming()) ? false : true);
    }

    @Override // androidx.work.impl.k.f.d
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public androidx.work.impl.k.b b() {
        return g();
    }
}