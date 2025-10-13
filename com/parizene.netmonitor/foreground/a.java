package com.parizene.netmonitor.foreground;

import i.y.d.l;

/* compiled from: BaseForegroundStateChangedReceiver.kt */
/* loaded from: classes3.dex */
public abstract class a {

    /* renamed from: e, reason: collision with root package name */
    private final org.greenrobot.eventbus.c f13185e;

    /* renamed from: f, reason: collision with root package name */
    private b f13186f;

    protected a(org.greenrobot.eventbus.c cVar) {
        l.d(cVar, "eventBus");
        this.f13185e = cVar;
    }

    public abstract void h();

    protected final void i(b bVar) {
        l.d(bVar, "newForegroundState");
        m.a.a.a("%s => %s", this.f13186f, bVar);
        if (this.f13186f != bVar) {
            this.f13186f = bVar;
            if (bVar == null) {
                return;
            }
            this.f13185e.p(new c(bVar));
        }
    }

    public abstract void j();
}