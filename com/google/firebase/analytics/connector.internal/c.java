package com.google.firebase.analytics.connector.internal;

import android.os.Bundle;
import ch.qos.logback.core.joran.action.Action;
import com.google.android.gms.common.internal.p;
import com.google.android.gms.measurement.internal.b6;
import com.google.android.gms.measurement.internal.d6;
import com.google.android.gms.measurement.internal.n7;
import com.google.android.gms.measurement.internal.y5;
import com.google.firebase.analytics.a.a;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-measurement-api@@18.0.0 */
/* loaded from: classes.dex */
public final class c {
    private static final Set<String> a = new HashSet(Arrays.asList("_in", "_xa", "_xu", "_aq", "_aa", "_ai", "_ac", "campaign_details", "_ug", "_iapx", "_exp_set", "_exp_clear", "_exp_activate", "_exp_timeout", "_exp_expire"));

    /* renamed from: b, reason: collision with root package name */
    private static final List<String> f12253b = Arrays.asList("_e", "_f", "_iap", "_s", "_au", "_ui", "_cd");

    /* renamed from: c, reason: collision with root package name */
    private static final List<String> f12254c = Arrays.asList("auto", "app", "am");

    /* renamed from: d, reason: collision with root package name */
    private static final List<String> f12255d = Arrays.asList("_r", "_dbg");

    /* renamed from: e, reason: collision with root package name */
    private static final List<String> f12256e = Arrays.asList((String[]) com.google.android.gms.common.util.b.a(d6.a, d6.f10810b));

    /* renamed from: f, reason: collision with root package name */
    private static final List<String> f12257f = Arrays.asList("^_ltv_[A-Z]{3}$", "^_cc[1-5]{1}$");

    public static a.c a(Bundle bundle) {
        p.j(bundle);
        a.c cVar = new a.c();
        cVar.a = (String) y5.a(bundle, "origin", String.class, null);
        cVar.f12234b = (String) y5.a(bundle, Action.NAME_ATTRIBUTE, String.class, null);
        cVar.f12235c = y5.a(bundle, "value", Object.class, null);
        cVar.f12236d = (String) y5.a(bundle, "trigger_event_name", String.class, null);
        cVar.f12237e = ((Long) y5.a(bundle, "trigger_timeout", Long.class, 0L)).longValue();
        cVar.f12238f = (String) y5.a(bundle, "timed_out_event_name", String.class, null);
        cVar.f12239g = (Bundle) y5.a(bundle, "timed_out_event_params", Bundle.class, null);
        cVar.f12240h = (String) y5.a(bundle, "triggered_event_name", String.class, null);
        cVar.f12241i = (Bundle) y5.a(bundle, "triggered_event_params", Bundle.class, null);
        cVar.f12242j = ((Long) y5.a(bundle, "time_to_live", Long.class, 0L)).longValue();
        cVar.f12243k = (String) y5.a(bundle, "expired_event_name", String.class, null);
        cVar.f12244l = (Bundle) y5.a(bundle, "expired_event_params", Bundle.class, null);
        cVar.n = ((Boolean) y5.a(bundle, "active", Boolean.class, Boolean.FALSE)).booleanValue();
        cVar.f12245m = ((Long) y5.a(bundle, "creation_timestamp", Long.class, 0L)).longValue();
        cVar.o = ((Long) y5.a(bundle, "triggered_timestamp", Long.class, 0L)).longValue();
        return cVar;
    }

    public static boolean b(a.c cVar) {
        String str;
        if (cVar == null || (str = cVar.a) == null || str.isEmpty()) {
            return false;
        }
        Object obj = cVar.f12235c;
        if ((obj != null && n7.a(obj) == null) || !c(str) || !e(str, cVar.f12234b)) {
            return false;
        }
        String str2 = cVar.f12243k;
        if (str2 != null && (!d(str2, cVar.f12244l) || !f(str, cVar.f12243k, cVar.f12244l))) {
            return false;
        }
        String str3 = cVar.f12240h;
        if (str3 != null && (!d(str3, cVar.f12241i) || !f(str, cVar.f12240h, cVar.f12241i))) {
            return false;
        }
        String str4 = cVar.f12238f;
        if (str4 != null) {
            return d(str4, cVar.f12239g) && f(str, cVar.f12238f, cVar.f12239g);
        }
        return true;
    }

