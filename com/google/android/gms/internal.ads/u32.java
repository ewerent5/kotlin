package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
abstract class u32<I, O, F, T> extends o42<O> implements Runnable {

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f9371l = 0;

    /* renamed from: m, reason: collision with root package name */
    @NullableDecl
    g52<? extends I> f9372m;

    @NullableDecl
    F n;

    u32(g52<? extends I> g52Var, F f2) {
        Objects.requireNonNull(g52Var);
        this.f9372m = g52Var;
        Objects.requireNonNull(f2);
        this.n = f2;
    }

    abstract void E(@NullableDecl T t);

    @NullableDecl
    abstract T F(F f2, @NullableDecl I i2);

    @Override // com.google.android.gms.internal.ads.f32
    protected final String h() {
        String string;
        g52<? extends I> g52Var = this.f9372m;
        F f2 = this.n;
        String strH = super.h();
        if (g52Var != null) {
            String strValueOf = String.valueOf(g52Var);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 16);
            sb.append("inputFuture=[");
            sb.append(strValueOf);
            sb.append("], ");
            string = sb.toString();
        } else {
            string = "";
        }
        if (f2 == null) {
            if (strH == null) {
                return null;
            }
            String strValueOf2 = String.valueOf(string);
            return strH.length() != 0 ? strValueOf2.concat(strH) : new String(strValueOf2);
        }
        String strValueOf3 = String.valueOf(f2);
        StringBuilder sb2 = new StringBuilder(String.valueOf(string).length() + 11 + strValueOf3.length());
        sb2.append(string);
        sb2.append("function=[");
        sb2.append(strValueOf3);
        sb2.append("]");
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.f32
    protected final void i() {
        o(this.f9372m);
        this.f9372m = null;
        this.n = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        g52<? extends I> g52Var = this.f9372m;
        F f2 = this.n;
        if ((isCancelled() | (g52Var == null)) || (f2 == null)) {
            return;
        }
        this.f9372m = null;
        if (g52Var.isCancelled()) {
            n(g52Var);
            return;
        }
        try {
            try {
                Object objF = F(f2, y42.p(g52Var));
                this.n = null;
                E(objF);
            } catch (Throwable th) {
                try {
                    m(th);
                } finally {
                    this.n = null;
                }
            }
        } catch (Error e2) {
            m(e2);
        } catch (CancellationException unused) {
            cancel(false);
        } catch (RuntimeException e3) {
            m(e3);
        } catch (ExecutionException e4) {
            m(e4.getCause());
        }
    }
}