package com.google.android.gms.internal.ads;

import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class qv2 {
    public boolean L;
    public kv2 O;
    public int P;
    public String a;

    /* renamed from: b, reason: collision with root package name */
    public int f8488b;

    /* renamed from: c, reason: collision with root package name */
    public int f8489c;

    /* renamed from: d, reason: collision with root package name */
    public int f8490d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f8491e;

    /* renamed from: f, reason: collision with root package name */
    public byte[] f8492f;

    /* renamed from: g, reason: collision with root package name */
    public jv2 f8493g;

    /* renamed from: h, reason: collision with root package name */
    public byte[] f8494h;

    /* renamed from: i, reason: collision with root package name */
    public wu2 f8495i;

    /* renamed from: j, reason: collision with root package name */
    public int f8496j = -1;

    /* renamed from: k, reason: collision with root package name */
    public int f8497k = -1;

    /* renamed from: l, reason: collision with root package name */
    public int f8498l = -1;

    /* renamed from: m, reason: collision with root package name */
    public int f8499m = -1;
    public int n = 0;
    public byte[] o = null;
    public int p = -1;
    public boolean q = false;
    public int r = -1;
    public int s = -1;
    public int t = -1;
    public int u = CoreConstants.MILLIS_IN_ONE_SECOND;
    public int v = 200;
    public float w = -1.0f;
    public float x = -1.0f;
    public float y = -1.0f;
    public float z = -1.0f;
    public float A = -1.0f;
    public float B = -1.0f;
    public float C = -1.0f;
    public float D = -1.0f;
    public float E = -1.0f;
    public float F = -1.0f;
    public int G = 1;
    public int H = -1;
    public int I = 8000;
    public long J = 0;
    public long K = 0;
    public boolean M = true;
    private String N = "eng";

    private qv2() {
    }

    /* synthetic */ qv2(ov2 ov2Var) {
    }

    private static List<byte[]> c(o03 o03Var) throws at2 {
        try {
            o03Var.j(16);
            if (o03Var.q() != 826496599) {
                return null;
            }
            int iG = o03Var.g() + 20;
            byte[] bArr = o03Var.a;
            while (true) {
                int length = bArr.length;
                if (iG >= length - 4) {
                    throw new at2("Failed to find FourCC VC1 initialization data");
                }
                if (bArr[iG] == 0 && bArr[iG + 1] == 0 && bArr[iG + 2] == 1 && bArr[iG + 3] == 15) {
                    return Collections.singletonList(Arrays.copyOfRange(bArr, iG, length));
                }
                iG++;
            }
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new at2("Error parsing FourCC VC1 codec private");
        }
    }

    private static List<byte[]> d(byte[] bArr) throws at2 {
        int i2;
        int i3;
        try {
            if (bArr[0] != 2) {
                throw new at2("Error parsing vorbis codec private");
            }
            int i4 = 1;
            int i5 = 0;
            while (true) {
                i2 = bArr[i4];
                if (i2 != -1) {
                    break;
                }
                i5 += 255;
                i4++;
            }
            int i6 = i4 + 1;
            int i7 = i5 + i2;
            int i8 = 0;
            while (true) {
                i3 = bArr[i6];
                if (i3 != -1) {
                    break;
                }
                i8 += 255;
                i6++;
            }
            int i9 = i6 + 1;
            int i10 = i8 + i3;
            if (bArr[i9] != 1) {
                throw new at2("Error parsing vorbis codec private");
            }
            byte[] bArr2 = new byte[i7];
            System.arraycopy(bArr, i9, bArr2, 0, i7);
            int i11 = i9 + i7;
            if (bArr[i11] != 3) {
                throw new at2("Error parsing vorbis codec private");
            }
            int i12 = i11 + i10;
            if (bArr[i12] != 5) {
                throw new at2("Error parsing vorbis codec private");
            }
            int length = bArr.length - i12;
            byte[] bArr3 = new byte[length];
            System.arraycopy(bArr, i12, bArr3, 0, length);
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(bArr2);
            arrayList.add(bArr3);
            return arrayList;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new at2("Error parsing vorbis codec private");
        }
    }

    private static boolean e(o03 o03Var) throws at2 {
        try {
            int iN = o03Var.n();
            if (iN == 1) {
                return true;
            }
            if (iN == 65534) {
                o03Var.i(24);
                if (o03Var.s() == rv2.f8759d.getMostSignificantBits()) {
                    if (o03Var.s() == rv2.f8759d.getLeastSignificantBits()) {
                        return true;
                    }
                }
            }
            return false;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new at2("Error parsing MS/ACM codec private");
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0153  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(com.google.android.gms.internal.ads.bv2 r44, int r45) throws com.google.android.gms.internal.ads.at2 {
        /*
            Method dump skipped, instructions count: 1396
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.qv2.a(com.google.android.gms.internal.ads.bv2, int):void");
    }
}