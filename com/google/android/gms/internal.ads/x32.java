package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
abstract class x32<InputT, OutputT> extends c42<OutputT> {
    private static final Logger p = Logger.getLogger(x32.class.getName());

    @NullableDecl
    private y12<? extends g52<? extends InputT>> q;
    private final boolean r;
    private final boolean s;

    x32(y12<? extends g52<? extends InputT>> y12Var, boolean z, boolean z2) {
        super(y12Var.size());
        this.q = y12Var;
        this.r = z;
        this.s = z2;
    }

    static /* synthetic */ void K(x32 x32Var, y12 y12Var) {
        int iE = x32Var.E();
        if (iE < 0) {
            throw new IllegalStateException("Less than 0 remaining futures");
        }
        if (iE == 0) {
            if (y12Var != null) {
                w22 it = y12Var.iterator();
                int i2 = 0;
                while (it.hasNext()) {
                    Future<? extends InputT> future = (Future) it.next();
                    if (!future.isCancelled()) {
                        x32Var.O(i2, future);
                    }
                    i2++;
                }
            }
            x32Var.F();
            x32Var.S();
            x32Var.L(2);
        }
    }

    private final void M(Throwable th) {
        Objects.requireNonNull(th);
        if (this.r && !m(th) && P(D(), th)) {
            N(th);
        } else if (th instanceof Error) {
            N(th);
        }
    }

    private static void N(Throwable th) {
        p.logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFuture", "log", true != (th instanceof Error) ? "Got more than one input Future failure. Logging failures after the first" : "Input Future failed with Error", th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void O(int i2, Future<? extends InputT> future) {
        try {
            R(i2, y42.p(future));
        } catch (ExecutionException e2) {
            M(e2.getCause());
        } catch (Throwable th) {
            M(th);
        }
    }

    private static boolean P(Set<Throwable> set, Throwable th) {
        while (th != null) {
            if (!set.add(th)) {
                return false;
            }
            th = th.getCause();
        }
        return true;
    }

    static /* synthetic */ y12 T(x32 x32Var, y12 y12Var) {
        x32Var.q = null;
        return null;
    }

    @Override // com.google.android.gms.internal.ads.c42
    final void J(Set<Throwable> set) {
        Objects.requireNonNull(set);
        if (isCancelled()) {
            return;
        }
        P(set, b());
    }

    void L(int i2) {
        this.q = null;
    }

    final void Q() {
        if (this.q.isEmpty()) {
            S();
            return;
        }
        if (!this.r) {
            w32 w32Var = new w32(this, this.s ? this.q : null);
            w22<? extends g52<? extends InputT>> it = this.q.iterator();
            while (it.hasNext()) {
                it.next().zze(w32Var, m42.INSTANCE);
            }
            return;
        }
        w22<? extends g52<? extends InputT>> it2 = this.q.iterator();
        int i2 = 0;
        while (it2.hasNext()) {
            g52<? extends InputT> next = it2.next();
            next.zze(new v32(this, next, i2), m42.INSTANCE);
            i2++;
        }
    }

    abstract void R(int i2, @NullableDecl InputT inputt);

    abstract void S();

    @Override // com.google.android.gms.internal.ads.f32
    protected final String h() {
        y12<? extends g52<? extends InputT>> y12Var = this.q;
        if (y12Var == null) {
            return super.h();
        }
        String strValueOf = String.valueOf(y12Var);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 8);
        sb.append("futures=");
        sb.append(strValueOf);
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.f32
    protected final void i() {
        y12<? extends g52<? extends InputT>> y12Var = this.q;
        L(1);
        if ((y12Var != null) && isCancelled()) {
            boolean zK = k();
            w22<? extends g52<? extends InputT>> it = y12Var.iterator();
            while (it.hasNext()) {
                it.next().cancel(zK);
            }
        }
    }
}