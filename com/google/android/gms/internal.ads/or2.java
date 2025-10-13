package com.google.android.gms.internal.ads;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class or2 {
    private final gq2 a;

    /* renamed from: b, reason: collision with root package name */
    private final String f8006b;

    /* renamed from: c, reason: collision with root package name */
    private final String f8007c;

    /* renamed from: e, reason: collision with root package name */
    private final Class<?>[] f8009e;

    /* renamed from: d, reason: collision with root package name */
    private volatile Method f8008d = null;

    /* renamed from: f, reason: collision with root package name */
    private final CountDownLatch f8010f = new CountDownLatch(1);

    public or2(gq2 gq2Var, String str, String str2, Class<?>... clsArr) {
        this.a = gq2Var;
        this.f8006b = str;
        this.f8007c = str2;
        this.f8009e = clsArr;
        gq2Var.d().submit(new nr2(this));
    }

    static /* synthetic */ void b(or2 or2Var) {
        CountDownLatch countDownLatch;
        Class clsLoadClass;
        try {
            try {
                clsLoadClass = or2Var.a.e().loadClass(or2Var.c(or2Var.a.g(), or2Var.f8006b));
            } catch (NullPointerException unused) {
                countDownLatch = or2Var.f8010f;
            } catch (Throwable th) {
                or2Var.f8010f.countDown();
                throw th;
            }
        } catch (kp2 | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException unused2) {
        }
        if (clsLoadClass == null) {
            countDownLatch = or2Var.f8010f;
        } else {
            or2Var.f8008d = clsLoadClass.getMethod(or2Var.c(or2Var.a.g(), or2Var.f8007c), or2Var.f8009e);
            countDownLatch = or2Var.f8008d == null ? or2Var.f8010f : or2Var.f8010f;
        }
        countDownLatch.countDown();
    }

    private final String c(byte[] bArr, String str) {
        return new String(this.a.f().b(bArr, str), "UTF-8");
    }

    public final Method a() {
        if (this.f8008d != null) {
            return this.f8008d;
        }
        try {
            if (this.f8010f.await(2L, TimeUnit.SECONDS)) {
                return this.f8008d;
            }
            return null;
        } catch (InterruptedException unused) {
            return null;
        }
    }
}