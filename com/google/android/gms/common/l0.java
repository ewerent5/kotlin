package com.google.android.gms.common;

import android.util.Log;
import com.google.android.gms.common.internal.p;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.Callable;
import javax.annotation.CheckReturnValue;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
@CheckReturnValue
/* loaded from: classes.dex */
class l0 {
    private static final l0 a = new l0(true, null, null);

    /* renamed from: b, reason: collision with root package name */
    final boolean f4766b;

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    final String f4767c;

    /* renamed from: d, reason: collision with root package name */
    @Nullable
    final Throwable f4768d;

    l0(boolean z, @Nullable String str, @Nullable Throwable th) {
        this.f4766b = z;
        this.f4767c = str;
        this.f4768d = th;
    }

    static l0 b() {
        return a;
    }

    static l0 c(Callable<String> callable) {
        return new k0(callable, null);
    }

    static l0 d(String str) {
        return new l0(false, str, null);
    }

    static l0 e(String str, Throwable th) {
        return new l0(false, str, th);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String g(String str, x xVar, boolean z, boolean z2) throws NoSuchAlgorithmException {
        String str2 = true != z2 ? "not allowed" : "debug cert rejected";
        MessageDigest messageDigestB = com.google.android.gms.common.util.a.b("SHA-1");
        p.j(messageDigestB);
        return String.format("%s: pkg=%s, sha1=%s, atk=%s, ver=%s", str2, str, com.google.android.gms.common.util.k.a(messageDigestB.digest(xVar.Y())), Boolean.valueOf(z), "12451000.false");
    }

    @Nullable
    String a() {
        return this.f4767c;
    }

    final void f() {
        if (this.f4766b || !Log.isLoggable("GoogleCertificatesRslt", 3)) {
            return;
        }
        if (this.f4768d != null) {
            Log.d("GoogleCertificatesRslt", a(), this.f4768d);
        } else {
            Log.d("GoogleCertificatesRslt", a());
        }
    }
}