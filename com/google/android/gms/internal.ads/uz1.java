package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class uz1 {
    static boolean a = false;

    /* renamed from: b */
    private static MessageDigest f9602b;

    /* renamed from: c */
    private static final Object f9603c = new Object();

    /* renamed from: d */
    private static final Object f9604d = new Object();

    /* renamed from: e */
    static final CountDownLatch f9605e = new CountDownLatch(1);

    static void a() {
        synchronized (f9604d) {
            if (!a) {
                a = true;
                new Thread(new ty1(null)).start();
            }
        }
    }

    static String b(u91 u91Var, String str) throws GeneralSecurityException {
        byte[] bArrG;
        byte[] bArrI = u91Var.i();
        if (((Boolean) c.c().b(w3.J1)).booleanValue()) {
            Vector<byte[]> vectorC = c(bArrI, 255);
            if (vectorC == null || vectorC.size() == 0) {
                bArrG = g(d(m21.PSN_ENCODE_SIZE_FAIL).i(), str, true);
            } else {
                ms1 ms1VarD = nt1.D();
                int size = vectorC.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ms1VarD.q(ci2.H(g(vectorC.get(i2), str, false)));
                }
                ms1VarD.r(ci2.H(e(bArrI)));
                bArrG = ms1VarD.n().i();
            }
        } else {
            if (hq2.a == null) {
                throw new GeneralSecurityException();
            }
            byte[] bArrA = hq2.a.a(bArrI, str != null ? str.getBytes() : new byte[0]);
            ms1 ms1VarD2 = nt1.D();
            ms1VarD2.q(ci2.H(bArrA));
            ms1VarD2.s(bh1.TINK_HYBRID);
            bArrG = ms1VarD2.n().i();
        }
        return pv1.a(bArrG, true);
    }

    static Vector<byte[]> c(byte[] bArr, int i2) {
        int length = bArr.length;
        if (length <= 0) {
            return null;
        }
        int i3 = (length + 254) / 255;
        Vector<byte[]> vector = new Vector<>();
        for (int i4 = 0; i4 < i3; i4++) {
            int i5 = i4 * 255;
            try {
                int length2 = bArr.length;
                if (length2 - i5 > 255) {
                    length2 = i5 + 255;
                }
                vector.add(Arrays.copyOfRange(bArr, i5, length2));
            } catch (IndexOutOfBoundsException unused) {
                return null;
            }
        }
        return vector;
    }

    static u91 d(m21 m21Var) {
        eu0 eu0VarZ0 = u91.z0();
        eu0VarZ0.e0(m21Var.zza());
        return eu0VarZ0.n();
    }

    public static byte[] e(byte[] bArr) {
        byte[] bArrDigest;
        MessageDigest messageDigest;
        synchronized (f9603c) {
            a();
            MessageDigest messageDigest2 = null;
            try {
                if (f9605e.await(2L, TimeUnit.SECONDS) && (messageDigest = f9602b) != null) {
                    messageDigest2 = messageDigest;
                }
            } catch (InterruptedException unused) {
            }
            if (messageDigest2 == null) {
                throw new NoSuchAlgorithmException("Cannot compute hash");
            }
            messageDigest2.reset();
            messageDigest2.update(bArr);
            bArrDigest = f9602b.digest();
        }
        return bArrDigest;
    }

    private static byte[] g(byte[] bArr, String str, boolean z) {
        byte[] bArrArray;
        int i2 = true != z ? 255 : 239;
        if (bArr.length > i2) {
            bArr = d(m21.PSN_ENCODE_SIZE_FAIL).i();
        }
        int length = bArr.length;
        if (length < i2) {
            byte[] bArr2 = new byte[i2 - length];
            new SecureRandom().nextBytes(bArr2);
            bArrArray = ByteBuffer.allocate(i2 + 1).put((byte) length).put(bArr).put(bArr2).array();
        } else {
            bArrArray = ByteBuffer.allocate(i2 + 1).put((byte) length).put(bArr).array();
        }
        if (z) {
            bArrArray = ByteBuffer.allocate(256).put(e(bArrArray)).put(bArrArray).array();
        }
        byte[] bArr3 = new byte[256];
        w12[] w12VarArr = new uf2().G2;
        int length2 = w12VarArr.length;
        for (int i3 = 0; i3 < 12; i3++) {
            w12VarArr[i3].a(bArrArray, bArr3);
        }
        if (str != null && str.length() > 0) {
            if (str.length() > 32) {
                str = str.substring(0, 32);
            }
            new jh2(str.getBytes("UTF-8")).a(bArr3);
        }
        return bArr3;
    }
}