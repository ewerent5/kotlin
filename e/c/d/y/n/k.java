package e.c.d.y.n;

import e.c.d.t;
import e.c.d.v;
import e.c.d.w;
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/* compiled from: TimeTypeAdapter.java */
/* loaded from: classes.dex */
public final class k extends v<Time> {
    public static final w a = new a();

    /* renamed from: b, reason: collision with root package name */
    private final DateFormat f15536b = new SimpleDateFormat("hh:mm:ss a");

    /* compiled from: TimeTypeAdapter.java */
    class a implements w {
        a() {
        }

        @Override // e.c.d.w
        public <T> v<T> a(e.c.d.f fVar, e.c.d.z.a<T> aVar) {
            if (aVar.c() == Time.class) {
                return new k();
            }
            return null;
        }
    }

    @Override // e.c.d.v
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public synchronized Time b(e.c.d.a0.a aVar) {
        if (aVar.k0() == e.c.d.a0.b.NULL) {
            aVar.a0();
            return null;
        }
        try {
            return new Time(this.f15536b.parse(aVar.h0()).getTime());
        } catch (ParseException e2) {
            throw new t(e2);
        }
    }

    @Override // e.c.d.v
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public synchronized void d(e.c.d.a0.c cVar, Time time) {
        cVar.j0(time == null ? null : this.f15536b.format((Date) time));
    }
}