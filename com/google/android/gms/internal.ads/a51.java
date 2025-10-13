package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import c.c.b.c;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.ads.internal.overlay.zzn;
import com.google.android.gms.ads.internal.zzs;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class a51 implements j31<li0> {
    private final Context a;

    /* renamed from: b, reason: collision with root package name */
    private final jj0 f4842b;

    /* renamed from: c, reason: collision with root package name */
    private final Executor f4843c;

    /* renamed from: d, reason: collision with root package name */
    private final wo1 f4844d;

    public a51(Context context, Executor executor, jj0 jj0Var, wo1 wo1Var) {
        this.a = context;
        this.f4842b = jj0Var;
        this.f4843c = executor;
        this.f4844d = wo1Var;
    }

    private static String d(xo1 xo1Var) {
        try {
            return xo1Var.u.getString("tab_url");
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.j31
    public final g52<li0> a(final kp1 kp1Var, final xo1 xo1Var) {
        String strD = d(xo1Var);
        final Uri uri = strD != null ? Uri.parse(strD) : null;
        return y42.h(y42.a(null), new e42(this, uri, kp1Var, xo1Var) { // from class: com.google.android.gms.internal.ads.y41
            private final a51 a;

            /* renamed from: b, reason: collision with root package name */
            private final Uri f10366b;

            /* renamed from: c, reason: collision with root package name */
            private final kp1 f10367c;

            /* renamed from: d, reason: collision with root package name */
            private final xo1 f10368d;

            {
                this.a = this;
                this.f10366b = uri;
                this.f10367c = kp1Var;
                this.f10368d = xo1Var;
            }

            @Override // com.google.android.gms.internal.ads.e42
            public final g52 zza(Object obj) {
                return this.a.c(this.f10366b, this.f10367c, this.f10368d, obj);
            }
        }, this.f4843c);
    }

    @Override // com.google.android.gms.internal.ads.j31
    public final boolean b(kp1 kp1Var, xo1 xo1Var) {
        return (this.a instanceof Activity) && com.google.android.gms.common.util.n.b() && v4.a(this.a) && !TextUtils.isEmpty(d(xo1Var));
    }

    final /* synthetic */ g52 c(Uri uri, kp1 kp1Var, xo1 xo1Var, Object obj) {
        try {
            c.c.b.c cVarA = new c.a().a();
            cVarA.a.setData(uri);
            zzc zzcVar = new zzc(cVarA.a, null);
            final wr wrVar = new wr();
            mi0 mi0VarC = this.f4842b.c(new i70(kp1Var, xo1Var, null), new pi0(new rj0(wrVar) { // from class: com.google.android.gms.internal.ads.z41
                private final wr a;

                {
                    this.a = wrVar;
                }

                @Override // com.google.android.gms.internal.ads.rj0
                public final void a(boolean z, Context context) {
                    wr wrVar2 = this.a;
                    try {
                        zzs.zzb();
                        zzn.zza(context, (AdOverlayInfoParcel) wrVar2.get(), true);
                    } catch (Exception unused) {
                    }
                }
            }, null));
            wrVar.zzc(new AdOverlayInfoParcel(zzcVar, null, mi0VarC.i(), null, new kr(0, 0, false, false, false), null));
            this.f4844d.d();
            return y42.a(mi0VarC.h());
        } catch (Throwable th) {
            er.zzg("Error in CustomTabsAdRenderer", th);
            throw th;
        }
    }
}