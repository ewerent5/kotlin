package kotlinx.coroutines;

import i.v.g;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* compiled from: Job.kt */
/* loaded from: classes3.dex */
public interface o1 extends g.b {

    /* renamed from: d, reason: collision with root package name */
    public static final b f17025d = b.a;

    /* compiled from: Job.kt */
    public static final class a {
        public static /* synthetic */ void a(o1 o1Var, CancellationException cancellationException, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
            }
            if ((i2 & 1) != 0) {
                cancellationException = null;
            }
            o1Var.K(cancellationException);
        }

        public static <R> R b(o1 o1Var, R r, i.y.c.p<? super R, ? super g.b, ? extends R> pVar) {
            return (R) g.b.a.a(o1Var, r, pVar);
        }

        public static <E extends g.b> E c(o1 o1Var, g.c<E> cVar) {
            return (E) g.b.a.b(o1Var, cVar);
        }

        public static /* synthetic */ u0 d(o1 o1Var, boolean z, boolean z2, i.y.c.l lVar, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invokeOnCompletion");
            }
            if ((i2 & 1) != 0) {
                z = false;
            }
            if ((i2 & 2) != 0) {
                z2 = true;
            }
            return o1Var.q(z, z2, lVar);
        }

        public static i.v.g e(o1 o1Var, g.c<?> cVar) {
            return g.b.a.c(o1Var, cVar);
        }

        public static i.v.g f(o1 o1Var, i.v.g gVar) {
            return g.b.a.d(o1Var, gVar);
        }
    }

    /* compiled from: Job.kt */
    public static final class b implements g.c<o1> {
        static final /* synthetic */ b a = new b();

        static {
            CoroutineExceptionHandler.a aVar = CoroutineExceptionHandler.f16924c;
        }

        private b() {
        }
    }

    u0 B(i.y.c.l<? super Throwable, i.s> lVar);

    void K(CancellationException cancellationException);

    q W(s sVar);

    boolean b();

    Object i(i.v.d<? super i.s> dVar);

    u0 q(boolean z, boolean z2, i.y.c.l<? super Throwable, i.s> lVar);

    CancellationException s();

    boolean start();
}