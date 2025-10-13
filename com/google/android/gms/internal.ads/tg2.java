package com.google.android.gms.internal.ads;

import java.security.InvalidAlgorithmParameterException;
import java.security.Key;
import java.util.Arrays;
import javax.crypto.Mac;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class tg2 implements w92 {
    private final ThreadLocal<Mac> a;

    /* renamed from: b, reason: collision with root package name */
    private final String f9138b;

    /* renamed from: c, reason: collision with root package name */
    private final Key f9139c;

    /* renamed from: d, reason: collision with root package name */
    private final int f9140d;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public tg2(java.lang.String r5, java.security.Key r6) throws java.security.NoSuchAlgorithmException, java.security.InvalidAlgorithmParameterException {
        /*
            r4 = this;
            r4.<init>()
            com.google.android.gms.internal.ads.sg2 r0 = new com.google.android.gms.internal.ads.sg2
            r0.<init>(r4)
            r4.a = r0
            r4.f9138b = r5
            r4.f9139c = r6
            byte[] r6 = r6.getEncoded()
            int r6 = r6.length
            r1 = 16
            if (r6 < r1) goto L7e
            int r6 = r5.hashCode()
            r1 = 3
            r2 = 2
            r3 = 1
            switch(r6) {
                case -1823053428: goto L40;
                case 392315118: goto L36;
                case 392316170: goto L2c;
                case 392317873: goto L22;
                default: goto L21;
            }
        L21:
            goto L4a
        L22:
            java.lang.String r6 = "HMACSHA512"
            boolean r6 = r5.equals(r6)
            if (r6 == 0) goto L4a
            r6 = 3
            goto L4b
        L2c:
            java.lang.String r6 = "HMACSHA384"
            boolean r6 = r5.equals(r6)
            if (r6 == 0) goto L4a
            r6 = 2
            goto L4b
        L36:
            java.lang.String r6 = "HMACSHA256"
            boolean r6 = r5.equals(r6)
            if (r6 == 0) goto L4a
            r6 = 1
            goto L4b
        L40:
            java.lang.String r6 = "HMACSHA1"
            boolean r6 = r5.equals(r6)
            if (r6 == 0) goto L4a
            r6 = 0
            goto L4b
        L4a:
            r6 = -1
        L4b:
            if (r6 == 0) goto L76
            if (r6 == r3) goto L73
            if (r6 == r2) goto L70
            if (r6 == r1) goto L6b
            java.security.NoSuchAlgorithmException r6 = new java.security.NoSuchAlgorithmException
            java.lang.String r0 = "unknown Hmac algorithm: "
            int r1 = r5.length()
            if (r1 == 0) goto L62
            java.lang.String r5 = r0.concat(r5)
            goto L67
        L62:
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0)
        L67:
            r6.<init>(r5)
            throw r6
        L6b:
            r5 = 64
            r4.f9140d = r5
            goto L7a
        L70:
            r5 = 48
            goto L78
        L73:
            r5 = 32
            goto L78
        L76:
            r5 = 20
        L78:
            r4.f9140d = r5
        L7a:
            r0.get()
            return
        L7e:
            java.security.InvalidAlgorithmParameterException r5 = new java.security.InvalidAlgorithmParameterException
            java.lang.String r6 = "key size too small, need at least 16 bytes"
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.tg2.<init>(java.lang.String, java.security.Key):void");
    }

    @Override // com.google.android.gms.internal.ads.w92
    public final byte[] a(byte[] bArr, int i2) throws IllegalStateException, InvalidAlgorithmParameterException {
        if (i2 > this.f9140d) {
            throw new InvalidAlgorithmParameterException("tag size too big");
        }
        this.a.get().update(bArr);
        return Arrays.copyOf(this.a.get().doFinal(), i2);
    }
}