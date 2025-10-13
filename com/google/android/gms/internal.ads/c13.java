package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class c13 {
    public final List<byte[]> a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5237b;

    private c13(List<byte[]> list, int i2) {
        this.a = list;
        this.f5237b = i2;
    }

    public static c13 a(o03 o03Var) throws at2 {
        try {
            o03Var.j(21);
            int iL = o03Var.l() & 3;
            int iL2 = o03Var.l();
            int iG = o03Var.g();
            int i2 = 0;
            for (int i3 = 0; i3 < iL2; i3++) {
                o03Var.j(1);
                int iM = o03Var.m();
                for (int i4 = 0; i4 < iM; i4++) {
                    int iM2 = o03Var.m();
                    i2 += iM2 + 4;
                    o03Var.j(iM2);
                }
            }
            o03Var.i(iG);
            byte[] bArr = new byte[i2];
            int i5 = 0;
            for (int i6 = 0; i6 < iL2; i6++) {
                o03Var.j(1);
                int iM3 = o03Var.m();
                for (int i7 = 0; i7 < iM3; i7++) {
                    int iM4 = o03Var.m();
                    System.arraycopy(m03.a, 0, bArr, i5, 4);
                    int i8 = i5 + 4;
                    System.arraycopy(o03Var.a, o03Var.g(), bArr, i8, iM4);
                    i5 = i8 + iM4;
                    o03Var.j(iM4);
                }
            }
            return new c13(i2 == 0 ? null : Collections.singletonList(bArr), iL + 1);
        } catch (ArrayIndexOutOfBoundsException e2) {
            throw new at2("Error parsing HEVC config", e2);
        }
    }
}