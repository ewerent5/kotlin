package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import android.os.Bundle;
import com.google.android.gms.ads.internal.util.zzg;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class kf1 implements ah1<lf1> {
    private final h52 a;

    /* renamed from: b, reason: collision with root package name */
    private final qp1 f6990b;

    /* renamed from: c, reason: collision with root package name */
    private final PackageInfo f6991c;

    /* renamed from: d, reason: collision with root package name */
    private final zzg f6992d;

    public kf1(h52 h52Var, qp1 qp1Var, PackageInfo packageInfo, zzg zzgVar) {
        this.a = h52Var;
        this.f6990b = qp1Var;
        this.f6991c = packageInfo;
        this.f6992d = zzgVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x0106  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final /* synthetic */ void a(java.util.ArrayList r9, android.os.Bundle r10) {
        /*
            Method dump skipped, instructions count: 295
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.kf1.a(java.util.ArrayList, android.os.Bundle):void");
    }

    final /* bridge */ /* synthetic */ lf1 b() {
        final ArrayList<String> arrayList = this.f6990b.f8430g;
        return arrayList == null ? hf1.a : arrayList.isEmpty() ? if1.a : new lf1(this, arrayList) { // from class: com.google.android.gms.internal.ads.jf1
            private final kf1 a;

            /* renamed from: b, reason: collision with root package name */
            private final ArrayList f6745b;

            {
                this.a = this;
                this.f6745b = arrayList;
            }

            @Override // com.google.android.gms.internal.ads.zg1
            public final void a(Bundle bundle) {
                this.a.a(this.f6745b, bundle);
            }
        };
    }

    @Override // com.google.android.gms.internal.ads.ah1
    public final g52<lf1> zza() {
        return this.a.N(new Callable(this) { // from class: com.google.android.gms.internal.ads.gf1
            private final kf1 a;

            {
                this.a = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.b();
            }
        });
    }
}