package e.c.b.d.a.f;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class g {
    public static <ResultT> e<ResultT> a(ResultT resultt) {
        t tVar = new t();
        tVar.h(resultt);
        return tVar;
    }

    public static <ResultT> ResultT b(e<ResultT> eVar) throws InterruptedException {
        e.c.b.d.a.b.r.c(eVar, "Task must not be null");
        if (eVar.f()) {
            return (ResultT) d(eVar);
        }
        u uVar = new u(null);
        e(eVar, uVar);
        uVar.b();
        return (ResultT) d(eVar);
    }

    public static <ResultT> e<ResultT> c(Exception exc) {
        t tVar = new t();
        tVar.j(exc);
        return tVar;
    }

    private static <ResultT> ResultT d(e<ResultT> eVar) throws ExecutionException {
        if (eVar.g()) {
            return eVar.e();
        }
        throw new ExecutionException(eVar.d());
    }

    private static void e(e<?> eVar, u uVar) {
        Executor executor = f.f15370b;
        eVar.c(executor, uVar);
        eVar.b(executor, uVar);
    }
}