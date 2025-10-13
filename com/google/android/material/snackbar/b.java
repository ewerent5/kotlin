package com.google.android.material.snackbar;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* compiled from: SnackbarManager.java */
/* loaded from: classes.dex */
class b {
    private static b a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f11755b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private final Handler f11756c = new Handler(Looper.getMainLooper(), new a());

    /* renamed from: d, reason: collision with root package name */
    private c f11757d;

    /* renamed from: e, reason: collision with root package name */
    private c f11758e;

    /* compiled from: SnackbarManager.java */
    class a implements Handler.Callback {
        a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            b.this.d((c) message.obj);
            return true;
        }
    }

    /* compiled from: SnackbarManager.java */
    /* renamed from: com.google.android.material.snackbar.b$b, reason: collision with other inner class name */
    interface InterfaceC0122b {
        void a(int i2);

        void b();
    }

    /* compiled from: SnackbarManager.java */
    private static class c {
        final WeakReference<InterfaceC0122b> a;

        /* renamed from: b, reason: collision with root package name */
        int f11760b;

        /* renamed from: c, reason: collision with root package name */
        boolean f11761c;

        c(int i2, InterfaceC0122b interfaceC0122b) {
            this.a = new WeakReference<>(interfaceC0122b);
            this.f11760b = i2;
        }

        boolean a(InterfaceC0122b interfaceC0122b) {
            return interfaceC0122b != null && this.a.get() == interfaceC0122b;
        }
    }

    private b() {
    }

    private boolean a(c cVar, int i2) {
        InterfaceC0122b interfaceC0122b = cVar.a.get();
        if (interfaceC0122b == null) {
            return false;
        }
        this.f11756c.removeCallbacksAndMessages(cVar);
        interfaceC0122b.a(i2);
        return true;
    }

    static b c() {
        if (a == null) {
            a = new b();
        }
        return a;
    }

    private boolean f(InterfaceC0122b interfaceC0122b) {
        c cVar = this.f11757d;
        return cVar != null && cVar.a(interfaceC0122b);
    }

    private boolean g(InterfaceC0122b interfaceC0122b) {
        c cVar = this.f11758e;
        return cVar != null && cVar.a(interfaceC0122b);
    }

    private void l(c cVar) {
        int i2 = cVar.f11760b;
        if (i2 == -2) {
            return;
        }
        if (i2 <= 0) {
            i2 = i2 == -1 ? 1500 : 2750;
        }
        this.f11756c.removeCallbacksAndMessages(cVar);
        Handler handler = this.f11756c;
        handler.sendMessageDelayed(Message.obtain(handler, 0, cVar), i2);
    }

    private void n() {
        c cVar = this.f11758e;
        if (cVar != null) {
            this.f11757d = cVar;
            this.f11758e = null;
            InterfaceC0122b interfaceC0122b = cVar.a.get();
            if (interfaceC0122b != null) {
                interfaceC0122b.b();
            } else {
                this.f11757d = null;
            }
        }
    }

    public void b(InterfaceC0122b interfaceC0122b, int i2) {
        synchronized (this.f11755b) {
            if (f(interfaceC0122b)) {
                a(this.f11757d, i2);
            } else if (g(interfaceC0122b)) {
                a(this.f11758e, i2);
            }
        }
    }

    void d(c cVar) {
        synchronized (this.f11755b) {
            if (this.f11757d == cVar || this.f11758e == cVar) {
                a(cVar, 2);
            }
        }
    }

    public boolean e(InterfaceC0122b interfaceC0122b) {
        boolean z;
        synchronized (this.f11755b) {
            z = f(interfaceC0122b) || g(interfaceC0122b);
        }
        return z;
    }

    public void h(InterfaceC0122b interfaceC0122b) {
        synchronized (this.f11755b) {
            if (f(interfaceC0122b)) {
                this.f11757d = null;
                if (this.f11758e != null) {
                    n();
                }
            }
        }
    }

    public void i(InterfaceC0122b interfaceC0122b) {
        synchronized (this.f11755b) {
            if (f(interfaceC0122b)) {
                l(this.f11757d);
            }
        }
    }

    public void j(InterfaceC0122b interfaceC0122b) {
        synchronized (this.f11755b) {
            if (f(interfaceC0122b)) {
                c cVar = this.f11757d;
                if (!cVar.f11761c) {
                    cVar.f11761c = true;
                    this.f11756c.removeCallbacksAndMessages(cVar);
                }
            }
        }
    }

    public void k(InterfaceC0122b interfaceC0122b) {
        synchronized (this.f11755b) {
            if (f(interfaceC0122b)) {
                c cVar = this.f11757d;
                if (cVar.f11761c) {
                    cVar.f11761c = false;
                    l(cVar);
                }
            }
        }
    }

    public void m(int i2, InterfaceC0122b interfaceC0122b) {
        synchronized (this.f11755b) {
            if (f(interfaceC0122b)) {
                c cVar = this.f11757d;
                cVar.f11760b = i2;
                this.f11756c.removeCallbacksAndMessages(cVar);
                l(this.f11757d);
                return;
            }
            if (g(interfaceC0122b)) {
                this.f11758e.f11760b = i2;
            } else {
                this.f11758e = new c(i2, interfaceC0122b);
            }
            c cVar2 = this.f11757d;
            if (cVar2 == null || !a(cVar2, 4)) {
                this.f11757d = null;
                n();
            }
        }
    }
}