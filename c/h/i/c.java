package c.h.i;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: SelfDestructiveThread.java */
/* loaded from: classes.dex */
public class c {

    /* renamed from: b, reason: collision with root package name */
    private HandlerThread f3049b;

    /* renamed from: c, reason: collision with root package name */
    private Handler f3050c;

    /* renamed from: f, reason: collision with root package name */
    private final int f3053f;

    /* renamed from: g, reason: collision with root package name */
    private final int f3054g;

    /* renamed from: h, reason: collision with root package name */
    private final String f3055h;
    private final Object a = new Object();

    /* renamed from: e, reason: collision with root package name */
    private Handler.Callback f3052e = new a();

    /* renamed from: d, reason: collision with root package name */
    private int f3051d = 0;

    /* compiled from: SelfDestructiveThread.java */
    class a implements Handler.Callback {
        a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i2 = message.what;
            if (i2 == 0) {
                c.this.a();
                return true;
            }
            if (i2 != 1) {
                return true;
            }
            c.this.b((Runnable) message.obj);
            return true;
        }
    }

    /* compiled from: SelfDestructiveThread.java */
    class b implements Runnable {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Callable f3057e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Handler f3058f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ d f3059g;

        /* compiled from: SelfDestructiveThread.java */
        class a implements Runnable {

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ Object f3061e;

            a(Object obj) {
                this.f3061e = obj;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.f3059g.a(this.f3061e);
            }
        }

        b(Callable callable, Handler handler, d dVar) {
            this.f3057e = callable;
            this.f3058f = handler;
            this.f3059g = dVar;
        }

        @Override // java.lang.Runnable
        public void run() throws Exception {
            Object objCall;
            try {
                objCall = this.f3057e.call();
            } catch (Exception unused) {
                objCall = null;
            }
            this.f3058f.post(new a(objCall));
        }
    }

    /* compiled from: SelfDestructiveThread.java */
    /* renamed from: c.h.i.c$c, reason: collision with other inner class name */
    class RunnableC0052c implements Runnable {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ AtomicReference f3063e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Callable f3064f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ReentrantLock f3065g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ AtomicBoolean f3066h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Condition f3067i;

        RunnableC0052c(AtomicReference atomicReference, Callable callable, ReentrantLock reentrantLock, AtomicBoolean atomicBoolean, Condition condition) {
            this.f3063e = atomicReference;
            this.f3064f = callable;
            this.f3065g = reentrantLock;
            this.f3066h = atomicBoolean;
            this.f3067i = condition;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f3063e.set(this.f3064f.call());
            } catch (Exception unused) {
            }
            this.f3065g.lock();
            try {
                this.f3066h.set(false);
                this.f3067i.signal();
            } finally {
                this.f3065g.unlock();
            }
        }
    }

    /* compiled from: SelfDestructiveThread.java */
    public interface d<T> {
        void a(T t);
    }

    public c(String str, int i2, int i3) {
        this.f3055h = str;
        this.f3054g = i2;
        this.f3053f = i3;
    }

    private void c(Runnable runnable) {
        synchronized (this.a) {
            if (this.f3049b == null) {
                HandlerThread handlerThread = new HandlerThread(this.f3055h, this.f3054g);
                this.f3049b = handlerThread;
                handlerThread.start();
                this.f3050c = new Handler(this.f3049b.getLooper(), this.f3052e);
                this.f3051d++;
            }
            this.f3050c.removeMessages(0);
            Handler handler = this.f3050c;
            handler.sendMessage(handler.obtainMessage(1, runnable));
        }
    }

    void a() {
        synchronized (this.a) {
            if (this.f3050c.hasMessages(1)) {
                return;
            }
            this.f3049b.quit();
            this.f3049b = null;
            this.f3050c = null;
        }
    }

    void b(Runnable runnable) {
        runnable.run();
        synchronized (this.a) {
            this.f3050c.removeMessages(0);
            Handler handler = this.f3050c;
            handler.sendMessageDelayed(handler.obtainMessage(0), this.f3053f);
        }
    }

    public <T> void d(Callable<T> callable, d<T> dVar) {
        c(new b(callable, new Handler(), dVar));
    }

    public <T> T e(Callable<T> callable, int i2) {
        ReentrantLock reentrantLock = new ReentrantLock();
        Condition conditionNewCondition = reentrantLock.newCondition();
        AtomicReference atomicReference = new AtomicReference();
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        c(new RunnableC0052c(atomicReference, callable, reentrantLock, atomicBoolean, conditionNewCondition));
        reentrantLock.lock();
        try {
            if (!atomicBoolean.get()) {
                return (T) atomicReference.get();
            }
            long nanos = TimeUnit.MILLISECONDS.toNanos(i2);
            do {
                try {
                    nanos = conditionNewCondition.awaitNanos(nanos);
                } catch (InterruptedException unused) {
                }
                if (!atomicBoolean.get()) {
                    return (T) atomicReference.get();
                }
            } while (nanos > 0);
            throw new InterruptedException("timeout");
        } finally {
            reentrantLock.unlock();
        }
    }
}