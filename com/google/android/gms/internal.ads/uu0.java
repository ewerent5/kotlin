package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zze;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public class uu0 {
    protected final String a = f5.f5797b.e();

    /* renamed from: b */
    protected final Map<String, String> f9562b = new HashMap();

    /* renamed from: c */
    protected final Executor f9563c;

    /* renamed from: d */
    protected final jr f9564d;

    /* renamed from: e */
    protected final boolean f9565e;

    /* renamed from: f */
    private final mu1 f9566f;

    protected uu0(Executor executor, jr jrVar, mu1 mu1Var) {
        this.f9563c = executor;
        this.f9564d = jrVar;
        if (((Boolean) c.c().b(w3.j1)).booleanValue()) {
            this.f9565e = ((Boolean) c.c().b(w3.k1)).booleanValue();
        } else {
            this.f9565e = ((double) ta3.e().nextFloat()) <= f5.a.e().doubleValue();
        }
        this.f9566f = mu1Var;
    }

    public final void a(Map<String, String> map) {
        final String strA = this.f9566f.a(map);
        if (this.f9565e) {
            this.f9563c.execute(new Runnable(this, strA) { // from class: com.google.android.gms.internal.ads.tu0

                /* renamed from: e, reason: collision with root package name */
                private final uu0 f9258e;

                /* renamed from: f, reason: collision with root package name */
                private final String f9259f;

                {
                    this.f9258e = this;
                    this.f9259f = strA;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    uu0 uu0Var = this.f9258e;
                    uu0Var.f9564d.zza(this.f9259f);
                }
            });
        }
        zze.zza(strA);
    }

    protected final String b(Map<String, String> map) {
        return this.f9566f.a(map);
    }
}