package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.zzg;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class po {
    private Context a;

    /* renamed from: b, reason: collision with root package name */
    private com.google.android.gms.common.util.f f8211b;

    /* renamed from: c, reason: collision with root package name */
    private zzg f8212c;

    /* renamed from: d, reason: collision with root package name */
    private kp f8213d;

    /* synthetic */ po(oo ooVar) {
    }

    public final po a(Context context) {
        Objects.requireNonNull(context);
        this.a = context;
        return this;
    }

    public final po b(com.google.android.gms.common.util.f fVar) {
        Objects.requireNonNull(fVar);
        this.f8211b = fVar;
        return this;
    }

    public final po c(zzg zzgVar) {
        this.f8212c = zzgVar;
        return this;
    }

    public final po d(kp kpVar) {
        this.f8213d = kpVar;
        return this;
    }

    public final lp e() {
        ro2.c(this.a, Context.class);
        ro2.c(this.f8211b, com.google.android.gms.common.util.f.class);
        ro2.c(this.f8212c, zzg.class);
        ro2.c(this.f8213d, kp.class);
        return new ro(this.a, this.f8211b, this.f8212c, this.f8213d, null);
    }
}