package androidx.work;

import android.content.Context;

/* compiled from: WorkerFactory.java */
/* loaded from: classes.dex */
public abstract class q {
    private static final String a = h.f("WorkerFactory");

    /* compiled from: WorkerFactory.java */
    static class a extends q {
        a() {
        }

        @Override // androidx.work.q
        public ListenableWorker a(Context context, String str, WorkerParameters workerParameters) {
            return null;
        }
    }

    public static q c() {
        return new a();
    }

    public abstract ListenableWorker a(Context context, String str, WorkerParameters workerParameters);

    public final ListenableWorker b(Context context, String str, WorkerParameters workerParameters) {
        ListenableWorker listenableWorkerA = a(context, str, workerParameters);
        if (listenableWorkerA != null) {
            return listenableWorkerA;
        }
        try {
            try {
                return (ListenableWorker) Class.forName(str).asSubclass(ListenableWorker.class).getDeclaredConstructor(Context.class, WorkerParameters.class).newInstance(context, workerParameters);
            } catch (Exception e2) {
                h.c().b(a, "Could not instantiate " + str, e2);
                return null;
            }
        } catch (ClassNotFoundException unused) {
            h.c().b(a, "Class not found: " + str, new Throwable[0]);
            return null;
        }
    }
}