    public static boolean c(String str) {
        return !f12254c.contains(str);
    }

    public static boolean d(String str, Bundle bundle) {
        if (f12253b.contains(str)) {
            return false;
        }
        if (bundle == null) {
            return true;
        }
        Iterator<String> it = f12255d.iterator();
        while (it.hasNext()) {
            if (bundle.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    public static boolean e(String str, String str2) {
        if ("_ce1".equals(str2) || "_ce2".equals(str2)) {
            return str.equals("fcm") || str.equals("frc");
        }
        if ("_ln".equals(str2)) {
            return str.equals("fcm") || str.equals("fiam");
        }
        if (f12256e.contains(str2)) {
            return false;
        }
        Iterator<String> it = f12257f.iterator();
        while (it.hasNext()) {
            if (str2.matches(it.next())) {
                return false;
            }
        }
        return true;
    }

    public static boolean f(String str, String str2, Bundle bundle) {
        if (!"_cmp".equals(str2)) {
            return true;
        }
        if (!c(str) || bundle == null) {
            return false;
        }
        Iterator<String> it = f12255d.iterator();
        while (it.hasNext()) {
            if (bundle.containsKey(it.next())) {
                return false;
            }
        }
        str.hashCode();
        switch (str) {
            case "fcm":
                bundle.putString("_cis", "fcm_integration");
                return true;
            case "fdl":
                bundle.putString("_cis", "fdl_integration");
                return true;
            case "fiam":
                bundle.putString("_cis", "fiam_integration");
                return true;
            default:
                return false;
        }
    }

    public static Bundle g(a.c cVar) {
        Bundle bundle = new Bundle();
        String str = cVar.a;
        if (str != null) {
            bundle.putString("origin", str);
        }
        String str2 = cVar.f12234b;
        if (str2 != null) {
            bundle.putString(Action.NAME_ATTRIBUTE, str2);
        }
        Object obj = cVar.f12235c;
        if (obj != null) {
            y5.b(bundle, obj);
        }
        String str3 = cVar.f12236d;
        if (str3 != null) {
            bundle.putString("trigger_event_name", str3);
        }
        bundle.putLong("trigger_timeout", cVar.f12237e);
        String str4 = cVar.f12238f;
        if (str4 != null) {
            bundle.putString("timed_out_event_name", str4);
        }
        Bundle bundle2 = cVar.f12239g;
        if (bundle2 != null) {
            bundle.putBundle("timed_out_event_params", bundle2);
        }
        String str5 = cVar.f12240h;
        if (str5 != null) {
            bundle.putString("triggered_event_name", str5);
        }
        Bundle bundle3 = cVar.f12241i;
        if (bundle3 != null) {
            bundle.putBundle("triggered_event_params", bundle3);
        }
        bundle.putLong("time_to_live", cVar.f12242j);
        String str6 = cVar.f12243k;
        if (str6 != null) {
            bundle.putString("expired_event_name", str6);
        }
        Bundle bundle4 = cVar.f12244l;
        if (bundle4 != null) {
            bundle.putBundle("expired_event_params", bundle4);
        }
        bundle.putLong("creation_timestamp", cVar.f12245m);
        bundle.putBoolean("active", cVar.n);
        bundle.putLong("triggered_timestamp", cVar.o);
        return bundle;
    }

    public static void h(String str, String str2, Bundle bundle) {
        if ("clx".equals(str) && "_ae".equals(str2)) {
            bundle.putLong("_r", 1L);
        }
    }

    public static boolean i(String str) {
        return !a.contains(str);
    }

    public static String j(String str) {
        String strA = b6.a(str);
        return strA != null ? strA : str;
    }
}