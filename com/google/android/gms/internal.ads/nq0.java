package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zza;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class nq0 implements Callable<pq0> {
    private final zza a;

    /* renamed from: b */
    private final qw f7771b;

    /* renamed from: c */
    private final Context f7772c;

    /* renamed from: d */
    private final nu0 f7773d;

    /* renamed from: e */
    private final cu1 f7774e;

    /* renamed from: f */
    private final x21 f7775f;

    /* renamed from: g */
    private final Executor f7776g;

    /* renamed from: h */
    private final ip2 f7777h;

    /* renamed from: i */
    private final kr f7778i;

    /* renamed from: j */
    private final vu1 f7779j;

    public nq0(Context context, Executor executor, ip2 ip2Var, kr krVar, zza zzaVar, qw qwVar, x21 x21Var, vu1 vu1Var, nu0 nu0Var, cu1 cu1Var) {
        this.f7772c = context;
        this.f7776g = executor;
        this.f7777h = ip2Var;
        this.f7778i = krVar;
        this.a = zzaVar;
        this.f7771b = qwVar;
        this.f7775f = x21Var;
        this.f7779j = vu1Var;
        this.f7773d = nu0Var;
        this.f7774e = cu1Var;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ pq0 call() {
        pq0 pq0Var = new pq0(this);
        pq0Var.a();
        return pq0Var;
    }
}