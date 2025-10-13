package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzs;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class yy implements mo2<bm> {
    private final wo2<Context> a;

    public yy(wo2<Context> wo2Var) {
        this.a = wo2Var;
    }

    @Override // com.google.android.gms.internal.ads.wo2
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final bm zzb() {
        Context contextA = ((hy) this.a).a();
        ve veVarA = zzs.zzp().a(contextA, kr.c());
        oe<JSONObject> oeVar = se.f8855b;
        veVarA.a("google.afma.request.getAdDictionary", oeVar, oeVar);
        return new am(contextA, zzs.zzp().a(contextA, kr.c()).a("google.afma.sdkConstants.getSdkConstants", oeVar, oeVar));
    }
}