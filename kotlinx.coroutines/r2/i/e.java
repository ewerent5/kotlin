package kotlinx.coroutines.r2.i;

import i.s;
import i.y.c.q;
import i.y.d.j;
import i.y.d.k;
import i.y.d.y;

/* compiled from: SafeCollector.kt */
/* loaded from: classes3.dex */
public final class e {
    private static final q<kotlinx.coroutines.r2.d<Object>, Object, i.v.d<? super s>, Object> a = (q) y.b(new a(), 3);

    /* compiled from: SafeCollector.kt */
    static final /* synthetic */ class a extends j implements q<kotlinx.coroutines.r2.d<? super Object>, Object, i.v.d<? super s>, Object> {
        a() {
            super(3, kotlinx.coroutines.r2.d.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // i.y.c.q
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object d(kotlinx.coroutines.r2.d<Object> dVar, Object obj, i.v.d<? super s> dVar2) {
            k.c(0);
            Object objB = dVar.b(obj, dVar2);
            k.c(2);
            k.c(1);
            return objB;
        }
    }
}