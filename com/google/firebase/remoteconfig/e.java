package com.google.firebase.remoteconfig;

import java.util.concurrent.Callable;

/* compiled from: FirebaseRemoteConfig.java */
/* loaded from: classes.dex */
final /* synthetic */ class e implements Callable {
    private final g a;

    /* renamed from: b, reason: collision with root package name */
    private final l f12901b;

    private e(g gVar, l lVar) {
        this.a = gVar;
        this.f12901b = lVar;
    }

    public static Callable a(g gVar, l lVar) {
        return new e(gVar, lVar);
    }

    @Override // java.util.concurrent.Callable
    public Object call() {
        return g.m(this.a, this.f12901b);
    }
}