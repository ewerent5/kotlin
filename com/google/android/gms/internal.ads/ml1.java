package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.s60;
import com.google.android.gms.internal.ads.y90;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class ml1<R extends y90<AdT>, AdT extends s60> implements mm1<R, mr1<AdT>> {
    private R a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f7506b = o52.a();

    @Override // com.google.android.gms.internal.ads.mm1
    public final g52<mr1<AdT>> a(nm1 nm1Var, lm1<R> lm1Var) {
        x90<R> x90VarA = lm1Var.a(nm1Var.f7749b);
        x90VarA.g(new sm1(true));
        R rZzf = x90VarA.zzf();
        this.a = rZzf;
        final w70 w70VarZzc = rZzf.zzc();
        final mr1 mr1Var = new mr1();
        ql qlVar = nm1Var.a;
        return y42.i(y42.h(p42.D(qlVar != null ? w70VarZzc.a(y42.a(qlVar)) : w70VarZzc.b()), new e42(this, mr1Var, w70VarZzc) { // from class: com.google.android.gms.internal.ads.kl1
            private final ml1 a;

            /* renamed from: b, reason: collision with root package name */
            private final mr1 f7006b;

            /* renamed from: c, reason: collision with root package name */
            private final w70 f7007c;

            {
                this.a = this;
                this.f7006b = mr1Var;
                this.f7007c = w70VarZzc;
            }

            @Override // com.google.android.gms.internal.ads.e42
            public final g52 zza(Object obj) {
                mr1 mr1Var2 = this.f7006b;
                w70 w70Var = this.f7007c;
                kp1 kp1Var = (kp1) obj;
                mr1Var2.f7531b = kp1Var;
                Iterator<xo1> it = kp1Var.f7035b.a.iterator();
                boolean z = false;
                loop0: while (true) {
                    if (it.hasNext()) {
                        Iterator<String> it2 = it.next().a.iterator();
                        while (it2.hasNext()) {
                            if (!it2.next().contains("FirstPartyRenderer")) {
                                break loop0;
                            }
                            z = true;
                        }
                    } else if (z) {
                        return w70Var.c(y42.a(kp1Var));
                    }
                }
                return y42.a(null);
            }
        }, this.f7506b), new x02(mr1Var) { // from class: com.google.android.gms.internal.ads.ll1
            private final mr1 a;

            {
                this.a = mr1Var;
            }

            @Override // com.google.android.gms.internal.ads.x02
            public final Object apply(Object obj) {
                mr1 mr1Var2 = this.a;
                mr1Var2.f7532c = (AdT) obj;
                return mr1Var2;
            }
        }, this.f7506b);
    }

    public final R b() {
        return this.a;
    }

    @Override // com.google.android.gms.internal.ads.mm1
    public final /* bridge */ /* synthetic */ Object zzc() {
        return this.a;
    }
}