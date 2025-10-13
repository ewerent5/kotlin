package kotlinx.coroutines;

/* compiled from: CoroutineExceptionHandler.kt */
/* loaded from: classes3.dex */
public final class f0 {
    public static final void a(i.v.g gVar, Throwable th) {
        try {
            CoroutineExceptionHandler coroutineExceptionHandler = (CoroutineExceptionHandler) gVar.get(CoroutineExceptionHandler.f16924c);
            if (coroutineExceptionHandler != null) {
                coroutineExceptionHandler.handleException(gVar, th);
            } else {
                e0.a(gVar, th);
            }
        } catch (Throwable th2) {
            e0.a(gVar, b(th, th2));
        }
    }

    public static final Throwable b(Throwable th, Throwable th2) {
        if (th == th2) {
            return th;
        }
        RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
        i.b.a(runtimeException, th);
        return runtimeException;
    }
}