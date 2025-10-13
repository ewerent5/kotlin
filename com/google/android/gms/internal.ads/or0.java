package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final /* synthetic */ class or0 implements View.OnTouchListener {

    /* renamed from: e */
    private final ur0 f8005e;

    or0(ur0 ur0Var) {
        this.f8005e = ur0Var;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        this.f8005e.c(view, motionEvent);
        return false;
    }
}