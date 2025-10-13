package com.parizene.netmonitor;

import android.app.AlarmManager;
import android.app.Application;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Process;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.AdapterStatus;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.parizene.netmonitor.q0.v0;
import com.parizene.netmonitor.ui.HomeActivity;
import com.parizene.netmonitor.ui.l1;
import java.util.Map;

/* loaded from: classes.dex */
public class App extends Application implements f.b.e {

    /* renamed from: e, reason: collision with root package name */
    SharedPreferences f12984e;

    /* renamed from: f, reason: collision with root package name */
    f.a<a0> f12985f;

    /* renamed from: g, reason: collision with root package name */
    f.a<com.parizene.netmonitor.db.celllog.b> f12986g;

    /* renamed from: h, reason: collision with root package name */
    f.a<org.greenrobot.eventbus.c> f12987h;

    /* renamed from: i, reason: collision with root package name */
    f.a<x> f12988i;

    /* renamed from: j, reason: collision with root package name */
    com.parizene.netmonitor.s0.c.c f12989j;

    /* renamed from: k, reason: collision with root package name */
    f.a<AlarmManager> f12990k;

    /* renamed from: l, reason: collision with root package name */
    com.parizene.netmonitor.l0.c f12991l;

    /* renamed from: m, reason: collision with root package name */
    f.a<Handler> f12992m;
    f.a<Handler> n;
    com.parizene.netmonitor.t0.g o;
    com.google.firebase.remoteconfig.g p;
    f.a<com.google.firebase.crashlytics.c> q;
    f.a<FirebaseAnalytics> r;
    f.a<k> s;
    f.b.c<Object> t;
    com.parizene.netmonitor.foreground.d u;
    l1 v;

    private void b() {
        k.c.b.c cVarA = k.c.b.a.a();
        cVarA.o(this.s.get().c());
        cVarA.m("netmonitor");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void d() {
        this.f12986g.get().a();
    }

    static /* synthetic */ void f(InitializationStatus initializationStatus) {
        Map<String, AdapterStatus> adapterStatusMap;
        if (initializationStatus == null || (adapterStatusMap = initializationStatus.getAdapterStatusMap()) == null) {
            return;
        }
        for (Map.Entry<String, AdapterStatus> entry : adapterStatusMap.entrySet()) {
            m.a.a.a("init [MobileAds]: [%s] description=%s, initializationState=%s, latency=%s", entry.getKey(), entry.getValue().getDescription(), entry.getValue().getInitializationState(), Integer.valueOf(entry.getValue().getLatency()));
        }
    }

    private void h() {
        this.f12991l.b();
    }

    private void j() {
        this.f12991l.c();
    }

    public void a() {
        m.a.a.a("exit()", new Object[0]);
        this.u.b();
        this.f12985f.get().h();
        this.f12992m.get().post(new Runnable() { // from class: com.parizene.netmonitor.c
            @Override // java.lang.Runnable
            public final void run() {
                this.f13006e.d();
            }
        });
        w.c();
        this.f12988i.get().r();
        this.f12989j.c();
        j();
        this.n.get().postDelayed(new Runnable() { // from class: com.parizene.netmonitor.a
            @Override // java.lang.Runnable
            public final void run() {
                Process.killProcess(Process.myPid());
            }
        }, 300L);
    }

    public void i() {
        Intent intent = new Intent();
        intent.setAction("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.LAUNCHER");
        intent.setClass(this, HomeActivity.class);
        this.f12990k.get().set(0, System.currentTimeMillis() + 3000, PendingIntent.getActivity(this, -1, intent, 0));
        a();
    }

    @Override // f.b.e
    public f.b.b<Object> l() {
        return this.t;
    }

    @Override // android.app.Application
    public void onCreate() {
        super.onCreate();
        v0.T().d(this).b().a(this);
        com.parizene.netmonitor.t0.a.e(this.o);
        this.v.a();
        this.q.get().d(true);
        this.r.get().a(true);
        h();
        MobileAds.initialize(this, new OnInitializationCompleteListener() { // from class: com.parizene.netmonitor.b
            @Override // com.google.android.gms.ads.initialization.OnInitializationCompleteListener
            public final void onInitializationComplete(InitializationStatus initializationStatus) {
                App.f(initializationStatus);
            }
        });
        this.f12989j.A();
        this.p.d().b(new e.c.b.b.e.c() { // from class: com.parizene.netmonitor.d
            @Override // e.c.b.b.e.c
            public final void a(e.c.b.b.e.h hVar) {
                m.a.a.a("onComplete: isSuccessful=%s", Boolean.valueOf(hVar.n()));
            }
        });
        b();
        try {
            Class.forName("android.os.AsyncTask");
        } catch (Throwable unused) {
        }
        this.u.a();
    }
}