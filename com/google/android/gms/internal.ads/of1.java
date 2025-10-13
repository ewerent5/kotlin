package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzs;
import java.util.Set;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class of1 implements ah1<pf1> {
    private final h52 a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f7940b;

    /* renamed from: c, reason: collision with root package name */
    private final Set<String> f7941c;

    public of1(h52 h52Var, Context context, Set<String> set) {
        this.a = h52Var;
        this.f7940b = context;
        this.f7941c = set;
    }

    final /* synthetic */ pf1 a() {
        if (((Boolean) c.c().b(w3.i3)).booleanValue()) {
            Set<String> set = this.f7941c;
            if (set.contains("rewarded") || set.contains("interstitial") || set.contains("native") || set.contains("banner")) {
                return new pf1(zzs.zzr().n(this.f7940b));
            }
        }
        return new pf1(null);
    }

    @Override // com.google.android.gms.internal.ads.ah1
    public final g52<pf1> zza() {
        return this.a.N(new Callable(this) { // from class: com.google.android.gms.internal.ads.nf1
            private final of1 a;

            {
                this.a = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.a();
            }
        });
    }
}