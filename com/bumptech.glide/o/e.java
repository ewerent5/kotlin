package com.bumptech.glide.o;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;
import com.bumptech.glide.o.c;

/* compiled from: DefaultConnectivityMonitor.java */
/* loaded from: classes.dex */
final class e implements c {

    /* renamed from: e, reason: collision with root package name */
    private final Context f4138e;

    /* renamed from: f, reason: collision with root package name */
    final c.a f4139f;

    /* renamed from: g, reason: collision with root package name */
    boolean f4140g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f4141h;

    /* renamed from: i, reason: collision with root package name */
    private final BroadcastReceiver f4142i = new a();

    /* compiled from: DefaultConnectivityMonitor.java */
    class a extends BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            e eVar = e.this;
            boolean z = eVar.f4140g;
            eVar.f4140g = eVar.j(context);
            if (z != e.this.f4140g) {
                if (Log.isLoggable("ConnectivityMonitor", 3)) {
                    Log.d("ConnectivityMonitor", "connectivity changed, isConnected: " + e.this.f4140g);
                }
                e eVar2 = e.this;
                eVar2.f4139f.a(eVar2.f4140g);
            }
        }
    }

    e(Context context, c.a aVar) {
        this.f4138e = context.getApplicationContext();
        this.f4139f = aVar;
    }

    private void k() {
        if (this.f4141h) {
            return;
        }
        this.f4140g = j(this.f4138e);
        try {
            this.f4138e.registerReceiver(this.f4142i, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            this.f4141h = true;
        } catch (SecurityException e2) {
            if (Log.isLoggable("ConnectivityMonitor", 5)) {
                Log.w("ConnectivityMonitor", "Failed to register", e2);
            }
        }
    }

    private void m() {
        if (this.f4141h) {
            this.f4138e.unregisterReceiver(this.f4142i);
            this.f4141h = false;
        }
    }

    @Override // com.bumptech.glide.o.m
    public void h() {
        k();
    }

    @SuppressLint({"MissingPermission"})
    boolean j(Context context) {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) com.bumptech.glide.t.j.d((ConnectivityManager) context.getSystemService("connectivity"))).getActiveNetworkInfo();
            return activeNetworkInfo != null && activeNetworkInfo.isConnected();
        } catch (RuntimeException e2) {
            if (Log.isLoggable("ConnectivityMonitor", 5)) {
                Log.w("ConnectivityMonitor", "Failed to determine connectivity status when connectivity changed", e2);
            }
            return true;
        }
    }

    @Override // com.bumptech.glide.o.m
    public void l() {
        m();
    }

    @Override // com.bumptech.glide.o.m
    public void onDestroy() {
    }
}