package com.google.android.gms.internal.ads;

import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public abstract class f32<V> extends z52 implements g52<V> {

    /* renamed from: e, reason: collision with root package name */
    private static final boolean f5788e;

    /* renamed from: f, reason: collision with root package name */
    private static final Logger f5789f;

    /* renamed from: g, reason: collision with root package name */
    private static final g32 f5790g;

    /* renamed from: h, reason: collision with root package name */
    private static final Object f5791h;

    /* renamed from: i, reason: collision with root package name */
    @NullableDecl
    private volatile Object f5792i;

    /* renamed from: j, reason: collision with root package name */
    @NullableDecl
    private volatile j32 f5793j;

    /* renamed from: k, reason: collision with root package name */
    @NullableDecl
    private volatile q32 f5794k;

    static {
        boolean z;
        Throwable th;
        Throwable th2;
        g32 m32Var;
        try {
            z = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z = false;
        }
        f5788e = z;
        f5789f = Logger.getLogger(f32.class.getName());
        a aVar = null;
        try {
            m32Var = new p32(aVar);
            th2 = null;
            th = null;
        } catch (Throwable th3) {
            try {
                th2 = th3;
                m32Var = new k32(AtomicReferenceFieldUpdater.newUpdater(q32.class, Thread.class, "b"), AtomicReferenceFieldUpdater.newUpdater(q32.class, q32.class, "c"), AtomicReferenceFieldUpdater.newUpdater(f32.class, q32.class, "k"), AtomicReferenceFieldUpdater.newUpdater(f32.class, j32.class, "j"), AtomicReferenceFieldUpdater.newUpdater(f32.class, Object.class, IntegerTokenConverter.CONVERTER_KEY));
                th = null;
            } catch (Throwable th4) {
                th = th4;
                th2 = th3;
                m32Var = new m32(aVar);
            }
        }
        f5790g = m32Var;
        if (th != null) {
            Logger logger = f5789f;
            Level level = Level.SEVERE;
            logger.logp(level, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "UnsafeAtomicHelper is broken!", th2);
            logger.logp(level, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "SafeAtomicHelper is broken!", th);
        }
        f5791h = new Object();
    }

    protected f32() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void A(f32<?> f32Var) {
        j32 j32Var;
        j32 j32Var2;
        j32 j32Var3 = null;
        while (true) {
            q32 q32Var = ((f32) f32Var).f5794k;
            if (f5790g.c(f32Var, q32Var, q32.a)) {
                while (q32Var != null) {
                    Thread thread = q32Var.f8321b;
                    if (thread != null) {
                        q32Var.f8321b = null;
                        LockSupport.unpark(thread);
                    }
                    q32Var = q32Var.f8322c;
                }
                f32Var.i();
                do {
                    j32Var = ((f32) f32Var).f5793j;
                } while (!f5790g.d(f32Var, j32Var, j32.a));
                while (true) {
                    j32Var2 = j32Var3;
                    j32Var3 = j32Var;
                    if (j32Var3 == null) {
                        break;
                    }
                    j32Var = j32Var3.f6674d;
                    j32Var3.f6674d = j32Var2;
                }
                while (j32Var2 != null) {
                    j32Var3 = j32Var2.f6674d;
                    Runnable runnable = j32Var2.f6672b;
                    if (runnable instanceof l32) {
                        l32 l32Var = (l32) runnable;
                        f32Var = l32Var.f7179e;
                        if (((f32) f32Var).f5792i == l32Var) {
                            if (f5790g.e(f32Var, l32Var, g(l32Var.f7180f))) {
                                break;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        d(runnable, j32Var2.f6673c);
                    }
                    j32Var2 = j32Var3;
                }
                return;
            }
        }
    }

    private final void B(StringBuilder sb) {
        String string;
        int length = sb.length();
        sb.append("PENDING");
        Object obj = this.f5792i;
        if (obj instanceof l32) {
            sb.append(", setFuture=[");
            c(sb, ((l32) obj).f7180f);
            sb.append("]");
        } else {
            try {
                string = o12.b(h());
            } catch (RuntimeException | StackOverflowError e2) {
                String strValueOf = String.valueOf(e2.getClass());
                StringBuilder sb2 = new StringBuilder(strValueOf.length() + 38);
                sb2.append("Exception thrown from implementation: ");
                sb2.append(strValueOf);
                string = sb2.toString();
            }
            if (string != null) {
                sb.append(", info=[");
                sb.append(string);
                sb.append("]");
            }
        }
        if (isDone()) {
            sb.delete(length, sb.length());
            C(sb);
        }
    }

    private final void C(StringBuilder sb) {
        try {
            Object objZ = z(this);
            sb.append("SUCCESS, result=[");
            if (objZ == null) {
                sb.append("null");
            } else if (objZ == this) {
                sb.append("this future");
            } else {
                sb.append(objZ.getClass().getName());
                sb.append("@");
                sb.append(Integer.toHexString(System.identityHashCode(objZ)));
            }
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e2) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e2.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e3) {
            sb.append("FAILURE, cause=[");
            sb.append(e3.getCause());
            sb.append("]");
        }
    }

    private final void c(StringBuilder sb, Object obj) {
        try {
            if (obj == this) {
                sb.append("this future");
            } else {
                sb.append(obj);
            }
        } catch (RuntimeException | StackOverflowError e2) {
            sb.append("Exception thrown from implementation: ");
            sb.append(e2.getClass());
        }
    }

    private static void d(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e2) {
            Logger logger = f5789f;
            Level level = Level.SEVERE;
            String strValueOf = String.valueOf(runnable);
            String strValueOf2 = String.valueOf(executor);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 57 + strValueOf2.length());
            sb.append("RuntimeException while executing runnable ");
            sb.append(strValueOf);
            sb.append(" with executor ");
            sb.append(strValueOf2);
            logger.logp(level, "com.google.common.util.concurrent.AbstractFuture", "executeListener", sb.toString(), (Throwable) e2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final V e(Object obj) throws ExecutionException {
        if (obj instanceof h32) {
            Throwable th = ((h32) obj).f6284d;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof i32) {
            throw new ExecutionException(((i32) obj).f6471b);
        }
        if (obj == f5791h) {
            return null;
        }
        return obj;
    }

    private final void f(q32 q32Var) {
        q32Var.f8321b = null;
        while (true) {
            q32 q32Var2 = this.f5794k;
            if (q32Var2 != q32.a) {
                q32 q32Var3 = null;
                while (q32Var2 != null) {
                    q32 q32Var4 = q32Var2.f8322c;
                    if (q32Var2.f8321b != null) {
                        q32Var3 = q32Var2;
                    } else if (q32Var3 != null) {
                        q32Var3.f8322c = q32Var4;
                        if (q32Var3.f8321b == null) {
                            break;
                        }
                    } else if (!f5790g.c(this, q32Var2, q32Var4)) {
                        break;
                    }
                    q32Var2 = q32Var4;
                }
                return;
            }
            return;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static Object g(g52<?> g52Var) {
        Throwable thB;
        if (g52Var instanceof n32) {
            Object obj = ((f32) g52Var).f5792i;
            if (!(obj instanceof h32)) {
                return obj;
            }
            h32 h32Var = (h32) obj;
            if (!h32Var.f6283c) {
                return obj;
            }
            Throwable th = h32Var.f6284d;
            return th != null ? new h32(false, th) : h32.f6282b;
        }
        if ((g52Var instanceof z52) && (thB = ((z52) g52Var).b()) != null) {
            return new i32(thB);
        }
        boolean zIsCancelled = g52Var.isCancelled();
        if ((!f5788e) && zIsCancelled) {
            return h32.f6282b;
        }
        try {
            Object objZ = z(g52Var);
            if (!zIsCancelled) {
                return objZ == null ? f5791h : objZ;
            }
            String strValueOf = String.valueOf(g52Var);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 84);
            sb.append("get() did not throw CancellationException, despite reporting isCancelled() == true: ");
            sb.append(strValueOf);
            return new h32(false, new IllegalArgumentException(sb.toString()));
        } catch (CancellationException e2) {
            if (zIsCancelled) {
                return new h32(false, e2);
            }
            String strValueOf2 = String.valueOf(g52Var);
            StringBuilder sb2 = new StringBuilder(strValueOf2.length() + 77);
            sb2.append("get() threw CancellationException, despite reporting isCancelled() == false: ");
            sb2.append(strValueOf2);
            return new i32(new IllegalArgumentException(sb2.toString(), e2));
        } catch (ExecutionException e3) {
            if (!zIsCancelled) {
                return new i32(e3.getCause());
            }
            String strValueOf3 = String.valueOf(g52Var);
            StringBuilder sb3 = new StringBuilder(strValueOf3.length() + 84);
            sb3.append("get() did not throw CancellationException, despite reporting isCancelled() == true: ");
            sb3.append(strValueOf3);
            return new h32(false, new IllegalArgumentException(sb3.toString(), e3));
        } catch (Throwable th2) {
            return new i32(th2);
        }
    }

    private static <V> V z(Future<V> future) {
        V v;
        boolean z = false;
        while (true) {
            try {
                v = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return v;
    }

    @Override // com.google.android.gms.internal.ads.z52
    @NullableDecl
    protected final Throwable b() {
        if (!(this instanceof n32)) {
            return null;
        }
        Object obj = this.f5792i;
        if (obj instanceof i32) {
            return ((i32) obj).f6471b;
        }
        return null;
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        Object obj = this.f5792i;
        if (!(obj == null) && !(obj instanceof l32)) {
            return false;
        }
        h32 h32Var = f5788e ? new h32(z, new CancellationException("Future.cancel() was called.")) : z ? h32.a : h32.f6282b;
        boolean z2 = false;
        f32<V> f32Var = this;
        while (true) {
            if (f5790g.e(f32Var, obj, h32Var)) {
                if (z) {
                    f32Var.j();
                }
                A(f32Var);
                if (!(obj instanceof l32)) {
                    break;
                }
                g52<? extends V> g52Var = ((l32) obj).f7180f;
                if (!(g52Var instanceof n32)) {
                    g52Var.cancel(z);
                    break;
                }
                f32Var = (f32) g52Var;
                obj = f32Var.f5792i;
                if (!(obj == null) && !(obj instanceof l32)) {
                    break;
                }
                z2 = true;
            } else {
                obj = f32Var.f5792i;
                if (!(obj instanceof l32)) {
                    return z2;
                }
            }
        }
        return true;
    }

    @Override // java.util.concurrent.Future
    public V get() throws InterruptedException {
        Object obj;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.f5792i;
        if ((obj2 != null) && (!(obj2 instanceof l32))) {
            return (V) e(obj2);
        }
        q32 q32Var = this.f5794k;
        if (q32Var != q32.a) {
            q32 q32Var2 = new q32();
            do {
                g32 g32Var = f5790g;
                g32Var.b(q32Var2, q32Var);
                if (g32Var.c(this, q32Var, q32Var2)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            f(q32Var2);
                            throw new InterruptedException();
                        }
                        obj = this.f5792i;
                    } while (!((obj != null) & (!(obj instanceof l32))));
                    return (V) e(obj);
                }
                q32Var = this.f5794k;
            } while (q32Var != q32.a);
        }
        return (V) e(this.f5792i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NullableDecl
    protected String h() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        long delay = ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS);
        StringBuilder sb = new StringBuilder(41);
        sb.append("remaining delay=[");
        sb.append(delay);
        sb.append(" ms]");
        return sb.toString();
    }

    protected void i() {
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.f5792i instanceof h32;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return (!(r0 instanceof l32)) & (this.f5792i != null);
    }

    protected void j() {
    }

    protected final boolean k() {
        Object obj = this.f5792i;
        return (obj instanceof h32) && ((h32) obj).f6283c;
    }

    protected boolean l(@NullableDecl V v) {
        if (v == null) {
            v = (V) f5791h;
        }
        if (!f5790g.e(this, null, v)) {
            return false;
        }
        A(this);
        return true;
    }

    protected boolean m(Throwable th) {
        Objects.requireNonNull(th);
        if (!f5790g.e(this, null, new i32(th))) {
            return false;
        }
        A(this);
        return true;
    }

    protected final boolean n(g52<? extends V> g52Var) {
        i32 i32Var;
        Objects.requireNonNull(g52Var);
        Object obj = this.f5792i;
        if (obj == null) {
            if (g52Var.isDone()) {
                if (!f5790g.e(this, null, g(g52Var))) {
                    return false;
                }
                A(this);
                return true;
            }
            l32 l32Var = new l32(this, g52Var);
            if (f5790g.e(this, null, l32Var)) {
                try {
                    g52Var.zze(l32Var, m42.INSTANCE);
                } catch (Throwable th) {
                    try {
                        i32Var = new i32(th);
                    } catch (Throwable unused) {
                        i32Var = i32.a;
                    }
                    f5790g.e(this, l32Var, i32Var);
                }
                return true;
            }
            obj = this.f5792i;
        }
        if (obj instanceof h32) {
            g52Var.cancel(((h32) obj).f6283c);
        }
        return false;
    }

    final void o(@NullableDecl Future<?> future) {
        if ((future != null) && isCancelled()) {
            future.cancel(k());
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb.append(getClass().getSimpleName());
        } else {
            sb.append(getClass().getName());
        }
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            C(sb);
        } else {
            B(sb);
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.g52
    public void zze(Runnable runnable, Executor executor) {
        j32 j32Var;
        h12.b(runnable, "Runnable was null.");
        h12.b(executor, "Executor was null.");
        if (!isDone() && (j32Var = this.f5793j) != j32.a) {
            j32 j32Var2 = new j32(runnable, executor);
            do {
                j32Var2.f6674d = j32Var;
                if (f5790g.d(this, j32Var, j32Var2)) {
                    return;
                } else {
                    j32Var = this.f5793j;
                }
            } while (j32Var != j32.a);
        }
        d(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public V get(long j2, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j2);
        if (!Thread.interrupted()) {
            Object obj = this.f5792i;
            boolean z = true;
            if ((obj != null) & (!(obj instanceof l32))) {
                return (V) e(obj);
            }
            long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
            if (nanos >= 1000) {
                q32 q32Var = this.f5794k;
                if (q32Var != q32.a) {
                    q32 q32Var2 = new q32();
                    do {
                        g32 g32Var = f5790g;
                        g32Var.b(q32Var2, q32Var);
                        if (g32Var.c(this, q32Var, q32Var2)) {
                            do {
                                LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.f5792i;
                                    if ((obj2 != null) & (!(obj2 instanceof l32))) {
                                        return (V) e(obj2);
                                    }
                                    nanos = jNanoTime - System.nanoTime();
                                } else {
                                    f(q32Var2);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            f(q32Var2);
                        } else {
                            q32Var = this.f5794k;
                        }
                    } while (q32Var != q32.a);
                }
                return (V) e(this.f5792i);
            }
            while (nanos > 0) {
                Object obj3 = this.f5792i;
                if ((obj3 != null) & (!(obj3 instanceof l32))) {
                    return (V) e(obj3);
                }
                if (!Thread.interrupted()) {
                    nanos = jNanoTime - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String string = toString();
            String string2 = timeUnit.toString();
            Locale locale = Locale.ROOT;
            String lowerCase = string2.toLowerCase(locale);
            String lowerCase2 = timeUnit.toString().toLowerCase(locale);
            StringBuilder sb = new StringBuilder(String.valueOf(lowerCase2).length() + 28);
            sb.append("Waited ");
            sb.append(j2);
            sb.append(" ");
            sb.append(lowerCase2);
            String string3 = sb.toString();
            if (nanos + 1000 < 0) {
                String strConcat = String.valueOf(string3).concat(" (plus ");
                long j3 = -nanos;
                long jConvert = timeUnit.convert(j3, TimeUnit.NANOSECONDS);
                long nanos2 = j3 - timeUnit.toNanos(jConvert);
                if (jConvert != 0 && nanos2 <= 1000) {
                    z = false;
                }
                if (jConvert > 0) {
                    String strValueOf = String.valueOf(strConcat);
                    StringBuilder sb2 = new StringBuilder(strValueOf.length() + 21 + String.valueOf(lowerCase).length());
                    sb2.append(strValueOf);
                    sb2.append(jConvert);
                    sb2.append(" ");
                    sb2.append(lowerCase);
                    String string4 = sb2.toString();
                    if (z) {
                        string4 = String.valueOf(string4).concat(",");
                    }
                    strConcat = String.valueOf(string4).concat(" ");
                }
                if (z) {
                    String strValueOf2 = String.valueOf(strConcat);
                    StringBuilder sb3 = new StringBuilder(strValueOf2.length() + 33);
                    sb3.append(strValueOf2);
                    sb3.append(nanos2);
                    sb3.append(" nanoseconds ");
                    strConcat = sb3.toString();
                }
                string3 = String.valueOf(strConcat).concat("delay)");
            }
            if (isDone()) {
                throw new TimeoutException(String.valueOf(string3).concat(" but future completed as timeout expired"));
            }
            StringBuilder sb4 = new StringBuilder(String.valueOf(string3).length() + 5 + String.valueOf(string).length());
            sb4.append(string3);
            sb4.append(" for ");
            sb4.append(string);
            throw new TimeoutException(sb4.toString());
        }
        throw new InterruptedException();
    }
}