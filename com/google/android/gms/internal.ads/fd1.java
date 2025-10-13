package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.ads.internal.zzs;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class fd1 implements ah1 {
    private static final Object a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private final String f5849b;

    /* renamed from: c, reason: collision with root package name */
    private final String f5850c;

    /* renamed from: d, reason: collision with root package name */
    private final f80 f5851d;

    /* renamed from: e, reason: collision with root package name */
    private final rq1 f5852e;

    /* renamed from: f, reason: collision with root package name */
    private final qp1 f5853f;

    /* renamed from: g, reason: collision with root package name */
    private final zzg f5854g = zzs.zzg().l();

    public fd1(String str, String str2, f80 f80Var, rq1 rq1Var, qp1 qp1Var) {
        this.f5849b = str;
        this.f5850c = str2;
        this.f5851d = f80Var;
        this.f5852e = rq1Var;
        this.f5853f = qp1Var;
    }

    final /* synthetic */ void a(Bundle bundle, Bundle bundle2) {
        if (((Boolean) c.c().b(w3.K3)).booleanValue()) {
            bundle2.putBundle("quality_signals", bundle);
        } else {
            if (((Boolean) c.c().b(w3.J3)).booleanValue()) {
                synchronized (a) {
                    this.f5851d.a(this.f5853f.f8427d);
                    bundle2.putBundle("quality_signals", this.f5852e.b());
                }
            } else {
                this.f5851d.a(this.f5853f.f8427d);
                bundle2.putBundle("quality_signals", this.f5852e.b());
            }
        }
        bundle2.putString("seq_num", this.f5849b);
        bundle2.putString("session_id", this.f5854g.zzB() ? "" : this.f5850c);
    }

    @Override // com.google.android.gms.internal.ads.ah1
    public final g52 zza() {
        final Bundle bundle = new Bundle();
        if (((Boolean) c.c().b(w3.K3)).booleanValue()) {
            this.f5851d.a(this.f5853f.f8427d);
            bundle.putAll(this.f5852e.b());
        }
        return y42.a(new zg1(this, bundle) { // from class: com.google.android.gms.internal.ads.ed1
            private final fd1 a;

            /* renamed from: b, reason: collision with root package name */
            private final Bundle f5628b;

            {
                this.a = this;
                this.f5628b = bundle;
            }

            @Override // com.google.android.gms.internal.ads.zg1
            public final void a(Object obj) {
                this.a.a(this.f5628b, (Bundle) obj);
            }
        });
    }
}