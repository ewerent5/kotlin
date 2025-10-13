package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zze;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class rd implements ba<he> {
    final /* synthetic */ fe a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ad f8633b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ge f8634c;

    rd(ge geVar, fe feVar, ad adVar) {
        this.f8634c = geVar;
        this.a = feVar;
        this.f8633b = adVar;
    }

    @Override // com.google.android.gms.internal.ads.ba
    public final /* bridge */ /* synthetic */ void a(he heVar, Map map) {
        synchronized (this.f8634c.a) {
            if (this.a.d() != -1 && this.a.d() != 1) {
                this.f8634c.f6110h = 0;
                ad adVar = this.f8633b;
                adVar.I("/log", aa.f4875h);
                adVar.I("/result", aa.p);
                this.a.b(this.f8633b);
                this.f8634c.f6109g = this.a;
                zze.zza("Successfully loaded JS Engine.");
            }
        }
    }
}