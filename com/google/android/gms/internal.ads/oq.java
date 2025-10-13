package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.ads.internal.util.zzj;
import com.google.android.gms.ads.internal.zzs;
import j$.util.Spliterator;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class oq {
    private final Object a = new Object();

    /* renamed from: b */
    private final zzj f7988b;

    /* renamed from: c */
    private final sq f7989c;

    /* renamed from: d */
    private boolean f7990d;

    /* renamed from: e */
    private Context f7991e;

    /* renamed from: f */
    private kr f7992f;

    /* renamed from: g */
    private b4 f7993g;

    /* renamed from: h */
    private Boolean f7994h;

    /* renamed from: i */
    private final AtomicInteger f7995i;

    /* renamed from: j */
    private final nq f7996j;

    /* renamed from: k */
    private final Object f7997k;

    /* renamed from: l */
    private g52<ArrayList<String>> f7998l;

    public oq() {
        zzj zzjVar = new zzj();
        this.f7988b = zzjVar;
        this.f7989c = new sq(ta3.c(), zzjVar);
        this.f7990d = false;
        this.f7993g = null;
        this.f7994h = null;
        this.f7995i = new AtomicInteger(0);
        this.f7996j = new nq(null);
        this.f7997k = new Object();
    }

    public final b4 a() {
        b4 b4Var;
        synchronized (this.a) {
            b4Var = this.f7993g;
        }
        return b4Var;
    }

    public final void b(Boolean bool) {
        synchronized (this.a) {
            this.f7994h = bool;
        }
    }

    public final Boolean c() {
        Boolean bool;
        synchronized (this.a) {
            bool = this.f7994h;
        }
        return bool;
    }

    public final void d() {
        this.f7996j.a();
    }

    @TargetApi(23)
    public final void e(Context context, kr krVar) {
        b4 b4Var;
        synchronized (this.a) {
            if (!this.f7990d) {
                this.f7991e = context.getApplicationContext();
                this.f7992f = krVar;
                zzs.zzf().b(this.f7989c);
                this.f7988b.zza(this.f7991e);
                xk.d(this.f7991e, this.f7992f);
                zzs.zzl();
                if (f5.f5798c.e().booleanValue()) {
                    b4Var = new b4();
                } else {
                    zze.zza("CsiReporterFactory: CSI is not enabled. No CSI reporter created.");
                    b4Var = null;
                }
                this.f7993g = b4Var;
                if (b4Var != null) {
                    tr.a(new mq(this).zzb(), "AppState.registerCsiReporter");
                }
                this.f7990d = true;
                n();
            }
        }
        zzs.zzc().zze(context, krVar.f7054e);
    }

    public final Resources f() {
        if (this.f7992f.f7057h) {
            return this.f7991e.getResources();
        }
        try {
            ir.b(this.f7991e).getResources();
            return null;
        } catch (hr e2) {
            er.zzj("Cannot load resource from dynamite apk or local jar", e2);
            return null;
        }
    }

    public final void g(Throwable th, String str) {
        xk.d(this.f7991e, this.f7992f).b(th, str);
    }

    public final void h(Throwable th, String str) {
        xk.d(this.f7991e, this.f7992f).a(th, str, r5.f8584g.e().floatValue());
    }

    public final void i() {
        this.f7995i.incrementAndGet();
    }

    public final void j() {
        this.f7995i.decrementAndGet();
    }

    public final int k() {
        return this.f7995i.get();
    }

    public final zzg l() {
        zzj zzjVar;
        synchronized (this.a) {
            zzjVar = this.f7988b;
        }
        return zzjVar;
    }

    public final Context m() {
        return this.f7991e;
    }

    public final g52<ArrayList<String>> n() {
        if (com.google.android.gms.common.util.n.c() && this.f7991e != null) {
            if (!((Boolean) c.c().b(w3.G1)).booleanValue()) {
                synchronized (this.f7997k) {
                    g52<ArrayList<String>> g52Var = this.f7998l;
                    if (g52Var != null) {
                        return g52Var;
                    }
                    g52<ArrayList<String>> g52VarN = qr.a.N(new Callable(this) { // from class: com.google.android.gms.internal.ads.lq
                        private final oq a;

                        {
                            this.a = this;
                        }

                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            return this.a.p();
                        }
                    });
                    this.f7998l = g52VarN;
                    return g52VarN;
                }
            }
        }
        return y42.a(new ArrayList());
    }

    public final sq o() {
        return this.f7989c;
    }

    final /* synthetic */ ArrayList p() {
        Context contextA = em.a(this.f7991e);
        ArrayList arrayList = new ArrayList();
        try {
            PackageInfo packageInfoF = com.google.android.gms.common.p.c.a(contextA).f(contextA.getApplicationInfo().packageName, Spliterator.CONCURRENT);
            if (packageInfoF.requestedPermissions != null && packageInfoF.requestedPermissionsFlags != null) {
                int i2 = 0;
                while (true) {
                    String[] strArr = packageInfoF.requestedPermissions;
                    if (i2 >= strArr.length) {
                        break;
                    }
                    if ((packageInfoF.requestedPermissionsFlags[i2] & 2) != 0) {
                        arrayList.add(strArr[i2]);
                    }
                    i2++;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return arrayList;
    }
}