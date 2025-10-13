package com.google.firebase.crashlytics.d.h;

/* compiled from: DataTransportState.java */
/* loaded from: classes.dex */
public enum t {
    NONE,
    JAVA_ONLY,
    ALL;

    static t a(com.google.firebase.crashlytics.d.p.i.b bVar) {
        return b(bVar.f12748h == 2, bVar.f12749i == 2);
    }

    static t b(boolean z, boolean z2) {
        return !z ? NONE : !z2 ? JAVA_ONLY : ALL;
    }
}