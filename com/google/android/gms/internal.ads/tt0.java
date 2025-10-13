package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class tt0 implements mo2<Set<nh0<tt1>>> {
    private final wo2<String> a;

    /* renamed from: b, reason: collision with root package name */
    private final wo2<Context> f9245b;

    /* renamed from: c, reason: collision with root package name */
    private final wo2<Executor> f9246c;

    /* renamed from: d, reason: collision with root package name */
    private final wo2<Map<lt1, vt0>> f9247d;

    public tt0(wo2<String> wo2Var, wo2<Context> wo2Var2, wo2<Executor> wo2Var3, wo2<Map<lt1, vt0>> wo2Var4) {
        this.a = wo2Var;
        this.f9245b = wo2Var2;
        this.f9246c = wo2Var3;
        this.f9247d = wo2Var4;
    }

    @Override // com.google.android.gms.internal.ads.wo2
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set setEmptySet;
        final String strA = ((fj1) this.a).a();
        Context contextA = ((hy) this.f9245b).a();
        h52 h52Var = qr.a;
        ro2.b(h52Var);
        Map mapZzb = ((qo2) this.f9247d).zzb();
        if (((Boolean) c.c().b(w3.c3)).booleanValue()) {
            w43 w43Var = new w43(new c53(contextA));
            w43Var.c(new v43(strA) { // from class: com.google.android.gms.internal.ads.ut0
                private final String a;

                {
                    this.a = strA;
                }

                @Override // com.google.android.gms.internal.ads.v43
                public final void a(q63 q63Var) {
                    q63Var.r(this.a);
                }
            });
            setEmptySet = Collections.singleton(new nh0(new wt0(w43Var, mapZzb), h52Var));
        } else {
            setEmptySet = Collections.emptySet();
        }
        ro2.b(setEmptySet);
        return setEmptySet;
    }
}