package androidx.work.impl.background.systemalarm;

import android.content.Intent;
import androidx.lifecycle.n;
import androidx.work.h;
import androidx.work.impl.background.systemalarm.e;
import androidx.work.impl.utils.i;

/* loaded from: classes.dex */
public class SystemAlarmService extends n implements e.c {

    /* renamed from: f, reason: collision with root package name */
    private static final String f2143f = h.f("SystemAlarmService");

    /* renamed from: g, reason: collision with root package name */
    private e f2144g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f2145h;

    private void b() {
        e eVar = new e(this);
        this.f2144g = eVar;
        eVar.m(this);
    }

    @Override // androidx.work.impl.background.systemalarm.e.c
    public void a() {
        this.f2145h = true;
        h.c().a(f2143f, "All commands completed in dispatcher", new Throwable[0]);
        i.a();
        stopSelf();
    }

    @Override // androidx.lifecycle.n, android.app.Service
    public void onCreate() {
        super.onCreate();
        b();
        this.f2145h = false;
    }

    @Override // androidx.lifecycle.n, android.app.Service
    public void onDestroy() {
        super.onDestroy();
        this.f2145h = true;
        this.f2144g.j();
    }

    @Override // androidx.lifecycle.n, android.app.Service
    public int onStartCommand(Intent intent, int i2, int i3) {
        super.onStartCommand(intent, i2, i3);
        if (this.f2145h) {
            h.c().d(f2143f, "Re-initializing SystemAlarmDispatcher after a request to shut-down.", new Throwable[0]);
            this.f2144g.j();
            b();
            this.f2145h = false;
        }
        if (intent == null) {
            return 3;
        }
        this.f2144g.a(intent, i3);
        return 3;
    }
}