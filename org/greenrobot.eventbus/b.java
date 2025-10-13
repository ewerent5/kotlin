package org.greenrobot.eventbus;

import ch.qos.logback.core.CoreConstants;
import java.util.logging.Level;

/* compiled from: BackgroundPoster.java */
/* loaded from: classes3.dex */
final class b implements Runnable, l {

    /* renamed from: e */
    private final k f17194e = new k();

    /* renamed from: f */
    private final c f17195f;

    /* renamed from: g */
    private volatile boolean f17196g;

    b(c cVar) {
        this.f17195f = cVar;
    }

    @Override // org.greenrobot.eventbus.l
    public void a(q qVar, Object obj) {
        j jVarA = j.a(qVar, obj);
        synchronized (this) {
            this.f17194e.a(jVarA);
            if (!this.f17196g) {
                this.f17196g = true;
                this.f17195f.d().execute(this);
            }
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        while (true) {
            try {
                j jVarC = this.f17194e.c(CoreConstants.MILLIS_IN_ONE_SECOND);
                if (jVarC == null) {
                    synchronized (this) {
                        jVarC = this.f17194e.b();
                        if (jVarC == null) {
                            return;
                        }
                    }
                }
                this.f17195f.h(jVarC);
            } catch (InterruptedException e2) {
                this.f17195f.e().b(Level.WARNING, Thread.currentThread().getName() + " was interruppted", e2);
                return;
            } finally {
                this.f17196g = false;
            }
        }
    }
}