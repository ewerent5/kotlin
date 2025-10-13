package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class s20 implements ba<Object> {
    final /* synthetic */ t20 a;

    s20(t20 t20Var) {
        this.a = t20Var;
    }

    @Override // com.google.android.gms.internal.ads.ba
    public final void a(Object obj, Map<String, String> map) {
        if (t20.e(this.a, map)) {
            this.a.f9061c.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.r20

                /* renamed from: e, reason: collision with root package name */
                private final s20 f8564e;

                {
                    this.f8564e = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.f8564e.a.f9062d.d();
                }
            });
        }
    }
}