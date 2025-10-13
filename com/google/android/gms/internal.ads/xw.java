package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.net.Uri;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.webkit.DownloadListener;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.ads.internal.overlay.zzm;
import com.google.android.gms.ads.internal.util.zzbh;
import com.google.android.gms.ads.internal.util.zzby;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzr;
import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.ads.internal.zzl;
import com.google.android.gms.ads.internal.zzs;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
final class xw extends WebView implements DownloadListener, ViewTreeObserver.OnGlobalLayoutListener, ew {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f10280e = 0;

    @GuardedBy("this")
    private Boolean A;

    @GuardedBy("this")
    private boolean B;

    @GuardedBy("this")
    private final String C;

    @GuardedBy("this")
    private bx D;

    @GuardedBy("this")
    private boolean E;

    @GuardedBy("this")
    private boolean F;

    @GuardedBy("this")
    private e6 G;

    @GuardedBy("this")
    private b6 H;

    @GuardedBy("this")
    private j33 I;

    @GuardedBy("this")
    private int J;

    @GuardedBy("this")
    private int K;
    private j4 L;
    private final j4 M;
    private j4 N;
    private final k4 O;
    private WeakReference<View.OnClickListener> P;
    private int Q;
    private int R;
    private int S;

    @GuardedBy("this")
    private zzm T;

    @GuardedBy("this")
    private boolean U;
    private final zzby V;
    private int W;
    private int a0;
    private int b0;
    private int c0;
    private Map<String, lv> d0;
    private final WindowManager e0;

    /* renamed from: f, reason: collision with root package name */
    private final ux f10281f;
    private final w43 f0;

    /* renamed from: g, reason: collision with root package name */
    private final ip2 f10282g;

    /* renamed from: h, reason: collision with root package name */
    private final w4 f10283h;

    /* renamed from: i, reason: collision with root package name */
    private final kr f10284i;

    /* renamed from: j, reason: collision with root package name */
    private zzl f10285j;

    /* renamed from: k, reason: collision with root package name */
    private final zza f10286k;

    /* renamed from: l, reason: collision with root package name */
    private final DisplayMetrics f10287l;

    /* renamed from: m, reason: collision with root package name */
    private final float f10288m;
    private xo1 n;
    private ap1 o;
    private boolean p;
    private boolean q;
    private lw r;

    @GuardedBy("this")
    private zzm s;

    @GuardedBy("this")
    private e.c.b.b.b.b t;

    @GuardedBy("this")
    private vx u;

    @GuardedBy("this")
    private final String v;

    @GuardedBy("this")
    private boolean w;

    @GuardedBy("this")
    private boolean x;

    @GuardedBy("this")
    private boolean y;

    @GuardedBy("this")
    private boolean z;

