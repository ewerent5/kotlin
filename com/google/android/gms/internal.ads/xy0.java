package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class xy0 implements tz0 {
    private static final Pattern a = Pattern.compile("Received error HTTP response code: (.*)");

    /* renamed from: b, reason: collision with root package name */
    private final xx0 f10306b;

    /* renamed from: c, reason: collision with root package name */
    private final h52 f10307c;

    /* renamed from: d, reason: collision with root package name */
    private final qp1 f10308d;

    /* renamed from: e, reason: collision with root package name */
    private final ScheduledExecutorService f10309e;

    /* renamed from: f, reason: collision with root package name */
    private final a21 f10310f;

    xy0(qp1 qp1Var, xx0 xx0Var, h52 h52Var, ScheduledExecutorService scheduledExecutorService, a21 a21Var) {
        this.f10308d = qp1Var;
        this.f10306b = xx0Var;
        this.f10307c = h52Var;
        this.f10309e = scheduledExecutorService;
        this.f10310f = a21Var;
    }

    @Override // com.google.android.gms.internal.ads.tz0
    public final g52<kp1> a(ql qlVar) {
        g52<kp1> g52VarH = y42.h(this.f10306b.a(qlVar), new e42(this) { // from class: com.google.android.gms.internal.ads.uy0
            private final xy0 a;

            {
                this.a = this;
            }

            @Override // com.google.android.gms.internal.ads.e42
            public final g52 zza(Object obj) {
                return this.a.b((InputStream) obj);
            }
        }, this.f10307c);
        if (((Boolean) c.c().b(w3.G3)).booleanValue()) {
            g52VarH = y42.f(y42.g(g52VarH, ((Integer) c.c().b(w3.H3)).intValue(), TimeUnit.SECONDS, this.f10309e), TimeoutException.class, vy0.a, qr.f8451f);
        }
        y42.o(g52VarH, new wy0(this), qr.f8451f);
        return g52VarH;
    }

    final /* synthetic */ g52 b(InputStream inputStream) {
        return y42.a(new kp1(new gp1(this.f10308d), ip1.a(new InputStreamReader(inputStream))));
    }
}