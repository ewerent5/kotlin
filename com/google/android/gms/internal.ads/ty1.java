package com.google.android.gms.internal.ads;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.CountDownLatch;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class ty1 implements Runnable {
    /* synthetic */ ty1(rx1 rx1Var) {
    }

    @Override // java.lang.Runnable
    public final void run() {
        CountDownLatch countDownLatch;
        try {
            MessageDigest unused = uz1.f9602b = MessageDigest.getInstance("MD5");
            countDownLatch = uz1.f9605e;
        } catch (NoSuchAlgorithmException unused2) {
            countDownLatch = uz1.f9605e;
        } catch (Throwable th) {
            uz1.f9605e.countDown();
            throw th;
        }
        countDownLatch.countDown();
    }
}