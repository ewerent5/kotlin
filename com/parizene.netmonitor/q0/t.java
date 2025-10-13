package com.parizene.netmonitor.q0;

import android.app.ActivityManager;
import android.app.Application;
import android.app.KeyguardManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Handler;
import android.os.PowerManager;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.remoteconfig.l;
import com.parizene.netmonitor.db.AppDatabase;
import com.parizene.netmonitor.w;
import java.io.File;
import java.util.concurrent.TimeUnit;
import okhttp3.Cache;
import okhttp3.OkHttpClient;
import okhttp3.internal.http.StatusLine;

/* compiled from: AppModule.java */
/* loaded from: classes3.dex */
public abstract class t {

    /* compiled from: AppModule.java */
    class a implements com.parizene.netmonitor.t0.g {
        final /* synthetic */ Context a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ SharedPreferences f13618b;

        a(Context context, SharedPreferences sharedPreferences) {
            this.a = context;
            this.f13618b = sharedPreferences;
        }

        @Override // com.parizene.netmonitor.t0.g
        public SharedPreferences a() {
            return this.f13618b;
        }

        @Override // com.parizene.netmonitor.t0.g
        public Context getContext() {
            return this.a;
        }
    }

    static com.parizene.netmonitor.k0.e a(Application application, com.parizene.netmonitor.m0.d0.d dVar, PackageManager packageManager) {
        com.parizene.netmonitor.k0.a aVar = new com.parizene.netmonitor.k0.a(application, dVar, packageManager);
        aVar.setEnabled(com.parizene.netmonitor.t0.f.f13727l.g().booleanValue());
        return aVar;
    }

    static AppDatabase b(Context context, com.parizene.netmonitor.m0.d0.d dVar, f.a<com.google.firebase.crashlytics.c> aVar) {
        return AppDatabase.I(context, dVar, aVar);
    }

    static com.parizene.netmonitor.db.i.d c() {
        return Build.VERSION.SDK_INT >= 26 ? new com.parizene.netmonitor.db.i.g() : new com.parizene.netmonitor.db.i.i();
    }

    static com.parizene.netmonitor.m0.z.b d() {
        return new com.parizene.netmonitor.m0.z.b();
    }

    static Handler e() {
        return com.parizene.netmonitor.w.b(w.a.BG);
    }

    static Handler f() {
        return com.parizene.netmonitor.w.b(w.a.CORE);
    }

    static org.greenrobot.eventbus.c g() {
        return org.greenrobot.eventbus.c.c();
    }

    static FirebaseAnalytics h(Context context) {
        return FirebaseAnalytics.getInstance(context);
    }

    static com.google.firebase.crashlytics.c i() {
        return com.google.firebase.crashlytics.c.a();
    }

    static com.google.firebase.remoteconfig.g j() {
        com.google.firebase.remoteconfig.g gVarF = com.google.firebase.remoteconfig.g.f();
        gVarF.p(new l.b().d(TimeUnit.DAYS.toSeconds(1L)).c());
        gVarF.q(com.parizene.netmonitor.p0.e.a());
        return gVarF;
    }

    static com.parizene.netmonitor.r0.d k(OkHttpClient okHttpClient) {
        return new com.parizene.netmonitor.r0.d(okHttpClient, "d8de3bead6baa8c20d2090af6b02b405", "APtrpFIBAAAALwOvRQMAY5hOAeANVQ725AKCKqdsHaKo3jwAAAAAAAAAAADoFM14mXROovuFHqOr-xN_JJxouA==", false);
    }

    static e.c.d.f l() {
        return new e.c.d.g().c(com.parizene.netmonitor.p0.a.class, new com.parizene.netmonitor.p0.d()).b();
    }

    static com.parizene.netmonitor.foreground.a m(org.greenrobot.eventbus.c cVar, Application application, KeyguardManager keyguardManager, ActivityManager activityManager, PowerManager powerManager) {
        return new com.parizene.netmonitor.foreground.f(cVar, application, keyguardManager, activityManager, powerManager);
    }

    static com.parizene.netmonitor.m0.e n(com.parizene.netmonitor.f0 f0Var, Handler handler, Handler handler2, com.parizene.netmonitor.m0.d0.d dVar, com.parizene.netmonitor.m0.d0.e eVar, com.parizene.netmonitor.m0.d0.a aVar, com.parizene.netmonitor.m0.i iVar, com.parizene.netmonitor.m0.n nVar, com.parizene.netmonitor.m0.u uVar, com.parizene.netmonitor.m0.r rVar) {
        return new com.parizene.netmonitor.m0.p(f0Var, handler, handler2, dVar, eVar, aVar, iVar, nVar, uVar, rVar);
    }

    static OkHttpClient o(Context context) {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        builder.cache(new Cache(new File(context.getCacheDir(), "responses"), 10485760));
        return builder.build();
    }

    static com.parizene.netmonitor.m0.e p(Handler handler, Handler handler2, com.parizene.netmonitor.m0.d0.d dVar, com.parizene.netmonitor.m0.d0.e eVar, com.parizene.netmonitor.m0.d0.a aVar, com.parizene.netmonitor.m0.i iVar, com.parizene.netmonitor.m0.n nVar, com.parizene.netmonitor.m0.u uVar, com.parizene.netmonitor.m0.r rVar) {
        return new com.parizene.netmonitor.m0.q(handler, handler2, dVar, eVar, aVar, iVar, nVar, uVar, rVar);
    }

    static com.parizene.netmonitor.t0.g q(Context context, SharedPreferences sharedPreferences) {
        return new a(context, sharedPreferences);
    }

    static com.google.android.play.core.review.a r(Context context) {
        return com.google.android.play.core.review.b.a(context);
    }

    static Handler s() {
        return com.parizene.netmonitor.w.b(w.a.UI);
    }

    static com.parizene.netmonitor.i0 t(f.a<com.parizene.netmonitor.s0.c.c> aVar) {
        com.parizene.netmonitor.t0.c cVar = com.parizene.netmonitor.t0.f.o;
        int iIntValue = cVar.g().intValue();
        cVar.f(Integer.valueOf(StatusLine.HTTP_TEMP_REDIRECT));
        return new com.parizene.netmonitor.i0(iIntValue == 0, aVar);
    }

    static Handler u() {
        return com.parizene.netmonitor.w.b(w.a.WEB);
    }
}