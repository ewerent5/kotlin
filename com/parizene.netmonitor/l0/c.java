package com.parizene.netmonitor.l0;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/* compiled from: ConnectivityStateChangedReceiver.java */
/* loaded from: classes.dex */
public class c extends BroadcastReceiver {
    private Context a;

    /* renamed from: b, reason: collision with root package name */
    private org.greenrobot.eventbus.c f13214b;

    /* renamed from: c, reason: collision with root package name */
    private ConnectivityManager f13215c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f13216d;

    public c(Context context, org.greenrobot.eventbus.c cVar, ConnectivityManager connectivityManager) {
        this.a = context;
        this.f13214b = cVar;
        this.f13215c = connectivityManager;
        boolean zA = a();
        this.f13216d = zA;
        this.f13214b.p(new b(zA));
    }

    private boolean a() {
        NetworkInfo activeNetworkInfo = this.f13215c.getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public void b() {
        this.a.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    public void c() {
        this.a.unregisterReceiver(this);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        boolean zA = a();
        if (this.f13216d != zA) {
            this.f13216d = zA;
            this.f13214b.p(new b(zA));
        }
    }
}