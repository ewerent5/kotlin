package com.google.android.gms.internal.ads;

import android.graphics.Color;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public final class z5 extends k6 {

    /* renamed from: e, reason: collision with root package name */
    private static final int f10555e;

    /* renamed from: f, reason: collision with root package name */
    private static final int f10556f;

    /* renamed from: g, reason: collision with root package name */
    static final int f10557g;

    /* renamed from: h, reason: collision with root package name */
    static final int f10558h;

    /* renamed from: i, reason: collision with root package name */
    private final String f10559i;

    /* renamed from: j, reason: collision with root package name */
    private final List<c6> f10560j = new ArrayList();

    /* renamed from: k, reason: collision with root package name */
    private final List<t6> f10561k = new ArrayList();

    /* renamed from: l, reason: collision with root package name */
    private final int f10562l;

    /* renamed from: m, reason: collision with root package name */
    private final int f10563m;
    private final int n;
    private final int o;
    private final int p;

    static {
        int iRgb = Color.rgb(12, 174, 206);
        f10555e = iRgb;
        int iRgb2 = Color.rgb(204, 204, 204);
        f10556f = iRgb2;
        f10557g = iRgb2;
        f10558h = iRgb;
    }

    public z5(String str, List<c6> list, Integer num, Integer num2, Integer num3, int i2, int i3, boolean z) {
        this.f10559i = str;
        for (int i4 = 0; i4 < list.size(); i4++) {
            c6 c6Var = list.get(i4);
            this.f10560j.add(c6Var);
            this.f10561k.add(c6Var);
        }
        this.f10562l = num != null ? num.intValue() : f10557g;
        this.f10563m = num2 != null ? num2.intValue() : f10558h;
        this.n = num3 != null ? num3.intValue() : 12;
        this.o = i2;
        this.p = i3;
    }

    public final int J4() {
        return this.n;
    }

    public final int K4() {
        return this.o;
    }

    @Override // com.google.android.gms.internal.ads.l6
    public final String zzb() {
        return this.f10559i;
    }

    @Override // com.google.android.gms.internal.ads.l6
    public final List<t6> zzc() {
        return this.f10561k;
    }

    public final List<c6> zzd() {
        return this.f10560j;
    }

    public final int zze() {
        return this.f10562l;
    }

    public final int zzf() {
        return this.f10563m;
    }

    public final int zzi() {
        return this.p;
    }
}