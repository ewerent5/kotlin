package com.google.firebase.remoteconfig;

/* compiled from: FirebaseRemoteConfigSettings.java */
/* loaded from: classes.dex */
public class l {
    private final long a;

    /* renamed from: b, reason: collision with root package name */
    private final long f12972b;

    /* compiled from: FirebaseRemoteConfigSettings.java */
    public static class b {
        private long a = 60;

        /* renamed from: b, reason: collision with root package name */
        private long f12973b = com.google.firebase.remoteconfig.internal.k.a;

        public l c() {
            return new l(this);
        }

        public b d(long j2) {
            if (j2 >= 0) {
                this.f12973b = j2;
                return this;
            }
            throw new IllegalArgumentException("Minimum interval between fetches has to be a non-negative number. " + j2 + " is an invalid argument");
        }
    }

    public long a() {
        return this.a;
    }

    public long b() {
        return this.f12972b;
    }

    private l(b bVar) {
        this.a = bVar.a;
        this.f12972b = bVar.f12973b;
    }
}