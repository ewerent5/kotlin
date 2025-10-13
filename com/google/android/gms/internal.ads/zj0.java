package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class zj0 implements v60<z60> {
    private final Map<String, j31<z60>> a;

    /* renamed from: b, reason: collision with root package name */
    private final Map<String, j31<ol0>> f10605b;

    /* renamed from: c, reason: collision with root package name */
    private final Map<String, b61<ol0>> f10606c;

    /* renamed from: d, reason: collision with root package name */
    private final wo2<v60<r40>> f10607d;

    /* renamed from: e, reason: collision with root package name */
    private final fm0 f10608e;

    zj0(Map<String, j31<z60>> map, Map<String, j31<ol0>> map2, Map<String, b61<ol0>> map3, wo2<v60<r40>> wo2Var, fm0 fm0Var) {
        this.a = map;
        this.f10605b = map2;
        this.f10606c = map3;
        this.f10607d = wo2Var;
        this.f10608e = fm0Var;
    }

    @Override // com.google.android.gms.internal.ads.v60
    public final j31<z60> a(int i2, String str) {
        j31<r40> j31VarA;
        j31<z60> j31Var = this.a.get(str);
        if (j31Var != null) {
            return j31Var;
        }
        if (i2 == 1) {
            if (this.f10608e.d() == null || (j31VarA = this.f10607d.zzb().a(i2, str)) == null) {
                return null;
            }
            return z60.b(j31VarA);
        }
        if (i2 != 4) {
            return null;
        }
        b61<ol0> b61Var = this.f10606c.get(str);
        if (b61Var != null) {
            return z60.a(b61Var);
        }
        j31<ol0> j31Var2 = this.f10605b.get(str);
        if (j31Var2 == null) {
            return null;
        }
        return z60.b(j31Var2);
    }
}