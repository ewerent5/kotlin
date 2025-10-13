package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class g00 implements cn1 {
    private Context a;

    /* renamed from: b, reason: collision with root package name */
    private String f5994b;

    /* renamed from: c, reason: collision with root package name */
    private r93 f5995c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ p00 f5996d;

    /* synthetic */ g00(p00 p00Var, dz dzVar) {
        this.f5996d = p00Var;
    }

    @Override // com.google.android.gms.internal.ads.cn1
    public final /* bridge */ /* synthetic */ cn1 a(Context context) {
        Objects.requireNonNull(context);
        this.a = context;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.cn1
    public final /* bridge */ /* synthetic */ cn1 b(r93 r93Var) {
        Objects.requireNonNull(r93Var);
        this.f5995c = r93Var;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.cn1
    public final /* bridge */ /* synthetic */ cn1 d(String str) {
        Objects.requireNonNull(str);
        this.f5994b = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.cn1
    public final dn1 zza() {
        ro2.c(this.a, Context.class);
        ro2.c(this.f5994b, String.class);
        ro2.c(this.f5995c, r93.class);
        return new h00(this.f5996d, this.a, this.f5994b, this.f5995c, null);
    }
}