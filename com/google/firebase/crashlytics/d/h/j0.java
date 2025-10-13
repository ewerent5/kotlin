package com.google.firebase.crashlytics.d.h;

import java.util.concurrent.CountDownLatch;

/* compiled from: Utils.java */
/* loaded from: classes.dex */
final /* synthetic */ class j0 implements e.c.b.b.e.a {
    private final CountDownLatch a;

    private j0(CountDownLatch countDownLatch) {
        this.a = countDownLatch;
    }

    public static e.c.b.b.e.a b(CountDownLatch countDownLatch) {
        return new j0(countDownLatch);
    }

    @Override // e.c.b.b.e.a
    public Object a(e.c.b.b.e.h hVar) {
        return k0.g(this.a, hVar);
    }
}