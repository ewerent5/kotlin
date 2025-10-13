package e.c.b.d.a.f;

import java.util.concurrent.CountDownLatch;

/* loaded from: classes.dex */
final class u implements c, b {
    private final CountDownLatch a = new CountDownLatch(1);

    /* synthetic */ u(byte[] bArr) {
    }

    @Override // e.c.b.d.a.f.b
    public final void a(Exception exc) {
        this.a.countDown();
    }

    public final void b() throws InterruptedException {
        this.a.await();
    }

    @Override // e.c.b.d.a.f.c
    public final void onSuccess(Object obj) {
        this.a.countDown();
    }
}