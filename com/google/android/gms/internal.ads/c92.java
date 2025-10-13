package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class c92 {

    @Deprecated
    public static final bf2 a;

    /* renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final bf2 f5300b;

    /* renamed from: c, reason: collision with root package name */
    @Deprecated
    public static final bf2 f5301c;

    static {
        new b92();
        new z82();
        a = bf2.E();
        f5300b = bf2.E();
        f5301c = bf2.E();
        try {
            h72.a();
            f72.d(new z82(), new b92(), true);
            f72.e(new e92());
            f72.e(new h92());
        } catch (GeneralSecurityException e2) {
            throw new ExceptionInInitializerError(e2);
        }
    }
}