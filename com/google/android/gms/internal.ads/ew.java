package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.overlay.zzm;
import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.ads.internal.zzl;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public interface ew extends c93, uv, vc, cx, hx, jd, v13, lx, zzl, ox, px, lt, qx {
    void A0(String str, String str2, String str3);

    e6 B();

    void C(b6 b6Var);

    void C0();

    boolean D();

    void E();

    tx E0();

    j33 F();

    void H(zzm zzmVar);

    void K(boolean z);

    void L();

    void M(String str, ba<? super ew> baVar);

    Context N();

    void O(zzm zzmVar);

    void P(boolean z);

    void Q(Context context);

    boolean S(boolean z, int i2);

    void T(String str, ba<? super ew> baVar);

    e.c.b.b.b.b U();

    void W(int i2);

    void X();

    void Y(e.c.b.b.b.b bVar);

    boolean a0();

    boolean canGoBack();

    void destroy();

    @Override // com.google.android.gms.internal.ads.nx
    vx e();

    WebViewClient f0();

    @Override // com.google.android.gms.internal.ads.ox
    ip2 g();

    @Override // com.google.android.gms.internal.ads.hx, com.google.android.gms.internal.ads.lt
    Context getContext();

    int getHeight();

    ViewGroup.LayoutParams getLayoutParams();

    void getLocationOnScreen(int[] iArr);

    int getMeasuredHeight();

    int getMeasuredWidth();

    ViewParent getParent();

    int getWidth();

    void goBack();

    @Override // com.google.android.gms.internal.ads.lt
    void h(bx bxVar);

    void h0(xo1 xo1Var, ap1 ap1Var);

    void i();

    @Override // com.google.android.gms.internal.ads.cx
    ap1 j();

    boolean k();

    void k0();

    @Override // com.google.android.gms.internal.ads.lt
    void l(String str, lv lvVar);

    void l0(e6 e6Var);

    void loadData(String str, String str2, String str3);

    void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5);

    void loadUrl(String str);

    boolean m0();

    void measure(int i2, int i3);

    @Override // com.google.android.gms.internal.ads.qx
    View n();

    void n0(boolean z);

    void o0(j33 j33Var);

    void onPause();

    void onResume();

    zzm p();

    void p0(vx vxVar);

    WebView q();

    boolean r();

    g52<String> s();

    void s0(boolean z);

    @Override // com.google.android.gms.internal.ads.lt
    void setBackgroundColor(int i2);

    void setOnClickListener(View.OnClickListener onClickListener);

    void setOnTouchListener(View.OnTouchListener onTouchListener);

    void setWebChromeClient(WebChromeClient webChromeClient);

    void setWebViewClient(WebViewClient webViewClient);

    void t();

    void t0();

    void u0(String str, com.google.android.gms.common.util.o<ba<? super ew>> oVar);

    void v(int i2);

    String v0();

    void w(boolean z);

    void w0(boolean z);

    zzm y();

    boolean y0();

    @Override // com.google.android.gms.internal.ads.uv
    xo1 zzF();

    @Override // com.google.android.gms.internal.ads.lt
    bx zzh();

    @Override // com.google.android.gms.internal.ads.hx, com.google.android.gms.internal.ads.lt
    Activity zzj();

    @Override // com.google.android.gms.internal.ads.lt
    zza zzk();

    @Override // com.google.android.gms.internal.ads.lt
    k4 zzq();

    @Override // com.google.android.gms.internal.ads.px, com.google.android.gms.internal.ads.lt
    kr zzt();
}