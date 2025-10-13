package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import com.google.android.gms.ads.internal.util.zzg;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class w90 implements mo2<v90> {
    private final wo2<st1> a;

    /* renamed from: b */
    private final wo2<kr> f9922b;

    /* renamed from: c */
    private final wo2<ApplicationInfo> f9923c;

    /* renamed from: d */
    private final wo2<String> f9924d;

    /* renamed from: e */
    private final wo2<List<String>> f9925e;

    /* renamed from: f */
    private final wo2<PackageInfo> f9926f;

    /* renamed from: g */
    private final wo2<g52<String>> f9927g;

    /* renamed from: h */
    private final wo2<zzg> f9928h;

    /* renamed from: i */
    private final wo2<String> f9929i;

    /* renamed from: j */
    private final wo2<eh1<Bundle>> f9930j;

    public w90(wo2<st1> wo2Var, wo2<kr> wo2Var2, wo2<ApplicationInfo> wo2Var3, wo2<String> wo2Var4, wo2<List<String>> wo2Var5, wo2<PackageInfo> wo2Var6, wo2<g52<String>> wo2Var7, wo2<zzg> wo2Var8, wo2<String> wo2Var9, wo2<eh1<Bundle>> wo2Var10) {
        this.a = wo2Var;
        this.f9922b = wo2Var2;
        this.f9923c = wo2Var3;
        this.f9924d = wo2Var4;
        this.f9925e = wo2Var5;
        this.f9926f = wo2Var6;
        this.f9927g = wo2Var7;
        this.f9928h = wo2Var8;
        this.f9929i = wo2Var9;
        this.f9930j = wo2Var10;
    }

    @Override // com.google.android.gms.internal.ads.wo2
    /* renamed from: a */
    public final v90 zzb() {
        return new v90(this.a.zzb(), ((qy) this.f9922b).a(), ((fy0) this.f9923c).zzb(), ((my0) this.f9924d).zzb(), w3.c(), this.f9926f.zzb(), lo2.b(this.f9927g), ((uq1) this.f9928h).zzb(), this.f9929i.zzb(), ((fh1) this.f9930j).zzb());
    }
}