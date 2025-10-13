package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzs;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class kv0 implements jd0, c93, qa0, ib0, jb0, dc0, ta0, gs2, tt1 {

    /* renamed from: e, reason: collision with root package name */
    private final List<Object> f7092e;

    /* renamed from: f, reason: collision with root package name */
    private final yu0 f7093f;

    /* renamed from: g, reason: collision with root package name */
    private long f7094g;

    public kv0(yu0 yu0Var, cy cyVar) {
        this.f7093f = yu0Var;
        this.f7092e = Collections.singletonList(cyVar);
    }

    private final void G(Class<?> cls, String str, Object... objArr) throws IOException {
        yu0 yu0Var = this.f7093f;
        List<Object> list = this.f7092e;
        String simpleName = cls.getSimpleName();
        yu0Var.a(list, simpleName.length() != 0 ? "Event-".concat(simpleName) : new String("Event-"), str, objArr);
    }

    @Override // com.google.android.gms.internal.ads.tt1
    public final void A(lt1 lt1Var, String str) throws IOException {
        G(kt1.class, "onTaskSucceeded", str);
    }

    @Override // com.google.android.gms.internal.ads.ta0
    public final void B0(g93 g93Var) throws IOException {
        G(ta0.class, "onAdFailedToLoad", Integer.valueOf(g93Var.f6091e), g93Var.f6092f, g93Var.f6093g);
    }

    @Override // com.google.android.gms.internal.ads.jd0
    public final void R(kp1 kp1Var) {
    }

    @Override // com.google.android.gms.internal.ads.gs2
    public final void a(String str, String str2) throws IOException {
        G(gs2.class, "onAppEvent", str, str2);
    }

    @Override // com.google.android.gms.internal.ads.ib0
    public final void b() throws IOException {
        G(ib0.class, "onAdImpression", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.dc0
    public final void b0() throws IOException {
        long jC = zzs.zzj().c();
        long j2 = this.f7094g;
        StringBuilder sb = new StringBuilder(41);
        sb.append("Ad Request Latency : ");
        sb.append(jC - j2);
        zze.zza(sb.toString());
        G(dc0.class, "onAdLoaded", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.jb0
    public final void c(Context context) throws IOException {
        G(jb0.class, "onPause", context);
    }

    @Override // com.google.android.gms.internal.ads.qa0
    @ParametersAreNonnullByDefault
    public final void d(gm gmVar, String str, String str2) throws IOException {
        G(qa0.class, "onRewarded", gmVar, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.jd0
    public final void f(ql qlVar) throws IOException {
        this.f7094g = zzs.zzj().c();
        G(jd0.class, "onAdRequest", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.tt1
    public final void m(lt1 lt1Var, String str) throws IOException {
        G(kt1.class, "onTaskCreated", str);
    }

    @Override // com.google.android.gms.internal.ads.tt1
    public final void o(lt1 lt1Var, String str) throws IOException {
        G(kt1.class, "onTaskStarted", str);
    }

    @Override // com.google.android.gms.internal.ads.c93
    public final void onAdClicked() throws IOException {
        G(c93.class, "onAdClicked", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.jb0
    public final void u(Context context) throws IOException {
        G(jb0.class, "onDestroy", context);
    }

    @Override // com.google.android.gms.internal.ads.jb0
    public final void x(Context context) throws IOException {
        G(jb0.class, "onResume", context);
    }

    @Override // com.google.android.gms.internal.ads.tt1
    public final void z(lt1 lt1Var, String str, Throwable th) throws IOException {
        G(kt1.class, "onTaskFailed", str, th.getClass().getSimpleName());
    }

    @Override // com.google.android.gms.internal.ads.qa0
    public final void zzc() throws IOException {
        G(qa0.class, "onAdOpened", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.qa0
    public final void zzd() throws IOException {
        G(qa0.class, "onAdClosed", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.qa0
    public final void zze() throws IOException {
        G(qa0.class, "onAdLeftApplication", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.qa0
    public final void zzg() throws IOException {
        G(qa0.class, "onRewardedVideoStarted", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.qa0
    public final void zzh() throws IOException {
        G(qa0.class, "onRewardedVideoCompleted", new Object[0]);
    }
}