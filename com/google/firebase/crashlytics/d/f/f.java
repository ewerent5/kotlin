package com.google.firebase.crashlytics.d.f;

import android.os.Bundle;

/* compiled from: UnavailableAnalyticsEventLogger.java */
/* loaded from: classes.dex */
public class f implements a {
    @Override // com.google.firebase.crashlytics.d.f.a
    public void a(String str, Bundle bundle) {
        com.google.firebase.crashlytics.d.b.f().b("Skipping logging Crashlytics event to Firebase, no Firebase Analytics");
    }
}