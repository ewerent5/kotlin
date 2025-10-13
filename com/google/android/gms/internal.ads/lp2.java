package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class lp2 {
    private static Cipher a;

    /* renamed from: b, reason: collision with root package name */
    private static final Object f7292b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private static final Object f7293c = new Object();

    public lp2(SecureRandom secureRandom) {
    }

    private static final Cipher c() {
        Cipher cipher;
        synchronized (f7293c) {
            if (a == null) {
                a = Cipher.getInstance("AES/CBC/PKCS5Padding");
            }
            cipher = a;
        }
        return cipher;
    }

    public final String a(byte[] bArr, byte[] bArr2) throws kp2 {
        byte[] bArrDoFinal;
        byte[] iv;
        int length = bArr.length;
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
            synchronized (f7292b) {
                c().init(1, secretKeySpec, (SecureRandom) null);
                bArrDoFinal = c().doFinal(bArr2);
                iv = c().getIV();
            }
            int length2 = bArrDoFinal.length + iv.length;
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length2);
            byteBufferAllocate.put(iv).put(bArrDoFinal);
            byteBufferAllocate.flip();
            byte[] bArr3 = new byte[length2];
            byteBufferAllocate.get(bArr3);
            return pv1.a(bArr3, false);
        } catch (InvalidKeyException e2) {
            throw new kp2(this, e2);
        } catch (NoSuchAlgorithmException e3) {
            throw new kp2(this, e3);
        } catch (BadPaddingException e4) {
            throw new kp2(this, e4);
        } catch (IllegalBlockSizeException e5) {
            throw new kp2(this, e5);
        } catch (NoSuchPaddingException e6) {
            throw new kp2(this, e6);
        }
    }

    public final byte[] b(byte[] bArr, String str) throws kp2 {
        byte[] bArrDoFinal;
        int length = bArr.length;
        try {
            byte[] bArrB = pv1.b(str, false);
            int length2 = bArrB.length;
            if (length2 <= 16) {
                throw new kp2(this);
            }
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length2);
            byteBufferAllocate.put(bArrB);
            byteBufferAllocate.flip();
            byte[] bArr2 = new byte[16];
            byte[] bArr3 = new byte[length2 - 16];
            byteBufferAllocate.get(bArr2);
            byteBufferAllocate.get(bArr3);
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
            synchronized (f7292b) {
                c().init(2, secretKeySpec, new IvParameterSpec(bArr2));
                bArrDoFinal = c().doFinal(bArr3);
            }
            return bArrDoFinal;
        } catch (IllegalArgumentException e2) {
            throw new kp2(this, e2);
        } catch (InvalidAlgorithmParameterException e3) {
            throw new kp2(this, e3);
        } catch (InvalidKeyException e4) {
            throw new kp2(this, e4);
        } catch (NoSuchAlgorithmException e5) {
            throw new kp2(this, e5);
        } catch (BadPaddingException e6) {
            throw new kp2(this, e6);
        } catch (IllegalBlockSizeException e7) {
            throw new kp2(this, e7);
        } catch (NoSuchPaddingException e8) {
            throw new kp2(this, e8);
        }
    }
}