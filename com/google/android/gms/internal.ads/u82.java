package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class u82 {
    public static final String a;

    /* renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final bf2 f9405b;

    /* renamed from: c, reason: collision with root package name */
    @Deprecated
    public static final bf2 f9406c;

    static {
        new t82();
        a = "type.googleapis.com/google.crypto.tink.AesSivKey";
        f9405b = bf2.E();
        f9406c = bf2.E();
        try {
            f72.c(new t82(), true);
            f72.e(new w82());
        } catch (GeneralSecurityException e2) {
            throw new ExceptionInInitializerError(e2);
        }
    }
}