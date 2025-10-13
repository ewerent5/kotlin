package e.c.c.a.a;

import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* compiled from: ListenableFuture.java */
/* loaded from: classes.dex */
public interface a<V> extends Future<V> {
    void a(Runnable runnable, Executor executor);
}