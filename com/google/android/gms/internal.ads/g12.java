package com.google.android.gms.internal.ads;

import java.util.logging.Logger;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
final class g12 {
    private static final Logger a = Logger.getLogger(g12.class.getName());

    /* renamed from: b, reason: collision with root package name */
    private static final f12 f6007b = new f12(null);

    private g12() {
    }

    static boolean a(@NullableDecl String str) {
        return str == null || str.isEmpty();
    }

    static String b(@NullableDecl String str) {
        return str == null ? "" : str;
    }
}