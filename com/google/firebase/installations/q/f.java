package com.google.firebase.installations.q;

import com.google.auto.value.AutoValue;
import com.google.firebase.installations.q.b;

/* compiled from: TokenResult.java */
@AutoValue
/* loaded from: classes.dex */
public abstract class f {

    /* compiled from: TokenResult.java */
    @AutoValue.Builder
    public static abstract class a {
        public abstract f a();

        public abstract a b(b bVar);

        public abstract a c(String str);

        public abstract a d(long j2);
    }

    /* compiled from: TokenResult.java */
    public enum b {
        OK,
        BAD_CONFIG,
        AUTH_ERROR
    }

    public static a a() {
        return new b.C0154b().d(0L);
    }

    public abstract b b();

    public abstract String c();

    public abstract long d();
}