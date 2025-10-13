package com.parizene.netmonitor.q0;

/* compiled from: AppModule_ProvideFirebaseRemoteConfigFactory.java */
/* loaded from: classes3.dex */
public final class d0 implements f.c.c<com.google.firebase.remoteconfig.g> {

    /* compiled from: AppModule_ProvideFirebaseRemoteConfigFactory.java */
    private static final class a {
        private static final d0 a = new d0();
    }

    public static d0 a() {
        return a.a;
    }

    public static com.google.firebase.remoteconfig.g c() {
        return (com.google.firebase.remoteconfig.g) f.c.f.c(t.j(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // h.a.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.google.firebase.remoteconfig.g get() {
        return c();
    }
}