package c.h.h;

import ch.qos.logback.core.CoreConstants;
import java.util.HashSet;
import java.util.Locale;

/* compiled from: LocaleListCompatWrapper.java */
/* loaded from: classes.dex */
final class d implements e {
    private static final Locale[] a = new Locale[0];

    /* renamed from: b, reason: collision with root package name */
    private static final Locale f3021b = new Locale("en", "XA");

    /* renamed from: c, reason: collision with root package name */
    private static final Locale f3022c = new Locale("ar", "XB");

    /* renamed from: d, reason: collision with root package name */
    private static final Locale f3023d = c.b("en-Latn");

    /* renamed from: e, reason: collision with root package name */
    private final Locale[] f3024e;

    /* renamed from: f, reason: collision with root package name */
    private final String f3025f;

    d(Locale... localeArr) {
        if (localeArr.length == 0) {
            this.f3024e = a;
            this.f3025f = "";
            return;
        }
        Locale[] localeArr2 = new Locale[localeArr.length];
        HashSet hashSet = new HashSet();
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < localeArr.length; i2++) {
            Locale locale = localeArr[i2];
            if (locale == null) {
                throw new NullPointerException("list[" + i2 + "] is null");
            }
            if (hashSet.contains(locale)) {
                throw new IllegalArgumentException("list[" + i2 + "] is a repetition");
            }
            Locale locale2 = (Locale) locale.clone();
            localeArr2[i2] = locale2;
            b(sb, locale2);
            if (i2 < localeArr.length - 1) {
                sb.append(CoreConstants.COMMA_CHAR);
            }
            hashSet.add(locale2);
        }
        this.f3024e = localeArr2;
        this.f3025f = sb.toString();
    }

    static void b(StringBuilder sb, Locale locale) {
        sb.append(locale.getLanguage());
        String country = locale.getCountry();
        if (country == null || country.isEmpty()) {
            return;
        }
        sb.append(CoreConstants.DASH_CHAR);
        sb.append(locale.getCountry());
    }

    @Override // c.h.h.e
    public Object a() {
        return null;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        Locale[] localeArr = ((d) obj).f3024e;
        if (this.f3024e.length != localeArr.length) {
            return false;
        }
        int i2 = 0;
        while (true) {
            Locale[] localeArr2 = this.f3024e;
            if (i2 >= localeArr2.length) {
                return true;
            }
            if (!localeArr2[i2].equals(localeArr[i2])) {
                return false;
            }
            i2++;
        }
    }

    @Override // c.h.h.e
    public Locale get(int i2) {
        if (i2 >= 0) {
            Locale[] localeArr = this.f3024e;
            if (i2 < localeArr.length) {
                return localeArr[i2];
            }
        }
        return null;
    }

    public int hashCode() {
        int iHashCode = 1;
        int i2 = 0;
        while (true) {
            Locale[] localeArr = this.f3024e;
            if (i2 >= localeArr.length) {
                return iHashCode;
            }
            iHashCode = (iHashCode * 31) + localeArr[i2].hashCode();
            i2++;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        int i2 = 0;
        while (true) {
            Locale[] localeArr = this.f3024e;
            if (i2 >= localeArr.length) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(localeArr[i2]);
            if (i2 < this.f3024e.length - 1) {
                sb.append(CoreConstants.COMMA_CHAR);
            }
            i2++;
        }
    }
}