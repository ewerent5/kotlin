package i.v;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import i.v.g;
import i.y.c.p;
import i.y.d.l;
import i.y.d.m;
import java.io.Serializable;
import java.util.Objects;

/* compiled from: CoroutineContextImpl.kt */
/* loaded from: classes3.dex */
public final class c implements g, Serializable {

    /* renamed from: e, reason: collision with root package name */
    private final g f15847e;

    /* renamed from: f, reason: collision with root package name */
    private final g.b f15848f;

    /* compiled from: CoroutineContextImpl.kt */
    static final class a extends m implements p<String, g.b, String> {

        /* renamed from: e, reason: collision with root package name */
        public static final a f15849e = new a();

        a() {
            super(2);
        }

        @Override // i.y.c.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String i(String str, g.b bVar) {
            l.d(str, "acc");
            l.d(bVar, "element");
            if (str.length() == 0) {
                return bVar.toString();
            }
            return str + ", " + bVar;
        }
    }

    public c(g gVar, g.b bVar) {
        l.d(gVar, "left");
        l.d(bVar, "element");
        this.f15847e = gVar;
        this.f15848f = bVar;
    }

    private final boolean a(g.b bVar) {
        return l.a(get(bVar.getKey()), bVar);
    }

    private final boolean c(c cVar) {
        while (a(cVar.f15848f)) {
            g gVar = cVar.f15847e;
            if (!(gVar instanceof c)) {
                Objects.requireNonNull(gVar, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                return a((g.b) gVar);
            }
            cVar = (c) gVar;
        }
        return false;
    }

    private final int e() {
        int i2 = 2;
        c cVar = this;
        while (true) {
            g gVar = cVar.f15847e;
            if (!(gVar instanceof c)) {
                gVar = null;
            }
            cVar = (c) gVar;
            if (cVar == null) {
                return i2;
            }
            i2++;
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof c) {
                c cVar = (c) obj;
                if (cVar.e() != e() || !cVar.c(this)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // i.v.g
    public <R> R fold(R r, p<? super R, ? super g.b, ? extends R> pVar) {
        l.d(pVar, "operation");
        return pVar.i((Object) this.f15847e.fold(r, pVar), this.f15848f);
    }

    @Override // i.v.g
    public <E extends g.b> E get(g.c<E> cVar) {
        l.d(cVar, Action.KEY_ATTRIBUTE);
        c cVar2 = this;
        while (true) {
            E e2 = (E) cVar2.f15848f.get(cVar);
            if (e2 != null) {
                return e2;
            }
            g gVar = cVar2.f15847e;
            if (!(gVar instanceof c)) {
                return (E) gVar.get(cVar);
            }
            cVar2 = (c) gVar;
        }
    }

    public int hashCode() {
        return this.f15847e.hashCode() + this.f15848f.hashCode();
    }

    @Override // i.v.g
    public g minusKey(g.c<?> cVar) {
        l.d(cVar, Action.KEY_ATTRIBUTE);
        if (this.f15848f.get(cVar) != null) {
            return this.f15847e;
        }
        g gVarMinusKey = this.f15847e.minusKey(cVar);
        return gVarMinusKey == this.f15847e ? this : gVarMinusKey == h.f15852e ? this.f15848f : new c(gVarMinusKey, this.f15848f);
    }

    @Override // i.v.g
    public g plus(g gVar) {
        l.d(gVar, CoreConstants.CONTEXT_SCOPE_VALUE);
        return g.a.a(this, gVar);
    }

    public String toString() {
        return "[" + ((String) fold("", a.f15849e)) + "]";
    }
}