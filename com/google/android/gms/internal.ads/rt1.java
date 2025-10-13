package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class rt1 extends sf0<tt1> implements kt1<lt1> {
    rt1(Set<nh0<tt1>> set) {
        super(set);
    }

    @Override // com.google.android.gms.internal.ads.kt1
    public final void A(final xs1<lt1, ?> xs1Var) {
        J0(new rf0(xs1Var) { // from class: com.google.android.gms.internal.ads.mt1
            private final xs1 a;

            {
                this.a = xs1Var;
            }

            @Override // com.google.android.gms.internal.ads.rf0
            public final void zza(Object obj) {
                xs1 xs1Var2 = this.a;
                ((tt1) obj).m((lt1) xs1Var2.b(), xs1Var2.c());
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.kt1
    public final void d(final xs1<lt1, ?> xs1Var) {
        J0(new rf0(xs1Var) { // from class: com.google.android.gms.internal.ads.qt1
            private final xs1 a;

            {
                this.a = xs1Var;
            }

            @Override // com.google.android.gms.internal.ads.rf0
            public final void zza(Object obj) {
                xs1 xs1Var2 = this.a;
                ((tt1) obj).A((lt1) xs1Var2.b(), xs1Var2.c());
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.kt1
    public final void o(final xs1<lt1, ?> xs1Var) {
        J0(new rf0(xs1Var) { // from class: com.google.android.gms.internal.ads.ot1
            private final xs1 a;

            {
                this.a = xs1Var;
            }

            @Override // com.google.android.gms.internal.ads.rf0
            public final void zza(Object obj) {
                xs1 xs1Var2 = this.a;
                ((tt1) obj).o((lt1) xs1Var2.b(), xs1Var2.c());
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.kt1
    public final void z(final xs1<lt1, ?> xs1Var, final Throwable th) {
        J0(new rf0(xs1Var, th) { // from class: com.google.android.gms.internal.ads.pt1
            private final xs1 a;

            /* renamed from: b, reason: collision with root package name */
            private final Throwable f8266b;

            {
                this.a = xs1Var;
                this.f8266b = th;
            }

            @Override // com.google.android.gms.internal.ads.rf0
            public final void zza(Object obj) {
                xs1 xs1Var2 = this.a;
                Throwable th2 = this.f8266b;
                ((tt1) obj).z((lt1) xs1Var2.b(), xs1Var2.c(), th2);
            }
        });
    }
}