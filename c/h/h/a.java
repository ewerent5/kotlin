package c.h.h;

import android.os.Build;
import android.os.CancellationSignal;

/* compiled from: CancellationSignal.java */
/* loaded from: classes.dex */
public final class a {
    private boolean a;

    /* renamed from: b, reason: collision with root package name */
    private InterfaceC0050a f3017b;

    /* renamed from: c, reason: collision with root package name */
    private Object f3018c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f3019d;

    /* compiled from: CancellationSignal.java */
    /* renamed from: c.h.h.a$a, reason: collision with other inner class name */
    public interface InterfaceC0050a {
        void a();
    }

    private void d() throws InterruptedException {
        while (this.f3019d) {
            try {
                wait();
            } catch (InterruptedException unused) {
            }
        }
    }

    public void a() {
        synchronized (this) {
            if (this.a) {
                return;
            }
            this.a = true;
            this.f3019d = true;
            InterfaceC0050a interfaceC0050a = this.f3017b;
            Object obj = this.f3018c;
            if (interfaceC0050a != null) {
                try {
                    interfaceC0050a.a();
                } catch (Throwable th) {
                    synchronized (this) {
                        this.f3019d = false;
                        notifyAll();
                        throw th;
                    }
                }
            }
            if (obj != null && Build.VERSION.SDK_INT >= 16) {
                ((CancellationSignal) obj).cancel();
            }
            synchronized (this) {
                this.f3019d = false;
                notifyAll();
            }
        }
    }

    public boolean b() {
        boolean z;
        synchronized (this) {
            z = this.a;
        }
        return z;
    }

    public void c(InterfaceC0050a interfaceC0050a) {
        synchronized (this) {
            d();
            if (this.f3017b == interfaceC0050a) {
                return;
            }
            this.f3017b = interfaceC0050a;
            if (this.a && interfaceC0050a != null) {
                interfaceC0050a.a();
            }
        }
    }
}