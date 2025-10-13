package j$.time.m;

import j$.time.Instant;
import j$.time.ZonedDateTime;
import j$.time.j;
import j$.time.o.k;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final class i extends a implements Serializable {
    public static final i a = new i();

    private i() {
    }

    @Override // j$.time.m.h
    public String g() {
        return "ISO";
    }

    public boolean h(long j2) {
        return (3 & j2) == 0 && (j2 % 100 != 0 || j2 % 400 == 0);
    }

    @Override // j$.time.m.h
    public b i(k kVar) {
        return j$.time.e.v(kVar);
    }

    @Override // j$.time.m.a, j$.time.m.h
    public c o(k kVar) {
        return j$.time.f.v(kVar);
    }

    @Override // j$.time.m.a, j$.time.m.h
    public f r(Instant instant, j jVar) {
        return ZonedDateTime.t(instant, jVar);
    }
}