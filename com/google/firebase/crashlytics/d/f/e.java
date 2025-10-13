package com.google.firebase.crashlytics.d.f;

import android.os.Bundle;

/* compiled from: CrashlyticsOriginAnalyticsEventLogger.java */
/* loaded from: classes.dex */
public class e implements a {
    private final com.google.firebase.analytics.a.a a;

    public e(com.google.firebase.analytics.a.a aVar) {
        this.a = aVar;
    }

    @Override // com.google.firebase.crashlytics.d.f.a
    public void a(String str, Bundle bundle) {
        this.a.c("clx", str, bundle);
    }
}