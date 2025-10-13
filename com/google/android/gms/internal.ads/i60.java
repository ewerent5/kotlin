package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.zzs;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class i60 implements dc0, ib0 {

    /* renamed from: e, reason: collision with root package name */
    private final Context f6487e;

    /* renamed from: f, reason: collision with root package name */
    private final ew f6488f;

    /* renamed from: g, reason: collision with root package name */
    private final xo1 f6489g;

    /* renamed from: h, reason: collision with root package name */
    private final kr f6490h;

    /* renamed from: i, reason: collision with root package name */
    @GuardedBy("this")
    private e.c.b.b.b.b f6491i;

    /* renamed from: j, reason: collision with root package name */
    @GuardedBy("this")
    private boolean f6492j;

    public i60(Context context, ew ewVar, xo1 xo1Var, kr krVar) {
        this.f6487e = context;
        this.f6488f = ewVar;
        this.f6489g = xo1Var;
        this.f6490h = krVar;
    }

    private final synchronized void a() {
        sj sjVar;
        tj tjVar;
        if (this.f6489g.N) {
            if (this.f6488f == null) {
                return;
            }
            if (zzs.zzr().zza(this.f6487e)) {
                kr krVar = this.f6490h;
                int i2 = krVar.f7055f;
                int i3 = krVar.f7056g;
                StringBuilder sb = new StringBuilder(23);
                sb.append(i2);
                sb.append(".");
                sb.append(i3);
                String string = sb.toString();
                String strA = this.f6489g.P.a();
                if (((Boolean) c.c().b(w3.l3)).booleanValue()) {
                    if (this.f6489g.P.b() == 1) {
                        sjVar = sj.VIDEO;
                        tjVar = tj.DEFINED_BY_JAVASCRIPT;
                    } else {
                        sjVar = sj.HTML_DISPLAY;
                        tjVar = this.f6489g.f10200e == 1 ? tj.ONE_PIXEL : tj.BEGIN_TO_RENDER;
                    }
                    this.f6491i = zzs.zzr().L(string, this.f6488f.q(), "", "javascript", strA, tjVar, sjVar, this.f6489g.g0);
                } else {
                    this.f6491i = zzs.zzr().J(string, this.f6488f.q(), "", "javascript", strA);
                }
                Object obj = this.f6488f;
                if (this.f6491i != null) {
                    zzs.zzr().N(this.f6491i, (View) obj);
                    this.f6488f.Y(this.f6491i);
                    zzs.zzr().H(this.f6491i);
                    this.f6492j = true;
                    if (((Boolean) c.c().b(w3.o3)).booleanValue()) {
                        this.f6488f.e0("onSdkLoaded", new c.e.a());
                    }
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.ib0
    public final synchronized void b() {
        ew ewVar;
        if (!this.f6492j) {
            a();
        }
        if (!this.f6489g.N || this.f6491i == null || (ewVar = this.f6488f) == null) {
            return;
        }
        ewVar.e0("onSdkImpression", new c.e.a());
    }

    @Override // com.google.android.gms.internal.ads.dc0
    public final synchronized void b0() {
        if (this.f6492j) {
            return;
        }
        a();
    }
}