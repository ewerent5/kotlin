package e.c.d;

import ch.qos.logback.core.CoreConstants;
import java.io.IOException;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* compiled from: DefaultDateTypeAdapter.java */
/* loaded from: classes.dex */
final class a extends v<Date> {
    private final Class<? extends Date> a;

    /* renamed from: b, reason: collision with root package name */
    private final List<DateFormat> f15390b;

    a(Class<? extends Date> cls, String str) {
        ArrayList arrayList = new ArrayList();
        this.f15390b = arrayList;
        this.a = g(cls);
        Locale locale = Locale.US;
        arrayList.add(new SimpleDateFormat(str, locale));
        if (Locale.getDefault().equals(locale)) {
            return;
        }
        arrayList.add(new SimpleDateFormat(str));
    }

    private Date e(String str) {
        synchronized (this.f15390b) {
            Iterator<DateFormat> it = this.f15390b.iterator();
            while (it.hasNext()) {
                try {
                    return it.next().parse(str);
                } catch (ParseException unused) {
                }
            }
            try {
                return e.c.d.y.n.o.a.c(str, new ParsePosition(0));
            } catch (ParseException e2) {
                throw new t(str, e2);
            }
        }
    }

    private static Class<? extends Date> g(Class<? extends Date> cls) {
        if (cls == Date.class || cls == java.sql.Date.class || cls == Timestamp.class) {
            return cls;
        }
        throw new IllegalArgumentException("Date type must be one of " + Date.class + ", " + Timestamp.class + ", or " + java.sql.Date.class + " but was " + cls);
    }

    @Override // e.c.d.v
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public Date b(e.c.d.a0.a aVar) throws IOException {
        if (aVar.k0() == e.c.d.a0.b.NULL) {
            aVar.a0();
            return null;
        }
        Date dateE = e(aVar.h0());
        Class<? extends Date> cls = this.a;
        if (cls == Date.class) {
            return dateE;
        }
        if (cls == Timestamp.class) {
            return new Timestamp(dateE.getTime());
        }
        if (cls == java.sql.Date.class) {
            return new java.sql.Date(dateE.getTime());
        }
        throw new AssertionError();
    }

    @Override // e.c.d.v
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public void d(e.c.d.a0.c cVar, Date date) throws IOException {
        if (date == null) {
            cVar.C();
            return;
        }
        synchronized (this.f15390b) {
            cVar.j0(this.f15390b.get(0).format(date));
        }
    }

    public String toString() {
        DateFormat dateFormat = this.f15390b.get(0);
        if (dateFormat instanceof SimpleDateFormat) {
            return "DefaultDateTypeAdapter(" + ((SimpleDateFormat) dateFormat).toPattern() + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
        return "DefaultDateTypeAdapter(" + dateFormat.getClass().getSimpleName() + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public a(Class<? extends Date> cls, int i2, int i3) {
        ArrayList arrayList = new ArrayList();
        this.f15390b = arrayList;
        this.a = g(cls);
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(i2, i3, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(i2, i3));
        }
        if (e.c.d.y.e.e()) {
            arrayList.add(e.c.d.y.j.c(i2, i3));
        }
    }
}