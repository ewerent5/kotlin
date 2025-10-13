package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.util.zzbn;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class nn0 {
    private final vr0 a;

    /* renamed from: b, reason: collision with root package name */
    private final pq0 f7760b;

    /* renamed from: c, reason: collision with root package name */
    private ViewTreeObserver.OnScrollChangedListener f7761c = null;

    public nn0(vr0 vr0Var, pq0 pq0Var) {
        this.a = vr0Var;
        this.f7760b = pq0Var;
    }

    private static final int f(Context context, String str, int i2) throws NumberFormatException {
        try {
            i2 = Integer.parseInt(str);
        } catch (NumberFormatException unused) {
        }
        ta3.a();
        return xq.s(context, i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final View a(final View view, final WindowManager windowManager) {
        ew ewVarA = this.a.a(r93.I(), null, null);
        View view2 = (View) ewVarA;
        view2.setVisibility(4);
        view2.setContentDescription("policy_validator");
        ewVarA.T("/sendMessageToSdk", new ba(this) { // from class: com.google.android.gms.internal.ads.hn0
            private final nn0 a;

            {
                this.a = this;
            }

            @Override // com.google.android.gms.internal.ads.ba
            public final void a(Object obj, Map map) {
                this.a.e((ew) obj, map);
            }
        });
        ewVarA.T("/hideValidatorOverlay", new ba(this, windowManager, view) { // from class: com.google.android.gms.internal.ads.in0
            private final nn0 a;

            /* renamed from: b, reason: collision with root package name */
            private final WindowManager f6553b;

            /* renamed from: c, reason: collision with root package name */
            private final View f6554c;

            {
                this.a = this;
                this.f6553b = windowManager;
                this.f6554c = view;
            }

            @Override // com.google.android.gms.internal.ads.ba
            public final void a(Object obj, Map map) {
                this.a.d(this.f6553b, this.f6554c, (ew) obj, map);
            }
        });
        ewVarA.T("/open", new na(null, null, null, null, null));
        this.f7760b.h(new WeakReference(ewVarA), "/loadNativeAdPolicyViolations", new ba(this, view, windowManager) { // from class: com.google.android.gms.internal.ads.jn0
            private final nn0 a;

            /* renamed from: b, reason: collision with root package name */
            private final View f6783b;

            /* renamed from: c, reason: collision with root package name */
            private final WindowManager f6784c;

            {
                this.a = this;
                this.f6783b = view;
                this.f6784c = windowManager;
            }

            @Override // com.google.android.gms.internal.ads.ba
            public final void a(Object obj, Map map) throws NumberFormatException {
                this.a.b(this.f6783b, this.f6784c, (ew) obj, map);
            }
        });
        this.f7760b.h(new WeakReference(ewVarA), "/showValidatorOverlay", kn0.a);
        return (View) ewVarA;
    }

    final /* synthetic */ void b(final View view, final WindowManager windowManager, final ew ewVar, final Map map) throws NumberFormatException {
        ewVar.E0().i0(new rx(this, map) { // from class: com.google.android.gms.internal.ads.mn0

            /* renamed from: e, reason: collision with root package name */
            private final nn0 f7508e;

            /* renamed from: f, reason: collision with root package name */
            private final Map f7509f;

            {
                this.f7508e = this;
                this.f7509f = map;
            }

            @Override // com.google.android.gms.internal.ads.rx
            public final void zza(boolean z) {
                this.f7508e.c(this.f7509f, z);
            }
        });
        if (map == null) {
            return;
        }
        Context context = view.getContext();
        int iF = f(context, (String) map.get("validator_width"), ((Integer) c.c().b(w3.k5)).intValue());
        int iF2 = f(context, (String) map.get("validator_height"), ((Integer) c.c().b(w3.l5)).intValue());
        int iF3 = f(context, (String) map.get("validator_x"), 0);
        int iF4 = f(context, (String) map.get("validator_y"), 0);
        ewVar.p0(vx.c(iF, iF2));
        try {
            ewVar.q().getSettings().setUseWideViewPort(((Boolean) c.c().b(w3.m5)).booleanValue());
            ewVar.q().getSettings().setLoadWithOverviewMode(((Boolean) c.c().b(w3.n5)).booleanValue());
        } catch (NullPointerException unused) {
        }
        final WindowManager.LayoutParams layoutParamsZzj = zzbn.zzj();
        layoutParamsZzj.x = iF3;
        layoutParamsZzj.y = iF4;
        windowManager.updateViewLayout(ewVar.n(), layoutParamsZzj);
        final String str = (String) map.get("orientation");
        Rect rect = new Rect();
        if (view.getGlobalVisibleRect(rect)) {
            final int i2 = (("1".equals(str) || "2".equals(str)) ? rect.bottom : rect.top) - iF4;
            this.f7761c = new ViewTreeObserver.OnScrollChangedListener(view, ewVar, str, layoutParamsZzj, i2, windowManager) { // from class: com.google.android.gms.internal.ads.ln0

                /* renamed from: e, reason: collision with root package name */
                private final View f7268e;

                /* renamed from: f, reason: collision with root package name */
                private final ew f7269f;

                /* renamed from: g, reason: collision with root package name */
                private final String f7270g;

                /* renamed from: h, reason: collision with root package name */
                private final WindowManager.LayoutParams f7271h;

                /* renamed from: i, reason: collision with root package name */
                private final int f7272i;

                /* renamed from: j, reason: collision with root package name */
                private final WindowManager f7273j;

                {
                    this.f7268e = view;
                    this.f7269f = ewVar;
                    this.f7270g = str;
                    this.f7271h = layoutParamsZzj;
                    this.f7272i = i2;
                    this.f7273j = windowManager;
                }

                @Override // android.view.ViewTreeObserver.OnScrollChangedListener
                public final void onScrollChanged() {
                    View view2 = this.f7268e;
                    ew ewVar2 = this.f7269f;
                    String str2 = this.f7270g;
                    WindowManager.LayoutParams layoutParams = this.f7271h;
                    int i3 = this.f7272i;
                    WindowManager windowManager2 = this.f7273j;
                    Rect rect2 = new Rect();
                    if (!view2.getGlobalVisibleRect(rect2) || ewVar2.n().getWindowToken() == null) {
                        return;
                    }
                    if ("1".equals(str2) || "2".equals(str2)) {
                        layoutParams.y = rect2.bottom - i3;
                    } else {
                        layoutParams.y = rect2.top - i3;
                    }
                    windowManager2.updateViewLayout(ewVar2.n(), layoutParams);
                }
            };
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                viewTreeObserver.addOnScrollChangedListener(this.f7761c);
            }
        }
        String str2 = (String) map.get("overlay_url");
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        ewVar.loadUrl(str2);
    }

    final /* synthetic */ void c(Map map, boolean z) {
        HashMap map2 = new HashMap();
        map2.put("messageType", "validatorHtmlLoaded");
        map2.put("id", (String) map.get("id"));
        this.f7760b.f("sendMessageToNativeJs", map2);
    }

    final /* synthetic */ void d(WindowManager windowManager, View view, ew ewVar, Map map) {
        er.zzd("Hide native ad policy validator overlay.");
        ewVar.n().setVisibility(8);
        if (ewVar.n().getWindowToken() != null) {
            windowManager.removeView(ewVar.n());
        }
        ewVar.destroy();
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (this.f7761c == null || viewTreeObserver == null || !viewTreeObserver.isAlive()) {
            return;
        }
        viewTreeObserver.removeOnScrollChangedListener(this.f7761c);
    }

    final /* synthetic */ void e(ew ewVar, Map map) {
        this.f7760b.f("sendMessageToNativeJs", map);
    }
}