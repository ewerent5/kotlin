package e.c.b.a.i;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* compiled from: ExecutionModule.java */
/* loaded from: classes.dex */
abstract class i {
    static Executor a() {
        return new k(Executors.newSingleThreadExecutor());
    }
}