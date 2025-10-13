package com.parizene.netmonitor.q0;

/* compiled from: AppModule_ProvideFirebaseCrashlyticsFactory.java */
/* loaded from: classes3.dex */
public final class c0 implements f.c.c<com.google.firebase.crashlytics.c> {

    /* compiled from: AppModule_ProvideFirebaseCrashlyticsFactory.java */
    private static final class a {
        private static final c0 a = new c0();
    }

    public static c0 a() {
        return a.a;
    }

    public static com.google.firebase.crashlytics.c c() {
        return (com.google.firebase.crashlytics.c) f.c.f.c(t.i(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // h.a.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.google.firebase.crashlytics.c get() {
        return c();
    }
}