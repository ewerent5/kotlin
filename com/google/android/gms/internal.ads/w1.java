package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.ads.zza;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public final class w1 {
    private final pf a;

    /* renamed from: b, reason: collision with root package name */
    private final q93 f9833b;

    /* renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f9834c;

    /* renamed from: d, reason: collision with root package name */
    private final VideoController f9835d;

    /* renamed from: e, reason: collision with root package name */
    final ua3 f9836e;

    /* renamed from: f, reason: collision with root package name */
    private c93 f9837f;

    /* renamed from: g, reason: collision with root package name */
    private AdListener f9838g;

    /* renamed from: h, reason: collision with root package name */
    private AdSize[] f9839h;

    /* renamed from: i, reason: collision with root package name */
    private AppEventListener f9840i;

    /* renamed from: j, reason: collision with root package name */
    private w f9841j;

    /* renamed from: k, reason: collision with root package name */
    private VideoOptions f9842k;

    /* renamed from: l, reason: collision with root package name */
    private String f9843l;

    /* renamed from: m, reason: collision with root package name */
    @NotOnlyInitialized
    private final ViewGroup f9844m;
    private int n;
    private boolean o;
    private OnPaidEventListener p;

    public w1(ViewGroup viewGroup) {
        this(viewGroup, null, false, q93.a, null, 0);
    }

    private static r93 b(Context context, AdSize[] adSizeArr, int i2) {
        for (AdSize adSize : adSizeArr) {
            if (adSize.equals(AdSize.INVALID)) {
                return r93.L();
            }
        }
        r93 r93Var = new r93(context, adSizeArr);
        r93Var.n = c(i2);
        return r93Var;
    }

    private static boolean c(int i2) {
        return i2 == 1;
    }

    public final void A(VideoOptions videoOptions) {
        this.f9842k = videoOptions;
        try {
            w wVar = this.f9841j;
            if (wVar != null) {
                wVar.zzF(videoOptions == null ? null : new d3(videoOptions));
            }
        } catch (RemoteException e2) {
            er.zzl("#007 Could not call remote method.", e2);
        }
    }

    public final VideoOptions B() {
        return this.f9842k;
    }

    public final boolean C(w wVar) {
        try {
            e.c.b.b.b.b bVarZzb = wVar.zzb();
            if (bVarZzb == null || ((View) e.c.b.b.b.d.Y(bVarZzb)).getParent() != null) {
                return false;
            }
            this.f9844m.addView((View) e.c.b.b.b.d.Y(bVarZzb));
            this.f9841j = wVar;
            return true;
        } catch (RemoteException e2) {
            er.zzl("#007 Could not call remote method.", e2);
            return false;
        }
    }

    public final void d() {
        try {
            w wVar = this.f9841j;
            if (wVar != null) {
                wVar.zzc();
            }
        } catch (RemoteException e2) {
            er.zzl("#007 Could not call remote method.", e2);
        }
    }

    public final AdListener e() {
        return this.f9838g;
    }

    public final AdSize f() {
        r93 r93VarZzn;
        try {
            w wVar = this.f9841j;
            if (wVar != null && (r93VarZzn = wVar.zzn()) != null) {
                return zza.zza(r93VarZzn.f8619i, r93VarZzn.f8616f, r93VarZzn.f8615e);
            }
        } catch (RemoteException e2) {
            er.zzl("#007 Could not call remote method.", e2);
        }
        AdSize[] adSizeArr = this.f9839h;
        if (adSizeArr != null) {
            return adSizeArr[0];
        }
        return null;
    }

    public final AdSize[] g() {
        return this.f9839h;
    }

    public final String h() {
        w wVar;
        if (this.f9843l == null && (wVar = this.f9841j) != null) {
            try {
                this.f9843l = wVar.zzu();
            } catch (RemoteException e2) {
                er.zzl("#007 Could not call remote method.", e2);
            }
        }
        return this.f9843l;
    }

    public final AppEventListener i() {
        return this.f9840i;
    }

    public final void j(u1 u1Var) {
        try {
            if (this.f9841j == null) {
                if (this.f9839h == null || this.f9843l == null) {
                    throw new IllegalStateException("The ad size and ad unit ID must be set before loadAd is called.");
                }
                Context context = this.f9844m.getContext();
                r93 r93VarB = b(context, this.f9839h, this.n);
                w wVarD = "search_v2".equals(r93VarB.f8615e) ? new ka3(ta3.b(), context, r93VarB, this.f9843l).d(context, false) : new ia3(ta3.b(), context, r93VarB, this.f9843l, this.a).d(context, false);
                this.f9841j = wVarD;
                wVarD.zzh(new i93(this.f9836e));
                c93 c93Var = this.f9837f;
                if (c93Var != null) {
                    this.f9841j.zzy(new d93(c93Var));
                }
                AppEventListener appEventListener = this.f9840i;
                if (appEventListener != null) {
                    this.f9841j.zzi(new j23(appEventListener));
                }
                VideoOptions videoOptions = this.f9842k;
                if (videoOptions != null) {
                    this.f9841j.zzF(new d3(videoOptions));
                }
                this.f9841j.zzO(new w2(this.p));
                this.f9841j.zzz(this.o);
                w wVar = this.f9841j;
                if (wVar != null) {
                    try {
                        e.c.b.b.b.b bVarZzb = wVar.zzb();
                        if (bVarZzb != null) {
                            this.f9844m.addView((View) e.c.b.b.b.d.Y(bVarZzb));
                        }
                    } catch (RemoteException e2) {
                        er.zzl("#007 Could not call remote method.", e2);
                    }
                }
            }
            w wVar2 = this.f9841j;
            Objects.requireNonNull(wVar2);
            if (wVar2.zze(this.f9833b.a(this.f9844m.getContext(), u1Var))) {
                this.a.J4(u1Var.n());
            }
        } catch (RemoteException e3) {
            er.zzl("#007 Could not call remote method.", e3);
        }
    }

    public final void k() {
        try {
            w wVar = this.f9841j;
            if (wVar != null) {
                wVar.zzf();
            }
        } catch (RemoteException e2) {
            er.zzl("#007 Could not call remote method.", e2);
        }
    }

    public final void l() {
        if (this.f9834c.getAndSet(true)) {
            return;
        }
        try {
            w wVar = this.f9841j;
            if (wVar != null) {
                wVar.zzm();
            }
        } catch (RemoteException e2) {
            er.zzl("#007 Could not call remote method.", e2);
        }
    }

    public final void m() {
        try {
            w wVar = this.f9841j;
            if (wVar != null) {
                wVar.zzg();
            }
        } catch (RemoteException e2) {
            er.zzl("#007 Could not call remote method.", e2);
        }
    }

    public final void n(AdListener adListener) {
        this.f9838g = adListener;
        this.f9836e.a(adListener);
    }

    public final void o(c93 c93Var) {
        try {
            this.f9837f = c93Var;
            w wVar = this.f9841j;
            if (wVar != null) {
                wVar.zzy(c93Var != null ? new d93(c93Var) : null);
            }
        } catch (RemoteException e2) {
            er.zzl("#007 Could not call remote method.", e2);
        }
    }

    public final void p(AdSize... adSizeArr) {
        if (this.f9839h != null) {
            throw new IllegalStateException("The ad size can only be set once on AdView.");
        }
        q(adSizeArr);
    }

    public final void q(AdSize... adSizeArr) {
        this.f9839h = adSizeArr;
        try {
            w wVar = this.f9841j;
            if (wVar != null) {
                wVar.zzo(b(this.f9844m.getContext(), this.f9839h, this.n));
            }
        } catch (RemoteException e2) {
            er.zzl("#007 Could not call remote method.", e2);
        }
        this.f9844m.requestLayout();
    }

    public final void r(String str) {
        if (this.f9843l != null) {
            throw new IllegalStateException("The ad unit ID can only be set once on AdView.");
        }
        this.f9843l = str;
    }

    public final void s(AppEventListener appEventListener) {
        try {
            this.f9840i = appEventListener;
            w wVar = this.f9841j;
            if (wVar != null) {
                wVar.zzi(appEventListener != null ? new j23(appEventListener) : null);
            }
        } catch (RemoteException e2) {
            er.zzl("#007 Could not call remote method.", e2);
        }
    }

    public final void t(boolean z) {
        this.o = z;
        try {
            w wVar = this.f9841j;
            if (wVar != null) {
                wVar.zzz(z);
            }
        } catch (RemoteException e2) {
            er.zzl("#007 Could not call remote method.", e2);
        }
    }

    public final boolean u() {
        try {
            w wVar = this.f9841j;
            if (wVar != null) {
                return wVar.zzA();
            }
            return false;
        } catch (RemoteException e2) {
            er.zzl("#007 Could not call remote method.", e2);
            return false;
        }
    }

    public final ResponseInfo v() {
        k1 k1VarZzt = null;
        try {
            w wVar = this.f9841j;
            if (wVar != null) {
                k1VarZzt = wVar.zzt();
            }
        } catch (RemoteException e2) {
            er.zzl("#007 Could not call remote method.", e2);
        }
        return ResponseInfo.zzb(k1VarZzt);
    }

    public final void w(OnPaidEventListener onPaidEventListener) {
        try {
            this.p = onPaidEventListener;
            w wVar = this.f9841j;
            if (wVar != null) {
                wVar.zzO(new w2(onPaidEventListener));
            }
        } catch (RemoteException e2) {
            er.zzl("#008 Must be called on the main UI thread.", e2);
        }
    }

    public final OnPaidEventListener x() {
        return this.p;
    }

    public final VideoController y() {
        return this.f9835d;
    }

    public final n1 z() {
        w wVar = this.f9841j;
        if (wVar != null) {
            try {
                return wVar.zzE();
            } catch (RemoteException e2) {
                er.zzl("#007 Could not call remote method.", e2);
            }
        }
        return null;
    }

    public w1(ViewGroup viewGroup, int i2) {
        this(viewGroup, null, false, q93.a, null, i2);
    }

    public w1(ViewGroup viewGroup, AttributeSet attributeSet, boolean z) {
        this(viewGroup, attributeSet, z, q93.a, null, 0);
    }

    public w1(ViewGroup viewGroup, AttributeSet attributeSet, boolean z, int i2) {
        this(viewGroup, attributeSet, z, q93.a, null, i2);
    }

    w1(ViewGroup viewGroup, AttributeSet attributeSet, boolean z, q93 q93Var, w wVar, int i2) {
        r93 r93VarL;
        this.a = new pf();
        this.f9835d = new VideoController();
        this.f9836e = new v1(this);
        this.f9844m = viewGroup;
        this.f9833b = q93Var;
        this.f9841j = null;
        this.f9834c = new AtomicBoolean(false);
        this.n = i2;
        if (attributeSet != null) {
            Context context = viewGroup.getContext();
            try {
                aa3 aa3Var = new aa3(context, attributeSet);
                this.f9839h = aa3Var.a(z);
                this.f9843l = aa3Var.b();
                if (viewGroup.isInEditMode()) {
                    xq xqVarA = ta3.a();
                    AdSize adSize = this.f9839h[0];
                    int i3 = this.n;
                    if (adSize.equals(AdSize.INVALID)) {
                        r93VarL = r93.L();
                    } else {
                        r93 r93Var = new r93(context, adSize);
                        r93Var.n = c(i3);
                        r93VarL = r93Var;
                    }
                    xqVarA.c(viewGroup, r93VarL, "Ads by Google");
                }
            } catch (IllegalArgumentException e2) {
                ta3.a().b(viewGroup, new r93(context, AdSize.BANNER), e2.getMessage(), e2.getMessage());
            }
        }
    }
}