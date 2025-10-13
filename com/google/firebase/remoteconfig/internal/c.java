package com.google.firebase.remoteconfig.internal;

import java.util.concurrent.Callable;

/* compiled from: ConfigCacheClient.java */
/* loaded from: classes.dex */
final /* synthetic */ class c implements Callable {
    private final o a;

    private c(o oVar) {
        this.a = oVar;
    }

    public static Callable a(o oVar) {
        return new c(oVar);
    }

    @Override // java.util.concurrent.Callable
    public Object call() {
        return this.a.d();
    }
}