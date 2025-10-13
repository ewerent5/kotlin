package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class pz implements wj1 {
    private Context a;

    /* renamed from: b, reason: collision with root package name */
    private String f8306b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ p00 f8307c;

    /* synthetic */ pz(p00 p00Var, dz dzVar) {
        this.f8307c = p00Var;
    }

    @Override // com.google.android.gms.internal.ads.wj1
    public final /* bridge */ /* synthetic */ wj1 c(String str) {
        Objects.requireNonNull(str);
        this.f8306b = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.wj1
    public final /* bridge */ /* synthetic */ wj1 n(Context context) {
        Objects.requireNonNull(context);
        this.a = context;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.wj1
    public final xj1 zza() {
        ro2.c(this.a, Context.class);
        ro2.c(this.f8306b, String.class);
        return new qz(this.f8307c, this.a, this.f8306b, null);
    }
}