    protected xw(ux uxVar, vx vxVar, String str, boolean z, boolean z2, ip2 ip2Var, w4 w4Var, kr krVar, m4 m4Var, zzl zzlVar, zza zzaVar, w43 w43Var, xo1 xo1Var, ap1 ap1Var) {
        ap1 ap1Var2;
        super(uxVar);
        this.p = false;
        this.q = false;
        this.B = true;
        this.C = "";
        this.W = -1;
        this.a0 = -1;
        this.b0 = -1;
        this.c0 = -1;
        this.f10281f = uxVar;
        this.u = vxVar;
        this.v = str;
        this.y = z;
        this.f10282g = ip2Var;
        this.f10283h = w4Var;
        this.f10284i = krVar;
        this.f10285j = zzlVar;
        this.f10286k = zzaVar;
        WindowManager windowManager = (WindowManager) getContext().getSystemService("window");
        this.e0 = windowManager;
        zzs.zzc();
        DisplayMetrics displayMetricsZzy = zzr.zzy(windowManager);
        this.f10287l = displayMetricsZzy;
        this.f10288m = displayMetricsZzy.density;
        this.f0 = w43Var;
        this.n = xo1Var;
        this.o = ap1Var;
        setBackgroundColor(0);
        WebSettings settings = getSettings();
        settings.setAllowFileAccess(false);
        try {
            settings.setJavaScriptEnabled(true);
        } catch (NullPointerException e2) {
            er.zzg("Unable to enable Javascript.", e2);
        }
        settings.setSavePassword(false);
        settings.setSupportMultipleWindows(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        if (Build.VERSION.SDK_INT >= 21) {
            settings.setMixedContentMode(2);
        }
        settings.setUserAgentString(zzs.zzc().zze(uxVar, krVar.f7054e));
        zzs.zze().zza(getContext(), settings);
        setDownloadListener(this);
        S0();
        if (com.google.android.gms.common.util.n.d()) {
            addJavascriptInterface(new gx(this, new fx(this) { // from class: com.google.android.gms.internal.ads.dx
                private final ew a;

                {
                    this.a = this;
                }

                @Override // com.google.android.gms.internal.ads.fx
                public final void a(Uri uri) {
                    lw lwVarL0 = ((xw) this.a).L0();
                    if (lwVarL0 == null) {
                        er.zzf("Unable to pass GMSG, no AdWebViewClient for AdWebView!");
                    } else {
                        lwVarL0.J(uri);
                    }
                }
            }), "googleAdsJsInterface");
        }
        removeJavascriptInterface("accessibility");
        removeJavascriptInterface("accessibilityTraversal");
        this.V = new zzby(this.f10281f.a(), this, this, null);
        X0();
        k4 k4Var = new k4(new m4(true, "make_wv", this.v));
        this.O = k4Var;
        k4Var.c().a(null);
        if (((Boolean) c.c().b(w3.j1)).booleanValue() && (ap1Var2 = this.o) != null && ap1Var2.f4967b != null) {
            k4Var.c().d("gqi", this.o.f4967b);
        }
        k4Var.c();
        j4 j4VarF = m4.f();
        this.M = j4VarF;
        k4Var.a("native:view_create", j4VarF);
        this.N = null;
        this.L = null;
        zzs.zze().zzc(uxVar);
        zzs.zzg().i();
    }

    private final synchronized void P0(String str) {
        try {
            super.loadUrl("about:blank");
        } catch (Exception | IncompatibleClassChangeError | NoClassDefFoundError | UnsatisfiedLinkError e2) {
            zzs.zzg().g(e2, "AdWebViewImpl.loadUrlUnsafe");
            er.zzj("Could not call loadUrl. ", e2);
        }
    }

    private final synchronized void Q0() {
        Boolean boolC = zzs.zzg().c();
        this.A = boolC;
        if (boolC == null) {
            try {
                evaluateJavascript("(function(){})()", null);
                J0(Boolean.TRUE);
            } catch (IllegalStateException unused) {
                J0(Boolean.FALSE);
            }
        }
    }

    private final void R0() {
        d4.a(this.O.c(), this.M, "aeh2");
    }

    private final synchronized void S0() {
        if (!this.y && !this.u.g()) {
            if (Build.VERSION.SDK_INT < 18) {
                er.zzd("Disabling hardware acceleration on an AdView.");
                T0();
                return;
            } else {
                er.zzd("Enabling hardware acceleration on an AdView.");
                U0();
                return;
            }
        }
        er.zzd("Enabling hardware acceleration on an overlay.");
        U0();
    }

    private final synchronized void T0() {
        if (!this.z) {
            setLayerType(1, null);
        }
        this.z = true;
    }

    private final synchronized void U0() {
        if (this.z) {
            setLayerType(0, null);
        }
        this.z = false;
    }

    private final synchronized void V0() {
        if (this.U) {
            return;
        }
        this.U = true;
        zzs.zzg().j();
    }

    private final synchronized void W0() {
        Map<String, lv> map = this.d0;
        if (map != null) {
            Iterator<lv> it = map.values().iterator();
            while (it.hasNext()) {
                it.next().a();
            }
        }
        this.d0 = null;
    }

    private final void X0() {
        k4 k4Var = this.O;
        if (k4Var == null) {
            return;
        }
        m4 m4VarC = k4Var.c();
        if (zzs.zzg().a() != null) {
            zzs.zzg().a().b(m4VarC);
        }
    }

    private final void Y0(boolean z) {
        HashMap map = new HashMap();
        map.put("isVisible", true != z ? "0" : "1");
        e0("onAdVisibilityChanged", map);
    }

    @Override // com.google.android.gms.internal.ads.ew
    public final synchronized void A0(String str, String str2, String str3) {
        String str4;
        if (D()) {
            er.zzi("#004 The webview is destroyed. Ignoring action.");
            return;
        }
        String[] strArr = new String[1];
        String str5 = (String) c.c().b(w3.K);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("version", str5);
            jSONObject.put("sdk", "Google Mobile Ads");
            jSONObject.put("sdkVersion", "12.4.51-000");
            str4 = "<script>Object.defineProperty(window,'MRAID_ENV',{get:function(){return " + jSONObject.toString() + "}});</script>";
        } catch (JSONException e2) {
            er.zzj("Unable to build MRAID_ENV", e2);
            str4 = null;
        }
        strArr[0] = str4;
        super.loadDataWithBaseURL(str, mx.a(str2, strArr), "text/html", "UTF-8", null);
    }

