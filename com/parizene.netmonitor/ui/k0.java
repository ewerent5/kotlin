package com.parizene.netmonitor.ui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.LoadAdError;
import com.parizene.netmonitor.R;
import com.parizene.netmonitor.k0.d;

/* compiled from: AdViewHelper.java */
/* loaded from: classes3.dex */
public class k0 {
    private final Context a;

    /* renamed from: b */
    private final WindowManager f13845b;

    /* renamed from: c */
    private final LayoutInflater f13846c;

    /* renamed from: d */
    private final FrameLayout f13847d;

    /* renamed from: e */
    private final com.parizene.netmonitor.k0.e f13848e;

    /* renamed from: f */
    private AdView f13849f;

    /* compiled from: AdViewHelper.java */
    class a extends AdListener {
        a() {
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdFailedToLoad(LoadAdError loadAdError) {
            m.a.a.a("onAdFailedToLoad: loadAdError=%s", loadAdError);
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdLoaded() {
            m.a.a.a("onAdLoaded", new Object[0]);
            if (k0.this.f13847d.getChildCount() == 0) {
                k0.this.f13847d.addView(k0.this.f13849f);
            }
        }
    }

    public k0(Context context, WindowManager windowManager, LayoutInflater layoutInflater, FrameLayout frameLayout, com.parizene.netmonitor.k0.e eVar) {
        this.a = context;
        this.f13845b = windowManager;
        this.f13846c = layoutInflater;
        this.f13847d = frameLayout;
        this.f13848e = eVar;
    }

    private AdSize e() {
        Display defaultDisplay = this.f13845b.getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        return AdSize.getCurrentOrientationAnchoredAdaptiveBannerAdSize(this.a, (int) (displayMetrics.widthPixels / displayMetrics.density));
    }

    /* renamed from: f */
    public /* synthetic */ void g(i.y.c.l lVar, com.parizene.netmonitor.p0.c cVar, View view) {
        this.f13848e.a(d.C0159d.f13205b);
        lVar.invoke(cVar.f13596c);
    }

    @SuppressLint({"MissingPermission"})
    public void c(com.parizene.netmonitor.p0.a aVar, final i.y.c.l<? super String, i.s> lVar) {
        if (aVar instanceof com.parizene.netmonitor.p0.c) {
            if (this.f13847d.getChildCount() > 0) {
                return;
            }
            final com.parizene.netmonitor.p0.c cVar = (com.parizene.netmonitor.p0.c) aVar;
            ImageView imageView = (ImageView) this.f13846c.inflate(R.layout.gif_banner, (ViewGroup) this.f13847d, true).findViewById(R.id.gifBannerImageView);
            com.bumptech.glide.b.u(imageView).r(cVar.f13595b).r0(imageView);
            imageView.setOnClickListener(new View.OnClickListener() { // from class: com.parizene.netmonitor.ui.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f13766e.g(lVar, cVar, view);
                }
            });
            return;
        }
        if (this.f13849f != null) {
            return;
        }
        AdView adView = new AdView(this.a);
        this.f13849f = adView;
        adView.setAdUnitId("ca-app-pub-7073806944180963/1456028773");
        this.f13849f.setAdSize(e());
        this.f13849f.setAdListener(new a());
        this.f13849f.loadAd(new AdRequest.Builder().build());
    }

    public void d() {
        if (this.f13847d.getChildCount() > 0) {
            this.f13847d.removeAllViews();
        }
        AdView adView = this.f13849f;
        if (adView == null) {
            return;
        }
        adView.destroy();
        this.f13849f = null;
    }

    public void h() {
        AdView adView = this.f13849f;
        if (adView == null) {
            return;
        }
        adView.pause();
    }

    public void i() {
        AdView adView = this.f13849f;
        if (adView == null) {
            return;
        }
        adView.resume();
    }
}