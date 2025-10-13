package com.google.android.gms.internal.ads;

import android.content.Context;
import ch.qos.logback.classic.turbo.ReconfigureOnChangeFilter;
import ch.qos.logback.core.spi.AbstractComponentTracker;
import com.google.android.gms.ads.internal.util.zzas;
import com.google.android.gms.ads.internal.util.zzbq;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzr;
import com.google.android.gms.ads.internal.zzs;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class ge {

    /* renamed from: b, reason: collision with root package name */
    private final Context f6104b;

    /* renamed from: c, reason: collision with root package name */
    private final String f6105c;

    /* renamed from: d, reason: collision with root package name */
    private final kr f6106d;

    /* renamed from: e, reason: collision with root package name */
    private final zzas<ad> f6107e;

    /* renamed from: f, reason: collision with root package name */
    private final zzas<ad> f6108f;

    /* renamed from: g, reason: collision with root package name */
    private fe f6109g;
    private final Object a = new Object();

    /* renamed from: h, reason: collision with root package name */
    private int f6110h = 1;

    public ge(Context context, kr krVar, String str, zzas<ad> zzasVar, zzas<ad> zzasVar2) {
        this.f6105c = str;
        this.f6104b = context.getApplicationContext();
        this.f6106d = krVar;
        this.f6107e = zzasVar;
        this.f6108f = zzasVar2;
    }

    protected final fe a(ip2 ip2Var) {
        final fe feVar = new fe(this.f6108f);
        final ip2 ip2Var2 = null;
        qr.f8450e.execute(new Runnable(this, ip2Var2, feVar) { // from class: com.google.android.gms.internal.ads.kd

            /* renamed from: e, reason: collision with root package name */
            private final ge f6986e;

            /* renamed from: f, reason: collision with root package name */
            private final fe f6987f;

            {
                this.f6986e = this;
                this.f6987f = feVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f6986e.d(null, this.f6987f);
            }
        });
        feVar.a(new vd(this, feVar), new wd(this, feVar));
        return feVar;
    }

    public final ae b(ip2 ip2Var) {
        synchronized (this.a) {
            synchronized (this.a) {
                fe feVar = this.f6109g;
                if (feVar != null && this.f6110h == 0) {
                    feVar.a(new as(this) { // from class: com.google.android.gms.internal.ads.ld
                        private final ge a;

                        {
                            this.a = this;
                        }

                        @Override // com.google.android.gms.internal.ads.as
                        public final void zza(Object obj) {
                            this.a.c((ad) obj);
                        }
                    }, md.a);
                }
            }
            fe feVar2 = this.f6109g;
            if (feVar2 != null && feVar2.d() != -1) {
                int i2 = this.f6110h;
                if (i2 == 0) {
                    return this.f6109g.f();
                }
                if (i2 != 1) {
                    return this.f6109g.f();
                }
                this.f6110h = 2;
                a(null);
                return this.f6109g.f();
            }
            this.f6110h = 2;
            fe feVarA = a(null);
            this.f6109g = feVarA;
            return feVarA.f();
        }
    }

    final /* synthetic */ void c(ad adVar) {
        if (adVar.zzj()) {
            this.f6110h = 1;
        }
    }

    final /* synthetic */ void d(ip2 ip2Var, final fe feVar) {
        try {
            final id idVar = new id(this.f6104b, this.f6106d, null, null);
            idVar.x(new zc(this, feVar, idVar) { // from class: com.google.android.gms.internal.ads.nd
                private final ge a;

                /* renamed from: b, reason: collision with root package name */
                private final fe f7692b;

                /* renamed from: c, reason: collision with root package name */
                private final ad f7693c;

                {
                    this.a = this;
                    this.f7692b = feVar;
                    this.f7693c = idVar;
                }

                @Override // com.google.android.gms.internal.ads.zc
                public final void zza() {
                    final ge geVar = this.a;
                    final fe feVar2 = this.f7692b;
                    final ad adVar = this.f7693c;
                    zzr.zza.postDelayed(new Runnable(geVar, feVar2, adVar) { // from class: com.google.android.gms.internal.ads.od

                        /* renamed from: e, reason: collision with root package name */
                        private final ge f7936e;

                        /* renamed from: f, reason: collision with root package name */
                        private final fe f7937f;

                        /* renamed from: g, reason: collision with root package name */
                        private final ad f7938g;

                        {
                            this.f7936e = geVar;
                            this.f7937f = feVar2;
                            this.f7938g = adVar;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f7936e.e(this.f7937f, this.f7938g);
                        }
                    }, AbstractComponentTracker.LINGERING_TIMEOUT);
                }
            });
            idVar.I("/jsLoaded", new rd(this, feVar, idVar));
            zzbq zzbqVar = new zzbq();
            sd sdVar = new sd(this, null, idVar, zzbqVar);
            zzbqVar.zzb(sdVar);
            idVar.I("/requestReload", sdVar);
            if (this.f6105c.endsWith(".js")) {
                idVar.d(this.f6105c);
            } else if (this.f6105c.startsWith("<html>")) {
                idVar.u(this.f6105c);
            } else {
                idVar.b(this.f6105c);
            }
            zzr.zza.postDelayed(new ud(this, feVar, idVar), ReconfigureOnChangeFilter.DEFAULT_REFRESH_PERIOD);
        } catch (Throwable th) {
            er.zzg("Error creating webview.", th);
            zzs.zzg().g(th, "SdkJavascriptFactory.loadJavascriptEngine");
            feVar.c();
        }
    }

    final /* synthetic */ void e(fe feVar, ad adVar) {
        synchronized (this.a) {
            if (feVar.d() != -1 && feVar.d() != 1) {
                feVar.c();
                qr.f8450e.execute(qd.a(adVar));
                zze.zza("Could not receive loaded message in a timely manner. Rejecting.");
            }
        }
    }
}