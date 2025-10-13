package com.google.android.play.core.assetpacks;

import java.io.IOException;

/* loaded from: classes.dex */
final /* synthetic */ class q1 implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    private final v f12119e;

    private q1(v vVar) {
        this.f12119e = vVar;
    }

    static Runnable a(v vVar) {
        return new q1(vVar);
    }

    @Override // java.lang.Runnable
    public final void run() throws IOException {
        this.f12119e.F();
    }
}