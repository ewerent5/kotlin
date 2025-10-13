package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Bitmap;
import com.google.android.gms.ads.internal.util.zzbe;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class bo implements ho {
    private static final List<Future<Void>> a = Collections.synchronizedList(new ArrayList());

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f5150b = 0;

    /* renamed from: c, reason: collision with root package name */
    @GuardedBy("lock")
    private final om2 f5151c;

    /* renamed from: d, reason: collision with root package name */
    @GuardedBy("lock")
    private final LinkedHashMap<String, nn2> f5152d;

    /* renamed from: g, reason: collision with root package name */
    private final Context f5155g;

    /* renamed from: h, reason: collision with root package name */
    boolean f5156h;

    /* renamed from: i, reason: collision with root package name */
    private final eo f5157i;
    private final Cdo n;

    /* renamed from: e, reason: collision with root package name */
    @GuardedBy("lock")
    private final List<String> f5153e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    @GuardedBy("lock")
    private final List<String> f5154f = new ArrayList();

    /* renamed from: j, reason: collision with root package name */
    private final Object f5158j = new Object();

    /* renamed from: k, reason: collision with root package name */
    private HashSet<String> f5159k = new HashSet<>();

    /* renamed from: l, reason: collision with root package name */
    private boolean f5160l = false;

    /* renamed from: m, reason: collision with root package name */
    private boolean f5161m = false;

    public bo(Context context, kr krVar, eo eoVar, String str, Cdo cdo, byte[] bArr) {
        com.google.android.gms.common.internal.p.k(eoVar, "SafeBrowsing config is not present.");
        this.f5155g = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.f5152d = new LinkedHashMap<>();
        this.n = cdo;
        this.f5157i = eoVar;
        Iterator<String> it = eoVar.f5675i.iterator();
        while (it.hasNext()) {
            this.f5159k.add(it.next().toLowerCase(Locale.ENGLISH));
        }
        this.f5159k.remove("cookie".toLowerCase(Locale.ENGLISH));
        om2 om2VarG = rn2.G();
        om2VarG.q(jn2.OCTAGON_AD);
        om2VarG.s(str);
        om2VarG.t(str);
        pm2 pm2VarD = qm2.D();
        String str2 = this.f5157i.f5671e;
        if (str2 != null) {
            pm2VarD.q(str2);
        }
        om2VarG.u(pm2VarD.n());
        pn2 pn2VarD = qn2.D();
        pn2VarD.s(com.google.android.gms.common.p.c.a(this.f5155g).g());
        String str3 = krVar.f7054e;
        if (str3 != null) {
            pn2VarD.q(str3);
        }
        long jA = com.google.android.gms.common.f.f().a(this.f5155g);
        if (jA > 0) {
            pn2VarD.r(jA);
        }
        om2VarG.B(pn2VarD.n());
        this.f5151c = om2VarG;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0036 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.ho
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(android.view.View r8) {
        /*
            r7 = this;
            com.google.android.gms.internal.ads.eo r0 = r7.f5157i
            boolean r0 = r0.f5673g
            if (r0 != 0) goto L7
            return
        L7:
            boolean r0 = r7.f5160l
            if (r0 == 0) goto Lc
            return
        Lc:
            com.google.android.gms.ads.internal.zzs.zzc()
            r0 = 1
            r1 = 0
            if (r8 != 0) goto L14
            goto L6d
        L14:
            boolean r2 = r8.isDrawingCacheEnabled()     // Catch: java.lang.RuntimeException -> L2d
            r8.setDrawingCacheEnabled(r0)     // Catch: java.lang.RuntimeException -> L2d
            android.graphics.Bitmap r3 = r8.getDrawingCache()     // Catch: java.lang.RuntimeException -> L2d
            if (r3 == 0) goto L26
            android.graphics.Bitmap r3 = android.graphics.Bitmap.createBitmap(r3)     // Catch: java.lang.RuntimeException -> L2d
            goto L27
        L26:
            r3 = r1
        L27:
            r8.setDrawingCacheEnabled(r2)     // Catch: java.lang.RuntimeException -> L2b
            goto L34
        L2b:
            r2 = move-exception
            goto L2f
        L2d:
            r2 = move-exception
            r3 = r1
        L2f:
            java.lang.String r4 = "Fail to capture the web view"
            com.google.android.gms.internal.ads.er.zzg(r4, r2)
        L34:
            if (r3 != 0) goto L6c
            int r2 = r8.getWidth()     // Catch: java.lang.RuntimeException -> L65
            int r3 = r8.getHeight()     // Catch: java.lang.RuntimeException -> L65
            if (r2 == 0) goto L5f
            if (r3 != 0) goto L43
            goto L5f
        L43:
            int r4 = r8.getWidth()     // Catch: java.lang.RuntimeException -> L65
            int r5 = r8.getHeight()     // Catch: java.lang.RuntimeException -> L65
            android.graphics.Bitmap$Config r6 = android.graphics.Bitmap.Config.RGB_565     // Catch: java.lang.RuntimeException -> L65
            android.graphics.Bitmap r4 = android.graphics.Bitmap.createBitmap(r4, r5, r6)     // Catch: java.lang.RuntimeException -> L65
            android.graphics.Canvas r5 = new android.graphics.Canvas     // Catch: java.lang.RuntimeException -> L65
            r5.<init>(r4)     // Catch: java.lang.RuntimeException -> L65
            r6 = 0
            r8.layout(r6, r6, r2, r3)     // Catch: java.lang.RuntimeException -> L65
            r8.draw(r5)     // Catch: java.lang.RuntimeException -> L65
            r1 = r4
            goto L6d
        L5f:
            java.lang.String r8 = "Width or height of view is zero"
            com.google.android.gms.internal.ads.er.zzi(r8)     // Catch: java.lang.RuntimeException -> L65
            goto L6d
        L65:
            r8 = move-exception
            java.lang.String r2 = "Fail to capture the webview"
            com.google.android.gms.internal.ads.er.zzg(r2, r8)
            goto L6d
        L6c:
            r1 = r3
        L6d:
            if (r1 != 0) goto L75
            java.lang.String r8 = "Failed to capture the webview bitmap."
            com.google.android.gms.internal.ads.go.a(r8)
            return
        L75:
            r7.f5160l = r0
            com.google.android.gms.internal.ads.wn r8 = new com.google.android.gms.internal.ads.wn
            r8.<init>(r7, r1)
            com.google.android.gms.ads.internal.util.zzr.zzk(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.bo.a(android.view.View):void");
    }

    @Override // com.google.android.gms.internal.ads.ho
    public final void b(String str, Map<String, String> map, int i2) {
        synchronized (this.f5158j) {
            if (i2 == 3) {
                this.f5161m = true;
            }
            if (this.f5152d.containsKey(str)) {
                if (i2 == 3) {
                    this.f5152d.get(str).t(mn2.a(3));
                }
                return;
            }
            nn2 nn2VarF = on2.F();
            mn2 mn2VarA = mn2.a(i2);
            if (mn2VarA != null) {
                nn2VarF.t(mn2VarA);
            }
            nn2VarF.q(this.f5152d.size());
            nn2VarF.r(str);
            tm2 tm2VarD = wm2.D();
            if (this.f5159k.size() > 0 && map != null) {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    String key = entry.getKey() != null ? entry.getKey() : "";
                    String value = entry.getValue() != null ? entry.getValue() : "";
                    if (this.f5159k.contains(key.toLowerCase(Locale.ENGLISH))) {
                        rm2 rm2VarD = sm2.D();
                        rm2VarD.q(ci2.J(key));
                        rm2VarD.r(ci2.J(value));
                        tm2VarD.q(rm2VarD.n());
                    }
                }
            }
            nn2VarF.s(tm2VarD.n());
            this.f5152d.put(str, nn2VarF);
        }
    }

    @Override // com.google.android.gms.internal.ads.ho
    public final void c(String str) {
        synchronized (this.f5158j) {
            if (str == null) {
                this.f5151c.z();
            } else {
                this.f5151c.y(str);
            }
        }
    }

    final /* synthetic */ g52 d(Map map) {
        nn2 nn2Var;
        g52 g52VarI;
        if (map != null) {
            try {
                for (String str : map.keySet()) {
                    JSONArray jSONArrayOptJSONArray = new JSONObject((String) map.get(str)).optJSONArray("matches");
                    if (jSONArrayOptJSONArray != null) {
                        synchronized (this.f5158j) {
                            int length = jSONArrayOptJSONArray.length();
                            synchronized (this.f5158j) {
                                nn2Var = this.f5152d.get(str);
                            }
                            if (nn2Var == null) {
                                String strValueOf = String.valueOf(str);
                                go.a(strValueOf.length() != 0 ? "Cannot find the corresponding resource object for ".concat(strValueOf) : new String("Cannot find the corresponding resource object for "));
                            } else {
                                for (int i2 = 0; i2 < length; i2++) {
                                    nn2Var.u(jSONArrayOptJSONArray.getJSONObject(i2).getString("threat_type"));
                                }
                                this.f5156h = (length > 0) | this.f5156h;
                            }
                        }
                    }
                }
            } catch (JSONException e2) {
                if (q5.f8329b.e().booleanValue()) {
                    er.zze("Failed to get SafeBrowsing metadata", e2);
                }
                return y42.b(new Exception("Safebrowsing report transmission failed."));
            }
        }
        if (this.f5156h) {
            synchronized (this.f5158j) {
                this.f5151c.q(jn2.OCTAGON_AD_SB_MATCH);
            }
        }
        boolean z = this.f5156h;
        if (!(z && this.f5157i.f5677k) && (!(this.f5161m && this.f5157i.f5676j) && (z || !this.f5157i.f5674h))) {
            return y42.a(null);
        }
        synchronized (this.f5158j) {
            Iterator<nn2> it = this.f5152d.values().iterator();
            while (it.hasNext()) {
                this.f5151c.w(it.next().n());
            }
            this.f5151c.C(this.f5153e);
            this.f5151c.D(this.f5154f);
            if (go.b()) {
                String strR = this.f5151c.r();
                String strX = this.f5151c.x();
                StringBuilder sb = new StringBuilder(String.valueOf(strR).length() + 53 + String.valueOf(strX).length());
                sb.append("Sending SB report\n  url: ");
                sb.append(strR);
                sb.append("\n  clickUrl: ");
                sb.append(strX);
                sb.append("\n  resources: \n");
                StringBuilder sb2 = new StringBuilder(sb.toString());
                for (on2 on2Var : this.f5151c.v()) {
                    sb2.append("    [");
                    sb2.append(on2Var.E());
                    sb2.append("] ");
                    sb2.append(on2Var.D());
                }
                go.a(sb2.toString());
            }
            g52<String> g52VarZzb = new zzbe(this.f5155g).zzb(1, this.f5157i.f5672f, null, this.f5151c.n().i());
            if (go.b()) {
                g52VarZzb.zze(yn.f10456e, qr.a);
            }
            g52VarI = y42.i(g52VarZzb, zn.a, qr.f8451f);
        }
        return g52VarI;
    }

    final /* synthetic */ void e(Bitmap bitmap) {
        ai2 ai2VarA = ci2.a();
        bitmap.compress(Bitmap.CompressFormat.PNG, 0, ai2VarA);
        synchronized (this.f5158j) {
            om2 om2Var = this.f5151c;
            cn2 cn2VarD = gn2.D();
            cn2VarD.s(ai2VarA.b());
            cn2VarD.r("image/png");
            cn2VarD.q(fn2.TYPE_CREATIVE);
            om2Var.A(cn2VarD.n());
        }
    }

    @Override // com.google.android.gms.internal.ads.ho
    public final eo zza() {
        return this.f5157i;
    }

    @Override // com.google.android.gms.internal.ads.ho
    public final boolean zzc() {
        return com.google.android.gms.common.util.n.f() && this.f5157i.f5673g && !this.f5160l;
    }

    @Override // com.google.android.gms.internal.ads.ho
    public final void zzf() {
        synchronized (this.f5158j) {
            this.f5152d.keySet();
            g52 g52VarA = y42.a(Collections.emptyMap());
            e42 e42Var = new e42(this) { // from class: com.google.android.gms.internal.ads.xn
                private final bo a;

                {
                    this.a = this;
                }

                @Override // com.google.android.gms.internal.ads.e42
                public final g52 zza(Object obj) {
                    return this.a.d((Map) obj);
                }
            };
            h52 h52Var = qr.f8451f;
            g52 g52VarH = y42.h(g52VarA, e42Var, h52Var);
            g52 g52VarG = y42.g(g52VarH, 10L, TimeUnit.SECONDS, qr.f8449d);
            y42.o(g52VarH, new ao(this, g52VarG), h52Var);
            a.add(g52VarG);
        }
    }
}