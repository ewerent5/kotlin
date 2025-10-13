package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.SystemClock;
import android.view.View;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.ads.internal.overlay.zzu;
import com.google.android.gms.ads.internal.util.zzbh;
import com.google.android.gms.ads.internal.util.zzr;
import com.google.android.gms.ads.internal.zzb;
import com.google.android.gms.ads.internal.zzs;
import com.google.android.gms.internal.ads.c93;
import com.google.android.gms.internal.ads.cx;
import com.google.android.gms.internal.ads.ew;
import com.google.android.gms.internal.ads.hx;
import com.google.android.gms.internal.ads.lx;
import com.google.android.gms.internal.ads.ox;
import com.google.android.gms.internal.ads.qx;
import com.google.android.gms.internal.ads.uv;
import com.google.android.gms.internal.ads.vc;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class na<T extends c93 & uv & ew & vc & cx & hx & lx & ox & qx> implements ba<T> {
    private final zzb a;

    /* renamed from: b, reason: collision with root package name */
    private final nu0 f7682b;

    /* renamed from: c, reason: collision with root package name */
    private final cu1 f7683c;

    /* renamed from: e, reason: collision with root package name */
    private final pi f7685e;

    /* renamed from: f, reason: collision with root package name */
    private final x21 f7686f;

    /* renamed from: g, reason: collision with root package name */
    private zzu f7687g = null;

    /* renamed from: d, reason: collision with root package name */
    private final jr f7684d = new jr(null);

    public na(zzb zzbVar, pi piVar, x21 x21Var, nu0 nu0Var, cu1 cu1Var) {
        this.a = zzbVar;
        this.f7685e = piVar;
        this.f7686f = x21Var;
        this.f7682b = nu0Var;
        this.f7683c = cu1Var;
    }

    public static boolean c(Map<String, String> map) {
        return "1".equals(map.get("custom_close"));
    }

    public static int d(Map<String, String> map) {
        String str = map.get("o");
        if (str == null) {
            return -1;
        }
        if ("p".equalsIgnoreCase(str)) {
            return 7;
        }
        if ("l".equalsIgnoreCase(str)) {
            return 6;
        }
        if ("c".equalsIgnoreCase(str)) {
            return zzs.zze().zzh();
        }
        return -1;
    }

    static Uri e(Context context, ip2 ip2Var, Uri uri, View view, Activity activity) {
        if (ip2Var == null) {
            return uri;
        }
        try {
            return ip2Var.f(uri) ? ip2Var.e(uri, context, view, activity) : uri;
        } catch (jp2 unused) {
            return uri;
        } catch (Exception e2) {
            zzs.zzg().g(e2, "OpenGmsgHandler.maybeAddClickSignalsToUri");
            return uri;
        }
    }

    static Uri f(Uri uri) {
        try {
            if (uri.getQueryParameter("aclk_ms") != null) {
                return uri.buildUpon().appendQueryParameter("aclk_upms", String.valueOf(SystemClock.uptimeMillis())).build();
            }
        } catch (UnsupportedOperationException e2) {
            String strValueOf = String.valueOf(uri.toString());
            er.zzg(strValueOf.length() != 0 ? "Error adding click uptime parameter to url: ".concat(strValueOf) : new String("Error adding click uptime parameter to url: "), e2);
        }
        return uri;
    }

    private final boolean h(T t, Context context, String str, String str2) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        zzs.zzc();
        boolean zZzH = zzr.zzH(context);
        zzs.zzc();
        zzbh zzbhVarZzC = zzr.zzC(context);
        nu0 nu0Var = this.f7682b;
        if (nu0Var != null) {
            f31.K4(context, nu0Var, this.f7683c, this.f7686f, str2, "offline_open");
        }
        T t2 = t;
        boolean z = t2.e().g() && t2.zzj() == null;
        if (zZzH) {
            this.f7686f.d(this.f7684d, str2);
            return false;
        }
        zzs.zzc();
        if (androidx.core.app.l.b(context).a() && zzbhVarZzC != null && !z) {
            if (((Boolean) c.c().b(w3.A5)).booleanValue()) {
                if (t2.e().g()) {
                    f31.J4(t2.zzj(), null, zzbhVarZzC, this.f7686f, this.f7682b, this.f7683c, str2, str);
                } else {
                    t.q0(zzbhVarZzC, this.f7686f, this.f7682b, this.f7683c, str2, str, zzs.zze().zzh());
                }
                nu0 nu0Var2 = this.f7682b;
                if (nu0Var2 != null) {
                    f31.K4(context, nu0Var2, this.f7683c, this.f7686f, str2, "dialog_impression");
                }
                t.onAdClicked();
                return true;
            }
        }
        this.f7686f.g(str2);
        if (this.f7682b != null) {
            HashMap map = new HashMap();
            zzs.zzc();
            if (!androidx.core.app.l.b(context).a()) {
                map.put("dialog_not_shown_reason", "notifications_disabled");
            } else if (zzbhVarZzC == null) {
                map.put("dialog_not_shown_reason", "work_manager_unavailable");
            } else {
                if (!((Boolean) c.c().b(w3.A5)).booleanValue()) {
                    map.put("dialog_not_shown_reason", "notification_flow_disabled");
                } else if (z) {
                    map.put("dialog_not_shown_reason", "fullscreen_no_activity");
                }
            }
            f31.L4(context, this.f7682b, this.f7683c, this.f7686f, str2, "dialog_not_shown", map);
        }
        return false;
    }

    private final void i(T t, Intent intent) {
        try {
            t.c(new zzc(intent, this.f7687g));
        } catch (ActivityNotFoundException e2) {
            er.zzi(e2.getMessage());
        }
    }

    private final void j(boolean z) {
        pi piVar = this.f7685e;
        if (piVar != null) {
            piVar.i(z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k(int i2) {
        if (this.f7682b == null) {
            return;
        }
        if (((Boolean) c.c().b(w3.I5)).booleanValue()) {
            cu1 cu1Var = this.f7683c;
            bu1 bu1VarA = bu1.a("cct_action");
            bu1VarA.c("cct_open_status", u4.a(i2));
            cu1Var.b(bu1VarA);
            return;
        }
        mu0 mu0VarA = this.f7682b.a();
        mu0VarA.c("action", "cct_action");
        mu0VarA.c("cct_open_status", u4.a(i2));
        mu0VarA.d();
    }

    /* JADX WARN: Code restructure failed: missing block: B:113:0x02e2, code lost:
    
        r12 = r16;
     */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x03fc  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0423  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x042b  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0436  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x046f  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0296  */
    @Override // com.google.android.gms.internal.ads.ba
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(T r23, java.util.Map<java.lang.String, java.lang.String> r24) throws java.net.URISyntaxException {
        /*
            Method dump skipped, instructions count: 1284
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.na.a(com.google.android.gms.internal.ads.c93, java.util.Map):void");
    }
}