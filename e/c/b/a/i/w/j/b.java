package e.c.b.a.i.w.j;

import java.util.Objects;

/* compiled from: AutoValue_PersistedEvent.java */
/* loaded from: classes.dex */
final class b extends i {
    private final long a;

    /* renamed from: b, reason: collision with root package name */
    private final e.c.b.a.i.m f14308b;

    /* renamed from: c, reason: collision with root package name */
    private final e.c.b.a.i.h f14309c;

    b(long j2, e.c.b.a.i.m mVar, e.c.b.a.i.h hVar) {
        this.a = j2;
        Objects.requireNonNull(mVar, "Null transportContext");
        this.f14308b = mVar;
        Objects.requireNonNull(hVar, "Null event");
        this.f14309c = hVar;
    }

    @Override // e.c.b.a.i.w.j.i
    public e.c.b.a.i.h b() {
        return this.f14309c;
    }

    @Override // e.c.b.a.i.w.j.i
    public long c() {
        return this.a;
    }

    @Override // e.c.b.a.i.w.j.i
    public e.c.b.a.i.m d() {
        return this.f14308b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.a == iVar.c() && this.f14308b.equals(iVar.d()) && this.f14309c.equals(iVar.b());
    }

    public int hashCode() {
        long j2 = this.a;
        return this.f14309c.hashCode() ^ ((((((int) (j2 ^ (j2 >>> 32))) ^ 1000003) * 1000003) ^ this.f14308b.hashCode()) * 1000003);
    }

    public String toString() {
        return "PersistedEvent{id=" + this.a + ", transportContext=" + this.f14308b + ", event=" + this.f14309c + "}";
    }
}