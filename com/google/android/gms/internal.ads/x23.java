package com.google.android.gms.internal.ads;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public abstract class x23 {
    private static MessageDigest a;

    /* renamed from: b, reason: collision with root package name */
    protected final Object f10111b = new Object();

    abstract byte[] a(String str);

    protected final MessageDigest b() {
        synchronized (this.f10111b) {
            MessageDigest messageDigest = a;
            if (messageDigest != null) {
                return messageDigest;
            }
            for (int i2 = 0; i2 < 2; i2++) {
                try {
                    a = MessageDigest.getInstance("MD5");
                } catch (NoSuchAlgorithmException unused) {
                }
            }
            return a;
        }
    }
}