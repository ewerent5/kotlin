package com.google.android.datatransport.runtime.backends;

import com.google.android.datatransport.runtime.backends.a;
import com.google.auto.value.AutoValue;

/* compiled from: BackendRequest.java */
@AutoValue
/* loaded from: classes.dex */
public abstract class f {

    /* compiled from: BackendRequest.java */
    @AutoValue.Builder
    public static abstract class a {
        public abstract f a();

        public abstract a b(Iterable<e.c.b.a.i.h> iterable);

        public abstract a c(byte[] bArr);
    }

    public static a a() {
        return new a.b();
    }

    public abstract Iterable<e.c.b.a.i.h> b();

    public abstract byte[] c();
}