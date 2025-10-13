package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.overlay.zzp;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class re0 extends gx1 implements qa0, c93, gs2, ad0, ib0, pc0, zzp, eb0 {

    /* renamed from: e, reason: collision with root package name */
    private final pe0 f8635e = new pe0(this, null);

    /* renamed from: f, reason: collision with root package name */
    @Nullable
    private wa1 f8636f;

    /* renamed from: g, reason: collision with root package name */
    @Nullable
    private ab1 f8637g;

    /* renamed from: h, reason: collision with root package name */
    @Nullable
    private rk1 f8638h;

    /* renamed from: i, reason: collision with root package name */
    @Nullable
    private ao1 f8639i;

    private static <T> void G(T t, qe0<T> qe0Var) {
        if (t != null) {
            qe0Var.zza(t);
        }
    }

    @Override // com.google.android.gms.internal.ads.eb0
    public final void I(final g93 g93Var) {
        G(this.f8639i, new qe0(g93Var) { // from class: com.google.android.gms.internal.ads.yd0
            private final g93 a;

            {
                this.a = g93Var;
            }

            @Override // com.google.android.gms.internal.ads.qe0
            public final void zza(Object obj) {
                ((ao1) obj).I(this.a);
            }
        });
        G(this.f8636f, new qe0(g93Var) { // from class: com.google.android.gms.internal.ads.zd0
            private final g93 a;

            {
                this.a = g93Var;
            }

            @Override // com.google.android.gms.internal.ads.qe0
            public final void zza(Object obj) {
                ((wa1) obj).I(this.a);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.gs2
    public final void a(final String str, final String str2) {
        G(this.f8636f, new qe0(str, str2) { // from class: com.google.android.gms.internal.ads.qd0
            private final String a;

            /* renamed from: b, reason: collision with root package name */
            private final String f8360b;

            {
                this.a = str;
                this.f8360b = str2;
            }

            @Override // com.google.android.gms.internal.ads.qe0
            public final void zza(Object obj) {
                ((wa1) obj).a(this.a, this.f8360b);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.ib0
    public final void b() {
        G(this.f8636f, ud0.a);
    }

    @Override // com.google.android.gms.internal.ads.ad0
    public final void c(final t93 t93Var) {
        G(this.f8636f, new qe0(t93Var) { // from class: com.google.android.gms.internal.ads.rd0
            private final t93 a;

            {
                this.a = t93Var;
            }

            @Override // com.google.android.gms.internal.ads.qe0
            public final void zza(Object obj) {
                ((wa1) obj).c(this.a);
            }
        });
        G(this.f8639i, new qe0(t93Var) { // from class: com.google.android.gms.internal.ads.sd0
            private final t93 a;

            {
                this.a = t93Var;
            }

            @Override // com.google.android.gms.internal.ads.qe0
            public final void zza(Object obj) {
                ((ao1) obj).c(this.a);
            }
        });
        G(this.f8638h, new qe0(t93Var) { // from class: com.google.android.gms.internal.ads.td0
            private final t93 a;

            {
                this.a = t93Var;
            }

            @Override // com.google.android.gms.internal.ads.qe0
            public final void zza(Object obj) {
                ((rk1) obj).c(this.a);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.qa0
    public final void d(final gm gmVar, final String str, final String str2) {
        G(this.f8636f, new qe0(gmVar, str, str2) { // from class: com.google.android.gms.internal.ads.le0
            private final gm a;

            /* renamed from: b, reason: collision with root package name */
            private final String f7239b;

            /* renamed from: c, reason: collision with root package name */
            private final String f7240c;

            {
                this.a = gmVar;
                this.f7239b = str;
                this.f7240c = str2;
            }

            @Override // com.google.android.gms.internal.ads.qe0
            public final void zza(Object obj) {
            }
        });
        G(this.f8639i, new qe0(gmVar, str, str2) { // from class: com.google.android.gms.internal.ads.me0
            private final gm a;

            /* renamed from: b, reason: collision with root package name */
            private final String f7462b;

            /* renamed from: c, reason: collision with root package name */
            private final String f7463c;

            {
                this.a = gmVar;
                this.f7462b = str;
                this.f7463c = str2;
            }

            @Override // com.google.android.gms.internal.ads.qe0
            public final void zza(Object obj) {
                ((ao1) obj).d(this.a, this.f7462b, this.f7463c);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.gx1
    public final void m() {
        G(this.f8639i, xd0.a);
    }

    public final pe0 o() {
        return this.f8635e;
    }

    @Override // com.google.android.gms.internal.ads.c93
    public final void onAdClicked() {
        G(this.f8636f, od0.a);
        G(this.f8637g, pd0.a);
    }

    @Override // com.google.android.gms.internal.ads.pc0
    public final void t() {
        G(this.f8638h, vd0.a);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzbJ() {
        G(this.f8638h, ee0.a);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzbo() {
        G(this.f8638h, ae0.a);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzbr() {
        G(this.f8638h, ce0.a);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzbs() {
        G(this.f8638h, de0.a);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzbt(final int i2) {
        G(this.f8638h, new qe0(i2) { // from class: com.google.android.gms.internal.ads.be0
            private final int a;

            {
                this.a = i2;
            }

            @Override // com.google.android.gms.internal.ads.qe0
            public final void zza(Object obj) {
                ((rk1) obj).zzbt(this.a);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.qa0
    public final void zzc() {
        G(this.f8636f, kd0.a);
        G(this.f8639i, wd0.a);
    }

    @Override // com.google.android.gms.internal.ads.qa0
    public final void zzd() {
        G(this.f8636f, fe0.a);
        G(this.f8639i, ge0.a);
    }

    @Override // com.google.android.gms.internal.ads.qa0
    public final void zze() {
        G(this.f8636f, he0.a);
        G(this.f8639i, ie0.a);
    }

    @Override // com.google.android.gms.internal.ads.qa0
    public final void zzg() {
        G(this.f8636f, je0.a);
        G(this.f8639i, ke0.a);
    }

    @Override // com.google.android.gms.internal.ads.qa0
    public final void zzh() {
        G(this.f8636f, ld0.a);
        G(this.f8639i, md0.a);
    }
}