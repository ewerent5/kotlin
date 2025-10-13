package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class ky2 implements fy2 {

    /* renamed from: e, reason: collision with root package name */
    private final fy2[] f7126e;

    /* renamed from: f, reason: collision with root package name */
    private final ArrayList<fy2> f7127f;

    /* renamed from: h, reason: collision with root package name */
    private ey2 f7129h;

    /* renamed from: i, reason: collision with root package name */
    private jt2 f7130i;

    /* renamed from: k, reason: collision with root package name */
    private iy2 f7132k;

    /* renamed from: g, reason: collision with root package name */
    private final it2 f7128g = new it2();

    /* renamed from: j, reason: collision with root package name */
    private int f7131j = -1;

    public ky2(fy2... fy2VarArr) {
        this.f7126e = fy2VarArr;
        this.f7127f = new ArrayList<>(Arrays.asList(fy2VarArr));
    }

    static /* synthetic */ void c(ky2 ky2Var, int i2, jt2 jt2Var, Object obj) {
        if (ky2Var.f7132k == null) {
            for (int i3 = 0; i3 <= 0; i3++) {
                jt2Var.g(i3, ky2Var.f7128g, false);
            }
            int i4 = ky2Var.f7131j;
            if (i4 == -1) {
                ky2Var.f7131j = 1;
            } else {
                iy2 iy2Var = i4 != 1 ? new iy2(1) : null;
                ky2Var.f7132k = iy2Var;
            }
            ky2Var.f7132k = iy2Var;
        }
        if (ky2Var.f7132k != null) {
            return;
        }
        ky2Var.f7127f.remove(ky2Var.f7126e[i2]);
        if (i2 == 0) {
            ky2Var.f7130i = jt2Var;
        }
        if (ky2Var.f7127f.isEmpty()) {
            ky2Var.f7129h.c(ky2Var.f7130i, null);
        }
    }

    @Override // com.google.android.gms.internal.ads.fy2
    public final dy2 a(int i2, sz2 sz2Var) {
        int length = this.f7126e.length;
        dy2[] dy2VarArr = new dy2[length];
        for (int i3 = 0; i3 < length; i3++) {
            dy2VarArr[i3] = this.f7126e[i3].a(i2, sz2Var);
        }
        return new gy2(dy2VarArr);
    }

    @Override // com.google.android.gms.internal.ads.fy2
    public final void b(ns2 ns2Var, boolean z, ey2 ey2Var) {
        this.f7129h = ey2Var;
        int i2 = 0;
        while (true) {
            fy2[] fy2VarArr = this.f7126e;
            if (i2 >= fy2VarArr.length) {
                return;
            }
            fy2VarArr[i2].b(ns2Var, false, new hy2(this, i2));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.fy2
    public final void d(dy2 dy2Var) {
        gy2 gy2Var = (gy2) dy2Var;
        int i2 = 0;
        while (true) {
            fy2[] fy2VarArr = this.f7126e;
            if (i2 >= fy2VarArr.length) {
                return;
            }
            fy2VarArr[i2].d(gy2Var.f6228e[i2]);
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.fy2
    public final void zzb() throws iy2 {
        iy2 iy2Var = this.f7132k;
        if (iy2Var != null) {
            throw iy2Var;
        }
        for (fy2 fy2Var : this.f7126e) {
            fy2Var.zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.fy2
    public final void zzd() {
        for (fy2 fy2Var : this.f7126e) {
            fy2Var.zzd();
        }
    }
}