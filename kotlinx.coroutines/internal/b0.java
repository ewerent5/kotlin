package kotlinx.coroutines.internal;

import i.v.g;
import java.util.Objects;
import kotlinx.coroutines.h2;

/* compiled from: ThreadContext.kt */
/* loaded from: classes3.dex */
public final class b0 {
    private static final x a = new x("ZERO");

    /* renamed from: b, reason: collision with root package name */
    private static final i.y.c.p<Object, g.b, Object> f16953b = a.f16957e;

    /* renamed from: c, reason: collision with root package name */
    private static final i.y.c.p<h2<?>, g.b, h2<?>> f16954c = b.f16958e;

    /* renamed from: d, reason: collision with root package name */
    private static final i.y.c.p<g0, g.b, g0> f16955d = d.f16960e;

    /* renamed from: e, reason: collision with root package name */
    private static final i.y.c.p<g0, g.b, g0> f16956e = c.f16959e;

    /* compiled from: ThreadContext.kt */
    static final class a extends i.y.d.m implements i.y.c.p<Object, g.b, Object> {

        /* renamed from: e, reason: collision with root package name */
        public static final a f16957e = new a();

        a() {
            super(2);
        }

        @Override // i.y.c.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object i(Object obj, g.b bVar) {
            if (!(bVar instanceof h2)) {
                return obj;
            }
            if (!(obj instanceof Integer)) {
                obj = null;
            }
            Integer num = (Integer) obj;
            int iIntValue = num != null ? num.intValue() : 1;
            return iIntValue == 0 ? bVar : Integer.valueOf(iIntValue + 1);
        }
    }

    /* compiled from: ThreadContext.kt */
    static final class b extends i.y.d.m implements i.y.c.p<h2<?>, g.b, h2<?>> {

        /* renamed from: e, reason: collision with root package name */
        public static final b f16958e = new b();

        b() {
            super(2);
        }

        @Override // i.y.c.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final h2<?> i(h2<?> h2Var, g.b bVar) {
            if (h2Var != null) {
                return h2Var;
            }
            if (!(bVar instanceof h2)) {
                bVar = null;
            }
            return (h2) bVar;
        }
    }

    /* compiled from: ThreadContext.kt */
    static final class c extends i.y.d.m implements i.y.c.p<g0, g.b, g0> {

        /* renamed from: e, reason: collision with root package name */
        public static final c f16959e = new c();

        c() {
            super(2);
        }

        @Override // i.y.c.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final g0 i(g0 g0Var, g.b bVar) {
            if (bVar instanceof h2) {
                ((h2) bVar).C(g0Var.b(), g0Var.d());
            }
            return g0Var;
        }
    }

    /* compiled from: ThreadContext.kt */
    static final class d extends i.y.d.m implements i.y.c.p<g0, g.b, g0> {

        /* renamed from: e, reason: collision with root package name */
        public static final d f16960e = new d();

        d() {
            super(2);
        }

        @Override // i.y.c.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final g0 i(g0 g0Var, g.b bVar) {
            if (bVar instanceof h2) {
                g0Var.a(((h2) bVar).T(g0Var.b()));
            }
            return g0Var;
        }
    }

    public static final void a(i.v.g gVar, Object obj) {
        if (obj == a) {
            return;
        }
        if (obj instanceof g0) {
            ((g0) obj).c();
            gVar.fold(obj, f16956e);
        } else {
            Object objFold = gVar.fold(null, f16954c);
            Objects.requireNonNull(objFold, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
            ((h2) objFold).C(gVar, obj);
        }
    }

    public static final Object b(i.v.g gVar) {
        Object objFold = gVar.fold(0, f16953b);
        i.y.d.l.b(objFold);
        return objFold;
    }

    public static final Object c(i.v.g gVar, Object obj) {
        if (obj == null) {
            obj = b(gVar);
        }
        if (obj == 0) {
            return a;
        }
        if (obj instanceof Integer) {
            return gVar.fold(new g0(gVar, ((Number) obj).intValue()), f16955d);
        }
        Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        return ((h2) obj).T(gVar);
    }
}