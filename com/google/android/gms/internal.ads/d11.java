package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.internal.util.zzr;
import com.google.android.gms.ads.internal.zzs;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class d11 implements cf0, c93, ib0, ua0 {

    /* renamed from: e, reason: collision with root package name */
    private final Context f5404e;

    /* renamed from: f, reason: collision with root package name */
    private final dq1 f5405f;

    /* renamed from: g, reason: collision with root package name */
    private final kp1 f5406g;

    /* renamed from: h, reason: collision with root package name */
    private final xo1 f5407h;

    /* renamed from: i, reason: collision with root package name */
    private final x21 f5408i;

    /* renamed from: j, reason: collision with root package name */
    private Boolean f5409j;

    /* renamed from: k, reason: collision with root package name */
    private final boolean f5410k = ((Boolean) c.c().b(w3.Q4)).booleanValue();

    /* renamed from: l, reason: collision with root package name */
    private final cu1 f5411l;

    /* renamed from: m, reason: collision with root package name */
    private final String f5412m;

    public d11(Context context, dq1 dq1Var, kp1 kp1Var, xo1 xo1Var, x21 x21Var, cu1 cu1Var, String str) {
        this.f5404e = context;
        this.f5405f = dq1Var;
        this.f5406g = kp1Var;
        this.f5407h = xo1Var;
        this.f5408i = x21Var;
        this.f5411l = cu1Var;
        this.f5412m = str;
    }

    private final boolean a() {
        if (this.f5409j == null) {
            synchronized (this) {
                if (this.f5409j == null) {
                    String str = (String) c.c().b(w3.Y0);
                    zzs.zzc();
                    String strZzv = zzr.zzv(this.f5404e);
                    boolean zMatches = false;
                    if (str != null && strZzv != null) {
                        try {
                            zMatches = Pattern.matches(str, strZzv);
                        } catch (RuntimeException e2) {
                            zzs.zzg().g(e2, "CsiActionsListener.isPatternMatched");
                        }
                    }
                    this.f5409j = Boolean.valueOf(zMatches);
                }
            }
        }
        return this.f5409j.booleanValue();
    }

    private final bu1 c(String str) {
        bu1 bu1VarA = bu1.a(str);
        bu1VarA.g(this.f5406g, null);
        bu1VarA.i(this.f5407h);
        bu1VarA.c("request_id", this.f5412m);
        if (!this.f5407h.s.isEmpty()) {
            bu1VarA.c("ancn", this.f5407h.s.get(0));
        }
        if (this.f5407h.d0) {
            zzs.zzc();
            bu1VarA.c("device_connectivity", true != zzr.zzH(this.f5404e) ? "offline" : "online");
            bu1VarA.c("event_timestamp", String.valueOf(zzs.zzj().a()));
            bu1VarA.c("offline_ad", "1");
        }
        return bu1VarA;
    }

    private final void d(bu1 bu1Var) {
        if (!this.f5407h.d0) {
            this.f5411l.b(bu1Var);
            return;
        }
        this.f5408i.i(new z21(zzs.zzj().a(), this.f5406g.f7035b.f6562b.f4967b, this.f5411l.a(bu1Var), 2));
    }

    @Override // com.google.android.gms.internal.ads.ib0
    public final void b() {
        if (a() || this.f5407h.d0) {
            d(c("impression"));
        }
    }

    @Override // com.google.android.gms.internal.ads.ua0
    public final void e0(g93 g93Var) {
        g93 g93Var2;
        if (this.f5410k) {
            int i2 = g93Var.f6091e;
            String str = g93Var.f6092f;
            if (g93Var.f6093g.equals(MobileAds.ERROR_DOMAIN) && (g93Var2 = g93Var.f6094h) != null && !g93Var2.f6093g.equals(MobileAds.ERROR_DOMAIN)) {
                g93 g93Var3 = g93Var.f6094h;
                i2 = g93Var3.f6091e;
                str = g93Var3.f6092f;
            }
            String strA = this.f5405f.a(str);
            bu1 bu1VarC = c("ifts");
            bu1VarC.c("reason", "adapter");
            if (i2 >= 0) {
                bu1VarC.c("arec", String.valueOf(i2));
            }
            if (strA != null) {
                bu1VarC.c("areec", strA);
            }
            this.f5411l.b(bu1VarC);
        }
    }

    @Override // com.google.android.gms.internal.ads.c93
    public final void onAdClicked() {
        if (this.f5407h.d0) {
            d(c("click"));
        }
    }

    @Override // com.google.android.gms.internal.ads.ua0
    public final void r0(qj0 qj0Var) {
        if (this.f5410k) {
            bu1 bu1VarC = c("ifts");
            bu1VarC.c("reason", "exception");
            if (!TextUtils.isEmpty(qj0Var.getMessage())) {
                bu1VarC.c("msg", qj0Var.getMessage());
            }
            this.f5411l.b(bu1VarC);
        }
    }

    @Override // com.google.android.gms.internal.ads.cf0
    public final void zzb() {
        if (a()) {
            this.f5411l.b(c("adapter_impression"));
        }
    }

    @Override // com.google.android.gms.internal.ads.ua0
    public final void zzd() {
        if (this.f5410k) {
            cu1 cu1Var = this.f5411l;
            bu1 bu1VarC = c("ifts");
            bu1VarC.c("reason", "blocked");
            cu1Var.b(bu1VarC);
        }
    }

    @Override // com.google.android.gms.internal.ads.cf0
    public final void zzk() {
        if (a()) {
            this.f5411l.b(c("adapter_shown"));
        }
    }
}