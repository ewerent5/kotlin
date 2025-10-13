package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.webkit.WebView;
import com.google.android.gms.ads.AdInspectorError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.OnAdInspectorClosedListener;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.initialization.AdapterStatus;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public final class c2 {

    @GuardedBy("InternalMobileAds.class")
    private static c2 a;

    /* renamed from: d, reason: collision with root package name */
    @GuardedBy("lock")
    private o0 f5240d;

    /* renamed from: i, reason: collision with root package name */
    private InitializationStatus f5245i;

    /* renamed from: c, reason: collision with root package name */
    private final Object f5239c = new Object();

    /* renamed from: e, reason: collision with root package name */
    private boolean f5241e = false;

    /* renamed from: f, reason: collision with root package name */
    private boolean f5242f = false;

    /* renamed from: g, reason: collision with root package name */
    @Nullable
    private OnAdInspectorClosedListener f5243g = null;

    /* renamed from: h, reason: collision with root package name */
    private RequestConfiguration f5244h = new RequestConfiguration.Builder().build();

    /* renamed from: b, reason: collision with root package name */
    private final ArrayList<OnInitializationCompleteListener> f5238b = new ArrayList<>();

    private c2() {
    }

    public static c2 a() {
        c2 c2Var;
        synchronized (c2.class) {
            if (a == null) {
                a = new c2();
            }
            c2Var = a;
        }
        return c2Var;
    }

    static /* synthetic */ boolean q(c2 c2Var, boolean z) {
        c2Var.f5241e = false;
        return false;
    }

    static /* synthetic */ boolean r(c2 c2Var, boolean z) {
        c2Var.f5242f = true;
        return true;
    }

    @GuardedBy("lock")
    private final void v(RequestConfiguration requestConfiguration) {
        try {
            this.f5240d.F1(new x2(requestConfiguration));
        } catch (RemoteException e2) {
            er.zzg("Unable to set request configuration parcel.", e2);
        }
    }

    @GuardedBy("lock")
    private final void w(Context context) {
        if (this.f5240d == null) {
            this.f5240d = new na3(ta3.b(), context).d(context, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InitializationStatus x(List<xb> list) {
        HashMap map = new HashMap();
        for (xb xbVar : list) {
            map.put(xbVar.f10149e, new fc(xbVar.f10150f ? AdapterStatus.State.READY : AdapterStatus.State.NOT_READY, xbVar.f10152h, xbVar.f10151g));
        }
        return new gc(map);
    }

    public final void b(Context context, @Nullable String str, @Nullable final OnInitializationCompleteListener onInitializationCompleteListener) {
        synchronized (this.f5239c) {
            if (this.f5241e) {
                if (onInitializationCompleteListener != null) {
                    a().f5238b.add(onInitializationCompleteListener);
                }
                return;
            }
            if (this.f5242f) {
                if (onInitializationCompleteListener != null) {
                    onInitializationCompleteListener.onInitializationComplete(j());
                }
                return;
            }
            this.f5241e = true;
            if (onInitializationCompleteListener != null) {
                a().f5238b.add(onInitializationCompleteListener);
            }
            if (context == null) {
                throw new IllegalArgumentException("Context cannot be null.");
            }
            try {
                z1 z1Var = null;
                lf.a().b(context, null);
                w(context);
                if (onInitializationCompleteListener != null) {
                    this.f5240d.D0(new b2(this, z1Var));
                }
                this.f5240d.L2(new pf());
                this.f5240d.zze();
                this.f5240d.Z0(null, e.c.b.b.b.d.m4(null));
                if (this.f5244h.getTagForChildDirectedTreatment() != -1 || this.f5244h.getTagForUnderAgeOfConsent() != -1) {
                    v(this.f5244h);
                }
                w3.a(context);
                if (!((Boolean) c.c().b(w3.A3)).booleanValue() && !h().endsWith("0")) {
                    er.zzf("Google Mobile Ads SDK initialization functionality unavailable for this session. Ad requests can be made at any time.");
                    this.f5245i = new y1(this);
                    if (onInitializationCompleteListener != null) {
                        xq.a.post(new Runnable(this, onInitializationCompleteListener) { // from class: com.google.android.gms.internal.ads.x1

                            /* renamed from: e, reason: collision with root package name */
                            private final c2 f10099e;

                            /* renamed from: f, reason: collision with root package name */
                            private final OnInitializationCompleteListener f10100f;

                            {
                                this.f10099e = this;
                                this.f10100f = onInitializationCompleteListener;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                this.f10099e.p(this.f10100f);
                            }
                        });
                    }
                }
            } catch (RemoteException e2) {
                er.zzj("MobileAdsSettingManager initialization failed", e2);
            }
        }
    }

    public final void c(float f2) {
        boolean z = true;
        com.google.android.gms.common.internal.p.b(f2 >= 0.0f && f2 <= 1.0f, "The app volume must be a value between 0 and 1 inclusive.");
        synchronized (this.f5239c) {
            if (this.f5240d == null) {
                z = false;
            }
            com.google.android.gms.common.internal.p.n(z, "MobileAds.initialize() must be called prior to setting the app volume.");
            try {
                this.f5240d.V0(f2);
            } catch (RemoteException e2) {
                er.zzg("Unable to set app volume.", e2);
            }
        }
    }

    public final float d() {
        synchronized (this.f5239c) {
            o0 o0Var = this.f5240d;
            float fZzk = 1.0f;
            if (o0Var == null) {
                return 1.0f;
            }
            try {
                fZzk = o0Var.zzk();
            } catch (RemoteException e2) {
                er.zzg("Unable to get app volume.", e2);
            }
            return fZzk;
        }
    }

    public final void e(boolean z) {
        synchronized (this.f5239c) {
            com.google.android.gms.common.internal.p.n(this.f5240d != null, "MobileAds.initialize() must be called prior to setting app muted state.");
            try {
                this.f5240d.P(z);
            } catch (RemoteException e2) {
                er.zzg("Unable to set app mute state.", e2);
            }
        }
    }

    public final boolean f() {
        synchronized (this.f5239c) {
            o0 o0Var = this.f5240d;
            boolean zZzl = false;
            if (o0Var == null) {
                return false;
            }
            try {
                zZzl = o0Var.zzl();
            } catch (RemoteException e2) {
                er.zzg("Unable to get app mute state.", e2);
            }
            return zZzl;
        }
    }

    public final void g(Context context, String str) {
        synchronized (this.f5239c) {
            com.google.android.gms.common.internal.p.n(this.f5240d != null, "MobileAds.initialize() must be called prior to opening debug menu.");
            try {
                this.f5240d.U0(e.c.b.b.b.d.m4(context), str);
            } catch (RemoteException e2) {
                er.zzg("Unable to open debug menu.", e2);
            }
        }
    }

    public final String h() {
        String strA;
        synchronized (this.f5239c) {
            com.google.android.gms.common.internal.p.n(this.f5240d != null, "MobileAds.initialize() must be called prior to getting version string.");
            try {
                strA = o12.a(this.f5240d.zzm());
            } catch (RemoteException e2) {
                er.zzg("Unable to get version string.", e2);
                return "";
            }
        }
        return strA;
    }

    public final void i(Class<? extends RtbAdapter> cls) {
        synchronized (this.f5239c) {
            try {
                this.f5240d.J(cls.getCanonicalName());
            } catch (RemoteException e2) {
                er.zzg("Unable to register RtbAdapter", e2);
            }
        }
    }

    public final InitializationStatus j() {
        synchronized (this.f5239c) {
            com.google.android.gms.common.internal.p.n(this.f5240d != null, "MobileAds.initialize() must be called prior to getting initialization status.");
            try {
                InitializationStatus initializationStatus = this.f5245i;
                if (initializationStatus != null) {
                    return initializationStatus;
                }
                return x(this.f5240d.zzq());
            } catch (RemoteException unused) {
                er.zzf("Unable to get Initialization status.");
                return new y1(this);
            }
        }
    }

    public final void k(Context context) {
        synchronized (this.f5239c) {
            w(context);
            try {
                this.f5240d.zzs();
            } catch (RemoteException unused) {
                er.zzf("Unable to disable mediation adapter initialization.");
            }
        }
    }

    public final void l(Context context, OnAdInspectorClosedListener onAdInspectorClosedListener) {
        synchronized (this.f5239c) {
            w(context);
            a().f5243g = onAdInspectorClosedListener;
            try {
                this.f5240d.k4(new a2(null));
            } catch (RemoteException unused) {
                er.zzf("Unable to open the ad inspector.");
                if (onAdInspectorClosedListener != null) {
                    onAdInspectorClosedListener.onAdInspectorClosed(new AdInspectorError(0, "Ad inspector had an internal error.", MobileAds.ERROR_DOMAIN));
                }
            }
        }
    }

    public final RequestConfiguration m() {
        return this.f5244h;
    }

    public final void n(RequestConfiguration requestConfiguration) {
        com.google.android.gms.common.internal.p.b(requestConfiguration != null, "Null passed to setRequestConfiguration.");
        synchronized (this.f5239c) {
            RequestConfiguration requestConfiguration2 = this.f5244h;
            this.f5244h = requestConfiguration;
            if (this.f5240d == null) {
                return;
            }
            if (requestConfiguration2.getTagForChildDirectedTreatment() != requestConfiguration.getTagForChildDirectedTreatment() || requestConfiguration2.getTagForUnderAgeOfConsent() != requestConfiguration.getTagForUnderAgeOfConsent()) {
                v(requestConfiguration);
            }
        }
    }

    public final void o(WebView webView) {
        com.google.android.gms.common.internal.p.e("#008 Must be called on the main UI thread.");
        synchronized (this.f5239c) {
            if (webView == null) {
                er.zzf("The webview to be registered cannot be null.");
                return;
            }
            zp zpVarA = nk.a(webView.getContext());
            if (zpVarA == null) {
                er.zzi("Internal error, query info generator is null.");
                return;
            }
            try {
                zpVarA.zzj(e.c.b.b.b.d.m4(webView));
            } catch (RemoteException e2) {
                er.zzg("", e2);
            }
        }
    }

    final /* synthetic */ void p(OnInitializationCompleteListener onInitializationCompleteListener) {
        onInitializationCompleteListener.onInitializationComplete(this.f5245i);
    }
}