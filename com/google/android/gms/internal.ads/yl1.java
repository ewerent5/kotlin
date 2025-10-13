package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.s60;
import com.google.android.gms.internal.ads.y90;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class yl1<R extends y90<AdT>, AdT extends s60> implements mm1<R, xl1<AdT>> {
    private final cr1 a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f10447b;

    /* renamed from: c, reason: collision with root package name */
    private final u42<Void> f10448c = new wl1(this);

    public yl1(cr1 cr1Var, Executor executor) {
        this.a = cr1Var;
        this.f10447b = executor;
    }

    @Override // com.google.android.gms.internal.ads.mm1
    public final g52<xl1<AdT>> a(final nm1 nm1Var, final lm1<R> lm1Var) {
        return y42.e(y42.h(p42.D(new im1(this.a, nm1Var.f7749b, lm1Var, this.f10447b).a()), new e42(this, nm1Var, lm1Var) { // from class: com.google.android.gms.internal.ads.ul1
            private final yl1 a;

            /* renamed from: b, reason: collision with root package name */
            private final nm1 f9502b;

            /* renamed from: c, reason: collision with root package name */
            private final lm1 f9503c;

            {
                this.a = this;
                this.f9502b = nm1Var;
                this.f9503c = lm1Var;
            }

            @Override // com.google.android.gms.internal.ads.e42
            public final g52 zza(Object obj) {
                return this.a.b(this.f9502b, this.f9503c, (hm1) obj);
            }
        }, this.f10447b), Exception.class, new vl1(this), this.f10447b);
    }

    final /* synthetic */ g52 b(nm1 nm1Var, lm1 lm1Var, hm1 hm1Var) {
        nr1 nr1Var = hm1Var.f6349b;
        ql qlVar = hm1Var.a;
        mr1<?> mr1VarA = nr1Var != null ? this.a.a(nr1Var) : null;
        if (nr1Var == null) {
            return y42.a(null);
        }
        if (mr1VarA != null && qlVar != null) {
            y42.o(((y90) lm1Var.a(nm1Var.f7749b).zzf()).zzc().f(qlVar), this.f10448c, this.f10447b);
        }
        return y42.a(new xl1(nr1Var, qlVar, mr1VarA));
    }

    @Override // com.google.android.gms.internal.ads.mm1
    public final /* bridge */ /* synthetic */ Object zzc() {
        return null;
    }
}