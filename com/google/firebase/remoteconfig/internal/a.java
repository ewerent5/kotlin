package com.google.firebase.remoteconfig.internal;

import java.util.concurrent.Callable;

/* compiled from: ConfigCacheClient.java */
/* loaded from: classes.dex */
final /* synthetic */ class a implements Callable {
    private final e a;

    /* renamed from: b, reason: collision with root package name */
    private final f f12920b;

    private a(e eVar, f fVar) {
        this.a = eVar;
        this.f12920b = fVar;
    }

    public static Callable a(e eVar, f fVar) {
        return new a(eVar, fVar);
    }

    @Override // java.util.concurrent.Callable
    public Object call() {
        return this.a.f12926d.e(this.f12920b);
    }
}