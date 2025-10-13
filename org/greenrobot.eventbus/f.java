package org.greenrobot.eventbus;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;

/* compiled from: HandlerPoster.java */
/* loaded from: classes3.dex */
public class f extends Handler implements l {

    /* renamed from: e, reason: collision with root package name */
    private final k f17226e;

    /* renamed from: f, reason: collision with root package name */
    private final int f17227f;

    /* renamed from: g, reason: collision with root package name */
    private final c f17228g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f17229h;

    protected f(c cVar, Looper looper, int i2) {
        super(looper);
        this.f17228g = cVar;
        this.f17227f = i2;
        this.f17226e = new k();
    }

    @Override // org.greenrobot.eventbus.l
    public void a(q qVar, Object obj) {
        j jVarA = j.a(qVar, obj);
        synchronized (this) {
            this.f17226e.a(jVarA);
            if (!this.f17229h) {
                this.f17229h = true;
                if (!sendMessage(obtainMessage())) {
                    throw new e("Could not send handler message");
                }
            }
        }
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        try {
            long jUptimeMillis = SystemClock.uptimeMillis();
            do {
                j jVarB = this.f17226e.b();
                if (jVarB == null) {
                    synchronized (this) {
                        jVarB = this.f17226e.b();
                        if (jVarB == null) {
                            this.f17229h = false;
                            return;
                        }
                    }
                }
                this.f17228g.h(jVarB);
            } while (SystemClock.uptimeMillis() - jUptimeMillis < this.f17227f);
            if (!sendMessage(obtainMessage())) {
                throw new e("Could not send handler message");
            }
            this.f17229h = true;
        } finally {
            this.f17229h = false;
        }
    }
}