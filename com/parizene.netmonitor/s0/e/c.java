package com.parizene.netmonitor.s0.e;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiManager;
import android.os.Handler;
import com.parizene.netmonitor.s0.b;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: WifiHelper.java */
/* loaded from: classes3.dex */
public class c extends com.parizene.netmonitor.s0.b<d> {

    /* renamed from: e, reason: collision with root package name */
    private static final long f13704e = TimeUnit.SECONDS.toMillis(5);

    /* renamed from: f, reason: collision with root package name */
    private Context f13705f;

    /* renamed from: g, reason: collision with root package name */
    private WifiManager f13706g;

    /* renamed from: h, reason: collision with root package name */
    private WifiManager.WifiLock f13707h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f13708i;

    /* renamed from: j, reason: collision with root package name */
    private Runnable f13709j;

    /* renamed from: k, reason: collision with root package name */
    private BroadcastReceiver f13710k;

    /* compiled from: WifiHelper.java */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            c.this.f13706g.startScan();
            ((com.parizene.netmonitor.s0.b) c.this).a.postDelayed(this, c.f13704e);
        }
    }

    /* compiled from: WifiHelper.java */
    class b extends BroadcastReceiver {
        b() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            if ("android.net.wifi.SCAN_RESULTS".equals(action)) {
                List<ScanResult> listS = c.this.s();
                m.a.a.a("scanResults=%s", listS);
                c.this.w(listS);
            } else if ("android.net.wifi.WIFI_STATE_CHANGED".equals(action)) {
                int iT = c.this.t();
                m.a.a.a("wifiState=%s", Integer.valueOf(iT));
                c.this.x(iT);
                if (3 == iT) {
                    c.this.z();
                } else if (iT == 0) {
                    c.this.A();
                }
            }
        }
    }

    public c(Context context, WifiManager wifiManager, Handler handler, Handler handler2) {
        super(handler, handler2);
        this.f13708i = false;
        this.f13709j = new a();
        this.f13710k = new b();
        this.f13705f = context;
        this.f13706g = wifiManager;
        this.f13707h = wifiManager.createWifiLock(2, "_WifiLock");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A() {
        if (this.f13708i) {
            this.a.removeCallbacks(this.f13709j);
            if (this.f13707h.isHeld()) {
                this.f13707h.release();
            }
            this.f13708i = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w(final List<ScanResult> list) {
        e(new b.a() { // from class: com.parizene.netmonitor.s0.e.a
            @Override // com.parizene.netmonitor.s0.b.a
            public final void a(Object obj) {
                ((d) obj).o(list);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x(final int i2) {
        e(new b.a() { // from class: com.parizene.netmonitor.s0.e.b
            @Override // com.parizene.netmonitor.s0.b.a
            public final void a(Object obj) {
                ((d) obj).s(i2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z() {
        if (this.f13708i) {
            return;
        }
        this.f13708i = true;
        this.f13707h.acquire();
        this.a.removeCallbacks(this.f13709j);
        this.a.post(this.f13709j);
    }

    @Override // com.parizene.netmonitor.s0.b
    protected void g() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.wifi.SCAN_RESULTS");
        intentFilter.addAction("android.net.wifi.WIFI_STATE_CHANGED");
        this.f13705f.registerReceiver(this.f13710k, intentFilter, null, this.a);
    }

    @Override // com.parizene.netmonitor.s0.b
    protected void h() {
        A();
        this.f13705f.unregisterReceiver(this.f13710k);
    }

    public List<ScanResult> s() {
        return this.f13706g.getScanResults();
    }

    public int t() {
        return this.f13706g.getWifiState();
    }

    public boolean y(boolean z) {
        return this.f13706g.setWifiEnabled(z);
    }
}