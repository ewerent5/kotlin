package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.ads.internal.zzs;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final /* synthetic */ class mw implements e42 {
    private final Context a;

    /* renamed from: b */
    private final ip2 f7567b;

    /* renamed from: c */
    private final kr f7568c;

    /* renamed from: d */
    private final zza f7569d;

    /* renamed from: e */
    private final String f7570e;

    mw(Context context, ip2 ip2Var, kr krVar, zza zzaVar, String str) {
        this.a = context;
        this.f7567b = ip2Var;
        this.f7568c = krVar;
        this.f7569d = zzaVar;
        this.f7570e = str;
    }

    @Override // com.google.android.gms.internal.ads.e42
    public final g52 zza(Object obj) throws pw {
        Context context = this.a;
        ip2 ip2Var = this.f7567b;
        kr krVar = this.f7568c;
        zza zzaVar = this.f7569d;
        String str = this.f7570e;
        zzs.zzd();
        ew ewVarA = qw.a(context, vx.b(), "", false, false, ip2Var, null, krVar, null, null, zzaVar, w43.a(), null, null);
        vr vrVarB = vr.b(ewVarA);
        ewVarA.E0().i0(new rx(vrVarB) { // from class: com.google.android.gms.internal.ads.ow

            /* renamed from: e */
            private final vr f8025e;

            ow(vr vrVarB2) {
                this.f8025e = vrVarB2;
            }

            @Override // com.google.android.gms.internal.ads.rx
            public final void zza(boolean z) {
                this.f8025e.c();
            }
        });
        ewVarA.loadUrl(str);
        return vrVarB2;
    }
}