package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzs;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final /* synthetic */ class xp1 implements ba {
    private final vu1 a;

    /* renamed from: b */
    private final x21 f10213b;

    xp1(vu1 vu1Var, x21 x21Var) {
        this.a = vu1Var;
        this.f10213b = x21Var;
    }

    @Override // com.google.android.gms.internal.ads.ba
    public final void a(Object obj, Map map) {
        vu1 vu1Var = this.a;
        x21 x21Var = this.f10213b;
        uv uvVar = (uv) obj;
        String str = (String) map.get("u");
        if (str == null) {
            er.zzi("URL missing from httpTrack GMSG.");
        } else if (uvVar.zzF().d0) {
            x21Var.i(new z21(zzs.zzj().a(), ((cx) uvVar).j().f4967b, str, 2));
        } else {
            vu1Var.b(str);
        }
    }
}