package com.google.firebase.installations;

import com.google.auto.value.AutoValue;
import com.google.firebase.installations.a;

/* compiled from: com.google.firebase:firebase-installations-interop@@16.0.0 */
@AutoValue
/* loaded from: classes.dex */
public abstract class l {

    /* compiled from: com.google.firebase:firebase-installations-interop@@16.0.0 */
    @AutoValue.Builder
    public static abstract class a {
        public abstract l a();

        public abstract a b(String str);

        public abstract a c(long j2);

        public abstract a d(long j2);
    }

    public static a a() {
        return new a.b();
    }

    public abstract String b();

    public abstract long c();

    public abstract long d();
}