package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class i00 implements qo1 {
    private Context a;

    /* renamed from: b, reason: collision with root package name */
    private String f6451b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ p00 f6452c;

    /* synthetic */ i00(p00 p00Var, dz dzVar) {
        this.f6452c = p00Var;
    }

    @Override // com.google.android.gms.internal.ads.qo1
    public final /* bridge */ /* synthetic */ qo1 c(String str) {
        this.f6451b = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.qo1
    public final /* bridge */ /* synthetic */ qo1 n(Context context) {
        Objects.requireNonNull(context);
        this.a = context;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.qo1
    public final ro1 zza() {
        ro2.c(this.a, Context.class);
        return new j00(this.f6452c, this.a, this.f6451b, null);
    }
}