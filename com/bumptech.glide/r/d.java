package com.bumptech.glide.r;

/* compiled from: RequestCoordinator.java */
/* loaded from: classes.dex */
public interface d {

    /* compiled from: RequestCoordinator.java */
    public enum a {
        RUNNING(false),
        PAUSED(false),
        CLEARED(false),
        SUCCESS(true),
        FAILED(true);


        /* renamed from: k, reason: collision with root package name */
        private final boolean f4189k;

        a(boolean z) {
            this.f4189k = z;
        }

        boolean a() {
            return this.f4189k;
        }
    }

    void a(c cVar);

    boolean b();

    d c();

    boolean f(c cVar);

    boolean h(c cVar);

    void j(c cVar);

    boolean l(c cVar);
}