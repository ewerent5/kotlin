package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class rl1<R> implements zr1 {
    public final lm1<R> a;

    /* renamed from: b, reason: collision with root package name */
    public final nm1 f8676b;

    /* renamed from: c, reason: collision with root package name */
    public final m93 f8677c;

    /* renamed from: d, reason: collision with root package name */
    public final String f8678d;

    /* renamed from: e, reason: collision with root package name */
    public final Executor f8679e;

    /* renamed from: f, reason: collision with root package name */
    public final y93 f8680f;

    /* renamed from: g, reason: collision with root package name */
    @Nullable
    public final nr1 f8681g;

    public rl1(lm1<R> lm1Var, nm1 nm1Var, m93 m93Var, String str, Executor executor, y93 y93Var, @Nullable nr1 nr1Var) {
        this.a = lm1Var;
        this.f8676b = nm1Var;
        this.f8677c = m93Var;
        this.f8678d = str;
        this.f8679e = executor;
        this.f8680f = y93Var;
        this.f8681g = nr1Var;
    }

    @Override // com.google.android.gms.internal.ads.zr1
    public final Executor zza() {
        return this.f8679e;
    }

    @Override // com.google.android.gms.internal.ads.zr1
    @Nullable
    public final nr1 zzb() {
        return this.f8681g;
    }

    @Override // com.google.android.gms.internal.ads.zr1
    public final zr1 zzc() {
        return new rl1(this.a, this.f8676b, this.f8677c, this.f8678d, this.f8679e, this.f8680f, this.f8681g);
    }
}