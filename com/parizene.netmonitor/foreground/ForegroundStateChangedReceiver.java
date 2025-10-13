package com.parizene.netmonitor.foreground;

import androidx.lifecycle.g;
import androidx.lifecycle.j;
import androidx.lifecycle.k;
import androidx.lifecycle.s;

/* compiled from: ForegroundStateChangedReceiver.kt */
/* loaded from: classes3.dex */
public final class ForegroundStateChangedReceiver extends a implements j {

    /* renamed from: g, reason: collision with root package name */
    private final k f13184g;

    @Override // com.parizene.netmonitor.foreground.a
    public void h() {
        this.f13184g.i().a(this);
    }

    @Override // com.parizene.netmonitor.foreground.a
    public void j() {
        this.f13184g.i().c(this);
    }

    @s(g.b.ON_START)
    public final void onStart() {
        i(b.FOREGROUND);
    }

    @s(g.b.ON_STOP)
    public final void onStop() {
        i(b.BACKGROUND);
    }
}