package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class h72 {
    public static final String a;

    /* renamed from: b, reason: collision with root package name */
    public static final String f6303b;

    /* renamed from: c, reason: collision with root package name */
    @Deprecated
    public static final bf2 f6304c;

    /* renamed from: d, reason: collision with root package name */
    @Deprecated
    public static final bf2 f6305d;

    /* renamed from: e, reason: collision with root package name */
    @Deprecated
    public static final bf2 f6306e;

    static {
        new o72();
        a = "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";
        new x72();
        f6303b = "type.googleapis.com/google.crypto.tink.AesGcmKey";
        new a82();
        new u72();
        new g82();
        new k82();
        new d82();
        new o82();
        bf2 bf2VarE = bf2.E();
        f6304c = bf2VarE;
        f6305d = bf2VarE;
        f6306e = bf2VarE;
        try {
            a();
        } catch (GeneralSecurityException e2) {
            throw new ExceptionInInitializerError(e2);
        }
    }

    public static void a() {
        s92.a();
        f72.c(new o72(), true);
        f72.c(new u72(), true);
        f72.c(new x72(), true);
        a82.j(true);
        f72.c(new d82(), true);
        f72.c(new g82(), true);
        f72.c(new k82(), true);
        f72.c(new o82(), true);
        f72.e(new k72());
    }
}