package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzs;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class wl implements Callable<vl> {
    final /* synthetic */ Context a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ yl f9988b;

    wl(yl ylVar, Context context) {
        this.f9988b = ylVar;
        this.a = context;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ vl call() {
        xl xlVar = (xl) this.f9988b.a.get(this.a);
        vl vlVarA = (xlVar == null || xlVar.a + c5.a.e().longValue() < zzs.zzj().a()) ? new ul(this.a).a() : new ul(this.a, xlVar.f10188b).a();
        this.f9988b.a.put(this.a, new xl(this.f9988b, vlVarA));
        return vlVarA;
    }
}