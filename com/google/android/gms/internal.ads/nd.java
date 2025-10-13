package com.google.android.gms.internal.ads;

import ch.qos.logback.core.spi.AbstractComponentTracker;
import com.google.android.gms.ads.internal.util.zzr;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final /* synthetic */ class nd implements zc {
    private final ge a;

    /* renamed from: b */
    private final fe f7692b;

    /* renamed from: c */
    private final ad f7693c;

    nd(ge geVar, fe feVar, ad adVar) {
        this.a = geVar;
        this.f7692b = feVar;
        this.f7693c = adVar;
    }

    @Override // com.google.android.gms.internal.ads.zc
    public final void zza() {
        zzr.zza.postDelayed(new Runnable(this.a, this.f7692b, this.f7693c) { // from class: com.google.android.gms.internal.ads.od

            /* renamed from: e */
            private final ge f7936e;

            /* renamed from: f */
            private final fe f7937f;

            /* renamed from: g */
            private final ad f7938g;

            od(ge geVar, fe feVar, ad adVar) {
                this.f7936e = geVar;
                this.f7937f = feVar;
                this.f7938g = adVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f7936e.e(this.f7937f, this.f7938g);
            }
        }, AbstractComponentTracker.LINGERING_TIMEOUT);
    }
}