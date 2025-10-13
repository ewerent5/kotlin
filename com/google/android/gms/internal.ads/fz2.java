package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.Arrays;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public abstract class fz2 extends jz2 {

    /* renamed from: b, reason: collision with root package name */
    private final SparseArray<Map<vy2, ez2>> f5991b = new SparseArray<>();

    /* renamed from: c, reason: collision with root package name */
    private final SparseBooleanArray f5992c = new SparseBooleanArray();

    /* renamed from: d, reason: collision with root package name */
    private dz2 f5993d;

    @Override // com.google.android.gms.internal.ads.jz2
    public final lz2 a(dt2[] dt2VarArr, vy2 vy2Var) {
        int[] iArr;
        int[] iArr2 = new int[3];
        uy2[][] uy2VarArr = new uy2[3][];
        int[][][] iArr3 = new int[3][][];
        for (int i2 = 0; i2 < 3; i2++) {
            int i3 = vy2Var.f9815b;
            uy2VarArr[i2] = new uy2[i3];
            iArr3[i2] = new int[i3][];
        }
        int i4 = 2;
        int[] iArr4 = new int[2];
        for (int i5 = 0; i5 < 2; i5++) {
            dt2VarArr[i5].zzq();
            iArr4[i5] = 4;
        }
        int i6 = 0;
        while (i6 < vy2Var.f9815b) {
            uy2 uy2VarA = vy2Var.a(i6);
            int i7 = 0;
            int i8 = 0;
            int i9 = 2;
            while (true) {
                if (i7 >= i4) {
                    i7 = i9;
                    break;
                }
                dt2 dt2Var = dt2VarArr[i7];
                for (int i10 = 0; i10 < uy2VarA.a; i10++) {
                    int iB = dt2Var.b(uy2VarA.a(i10)) & 3;
                    if (iB > i8) {
                        if (iB == 3) {
                            break;
                        }
                        i9 = i7;
                        i8 = iB;
                    }
                }
                i7++;
                i4 = 2;
            }
            if (i7 == 2) {
                iArr = new int[uy2VarA.a];
            } else {
                dt2 dt2Var2 = dt2VarArr[i7];
                int[] iArr5 = new int[uy2VarA.a];
                for (int i11 = 0; i11 < uy2VarA.a; i11++) {
                    iArr5[i11] = dt2Var2.b(uy2VarA.a(i11));
                }
                iArr = iArr5;
            }
            int i12 = iArr2[i7];
            uy2VarArr[i7][i12] = uy2VarA;
            iArr3[i7][i12] = iArr;
            iArr2[i7] = i12 + 1;
            i6++;
            i4 = 2;
        }
        vy2[] vy2VarArr = new vy2[2];
        int[] iArr6 = new int[2];
        int i13 = 0;
        for (int i14 = 2; i13 < i14; i14 = 2) {
            int i15 = iArr2[i13];
            vy2VarArr[i13] = new vy2((uy2[]) Arrays.copyOf(uy2VarArr[i13], i15));
            iArr3[i13] = (int[][]) Arrays.copyOf(iArr3[i13], i15);
            iArr6[i13] = dt2VarArr[i13].zza();
            i13++;
        }
        vy2 vy2Var2 = new vy2((uy2[]) Arrays.copyOf(uy2VarArr[2], iArr2[2]));
        zy2[] zy2VarArrE = e(dt2VarArr, vy2VarArr, iArr3);
        int i16 = 0;
        for (int i17 = 2; i16 < i17; i17 = 2) {
            if (this.f5992c.get(i16)) {
                zy2VarArrE[i16] = null;
            } else {
                vy2 vy2Var3 = vy2VarArr[i16];
                Map<vy2, ez2> map = this.f5991b.get(i16);
                if ((map == null ? null : map.get(vy2Var3)) != null) {
                    throw null;
                }
            }
            i16++;
        }
        dz2 dz2Var = new dz2(iArr6, vy2VarArr, iArr4, iArr3, vy2Var2);
        ft2[] ft2VarArr = new ft2[2];
        for (int i18 = 0; i18 < 2; i18++) {
            ft2VarArr[i18] = zy2VarArrE[i18] != null ? ft2.a : null;
        }
        return new lz2(vy2Var, new hz2(zy2VarArrE, null), dz2Var, ft2VarArr);
    }

    @Override // com.google.android.gms.internal.ads.jz2
    public final void b(Object obj) {
        this.f5993d = (dz2) obj;
    }

    protected abstract zy2[] e(dt2[] dt2VarArr, vy2[] vy2VarArr, int[][][] iArr);

    public final void f(int i2, boolean z) {
        if (this.f5992c.get(i2) == z) {
            return;
        }
        this.f5992c.put(i2, z);
        d();
    }
}