package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.ads.internal.overlay.zzm;
import com.google.android.gms.ads.internal.util.zzad;
import com.google.android.gms.ads.internal.util.zzbh;
import com.google.android.gms.ads.internal.util.zzr;
import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.ads.internal.zzs;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class tw extends FrameLayout implements ew {

    /* renamed from: e, reason: collision with root package name */
    private final ew f9280e;

    /* renamed from: f, reason: collision with root package name */
    private final ct f9281f;

    /* renamed from: g, reason: collision with root package name */
    private final AtomicBoolean f9282g;

    /* JADX WARN: Multi-variable type inference failed */
    public tw(ew ewVar) {
        super(ewVar.getContext());
        this.f9282g = new AtomicBoolean();
        this.f9280e = ewVar;
        this.f9281f = new ct(ewVar.N(), this, this);
        addView((View) ewVar);
    }

    @Override // com.google.android.gms.internal.ads.ew
    public final void A0(String str, String str2, String str3) {
        this.f9280e.A0(str, str2, null);
    }

    @Override // com.google.android.gms.internal.ads.ew
    public final e6 B() {
        return this.f9280e.B();
    }

    @Override // com.google.android.gms.internal.ads.lt
    public final void B0(boolean z, long j2) {
        this.f9280e.B0(z, j2);
    }

    @Override // com.google.android.gms.internal.ads.ew
    public final void C(b6 b6Var) {
        this.f9280e.C(b6Var);
    }

    @Override // com.google.android.gms.internal.ads.ew
    public final void C0() {
        setBackgroundColor(0);
        this.f9280e.setBackgroundColor(0);
    }

    @Override // com.google.android.gms.internal.ads.ew
    public final boolean D() {
        return this.f9280e.D();
    }

    @Override // com.google.android.gms.internal.ads.ew
    public final void E() {
        this.f9280e.E();
    }

    @Override // com.google.android.gms.internal.ads.ew
    public final tx E0() {
        return ((xw) this.f9280e).L0();
    }

    @Override // com.google.android.gms.internal.ads.ew
    public final j33 F() {
        return this.f9280e.F();
    }

    @Override // com.google.android.gms.internal.ads.lt
    public final void G(int i2) {
        this.f9281f.f(i2);
    }

    @Override // com.google.android.gms.internal.ads.ew
    public final void H(zzm zzmVar) {
        this.f9280e.H(zzmVar);
    }

    @Override // com.google.android.gms.internal.ads.ew
    public final void K(boolean z) {
        this.f9280e.K(z);
    }

    @Override // com.google.android.gms.internal.ads.ew
    public final void L() {
        ew ewVar = this.f9280e;
        HashMap map = new HashMap(3);
        map.put("app_muted", String.valueOf(zzs.zzh().zzd()));
        map.put("app_volume", String.valueOf(zzs.zzh().zzb()));
        xw xwVar = (xw) ewVar;
        map.put("device_volume", String.valueOf(zzad.zze(xwVar.getContext())));
        xwVar.e0("volume", map);
    }

    @Override // com.google.android.gms.internal.ads.ew
    public final void M(String str, ba<? super ew> baVar) {
        this.f9280e.M(str, baVar);
    }

    @Override // com.google.android.gms.internal.ads.ew
    public final Context N() {
        return this.f9280e.N();
    }

    @Override // com.google.android.gms.internal.ads.ew
    public final void O(zzm zzmVar) {
        this.f9280e.O(zzmVar);
    }

    @Override // com.google.android.gms.internal.ads.ew
    public final void P(boolean z) {
        this.f9280e.P(z);
    }

    @Override // com.google.android.gms.internal.ads.ew
    public final void Q(Context context) {
        this.f9280e.Q(context);
    }

    @Override // com.google.android.gms.internal.ads.lx
    public final void R(boolean z, int i2) {
        this.f9280e.R(z, i2);
    }

    @Override // com.google.android.gms.internal.ads.ew
    public final boolean S(boolean z, int i2) {
        if (!this.f9282g.compareAndSet(false, true)) {
            return true;
        }
        if (((Boolean) c.c().b(w3.x0)).booleanValue()) {
            return false;
        }
        if (this.f9280e.getParent() instanceof ViewGroup) {
            ((ViewGroup) this.f9280e.getParent()).removeView((View) this.f9280e);
        }
        this.f9280e.S(z, i2);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.ew
    public final void T(String str, ba<? super ew> baVar) {
        this.f9280e.T(str, baVar);
    }

    @Override // com.google.android.gms.internal.ads.ew
    public final e.c.b.b.b.b U() {
        return this.f9280e.U();
    }

    @Override // com.google.android.gms.internal.ads.lx
    public final void V(boolean z, int i2, String str) {
        this.f9280e.V(z, i2, str);
    }

    @Override // com.google.android.gms.internal.ads.ew
    public final void W(int i2) {
        this.f9280e.W(i2);
    }

    @Override // com.google.android.gms.internal.ads.ew
    public final void X() {
        this.f9280e.X();
    }

    @Override // com.google.android.gms.internal.ads.ew
    public final void Y(e.c.b.b.b.b bVar) {
        this.f9280e.Y(bVar);
    }

    @Override // com.google.android.gms.internal.ads.vc, com.google.android.gms.internal.ads.xc
    public final void a(String str, JSONObject jSONObject) {
        this.f9280e.a(str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.ew
    public final boolean a0() {
        return this.f9282g.get();
    }

    @Override // com.google.android.gms.internal.ads.lx
    public final void b0(boolean z, int i2, String str, String str2) {
        this.f9280e.b0(z, i2, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.lx
    public final void c(zzc zzcVar) {
        this.f9280e.c(zzcVar);
    }

    @Override // com.google.android.gms.internal.ads.v13
    public final void c0(u13 u13Var) {
        this.f9280e.c0(u13Var);
    }

    @Override // com.google.android.gms.internal.ads.ew
    public final boolean canGoBack() {
        return this.f9280e.canGoBack();
    }

    @Override // com.google.android.gms.internal.ads.ew
    public final void destroy() {
        final e.c.b.b.b.b bVarU = U();
        if (bVarU == null) {
            this.f9280e.destroy();
            return;
        }
        l02 l02Var = zzr.zza;
        l02Var.post(new Runnable(bVarU) { // from class: com.google.android.gms.internal.ads.rw

            /* renamed from: e, reason: collision with root package name */
            private final e.c.b.b.b.b f8769e;

            {
                this.f8769e = bVarU;
            }

            @Override // java.lang.Runnable
            public final void run() {
                zzs.zzr().m(this.f8769e);
            }
        });
        ew ewVar = this.f9280e;
        ewVar.getClass();
        l02Var.postDelayed(sw.a(ewVar), ((Integer) c.c().b(w3.j3)).intValue());
    }

    @Override // com.google.android.gms.internal.ads.ew, com.google.android.gms.internal.ads.nx
    public final vx e() {
        return this.f9280e.e();
    }

    @Override // com.google.android.gms.internal.ads.vc
    public final void e0(String str, Map<String, ?> map) {
        this.f9280e.e0(str, map);
    }

    @Override // com.google.android.gms.internal.ads.lt
    public final int f() {
        return ((Boolean) c.c().b(w3.f2)).booleanValue() ? this.f9280e.getMeasuredWidth() : getMeasuredWidth();
    }

    @Override // com.google.android.gms.internal.ads.ew
    public final WebViewClient f0() {
        return this.f9280e.f0();
    }

    @Override // com.google.android.gms.internal.ads.ew, com.google.android.gms.internal.ads.ox
    public final ip2 g() {
        return this.f9280e.g();
    }

    @Override // com.google.android.gms.internal.ads.ew
    public final void goBack() {
        this.f9280e.goBack();
    }

    @Override // com.google.android.gms.internal.ads.ew, com.google.android.gms.internal.ads.lt
    public final void h(bx bxVar) {
        this.f9280e.h(bxVar);
    }

    @Override // com.google.android.gms.internal.ads.ew
    public final void h0(xo1 xo1Var, ap1 ap1Var) {
        this.f9280e.h0(xo1Var, ap1Var);
    }

    @Override // com.google.android.gms.internal.ads.ew
    public final void i() {
        this.f9280e.i();
    }

    @Override // com.google.android.gms.internal.ads.ew, com.google.android.gms.internal.ads.cx
    public final ap1 j() {
        return this.f9280e.j();
    }

    @Override // com.google.android.gms.internal.ads.jd
    public final void j0(String str, JSONObject jSONObject) {
        ((xw) this.f9280e).o(str, jSONObject.toString());
    }

    @Override // com.google.android.gms.internal.ads.ew
    public final boolean k() {
        return this.f9280e.k();
    }

    @Override // com.google.android.gms.internal.ads.ew
    public final void k0() {
        TextView textView = new TextView(getContext());
        zzs.zzc();
        textView.setText(zzr.zzB());
        textView.setTextSize(15.0f);
        textView.setTextColor(-1);
        textView.setPadding(5, 0, 5, 0);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(-12303292);
        gradientDrawable.setCornerRadius(8.0f);
        textView.setBackground(gradientDrawable);
        addView(textView, new FrameLayout.LayoutParams(-2, -2, 49));
        bringChildToFront(textView);
    }

    @Override // com.google.android.gms.internal.ads.ew, com.google.android.gms.internal.ads.lt
    public final void l(String str, lv lvVar) {
        this.f9280e.l(str, lvVar);
    }

    @Override // com.google.android.gms.internal.ads.ew
    public final void l0(e6 e6Var) {
        this.f9280e.l0(e6Var);
    }

    @Override // com.google.android.gms.internal.ads.ew
    public final void loadData(String str, String str2, String str3) {
        this.f9280e.loadData(str, "text/html", "UTF-8");
    }

    @Override // com.google.android.gms.internal.ads.ew
    public final void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        this.f9280e.loadDataWithBaseURL(str, str2, "text/html", "UTF-8", null);
    }

    @Override // com.google.android.gms.internal.ads.ew
    public final void loadUrl(String str) {
        this.f9280e.loadUrl(str);
    }

    @Override // com.google.android.gms.internal.ads.lt
    public final void m(int i2) {
        this.f9280e.m(i2);
    }

    @Override // com.google.android.gms.internal.ads.ew
    public final boolean m0() {
        return this.f9280e.m0();
    }

    @Override // com.google.android.gms.internal.ads.ew, com.google.android.gms.internal.ads.qx
    public final View n() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.ew
    public final void n0(boolean z) {
        this.f9280e.n0(z);
    }

    @Override // com.google.android.gms.internal.ads.jd, com.google.android.gms.internal.ads.xc
    public final void o(String str, String str2) {
        this.f9280e.o("window.inspectorInfo", str2);
    }

    @Override // com.google.android.gms.internal.ads.ew
    public final void o0(j33 j33Var) {
        this.f9280e.o0(j33Var);
    }

    @Override // com.google.android.gms.internal.ads.c93
    public final void onAdClicked() {
        ew ewVar = this.f9280e;
        if (ewVar != null) {
            ewVar.onAdClicked();
        }
    }

    @Override // com.google.android.gms.internal.ads.ew
    public final void onPause() {
        this.f9281f.d();
        this.f9280e.onPause();
    }

    @Override // com.google.android.gms.internal.ads.ew
    public final void onResume() {
        this.f9280e.onResume();
    }

    @Override // com.google.android.gms.internal.ads.ew
    public final zzm p() {
        return this.f9280e.p();
    }

    @Override // com.google.android.gms.internal.ads.ew
    public final void p0(vx vxVar) {
        this.f9280e.p0(vxVar);
    }

    @Override // com.google.android.gms.internal.ads.ew
    public final WebView q() {
        return (WebView) this.f9280e;
    }

    @Override // com.google.android.gms.internal.ads.lx
    public final void q0(zzbh zzbhVar, x21 x21Var, nu0 nu0Var, cu1 cu1Var, String str, String str2, int i2) {
        this.f9280e.q0(zzbhVar, x21Var, nu0Var, cu1Var, str, str2, i2);
    }

    @Override // com.google.android.gms.internal.ads.ew
    public final boolean r() {
        return this.f9280e.r();
    }

    @Override // com.google.android.gms.internal.ads.lt
    public final void r0(int i2) {
        this.f9280e.r0(i2);
    }

    @Override // com.google.android.gms.internal.ads.ew
    public final g52<String> s() {
        return this.f9280e.s();
    }

    @Override // com.google.android.gms.internal.ads.ew
    public final void s0(boolean z) {
        this.f9280e.s0(z);
    }

    @Override // android.view.View, com.google.android.gms.internal.ads.ew
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.f9280e.setOnClickListener(onClickListener);
    }

    @Override // android.view.View, com.google.android.gms.internal.ads.ew
    public final void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.f9280e.setOnTouchListener(onTouchListener);
    }

    @Override // com.google.android.gms.internal.ads.ew
    public final void setWebChromeClient(WebChromeClient webChromeClient) {
        this.f9280e.setWebChromeClient(webChromeClient);
    }

    @Override // com.google.android.gms.internal.ads.ew
    public final void setWebViewClient(WebViewClient webViewClient) {
        this.f9280e.setWebViewClient(webViewClient);
    }

    @Override // com.google.android.gms.internal.ads.ew
    public final void t() {
        this.f9280e.t();
    }

    @Override // com.google.android.gms.internal.ads.ew
    public final void t0() {
        this.f9281f.e();
        this.f9280e.t0();
    }

    @Override // com.google.android.gms.internal.ads.ew
    public final void u0(String str, com.google.android.gms.common.util.o<ba<? super ew>> oVar) {
        this.f9280e.u0(str, oVar);
    }

    @Override // com.google.android.gms.internal.ads.ew
    public final void v(int i2) {
        this.f9280e.v(i2);
    }

    @Override // com.google.android.gms.internal.ads.ew
    public final String v0() {
        return this.f9280e.v0();
    }

    @Override // com.google.android.gms.internal.ads.ew
    public final void w(boolean z) {
        this.f9280e.w(z);
    }

    @Override // com.google.android.gms.internal.ads.ew
    public final void w0(boolean z) {
        this.f9280e.w0(z);
    }

    @Override // com.google.android.gms.internal.ads.ew
    public final zzm y() {
        return this.f9280e.y();
    }

    @Override // com.google.android.gms.internal.ads.ew
    public final boolean y0() {
        return this.f9280e.y0();
    }

    @Override // com.google.android.gms.internal.ads.lt
    public final lv z(String str) {
        return this.f9280e.z(str);
    }

    @Override // com.google.android.gms.internal.ads.lt
    public final void zzA() {
        this.f9280e.zzA();
    }

    @Override // com.google.android.gms.internal.ads.lt
    public final void zzC(int i2) {
        this.f9280e.zzC(i2);
    }

    @Override // com.google.android.gms.internal.ads.lt
    public final int zzD() {
        return this.f9280e.zzD();
    }

    @Override // com.google.android.gms.internal.ads.lt
    public final int zzE() {
        return this.f9280e.zzE();
    }

    @Override // com.google.android.gms.internal.ads.ew, com.google.android.gms.internal.ads.uv
    public final xo1 zzF() {
        return this.f9280e.zzF();
    }

    @Override // com.google.android.gms.internal.ads.jd, com.google.android.gms.internal.ads.xc
    public final void zza(String str) {
        ((xw) this.f9280e).I0(str);
    }

    @Override // com.google.android.gms.ads.internal.zzl
    public final void zzbl() {
        this.f9280e.zzbl();
    }

    @Override // com.google.android.gms.ads.internal.zzl
    public final void zzbm() {
        this.f9280e.zzbm();
    }

    @Override // com.google.android.gms.internal.ads.lt
    public final ct zzf() {
        return this.f9281f;
    }

    @Override // com.google.android.gms.internal.ads.lt
    public final void zzg(boolean z) {
        this.f9280e.zzg(false);
    }

    @Override // com.google.android.gms.internal.ads.ew, com.google.android.gms.internal.ads.lt
    public final bx zzh() {
        return this.f9280e.zzh();
    }

    @Override // com.google.android.gms.internal.ads.lt
    public final j4 zzi() {
        return this.f9280e.zzi();
    }

    @Override // com.google.android.gms.internal.ads.ew, com.google.android.gms.internal.ads.hx, com.google.android.gms.internal.ads.lt
    public final Activity zzj() {
        return this.f9280e.zzj();
    }

    @Override // com.google.android.gms.internal.ads.ew, com.google.android.gms.internal.ads.lt
    public final zza zzk() {
        return this.f9280e.zzk();
    }

    @Override // com.google.android.gms.internal.ads.lt
    public final void zzl() {
        this.f9280e.zzl();
    }

    @Override // com.google.android.gms.internal.ads.lt
    public final String zzm() {
        return this.f9280e.zzm();
    }

    @Override // com.google.android.gms.internal.ads.lt
    public final String zzn() {
        return this.f9280e.zzn();
    }

    @Override // com.google.android.gms.internal.ads.lt
    public final int zzp() {
        return this.f9280e.zzp();
    }

    @Override // com.google.android.gms.internal.ads.ew, com.google.android.gms.internal.ads.lt
    public final k4 zzq() {
        return this.f9280e.zzq();
    }

    @Override // com.google.android.gms.internal.ads.ew, com.google.android.gms.internal.ads.px, com.google.android.gms.internal.ads.lt
    public final kr zzt() {
        return this.f9280e.zzt();
    }

    @Override // com.google.android.gms.internal.ads.lt
    public final int zzy() {
        return ((Boolean) c.c().b(w3.f2)).booleanValue() ? this.f9280e.getMeasuredHeight() : getMeasuredHeight();
    }
}