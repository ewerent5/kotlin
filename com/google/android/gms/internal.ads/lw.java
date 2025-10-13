package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.net.Uri;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import ch.qos.logback.core.net.SyslogConstants;
import com.androidplot.R;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.ads.internal.overlay.zzm;
import com.google.android.gms.ads.internal.overlay.zzn;
import com.google.android.gms.ads.internal.overlay.zzp;
import com.google.android.gms.ads.internal.overlay.zzw;
import com.google.android.gms.ads.internal.util.zzbh;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzr;
import com.google.android.gms.ads.internal.zzb;
import com.google.android.gms.ads.internal.zzs;
import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;
import okhttp3.internal.ws.WebSocketProtocol;
import org.json.JSONException;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public class lw extends WebViewClient implements tx {

    /* renamed from: e */
    public static final /* synthetic */ int f7335e = 0;
    private boolean A;
    private int B;
    private boolean C;
    private final HashSet<String> D;
    private View.OnAttachStateChangeListener E;

    /* renamed from: f */
    private final ew f7336f;

    /* renamed from: g */
    private final w43 f7337g;

    /* renamed from: h */
    private final HashMap<String, List<ba<? super ew>>> f7338h;

    /* renamed from: i */
    private final Object f7339i;

    /* renamed from: j */
    private c93 f7340j;

    /* renamed from: k */
    private zzp f7341k;

    /* renamed from: l */
    private rx f7342l;

    /* renamed from: m */
    private sx f7343m;
    private b9 n;
    private d9 o;
    private boolean p;
    private boolean q;

    @GuardedBy("lock")
    private boolean r;

    @GuardedBy("lock")
    private boolean s;

    @GuardedBy("lock")
    private boolean t;
    private zzw u;
    private ui v;
    private zzb w;
    private pi x;
    protected ho y;
    private boolean z;

    public lw(ew ewVar, w43 w43Var, boolean z) {
        ui uiVar = new ui(ewVar, ewVar.N(), new h3(ewVar.getContext()));
        this.f7338h = new HashMap<>();
        this.f7339i = new Object();
        this.f7337g = w43Var;
        this.f7336f = ewVar;
        this.r = z;
        this.v = uiVar;
        this.x = null;
        this.D = new HashSet<>(Arrays.asList(((String) c.c().b(w3.M3)).split(",")));
    }

    public final void m(final View view, final ho hoVar, final int i2) {
        if (!hoVar.zzc() || i2 <= 0) {
            return;
        }
        hoVar.a(view);
        if (hoVar.zzc()) {
            zzr.zza.postDelayed(new Runnable(this, view, hoVar, i2) { // from class: com.google.android.gms.internal.ads.fw

                /* renamed from: e, reason: collision with root package name */
                private final lw f5961e;

                /* renamed from: f, reason: collision with root package name */
                private final View f5962f;

                /* renamed from: g, reason: collision with root package name */
                private final ho f5963g;

                /* renamed from: h, reason: collision with root package name */
                private final int f5964h;

                {
                    this.f5961e = this;
                    this.f5962f = view;
                    this.f5963g = hoVar;
                    this.f5964h = i2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.f5961e.c(this.f5962f, this.f5963g, this.f5964h);
                }
            }, 100L);
        }
    }

    private final void o() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.E;
        if (onAttachStateChangeListener == null) {
            return;
        }
        ((View) this.f7336f).removeOnAttachStateChangeListener(onAttachStateChangeListener);
    }

    private static WebResourceResponse u() {
        if (((Boolean) c.c().b(w3.v0)).booleanValue()) {
            return new WebResourceResponse("", "", new ByteArrayInputStream(new byte[0]));
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:112:0x00f8, code lost:
    
        com.google.android.gms.ads.internal.zzs.zzc();
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0102, code lost:
    
        return com.google.android.gms.ads.internal.util.zzr.zzQ(r1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final android.webkit.WebResourceResponse x(java.lang.String r11, java.util.Map<java.lang.String, java.lang.String> r12) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 283
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.lw.x(java.lang.String, java.util.Map):android.webkit.WebResourceResponse");
    }

    public final void z(Map<String, String> map, List<ba<? super ew>> list, String str) {
        if (zze.zzc()) {
            zze.zza(str.length() != 0 ? "Received GMSG: ".concat(str) : new String("Received GMSG: "));
            for (String str2 : map.keySet()) {
                String str3 = map.get(str2);
                StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 4 + String.valueOf(str3).length());
                sb.append("  ");
                sb.append(str2);
                sb.append(": ");
                sb.append(str3);
                zze.zza(sb.toString());
            }
        }
        Iterator<ba<? super ew>> it = list.iterator();
        while (it.hasNext()) {
            it.next().a(this.f7336f, map);
        }
    }

    public final boolean A() {
        boolean z;
        synchronized (this.f7339i) {
            z = this.s;
        }
        return z;
    }

    public final void B0(String str, ba<? super ew> baVar) {
        synchronized (this.f7339i) {
            List<ba<? super ew>> copyOnWriteArrayList = this.f7338h.get(str);
            if (copyOnWriteArrayList == null) {
                copyOnWriteArrayList = new CopyOnWriteArrayList<>();
                this.f7338h.put(str, copyOnWriteArrayList);
            }
            copyOnWriteArrayList.add(baVar);
        }
    }

    public final void D0(String str, ba<? super ew> baVar) {
        synchronized (this.f7339i) {
            List<ba<? super ew>> list = this.f7338h.get(str);
            if (list == null) {
                return;
            }
            list.remove(baVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.tx
    public final void F0(int i2, int i3) {
        pi piVar = this.x;
        if (piVar != null) {
            piVar.l(i2, i3);
        }
    }

    public final boolean G() {
        boolean z;
        synchronized (this.f7339i) {
            z = this.t;
        }
        return z;
    }

    public final void G0(String str, com.google.android.gms.common.util.o<ba<? super ew>> oVar) {
        synchronized (this.f7339i) {
            List<ba<? super ew>> list = this.f7338h.get(str);
            if (list == null) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            for (ba<? super ew> baVar : list) {
                if (oVar.apply(baVar)) {
                    arrayList.add(baVar);
                }
            }
            list.removeAll(arrayList);
        }
    }

    public final void H0() {
        ho hoVar = this.y;
        if (hoVar != null) {
            hoVar.zzf();
            this.y = null;
        }
        o();
        synchronized (this.f7339i) {
            this.f7338h.clear();
            this.f7340j = null;
            this.f7341k = null;
            this.f7342l = null;
            this.f7343m = null;
            this.n = null;
            this.o = null;
            this.p = false;
            this.r = false;
            this.s = false;
            this.u = null;
            this.w = null;
            this.v = null;
            pi piVar = this.x;
            if (piVar != null) {
                piVar.i(true);
                this.x = null;
            }
        }
    }

    public final ViewTreeObserver.OnGlobalLayoutListener I() {
        synchronized (this.f7339i) {
        }
        return null;
    }

    protected final WebResourceResponse I0(String str, Map<String, String> map) {
        e43 e43VarC;
        try {
            String strA = mp.a(str, this.f7336f.getContext(), this.C);
            if (!strA.equals(str)) {
                return x(strA, map);
            }
            h43 h43VarC = h43.c(Uri.parse(str));
            if (h43VarC != null && (e43VarC = zzs.zzi().c(h43VarC)) != null && e43VarC.zza()) {
                return new WebResourceResponse("", "", e43VarC.c());
            }
            if (dr.j() && i5.f6480b.e().booleanValue()) {
                return x(str, map);
            }
            return null;
        } catch (Exception | NoClassDefFoundError e2) {
            zzs.zzg().g(e2, "AdWebViewClient.interceptRequest");
            return u();
        }
    }

    @Override // com.google.android.gms.internal.ads.tx
    public final void J(Uri uri) {
        String path = uri.getPath();
        List<ba<? super ew>> list = this.f7338h.get(path);
        if (path == null || list == null) {
            String strValueOf = String.valueOf(uri);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 32);
            sb.append("No GMSG handler found for GMSG: ");
            sb.append(strValueOf);
            zze.zza(sb.toString());
            if (!((Boolean) c.c().b(w3.O4)).booleanValue() || zzs.zzg().a() == null) {
                return;
            }
            final String strSubstring = (path == null || path.length() < 2) ? "null" : path.substring(1);
            qr.a.execute(new Runnable(strSubstring) { // from class: com.google.android.gms.internal.ads.hw

                /* renamed from: e, reason: collision with root package name */
                private final String f6416e;

                {
                    this.f6416e = strSubstring;
                }

                @Override // java.lang.Runnable
                public final void run() throws Throwable {
                    String str = this.f6416e;
                    int i2 = lw.f7335e;
                    zzs.zzg().a().e(str);
                }
            });
            return;
        }
        String encodedQuery = uri.getEncodedQuery();
        if (((Boolean) c.c().b(w3.L3)).booleanValue() && this.D.contains(path) && encodedQuery != null) {
            if (encodedQuery.length() >= ((Integer) c.c().b(w3.N3)).intValue()) {
                zze.zza(path.length() != 0 ? "Parsing gmsg query params on BG thread: ".concat(path) : new String("Parsing gmsg query params on BG thread: "));
                y42.o(zzs.zzc().zzi(uri), new jw(this, list, path, uri), qr.f8450e);
                return;
            }
        }
        zzs.zzc();
        z(zzr.zzP(uri), list, path);
    }

    public final void J0(boolean z) {
        this.p = false;
    }

    public final ViewTreeObserver.OnScrollChangedListener R() {
        synchronized (this.f7339i) {
        }
        return null;
    }

    public final void V() {
        if (this.f7342l != null && ((this.z && this.B <= 0) || this.A || this.q)) {
            if (((Boolean) c.c().b(w3.j1)).booleanValue() && this.f7336f.zzq() != null) {
                d4.a(this.f7336f.zzq().c(), this.f7336f.zzi(), "awfllc");
            }
            rx rxVar = this.f7342l;
            boolean z = false;
            if (!this.A && !this.q) {
                z = true;
            }
            rxVar.zza(z);
            this.f7342l = null;
        }
        this.f7336f.i();
    }

    @Override // com.google.android.gms.internal.ads.tx
    public final void Z(boolean z) {
        synchronized (this.f7339i) {
            this.t = z;
        }
    }

    public final void a(boolean z) {
        this.C = z;
    }

    final /* synthetic */ void b() throws JSONException {
        this.f7336f.E();
        zzm zzmVarP = this.f7336f.p();
        if (zzmVarP != null) {
            zzmVarP.zzv();
        }
    }

    public final void b0(zzc zzcVar) throws NumberFormatException {
        boolean zR = this.f7336f.r();
        r0(new AdOverlayInfoParcel(zzcVar, (!zR || this.f7336f.e().g()) ? this.f7340j : null, zR ? null : this.f7341k, this.u, this.f7336f.zzt(), this.f7336f));
    }

    final /* synthetic */ void c(View view, ho hoVar, int i2) {
        m(view, hoVar, i2 - 1);
    }

    public final void c0(zzbh zzbhVar, x21 x21Var, nu0 nu0Var, cu1 cu1Var, String str, String str2, int i2) throws NumberFormatException {
        ew ewVar = this.f7336f;
        r0(new AdOverlayInfoParcel(ewVar, ewVar.zzt(), zzbhVar, x21Var, nu0Var, cu1Var, str, str2, i2));
    }

    @Override // com.google.android.gms.internal.ads.tx
    public final void d0(sx sxVar) {
        this.f7343m = sxVar;
    }

    public final void e0(boolean z, int i2) throws NumberFormatException {
        c93 c93Var = (!this.f7336f.r() || this.f7336f.e().g()) ? this.f7340j : null;
        zzp zzpVar = this.f7341k;
        zzw zzwVar = this.u;
        ew ewVar = this.f7336f;
        r0(new AdOverlayInfoParcel(c93Var, zzpVar, zzwVar, ewVar, z, i2, ewVar.zzt()));
    }

    @Override // com.google.android.gms.internal.ads.tx
    public final void g0(int i2, int i3, boolean z) {
        ui uiVar = this.v;
        if (uiVar != null) {
            uiVar.h(i2, i3);
        }
        pi piVar = this.x;
        if (piVar != null) {
            piVar.j(i2, i3, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.tx
    public final void i0(rx rxVar) {
        this.f7342l = rxVar;
    }

    public final void j0(boolean z, int i2, String str) throws NumberFormatException {
        boolean zR = this.f7336f.r();
        c93 c93Var = (!zR || this.f7336f.e().g()) ? this.f7340j : null;
        kw kwVar = zR ? null : new kw(this.f7336f, this.f7341k);
        b9 b9Var = this.n;
        d9 d9Var = this.o;
        zzw zzwVar = this.u;
        ew ewVar = this.f7336f;
        r0(new AdOverlayInfoParcel(c93Var, kwVar, b9Var, d9Var, zzwVar, ewVar, z, i2, str, ewVar.zzt()));
    }

    @Override // com.google.android.gms.internal.ads.c93
    public final void onAdClicked() {
        c93 c93Var = this.f7340j;
        if (c93Var != null) {
            c93Var.onAdClicked();
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        String strValueOf = String.valueOf(str);
        zze.zza(strValueOf.length() != 0 ? "Loading resource: ".concat(strValueOf) : new String("Loading resource: "));
        Uri uri = Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(uri.getScheme()) && "mobileads.google.com".equalsIgnoreCase(uri.getHost())) {
            J(uri);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        synchronized (this.f7339i) {
            if (this.f7336f.D()) {
                zze.zza("Blank page loaded, 1...");
                this.f7336f.t0();
                return;
            }
            this.z = true;
            sx sxVar = this.f7343m;
            if (sxVar != null) {
                sxVar.zzb();
                this.f7343m = null;
            }
            V();
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i2, String str, String str2) {
        this.q = true;
    }

    @Override // android.webkit.WebViewClient
    @TargetApi(26)
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        return this.f7336f.S(renderProcessGoneDetail.didCrash(), renderProcessGoneDetail.rendererPriorityAtExit());
    }

    public final void q0(boolean z, int i2, String str, String str2) throws NumberFormatException {
        boolean zR = this.f7336f.r();
        c93 c93Var = (!zR || this.f7336f.e().g()) ? this.f7340j : null;
        kw kwVar = zR ? null : new kw(this.f7336f, this.f7341k);
        b9 b9Var = this.n;
        d9 d9Var = this.o;
        zzw zzwVar = this.u;
        ew ewVar = this.f7336f;
        r0(new AdOverlayInfoParcel(c93Var, kwVar, b9Var, d9Var, zzwVar, ewVar, z, i2, str, str2, ewVar.zzt()));
    }

    public final void r0(AdOverlayInfoParcel adOverlayInfoParcel) throws NumberFormatException {
        zzc zzcVar;
        pi piVar = this.x;
        boolean zK = piVar != null ? piVar.k() : false;
        zzs.zzb();
        zzn.zza(this.f7336f.getContext(), adOverlayInfoParcel, !zK);
        ho hoVar = this.y;
        if (hoVar != null) {
            String str = adOverlayInfoParcel.zzl;
            if (str == null && (zzcVar = adOverlayInfoParcel.zza) != null) {
                str = zzcVar.zzb;
            }
            hoVar.c(str);
        }
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return I0(str, Collections.emptyMap());
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 79 || keyCode == 222) {
            return true;
        }
        switch (keyCode) {
            case 85:
            case 86:
            case 87:
            case SyslogConstants.LOG_FTP /* 88 */:
            case 89:
            case R.styleable.xy_XYPlot_rangeLineExtension /* 90 */:
            case 91:
                return true;
            default:
                switch (keyCode) {
                    case WebSocketProtocol.PAYLOAD_SHORT /* 126 */:
                    case 127:
                    case 128:
                    case 129:
                    case 130:
                        return true;
                    default:
                        return false;
                }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) throws NumberFormatException {
        String strValueOf = String.valueOf(str);
        zze.zza(strValueOf.length() != 0 ? "AdWebView shouldOverrideUrlLoading: ".concat(strValueOf) : new String("AdWebView shouldOverrideUrlLoading: "));
        Uri uriE = Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(uriE.getScheme()) && "mobileads.google.com".equalsIgnoreCase(uriE.getHost())) {
            J(uriE);
            return true;
        }
        if (this.p && webView == this.f7336f.q()) {
            String scheme = uriE.getScheme();
            if ("http".equalsIgnoreCase(scheme) || "https".equalsIgnoreCase(scheme)) {
                c93 c93Var = this.f7340j;
                if (c93Var != null) {
                    c93Var.onAdClicked();
                    ho hoVar = this.y;
                    if (hoVar != null) {
                        hoVar.c(str);
                    }
                    this.f7340j = null;
                }
                return super.shouldOverrideUrlLoading(webView, str);
            }
        }
        if (this.f7336f.q().willNotDraw()) {
            String strValueOf2 = String.valueOf(str);
            er.zzi(strValueOf2.length() != 0 ? "AdWebView unable to handle URL: ".concat(strValueOf2) : new String("AdWebView unable to handle URL: "));
            return true;
        }
        try {
            ip2 ip2VarG = this.f7336f.g();
            if (ip2VarG != null && ip2VarG.a(uriE)) {
                Context context = this.f7336f.getContext();
                ew ewVar = this.f7336f;
                uriE = ip2VarG.e(uriE, context, (View) ewVar, ewVar.zzj());
            }
        } catch (jp2 unused) {
            String strValueOf3 = String.valueOf(str);
            er.zzi(strValueOf3.length() != 0 ? "Unable to append parameter to URL: ".concat(strValueOf3) : new String("Unable to append parameter to URL: "));
        }
        zzb zzbVar = this.w;
        if (zzbVar == null || zzbVar.zzb()) {
            b0(new zzc("android.intent.action.VIEW", uriE.toString(), null, null, null, null, null, null));
            return true;
        }
        this.w.zzc(str);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.tx
    public final void x0(boolean z) {
        synchronized (this.f7339i) {
            this.s = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.tx
    public final void z0(c93 c93Var, b9 b9Var, zzp zzpVar, d9 d9Var, zzw zzwVar, boolean z, ea eaVar, zzb zzbVar, wi wiVar, ho hoVar, x21 x21Var, vu1 vu1Var, nu0 nu0Var, cu1 cu1Var, ca caVar) {
        zzb zzbVar2 = zzbVar == null ? new zzb(this.f7336f.getContext(), hoVar, null) : zzbVar;
        this.x = new pi(this.f7336f, wiVar);
        this.y = hoVar;
        if (((Boolean) c.c().b(w3.C0)).booleanValue()) {
            B0("/adMetadata", new a9(b9Var));
        }
        if (d9Var != null) {
            B0("/appEvent", new c9(d9Var));
        }
        B0("/backButton", aa.f4878k);
        B0("/refresh", aa.f4879l);
        B0("/canOpenApp", aa.f4869b);
        B0("/canOpenURLs", aa.a);
        B0("/canOpenIntents", aa.f4870c);
        B0("/close", aa.f4872e);
        B0("/customClose", aa.f4873f);
        B0("/instrument", aa.o);
        B0("/delayPageLoaded", aa.q);
        B0("/delayPageClosed", aa.r);
        B0("/getLocationInfo", aa.s);
        B0("/log", aa.f4875h);
        B0("/mraid", new ia(zzbVar2, this.x, wiVar));
        ui uiVar = this.v;
        if (uiVar != null) {
            B0("/mraidLoaded", uiVar);
        }
        B0("/open", new na(zzbVar2, this.x, x21Var, nu0Var, cu1Var));
        B0("/precache", new mv());
        B0("/touch", aa.f4877j);
        B0("/video", aa.f4880m);
        B0("/videoMeta", aa.n);
        if (x21Var == null || vu1Var == null) {
            B0("/click", aa.f4871d);
            B0("/httpTrack", aa.f4874g);
        } else {
            B0("/click", zp1.a(x21Var, vu1Var));
            B0("/httpTrack", zp1.b(x21Var, vu1Var));
        }
        if (zzs.zzA().g(this.f7336f.getContext())) {
            B0("/logScionEvent", new ha(this.f7336f.getContext()));
        }
        if (eaVar != null) {
            B0("/setInterstitialProperties", new da(eaVar, null));
        }
        if (caVar != null) {
            if (((Boolean) c.c().b(w3.P5)).booleanValue()) {
                B0("/inspectorNetworkExtras", caVar);
            }
        }
        this.f7340j = c93Var;
        this.f7341k = zzpVar;
        this.n = b9Var;
        this.o = d9Var;
        this.u = zzwVar;
        this.w = zzbVar2;
        this.p = z;
    }

    @Override // com.google.android.gms.internal.ads.tx
    public final void zzA() {
        synchronized (this.f7339i) {
            this.p = false;
            this.r = true;
            qr.f8450e.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.gw

                /* renamed from: e, reason: collision with root package name */
                private final lw f6212e;

                {
                    this.f6212e = this;
                }

                @Override // java.lang.Runnable
                public final void run() throws JSONException {
                    this.f6212e.b();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.tx
    public final zzb zzb() {
        return this.w;
    }

    @Override // com.google.android.gms.internal.ads.tx
    public final boolean zzc() {
        boolean z;
        synchronized (this.f7339i) {
            z = this.r;
        }
        return z;
    }

    @Override // com.google.android.gms.internal.ads.tx
    public final void zzh() {
        ho hoVar = this.y;
        if (hoVar != null) {
            WebView webViewQ = this.f7336f.q();
            if (c.h.l.t.P(webViewQ)) {
                m(webViewQ, hoVar, 10);
                return;
            }
            o();
            iw iwVar = new iw(this, hoVar);
            this.E = iwVar;
            ((View) this.f7336f).addOnAttachStateChangeListener(iwVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.tx
    public final void zzi() {
        synchronized (this.f7339i) {
        }
        this.B++;
        V();
    }

    @Override // com.google.android.gms.internal.ads.tx
    public final void zzj() {
        this.B--;
        V();
    }

    @Override // com.google.android.gms.internal.ads.tx
    public final void zzk() {
        w43 w43Var = this.f7337g;
        if (w43Var != null) {
            w43Var.b(y43.DELAY_PAGE_LOAD_CANCELLED_AD);
        }
        this.A = true;
        V();
        this.f7336f.destroy();
    }
}