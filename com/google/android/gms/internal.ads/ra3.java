package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.ads.h5.OnH5AdsEventListener;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public final class ra3 {
    private final l93 a;

    /* renamed from: b, reason: collision with root package name */
    private final k93 f8624b;

    /* renamed from: c, reason: collision with root package name */
    private final i2 f8625c;

    /* renamed from: d, reason: collision with root package name */
    private final q8 f8626d;

    /* renamed from: e, reason: collision with root package name */
    private final mn f8627e;

    /* renamed from: f, reason: collision with root package name */
    private final uj f8628f;

    /* renamed from: g, reason: collision with root package name */
    private final r8 f8629g;

    public ra3(l93 l93Var, k93 k93Var, i2 i2Var, q8 q8Var, mn mnVar, uj ujVar, r8 r8Var) {
        this.a = l93Var;
        this.f8624b = k93Var;
        this.f8625c = i2Var;
        this.f8626d = q8Var;
        this.f8627e = mnVar;
        this.f8628f = ujVar;
        this.f8629g = r8Var;
    }

    static /* synthetic */ void l(Context context, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("action", "no_ads_fallback");
        bundle.putString("flow", str);
        ta3.a().e(context, ta3.d().f7054e, "gmob-apps", bundle, true);
    }

    public final w a(Context context, r93 r93Var, String str, tf tfVar) {
        return new ja3(this, context, r93Var, str, tfVar).d(context, false);
    }

    public final w b(Context context, r93 r93Var, String str, tf tfVar) {
        return new la3(this, context, r93Var, str, tfVar).d(context, false);
    }

    public final s c(Context context, String str, tf tfVar) {
        return new ma3(this, context, str, tfVar).d(context, false);
    }

    public final x6 d(Context context, FrameLayout frameLayout, FrameLayout frameLayout2) {
        return new oa3(this, frameLayout, frameLayout2, context).d(context, false);
    }

    public final b7 e(View view, HashMap<String, View> map, HashMap<String, View> map2) {
        return new pa3(this, view, map, map2).d(view.getContext(), false);
    }

    public final an f(Context context, String str, tf tfVar) {
        return new qa3(this, context, str, tfVar).d(context, false);
    }

    public final xj g(Activity activity) {
        ba3 ba3Var = new ba3(this, activity);
        Intent intent = activity.getIntent();
        boolean booleanExtra = false;
        if (intent.hasExtra("com.google.android.gms.ads.internal.overlay.useClientJar")) {
            booleanExtra = intent.getBooleanExtra("com.google.android.gms.ads.internal.overlay.useClientJar", false);
        } else {
            er.zzf("useClientJar flag not found in activity intent extras.");
        }
        return ba3Var.d(activity, booleanExtra);
    }

    public final zp h(Context context, tf tfVar) {
        return new da3(this, context, tfVar).d(context, false);
    }

    public final kj i(Context context, tf tfVar) {
        return new fa3(this, context, tfVar).d(context, false);
    }

    public final ab j(Context context, tf tfVar, OnH5AdsEventListener onH5AdsEventListener) {
        return new ha3(this, context, tfVar, onH5AdsEventListener).d(context, false);
    }
}