package c.h.h;

import android.os.LocaleList;
import java.util.Locale;

/* compiled from: LocaleListPlatformWrapper.java */
/* loaded from: classes.dex */
final class f implements e {
    private final LocaleList a;

    f(LocaleList localeList) {
        this.a = localeList;
    }

    @Override // c.h.h.e
    public Object a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        return this.a.equals(((e) obj).a());
    }

    @Override // c.h.h.e
    public Locale get(int i2) {
        return this.a.get(i2);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return this.a.toString();
    }
}