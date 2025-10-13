package com.google.firebase.crashlytics;

import com.google.firebase.components.e;
import com.google.firebase.components.g;

/* compiled from: CrashlyticsRegistrar.java */
/* loaded from: classes.dex */
final /* synthetic */ class b implements g {
    private final CrashlyticsRegistrar a;

    private b(CrashlyticsRegistrar crashlyticsRegistrar) {
        this.a = crashlyticsRegistrar;
    }

    public static g b(CrashlyticsRegistrar crashlyticsRegistrar) {
        return new b(crashlyticsRegistrar);
    }

    @Override // com.google.firebase.components.g
    public Object a(e eVar) {
        return this.a.b(eVar);
    }
}