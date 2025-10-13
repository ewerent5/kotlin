package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.overlay.zzp;
import com.google.android.gms.ads.internal.zzs;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class sj0 implements dc0, zzp {

    /* renamed from: e, reason: collision with root package name */
    private final Context f8882e;

    /* renamed from: f, reason: collision with root package name */
    private final ew f8883f;

    /* renamed from: g, reason: collision with root package name */
    private final xo1 f8884g;

    /* renamed from: h, reason: collision with root package name */
    private final kr f8885h;

    /* renamed from: i, reason: collision with root package name */
    private final g53 f8886i;

    /* renamed from: j, reason: collision with root package name */
    e.c.b.b.b.b f8887j;

    public sj0(Context context, ew ewVar, xo1 xo1Var, kr krVar, g53 g53Var) {
        this.f8882e = context;
        this.f8883f = ewVar;
        this.f8884g = xo1Var;
        this.f8885h = krVar;
        this.f8886i = g53Var;
    }

    @Override // com.google.android.gms.internal.ads.dc0
    public final void b0() {
        tj tjVar;
        sj sjVar;
        g53 g53Var = this.f8886i;
        if ((g53Var == g53.REWARD_BASED_VIDEO_AD || g53Var == g53.INTERSTITIAL || g53Var == g53.APP_OPEN) && this.f8884g.N && this.f8883f != null && zzs.zzr().zza(this.f8882e)) {
            kr krVar = this.f8885h;
            int i2 = krVar.f7055f;
            int i3 = krVar.f7056g;
            StringBuilder sb = new StringBuilder(23);
            sb.append(i2);
            sb.append(".");
            sb.append(i3);
            String string = sb.toString();
            String strA = this.f8884g.P.a();
            if (((Boolean) c.c().b(w3.l3)).booleanValue()) {
                if (this.f8884g.P.b() == 1) {
                    sjVar = sj.VIDEO;
                    tjVar = tj.DEFINED_BY_JAVASCRIPT;
                } else {
                    tjVar = this.f8884g.S == 2 ? tj.UNSPECIFIED : tj.BEGIN_TO_RENDER;
                    sjVar = sj.HTML_DISPLAY;
                }
                this.f8887j = zzs.zzr().L(string, this.f8883f.q(), "", "javascript", strA, tjVar, sjVar, this.f8884g.g0);
            } else {
                this.f8887j = zzs.zzr().J(string, this.f8883f.q(), "", "javascript", strA);
            }
            if (this.f8887j != null) {
                zzs.zzr().N(this.f8887j, (View) this.f8883f);
                this.f8883f.Y(this.f8887j);
                zzs.zzr().H(this.f8887j);
                if (((Boolean) c.c().b(w3.o3)).booleanValue()) {
                    this.f8883f.e0("onSdkLoaded", new c.e.a());
                }
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzbJ() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzbo() {
        ew ewVar;
        if (this.f8887j == null || (ewVar = this.f8883f) == null) {
            return;
        }
        ewVar.e0("onSdkImpression", new c.e.a());
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzbr() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzbs() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzbt(int i2) {
        this.f8887j = null;
    }
}