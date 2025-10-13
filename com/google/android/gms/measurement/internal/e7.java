package com.google.android.gms.measurement.internal;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
@TargetApi(14)
/* loaded from: classes.dex */
final class e7 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ i6 f10841e;

    private e7(i6 i6Var) {
        this.f10841e = i6Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(boolean z, Uri uri, String str, String str2) {
        Bundle bundleW;
        Bundle bundleW2;
        this.f10841e.d();
        try {
            if (this.f10841e.i().o(t.f0) || this.f10841e.i().o(t.h0) || this.f10841e.i().o(t.g0)) {
                da daVarG = this.f10841e.g();
                if (!TextUtils.isEmpty(str2)) {
                    if (str2.contains("gclid") || str2.contains("utm_campaign") || str2.contains("utm_source") || str2.contains("utm_medium")) {
                        bundleW = daVarG.w(Uri.parse(str2.length() != 0 ? "https://google.com/search?".concat(str2) : new String("https://google.com/search?")));
                        if (bundleW != null) {
                            bundleW.putString("_cis", "referrer");
                        }
                    } else {
                        daVarG.zzq().H().a("Activity created with data 'referrer' without required params");
                    }
                }
                bundleW = null;
            } else {
                bundleW = null;
            }
            boolean z2 = false;
            if (z) {
                bundleW2 = this.f10841e.g().w(uri);
                if (bundleW2 != null) {
                    bundleW2.putString("_cis", "intent");
                    if (this.f10841e.i().o(t.f0) && !bundleW2.containsKey("gclid") && bundleW != null && bundleW.containsKey("gclid")) {
                        bundleW2.putString("_cer", String.format("gclid=%s", bundleW.getString("gclid")));
                    }
                    this.f10841e.R(str, "_cmp", bundleW2);
                    if (this.f10841e.i().o(t.F0)) {
                        this.f10841e.n.b(str, bundleW2);
                    }
                }
            } else {
                bundleW2 = null;
            }
            if (this.f10841e.i().o(t.h0) && !this.f10841e.i().o(t.g0) && bundleW != null && bundleW.containsKey("gclid") && (bundleW2 == null || !bundleW2.containsKey("gclid"))) {
                this.f10841e.V("auto", "_lgclid", bundleW.getString("gclid"), true);
            }
            if (TextUtils.isEmpty(str2)) {
                return;
            }
            this.f10841e.zzq().H().b("Activity created with referrer", str2);
            if (this.f10841e.i().o(t.g0)) {
                if (bundleW != null) {
                    this.f10841e.R(str, "_cmp", bundleW);
                    if (this.f10841e.i().o(t.F0)) {
                        this.f10841e.n.b(str, bundleW);
                    }
                } else {
                    this.f10841e.zzq().H().b("Referrer does not contain valid parameters", str2);
                }
                this.f10841e.V("auto", "_ldl", null, true);
                return;
            }
            if (str2.contains("gclid") && (str2.contains("utm_campaign") || str2.contains("utm_source") || str2.contains("utm_medium") || str2.contains("utm_term") || str2.contains("utm_content"))) {
                z2 = true;
            }
            if (!z2) {
                this.f10841e.zzq().H().a("Activity created with data 'referrer' without required params");
            } else {
                if (TextUtils.isEmpty(str2)) {
                    return;
                }
                this.f10841e.V("auto", "_ldl", str2, true);
            }
        } catch (Exception e2) {
            this.f10841e.zzq().A().b("Throwable caught in handleReferrerForOnActivityCreated", e2);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        try {
            this.f10841e.zzq().I().a("onActivityCreated");
            Intent intent = activity.getIntent();
            if (intent == null) {
                return;
            }
            Uri data = intent.getData();
            if (data != null && data.isHierarchical()) {
                this.f10841e.g();
                this.f10841e.zzp().u(new i7(this, bundle == null, data, da.V(intent) ? "gs" : "auto", data.getQueryParameter("referrer")));
            }
        } catch (Exception e2) {
            this.f10841e.zzq().A().b("Throwable caught in onActivityCreated", e2);
        } finally {
            this.f10841e.n().B(activity, bundle);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        this.f10841e.n().Q(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        this.f10841e.n().O(activity);
        e9 e9VarP = this.f10841e.p();
        e9VarP.zzp().u(new g9(e9VarP, e9VarP.zzl().c()));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        e9 e9VarP = this.f10841e.p();
        e9VarP.zzp().u(new d9(e9VarP, e9VarP.zzl().c()));
        this.f10841e.n().A(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        this.f10841e.n().P(activity, bundle);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    /* synthetic */ e7(i6 i6Var, j6 j6Var) {
        this(i6Var);
    }
}