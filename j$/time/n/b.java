package j$.time.n;

import ch.qos.logback.core.CoreConstants;
import j$.time.n.c;
import java.io.IOException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes2.dex */
public final class b {
    public static final b a;

    /* renamed from: b */
    private final c.C0202c f15935b;

    /* renamed from: c */
    private final Locale f15936c;

    /* renamed from: d */
    private final h f15937d;

    /* renamed from: e */
    private final j$.time.m.h f15938e;

    /* renamed from: f */
    private final j$.time.j f15939f;

    static {
        c cVar = new c();
        j$.time.o.h hVar = j$.time.o.h.YEAR;
        j jVar = j.EXCEEDS_PAD;
        c cVarL = cVar.l(hVar, 4, 10, jVar);
        cVarL.e(CoreConstants.DASH_CHAR);
        j$.time.o.h hVar2 = j$.time.o.h.MONTH_OF_YEAR;
        cVarL.k(hVar2, 2);
        cVarL.e(CoreConstants.DASH_CHAR);
        j$.time.o.h hVar3 = j$.time.o.h.DAY_OF_MONTH;
        cVarL.k(hVar3, 2);
        i iVar = i.STRICT;
        j$.time.m.i iVar2 = j$.time.m.i.a;
        b bVarS = cVarL.s(iVar, iVar2);
        c cVar2 = new c();
        cVar2.p();
        cVar2.a(bVarS);
        cVar2.h();
        cVar2.s(iVar, iVar2);
        c cVar3 = new c();
        cVar3.p();
        cVar3.a(bVarS);
        cVar3.o();
        cVar3.h();
        cVar3.s(iVar, iVar2);
        c cVar4 = new c();
        j$.time.o.h hVar4 = j$.time.o.h.HOUR_OF_DAY;
        cVar4.k(hVar4, 2);
        cVar4.e(CoreConstants.COLON_CHAR);
        j$.time.o.h hVar5 = j$.time.o.h.MINUTE_OF_HOUR;
        cVar4.k(hVar5, 2);
        cVar4.o();
        cVar4.e(CoreConstants.COLON_CHAR);
        j$.time.o.h hVar6 = j$.time.o.h.SECOND_OF_MINUTE;
        cVar4.k(hVar6, 2);
        cVar4.o();
        cVar4.b(j$.time.o.h.NANO_OF_SECOND, 0, 9, true);
        b bVarS2 = cVar4.s(iVar, null);
        c cVar5 = new c();
        cVar5.p();
        cVar5.a(bVarS2);
        cVar5.h();
        cVar5.s(iVar, null);
        c cVar6 = new c();
        cVar6.p();
        cVar6.a(bVarS2);
        cVar6.o();
        cVar6.h();
        cVar6.s(iVar, null);
        c cVar7 = new c();
        cVar7.p();
        cVar7.a(bVarS);
        cVar7.e('T');
        cVar7.a(bVarS2);
        b bVarS3 = cVar7.s(iVar, iVar2);
        c cVar8 = new c();
        cVar8.p();
        cVar8.a(bVarS3);
        cVar8.h();
        b bVarS4 = cVar8.s(iVar, iVar2);
        c cVar9 = new c();
        cVar9.a(bVarS4);
        cVar9.o();
        cVar9.e('[');
        cVar9.q();
        cVar9.m();
        cVar9.e(']');
        cVar9.s(iVar, iVar2);
        c cVar10 = new c();
        cVar10.a(bVarS3);
        cVar10.o();
        cVar10.h();
        cVar10.o();
        cVar10.e('[');
        cVar10.q();
        cVar10.m();
        cVar10.e(']');
        cVar10.s(iVar, iVar2);
        c cVar11 = new c();
        cVar11.p();
        c cVarL2 = cVar11.l(hVar, 4, 10, jVar);
        cVarL2.e(CoreConstants.DASH_CHAR);
        cVarL2.k(j$.time.o.h.DAY_OF_YEAR, 3);
        cVarL2.o();
        cVarL2.h();
        cVarL2.s(iVar, iVar2);
        c cVar12 = new c();
        cVar12.p();
        c cVarL3 = cVar12.l(j$.time.o.j.f15977c, 4, 10, jVar);
        cVarL3.f("-W");
        cVarL3.k(j$.time.o.j.f15976b, 2);
        cVarL3.e(CoreConstants.DASH_CHAR);
        j$.time.o.h hVar7 = j$.time.o.h.DAY_OF_WEEK;
        cVarL3.k(hVar7, 1);
        cVarL3.o();
        cVarL3.h();
        cVarL3.s(iVar, iVar2);
        c cVar13 = new c();
        cVar13.p();
        cVar13.c();
        a = cVar13.s(iVar, null);
        c cVar14 = new c();
        cVar14.p();
        cVar14.k(hVar, 4);
        cVar14.k(hVar2, 2);
        cVar14.k(hVar3, 2);
        cVar14.o();
        cVar14.g("+HHMMss", "Z");
        cVar14.s(iVar, iVar2);
        HashMap map = new HashMap();
        map.put(1L, "Mon");
        map.put(2L, "Tue");
        map.put(3L, "Wed");
        map.put(4L, "Thu");
        map.put(5L, "Fri");
        map.put(6L, "Sat");
        map.put(7L, "Sun");
        HashMap map2 = new HashMap();
        map2.put(1L, "Jan");
        map2.put(2L, "Feb");
        map2.put(3L, "Mar");
        map2.put(4L, "Apr");
        map2.put(5L, "May");
        map2.put(6L, "Jun");
        map2.put(7L, "Jul");
        map2.put(8L, "Aug");
        map2.put(9L, "Sep");
        map2.put(10L, "Oct");
        map2.put(11L, "Nov");
        map2.put(12L, "Dec");
        c cVar15 = new c();
        cVar15.p();
        cVar15.r();
        cVar15.o();
        cVar15.i(hVar7, map);
        cVar15.f(", ");
        cVar15.n();
        c cVarL4 = cVar15.l(hVar3, 1, 2, j.NOT_NEGATIVE);
        cVarL4.e(' ');
        cVarL4.i(hVar2, map2);
        cVarL4.e(' ');
        cVarL4.k(hVar, 4);
        cVarL4.e(' ');
        cVarL4.k(hVar4, 2);
        cVarL4.e(CoreConstants.COLON_CHAR);
        cVarL4.k(hVar5, 2);
        cVarL4.o();
        cVarL4.e(CoreConstants.COLON_CHAR);
        cVarL4.k(hVar6, 2);
        cVarL4.n();
        cVarL4.e(' ');
        cVarL4.g("+HHMM", "GMT");
        cVarL4.s(i.SMART, iVar2);
    }

    b(c.C0202c c0202c, Locale locale, h hVar, i iVar, Set set, j$.time.m.h hVar2, j$.time.j jVar) {
        this.f15935b = c0202c;
        this.f15936c = locale;
        this.f15937d = hVar;
        Objects.requireNonNull(iVar, "resolverStyle");
        this.f15938e = hVar2;
        this.f15939f = null;
    }

    public String a(j$.time.o.k kVar) {
        StringBuilder sb = new StringBuilder(32);
        try {
            this.f15935b.h(new f(kVar, this), sb);
            return sb.toString();
        } catch (IOException e2) {
            throw new j$.time.c(e2.getMessage(), e2);
        }
    }

    public j$.time.m.h b() {
        return this.f15938e;
    }

    public h c() {
        return this.f15937d;
    }

    public Locale d() {
        return this.f15936c;
    }

    public j$.time.j e() {
        return this.f15939f;
    }

    c.C0202c f(boolean z) {
        return this.f15935b.a(z);
    }

    public String toString() {
        String string = this.f15935b.toString();
        return string.startsWith("[") ? string : string.substring(1, string.length() - 1);
    }
}