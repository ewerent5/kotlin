package k.c.f;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: GarbageCollector.java */
/* loaded from: classes3.dex */
public class d {
    private final AtomicBoolean a = new AtomicBoolean(false);

    /* renamed from: b, reason: collision with root package name */
    private final Runnable f16743b;

    /* compiled from: GarbageCollector.java */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                d.this.f16743b.run();
            } finally {
                d.this.a.set(false);
            }
        }
    }

    public d(Runnable runnable) {
        this.f16743b = runnable;
    }

    public boolean c() {
        if (this.a.getAndSet(true)) {
            return false;
        }
        Thread thread = new Thread(new a());
        thread.setName("GarbageCollector");
        thread.setPriority(1);
        thread.start();
        return true;
    }

    public boolean d() {
        return this.a.get();
    }
}