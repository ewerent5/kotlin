package com.google.android.gms.ads.nonagon.signalgeneration;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Point;
import android.net.Uri;
import android.os.Build;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import com.google.android.gms.ads.internal.util.zzbn;
import com.google.android.gms.internal.ads.aa0;
import com.google.android.gms.internal.ads.c;
import com.google.android.gms.internal.ads.cy;
import com.google.android.gms.internal.ads.dq;
import com.google.android.gms.internal.ads.e42;
import com.google.android.gms.internal.ads.er;
import com.google.android.gms.internal.ads.g52;
import com.google.android.gms.internal.ads.h52;
import com.google.android.gms.internal.ads.ip2;
import com.google.android.gms.internal.ads.iq1;
import com.google.android.gms.internal.ads.jp2;
import com.google.android.gms.internal.ads.kk;
import com.google.android.gms.internal.ads.kr;
import com.google.android.gms.internal.ads.m93;
import com.google.android.gms.internal.ads.n93;
import com.google.android.gms.internal.ads.p42;
import com.google.android.gms.internal.ads.pp1;
import com.google.android.gms.internal.ads.pq0;
import com.google.android.gms.internal.ads.r93;
import com.google.android.gms.internal.ads.sk;
import com.google.android.gms.internal.ads.uf0;
import com.google.android.gms.internal.ads.w3;
import com.google.android.gms.internal.ads.wp;
import com.google.android.gms.internal.ads.x02;
import com.google.android.gms.internal.ads.y42;
import com.google.android.gms.internal.ads.yp;
import e.c.b.b.b.b;
import e.c.b.b.b.d;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class zzp extends yp {
    protected static final List<String> zza = new ArrayList(Arrays.asList("/aclk", "/pcs/click"));
    protected static final List<String> zzb = new ArrayList(Arrays.asList(".doubleclick.net", ".googleadservices.com"));
    protected static final List<String> zzc = new ArrayList(Arrays.asList("/pagead/adview", "/pcs/view", "/pagead/conversion"));
    protected static final List<String> zzd = new ArrayList(Arrays.asList(".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"));
    public static final /* synthetic */ int zze = 0;
    private final cy zzf;
    private Context zzg;
    private final ip2 zzh;
    private final kr zzi;
    private final iq1<pq0> zzj;
    private final h52 zzk;
    private final ScheduledExecutorService zzl;
    private sk zzm;
    private Point zzn = new Point();
    private Point zzo = new Point();
    private final Set<WebView> zzp = Collections.newSetFromMap(new WeakHashMap());

    public zzp(cy cyVar, Context context, ip2 ip2Var, kr krVar, iq1<pq0> iq1Var, h52 h52Var, ScheduledExecutorService scheduledExecutorService) {
        this.zzf = cyVar;
        this.zzg = context;
        this.zzh = ip2Var;
        this.zzi = krVar;
        this.zzj = iq1Var;
        this.zzk = h52Var;
        this.zzl = scheduledExecutorService;
    }

    static boolean zzc(Uri uri) {
        return zzs(uri, zzc, zzd);
    }

    static final /* synthetic */ Uri zzq(Uri uri, String str) {
        return !TextUtils.isEmpty(str) ? zzv(uri, "nas", str) : uri;
    }

    static final /* synthetic */ ArrayList zzr(List list, String str) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Uri uri = (Uri) it.next();
            if (!zzc(uri) || TextUtils.isEmpty(str)) {
                arrayList.add(uri);
            } else {
                arrayList.add(zzv(uri, "nas", str));
            }
        }
        return arrayList;
    }

    private static boolean zzs(Uri uri, List<String> list, List<String> list2) {
        String host = uri.getHost();
        String path = uri.getPath();
        if (host != null && path != null) {
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                if (path.contains(it.next())) {
                    Iterator<String> it2 = list2.iterator();
                    while (it2.hasNext()) {
                        if (host.endsWith(it2.next())) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    private final g52<String> zzt(final String str) {
        final pq0[] pq0VarArr = new pq0[1];
        g52 g52VarH = y42.h(this.zzj.b(), new e42(this, pq0VarArr, str) { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzk
            private final zzp zza;
            private final pq0[] zzb;
            private final String zzc;

            {
                this.zza = this;
                this.zzb = pq0VarArr;
                this.zzc = str;
            }

            @Override // com.google.android.gms.internal.ads.e42
            public final g52 zza(Object obj) {
                return this.zza.zzk(this.zzb, this.zzc, (pq0) obj);
            }
        }, this.zzk);
        g52VarH.zze(new Runnable(this, pq0VarArr) { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzl
            private final zzp zza;
            private final pq0[] zzb;

            {
                this.zza = this;
                this.zzb = pq0VarArr;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzd(this.zzb);
            }
        }, this.zzk);
        return y42.e(y42.i((p42) y42.g(p42.D(g52VarH), ((Integer) c.c().b(w3.X4)).intValue(), TimeUnit.MILLISECONDS, this.zzl), zzi.zza, this.zzk), Exception.class, zzj.zza, this.zzk);
    }

    private final boolean zzu() {
        Map<String, WeakReference<View>> map;
        sk skVar = this.zzm;
        return (skVar == null || (map = skVar.f8891f) == null || map.isEmpty()) ? false : true;
    }

    private static final Uri zzv(Uri uri, String str, String str2) {
        String string = uri.toString();
        int iIndexOf = string.indexOf("&adurl=");
        if (iIndexOf == -1) {
            iIndexOf = string.indexOf("?adurl=");
        }
        if (iIndexOf == -1) {
            return uri.buildUpon().appendQueryParameter(str, str2).build();
        }
        int i2 = iIndexOf + 1;
        return Uri.parse(string.substring(0, i2) + str + "=" + str2 + "&" + string.substring(i2));
    }

    final /* synthetic */ void zzd(pq0[] pq0VarArr) {
        pq0 pq0Var = pq0VarArr[0];
        if (pq0Var != null) {
            this.zzj.c(y42.a(pq0Var));
        }
    }

    @Override // com.google.android.gms.internal.ads.zp
    public final void zze(b bVar, dq dqVar, wp wpVar) {
        Context context = (Context) d.Y(bVar);
        this.zzg = context;
        String str = dqVar.f5502e;
        String str2 = dqVar.f5503f;
        r93 r93Var = dqVar.f5504g;
        m93 m93VarA = dqVar.f5505h;
        zza zzaVarX = this.zzf.x();
        aa0 aa0Var = new aa0();
        aa0Var.a(context);
        pp1 pp1Var = new pp1();
        if (str == null) {
            str = "adUnitId";
        }
        pp1Var.u(str);
        if (m93VarA == null) {
            m93VarA = new n93().a();
        }
        pp1Var.p(m93VarA);
        if (r93Var == null) {
            r93Var = new r93();
        }
        pp1Var.r(r93Var);
        aa0Var.b(pp1Var.J());
        zzaVarX.zzc(aa0Var.d());
        zzs zzsVar = new zzs();
        zzsVar.zza(str2);
        zzaVarX.zzb(new zzt(zzsVar, null));
        new uf0();
        y42.o(zzaVarX.zza().zza(), new zzm(this, wpVar), this.zzf.h());
    }

    @Override // com.google.android.gms.internal.ads.zp
    public final void zzf(b bVar) {
        if (((Boolean) c.c().b(w3.W4)).booleanValue()) {
            MotionEvent motionEvent = (MotionEvent) d.Y(bVar);
            sk skVar = this.zzm;
            this.zzn = zzbn.zzh(motionEvent, skVar == null ? null : skVar.f8890e);
            if (motionEvent.getAction() == 0) {
                this.zzo = this.zzn;
            }
            MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
            Point point = this.zzn;
            motionEventObtain.setLocation(point.x, point.y);
            this.zzh.d(motionEventObtain);
            motionEventObtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.ads.zp
    public final void zzg(final List<Uri> list, final b bVar, kk kkVar) {
        if (!((Boolean) c.c().b(w3.W4)).booleanValue()) {
            try {
                kkVar.b("The updating URL feature is not enabled.");
                return;
            } catch (RemoteException e2) {
                er.zzg("", e2);
                return;
            }
        }
        g52 g52VarN = this.zzk.N(new Callable(this, list, bVar) { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzc
            private final zzp zza;
            private final List zzb;
            private final b zzc;

            {
                this.zza = this;
                this.zzb = list;
                this.zzc = bVar;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.zzo(this.zzb, this.zzc);
            }
        });
        if (zzu()) {
            g52VarN = y42.h(g52VarN, new e42(this) { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzd
                private final zzp zza;

                {
                    this.zza = this;
                }

                @Override // com.google.android.gms.internal.ads.e42
                public final g52 zza(Object obj) {
                    return this.zza.zzn((ArrayList) obj);
                }
            }, this.zzk);
        } else {
            er.zzh("Asset view map is empty.");
        }
        y42.o(g52VarN, new zzn(this, kkVar), this.zzf.h());
    }

    @Override // com.google.android.gms.internal.ads.zp
    public final void zzh(List<Uri> list, final b bVar, kk kkVar) {
        try {
            if (!((Boolean) c.c().b(w3.W4)).booleanValue()) {
                kkVar.b("The updating URL feature is not enabled.");
                return;
            }
            if (list.size() != 1) {
                kkVar.b("There should be only 1 click URL.");
                return;
            }
            final Uri uri = list.get(0);
            if (zzs(uri, zza, zzb)) {
                g52 g52VarN = this.zzk.N(new Callable(this, uri, bVar) { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zze
                    private final zzp zza;
                    private final Uri zzb;
                    private final b zzc;

                    {
                        this.zza = this;
                        this.zzb = uri;
                        this.zzc = bVar;
                    }

                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return this.zza.zzm(this.zzb, this.zzc);
                    }
                });
                if (zzu()) {
                    g52VarN = y42.h(g52VarN, new e42(this) { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzf
                        private final zzp zza;

                        {
                            this.zza = this;
                        }

                        @Override // com.google.android.gms.internal.ads.e42
                        public final g52 zza(Object obj) {
                            return this.zza.zzl((Uri) obj);
                        }
                    }, this.zzk);
                } else {
                    er.zzh("Asset view map is empty.");
                }
                y42.o(g52VarN, new zzo(this, kkVar), this.zzf.h());
                return;
            }
            String strValueOf = String.valueOf(uri);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 18);
            sb.append("Not a Google URL: ");
            sb.append(strValueOf);
            er.zzi(sb.toString());
            kkVar.U3(list);
        } catch (RemoteException e2) {
            er.zzg("", e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zp
    public final void zzi(sk skVar) {
        this.zzm = skVar;
        this.zzj.a(1);
    }

    @Override // com.google.android.gms.internal.ads.zp
    @SuppressLint({"AddJavascriptInterface"})
    public final void zzj(b bVar) {
        if (((Boolean) c.c().b(w3.e6)).booleanValue()) {
            if (Build.VERSION.SDK_INT < 21) {
                er.zzi("Not registering the webview because the Android API level is lower than Lollopop which has security risks on webviews.");
                return;
            }
            WebView webView = (WebView) d.Y(bVar);
            if (webView == null) {
                er.zzf("The webView cannot be null.");
            } else if (this.zzp.contains(webView)) {
                er.zzh("This webview has already been registered.");
            } else {
                this.zzp.add(webView);
                webView.addJavascriptInterface(new TaggingLibraryJsInterface(webView), "gmaSdk");
            }
        }
    }

    final /* synthetic */ g52 zzk(pq0[] pq0VarArr, String str, pq0 pq0Var) throws JSONException {
        pq0VarArr[0] = pq0Var;
        Context context = this.zzg;
        sk skVar = this.zzm;
        Map<String, WeakReference<View>> map = skVar.f8891f;
        JSONObject jSONObjectZze = zzbn.zze(context, map, map, skVar.f8890e);
        JSONObject jSONObjectZzb = zzbn.zzb(this.zzg, this.zzm.f8890e);
        JSONObject jSONObjectZzc = zzbn.zzc(this.zzm.f8890e);
        JSONObject jSONObjectZzd = zzbn.zzd(this.zzg, this.zzm.f8890e);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("asset_view_signal", jSONObjectZze);
        jSONObject.put("ad_view_signal", jSONObjectZzb);
        jSONObject.put("scroll_view_signal", jSONObjectZzc);
        jSONObject.put("lock_screen_signal", jSONObjectZzd);
        if (str == "google.afma.nativeAds.getPublisherCustomRenderedClickSignals") {
            jSONObject.put("click_signal", zzbn.zzf(null, this.zzg, this.zzo, this.zzn));
        }
        return pq0Var.c(str, jSONObject);
    }

    final /* synthetic */ g52 zzl(final Uri uri) {
        return y42.i(zzt("google.afma.nativeAds.getPublisherCustomRenderedClickSignals"), new x02(this, uri) { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzh
            private final zzp zza;
            private final Uri zzb;

            {
                this.zza = this;
                this.zzb = uri;
            }

            @Override // com.google.android.gms.internal.ads.x02
            public final Object apply(Object obj) {
                return zzp.zzq(this.zzb, (String) obj);
            }
        }, this.zzk);
    }

    final /* synthetic */ Uri zzm(Uri uri, b bVar) throws Exception {
        try {
            uri = this.zzh.e(uri, this.zzg, (View) d.Y(bVar), null);
        } catch (jp2 e2) {
            er.zzj("", e2);
        }
        if (uri.getQueryParameter("ms") != null) {
            return uri;
        }
        throw new Exception("Failed to append spam signals to click url.");
    }

    final /* synthetic */ g52 zzn(final ArrayList arrayList) {
        return y42.i(zzt("google.afma.nativeAds.getPublisherCustomRenderedImpressionSignals"), new x02(this, arrayList) { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzg
            private final zzp zza;
            private final List zzb;

            {
                this.zza = this;
                this.zzb = arrayList;
            }

            @Override // com.google.android.gms.internal.ads.x02
            public final Object apply(Object obj) {
                return zzp.zzr(this.zzb, (String) obj);
            }
        }, this.zzk);
    }

    final /* synthetic */ ArrayList zzo(List list, b bVar) throws Exception {
        String strZzk = this.zzh.b() != null ? this.zzh.b().zzk(this.zzg, (View) d.Y(bVar), null) : "";
        if (TextUtils.isEmpty(strZzk)) {
            throw new Exception("Failed to get view signals.");
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Uri uri = (Uri) it.next();
            if (zzc(uri)) {
                arrayList.add(zzv(uri, "ms", strZzk));
            } else {
                String strValueOf = String.valueOf(uri);
                StringBuilder sb = new StringBuilder(strValueOf.length() + 18);
                sb.append("Not a Google URL: ");
                sb.append(strValueOf);
                er.zzi(sb.toString());
                arrayList.add(uri);
            }
        }
        if (arrayList.isEmpty()) {
            throw new Exception("Empty impression URLs result.");
        }
        return arrayList;
    }
}