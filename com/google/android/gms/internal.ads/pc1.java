package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class pc1 implements ah1<qc1> {
    private final h52 a;

    /* renamed from: b, reason: collision with root package name */
    private final js0 f8134b;

    /* renamed from: c, reason: collision with root package name */
    private final qw0 f8135c;

    /* renamed from: d, reason: collision with root package name */
    private final rc1 f8136d;

    public pc1(h52 h52Var, js0 js0Var, qw0 qw0Var, rc1 rc1Var) {
        this.a = h52Var;
        this.f8134b = js0Var;
        this.f8135c = qw0Var;
        this.f8136d = rc1Var;
    }

    final /* synthetic */ qc1 a() {
        List<String> listAsList = Arrays.asList(((String) c.c().b(w3.W0)).split(";"));
        Bundle bundle = new Bundle();
        for (String str : listAsList) {
            try {
                hq1 hq1VarB = this.f8134b.b(str, new JSONObject());
                hq1VarB.q();
                Bundle bundle2 = new Bundle();
                try {
                    gi giVarA = hq1VarB.a();
                    if (giVarA != null) {
                        bundle2.putString("sdk_version", giVarA.toString());
                    }
                } catch (vp1 unused) {
                }
                try {
                    gi giVarC = hq1VarB.C();
                    if (giVarC != null) {
                        bundle2.putString("adapter_version", giVarC.toString());
                    }
                } catch (vp1 unused2) {
                }
                bundle.putBundle(str, bundle2);
            } catch (vp1 unused3) {
            }
        }
        return new qc1(bundle, null);
    }

    @Override // com.google.android.gms.internal.ads.ah1
    public final g52<qc1> zza() {
        if (o12.c((String) c.c().b(w3.W0)) || this.f8136d.b() || !this.f8135c.e()) {
            return y42.a(new qc1(new Bundle(), null));
        }
        this.f8136d.a(true);
        return this.a.N(new Callable(this) { // from class: com.google.android.gms.internal.ads.oc1
            private final pc1 a;

            {
                this.a = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.a();
            }
        });
    }
}