package com.google.android.gms.internal.ads;

import android.os.Build;
import android.os.ConditionVariable;
import j$.util.concurrent.ThreadLocalRandom;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Random;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class yl2 {
    private static final ConditionVariable a = new ConditionVariable();

    /* renamed from: b, reason: collision with root package name */
    protected static volatile vz1 f10449b = null;

    /* renamed from: c, reason: collision with root package name */
    private static volatile Random f10450c = null;

    /* renamed from: d, reason: collision with root package name */
    private final gq2 f10451d;

    /* renamed from: e, reason: collision with root package name */
    protected volatile Boolean f10452e;

    public yl2(gq2 gq2Var) {
        this.f10451d = gq2Var;
        gq2Var.d().execute(new xk2(this));
    }

    public static final int d() {
        try {
            return Build.VERSION.SDK_INT >= 21 ? ThreadLocalRandom.current().nextInt() : e().nextInt();
        } catch (RuntimeException unused) {
            return e().nextInt();
        }
    }

    private static Random e() {
        if (f10450c == null) {
            synchronized (yl2.class) {
                if (f10450c == null) {
                    f10450c = new Random();
                }
            }
        }
        return f10450c;
    }

    public final void a(int i2, int i3, long j2, String str, Exception exc) {
        try {
            a.block();
            if (!this.f10452e.booleanValue() || f10449b == null) {
                return;
            }
            lb0 lb0VarD = sh0.D();
            lb0VarD.q(this.f10451d.f6158b.getPackageName());
            lb0VarD.r(j2);
            if (str != null) {
                lb0VarD.u(str);
            }
            if (exc != null) {
                StringWriter stringWriter = new StringWriter();
                ih2.c(exc, new PrintWriter(stringWriter));
                lb0VarD.s(stringWriter.toString());
                lb0VarD.t(exc.getClass().getName());
            }
            tz1 tz1VarA = f10449b.a(lb0VarD.n().i());
            tz1VarA.c(i2);
            if (i3 != -1) {
                tz1VarA.b(i3);
            }
            tz1VarA.a();
        } catch (Exception unused) {
        }
    }
}