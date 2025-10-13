package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.internal.zzs;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class nm0 extends a7 implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, pn0 {

    /* renamed from: e, reason: collision with root package name */
    private final WeakReference<View> f7743e;

    /* renamed from: f, reason: collision with root package name */
    private final Map<String, WeakReference<View>> f7744f = new HashMap();

    /* renamed from: g, reason: collision with root package name */
    private final Map<String, WeakReference<View>> f7745g = new HashMap();

    /* renamed from: h, reason: collision with root package name */
    private final Map<String, WeakReference<View>> f7746h = new HashMap();

    /* renamed from: i, reason: collision with root package name */
    @GuardedBy("this")
    private ol0 f7747i;

    /* renamed from: j, reason: collision with root package name */
    private w13 f7748j;

    public nm0(View view, HashMap<String, View> map, HashMap<String, View> map2) {
        view.setOnTouchListener(this);
        view.setOnClickListener(this);
        zzs.zzz();
        es.a(view, this);
        zzs.zzz();
        es.b(view, this);
        this.f7743e = new WeakReference<>(view);
        for (Map.Entry<String, View> entry : map.entrySet()) {
            String key = entry.getKey();
            View value = entry.getValue();
            if (value != null) {
                this.f7744f.put(key, new WeakReference<>(value));
                if (!NativeAd.ASSET_ADCHOICES_CONTAINER_VIEW.equals(key) && !"3011".equals(key)) {
                    value.setOnTouchListener(this);
                    value.setClickable(true);
                    value.setOnClickListener(this);
                }
            }
        }
        this.f7746h.putAll(this.f7744f);
        for (Map.Entry<String, View> entry2 : map2.entrySet()) {
            View value2 = entry2.getValue();
            if (value2 != null) {
                this.f7745g.put(entry2.getKey(), new WeakReference<>(value2));
                value2.setOnTouchListener(this);
                value2.setClickable(false);
            }
        }
        this.f7746h.putAll(this.f7745g);
        this.f7748j = new w13(view.getContext(), view);
    }

    @Override // com.google.android.gms.internal.ads.pn0
    public final FrameLayout R() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.pn0
    public final synchronized void U(String str, View view, boolean z) {
        this.f7746h.put(str, new WeakReference<>(view));
        if (!NativeAd.ASSET_ADCHOICES_CONTAINER_VIEW.equals(str) && !"3011".equals(str)) {
            this.f7744f.put(str, new WeakReference<>(view));
            view.setClickable(true);
            view.setOnClickListener(this);
            view.setOnTouchListener(this);
        }
    }

    @Override // com.google.android.gms.internal.ads.pn0
    public final View Y() {
        return this.f7743e.get();
    }

    @Override // com.google.android.gms.internal.ads.pn0
    public final synchronized e.c.b.b.b.b a() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.b7
    public final synchronized void k(e.c.b.b.b.b bVar) {
        Object objY = e.c.b.b.b.d.Y(bVar);
        if (!(objY instanceof ol0)) {
            er.zzi("Not an instance of InternalNativeAd. This is most likely a transient error");
            return;
        }
        ol0 ol0Var = this.f7747i;
        if (ol0Var != null) {
            ol0Var.C(this);
        }
        ol0 ol0Var2 = (ol0) objY;
        if (!ol0Var2.g()) {
            er.zzf("Your account must be enabled to use this feature. Talk to your account manager to request this feature for your account.");
            return;
        }
        this.f7747i = ol0Var2;
        ol0Var2.B(this);
        this.f7747i.j(Y());
    }

    @Override // android.view.View.OnClickListener
    public final synchronized void onClick(View view) {
        ol0 ol0Var = this.f7747i;
        if (ol0Var != null) {
            ol0Var.D(view, Y(), zzj(), zzk(), true);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final synchronized void onGlobalLayout() {
        ol0 ol0Var = this.f7747i;
        if (ol0Var != null) {
            ol0Var.F(Y(), zzj(), zzk(), ol0.P(Y()));
        }
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final synchronized void onScrollChanged() {
        ol0 ol0Var = this.f7747i;
        if (ol0Var != null) {
            ol0Var.F(Y(), zzj(), zzk(), ol0.P(Y()));
        }
    }

    @Override // android.view.View.OnTouchListener
    public final synchronized boolean onTouch(View view, MotionEvent motionEvent) {
        ol0 ol0Var = this.f7747i;
        if (ol0Var != null) {
            ol0Var.E(view, motionEvent, Y());
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.b7
    public final synchronized void v(e.c.b.b.b.b bVar) {
        if (this.f7747i != null) {
            Object objY = e.c.b.b.b.d.Y(bVar);
            if (!(objY instanceof View)) {
                er.zzi("Calling NativeAdViewHolderNonagonDelegate.setClickConfirmingView with wrong wrapped object");
            }
            this.f7747i.H((View) objY);
        }
    }

    @Override // com.google.android.gms.internal.ads.b7
    public final synchronized void zzc() {
        ol0 ol0Var = this.f7747i;
        if (ol0Var != null) {
            ol0Var.C(this);
            this.f7747i = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.pn0
    public final w13 zzh() {
        return this.f7748j;
    }

    @Override // com.google.android.gms.internal.ads.pn0
    public final synchronized Map<String, WeakReference<View>> zzj() {
        return this.f7746h;
    }

    @Override // com.google.android.gms.internal.ads.pn0
    public final synchronized Map<String, WeakReference<View>> zzk() {
        return this.f7744f;
    }

    @Override // com.google.android.gms.internal.ads.pn0
    public final synchronized Map<String, WeakReference<View>> zzl() {
        return this.f7745g;
    }

    @Override // com.google.android.gms.internal.ads.pn0
    public final synchronized View zzm(String str) {
        WeakReference<View> weakReference = this.f7746h.get(str);
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    @Override // com.google.android.gms.internal.ads.pn0
    public final synchronized String zzn() {
        return "1007";
    }

    @Override // com.google.android.gms.internal.ads.pn0
    public final synchronized JSONObject zzp() {
        return null;
    }
}