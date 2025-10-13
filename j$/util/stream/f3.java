package j$.util.stream;

/* loaded from: classes2.dex */
class f3 implements Runnable {
    final /* synthetic */ Runnable a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Runnable f16287b;

    f3(Runnable runnable, Runnable runnable2) {
        this.a = runnable;
        this.f16287b = runnable2;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.a.run();
            this.f16287b.run();
        } catch (Throwable th) {
            try {
                this.f16287b.run();
            } catch (Throwable th2) {
                try {
                    th.addSuppressed(th2);
                } catch (Throwable unused) {
                }
            }
            throw th;
        }
    }
}