    @Override // com.google.android.gms.internal.ads.ew
    public final synchronized e6 B() {
        return this.G;
    }

    @Override // com.google.android.gms.internal.ads.lt
    public final void B0(boolean z, long j2) {
        HashMap map = new HashMap(2);
        map.put("success", true != z ? "0" : "1");
        map.put("duration", Long.toString(j2));
        e0("onCacheAccessComplete", map);
    }

    @Override // com.google.android.gms.internal.ads.ew
    public final synchronized void C(b6 b6Var) {
        this.H = b6Var;
    }

    @Override // com.google.android.gms.internal.ads.ew
    public final void C0() {
        setBackgroundColor(0);
    }

    @Override // com.google.android.gms.internal.ads.ew
    public final synchronized boolean D() {
        return this.x;
    }

    public final boolean D0() throws JSONException {
        int i2;
        int iQ;
        if (!this.r.zzc() && !this.r.A()) {
            return false;
        }
        ta3.a();
        DisplayMetrics displayMetrics = this.f10287l;
        int iQ2 = xq.q(displayMetrics, displayMetrics.widthPixels);
        ta3.a();
        DisplayMetrics displayMetrics2 = this.f10287l;
        int iQ3 = xq.q(displayMetrics2, displayMetrics2.heightPixels);
        Activity activityA = this.f10281f.a();
        if (activityA == null || activityA.getWindow() == null) {
            i2 = iQ2;
            iQ = iQ3;
        } else {
            zzs.zzc();
            int[] iArrZzR = zzr.zzR(activityA);
            ta3.a();
            int iQ4 = xq.q(this.f10287l, iArrZzR[0]);
            ta3.a();
            iQ = xq.q(this.f10287l, iArrZzR[1]);
            i2 = iQ4;
        }
        int i3 = this.a0;
        if (i3 == iQ2 && this.W == iQ3 && this.b0 == i2 && this.c0 == iQ) {
            return false;
        }
        boolean z = (i3 == iQ2 && this.W == iQ3) ? false : true;
        this.a0 = iQ2;
        this.W = iQ3;
        this.b0 = i2;
        this.c0 = iQ;
        new vi(this, "").g(iQ2, iQ3, i2, iQ, this.f10287l.density, this.e0.getDefaultDisplay().getRotation());
        return z;
    }

    @Override // com.google.android.gms.internal.ads.ew
    public final void E() {
        this.V.zzb();
    }

    @Override // com.google.android.gms.internal.ads.ew
    public final /* bridge */ /* synthetic */ tx E0() {
        return this.r;
    }

    @Override // com.google.android.gms.internal.ads.ew
    public final synchronized j33 F() {
        return this.I;
    }

    @Override // com.google.android.gms.internal.ads.lt
    public final void G(int i2) {
    }

    protected final synchronized void G0(String str) {
        if (D()) {
            er.zzi("#004 The webview is destroyed. Ignoring action.");
        } else {
            loadUrl(str);
        }
    }

    @Override // com.google.android.gms.internal.ads.ew
    public final synchronized void H(zzm zzmVar) {
        this.T = zzmVar;
    }

    @TargetApi(19)
    protected final synchronized void H0(String str, ValueCallback<String> valueCallback) {
        if (D()) {
            er.zzi("#004 The webview is destroyed. Ignoring action.");
        } else {
            evaluateJavascript(str, null);
        }
    }

    protected final void I0(String str) {
        if (!com.google.android.gms.common.util.n.f()) {
            String strValueOf = String.valueOf(str);
            G0(strValueOf.length() != 0 ? "javascript:".concat(strValueOf) : new String("javascript:"));
            return;
        }
        if (K0() == null) {
            Q0();
        }
        if (K0().booleanValue()) {
            H0(str, null);
        } else {
            String strValueOf2 = String.valueOf(str);
            G0(strValueOf2.length() != 0 ? "javascript:".concat(strValueOf2) : new String("javascript:"));
        }
    }

