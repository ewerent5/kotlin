package c.h.h;

import android.os.Build;
import android.os.LocaleList;
import java.util.Locale;

/* compiled from: LocaleListCompat.java */
/* loaded from: classes.dex */
public final class c {
    private static final c a = a(new Locale[0]);

    /* renamed from: b, reason: collision with root package name */
    private e f3020b;

    private c(e eVar) {
        this.f3020b = eVar;
    }

    public static c a(Locale... localeArr) {
        return Build.VERSION.SDK_INT >= 24 ? d(new LocaleList(localeArr)) : new c(new d(localeArr));
    }

    static Locale b(String str) {
        if (str.contains("-")) {
            String[] strArrSplit = str.split("-", -1);
            if (strArrSplit.length > 2) {
                return new Locale(strArrSplit[0], strArrSplit[1], strArrSplit[2]);
            }
            if (strArrSplit.length > 1) {
                return new Locale(strArrSplit[0], strArrSplit[1]);
            }
            if (strArrSplit.length == 1) {
                return new Locale(strArrSplit[0]);
            }
        } else {
            if (!str.contains("_")) {
                return new Locale(str);
            }
            String[] strArrSplit2 = str.split("_", -1);
            if (strArrSplit2.length > 2) {
                return new Locale(strArrSplit2[0], strArrSplit2[1], strArrSplit2[2]);
            }
            if (strArrSplit2.length > 1) {
                return new Locale(strArrSplit2[0], strArrSplit2[1]);
            }
            if (strArrSplit2.length == 1) {
                return new Locale(strArrSplit2[0]);
            }
        }
        throw new IllegalArgumentException("Can not parse language tag: [" + str + "]");
    }

    public static c d(LocaleList localeList) {
        return new c(new f(localeList));
    }

    public Locale c(int i2) {
        return this.f3020b.get(i2);
    }

    public boolean equals(Object obj) {
        return (obj instanceof c) && this.f3020b.equals(((c) obj).f3020b);
    }

    public int hashCode() {
        return this.f3020b.hashCode();
    }

    public String toString() {
        return this.f3020b.toString();
    }
}