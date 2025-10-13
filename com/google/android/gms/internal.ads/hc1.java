package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class hc1 implements ah1<ic1> {
    private final ah1<gh1> a;

    /* renamed from: b, reason: collision with root package name */
    private final qp1 f6323b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f6324c;

    /* renamed from: d, reason: collision with root package name */
    private final oq f6325d;

    public hc1(td1<gh1> td1Var, qp1 qp1Var, Context context, oq oqVar) {
        this.a = td1Var;
        this.f6323b = qp1Var;
        this.f6324c = context;
        this.f6325d = oqVar;
    }

    final /* synthetic */ ic1 a(gh1 gh1Var) {
        String str;
        boolean z;
        String strZzy;
        float f2;
        int i2;
        int i3;
        int i4;
        DisplayMetrics displayMetrics;
        r93 r93Var = this.f6323b.f8428e;
        r93[] r93VarArr = r93Var.f8621k;
        if (r93VarArr != null) {
            str = null;
            boolean z2 = false;
            boolean z3 = false;
            z = false;
            for (r93 r93Var2 : r93VarArr) {
                boolean z4 = r93Var2.f8623m;
                if (!z4 && !z2) {
                    str = r93Var2.f8615e;
                    z2 = true;
                }
                if (z4) {
                    if (z3) {
                        z3 = true;
                    } else {
                        z3 = true;
                        z = true;
                    }
                }
                if (z2 && z3) {
                    break;
                }
            }
        } else {
            str = r93Var.f8615e;
            z = r93Var.f8623m;
        }
        Resources resources = this.f6324c.getResources();
        if (resources == null || (displayMetrics = resources.getDisplayMetrics()) == null) {
            strZzy = null;
            f2 = 0.0f;
            i2 = 0;
            i3 = 0;
        } else {
            float f3 = displayMetrics.density;
            int i5 = displayMetrics.widthPixels;
            i3 = displayMetrics.heightPixels;
            strZzy = this.f6325d.l().zzy();
            i2 = i5;
            f2 = f3;
        }
        StringBuilder sb = new StringBuilder();
        r93[] r93VarArr2 = r93Var.f8621k;
        if (r93VarArr2 != null) {
            boolean z5 = false;
            for (r93 r93Var3 : r93VarArr2) {
                if (r93Var3.f8623m) {
                    z5 = true;
                } else {
                    if (sb.length() != 0) {
                        sb.append("|");
                    }
                    int i6 = r93Var3.f8619i;
                    if (i6 == -1) {
                        i6 = f2 != 0.0f ? (int) (r93Var3.f8620j / f2) : -1;
                    }
                    sb.append(i6);
                    sb.append("x");
                    int i7 = r93Var3.f8616f;
                    if (i7 == -2) {
                        i7 = f2 != 0.0f ? (int) (r93Var3.f8617g / f2) : -2;
                    }
                    sb.append(i7);
                }
            }
            if (z5) {
                if (sb.length() != 0) {
                    i4 = 0;
                    sb.insert(0, "|");
                } else {
                    i4 = 0;
                }
                sb.insert(i4, "320x50");
            }
        }
        return new ic1(r93Var, str, z, sb.toString(), f2, i2, i3, strZzy, this.f6323b.p);
    }

    @Override // com.google.android.gms.internal.ads.ah1
    public final g52<ic1> zza() {
        return y42.i(this.a.zza(), new x02(this) { // from class: com.google.android.gms.internal.ads.gc1
            private final hc1 a;

            {
                this.a = this;
            }

            @Override // com.google.android.gms.internal.ads.x02
            public final Object apply(Object obj) {
                return this.a.a((gh1) obj);
            }
        }, qr.f8451f);
    }
}