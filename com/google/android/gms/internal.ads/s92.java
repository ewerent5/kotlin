package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class s92 {

    @Deprecated
    public static final bf2 a;

    /* renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final bf2 f8847b;

    /* renamed from: c, reason: collision with root package name */
    @Deprecated
    public static final bf2 f8848c;

    static {
        new r92();
        bf2 bf2VarE = bf2.E();
        a = bf2VarE;
        f8847b = bf2VarE;
        f8848c = bf2VarE;
        try {
            a();
        } catch (GeneralSecurityException e2) {
            throw new ExceptionInInitializerError(e2);
        }
    }

    public static void a() {
        f72.c(new r92(), true);
        f72.c(new n92(), true);
        f72.e(new v92());
    }
}