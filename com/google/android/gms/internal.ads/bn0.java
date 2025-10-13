package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final /* synthetic */ class bn0 implements ba {
    private final fn0 a;

    bn0(fn0 fn0Var) {
        this.a = fn0Var;
    }

    @Override // com.google.android.gms.internal.ads.ba
    public final void a(Object obj, Map map) {
        ew ewVar = (ew) obj;
        ewVar.E0().i0(new rx(this.a, map) { // from class: com.google.android.gms.internal.ads.en0

            /* renamed from: e */
            private final fn0 f5669e;

            /* renamed from: f */
            private final Map f5670f;

            en0(fn0 fn0Var, Map map2) {
                this.f5669e = fn0Var;
                this.f5670f = map2;
            }

            @Override // com.google.android.gms.internal.ads.rx
            public final void zza(boolean z) {
                this.f5669e.d(this.f5670f, z);
            }
        });
        String str = (String) map2.get("overlayHtml");
        String str2 = (String) map2.get("baseUrl");
        if (TextUtils.isEmpty(str2)) {
            ewVar.loadData(str, "text/html", "UTF-8");
        } else {
            ewVar.loadDataWithBaseURL(str2, str, "text/html", "UTF-8", null);
        }
    }
}