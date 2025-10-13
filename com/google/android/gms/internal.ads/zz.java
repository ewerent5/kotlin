package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class zz implements nv0 {
    private Long a;

    /* renamed from: b, reason: collision with root package name */
    private String f10667b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ c00 f10668c;

    /* synthetic */ zz(c00 c00Var, dz dzVar) {
        this.f10668c = c00Var;
    }

    @Override // com.google.android.gms.internal.ads.nv0
    public final /* bridge */ /* synthetic */ nv0 a(long j2) {
        this.a = Long.valueOf(j2);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.nv0
    public final /* bridge */ /* synthetic */ nv0 c(String str) {
        Objects.requireNonNull(str);
        this.f10667b = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.nv0
    public final ov0 zza() {
        ro2.c(this.a, Long.class);
        ro2.c(this.f10667b, String.class);
        return new b00(this.f10668c, this.a, this.f10667b, null);
    }
}