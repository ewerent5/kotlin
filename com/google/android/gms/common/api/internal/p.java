package com.google.android.gms.common.api.internal;

/* loaded from: classes.dex */
final class p implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ o f4604e;

    p(o oVar) {
        this.f4604e = oVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f4604e.a.f4572f.disconnect();
    }
}