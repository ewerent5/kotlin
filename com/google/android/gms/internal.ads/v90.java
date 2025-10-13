package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import com.google.android.gms.ads.internal.util.zzg;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class v90 {
    private final st1 a;

    /* renamed from: b */
    private final kr f9672b;

    /* renamed from: c */
    private final ApplicationInfo f9673c;

    /* renamed from: d */
    private final String f9674d;

    /* renamed from: e */
    private final List<String> f9675e;

    /* renamed from: f */
    private final PackageInfo f9676f;

    /* renamed from: g */
    private final go2<g52<String>> f9677g;

    /* renamed from: h */
    private final String f9678h;

    /* renamed from: i */
    private final eh1<Bundle> f9679i;

    public v90(st1 st1Var, kr krVar, ApplicationInfo applicationInfo, String str, List<String> list, PackageInfo packageInfo, go2<g52<String>> go2Var, zzg zzgVar, String str2, eh1<Bundle> eh1Var) {
        this.a = st1Var;
        this.f9672b = krVar;
        this.f9673c = applicationInfo;
        this.f9674d = str;
        this.f9675e = list;
        this.f9676f = packageInfo;
        this.f9677g = go2Var;
        this.f9678h = str2;
        this.f9679i = eh1Var;
    }

    public final g52<Bundle> a() {
        st1 st1Var = this.a;
        return ct1.a(this.f9679i.a(new Bundle()), lt1.SIGNALS, st1Var).i();
    }

    public final g52<ql> b() {
        final g52<Bundle> g52VarA = a();
        return this.a.b(lt1.REQUEST_PARCEL, g52VarA, this.f9677g.zzb()).a(new Callable(this, g52VarA) { // from class: com.google.android.gms.internal.ads.u90
            private final v90 a;

            /* renamed from: b, reason: collision with root package name */
            private final g52 f9407b;

            {
                this.a = this;
                this.f9407b = g52VarA;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.c(this.f9407b);
            }
        }).i();
    }

    /* JADX WARN: Multi-variable type inference failed */
    final /* synthetic */ ql c(g52 g52Var) {
        return new ql((Bundle) g52Var.get(), this.f9672b, this.f9673c, this.f9674d, this.f9675e, this.f9676f, this.f9677g.zzb().get(), this.f9678h, null, null);
    }
}