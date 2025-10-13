package kotlinx.coroutines;

import i.v.g;

/* compiled from: CoroutineExceptionHandler.kt */
/* loaded from: classes3.dex */
public interface CoroutineExceptionHandler extends g.b {

    /* renamed from: c, reason: collision with root package name */
    public static final a f16924c = a.a;

    /* compiled from: CoroutineExceptionHandler.kt */
    public static final class a implements g.c<CoroutineExceptionHandler> {
        static final /* synthetic */ a a = new a();

        private a() {
        }
    }

    void handleException(i.v.g gVar, Throwable th);
}