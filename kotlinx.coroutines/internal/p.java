package kotlinx.coroutines.internal;

import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.y1;

/* compiled from: MainDispatchers.kt */
/* loaded from: classes3.dex */
public final class p {
    private static final boolean a;

    /* renamed from: b, reason: collision with root package name */
    public static final y1 f16994b;

    /* renamed from: c, reason: collision with root package name */
    public static final p f16995c;

    static {
        p pVar = new p();
        f16995c = pVar;
        a = y.e("kotlinx.coroutines.fast.service.loader", true);
        f16994b = pVar.a();
    }

    private p() {
    }

    private final y1 a() {
        Object next;
        y1 y1VarD;
        try {
            List<MainDispatcherFactory> listC = a ? h.a.c() : i.c0.j.j(i.c0.h.a(defpackage.a.b()));
            Iterator<T> it = listC.iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    int loadPriority = ((MainDispatcherFactory) next).getLoadPriority();
                    do {
                        Object next2 = it.next();
                        int loadPriority2 = ((MainDispatcherFactory) next2).getLoadPriority();
                        if (loadPriority < loadPriority2) {
                            next = next2;
                            loadPriority = loadPriority2;
                        }
                    } while (it.hasNext());
                }
            } else {
                next = null;
            }
            MainDispatcherFactory mainDispatcherFactory = (MainDispatcherFactory) next;
            return (mainDispatcherFactory == null || (y1VarD = q.d(mainDispatcherFactory, listC)) == null) ? q.b(null, null, 3, null) : y1VarD;
        } catch (Throwable th) {
            return q.b(th, null, 2, null);
        }
    }
}