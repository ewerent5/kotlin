package e.c.d.y.n;

import e.c.d.t;
import e.c.d.v;
import e.c.d.w;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/* compiled from: SqlDateTypeAdapter.java */
/* loaded from: classes.dex */
public final class j extends v<Date> {
    public static final w a = new a();

    /* renamed from: b, reason: collision with root package name */
    private final DateFormat f15535b = new SimpleDateFormat("MMM d, yyyy");

    /* compiled from: SqlDateTypeAdapter.java */
    class a implements w {
        a() {
        }

        @Override // e.c.d.w
        public <T> v<T> a(e.c.d.f fVar, e.c.d.z.a<T> aVar) {
            if (aVar.c() == Date.class) {
                return new j();
            }
            return null;
        }
    }

    @Override // e.c.d.v
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public synchronized Date b(e.c.d.a0.a aVar) {
        if (aVar.k0() == e.c.d.a0.b.NULL) {
            aVar.a0();
            return null;
        }
        try {
            return new Date(this.f15535b.parse(aVar.h0()).getTime());
        } catch (ParseException e2) {
            throw new t(e2);
        }
    }

    @Override // e.c.d.v
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public synchronized void d(e.c.d.a0.c cVar, Date date) {
        cVar.j0(date == null ? null : this.f15535b.format((java.util.Date) date));
    }
}