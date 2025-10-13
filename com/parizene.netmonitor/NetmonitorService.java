package com.parizene.netmonitor;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.app.Notification;
import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.os.PowerManager;
import android.util.SparseArray;
import com.parizene.netmonitor.ui.f1;
import com.parizene.netmonitor.ui.p0;

/* loaded from: classes.dex */
public class NetmonitorService extends Service {

    /* renamed from: e, reason: collision with root package name */
    PowerManager f12993e;

    /* renamed from: f, reason: collision with root package name */
    a0 f12994f;

    /* renamed from: g, reason: collision with root package name */
    org.greenrobot.eventbus.c f12995g;

    /* renamed from: h, reason: collision with root package name */
    x f12996h;

    /* renamed from: i, reason: collision with root package name */
    ActivityManager f12997i;

    /* renamed from: j, reason: collision with root package name */
    f.a<com.parizene.netmonitor.m0.z.b> f12998j;

    /* renamed from: k, reason: collision with root package name */
    private PowerManager.WakeLock f12999k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f13000l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f13001m;
    private final a n = new a();

    protected class a extends Binder {
        protected a() {
        }

        protected NetmonitorService a() {
            return NetmonitorService.this;
        }
    }

    @SuppressLint({"WakelockTimeout"})
    private void a() {
        this.f12999k.acquire();
    }

    private Notification b(com.parizene.netmonitor.l0.a aVar, boolean z) {
        String strO;
        String strB;
        int iB = aVar.b();
        SparseArray<c.h.k.d<Integer, com.parizene.netmonitor.db.celllog.i.d>> sparseArrayA = aVar.a();
        int i2 = 0;
        while (true) {
            strO = null;
            if (i2 >= sparseArrayA.size()) {
                return null;
            }
            if (iB == sparseArrayA.keyAt(i2)) {
                int iIntValue = sparseArrayA.valueAt(i2).a.intValue();
                if (z || (iIntValue & 2) > 0 || (iIntValue & 4) > 0) {
                    break;
                }
            }
            i2++;
        }
        String string = getString(c(aVar.c()));
        com.parizene.netmonitor.db.celllog.i.c cVarA = sparseArrayA.valueAt(i2).f3105b.a();
        if (cVarA != null) {
            string = cVarA.q(this, p0.values()[com.parizene.netmonitor.t0.f.f13717b.f().intValue()], com.parizene.netmonitor.t0.f.f13724i.g().booleanValue());
            strB = f1.b(this.f12998j.get(), cVarA.k(), cVarA.e(), cVarA.i());
            if (cVarA.r()) {
                strO = cVarA.o();
            }
        } else {
            strB = null;
        }
        return this.f12994f.a(string, strO, strB);
    }

    private int c(boolean z) {
        return z ? R.string.location_disabled : R.string.notify_no_coverage_title;
    }

    private void d() {
        if (this.f12999k.isHeld()) {
            this.f12999k.release();
        }
    }

    private void e() {
        com.parizene.netmonitor.l0.a aVar = (com.parizene.netmonitor.l0.a) this.f12995g.f(com.parizene.netmonitor.l0.a.class);
        Notification notificationB = aVar != null ? b(aVar, true) : null;
        if (notificationB == null) {
            notificationB = this.f12994f.a(getString(c(aVar != null && aVar.c())), null, null);
        }
        startForeground(100, notificationB);
        if (this.f13001m) {
            return;
        }
        f();
    }

    @SuppressLint({"WakelockTimeout"})
    private void f() {
        this.f13001m = true;
        a();
        this.f12995g.r(this);
    }

    private void g() {
        if (this.f13001m) {
            h();
        }
        stopForeground(true);
        this.f12994f.g(100);
    }

    private void h() {
        d();
        this.f12995g.t(this);
        this.f13001m = false;
    }

    @org.greenrobot.eventbus.m(sticky = true)
    public void on(com.parizene.netmonitor.l0.a aVar) {
        Notification notificationB;
        if (!this.f13000l || (notificationB = b(aVar, false)) == null) {
            return;
        }
        this.f12994f.i(100, notificationB);
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        m.a.a.a("intent=%s", intent);
        g();
        this.f13000l = false;
        return this.n;
    }

    @Override // android.app.Service
    public void onCreate() {
        f.b.a.b(this);
        super.onCreate();
        m.a.a.a("onCreate", new Object[0]);
        this.f12999k = this.f12993e.newWakeLock(1, "Netmonitor:WakeLock");
    }

    @Override // android.app.Service
    public void onDestroy() {
        d();
        if (this.f12995g.k(this)) {
            this.f12995g.t(this);
        }
        super.onDestroy();
        m.a.a.a("onDestroy", new Object[0]);
    }

    @Override // android.app.Service
    public void onRebind(Intent intent) {
        m.a.a.a("intent=%s", intent);
        g();
        this.f13000l = false;
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i2, int i3) {
        m.a.a.a("onStartCommand: intent=%s, flags=%s, startId=%s", intent, Integer.valueOf(i2), Integer.valueOf(i3));
        return 2;
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        m.a.a.a("intent=%s", intent);
        e();
        this.f13000l = true;
        return true;
    }
}