package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import ch.qos.logback.core.CoreConstants;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* loaded from: classes.dex */
public final class d {
    public static final d a = new d(null, null);

    /* renamed from: b, reason: collision with root package name */
    private final Boolean f10799b;

    /* renamed from: c, reason: collision with root package name */
    private final Boolean f10800c;

    public d(Boolean bool, Boolean bool2) {
        this.f10799b = bool;
        this.f10800c = bool2;
    }

    private static int a(Boolean bool) {
        if (bool == null) {
            return 0;
        }
        return bool.booleanValue() ? 1 : 2;
    }

    public static d b(String str) {
        Boolean boolC;
        if (str != null) {
            Boolean boolC2 = str.length() >= 3 ? c(str.charAt(2)) : null;
            boolC = str.length() >= 4 ? c(str.charAt(3)) : null;
            bool = boolC2;
        } else {
            boolC = null;
        }
        return new d(bool, boolC);
    }

    private static Boolean c(char c2) {
        if (c2 == '0') {
            return Boolean.FALSE;
        }
        if (c2 != '1') {
            return null;
        }
        return Boolean.TRUE;
    }

    private static Boolean d(Boolean bool, Boolean bool2) {
        if (bool == null) {
            return bool2;
        }
        if (bool2 == null) {
            return bool;
        }
        return Boolean.valueOf(bool.booleanValue() && bool2.booleanValue());
    }

    public static String f(Bundle bundle) {
        String string = bundle.getString("ad_storage");
        if (string != null && m(string) == null) {
            return string;
        }
        String string2 = bundle.getString("analytics_storage");
        if (string2 == null || m(string2) != null) {
            return null;
        }
        return string2;
    }

    public static boolean g(int i2, int i3) {
        return i2 <= i3;
    }

    private static char i(Boolean bool) {
        return bool == null ? CoreConstants.DASH_CHAR : bool.booleanValue() ? '1' : '0';
    }

    public static d j(Bundle bundle) {
        return bundle == null ? a : new d(m(bundle.getString("ad_storage")), m(bundle.getString("analytics_storage")));
    }

    private static Boolean m(String str) {
        if (str == null) {
            return null;
        }
        if (str.equals("granted")) {
            return Boolean.TRUE;
        }
        if (str.equals("denied")) {
            return Boolean.FALSE;
        }
        return null;
    }

    public final String e() {
        return "G1" + i(this.f10799b) + i(this.f10800c);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return a(this.f10799b) == a(dVar.f10799b) && a(this.f10800c) == a(dVar.f10800c);
    }

    public final boolean h(d dVar) {
        Boolean bool = this.f10799b;
        Boolean bool2 = Boolean.FALSE;
        if (bool != bool2 || dVar.f10799b == bool2) {
            return this.f10800c == bool2 && dVar.f10800c != bool2;
        }
        return true;
    }

    public final int hashCode() {
        return ((a(this.f10799b) + 527) * 31) + a(this.f10800c);
    }

    public final d k(d dVar) {
        return new d(d(this.f10799b, dVar.f10799b), d(this.f10800c, dVar.f10800c));
    }

    public final Boolean l() {
        return this.f10799b;
    }

    public final d n(d dVar) {
        Boolean bool = this.f10799b;
        if (bool == null) {
            bool = dVar.f10799b;
        }
        Boolean bool2 = this.f10800c;
        if (bool2 == null) {
            bool2 = dVar.f10800c;
        }
        return new d(bool, bool2);
    }

    public final boolean o() {
        Boolean bool = this.f10799b;
        return bool == null || bool.booleanValue();
    }

    public final Boolean p() {
        return this.f10800c;
    }

    public final boolean q() {
        Boolean bool = this.f10800c;
        return bool == null || bool.booleanValue();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ConsentSettings: ");
        sb.append("adStorage=");
        Boolean bool = this.f10799b;
        if (bool == null) {
            sb.append("uninitialized");
        } else {
            sb.append(bool.booleanValue() ? "granted" : "denied");
        }
        sb.append(", analyticsStorage=");
        Boolean bool2 = this.f10800c;
        if (bool2 == null) {
            sb.append("uninitialized");
        } else {
            sb.append(bool2.booleanValue() ? "granted" : "denied");
        }
        return sb.toString();
    }
}