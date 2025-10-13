package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzs;
import javax.annotation.Nullable;
import org.json.JSONException;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class ow0 implements u42<String> {
    final /* synthetic */ qw0 a;

    ow0(qw0 qw0Var) {
        this.a = qw0Var;
    }

    @Override // com.google.android.gms.internal.ads.u42
    public final void zza(Throwable th) {
        synchronized (this) {
            qw0.l(this.a, true);
            this.a.u("com.google.android.gms.ads.MobileAds", false, "Internal Error.", (int) (zzs.zzj().c() - this.a.f8502d));
            this.a.f8503e.zzd(new Exception());
        }
    }

    @Override // com.google.android.gms.internal.ads.u42
    public final /* bridge */ /* synthetic */ void zzb(@Nullable String str) {
        final String str2 = str;
        synchronized (this) {
            qw0.l(this.a, true);
            this.a.u("com.google.android.gms.ads.MobileAds", true, "", (int) (zzs.zzj().c() - this.a.f8502d));
            this.a.f8507i.execute(new Runnable(this, str2) { // from class: com.google.android.gms.internal.ads.nw0

                /* renamed from: e, reason: collision with root package name */
                private final ow0 f7819e;

                /* renamed from: f, reason: collision with root package name */
                private final String f7820f;

                {
                    this.f7819e = this;
                    this.f7820f = str2;
                }

                @Override // java.lang.Runnable
                public final void run() throws JSONException {
                    ow0 ow0Var = this.f7819e;
                    qw0.q(ow0Var.a, this.f7820f);
                }
            });
        }
    }
}