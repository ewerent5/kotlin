package com.google.android.datatransport.runtime.backends;

import com.google.auto.value.AutoValue;

/* compiled from: BackendResponse.java */
@AutoValue
/* loaded from: classes.dex */
public abstract class g {

    /* compiled from: BackendResponse.java */
    public enum a {
        OK,
        TRANSIENT_ERROR,
        FATAL_ERROR
    }

    public static g a() {
        return new b(a.FATAL_ERROR, -1L);
    }

    public static g d(long j2) {
        return new b(a.OK, j2);
    }

    public static g e() {
        return new b(a.TRANSIENT_ERROR, -1L);
    }

    public abstract long b();

    public abstract a c();
}