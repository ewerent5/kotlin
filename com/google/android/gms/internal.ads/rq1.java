package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import java.util.HashSet;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class rq1 implements ta0 {

    /* renamed from: e, reason: collision with root package name */
    @GuardedBy("this")
    private final HashSet<jq> f8707e = new HashSet<>();

    /* renamed from: f, reason: collision with root package name */
    private final Context f8708f;

    /* renamed from: g, reason: collision with root package name */
    private final sq f8709g;

    public rq1(Context context, sq sqVar) {
        this.f8708f = context;
        this.f8709g = sqVar;
    }

    @Override // com.google.android.gms.internal.ads.ta0
    public final synchronized void B0(g93 g93Var) {
        if (g93Var.f6091e != 3) {
            this.f8709g.b(this.f8707e);
        }
    }

    public final synchronized void a(HashSet<jq> hashSet) {
        this.f8707e.clear();
        this.f8707e.addAll(hashSet);
    }

    public final Bundle b() {
        return this.f8709g.i(this.f8708f, this);
    }
}