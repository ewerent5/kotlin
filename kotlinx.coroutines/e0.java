package kotlinx.coroutines;

import java.util.Iterator;
import java.util.List;

/* compiled from: CoroutineExceptionHandlerImpl.kt */
/* loaded from: classes3.dex */
public final class e0 {
    private static final List<CoroutineExceptionHandler> a = i.c0.j.j(i.c0.h.a(defpackage.a.a()));

    public static final void a(i.v.g gVar, Throwable th) {
        Iterator<CoroutineExceptionHandler> it = a.iterator();
        while (it.hasNext()) {
            try {
                it.next().handleException(gVar, th);
            } catch (Throwable th2) {
                Thread threadCurrentThread = Thread.currentThread();
                threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, f0.b(th, th2));
            }
        }
        Thread threadCurrentThread2 = Thread.currentThread();
        threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th);
    }
}