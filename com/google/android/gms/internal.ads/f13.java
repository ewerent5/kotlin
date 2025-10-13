package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class f13 implements Choreographer.FrameCallback, Handler.Callback {

    /* renamed from: e, reason: collision with root package name */
    private static final f13 f5767e = new f13();

    /* renamed from: f, reason: collision with root package name */
    public volatile long f5768f;

    /* renamed from: g, reason: collision with root package name */
    private final Handler f5769g;

    /* renamed from: h, reason: collision with root package name */
    private final HandlerThread f5770h;

    /* renamed from: i, reason: collision with root package name */
    private Choreographer f5771i;

    /* renamed from: j, reason: collision with root package name */
    private int f5772j;

    private f13() {
        HandlerThread handlerThread = new HandlerThread("ChoreographerOwner:Handler");
        this.f5770h = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper(), this);
        this.f5769g = handler;
        handler.sendEmptyMessage(0);
    }

    public static f13 a() {
        return f5767e;
    }

    public final void b() {
        this.f5769g.sendEmptyMessage(1);
    }

    public final void c() {
        this.f5769g.sendEmptyMessage(2);
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j2) {
        this.f5768f = j2;
        this.f5771i.postFrameCallbackDelayed(this, 500L);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i2 = message.what;
        if (i2 == 0) {
            this.f5771i = Choreographer.getInstance();
            return true;
        }
        if (i2 == 1) {
            int i3 = this.f5772j + 1;
            this.f5772j = i3;
            if (i3 == 1) {
                this.f5771i.postFrameCallback(this);
            }
            return true;
        }
        if (i2 != 2) {
            return false;
        }
        int i4 = this.f5772j - 1;
        this.f5772j = i4;
        if (i4 == 0) {
            this.f5771i.removeFrameCallback(this);
            this.f5768f = 0L;
        }
        return true;
    }
}