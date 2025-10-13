package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.zzas;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class ve {
    static final zzas<ad> a = new te();

    /* renamed from: b, reason: collision with root package name */
    static final zzas<ad> f9687b = new ue();

    /* renamed from: c, reason: collision with root package name */
    private final ge f9688c;

    public ve(Context context, kr krVar, String str) {
        this.f9688c = new ge(context, krVar, str, a, f9687b);
    }

    public final <I, O> ke<I, O> a(String str, ne<I> neVar, me<O> meVar) {
        return new ze(this.f9688c, str, neVar, meVar);
    }

    public final ef b() {
        return new ef(this.f9688c);
    }
}