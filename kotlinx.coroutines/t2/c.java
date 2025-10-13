package kotlinx.coroutines.t2;

import kotlinx.coroutines.d0;
import kotlinx.coroutines.internal.a0;
import kotlinx.coroutines.internal.y;

/* compiled from: Dispatcher.kt */
/* loaded from: classes3.dex */
public final class c extends d {

    /* renamed from: l, reason: collision with root package name */
    private static final d0 f17127l;

    /* renamed from: m, reason: collision with root package name */
    public static final c f17128m;

    static {
        c cVar = new c();
        f17128m = cVar;
        f17127l = new f(cVar, a0.d("kotlinx.coroutines.io.parallelism", i.a0.f.b(64, y.a()), 0, 0, 12, null), "Dispatchers.IO", 1);
    }

    private c() {
        super(0, 0, null, 7, null);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    public final d0 k0() {
        return f17127l;
    }

    @Override // kotlinx.coroutines.d0
    public String toString() {
        return "Dispatchers.Default";
    }
}