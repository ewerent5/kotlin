package kotlinx.coroutines;

/* compiled from: CancellableContinuationImpl.kt */
/* loaded from: classes3.dex */
final class v {
    public final Object a;

    /* renamed from: b, reason: collision with root package name */
    public final i f17155b;

    /* renamed from: c, reason: collision with root package name */
    public final i.y.c.l<Throwable, i.s> f17156c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f17157d;

    /* renamed from: e, reason: collision with root package name */
    public final Throwable f17158e;

    /* JADX WARN: Multi-variable type inference failed */
    public v(Object obj, i iVar, i.y.c.l<? super Throwable, i.s> lVar, Object obj2, Throwable th) {
        this.a = obj;
        this.f17155b = iVar;
        this.f17156c = lVar;
        this.f17157d = obj2;
        this.f17158e = th;
    }

    public static /* synthetic */ v b(v vVar, Object obj, i iVar, i.y.c.l lVar, Object obj2, Throwable th, int i2, Object obj3) {
        if ((i2 & 1) != 0) {
            obj = vVar.a;
        }
        if ((i2 & 2) != 0) {
            iVar = vVar.f17155b;
        }
        i iVar2 = iVar;
        if ((i2 & 4) != 0) {
            lVar = vVar.f17156c;
        }
        i.y.c.l lVar2 = lVar;
        if ((i2 & 8) != 0) {
            obj2 = vVar.f17157d;
        }
        Object obj4 = obj2;
        if ((i2 & 16) != 0) {
            th = vVar.f17158e;
        }
        return vVar.a(obj, iVar2, lVar2, obj4, th);
    }

    public final v a(Object obj, i iVar, i.y.c.l<? super Throwable, i.s> lVar, Object obj2, Throwable th) {
        return new v(obj, iVar, lVar, obj2, th);
    }

    public final boolean c() {
        return this.f17158e != null;
    }

    public final void d(l<?> lVar, Throwable th) {
        i iVar = this.f17155b;
        if (iVar != null) {
            lVar.s(iVar, th);
        }
        i.y.c.l<Throwable, i.s> lVar2 = this.f17156c;
        if (lVar2 != null) {
            lVar.t(lVar2, th);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return i.y.d.l.a(this.a, vVar.a) && i.y.d.l.a(this.f17155b, vVar.f17155b) && i.y.d.l.a(this.f17156c, vVar.f17156c) && i.y.d.l.a(this.f17157d, vVar.f17157d) && i.y.d.l.a(this.f17158e, vVar.f17158e);
    }

    public int hashCode() {
        Object obj = this.a;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * 31;
        i iVar = this.f17155b;
        int iHashCode2 = (iHashCode + (iVar != null ? iVar.hashCode() : 0)) * 31;
        i.y.c.l<Throwable, i.s> lVar = this.f17156c;
        int iHashCode3 = (iHashCode2 + (lVar != null ? lVar.hashCode() : 0)) * 31;
        Object obj2 = this.f17157d;
        int iHashCode4 = (iHashCode3 + (obj2 != null ? obj2.hashCode() : 0)) * 31;
        Throwable th = this.f17158e;
        return iHashCode4 + (th != null ? th.hashCode() : 0);
    }

    public String toString() {
        return "CompletedContinuation(result=" + this.a + ", cancelHandler=" + this.f17155b + ", onCancellation=" + this.f17156c + ", idempotentResume=" + this.f17157d + ", cancelCause=" + this.f17158e + ")";
    }

    public /* synthetic */ v(Object obj, i iVar, i.y.c.l lVar, Object obj2, Throwable th, int i2, i.y.d.g gVar) {
        this(obj, (i2 & 2) != 0 ? null : iVar, (i2 & 4) != 0 ? null : lVar, (i2 & 8) != 0 ? null : obj2, (i2 & 16) != 0 ? null : th);
    }
}