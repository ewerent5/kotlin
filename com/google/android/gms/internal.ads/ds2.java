package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.security.DigestException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PSSParameterSpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class ds2 {
    public static X509Certificate[][] a(String str) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(str, "r");
        try {
            Pair<ByteBuffer, Long> pairA = et2.a(randomAccessFile);
            if (pairA == null) {
                long length = randomAccessFile.length();
                StringBuilder sb = new StringBuilder(102);
                sb.append("Not an APK file: ZIP End of Central Directory record not found in file with ");
                sb.append(length);
                sb.append(" bytes");
                throw new ap2(sb.toString());
            }
            ByteBuffer byteBuffer = (ByteBuffer) pairA.first;
            long jLongValue = ((Long) pairA.second).longValue();
            long j2 = (-20) + jLongValue;
            if (j2 >= 0) {
                randomAccessFile.seek(j2);
                if (randomAccessFile.readInt() == 1347094023) {
                    throw new ap2("ZIP64 APK not supported");
                }
            }
            long jB = et2.b(byteBuffer);
            if (jB >= jLongValue) {
                StringBuilder sb2 = new StringBuilder(122);
                sb2.append("ZIP Central Directory offset out of range: ");
                sb2.append(jB);
                sb2.append(". ZIP End of Central Directory offset: ");
                sb2.append(jLongValue);
                throw new ap2(sb2.toString());
            }
            if (et2.d(byteBuffer) + jB != jLongValue) {
                throw new ap2("ZIP Central Directory is not immediately followed by End of Central Directory");
            }
            if (jB < 32) {
                StringBuilder sb3 = new StringBuilder(87);
                sb3.append("APK too small for APK Signing Block. ZIP Central Directory offset: ");
                sb3.append(jB);
                throw new ap2(sb3.toString());
            }
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(24);
            ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
            byteBufferAllocate.order(byteOrder);
            randomAccessFile.seek(jB - byteBufferAllocate.capacity());
            randomAccessFile.readFully(byteBufferAllocate.array(), byteBufferAllocate.arrayOffset(), byteBufferAllocate.capacity());
            if (byteBufferAllocate.getLong(8) != 2334950737559900225L || byteBufferAllocate.getLong(16) != 3617552046287187010L) {
                throw new ap2("No APK Signing Block before ZIP Central Directory");
            }
            int i2 = 0;
            long j3 = byteBufferAllocate.getLong(0);
            if (j3 < byteBufferAllocate.capacity() || j3 > 2147483639) {
                StringBuilder sb4 = new StringBuilder(57);
                sb4.append("APK Signing Block size out of range: ");
                sb4.append(j3);
                throw new ap2(sb4.toString());
            }
            int i3 = (int) (8 + j3);
            long j4 = jB - i3;
            if (j4 < 0) {
                StringBuilder sb5 = new StringBuilder(59);
                sb5.append("APK Signing Block offset out of range: ");
                sb5.append(j4);
                throw new ap2(sb5.toString());
            }
            ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(i3);
            byteBufferAllocate2.order(byteOrder);
            randomAccessFile.seek(j4);
            randomAccessFile.readFully(byteBufferAllocate2.array(), byteBufferAllocate2.arrayOffset(), byteBufferAllocate2.capacity());
            long j5 = byteBufferAllocate2.getLong(0);
            if (j5 != j3) {
                StringBuilder sb6 = new StringBuilder(103);
                sb6.append("APK Signing Block sizes in header and footer do not match: ");
                sb6.append(j5);
                sb6.append(" vs ");
                sb6.append(j3);
                throw new ap2(sb6.toString());
            }
            Pair pairCreate = Pair.create(byteBufferAllocate2, Long.valueOf(j4));
            ByteBuffer byteBuffer2 = (ByteBuffer) pairCreate.first;
            long jLongValue2 = ((Long) pairCreate.second).longValue();
            if (byteBuffer2.order() != byteOrder) {
                throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
            }
            int iCapacity = byteBuffer2.capacity() - 24;
            if (iCapacity < 8) {
                StringBuilder sb7 = new StringBuilder(38);
                sb7.append("end < start: ");
                sb7.append(iCapacity);
                sb7.append(" < ");
                sb7.append(8);
                throw new IllegalArgumentException(sb7.toString());
            }
            int iCapacity2 = byteBuffer2.capacity();
            if (iCapacity > byteBuffer2.capacity()) {
                StringBuilder sb8 = new StringBuilder(41);
                sb8.append("end > capacity: ");
                sb8.append(iCapacity);
                sb8.append(" > ");
                sb8.append(iCapacity2);
                throw new IllegalArgumentException(sb8.toString());
            }
            int iLimit = byteBuffer2.limit();
            int iPosition = byteBuffer2.position();
            try {
                byteBuffer2.position(0);
                byteBuffer2.limit(iCapacity);
                byteBuffer2.position(8);
                ByteBuffer byteBufferSlice = byteBuffer2.slice();
                byteBufferSlice.order(byteBuffer2.order());
                while (byteBufferSlice.hasRemaining()) {
                    i2++;
                    if (byteBufferSlice.remaining() < 8) {
                        StringBuilder sb9 = new StringBuilder(70);
                        sb9.append("Insufficient data to read size of APK Signing Block entry #");
                        sb9.append(i2);
                        throw new ap2(sb9.toString());
                    }
                    long j6 = byteBufferSlice.getLong();
                    if (j6 < 4 || j6 > 2147483647L) {
                        StringBuilder sb10 = new StringBuilder(76);
                        sb10.append("APK Signing Block entry #");
                        sb10.append(i2);
                        sb10.append(" size out of range: ");
                        sb10.append(j6);
                        throw new ap2(sb10.toString());
                    }
                    int i4 = (int) j6;
                    int iPosition2 = byteBufferSlice.position() + i4;
                    if (i4 > byteBufferSlice.remaining()) {
                        int iRemaining = byteBufferSlice.remaining();
                        StringBuilder sb11 = new StringBuilder(91);
                        sb11.append("APK Signing Block entry #");
                        sb11.append(i2);
                        sb11.append(" size out of range: ");
                        sb11.append(i4);
                        sb11.append(", available: ");
                        sb11.append(iRemaining);
                        throw new ap2(sb11.toString());
                    }
                    if (byteBufferSlice.getInt() == 1896449818) {
                        X509Certificate[][] x509CertificateArrB = b(randomAccessFile.getChannel(), new sy1(i(byteBufferSlice, i4 - 4), jLongValue2, jB, jLongValue, byteBuffer, null));
                        randomAccessFile.close();
                        return x509CertificateArrB;
                    }
                    byteBufferSlice.position(iPosition2);
                }
                throw new ap2("No APK Signature Scheme v2 block in APK Signing Block");
            } finally {
                byteBuffer2.position(0);
                byteBuffer2.limit(iLimit);
                byteBuffer2.position(iPosition);
            }
        } finally {
            try {
                randomAccessFile.close();
            } catch (IOException unused) {
            }
        }
    }

    private static X509Certificate[][] b(FileChannel fileChannel, sy1 sy1Var) throws CertificateException {
        HashMap map = new HashMap();
        ArrayList arrayList = new ArrayList();
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            try {
                ByteBuffer byteBufferJ = j(sy1Var.a);
                int i2 = 0;
                while (byteBufferJ.hasRemaining()) {
                    i2++;
                    try {
                        arrayList.add(c(j(byteBufferJ), map, certificateFactory));
                    } catch (IOException | SecurityException | BufferUnderflowException e2) {
                        StringBuilder sb = new StringBuilder(48);
                        sb.append("Failed to parse/verify signer #");
                        sb.append(i2);
                        sb.append(" block");
                        throw new SecurityException(sb.toString(), e2);
                    }
                }
                if (i2 <= 0) {
                    throw new SecurityException("No signers found");
                }
                if (map.isEmpty()) {
                    throw new SecurityException("No content digests found");
                }
                d(map, fileChannel, sy1Var.f9024b, sy1Var.f9025c, sy1Var.f9026d, sy1Var.f9027e);
                return (X509Certificate[][]) arrayList.toArray(new X509Certificate[arrayList.size()][]);
            } catch (IOException e3) {
                throw new SecurityException("Failed to read list of signers", e3);
            }
        } catch (CertificateException e4) {
            throw new RuntimeException("Failed to obtain X.509 CertificateFactory", e4);
        }
    }

    private static X509Certificate[] c(ByteBuffer byteBuffer, Map<Integer, byte[]> map, CertificateFactory certificateFactory) throws InvalidKeySpecException, NoSuchAlgorithmException, SignatureException, IOException, InvalidKeyException, InvalidAlgorithmParameterException {
        String str;
        Pair pairCreate;
        ByteBuffer byteBufferJ = j(byteBuffer);
        ByteBuffer byteBufferJ2 = j(byteBuffer);
        byte[] bArrK = k(byteBuffer);
        ArrayList arrayList = new ArrayList();
        byte[] bArrK2 = null;
        byte[] bArrK3 = null;
        int i2 = -1;
        int i3 = 0;
        while (byteBufferJ2.hasRemaining()) {
            i3++;
            try {
                ByteBuffer byteBufferJ3 = j(byteBufferJ2);
                if (byteBufferJ3.remaining() < 8) {
                    throw new SecurityException("Signature record too short");
                }
                int i4 = byteBufferJ3.getInt();
                arrayList.add(Integer.valueOf(i4));
                if (i4 != 513 && i4 != 514 && i4 != 769) {
                    switch (i4) {
                        case 257:
                        case 258:
                        case 259:
                        case 260:
                            break;
                        default:
                            continue;
                    }
                }
                if (i2 != -1) {
                    int iF = f(i4);
                    int iF2 = f(i2);
                    if (iF != 1 && iF2 == 1) {
                    }
                }
                bArrK3 = k(byteBufferJ3);
                i2 = i4;
            } catch (IOException | BufferUnderflowException e2) {
                StringBuilder sb = new StringBuilder(45);
                sb.append("Failed to parse signature record #");
                sb.append(i3);
                throw new SecurityException(sb.toString(), e2);
            }
        }
        if (i2 == -1) {
            if (i3 == 0) {
                throw new SecurityException("No signatures found");
            }
            throw new SecurityException("No supported signatures found");
        }
        if (i2 == 513 || i2 == 514) {
            str = "EC";
        } else if (i2 != 769) {
            switch (i2) {
                case 257:
                case 258:
                case 259:
                case 260:
                    str = "RSA";
                    break;
                default:
                    String strValueOf = String.valueOf(Long.toHexString(i2));
                    throw new IllegalArgumentException(strValueOf.length() != 0 ? "Unknown signature algorithm: 0x".concat(strValueOf) : new String("Unknown signature algorithm: 0x"));
            }
        } else {
            str = "DSA";
        }
        if (i2 == 513) {
            pairCreate = Pair.create("SHA256withECDSA", null);
        } else if (i2 == 514) {
            pairCreate = Pair.create("SHA512withECDSA", null);
        } else if (i2 != 769) {
            switch (i2) {
                case 257:
                    pairCreate = Pair.create("SHA256withRSA/PSS", new PSSParameterSpec("SHA-256", "MGF1", MGF1ParameterSpec.SHA256, 32, 1));
                    break;
                case 258:
                    pairCreate = Pair.create("SHA512withRSA/PSS", new PSSParameterSpec("SHA-512", "MGF1", MGF1ParameterSpec.SHA512, 64, 1));
                    break;
                case 259:
                    pairCreate = Pair.create("SHA256withRSA", null);
                    break;
                case 260:
                    pairCreate = Pair.create("SHA512withRSA", null);
                    break;
                default:
                    String strValueOf2 = String.valueOf(Long.toHexString(i2));
                    throw new IllegalArgumentException(strValueOf2.length() != 0 ? "Unknown signature algorithm: 0x".concat(strValueOf2) : new String("Unknown signature algorithm: 0x"));
            }
        } else {
            pairCreate = Pair.create("SHA256withDSA", null);
        }
        String str2 = (String) pairCreate.first;
        AlgorithmParameterSpec algorithmParameterSpec = (AlgorithmParameterSpec) pairCreate.second;
        try {
            PublicKey publicKeyGeneratePublic = KeyFactory.getInstance(str).generatePublic(new X509EncodedKeySpec(bArrK));
            Signature signature = Signature.getInstance(str2);
            signature.initVerify(publicKeyGeneratePublic);
            if (algorithmParameterSpec != null) {
                signature.setParameter(algorithmParameterSpec);
            }
            signature.update(byteBufferJ);
            if (!signature.verify(bArrK3)) {
                throw new SecurityException(String.valueOf(str2).concat(" signature did not verify"));
            }
            byteBufferJ.clear();
            ByteBuffer byteBufferJ4 = j(byteBufferJ);
            ArrayList arrayList2 = new ArrayList();
            int i5 = 0;
            while (byteBufferJ4.hasRemaining()) {
                i5++;
                try {
                    ByteBuffer byteBufferJ5 = j(byteBufferJ4);
                    if (byteBufferJ5.remaining() < 8) {
                        throw new IOException("Record too short");
                    }
                    int i6 = byteBufferJ5.getInt();
                    arrayList2.add(Integer.valueOf(i6));
                    if (i6 == i2) {
                        bArrK2 = k(byteBufferJ5);
                    }
                } catch (IOException | BufferUnderflowException e3) {
                    StringBuilder sb2 = new StringBuilder(42);
                    sb2.append("Failed to parse digest record #");
                    sb2.append(i5);
                    throw new IOException(sb2.toString(), e3);
                }
            }
            if (!arrayList.equals(arrayList2)) {
                throw new SecurityException("Signature algorithms don't match between digests and signatures records");
            }
            int iF3 = f(i2);
            byte[] bArrPut = map.put(Integer.valueOf(iF3), bArrK2);
            if (bArrPut != null && !MessageDigest.isEqual(bArrPut, bArrK2)) {
                throw new SecurityException(g(iF3).concat(" contents digest does not match the digest specified by a preceding signer"));
            }
            ByteBuffer byteBufferJ6 = j(byteBufferJ);
            ArrayList arrayList3 = new ArrayList();
            int i7 = 0;
            while (byteBufferJ6.hasRemaining()) {
                i7++;
                byte[] bArrK4 = k(byteBufferJ6);
                try {
                    arrayList3.add(new bq2((X509Certificate) certificateFactory.generateCertificate(new ByteArrayInputStream(bArrK4)), bArrK4));
                } catch (CertificateException e4) {
                    StringBuilder sb3 = new StringBuilder(41);
                    sb3.append("Failed to decode certificate #");
                    sb3.append(i7);
                    throw new SecurityException(sb3.toString(), e4);
                }
            }
            if (arrayList3.isEmpty()) {
                throw new SecurityException("No certificates listed");
            }
            if (Arrays.equals(bArrK, ((X509Certificate) arrayList3.get(0)).getPublicKey().getEncoded())) {
                return (X509Certificate[]) arrayList3.toArray(new X509Certificate[arrayList3.size()]);
            }
            throw new SecurityException("Public key mismatch between certificate and signature record");
        } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | SignatureException | InvalidKeySpecException e5) {
            StringBuilder sb4 = new StringBuilder(String.valueOf(str2).length() + 27);
            sb4.append("Failed to verify ");
            sb4.append(str2);
            sb4.append(" signature");
            throw new SecurityException(sb4.toString(), e5);
        }
    }

    private static void d(Map<Integer, byte[]> map, FileChannel fileChannel, long j2, long j3, long j4, ByteBuffer byteBuffer) {
        if (map.isEmpty()) {
            throw new SecurityException("No digests provided");
        }
        r71 r71Var = new r71(fileChannel, 0L, j2);
        r71 r71Var2 = new r71(fileChannel, j3, j4 - j3);
        ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
        byteBufferDuplicate.order(ByteOrder.LITTLE_ENDIAN);
        et2.c(byteBufferDuplicate, j2);
        rp rpVar = new rp(byteBufferDuplicate);
        int size = map.size();
        int[] iArr = new int[size];
        Iterator<Integer> it = map.keySet().iterator();
        int i2 = 0;
        while (it.hasNext()) {
            iArr[i2] = it.next().intValue();
            i2++;
        }
        try {
            byte[][] bArrE = e(iArr, new qg0[]{r71Var, r71Var2, rpVar});
            for (int i3 = 0; i3 < size; i3++) {
                int i4 = iArr[i3];
                if (!MessageDigest.isEqual(map.get(Integer.valueOf(i4)), bArrE[i3])) {
                    throw new SecurityException(g(i4).concat(" digest of contents did not verify"));
                }
            }
        } catch (DigestException e2) {
            throw new SecurityException("Failed to compute digest(s) of contents", e2);
        }
    }

    private static byte[][] e(int[] iArr, qg0[] qg0VarArr) throws DigestException {
        long j2;
        int i2;
        int length;
        long j3 = 0;
        int i3 = 0;
        long jZza = 0;
        int i4 = 0;
        while (true) {
            j2 = 1048576;
            if (i4 >= 3) {
                break;
            }
            jZza += (qg0VarArr[i4].zza() + 1048575) / 1048576;
            i4++;
        }
        if (jZza >= 2097151) {
            StringBuilder sb = new StringBuilder(37);
            sb.append("Too many chunks: ");
            sb.append(jZza);
            throw new DigestException(sb.toString());
        }
        int i5 = (int) jZza;
        byte[][] bArr = new byte[iArr.length][];
        int i6 = 0;
        while (true) {
            length = iArr.length;
            if (i6 >= length) {
                break;
            }
            byte[] bArr2 = new byte[(h(iArr[i6]) * i5) + 5];
            bArr2[0] = 90;
            l(i5, bArr2, 1);
            bArr[i6] = bArr2;
            i6++;
        }
        byte[] bArr3 = new byte[5];
        bArr3[0] = -91;
        MessageDigest[] messageDigestArr = new MessageDigest[length];
        for (int i7 = 0; i7 < iArr.length; i7++) {
            String strG = g(iArr[i7]);
            try {
                messageDigestArr[i7] = MessageDigest.getInstance(strG);
            } catch (NoSuchAlgorithmException e2) {
                throw new RuntimeException(strG.concat(" digest not supported"), e2);
            }
        }
        int i8 = 0;
        int i9 = 0;
        for (i2 = 3; i8 < i2; i2 = 3) {
            qg0 qg0Var = qg0VarArr[i8];
            long j4 = j3;
            long jZza2 = qg0Var.zza();
            while (jZza2 > j3) {
                int iMin = (int) Math.min(jZza2, j2);
                l(iMin, bArr3, 1);
                for (int i10 = 0; i10 < length; i10++) {
                    messageDigestArr[i10].update(bArr3);
                }
                long j5 = j4;
                try {
                    qg0Var.a(messageDigestArr, j5, iMin);
                    byte[] bArr4 = bArr3;
                    int i11 = 0;
                    while (i11 < iArr.length) {
                        int i12 = iArr[i11];
                        qg0 qg0Var2 = qg0Var;
                        byte[] bArr5 = bArr[i11];
                        int iH = h(i12);
                        int i13 = length;
                        MessageDigest messageDigest = messageDigestArr[i11];
                        MessageDigest[] messageDigestArr2 = messageDigestArr;
                        int iDigest = messageDigest.digest(bArr5, (i9 * iH) + 5, iH);
                        if (iDigest != iH) {
                            String algorithm = messageDigest.getAlgorithm();
                            StringBuilder sb2 = new StringBuilder(String.valueOf(algorithm).length() + 46);
                            sb2.append("Unexpected output size of ");
                            sb2.append(algorithm);
                            sb2.append(" digest: ");
                            sb2.append(iDigest);
                            throw new RuntimeException(sb2.toString());
                        }
                        i11++;
                        qg0Var = qg0Var2;
                        length = i13;
                        messageDigestArr = messageDigestArr2;
                    }
                    MessageDigest[] messageDigestArr3 = messageDigestArr;
                    long j6 = iMin;
                    long j7 = j5 + j6;
                    jZza2 -= j6;
                    i9++;
                    bArr3 = bArr4;
                    j3 = 0;
                    j4 = j7;
                    messageDigestArr = messageDigestArr3;
                    j2 = 1048576;
                } catch (IOException e3) {
                    StringBuilder sb3 = new StringBuilder(59);
                    sb3.append("Failed to digest chunk #");
                    sb3.append(i9);
                    sb3.append(" of section #");
                    sb3.append(i3);
                    throw new DigestException(sb3.toString(), e3);
                }
            }
            i3++;
            i8++;
            j3 = 0;
            j2 = 1048576;
        }
        byte[][] bArr6 = new byte[iArr.length][];
        for (int i14 = 0; i14 < iArr.length; i14++) {
            int i15 = iArr[i14];
            byte[] bArr7 = bArr[i14];
            String strG2 = g(i15);
            try {
                bArr6[i14] = MessageDigest.getInstance(strG2).digest(bArr7);
            } catch (NoSuchAlgorithmException e4) {
                throw new RuntimeException(strG2.concat(" digest not supported"), e4);
            }
        }
        return bArr6;
    }

    private static int f(int i2) {
        if (i2 == 513) {
            return 1;
        }
        if (i2 == 514) {
            return 2;
        }
        if (i2 == 769) {
            return 1;
        }
        switch (i2) {
            case 257:
            case 259:
                return 1;
            case 258:
            case 260:
                return 2;
            default:
                String strValueOf = String.valueOf(Long.toHexString(i2));
                throw new IllegalArgumentException(strValueOf.length() != 0 ? "Unknown signature algorithm: 0x".concat(strValueOf) : new String("Unknown signature algorithm: 0x"));
        }
    }

    private static String g(int i2) {
        if (i2 == 1) {
            return "SHA-256";
        }
        if (i2 == 2) {
            return "SHA-512";
        }
        StringBuilder sb = new StringBuilder(44);
        sb.append("Unknown content digest algorthm: ");
        sb.append(i2);
        throw new IllegalArgumentException(sb.toString());
    }

    private static int h(int i2) {
        if (i2 == 1) {
            return 32;
        }
        if (i2 == 2) {
            return 64;
        }
        StringBuilder sb = new StringBuilder(44);
        sb.append("Unknown content digest algorthm: ");
        sb.append(i2);
        throw new IllegalArgumentException(sb.toString());
    }

    private static ByteBuffer i(ByteBuffer byteBuffer, int i2) {
        if (i2 < 0) {
            StringBuilder sb = new StringBuilder(17);
            sb.append("size: ");
            sb.append(i2);
            throw new IllegalArgumentException(sb.toString());
        }
        int iLimit = byteBuffer.limit();
        int iPosition = byteBuffer.position();
        int i3 = i2 + iPosition;
        if (i3 < iPosition || i3 > iLimit) {
            throw new BufferUnderflowException();
        }
        byteBuffer.limit(i3);
        try {
            ByteBuffer byteBufferSlice = byteBuffer.slice();
            byteBufferSlice.order(byteBuffer.order());
            byteBuffer.position(i3);
            return byteBufferSlice;
        } finally {
            byteBuffer.limit(iLimit);
        }
    }

    private static ByteBuffer j(ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer.remaining() < 4) {
            int iRemaining = byteBuffer.remaining();
            StringBuilder sb = new StringBuilder(93);
            sb.append("Remaining buffer too short to contain length of length-prefixed field. Remaining: ");
            sb.append(iRemaining);
            throw new IOException(sb.toString());
        }
        int i2 = byteBuffer.getInt();
        if (i2 < 0) {
            throw new IllegalArgumentException("Negative length");
        }
        if (i2 <= byteBuffer.remaining()) {
            return i(byteBuffer, i2);
        }
        int iRemaining2 = byteBuffer.remaining();
        StringBuilder sb2 = new StringBuilder(101);
        sb2.append("Length-prefixed field longer than remaining buffer. Field length: ");
        sb2.append(i2);
        sb2.append(", remaining: ");
        sb2.append(iRemaining2);
        throw new IOException(sb2.toString());
    }

    private static byte[] k(ByteBuffer byteBuffer) throws IOException {
        int i2 = byteBuffer.getInt();
        if (i2 < 0) {
            throw new IOException("Negative length");
        }
        if (i2 <= byteBuffer.remaining()) {
            byte[] bArr = new byte[i2];
            byteBuffer.get(bArr);
            return bArr;
        }
        int iRemaining = byteBuffer.remaining();
        StringBuilder sb = new StringBuilder(90);
        sb.append("Underflow while reading length-prefixed value. Length: ");
        sb.append(i2);
        sb.append(", available: ");
        sb.append(iRemaining);
        throw new IOException(sb.toString());
    }

    private static void l(int i2, byte[] bArr, int i3) {
        bArr[1] = (byte) (i2 & 255);
        bArr[2] = (byte) ((i2 >>> 8) & 255);
        bArr[3] = (byte) ((i2 >>> 16) & 255);
        bArr[4] = (byte) (i2 >> 24);
    }
}