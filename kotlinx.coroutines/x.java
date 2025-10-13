package kotlinx.coroutines;

/* compiled from: CompletionState.kt */
/* loaded from: classes3.dex */
public final class x {
    public final Object a;

    /* renamed from: b, reason: collision with root package name */
    public final i.y.c.l<Throwable, i.s> f17177b;

    /* JADX WARN: Multi-variable type inference failed */
    public x(Object obj, i.y.c.l<? super Throwable, i.s> lVar) {
        this.a = obj;
        this.f17177b = lVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return i.y.d.l.a(this.a, xVar.a) && i.y.d.l.a(this.f17177b, xVar.f17177b);
    }

    public int hashCode() {
        Object obj = this.a;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * 31;
        i.y.c.l<Throwable, i.s> lVar = this.f17177b;
        return iHashCode + (lVar != null ? lVar.hashCode() : 0);
    }

    public String toString() {
        return "CompletedWithCancellation(result=" + this.a + ", onCancellation=" + this.f17177b + ")";
    }
}