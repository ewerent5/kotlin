package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class yz implements vv0 {
    private Context a;

    /* renamed from: b, reason: collision with root package name */
    private xa f10514b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ p00 f10515c;

    /* synthetic */ yz(p00 p00Var, dz dzVar) {
        this.f10515c = p00Var;
    }

    @Override // com.google.android.gms.internal.ads.vv0
    public final /* bridge */ /* synthetic */ vv0 a(xa xaVar) {
        Objects.requireNonNull(xaVar);
        this.f10514b = xaVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.vv0
    public final /* bridge */ /* synthetic */ vv0 n(Context context) {
        Objects.requireNonNull(context);
        this.a = context;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.vv0
    public final wv0 zza() {
        ro2.c(this.a, Context.class);
        ro2.c(this.f10514b, xa.class);
        return new c00(this.f10515c, this.a, this.f10514b, null);
    }
}