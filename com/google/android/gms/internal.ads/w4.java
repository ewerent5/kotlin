package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.MotionEvent;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class w4 {
    private MotionEvent a = MotionEvent.obtain(0, 0, 1, 0.0f, 0.0f, 0);

    /* renamed from: b, reason: collision with root package name */
    private MotionEvent f9879b = MotionEvent.obtain(0, 0, 0, 0.0f, 0.0f, 0);

    /* renamed from: c, reason: collision with root package name */
    private final Context f9880c;

    /* renamed from: d, reason: collision with root package name */
    private final ScheduledExecutorService f9881d;

    /* renamed from: e, reason: collision with root package name */
    private final y4 f9882e;

    public w4(Context context, ScheduledExecutorService scheduledExecutorService, y4 y4Var, byte[] bArr) {
        this.f9880c = context;
        this.f9881d = scheduledExecutorService;
        this.f9882e = y4Var;
    }

    public final void a(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1 && motionEvent.getEventTime() > this.a.getEventTime()) {
            this.a = MotionEvent.obtain(motionEvent);
        } else {
            if (motionEvent.getAction() != 0 || motionEvent.getEventTime() <= this.f9879b.getEventTime()) {
                return;
            }
            this.f9879b = MotionEvent.obtain(motionEvent);
        }
    }

    public final g52<String> b() {
        return (p42) y42.g(p42.D(y42.a(null)), k5.f6958c.e().longValue(), TimeUnit.MILLISECONDS, this.f9881d);
    }
}