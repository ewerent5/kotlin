package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.internal.util.zzr;
import com.google.android.gms.ads.internal.zzs;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class yt0 implements cf0, c93, ib0, ua0 {

    /* renamed from: e, reason: collision with root package name */
    private final Context f10474e;

    /* renamed from: f, reason: collision with root package name */
    private final dq1 f10475f;

    /* renamed from: g, reason: collision with root package name */
    private final nu0 f10476g;

    /* renamed from: h, reason: collision with root package name */
    private final kp1 f10477h;

    /* renamed from: i, reason: collision with root package name */
    private final xo1 f10478i;

    /* renamed from: j, reason: collision with root package name */
    private final x21 f10479j;

    /* renamed from: k, reason: collision with root package name */
    private Boolean f10480k;

    /* renamed from: l, reason: collision with root package name */
    private final boolean f10481l = ((Boolean) c.c().b(w3.Q4)).booleanValue();

    public yt0(Context context, dq1 dq1Var, nu0 nu0Var, kp1 kp1Var, xo1 xo1Var, x21 x21Var) {
        this.f10474e = context;
        this.f10475f = dq1Var;
        this.f10476g = nu0Var;
        this.f10477h = kp1Var;
        this.f10478i = xo1Var;
        this.f10479j = x21Var;
    }

    private final boolean a() {
        if (this.f10480k == null) {
            synchronized (this) {
                if (this.f10480k == null) {
                    String str = (String) c.c().b(w3.Y0);
                    zzs.zzc();
                    String strZzv = zzr.zzv(this.f10474e);
                    boolean zMatches = false;
                    if (str != null && strZzv != null) {
                        try {
                            zMatches = Pattern.matches(str, strZzv);
                        } catch (RuntimeException e2) {
                            zzs.zzg().g(e2, "CsiActionsListener.isPatternMatched");
                        }
                    }
                    this.f10480k = Boolean.valueOf(zMatches);
                }
            }
        }
        return this.f10480k.booleanValue();
    }

    private final mu0 c(String str) {
        mu0 mu0VarA = this.f10476g.a();
        mu0VarA.a(this.f10477h.f7035b.f6562b);
        mu0VarA.b(this.f10478i);
        mu0VarA.c("action", str);
        if (!this.f10478i.s.isEmpty()) {
            mu0VarA.c("ancn", this.f10478i.s.get(0));
        }
        if (this.f10478i.d0) {
            zzs.zzc();
            mu0VarA.c("device_connectivity", true != zzr.zzH(this.f10474e) ? "offline" : "online");
            mu0VarA.c("event_timestamp", String.valueOf(zzs.zzj().a()));
            mu0VarA.c("offline_ad", "1");
        }
        return mu0VarA;
    }

    private final void d(mu0 mu0Var) {
        if (!this.f10478i.d0) {
            mu0Var.d();
            return;
        }
        this.f10479j.i(new z21(zzs.zzj().a(), this.f10477h.f7035b.f6562b.f4967b, mu0Var.e(), 2));
    }

    @Override // com.google.android.gms.internal.ads.ib0
    public final void b() {
        if (a() || this.f10478i.d0) {
            d(c("impression"));
        }
    }

    @Override // com.google.android.gms.internal.ads.ua0
    public final void e0(g93 g93Var) {
        g93 g93Var2;
        if (this.f10481l) {
            mu0 mu0VarC = c("ifts");
            mu0VarC.c("reason", "adapter");
            int i2 = g93Var.f6091e;
            String str = g93Var.f6092f;
            if (g93Var.f6093g.equals(MobileAds.ERROR_DOMAIN) && (g93Var2 = g93Var.f6094h) != null && !g93Var2.f6093g.equals(MobileAds.ERROR_DOMAIN)) {
                g93 g93Var3 = g93Var.f6094h;
                i2 = g93Var3.f6091e;
                str = g93Var3.f6092f;
            }
            if (i2 >= 0) {
                mu0VarC.c("arec", String.valueOf(i2));
            }
            String strA = this.f10475f.a(str);
            if (strA != null) {
                mu0VarC.c("areec", strA);
            }
            mu0VarC.d();
        }
    }

    @Override // com.google.android.gms.internal.ads.c93
    public final void onAdClicked() {
        if (this.f10478i.d0) {
            d(c("click"));
        }
    }

    @Override // com.google.android.gms.internal.ads.ua0
    public final void r0(qj0 qj0Var) {
        if (this.f10481l) {
            mu0 mu0VarC = c("ifts");
            mu0VarC.c("reason", "exception");
            if (!TextUtils.isEmpty(qj0Var.getMessage())) {
                mu0VarC.c("msg", qj0Var.getMessage());
            }
            mu0VarC.d();
        }
    }

    @Override // com.google.android.gms.internal.ads.cf0
    public final void zzb() {
        if (a()) {
            c("adapter_impression").d();
        }
    }

    @Override // com.google.android.gms.internal.ads.ua0
    public final void zzd() {
        if (this.f10481l) {
            mu0 mu0VarC = c("ifts");
            mu0VarC.c("reason", "blocked");
            mu0VarC.d();
        }
    }

    @Override // com.google.android.gms.internal.ads.cf0
    public final void zzk() {
        if (a()) {
            c("adapter_shown").d();
        }
    }
}