    final void J0(Boolean bool) {
        synchronized (this) {
            this.A = bool;
        }
        zzs.zzg().b(bool);
    }

    @Override // com.google.android.gms.internal.ads.ew
    public final synchronized void K(boolean z) {
        zzm zzmVar = this.s;
        if (zzmVar != null) {
            zzmVar.zzt(this.r.zzc(), z);
        } else {
            this.w = z;
        }
    }

    final synchronized Boolean K0() {
        return this.A;
    }

    @Override // com.google.android.gms.internal.ads.ew
    public final void L() {
        throw null;
    }

    public final lw L0() {
        return this.r;
    }

    @Override // com.google.android.gms.internal.ads.ew
    public final void M(String str, ba<? super ew> baVar) {
        lw lwVar = this.r;
        if (lwVar != null) {
            lwVar.D0(str, baVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.ew
    public final Context N() {
        return this.f10281f.b();
    }

    @Override // com.google.android.gms.internal.ads.ew
    public final synchronized void O(zzm zzmVar) {
        this.s = zzmVar;
    }

    @Override // com.google.android.gms.internal.ads.ew
    public final synchronized void P(boolean z) {
        zzm zzmVar;
        int i2 = this.J + (true != z ? -1 : 1);
        this.J = i2;
        if (i2 > 0 || (zzmVar = this.s) == null) {
            return;
        }
        zzmVar.zzF();
    }

    @Override // com.google.android.gms.internal.ads.ew
    public final void Q(Context context) {
        this.f10281f.setBaseContext(context);
        this.V.zza(this.f10281f.a());
    }

    @Override // com.google.android.gms.internal.ads.lx
    public final void R(boolean z, int i2) throws NumberFormatException {
        this.r.e0(z, i2);
    }

    @Override // com.google.android.gms.internal.ads.ew
    public final boolean S(final boolean z, final int i2) {
        destroy();
        this.f0.c(new v43(z, i2) { // from class: com.google.android.gms.internal.ads.uw
            private final boolean a;

            /* renamed from: b, reason: collision with root package name */
            private final int f9570b;

            {
                this.a = z;
                this.f9570b = i2;
            }

            @Override // com.google.android.gms.internal.ads.v43
            public final void a(q63 q63Var) {
                boolean z2 = this.a;
                int i3 = this.f9570b;
                int i4 = xw.f10280e;
                a93 a93VarE = b93.E();
                if (a93VarE.q() != z2) {
                    a93VarE.r(z2);
                }
                a93VarE.s(i3);
                q63Var.z(a93VarE.n());
            }
        });
        this.f0.b(y43.ANDROID_WEBVIEW_CRASH);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.ew
    public final void T(String str, ba<? super ew> baVar) {
        lw lwVar = this.r;
        if (lwVar != null) {
            lwVar.B0(str, baVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.ew
    public final synchronized e.c.b.b.b.b U() {
        return this.t;
    }

    @Override // com.google.android.gms.internal.ads.lx
    public final void V(boolean z, int i2, String str) throws NumberFormatException {
        this.r.j0(z, i2, str);
    }

    @Override // com.google.android.gms.internal.ads.ew
    public final void W(int i2) {
        if (i2 == 0) {
            d4.a(this.O.c(), this.M, "aebb2");
        }
        R0();
        this.O.c();
        this.O.c().d("close_type", String.valueOf(i2));
        HashMap map = new HashMap(2);
        map.put("closetype", String.valueOf(i2));
        map.put("version", this.f10284i.f7054e);
        e0("onhide", map);
    }

    @Override // com.google.android.gms.internal.ads.ew
    public final void X() {
        R0();
        HashMap map = new HashMap(1);
        map.put("version", this.f10284i.f7054e);
        e0("onhide", map);
    }

    @Override // com.google.android.gms.internal.ads.ew
    public final synchronized void Y(e.c.b.b.b.b bVar) {
        this.t = bVar;
    }

    @Override // com.google.android.gms.internal.ads.vc, com.google.android.gms.internal.ads.xc
    public final void a(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        String string = jSONObject.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("(window.AFMA_ReceiveMessage || function() {})('");
        sb.append(str);
        sb.append("',");
        sb.append(string);
        sb.append(");");
        String strValueOf = String.valueOf(sb.toString());
        er.zzd(strValueOf.length() != 0 ? "Dispatching AFMA event: ".concat(strValueOf) : new String("Dispatching AFMA event: "));
        I0(sb.toString());
    }

    @Override // com.google.android.gms.internal.ads.ew
    public final boolean a0() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.lx
    public final void b0(boolean z, int i2, String str, String str2) throws NumberFormatException {
        this.r.q0(z, i2, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.lx
    public final void c(zzc zzcVar) throws NumberFormatException {
        this.r.b0(zzcVar);
    }

    @Override // com.google.android.gms.internal.ads.v13
    public final void c0(u13 u13Var) {
        boolean z;
        synchronized (this) {
            z = u13Var.f9355j;
            this.E = z;
        }
        Y0(z);
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.ew
    public final synchronized void destroy() {
        X0();
        this.V.zzc();
        zzm zzmVar = this.s;
        if (zzmVar != null) {
            zzmVar.zzb();
            this.s.zzq();
            this.s = null;
        }
        this.t = null;
        this.r.H0();
        this.I = null;
        this.f10285j = null;
        setOnClickListener(null);
        setOnTouchListener(null);
        if (this.x) {
            return;
        }
        zzs.zzy();
        ev.f(this);
        W0();
        this.x = true;
        zze.zza("Initiating WebView self destruct sequence in 3...");
        zze.zza("Loading blank page in WebView, 2...");
        P0("about:blank");
    }

    @Override // com.google.android.gms.internal.ads.ew, com.google.android.gms.internal.ads.nx
    public final synchronized vx e() {
        return this.u;
    }

    @Override // com.google.android.gms.internal.ads.vc
    public final void e0(String str, Map<String, ?> map) {
        try {
            a(str, zzs.zzc().zzf(map));
        } catch (JSONException unused) {
            er.zzi("Could not convert parameters to JSON.");
        }
    }

    @Override // android.webkit.WebView
    @TargetApi(19)
    public final synchronized void evaluateJavascript(String str, ValueCallback<String> valueCallback) {
        if (!D()) {
            super.evaluateJavascript(str, valueCallback);
            return;
        }
        er.zzl("#004 The webview is destroyed. Ignoring action.", null);
        if (valueCallback != null) {
            valueCallback.onReceiveValue(null);
        }
    }

    @Override // com.google.android.gms.internal.ads.lt
    public final int f() {
        return getMeasuredWidth();
    }

    @Override // com.google.android.gms.internal.ads.ew
    public final WebViewClient f0() {
        return this.r;
    }

    protected final void finalize() throws Throwable {
        try {
            synchronized (this) {
                if (!this.x) {
                    this.r.H0();
                    zzs.zzy();
                    ev.f(this);
                    W0();
                    V0();
                }
            }
        } finally {
            super.finalize();
        }
    }

    @Override // com.google.android.gms.internal.ads.ew, com.google.android.gms.internal.ads.ox
    public final ip2 g() {
        return this.f10282g;
    }

    @Override // com.google.android.gms.internal.ads.ew, com.google.android.gms.internal.ads.lt
    public final synchronized void h(bx bxVar) {
        if (this.D != null) {
            er.zzf("Attempt to create multiple AdWebViewVideoControllers.");
        } else {
            this.D = bxVar;
        }
    }

    @Override // com.google.android.gms.internal.ads.ew
    public final void h0(xo1 xo1Var, ap1 ap1Var) {
        this.n = xo1Var;
        this.o = ap1Var;
    }

    @Override // com.google.android.gms.internal.ads.ew
    public final void i() {
        if (this.N == null) {
            this.O.c();
            j4 j4VarF = m4.f();
            this.N = j4VarF;
            this.O.a("native:view_load", j4VarF);
        }
    }

    @Override // com.google.android.gms.internal.ads.ew, com.google.android.gms.internal.ads.cx
    public final ap1 j() {
        return this.o;
    }

    @Override // com.google.android.gms.internal.ads.jd
    public final void j0(String str, JSONObject jSONObject) {
        o(str, jSONObject.toString());
    }

    @Override // com.google.android.gms.internal.ads.ew
    public final synchronized boolean k() {
        return this.J > 0;
    }

    @Override // com.google.android.gms.internal.ads.ew
    public final void k0() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.ew, com.google.android.gms.internal.ads.lt
    public final synchronized void l(String str, lv lvVar) {
        if (this.d0 == null) {
            this.d0 = new HashMap();
        }
        this.d0.put(str, lvVar);
    }

    @Override // com.google.android.gms.internal.ads.ew
    public final synchronized void l0(e6 e6Var) {
        this.G = e6Var;
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.ew
    public final synchronized void loadData(String str, String str2, String str3) {
        if (D()) {
            er.zzi("#004 The webview is destroyed. Ignoring action.");
        } else {
            super.loadData(str, str2, str3);
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.ew
    public final synchronized void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        if (D()) {
            er.zzi("#004 The webview is destroyed. Ignoring action.");
        } else {
            super.loadDataWithBaseURL(str, str2, str3, str4, str5);
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.ew
    public final synchronized void loadUrl(String str) {
        if (D()) {
            er.zzi("#004 The webview is destroyed. Ignoring action.");
            return;
        }
        try {
            super.loadUrl(str);
        } catch (Exception | IncompatibleClassChangeError | NoClassDefFoundError e2) {
            zzs.zzg().g(e2, "AdWebViewImpl.loadUrl");
            er.zzj("Could not call loadUrl. ", e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.lt
    public final void m(int i2) {
        this.R = i2;
    }

    @Override // com.google.android.gms.internal.ads.ew
    public final synchronized boolean m0() {
        return this.w;
    }

    @Override // com.google.android.gms.internal.ads.ew, com.google.android.gms.internal.ads.qx
    public final View n() {
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0010 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x000b A[Catch: all -> 0x0012, TRY_LEAVE, TryCatch #0 {, blocks: (B:5:0x0004, B:6:0x0007, B:8:0x000b), top: B:16:0x0004 }] */
    @Override // com.google.android.gms.internal.ads.ew
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void n0(boolean r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            if (r2 == 0) goto L7
            r0 = 0
            r1.setBackgroundColor(r0)     // Catch: java.lang.Throwable -> L12
        L7:
            com.google.android.gms.ads.internal.overlay.zzm r0 = r1.s     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto L10
            r0.zzu(r2)     // Catch: java.lang.Throwable -> L12
            monitor-exit(r1)
            return
        L10:
            monitor-exit(r1)
            return
        L12:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.xw.n0(boolean):void");
    }

    @Override // com.google.android.gms.internal.ads.jd, com.google.android.gms.internal.ads.xc
    public final void o(String str, String str2) {
        StringBuilder sb = new StringBuilder(str.length() + 3 + String.valueOf(str2).length());
        sb.append(str);
        sb.append("(");
        sb.append(str2);
        sb.append(");");
        I0(sb.toString());
    }

    @Override // com.google.android.gms.internal.ads.ew
    public final synchronized void o0(j33 j33Var) {
        this.I = j33Var;
    }

    @Override // com.google.android.gms.internal.ads.c93
    public final void onAdClicked() {
        lw lwVar = this.r;
        if (lwVar != null) {
            lwVar.onAdClicked();
        }
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    protected final synchronized void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!D()) {
            this.V.zzd();
        }
        boolean z = this.E;
        lw lwVar = this.r;
        if (lwVar != null && lwVar.A()) {
            if (!this.F) {
                this.r.I();
                this.r.R();
                this.F = true;
            }
            D0();
            z = true;
        }
        Y0(z);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        lw lwVar;
        synchronized (this) {
            if (!D()) {
                this.V.zze();
            }
            super.onDetachedFromWindow();
            if (this.F && (lwVar = this.r) != null && lwVar.A() && getViewTreeObserver() != null && getViewTreeObserver().isAlive()) {
                this.r.I();
                this.r.R();
                this.F = false;
            }
        }
        Y0(false);
    }

    @Override // android.webkit.DownloadListener
    public final void onDownloadStart(String str, String str2, String str3, String str4, long j2) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(Uri.parse(str), str4);
            zzs.zzc();
            zzr.zzN(getContext(), intent);
        } catch (ActivityNotFoundException unused) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 51 + String.valueOf(str4).length());
            sb.append("Couldn't find an Activity to view url/mimetype: ");
            sb.append(str);
            sb.append(" / ");
            sb.append(str4);
            er.zzd(sb.toString());
        }
    }

    @Override // android.webkit.WebView, android.view.View
    @TargetApi(21)
    protected final void onDraw(Canvas canvas) {
        if (D()) {
            return;
        }
        if (Build.VERSION.SDK_INT == 21 && canvas.isHardwareAccelerated() && !isAttachedToWindow()) {
            return;
        }
        super.onDraw(canvas);
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float axisValue = motionEvent.getAxisValue(9);
        float axisValue2 = motionEvent.getAxisValue(10);
        if (motionEvent.getActionMasked() == 8) {
            if (axisValue > 0.0f && !canScrollVertically(-1)) {
                return false;
            }
            if (axisValue < 0.0f && !canScrollVertically(1)) {
                return false;
            }
            if (axisValue2 > 0.0f && !canScrollHorizontally(-1)) {
                return false;
            }
            if (axisValue2 < 0.0f && !canScrollHorizontally(1)) {
                return false;
            }
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() throws JSONException {
        boolean zD0 = D0();
        zzm zzmVarP = p();
        if (zzmVarP == null || !zD0) {
            return;
        }
        zzmVarP.zzC();
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0087  */
    @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    @android.annotation.SuppressLint({"DrawAllocation"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final synchronized void onMeasure(int r9, int r10) {
        /*
            Method dump skipped, instructions count: 496
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.xw.onMeasure(int, int):void");
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.ew
    public final void onPause() {
        if (D()) {
            return;
        }
        try {
            super.onPause();
        } catch (Exception e2) {
            er.zzg("Could not pause webview.", e2);
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.ew
    public final void onResume() {
        if (D()) {
            return;
        }
        try {
            super.onResume();
        } catch (Exception e2) {
            er.zzg("Could not resume webview.", e2);
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.r.A() || this.r.G()) {
            ip2 ip2Var = this.f10282g;
            if (ip2Var != null) {
                ip2Var.d(motionEvent);
            }
            w4 w4Var = this.f10283h;
            if (w4Var != null) {
                w4Var.a(motionEvent);
            }
        } else {
            synchronized (this) {
                e6 e6Var = this.G;
                if (e6Var != null) {
                    e6Var.a(motionEvent);
                }
            }
        }
        if (D()) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // com.google.android.gms.internal.ads.ew
    public final synchronized zzm p() {
        return this.s;
    }

    @Override // com.google.android.gms.internal.ads.ew
    public final synchronized void p0(vx vxVar) {
        this.u = vxVar;
        requestLayout();
    }

    @Override // com.google.android.gms.internal.ads.ew
    public final WebView q() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.lx
    public final void q0(zzbh zzbhVar, x21 x21Var, nu0 nu0Var, cu1 cu1Var, String str, String str2, int i2) throws NumberFormatException {
        this.r.c0(zzbhVar, x21Var, nu0Var, cu1Var, str, str2, i2);
    }

    @Override // com.google.android.gms.internal.ads.ew
    public final synchronized boolean r() {
        return this.y;
    }

    @Override // com.google.android.gms.internal.ads.lt
    public final synchronized void r0(int i2) {
        this.Q = i2;
    }

    @Override // com.google.android.gms.internal.ads.ew
    public final g52<String> s() {
        return this.f10283h.b();
    }

    @Override // com.google.android.gms.internal.ads.ew
    public final synchronized void s0(boolean z) {
        this.B = z;
    }

    @Override // android.view.View, com.google.android.gms.internal.ads.ew
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.P = new WeakReference<>(onClickListener);
        super.setOnClickListener(onClickListener);
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.ew
    public final void setWebViewClient(WebViewClient webViewClient) {
        super.setWebViewClient(webViewClient);
        if (webViewClient instanceof lw) {
            this.r = (lw) webViewClient;
        }
    }

    @Override // android.webkit.WebView
    public final void stopLoading() {
        if (D()) {
            return;
        }
        try {
            super.stopLoading();
        } catch (Exception e2) {
            er.zzg("Could not stop loading webview.", e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.ew
    public final void t() {
        if (this.L == null) {
            d4.a(this.O.c(), this.M, "aes2");
            this.O.c();
            j4 j4VarF = m4.f();
            this.L = j4VarF;
            this.O.a("native:view_show", j4VarF);
        }
        HashMap map = new HashMap(1);
        map.put("version", this.f10284i.f7054e);
        e0("onshow", map);
    }

    @Override // com.google.android.gms.internal.ads.ew
    public final synchronized void t0() {
        zze.zza("Destroying WebView!");
        V0();
        zzr.zza.post(new ww(this));
    }

    @Override // com.google.android.gms.internal.ads.ew
    public final void u0(String str, com.google.android.gms.common.util.o<ba<? super ew>> oVar) {
        lw lwVar = this.r;
        if (lwVar != null) {
            lwVar.G0(str, oVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.ew
    public final synchronized void v(int i2) {
        zzm zzmVar = this.s;
        if (zzmVar != null) {
            zzmVar.zzw(i2);
        }
    }

    @Override // com.google.android.gms.internal.ads.ew
    public final synchronized String v0() {
        return this.v;
    }

    @Override // com.google.android.gms.internal.ads.ew
    public final void w(boolean z) {
        this.r.a(z);
    }

    @Override // com.google.android.gms.internal.ads.ew
    public final synchronized void w0(boolean z) {
        boolean z2 = this.y;
        this.y = z;
        S0();
        if (z != z2) {
            if (!((Boolean) c.c().b(w3.L)).booleanValue() || !this.u.g()) {
                new vi(this, "").f(true != z ? "default" : "expanded");
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.ew
    public final synchronized zzm y() {
        return this.T;
    }

    @Override // com.google.android.gms.internal.ads.ew
    public final synchronized boolean y0() {
        return this.B;
    }

    @Override // com.google.android.gms.internal.ads.lt
    public final synchronized lv z(String str) {
        Map<String, lv> map = this.d0;
        if (map == null) {
            return null;
        }
        return map.get(str);
    }

    @Override // com.google.android.gms.internal.ads.lt
    public final synchronized void zzA() {
        b6 b6Var = this.H;
        if (b6Var != null) {
            b6Var.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.lt
    public final void zzC(int i2) {
        this.S = i2;
    }

    @Override // com.google.android.gms.internal.ads.lt
    public final int zzD() {
        return this.R;
    }

    @Override // com.google.android.gms.internal.ads.lt
    public final int zzE() {
        return this.S;
    }

    @Override // com.google.android.gms.internal.ads.ew, com.google.android.gms.internal.ads.uv
    public final xo1 zzF() {
        return this.n;
    }

    @Override // com.google.android.gms.internal.ads.jd, com.google.android.gms.internal.ads.xc
    public final void zza(String str) {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.zzl
    public final synchronized void zzbl() {
        zzl zzlVar = this.f10285j;
        if (zzlVar != null) {
            zzlVar.zzbl();
        }
    }

    @Override // com.google.android.gms.ads.internal.zzl
    public final synchronized void zzbm() {
        zzl zzlVar = this.f10285j;
        if (zzlVar != null) {
            zzlVar.zzbm();
        }
    }

    @Override // com.google.android.gms.internal.ads.lt
    public final ct zzf() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.lt
    public final void zzg(boolean z) {
        this.r.J0(false);
    }

    @Override // com.google.android.gms.internal.ads.ew, com.google.android.gms.internal.ads.lt
    public final synchronized bx zzh() {
        return this.D;
    }

    @Override // com.google.android.gms.internal.ads.lt
    public final j4 zzi() {
        return this.M;
    }

    @Override // com.google.android.gms.internal.ads.ew, com.google.android.gms.internal.ads.hx, com.google.android.gms.internal.ads.lt
    public final Activity zzj() {
        return this.f10281f.a();
    }

    @Override // com.google.android.gms.internal.ads.ew, com.google.android.gms.internal.ads.lt
    public final zza zzk() {
        return this.f10286k;
    }

    @Override // com.google.android.gms.internal.ads.lt
    public final void zzl() {
        zzm zzmVarP = p();
        if (zzmVarP != null) {
            zzmVarP.zzE();
        }
    }

    @Override // com.google.android.gms.internal.ads.lt
    public final synchronized String zzm() {
        return this.C;
    }

    @Override // com.google.android.gms.internal.ads.lt
    public final synchronized String zzn() {
        ap1 ap1Var = this.o;
        if (ap1Var == null) {
            return null;
        }
        return ap1Var.f4967b;
    }

    @Override // com.google.android.gms.internal.ads.lt
    public final synchronized int zzp() {
        return this.Q;
    }

    @Override // com.google.android.gms.internal.ads.ew, com.google.android.gms.internal.ads.lt
    public final k4 zzq() {
        return this.O;
    }

    @Override // com.google.android.gms.internal.ads.ew, com.google.android.gms.internal.ads.px, com.google.android.gms.internal.ads.lt
    public final kr zzt() {
        return this.f10284i;
    }

    @Override // com.google.android.gms.internal.ads.lt
    public final int zzy() {
        return getMeasuredHeight();
    }
}