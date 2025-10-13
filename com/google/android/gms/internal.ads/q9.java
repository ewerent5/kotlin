package com.google.android.gms.internal.ads;

import java.util.Map;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class q9 implements ba<ew> {
    q9() {
    }

    @Override // com.google.android.gms.internal.ads.ba
    public final /* bridge */ /* synthetic */ void a(ew ewVar, Map map) {
        JSONObject jSONObjectZzc;
        ew ewVar2 = ewVar;
        e6 e6VarB = ewVar2.B();
        if (e6VarB == null || (jSONObjectZzc = e6VarB.zzc()) == null) {
            ewVar2.a("nativeAdViewSignalsReady", new JSONObject());
        } else {
            ewVar2.a("nativeAdViewSignalsReady", jSONObjectZzc);
        }
    }
}