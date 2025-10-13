package kotlinx.coroutines;

/* compiled from: CancellableContinuation.kt */
/* loaded from: classes3.dex */
public interface k<T> extends i.v.d<T> {

    /* compiled from: CancellableContinuation.kt */
    public static final class a {
        public static /* synthetic */ Object a(k kVar, Object obj, Object obj2, int i2, Object obj3) {
            if (obj3 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: tryResume");
            }
            if ((i2 & 2) != 0) {
                obj2 = null;
            }
            return kVar.a(obj, obj2);
        }
    }

    Object a(T t, Object obj);

    void f(i.y.c.l<? super Throwable, i.s> lVar);

    Object j(Throwable th);

    Object k(T t, Object obj, i.y.c.l<? super Throwable, i.s> lVar);

    void l(T t, i.y.c.l<? super Throwable, i.s> lVar);

    boolean m(Throwable th);

    void n(Object obj);
}