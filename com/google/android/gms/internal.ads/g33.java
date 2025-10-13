package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;
import java.security.MessageDigest;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class g33 extends x23 {

    /* renamed from: c, reason: collision with root package name */
    private MessageDigest f6028c;

    /* renamed from: d, reason: collision with root package name */
    private final int f6029d;

    /* renamed from: e, reason: collision with root package name */
    private final int f6030e;

    public g33(int i2) {
        int i3 = i2 >> 3;
        this.f6029d = (i2 & 7) > 0 ? i3 + 1 : i3;
        this.f6030e = i2;
    }

    @Override // com.google.android.gms.internal.ads.x23
    public final byte[] a(String str) {
        synchronized (this.f10111b) {
            MessageDigest messageDigestB = b();
            this.f6028c = messageDigestB;
            if (messageDigestB == null) {
                return new byte[0];
            }
            messageDigestB.reset();
            this.f6028c.update(str.getBytes(Charset.forName("UTF-8")));
            byte[] bArrDigest = this.f6028c.digest();
            int length = bArrDigest.length;
            int i2 = this.f6029d;
            if (length > i2) {
                length = i2;
            }
            byte[] bArr = new byte[length];
            System.arraycopy(bArrDigest, 0, bArr, 0, length);
            if ((this.f6030e & 7) > 0) {
                long j2 = 0;
                for (int i3 = 0; i3 < length; i3++) {
                    if (i3 > 0) {
                        j2 <<= 8;
                    }
                    j2 += bArr[i3] & 255;
                }
                long j3 = j2 >>> (8 - (this.f6030e & 7));
                int i4 = this.f6029d;
                while (true) {
                    i4--;
                    if (i4 < 0) {
                        break;
                    }
                    bArr[i4] = (byte) (255 & j3);
                    j3 >>>= 8;
                }
            }
            return bArr;
        }
    }
}