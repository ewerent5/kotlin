package e.c.d.y.n;

import e.c.d.t;
import e.c.d.v;
import e.c.d.w;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* compiled from: DateTypeAdapter.java */
/* loaded from: classes.dex */
public final class c extends v<Date> {
    public static final w a = new a();

    /* renamed from: b, reason: collision with root package name */
    private final List<DateFormat> f15512b;

    /* compiled from: DateTypeAdapter.java */
    class a implements w {
        a() {
        }

        @Override // e.c.d.w
        public <T> v<T> a(e.c.d.f fVar, e.c.d.z.a<T> aVar) {
            if (aVar.c() == Date.class) {
                return new c();
            }
            return null;
        }
    }

    public c() {
        ArrayList arrayList = new ArrayList();
        this.f15512b = arrayList;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(2, 2, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(2, 2));
        }
        if (e.c.d.y.e.e()) {
            arrayList.add(e.c.d.y.j.c(2, 2));
        }
    }

    private synchronized Date e(String str) {
        Iterator<DateFormat> it = this.f15512b.iterator();
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

    @Override // e.c.d.v
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public Date b(e.c.d.a0.a aVar) throws IOException {
        if (aVar.k0() != e.c.d.a0.b.NULL) {
            return e(aVar.h0());
        }
        aVar.a0();
        return null;
    }

    @Override // e.c.d.v
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public synchronized void d(e.c.d.a0.c cVar, Date date) {
        if (date == null) {
            cVar.C();
        } else {
            cVar.j0(this.f15512b.get(0).format(date));
        }
    }
}