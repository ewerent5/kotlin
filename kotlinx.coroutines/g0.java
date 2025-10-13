package kotlinx.coroutines;

import ch.qos.logback.core.CoreConstants;
import i.v.g;
import java.util.Objects;
import kotlinx.coroutines.h2;

/* compiled from: CoroutineContext.kt */
/* loaded from: classes3.dex */
public final class g0 extends i.v.a implements h2<String> {

    /* renamed from: e, reason: collision with root package name */
    public static final a f16944e = new a(null);

    /* renamed from: f, reason: collision with root package name */
    private final long f16945f;

    /* compiled from: CoroutineContext.kt */
    public static final class a implements g.c<g0> {
        private a() {
        }

        public /* synthetic */ a(i.y.d.g gVar) {
            this();
        }
    }

    public g0(long j2) {
        super(f16944e);
        this.f16945f = j2;
    }

    public final long Z() {
        return this.f16945f;
    }

    @Override // kotlinx.coroutines.h2
    /* renamed from: a0, reason: merged with bridge method [inline-methods] */
    public void C(i.v.g gVar, String str) {
        Thread.currentThread().setName(str);
    }

    @Override // kotlinx.coroutines.h2
    /* renamed from: b0, reason: merged with bridge method [inline-methods] */
    public String T(i.v.g gVar) {
        String strZ;
        h0 h0Var = (h0) gVar.get(h0.f16946e);
        if (h0Var == null || (strZ = h0Var.Z()) == null) {
            strZ = "coroutine";
        }
        Thread threadCurrentThread = Thread.currentThread();
        String name = threadCurrentThread.getName();
        int iW = i.d0.q.W(name, " @", 0, false, 6, null);
        if (iW < 0) {
            iW = name.length();
        }
        StringBuilder sb = new StringBuilder(strZ.length() + iW + 10);
        Objects.requireNonNull(name, "null cannot be cast to non-null type java.lang.String");
        String strSubstring = name.substring(0, iW);
        i.y.d.l.c(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        sb.append(strSubstring);
        sb.append(" @");
        sb.append(strZ);
        sb.append('#');
        sb.append(this.f16945f);
        i.s sVar = i.s.a;
        String string = sb.toString();
        i.y.d.l.c(string, "StringBuilder(capacity).…builderAction).toString()");
        threadCurrentThread.setName(string);
        return name;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof g0) && this.f16945f == ((g0) obj).f16945f;
        }
        return true;
    }

    @Override // i.v.a, i.v.g
    public <R> R fold(R r, i.y.c.p<? super R, ? super g.b, ? extends R> pVar) {
        return (R) h2.a.a(this, r, pVar);
    }

    @Override // i.v.a, i.v.g.b, i.v.g
    public <E extends g.b> E get(g.c<E> cVar) {
        return (E) h2.a.b(this, cVar);
    }

    public int hashCode() {
        long j2 = this.f16945f;
        return (int) (j2 ^ (j2 >>> 32));
    }

    @Override // i.v.a, i.v.g
    public i.v.g minusKey(g.c<?> cVar) {
        return h2.a.c(this, cVar);
    }

    @Override // i.v.a, i.v.g
    public i.v.g plus(i.v.g gVar) {
        return h2.a.d(this, gVar);
    }

    public String toString() {
        return "CoroutineId(" + this.f16945f + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}