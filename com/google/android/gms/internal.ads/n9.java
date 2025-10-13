package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zzbo;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final /* synthetic */ class n9 implements ba {
    static final ba a = new n9();

    private n9() {
    }

    @Override // com.google.android.gms.internal.ads.ba
    public final void a(Object obj, Map map) {
        hx hxVar = (hx) obj;
        ba<ew> baVar = aa.a;
        String str = (String) map.get("u");
        if (str == null) {
            er.zzi("URL missing from httpTrack GMSG.");
        } else {
            new zzbo(hxVar.getContext(), ((px) hxVar).zzt().f7054e, str).zzb();
        }
    }
}