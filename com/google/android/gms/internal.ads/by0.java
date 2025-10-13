package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final /* synthetic */ class by0 implements Callable {
    private final ip2 a;

    /* renamed from: b */
    private final Context f5217b;

    by0(ip2 ip2Var, Context context) {
        this.a = ip2Var;
        this.f5217b = context;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        ip2 ip2Var = this.a;
        return ip2Var.b().zzl(this.f5217b);
    }
}