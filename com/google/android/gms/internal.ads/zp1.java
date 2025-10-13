package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzs;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class zp1 {
    public static ba<ew> a(final x21 x21Var, final vu1 vu1Var) {
        return new ba(vu1Var, x21Var) { // from class: com.google.android.gms.internal.ads.wp1
            private final vu1 a;

            /* renamed from: b, reason: collision with root package name */
            private final x21 f10015b;

            {
                this.a = vu1Var;
                this.f10015b = x21Var;
            }

            @Override // com.google.android.gms.internal.ads.ba
            public final void a(Object obj, Map map) {
                vu1 vu1Var2 = this.a;
                x21 x21Var2 = this.f10015b;
                ew ewVar = (ew) obj;
                String str = (String) map.get("u");
                if (str == null) {
                    er.zzi("URL missing from click GMSG.");
                } else {
                    y42.o(aa.a(ewVar, str), new yp1(ewVar, vu1Var2, x21Var2), qr.a);
                }
            }
        };
    }

    public static <T extends uv & cx & hx & px> ba<T> b(final x21 x21Var, final vu1 vu1Var) {
        return new ba(vu1Var, x21Var) { // from class: com.google.android.gms.internal.ads.xp1
            private final vu1 a;

            /* renamed from: b, reason: collision with root package name */
            private final x21 f10213b;

            {
                this.a = vu1Var;
                this.f10213b = x21Var;
            }

            @Override // com.google.android.gms.internal.ads.ba
            public final void a(Object obj, Map map) {
                vu1 vu1Var2 = this.a;
                x21 x21Var2 = this.f10213b;
                uv uvVar = (uv) obj;
                String str = (String) map.get("u");
                if (str == null) {
                    er.zzi("URL missing from httpTrack GMSG.");
                } else if (uvVar.zzF().d0) {
                    x21Var2.i(new z21(zzs.zzj().a(), ((cx) uvVar).j().f4967b, str, 2));
                } else {
                    vu1Var2.b(str);
                }
            }
        };
    }
}