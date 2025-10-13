package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.internal.util.zzbn;
import com.google.android.gms.ads.internal.zzs;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class pm0 extends w6 implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, pn0 {

    /* renamed from: e, reason: collision with root package name */
    public static final b22<String> f8197e = b22.p("2011", "1009", "3010");

    /* renamed from: f, reason: collision with root package name */
    private final String f8198f;

    /* renamed from: h, reason: collision with root package name */
    private FrameLayout f8200h;

    /* renamed from: i, reason: collision with root package name */
    private FrameLayout f8201i;

    /* renamed from: j, reason: collision with root package name */
    private final h52 f8202j;

    /* renamed from: k, reason: collision with root package name */
    private View f8203k;

    /* renamed from: m, reason: collision with root package name */
    @GuardedBy("this")
    private ol0 f8205m;
    private w13 n;
    private q6 p;
    private boolean q;

    /* renamed from: g, reason: collision with root package name */
    @GuardedBy("this")
    private Map<String, WeakReference<View>> f8199g = new HashMap();
    private e.c.b.b.b.b o = null;
    private boolean r = false;

    /* renamed from: l, reason: collision with root package name */
    private final int f8204l = 210890000;

    public pm0(FrameLayout frameLayout, FrameLayout frameLayout2, int i2) {
        this.f8200h = frameLayout;
        this.f8201i = frameLayout2;
        String canonicalName = frameLayout.getClass().getCanonicalName();
        String str = "3012";
        if ("com.google.android.gms.ads.formats.NativeContentAdView".equals(canonicalName)) {
            str = "1007";
        } else if ("com.google.android.gms.ads.formats.NativeAppInstallAdView".equals(canonicalName)) {
            str = "2009";
        } else {
            "com.google.android.gms.ads.formats.UnifiedNativeAdView".equals(canonicalName);
        }
        this.f8198f = str;
        zzs.zzz();
        es.a(frameLayout, this);
        zzs.zzz();
        es.b(frameLayout, this);
        this.f8202j = qr.f8450e;
        this.n = new w13(this.f8200h.getContext(), this.f8200h);
        frameLayout.setOnTouchListener(this);
        frameLayout.setOnClickListener(this);
    }

    private final synchronized void zzr() {
        this.f8202j.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.om0

            /* renamed from: e, reason: collision with root package name */
            private final pm0 f7974e;

            {
                this.f7974e = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f7974e.zzq();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.x6
    public final synchronized void H4(e.c.b.b.b.b bVar) {
        if (this.r) {
            return;
        }
        this.o = bVar;
    }

    @Override // com.google.android.gms.internal.ads.x6
    public final synchronized void K0(q6 q6Var) {
        if (this.r) {
            return;
        }
        this.q = true;
        this.p = q6Var;
        ol0 ol0Var = this.f8205m;
        if (ol0Var != null) {
            ol0Var.l().b(q6Var);
        }
    }

    @Override // com.google.android.gms.internal.ads.x6
    public final synchronized void M(e.c.b.b.b.b bVar, int i2) {
    }

    @Override // com.google.android.gms.internal.ads.x6
    public final void P2(e.c.b.b.b.b bVar) {
        onTouch(this.f8200h, (MotionEvent) e.c.b.b.b.d.Y(bVar));
    }

    @Override // com.google.android.gms.internal.ads.pn0
    public final FrameLayout R() {
        return this.f8201i;
    }

    @Override // com.google.android.gms.internal.ads.pn0
    public final synchronized void U(String str, View view, boolean z) {
        if (this.r) {
            return;
        }
        if (view == null) {
            this.f8199g.remove(str);
            return;
        }
        this.f8199g.put(str, new WeakReference<>(view));
        if (!NativeAd.ASSET_ADCHOICES_CONTAINER_VIEW.equals(str) && !"3011".equals(str)) {
            if (zzbn.zza(this.f8204l)) {
                view.setOnTouchListener(this);
            }
            view.setClickable(true);
            view.setOnClickListener(this);
        }
    }

    @Override // com.google.android.gms.internal.ads.pn0
    public final /* bridge */ /* synthetic */ View Y() {
        return this.f8200h;
    }

    @Override // com.google.android.gms.internal.ads.pn0
    public final e.c.b.b.b.b a() {
        return this.o;
    }

    @Override // com.google.android.gms.internal.ads.x6
    public final synchronized e.c.b.b.b.b d(String str) {
        return e.c.b.b.b.d.m4(zzm(str));
    }

    @Override // android.view.View.OnClickListener
    public final synchronized void onClick(View view) {
        ol0 ol0Var = this.f8205m;
        if (ol0Var != null) {
            ol0Var.J();
            this.f8205m.D(view, this.f8200h, zzj(), zzk(), false);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final synchronized void onGlobalLayout() {
        ol0 ol0Var = this.f8205m;
        if (ol0Var != null) {
            ol0Var.F(this.f8200h, zzj(), zzk(), ol0.P(this.f8200h));
        }
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final synchronized void onScrollChanged() {
        ol0 ol0Var = this.f8205m;
        if (ol0Var != null) {
            ol0Var.F(this.f8200h, zzj(), zzk(), ol0.P(this.f8200h));
        }
    }

    @Override // android.view.View.OnTouchListener
    public final synchronized boolean onTouch(View view, MotionEvent motionEvent) {
        ol0 ol0Var = this.f8205m;
        if (ol0Var != null) {
            ol0Var.E(view, motionEvent, this.f8200h);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.x6
    public final synchronized void r1(String str, e.c.b.b.b.b bVar) {
        U(str, (View) e.c.b.b.b.d.Y(bVar), true);
    }

    @Override // com.google.android.gms.internal.ads.x6
    public final synchronized void v(e.c.b.b.b.b bVar) {
        if (this.r) {
            return;
        }
        Object objY = e.c.b.b.b.d.Y(bVar);
        if (!(objY instanceof ol0)) {
            er.zzi("Not an instance of native engine. This is most likely a transient error");
            return;
        }
        ol0 ol0Var = this.f8205m;
        if (ol0Var != null) {
            ol0Var.C(this);
        }
        zzr();
        ol0 ol0Var2 = (ol0) objY;
        this.f8205m = ol0Var2;
        ol0Var2.B(this);
        this.f8205m.j(this.f8200h);
        this.f8205m.k(this.f8201i);
        if (this.q) {
            this.f8205m.l().b(this.p);
        }
    }

    @Override // com.google.android.gms.internal.ads.x6
    public final synchronized void zze() {
        if (this.r) {
            return;
        }
        ol0 ol0Var = this.f8205m;
        if (ol0Var != null) {
            ol0Var.C(this);
            this.f8205m = null;
        }
        this.f8199g.clear();
        this.f8200h.removeAllViews();
        this.f8201i.removeAllViews();
        this.f8199g = null;
        this.f8200h = null;
        this.f8201i = null;
        this.f8203k = null;
        this.n = null;
        this.r = true;
    }

    @Override // com.google.android.gms.internal.ads.x6
    public final synchronized void zzg(e.c.b.b.b.b bVar) {
        this.f8205m.H((View) e.c.b.b.b.d.Y(bVar));
    }

    @Override // com.google.android.gms.internal.ads.pn0
    public final w13 zzh() {
        return this.n;
    }

    @Override // com.google.android.gms.internal.ads.pn0
    public final synchronized Map<String, WeakReference<View>> zzj() {
        return this.f8199g;
    }

    @Override // com.google.android.gms.internal.ads.pn0
    public final synchronized Map<String, WeakReference<View>> zzk() {
        return this.f8199g;
    }

    @Override // com.google.android.gms.internal.ads.pn0
    public final synchronized Map<String, WeakReference<View>> zzl() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.pn0
    public final synchronized View zzm(String str) {
        if (this.r) {
            return null;
        }
        WeakReference<View> weakReference = this.f8199g.get(str);
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    @Override // com.google.android.gms.internal.ads.pn0
    public final synchronized String zzn() {
        return this.f8198f;
    }

    @Override // com.google.android.gms.internal.ads.pn0
    public final synchronized JSONObject zzp() {
        ol0 ol0Var = this.f8205m;
        if (ol0Var == null) {
            return null;
        }
        return ol0Var.G(this.f8200h, zzj(), zzk());
    }

    final /* synthetic */ void zzq() {
        if (this.f8203k == null) {
            View view = new View(this.f8200h.getContext());
            this.f8203k = view;
            view.setLayoutParams(new FrameLayout.LayoutParams(-1, 0));
        }
        if (this.f8200h != this.f8203k.getParent()) {
            this.f8200h.addView(this.f8203k);
        }
    }
}