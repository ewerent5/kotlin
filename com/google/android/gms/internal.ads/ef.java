package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class ef {
    private final ge a;

    /* renamed from: b, reason: collision with root package name */
    private g52<he> f5631b;

    ef(ge geVar) {
        this.a = geVar;
    }

    private final void d() {
        if (this.f5631b == null) {
            final wr wrVar = new wr();
            this.f5631b = wrVar;
            this.a.b(null).a(new as(wrVar) { // from class: com.google.android.gms.internal.ads.af
                private final wr a;

                {
                    this.a = wrVar;
                }

                @Override // com.google.android.gms.internal.ads.as
                public final void zza(Object obj) {
                    this.a.zzc((he) obj);
                }
            }, new yr(wrVar) { // from class: com.google.android.gms.internal.ads.bf
                private final wr a;

                {
                    this.a = wrVar;
                }

                @Override // com.google.android.gms.internal.ads.yr
                public final void zza() {
                    this.a.zzd(new je("Cannot get Javascript Engine"));
                }
            });
        }
    }

    public final <I, O> hf<I, O> a(String str, ne<I> neVar, me<O> meVar) {
        d();
        return new hf<>(this.f5631b, "google.afma.activeView.handleUpdate", neVar, meVar);
    }

    public final void b(final String str, final ba<? super he> baVar) {
        d();
        this.f5631b = y42.h(this.f5631b, new e42(str, baVar) { // from class: com.google.android.gms.internal.ads.cf
            private final String a;

            /* renamed from: b, reason: collision with root package name */
            private final ba f5315b;

            {
                this.a = str;
                this.f5315b = baVar;
            }

            @Override // com.google.android.gms.internal.ads.e42
            public final g52 zza(Object obj) {
                he heVar = (he) obj;
                heVar.I(this.a, this.f5315b);
                return y42.a(heVar);
            }
        }, qr.f8451f);
    }

    public final void c(final String str, final ba<? super he> baVar) {
        this.f5631b = y42.i(this.f5631b, new x02(str, baVar) { // from class: com.google.android.gms.internal.ads.df
            private final String a;

            /* renamed from: b, reason: collision with root package name */
            private final ba f5469b;

            {
                this.a = str;
                this.f5469b = baVar;
            }

            @Override // com.google.android.gms.internal.ads.x02
            public final Object apply(Object obj) {
                he heVar = (he) obj;
                heVar.A(this.a, this.f5469b);
                return heVar;
            }
        }, qr.f8451f);
    }
}