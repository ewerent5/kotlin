package com.google.android.gms.common;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.Log;
import com.google.android.gms.common.internal.p;
import com.google.android.gms.dynamite.DynamiteModule;
import java.util.concurrent.Callable;
import javax.annotation.CheckReturnValue;

/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
@CheckReturnValue
/* loaded from: classes.dex */
final class b0 {

    /* renamed from: e, reason: collision with root package name */
    private static volatile com.google.android.gms.common.internal.h0 f4630e;

    /* renamed from: g, reason: collision with root package name */
    private static Context f4632g;
    static final z a = new t(x.m4("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u0010\u008ae\bsù/\u008eQí"));

    /* renamed from: b, reason: collision with root package name */
    static final z f4627b = new u(x.m4("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014\u0003£²\u00ad×árÊkì"));

    /* renamed from: c, reason: collision with root package name */
    static final z f4628c = new v(x.m4("0\u0082\u0004C0\u0082\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000Âà\u0087FdJ0\u008d0"));

    /* renamed from: d, reason: collision with root package name */
    static final z f4629d = new w(x.m4("0\u0082\u0004¨0\u0082\u0003\u0090 \u0003\u0002\u0001\u0002\u0002\t\u0000Õ\u0085¸l}ÓNõ0"));

    /* renamed from: f, reason: collision with root package name */
    private static final Object f4631f = new Object();

    static synchronized void a(Context context) {
        if (f4632g != null) {
            Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
        } else if (context != null) {
            f4632g = context.getApplicationContext();
        }
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [android.os.IBinder, e.c.b.b.b.b] */
    static l0 b(String str, boolean z, boolean z2, boolean z3) {
        l0 l0VarE;
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            p.j(f4632g);
            try {
                f();
                try {
                    f0 f0VarL1 = f4630e.L1(new c0(str, z, false, e.c.b.b.b.d.m4(f4632g), false));
                    if (f0VarL1.zza()) {
                        l0VarE = l0.b();
                    } else {
                        String strC = f0VarL1.c();
                        if (strC == null) {
                            strC = "error checking package certificate";
                        }
                        l0VarE = f0VarL1.I() == 4 ? l0.e(strC, new PackageManager.NameNotFoundException()) : l0.d(strC);
                    }
                } catch (RemoteException e2) {
                    Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e2);
                    l0VarE = l0.e("module call", e2);
                }
            } catch (DynamiteModule.a e3) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e3);
                String strValueOf = String.valueOf(e3.getMessage());
                l0VarE = l0.e(strValueOf.length() != 0 ? "module init: ".concat(strValueOf) : new String("module init: "), e3);
            }
            return l0VarE;
        } finally {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
        }
    }

    static l0 c(String str, x xVar, boolean z, boolean z2) {
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            return g(str, xVar, z, z2);
        } finally {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
        }
    }

    static boolean d() {
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            try {
                f();
                return f4630e.zzg();
            } catch (RemoteException | DynamiteModule.a e2) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e2);
                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                return false;
            }
        } finally {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
        }
    }

    private static void f() {
        if (f4630e != null) {
            return;
        }
        p.j(f4632g);
        synchronized (f4631f) {
            if (f4630e == null) {
                f4630e = com.google.android.gms.common.internal.g0.U(DynamiteModule.e(f4632g, DynamiteModule.f4787e, "com.google.android.gms.googlecertificates").d("com.google.android.gms.common.GoogleCertificatesImpl"));
            }
        }
    }

    private static l0 g(final String str, final x xVar, final boolean z, boolean z2) {
        try {
            f();
            p.j(f4632g);
            try {
                return f4630e.u2(new h0(str, xVar, z, z2), e.c.b.b.b.d.m4(f4632g.getPackageManager())) ? l0.b() : l0.c(new Callable(z, str, xVar) { // from class: com.google.android.gms.common.s
                    private final boolean a;

                    /* renamed from: b, reason: collision with root package name */
                    private final String f4773b;

                    /* renamed from: c, reason: collision with root package name */
                    private final x f4774c;

                    {
                        this.a = z;
                        this.f4773b = str;
                        this.f4774c = xVar;
                    }

                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        boolean z3 = this.a;
                        String str2 = this.f4773b;
                        x xVar2 = this.f4774c;
                        return l0.g(str2, xVar2, z3, !z3 && b0.g(str2, xVar2, true, false).f4766b);
                    }
                });
            } catch (RemoteException e2) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e2);
                return l0.e("module call", e2);
            }
        } catch (DynamiteModule.a e3) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e3);
            String strValueOf = String.valueOf(e3.getMessage());
            return l0.e(strValueOf.length() != 0 ? "module init: ".concat(strValueOf) : new String("module init: "), e3);
        }
    }
}