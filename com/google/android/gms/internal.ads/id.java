package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.util.zzr;
import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.ads.internal.zzs;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class id implements ad, xc {

    /* renamed from: e */
    private final ew f6525e;

    /* JADX WARN: Multi-variable type inference failed */
    public id(Context context, kr krVar, ip2 ip2Var, zza zzaVar) throws pw {
        zzs.zzd();
        ew ewVarA = qw.a(context, vx.b(), "", false, false, null, null, krVar, null, null, null, w43.a(), null, null);
        this.f6525e = ewVarA;
        ((View) ewVarA).setWillNotDraw(true);
    }

    private static final void Z(Runnable runnable) {
        ta3.a();
        if (xq.p()) {
            runnable.run();
        } else {
            zzr.zza.post(runnable);
        }
    }

    @Override // com.google.android.gms.internal.ads.he
    public final void A(String str, final ba<? super he> baVar) {
        this.f6525e.u0(str, new com.google.android.gms.common.util.o(baVar) { // from class: com.google.android.gms.internal.ads.fd
            private final ba a;

            {
                this.a = baVar;
            }

            @Override // com.google.android.gms.common.util.o
            public final boolean apply(Object obj) {
                ba baVar2 = (ba) obj;
                return (baVar2 instanceof hd) && ((hd) baVar2).a.equals(this.a);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.he
    public final void I(String str, ba<? super he> baVar) {
        this.f6525e.T(str, new hd(this, baVar));
    }

    final /* synthetic */ void J(String str) {
        this.f6525e.loadData(str, "text/html", "UTF-8");
    }

    final /* synthetic */ void R(String str) {
        this.f6525e.loadData(str, "text/html", "UTF-8");
    }

    final /* synthetic */ void V(String str) {
        this.f6525e.zza(str);
    }

    @Override // com.google.android.gms.internal.ads.vc, com.google.android.gms.internal.ads.xc
    public final void a(String str, JSONObject jSONObject) {
        wc.c(this, str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.ad
    public final void b(final String str) {
        Z(new Runnable(this, str) { // from class: com.google.android.gms.internal.ads.ed

            /* renamed from: e, reason: collision with root package name */
            private final id f5620e;

            /* renamed from: f, reason: collision with root package name */
            private final String f5621f;

            {
                this.f5620e = this;
                this.f5621f = str;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f5620e.c(this.f5621f);
            }
        });
    }

    final /* synthetic */ void c(String str) {
        this.f6525e.loadUrl(str);
    }

    @Override // com.google.android.gms.internal.ads.ad
    public final void d(String str) {
        final String str2 = String.format("<!DOCTYPE html><html><head><script src=\"%s\"></script></head><body></body></html>", str);
        Z(new Runnable(this, str2) { // from class: com.google.android.gms.internal.ads.cd

            /* renamed from: e, reason: collision with root package name */
            private final id f5303e;

            /* renamed from: f, reason: collision with root package name */
            private final String f5304f;

            {
                this.f5303e = this;
                this.f5304f = str2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f5303e.R(this.f5304f);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.vc
    public final void e0(String str, Map map) {
        wc.d(this, str, map);
    }

    @Override // com.google.android.gms.internal.ads.jd
    public final void j0(String str, JSONObject jSONObject) {
        wc.a(this, str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.jd, com.google.android.gms.internal.ads.xc
    public final void o(String str, String str2) {
        wc.b(this, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.ad
    public final void u(final String str) {
        Z(new Runnable(this, str) { // from class: com.google.android.gms.internal.ads.dd

            /* renamed from: e, reason: collision with root package name */
            private final id f5463e;

            /* renamed from: f, reason: collision with root package name */
            private final String f5464f;

            {
                this.f5463e = this;
                this.f5464f = str;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f5463e.J(this.f5464f);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.ad
    public final void x(zc zcVar) {
        this.f6525e.E0().d0(gd.a(zcVar));
    }

    @Override // com.google.android.gms.internal.ads.jd, com.google.android.gms.internal.ads.xc
    public final void zza(final String str) {
        Z(new Runnable(this, str) { // from class: com.google.android.gms.internal.ads.bd

            /* renamed from: e, reason: collision with root package name */
            private final id f5101e;

            /* renamed from: f, reason: collision with root package name */
            private final String f5102f;

            {
                this.f5101e = this;
                this.f5102f = str;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f5101e.V(this.f5102f);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.ad
    public final void zzi() {
        this.f6525e.destroy();
    }

    @Override // com.google.android.gms.internal.ads.ad
    public final boolean zzj() {
        return this.f6525e.D();
    }

    @Override // com.google.android.gms.internal.ads.ad
    public final ie zzk() {
        return new ie(this);
    }
}