package i.v.i;

import i.n;
import i.s;
import i.v.g;
import i.v.j.a.h;
import i.v.j.a.j;
import i.y.c.p;
import i.y.d.l;
import i.y.d.y;
import java.util.Objects;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: IntrinsicsJvm.kt */
/* loaded from: classes3.dex */
public class c {

    /* compiled from: IntrinsicsJvm.kt */
    public static final class a extends j {

        /* renamed from: f, reason: collision with root package name */
        private int f15857f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ i.v.d f15858g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ p f15859h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Object f15860i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(i.v.d dVar, i.v.d dVar2, p pVar, Object obj) {
            super(dVar2);
            this.f15858g = dVar;
            this.f15859h = pVar;
            this.f15860i = obj;
        }

        @Override // i.v.j.a.a
        protected Object p(Object obj) throws Throwable {
            int i2 = this.f15857f;
            if (i2 != 0) {
                if (i2 != 1) {
                    throw new IllegalStateException("This coroutine had already completed".toString());
                }
                this.f15857f = 2;
                n.b(obj);
                return obj;
            }
            this.f15857f = 1;
            n.b(obj);
            p pVar = this.f15859h;
            Objects.requireNonNull(pVar, "null cannot be cast to non-null type (R, kotlin.coroutines.Continuation<T>) -> kotlin.Any?");
            return ((p) y.b(pVar, 2)).i(this.f15860i, this);
        }
    }

    /* compiled from: IntrinsicsJvm.kt */
    public static final class b extends i.v.j.a.d {

        /* renamed from: h, reason: collision with root package name */
        private int f15861h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ i.v.d f15862i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ g f15863j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ p f15864k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ Object f15865l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(i.v.d dVar, g gVar, i.v.d dVar2, g gVar2, p pVar, Object obj) {
            super(dVar2, gVar2);
            this.f15862i = dVar;
            this.f15863j = gVar;
            this.f15864k = pVar;
            this.f15865l = obj;
        }

        @Override // i.v.j.a.a
        protected Object p(Object obj) throws Throwable {
            int i2 = this.f15861h;
            if (i2 != 0) {
                if (i2 != 1) {
                    throw new IllegalStateException("This coroutine had already completed".toString());
                }
                this.f15861h = 2;
                n.b(obj);
                return obj;
            }
            this.f15861h = 1;
            n.b(obj);
            p pVar = this.f15864k;
            Objects.requireNonNull(pVar, "null cannot be cast to non-null type (R, kotlin.coroutines.Continuation<T>) -> kotlin.Any?");
            return ((p) y.b(pVar, 2)).i(this.f15865l, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <R, T> i.v.d<s> a(p<? super R, ? super i.v.d<? super T>, ? extends Object> pVar, R r, i.v.d<? super T> dVar) {
        l.d(pVar, "$this$createCoroutineUnintercepted");
        l.d(dVar, "completion");
        i.v.d<?> dVarA = h.a(dVar);
        if (pVar instanceof i.v.j.a.a) {
            return ((i.v.j.a.a) pVar).g(r, dVarA);
        }
        g context = dVarA.getContext();
        return context == i.v.h.f15852e ? new a(dVarA, dVarA, pVar, r) : new b(dVarA, context, dVarA, context, pVar, r);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> i.v.d<T> b(i.v.d<? super T> dVar) {
        i.v.d<T> dVar2;
        l.d(dVar, "$this$intercepted");
        i.v.j.a.d dVar3 = !(dVar instanceof i.v.j.a.d) ? null : dVar;
        return (dVar3 == null || (dVar2 = (i.v.d<T>) dVar3.r()) == null) ? dVar : dVar2;
    }
}