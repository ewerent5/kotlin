package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.IdentityHashMap;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class gy2 implements dy2, cy2 {

    /* renamed from: e, reason: collision with root package name */
    public final dy2[] f6228e;

    /* renamed from: f, reason: collision with root package name */
    private final IdentityHashMap<qy2, Integer> f6229f = new IdentityHashMap<>();

    /* renamed from: g, reason: collision with root package name */
    private cy2 f6230g;

    /* renamed from: h, reason: collision with root package name */
    private int f6231h;

    /* renamed from: i, reason: collision with root package name */
    private vy2 f6232i;

    /* renamed from: j, reason: collision with root package name */
    private dy2[] f6233j;

    /* renamed from: k, reason: collision with root package name */
    private sy2 f6234k;

    public gy2(dy2... dy2VarArr) {
        this.f6228e = dy2VarArr;
    }

    @Override // com.google.android.gms.internal.ads.dy2, com.google.android.gms.internal.ads.sy2
    public final boolean a(long j2) {
        return this.f6234k.a(j2);
    }

    @Override // com.google.android.gms.internal.ads.ry2
    public final /* bridge */ /* synthetic */ void b(sy2 sy2Var) {
        if (this.f6232i == null) {
            return;
        }
        this.f6230g.b(this);
    }

    @Override // com.google.android.gms.internal.ads.dy2
    public final long d(long j2) {
        long jD = this.f6233j[0].d(j2);
        int i2 = 1;
        while (true) {
            dy2[] dy2VarArr = this.f6233j;
            if (i2 >= dy2VarArr.length) {
                return jD;
            }
            if (dy2VarArr[i2].d(jD) != jD) {
                throw new IllegalStateException("Children seeked to different positions");
            }
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.dy2
    public final long e(zy2[] zy2VarArr, boolean[] zArr, qy2[] qy2VarArr, boolean[] zArr2, long j2) {
        int length;
        qy2[] qy2VarArr2 = qy2VarArr;
        int length2 = zy2VarArr.length;
        int[] iArr = new int[length2];
        int[] iArr2 = new int[length2];
        int i2 = 0;
        while (true) {
            length = zy2VarArr.length;
            if (i2 >= length) {
                break;
            }
            qy2 qy2Var = qy2VarArr2[i2];
            iArr[i2] = qy2Var == null ? -1 : this.f6229f.get(qy2Var).intValue();
            iArr2[i2] = -1;
            zy2 zy2Var = zy2VarArr[i2];
            if (zy2Var != null) {
                uy2 uy2VarA = zy2Var.a();
                int i3 = 0;
                while (true) {
                    dy2[] dy2VarArr = this.f6228e;
                    if (i3 >= dy2VarArr.length) {
                        break;
                    }
                    if (dy2VarArr[i3].zzg().b(uy2VarA) != -1) {
                        iArr2[i2] = i3;
                        break;
                    }
                    i3++;
                }
            }
            i2++;
        }
        this.f6229f.clear();
        qy2[] qy2VarArr3 = new qy2[length];
        qy2[] qy2VarArr4 = new qy2[length];
        zy2[] zy2VarArr2 = new zy2[length];
        ArrayList arrayList = new ArrayList(this.f6228e.length);
        long j3 = j2;
        int i4 = 0;
        while (i4 < this.f6228e.length) {
            for (int i5 = 0; i5 < zy2VarArr.length; i5++) {
                zy2 zy2Var2 = null;
                qy2VarArr4[i5] = iArr[i5] == i4 ? qy2VarArr2[i5] : null;
                if (iArr2[i5] == i4) {
                    zy2Var2 = zy2VarArr[i5];
                }
                zy2VarArr2[i5] = zy2Var2;
            }
            int i6 = i4;
            zy2[] zy2VarArr3 = zy2VarArr2;
            ArrayList arrayList2 = arrayList;
            long jE = this.f6228e[i4].e(zy2VarArr2, zArr, qy2VarArr4, zArr2, j3);
            if (i6 == 0) {
                j3 = jE;
            } else if (jE != j3) {
                throw new IllegalStateException("Children enabled at different positions");
            }
            boolean z = false;
            for (int i7 = 0; i7 < zy2VarArr.length; i7++) {
                if (iArr2[i7] == i6) {
                    f03.d(qy2VarArr4[i7] != null);
                    qy2 qy2Var2 = qy2VarArr4[i7];
                    qy2VarArr3[i7] = qy2Var2;
                    this.f6229f.put(qy2Var2, Integer.valueOf(i6));
                    z = true;
                } else if (iArr[i7] == i6) {
                    f03.d(qy2VarArr4[i7] == null);
                }
            }
            if (z) {
                arrayList2.add(this.f6228e[i6]);
            }
            i4 = i6 + 1;
            arrayList = arrayList2;
            zy2VarArr2 = zy2VarArr3;
            qy2VarArr2 = qy2VarArr;
        }
        qy2[] qy2VarArr5 = qy2VarArr2;
        ArrayList arrayList3 = arrayList;
        System.arraycopy(qy2VarArr3, 0, qy2VarArr5, 0, length);
        dy2[] dy2VarArr2 = new dy2[arrayList3.size()];
        this.f6233j = dy2VarArr2;
        arrayList3.toArray(dy2VarArr2);
        this.f6234k = new rx2(this.f6233j);
        return j3;
    }

    @Override // com.google.android.gms.internal.ads.dy2
    public final void f(cy2 cy2Var, long j2) {
        this.f6230g = cy2Var;
        dy2[] dy2VarArr = this.f6228e;
        this.f6231h = dy2VarArr.length;
        for (dy2 dy2Var : dy2VarArr) {
            dy2Var.f(this, j2);
        }
    }

    @Override // com.google.android.gms.internal.ads.cy2
    public final void g(dy2 dy2Var) {
        int i2 = this.f6231h - 1;
        this.f6231h = i2;
        if (i2 > 0) {
            return;
        }
        int i3 = 0;
        for (dy2 dy2Var2 : this.f6228e) {
            i3 += dy2Var2.zzg().f9815b;
        }
        uy2[] uy2VarArr = new uy2[i3];
        int i4 = 0;
        for (dy2 dy2Var3 : this.f6228e) {
            vy2 vy2VarZzg = dy2Var3.zzg();
            int i5 = vy2VarZzg.f9815b;
            int i6 = 0;
            while (i6 < i5) {
                uy2VarArr[i4] = vy2VarZzg.a(i6);
                i6++;
                i4++;
            }
        }
        this.f6232i = new vy2(uy2VarArr);
        this.f6230g.g(this);
    }

    @Override // com.google.android.gms.internal.ads.dy2
    public final void l(long j2) {
        for (dy2 dy2Var : this.f6233j) {
            dy2Var.l(j2);
        }
    }

    @Override // com.google.android.gms.internal.ads.dy2, com.google.android.gms.internal.ads.sy2
    public final long zza() {
        return this.f6234k.zza();
    }

    @Override // com.google.android.gms.internal.ads.dy2
    public final void zzf() {
        for (dy2 dy2Var : this.f6228e) {
            dy2Var.zzf();
        }
    }

    @Override // com.google.android.gms.internal.ads.dy2
    public final vy2 zzg() {
        return this.f6232i;
    }

    @Override // com.google.android.gms.internal.ads.dy2
    public final long zzi() {
        long jZzi = this.f6228e[0].zzi();
        int i2 = 1;
        while (true) {
            dy2[] dy2VarArr = this.f6228e;
            if (i2 >= dy2VarArr.length) {
                if (jZzi != -9223372036854775807L) {
                    for (dy2 dy2Var : this.f6233j) {
                        if (dy2Var != this.f6228e[0] && dy2Var.d(jZzi) != jZzi) {
                            throw new IllegalStateException("Children seeked to different positions");
                        }
                    }
                }
                return jZzi;
            }
            if (dy2VarArr[i2].zzi() != -9223372036854775807L) {
                throw new IllegalStateException("Child reported discontinuity");
            }
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.dy2
    public final long zzj() {
        long jMin = Long.MAX_VALUE;
        for (dy2 dy2Var : this.f6233j) {
            long jZzj = dy2Var.zzj();
            if (jZzj != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jZzj);
            }
        }
        if (jMin == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }
}