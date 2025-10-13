package com.parizene.netmonitor;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import com.parizene.netmonitor.NetmonitorService;
import org.greenrobot.eventbus.ThreadMode;

/* compiled from: ServiceStarter.kt */
/* loaded from: classes.dex */
public final class d0 {
    private final Context a;

    /* renamed from: b, reason: collision with root package name */
    private final org.greenrobot.eventbus.c f13019b;

    /* renamed from: c, reason: collision with root package name */
    private NetmonitorService f13020c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f13021d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f13022e;

    /* renamed from: f, reason: collision with root package name */
    private final ServiceConnection f13023f;

    /* compiled from: ServiceStarter.kt */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[com.parizene.netmonitor.foreground.b.values().length];
            iArr[com.parizene.netmonitor.foreground.b.BACKGROUND.ordinal()] = 1;
            iArr[com.parizene.netmonitor.foreground.b.FOREGROUND.ordinal()] = 2;
            a = iArr;
        }
    }

    /* compiled from: ServiceStarter.kt */
    public static final class b implements ServiceConnection {
        b() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            i.y.d.l.d(componentName, Action.NAME_ATTRIBUTE);
            i.y.d.l.d(iBinder, "service");
            m.a.a.a("name=%s, service=%s", componentName, iBinder);
            d0.this.f13020c = ((NetmonitorService.a) iBinder).a();
            d0.this.f13021d = true;
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            i.y.d.l.d(componentName, Action.NAME_ATTRIBUTE);
            m.a.a.a("name=%s", componentName);
            d0.this.f13020c = null;
            d0.this.f13021d = false;
        }
    }

    public d0(Context context, org.greenrobot.eventbus.c cVar) {
        i.y.d.l.d(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        i.y.d.l.d(cVar, "eventBus");
        this.a = context;
        this.f13019b = cVar;
        this.f13023f = new b();
    }

    private final void d() {
        if (this.f13021d) {
            this.a.unbindService(this.f13023f);
            this.f13021d = false;
        }
    }

    public final void c() {
        this.f13019b.r(this);
    }

    public final void e() {
        this.f13019b.t(this);
        d();
        this.a.stopService(new Intent(this.a, (Class<?>) NetmonitorService.class));
    }

    @org.greenrobot.eventbus.m(sticky = true, threadMode = ThreadMode.MAIN)
    public final void on(com.parizene.netmonitor.foreground.c cVar) {
        i.y.d.l.d(cVar, "event");
        com.parizene.netmonitor.foreground.b bVarA = cVar.a();
        m.a.a.a("foregroundState=%s", bVarA);
        int i2 = a.a[bVarA.ordinal()];
        if (i2 == 1) {
            d();
            return;
        }
        if (i2 != 2) {
            return;
        }
        this.a.bindService(new Intent(this.a, (Class<?>) NetmonitorService.class), this.f13023f, 1);
        if (this.f13022e) {
            return;
        }
        this.f13022e = true;
        this.a.startService(new Intent(this.a, (Class<?>) NetmonitorService.class));
    }
}