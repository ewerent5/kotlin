package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class vz implements il1 {
    private Context a;

    /* renamed from: b, reason: collision with root package name */
    private String f9818b;

    /* renamed from: c, reason: collision with root package name */
    private r93 f9819c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ p00 f9820d;

    /* synthetic */ vz(p00 p00Var, dz dzVar) {
        this.f9820d = p00Var;
    }

    @Override // com.google.android.gms.internal.ads.il1
    public final /* bridge */ /* synthetic */ il1 a(Context context) {
        Objects.requireNonNull(context);
        this.a = context;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.il1
    public final /* bridge */ /* synthetic */ il1 b(r93 r93Var) {
        Objects.requireNonNull(r93Var);
        this.f9819c = r93Var;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.il1
    public final /* bridge */ /* synthetic */ il1 d(String str) {
        Objects.requireNonNull(str);
        this.f9818b = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.il1
    public final jl1 zza() {
        ro2.c(this.a, Context.class);
        ro2.c(this.f9818b, String.class);
        ro2.c(this.f9819c, r93.class);
        return new wz(this.f9820d, this.a, this.f9818b, this.f9819c, null);
    }
}