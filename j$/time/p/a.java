package j$.time.p;

import j$.time.Instant;
import j$.time.f;
import j$.time.k;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class a implements Comparable<a>, Serializable {
    private final f a;

    /* renamed from: b */
    private final k f15983b;

    /* renamed from: c */
    private final k f15984c;

    a(long j2, k kVar, k kVar2) {
        this.a = f.A(j2, 0, kVar);
        this.f15983b = kVar;
        this.f15984c = kVar2;
    }

    @Override // java.lang.Comparable
    public int compareTo(a aVar) {
        return h().t(aVar.h());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.a.equals(aVar.a) && this.f15983b.equals(aVar.f15983b) && this.f15984c.equals(aVar.f15984c);
    }

    public Instant h() {
        return Instant.z(this.a.B(this.f15983b), r0.b().x());
    }

    public int hashCode() {
        return (this.a.hashCode() ^ this.f15983b.hashCode()) ^ Integer.rotateLeft(this.f15984c.hashCode(), 16);
    }

    public k j() {
        return this.f15984c;
    }

    public k l() {
        return this.f15983b;
    }

    public String toString() {
        StringBuilder sbA = j$.T0.a.a.a.a.a("Transition[");
        sbA.append(this.f15984c.y() > this.f15983b.y() ? "Gap" : "Overlap");
        sbA.append(" at ");
        sbA.append(this.a);
        sbA.append(this.f15983b);
        sbA.append(" to ");
        sbA.append(this.f15984c);
        sbA.append(']');
        return sbA.toString();
    }

    public long u() {
        f fVar = this.a;
        k kVar = this.f15983b;
        Objects.requireNonNull(fVar);
        return j$.time.a.j(fVar, kVar);
    }
}