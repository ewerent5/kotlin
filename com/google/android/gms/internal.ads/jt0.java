package com.google.android.gms.internal.ads;

import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class jt0 implements jd0, dc0, ta0, ib0, c93, of0 {

    /* renamed from: e, reason: collision with root package name */
    private final w43 f6840e;

    /* renamed from: f, reason: collision with root package name */
    @GuardedBy("this")
    private boolean f6841f = false;

    public jt0(w43 w43Var, @Nullable sm1 sm1Var) {
        this.f6840e = w43Var;
        w43Var.b(y43.AD_REQUEST);
        if (sm1Var != null) {
            w43Var.b(y43.REQUEST_IS_PREFETCH);
        }
    }

    @Override // com.google.android.gms.internal.ads.ta0
    public final void B0(g93 g93Var) {
        switch (g93Var.f6091e) {
            case 1:
                this.f6840e.b(y43.AD_FAILED_TO_LOAD_INVALID_REQUEST);
                break;
            case 2:
                this.f6840e.b(y43.AD_FAILED_TO_LOAD_NETWORK_ERROR);
                break;
            case 3:
                this.f6840e.b(y43.AD_FAILED_TO_LOAD_NO_FILL);
                break;
            case 4:
                this.f6840e.b(y43.AD_FAILED_TO_LOAD_TIMEOUT);
                break;
            case 5:
                this.f6840e.b(y43.AD_FAILED_TO_LOAD_CANCELLED);
                break;
            case 6:
                this.f6840e.b(y43.AD_FAILED_TO_LOAD_NO_ERROR);
                break;
            case 7:
                this.f6840e.b(y43.AD_FAILED_TO_LOAD_NOT_FOUND);
                break;
            default:
                this.f6840e.b(y43.AD_FAILED_TO_LOAD);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.of0
    public final void D0(final u53 u53Var) {
        this.f6840e.c(new v43(u53Var) { // from class: com.google.android.gms.internal.ads.ht0
            private final u53 a;

            {
                this.a = u53Var;
            }

            @Override // com.google.android.gms.internal.ads.v43
            public final void a(q63 q63Var) {
                q63Var.A(this.a);
            }
        });
        this.f6840e.b(y43.REQUEST_SAVED_TO_CACHE);
    }

    @Override // com.google.android.gms.internal.ads.of0
    public final void I(final u53 u53Var) {
        this.f6840e.c(new v43(u53Var) { // from class: com.google.android.gms.internal.ads.gt0
            private final u53 a;

            {
                this.a = u53Var;
            }

            @Override // com.google.android.gms.internal.ads.v43
            public final void a(q63 q63Var) {
                q63Var.A(this.a);
            }
        });
        this.f6840e.b(y43.REQUEST_LOADED_FROM_CACHE);
    }

    @Override // com.google.android.gms.internal.ads.jd0
    public final void R(final kp1 kp1Var) {
        this.f6840e.c(new v43(kp1Var) { // from class: com.google.android.gms.internal.ads.ft0
            private final kp1 a;

            {
                this.a = kp1Var;
            }

            @Override // com.google.android.gms.internal.ads.v43
            public final void a(q63 q63Var) {
                kp1 kp1Var2 = this.a;
                h53 h53VarY = q63Var.w().y();
                c63 c63VarY = q63Var.w().D().y();
                c63VarY.q(kp1Var2.f7035b.f6562b.f4967b);
                h53VarY.r(c63VarY);
                q63Var.x(h53VarY);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.of0
    public final void V(boolean z) {
        this.f6840e.b(z ? y43.NOTIFIED_CACHE_HIT_TO_SERVICE_SUCCEEDED : y43.NOTIFIED_CACHE_HIT_TO_SERVICE_FAILED);
    }

    @Override // com.google.android.gms.internal.ads.ib0
    public final synchronized void b() {
        this.f6840e.b(y43.AD_IMPRESSION);
    }

    @Override // com.google.android.gms.internal.ads.dc0
    public final void b0() {
        this.f6840e.b(y43.AD_LOADED);
    }

    @Override // com.google.android.gms.internal.ads.jd0
    public final void f(ql qlVar) {
    }

    @Override // com.google.android.gms.internal.ads.of0
    public final void m(boolean z) {
        this.f6840e.b(z ? y43.REQUESTED_CACHE_KEY_FROM_SERVICE_SUCCEEDED : y43.REQUESTED_CACHE_KEY_FROM_SERVICE_FAILED);
    }

    @Override // com.google.android.gms.internal.ads.c93
    public final synchronized void onAdClicked() {
        if (this.f6841f) {
            this.f6840e.b(y43.AD_SUBSEQUENT_CLICK);
        } else {
            this.f6840e.b(y43.AD_FIRST_CLICK);
            this.f6841f = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.of0
    public final void q0(final u53 u53Var) {
        this.f6840e.c(new v43(u53Var) { // from class: com.google.android.gms.internal.ads.it0
            private final u53 a;

            {
                this.a = u53Var;
            }

            @Override // com.google.android.gms.internal.ads.v43
            public final void a(q63 q63Var) {
                q63Var.A(this.a);
            }
        });
        this.f6840e.b(y43.REQUEST_PREFETCH_INTERCEPTED);
    }

    @Override // com.google.android.gms.internal.ads.of0
    public final void zzp() {
        this.f6840e.b(y43.REQUEST_FAILED_TO_LOAD_FROM_CACHE);
    }
}