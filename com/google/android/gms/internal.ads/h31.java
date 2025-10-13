package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class h31 implements rj {
    private static lv1 a(String str) {
        return "native".equals(str) ? lv1.NATIVE : "javascript".equals(str) ? lv1.JAVASCRIPT : lv1.NONE;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static com.google.android.gms.internal.ads.kv1 b(java.lang.String r4) {
        /*
            int r0 = r4.hashCode()
            r1 = -1104128070(0xffffffffbe3057ba, float:-0.17220965)
            r2 = 2
            r3 = 1
            if (r0 == r1) goto L2a
            r1 = 1318088141(0x4e906dcd, float:1.2115575E9)
            if (r0 == r1) goto L20
            r1 = 1988248512(0x768243c0, float:1.3210405E33)
            if (r0 == r1) goto L16
            goto L34
        L16:
            java.lang.String r0 = "onePixel"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L34
            r4 = 2
            goto L35
        L20:
            java.lang.String r0 = "definedByJavascript"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L34
            r4 = 1
            goto L35
        L2a:
            java.lang.String r0 = "beginToRender"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L34
            r4 = 0
            goto L35
        L34:
            r4 = -1
        L35:
            if (r4 == 0) goto L44
            if (r4 == r3) goto L41
            if (r4 == r2) goto L3e
            com.google.android.gms.internal.ads.kv1 r4 = com.google.android.gms.internal.ads.kv1.UNSPECIFIED
            return r4
        L3e:
            com.google.android.gms.internal.ads.kv1 r4 = com.google.android.gms.internal.ads.kv1.ONE_PIXEL
            return r4
        L41:
            com.google.android.gms.internal.ads.kv1 r4 = com.google.android.gms.internal.ads.kv1.DEFINED_BY_JAVASCRIPT
            return r4
        L44:
            com.google.android.gms.internal.ads.kv1 r4 = com.google.android.gms.internal.ads.kv1.BEGIN_TO_RENDER
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.h31.b(java.lang.String):com.google.android.gms.internal.ads.kv1");
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static com.google.android.gms.internal.ads.iv1 c(java.lang.String r4) {
        /*
            int r0 = r4.hashCode()
            r1 = -382745961(0xffffffffe92fc297, float:-1.3280059E25)
            r2 = 2
            r3 = 1
            if (r0 == r1) goto L2a
            r1 = 112202875(0x6b0147b, float:6.6233935E-35)
            if (r0 == r1) goto L20
            r1 = 714893483(0x2a9c68ab, float:2.7783795E-13)
            if (r0 == r1) goto L16
            goto L34
        L16:
            java.lang.String r0 = "nativeDisplay"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L34
            r4 = 1
            goto L35
        L20:
            java.lang.String r0 = "video"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L34
            r4 = 2
            goto L35
        L2a:
            java.lang.String r0 = "htmlDisplay"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L34
            r4 = 0
            goto L35
        L34:
            r4 = -1
        L35:
            if (r4 == 0) goto L43
            if (r4 == r3) goto L40
            if (r4 == r2) goto L3d
            r4 = 0
            return r4
        L3d:
            com.google.android.gms.internal.ads.iv1 r4 = com.google.android.gms.internal.ads.iv1.VIDEO
            return r4
        L40:
            com.google.android.gms.internal.ads.iv1 r4 = com.google.android.gms.internal.ads.iv1.NATIVE_DISPLAY
            return r4
        L43:
            com.google.android.gms.internal.ads.iv1 r4 = com.google.android.gms.internal.ads.iv1.HTML_DISPLAY
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.h31.c(java.lang.String):com.google.android.gms.internal.ads.iv1");
    }

    @Override // com.google.android.gms.internal.ads.rj
    public final void H(e.c.b.b.b.b bVar) {
        if (((Boolean) c.c().b(w3.i3)).booleanValue() && bv1.b()) {
            Object objY = e.c.b.b.b.d.Y(bVar);
            if (objY instanceof dv1) {
                ((dv1) objY).a();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.rj
    public final e.c.b.b.b.b I(String str, WebView webView, String str2, String str3, String str4, String str5, tj tjVar, sj sjVar, String str6) {
        if (!((Boolean) c.c().b(w3.i3)).booleanValue() || !bv1.b()) {
            return null;
        }
        mv1 mv1VarA = mv1.a(str5, str);
        lv1 lv1VarA = a("javascript");
        lv1 lv1VarA2 = a(str4);
        iv1 iv1VarC = c(sjVar.toString());
        lv1 lv1Var = lv1.NONE;
        if (lv1VarA == lv1Var) {
            er.zzi("Omid js session error; Unable to parse impression owner: javascript");
            return null;
        }
        if (iv1VarC == null) {
            String strValueOf = String.valueOf(sjVar);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 54);
            sb.append("Omid js session error; Unable to parse creative type: ");
            sb.append(strValueOf);
            er.zzi(sb.toString());
            return null;
        }
        if (iv1VarC != iv1.VIDEO || lv1VarA2 != lv1Var) {
            return e.c.b.b.b.d.m4(dv1.f(ev1.a(iv1VarC, b(tjVar.toString()), lv1VarA, lv1VarA2, true), fv1.c(mv1VarA, webView, str6, "")));
        }
        String strValueOf2 = String.valueOf(str4);
        er.zzi(strValueOf2.length() != 0 ? "Omid js session error; Video events owner unknown for video creative: ".concat(strValueOf2) : new String("Omid js session error; Video events owner unknown for video creative: "));
        return null;
    }

    @Override // com.google.android.gms.internal.ads.rj
    public final e.c.b.b.b.b J(String str, WebView webView, String str2, String str3, String str4) {
        return K(str, webView, "", "javascript", str4, "Google");
    }

    @Override // com.google.android.gms.internal.ads.rj
    public final e.c.b.b.b.b K(String str, WebView webView, String str2, String str3, String str4, String str5) {
        if (!((Boolean) c.c().b(w3.i3)).booleanValue() || !bv1.b()) {
            return null;
        }
        mv1 mv1VarA = mv1.a(str5, str);
        lv1 lv1VarA = a("javascript");
        lv1 lv1VarA2 = a(str4);
        if (lv1VarA == lv1.NONE) {
            return null;
        }
        return e.c.b.b.b.d.m4(dv1.f(ev1.b(lv1VarA, lv1VarA2, true), fv1.a(mv1VarA, webView, "")));
    }

    @Override // com.google.android.gms.internal.ads.rj
    public final e.c.b.b.b.b L(String str, WebView webView, String str2, String str3, String str4, tj tjVar, sj sjVar, String str5) {
        if (!((Boolean) c.c().b(w3.i3)).booleanValue() || !bv1.b()) {
            return null;
        }
        mv1 mv1VarA = mv1.a("Google", str);
        lv1 lv1VarA = a("javascript");
        iv1 iv1VarC = c(sjVar.toString());
        lv1 lv1Var = lv1.NONE;
        if (lv1VarA == lv1Var) {
            er.zzi("Omid html session error; Unable to parse impression owner: javascript");
            return null;
        }
        if (iv1VarC == null) {
            String strValueOf = String.valueOf(sjVar);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 56);
            sb.append("Omid html session error; Unable to parse creative type: ");
            sb.append(strValueOf);
            er.zzi(sb.toString());
            return null;
        }
        lv1 lv1VarA2 = a(str4);
        if (iv1VarC != iv1.VIDEO || lv1VarA2 != lv1Var) {
            return e.c.b.b.b.d.m4(dv1.f(ev1.a(iv1VarC, b(tjVar.toString()), lv1VarA, lv1VarA2, true), fv1.b(mv1VarA, webView, str5, "")));
        }
        String strValueOf2 = String.valueOf(str4);
        er.zzi(strValueOf2.length() != 0 ? "Omid html session error; Video events owner unknown for video creative: ".concat(strValueOf2) : new String("Omid html session error; Video events owner unknown for video creative: "));
        return null;
    }

    @Override // com.google.android.gms.internal.ads.rj
    public final void M(e.c.b.b.b.b bVar, View view) {
        if (((Boolean) c.c().b(w3.i3)).booleanValue() && bv1.b()) {
            Object objY = e.c.b.b.b.d.Y(bVar);
            if (objY instanceof dv1) {
                dv1 dv1Var = (dv1) objY;
                if (((Boolean) c.c().b(w3.n3)).booleanValue()) {
                    dv1Var.d(view, jv1.NOT_VISIBLE, "Ad overlay");
                } else {
                    dv1Var.e(view);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.rj
    public final void N(e.c.b.b.b.b bVar, View view) {
        if (((Boolean) c.c().b(w3.i3)).booleanValue() && bv1.b()) {
            Object objY = e.c.b.b.b.d.Y(bVar);
            if (objY instanceof dv1) {
                ((dv1) objY).b(view);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.rj
    public final void m(e.c.b.b.b.b bVar) {
        if (((Boolean) c.c().b(w3.i3)).booleanValue() && bv1.b()) {
            Object objY = e.c.b.b.b.d.Y(bVar);
            if (objY instanceof dv1) {
                ((dv1) objY).c();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.rj
    public final String n(Context context) {
        if (((Boolean) c.c().b(w3.i3)).booleanValue()) {
            return "a.1.3.3-google_20200416";
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.rj
    public final boolean zza(Context context) {
        if (!((Boolean) c.c().b(w3.i3)).booleanValue()) {
            er.zzi("Omid flag is disabled");
            return false;
        }
        if (bv1.b()) {
            return true;
        }
        if (((Boolean) c.c().b(w3.k3)).booleanValue()) {
            bv1.a(context);
            return bv1.b();
        }
        bv1.c("1.3.3-google_20200416", context);
        return true;
    }
}