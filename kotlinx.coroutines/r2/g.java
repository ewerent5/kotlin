package kotlinx.coroutines.r2;

import i.y.c.l;
import i.y.c.p;
import i.y.d.m;

/* compiled from: Distinct.kt */
/* loaded from: classes3.dex */
final /* synthetic */ class g {
    private static final l<Object, Object> a = b.f17081e;

    /* renamed from: b, reason: collision with root package name */
    private static final p<Object, Object, Boolean> f17079b = a.f17080e;

    /* compiled from: Distinct.kt */
    static final class a extends m implements p<Object, Object, Boolean> {

        /* renamed from: e, reason: collision with root package name */
        public static final a f17080e = new a();

        a() {
            super(2);
        }

        public final boolean a(Object obj, Object obj2) {
            return i.y.d.l.a(obj, obj2);
        }

        @Override // i.y.c.p
        public /* bridge */ /* synthetic */ Boolean i(Object obj, Object obj2) {
            return Boolean.valueOf(a(obj, obj2));
        }
    }

    /* compiled from: Distinct.kt */
    static final class b extends m implements l<Object, Object> {

        /* renamed from: e, reason: collision with root package name */
        public static final b f17081e = new b();

        b() {
            super(1);
        }

        @Override // i.y.c.l
        public final Object invoke(Object obj) {
            return obj;
        }
    }

    public static final <T> c<T> a(c<? extends T> cVar) {
        return b(cVar, a, f17079b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final <T> c<T> b(c<? extends T> cVar, l<? super T, ? extends Object> lVar, p<Object, Object, Boolean> pVar) {
        if (cVar instanceof kotlinx.coroutines.r2.b) {
            kotlinx.coroutines.r2.b bVar = (kotlinx.coroutines.r2.b) cVar;
            if (bVar.f17068b == lVar && bVar.f17069c == pVar) {
                return cVar;
            }
        }
        return new kotlinx.coroutines.r2.b(cVar, lVar, pVar);
    }
}