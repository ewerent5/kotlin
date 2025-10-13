package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class wh1 implements ah1<xh1> {
    private final Executor a;

    /* renamed from: b, reason: collision with root package name */
    private final String f9963b;

    /* renamed from: c, reason: collision with root package name */
    private final PackageInfo f9964c;

    /* renamed from: d, reason: collision with root package name */
    private final hq f9965d;

    public wh1(hq hqVar, Executor executor, String str, PackageInfo packageInfo, int i2, byte[] bArr) {
        this.f9965d = hqVar;
        this.a = executor;
        this.f9963b = str;
        this.f9964c = packageInfo;
    }

    final /* synthetic */ g52 a(Throwable th) {
        return y42.a(new xh1(this.f9963b));
    }

    @Override // com.google.android.gms.internal.ads.ah1
    public final g52<xh1> zza() {
        return y42.f(y42.i(y42.a(this.f9963b), uh1.a, this.a), Throwable.class, new e42(this) { // from class: com.google.android.gms.internal.ads.vh1
            private final wh1 a;

            {
                this.a = this;
            }

            @Override // com.google.android.gms.internal.ads.e42
            public final g52 zza(Object obj) {
                return this.a.a((Throwable) obj);
            }
        }, this.a);
    }
}