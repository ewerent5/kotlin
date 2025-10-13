package i;

import ch.qos.logback.core.CoreConstants;
import java.io.Serializable;

/* compiled from: Tuples.kt */
/* loaded from: classes3.dex */
public final class l<A, B> implements Serializable {

    /* renamed from: e, reason: collision with root package name */
    private final A f15823e;

    /* renamed from: f, reason: collision with root package name */
    private final B f15824f;

    public l(A a, B b2) {
        this.f15823e = a;
        this.f15824f = b2;
    }

    public final A a() {
        return this.f15823e;
    }

    public final B b() {
        return this.f15824f;
    }

    public final A c() {
        return this.f15823e;
    }

    public final B d() {
        return this.f15824f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return i.y.d.l.a(this.f15823e, lVar.f15823e) && i.y.d.l.a(this.f15824f, lVar.f15824f);
    }

    public int hashCode() {
        A a = this.f15823e;
        int iHashCode = (a != null ? a.hashCode() : 0) * 31;
        B b2 = this.f15824f;
        return iHashCode + (b2 != null ? b2.hashCode() : 0);
    }

    public String toString() {
        return CoreConstants.LEFT_PARENTHESIS_CHAR + this.f15823e + ", " + this.f15824f + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}