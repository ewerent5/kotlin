package com.google.firebase.remoteconfig;

import java.util.concurrent.Callable;

/* compiled from: RemoteConfigComponent.java */
/* loaded from: classes.dex */
final /* synthetic */ class m implements Callable {
    private final o a;

    private m(o oVar) {
        this.a = oVar;
    }

    public static Callable a(o oVar) {
        return new m(oVar);
    }

    @Override // java.util.concurrent.Callable
    public Object call() {
        return this.a.d();
    }
}