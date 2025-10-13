package com.google.android.gms.internal.ads;

import java.lang.Throwable;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
abstract class e32<V, X extends Throwable, F, T> extends o42<V> implements Runnable {

    /* renamed from: l, reason: collision with root package name */
    @NullableDecl
    g52<? extends V> f5570l;

    /* renamed from: m, reason: collision with root package name */
    @NullableDecl
    Class<X> f5571m;

    @NullableDecl
    F n;

    e32(g52<? extends V> g52Var, Class<X> cls, F f2) {
        Objects.requireNonNull(g52Var);
        this.f5570l = g52Var;
        this.f5571m = cls;
        Objects.requireNonNull(f2);
        this.n = f2;
    }

    abstract void E(@NullableDecl T t);

    @NullableDecl
    abstract T F(F f2, X x);

    @Override // com.google.android.gms.internal.ads.f32
    protected final String h() {
        String string;
        g52<? extends V> g52Var = this.f5570l;
        Class<X> cls = this.f5571m;
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
        if (cls == null || f2 == null) {
            if (strH == null) {
                return null;
            }
            String strValueOf2 = String.valueOf(string);
            return strH.length() != 0 ? strValueOf2.concat(strH) : new String(strValueOf2);
        }
        String strValueOf3 = String.valueOf(cls);
        String strValueOf4 = String.valueOf(f2);
        StringBuilder sb2 = new StringBuilder(String.valueOf(string).length() + 29 + strValueOf3.length() + strValueOf4.length());
        sb2.append(string);
        sb2.append("exceptionType=[");
        sb2.append(strValueOf3);
        sb2.append("], fallback=[");
        sb2.append(strValueOf4);
        sb2.append("]");
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.f32
    protected final void i() {
        o(this.f5570l);
        this.f5570l = null;
        this.f5571m = null;
        this.n = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v4, types: [F, java.lang.Class<X extends java.lang.Throwable>] */
    @Override // java.lang.Runnable
    public final void run() {
        g52<? extends V> g52Var = this.f5570l;
        Class<X> cls = this.f5571m;
        F f2 = this.n;
        if (((f2 == null) || ((g52Var == 0) | (cls == null))) || isCancelled()) {
            return;
        }
        ?? r3 = (Class<X>) null;
        this.f5570l = null;
        try {
            th = g52Var instanceof z52 ? ((z52) g52Var).b() : null;
        } catch (ExecutionException e2) {
            Throwable cause = e2.getCause();
            if (cause == null) {
                String strValueOf = String.valueOf(g52Var.getClass());
                String strValueOf2 = String.valueOf(e2.getClass());
                StringBuilder sb = new StringBuilder(strValueOf.length() + 35 + strValueOf2.length());
                sb.append("Future type ");
                sb.append(strValueOf);
                sb.append(" threw ");
                sb.append(strValueOf2);
                sb.append(" without a cause");
                cause = new NullPointerException(sb.toString());
            }
            th = cause;
        } catch (Throwable th) {
            th = th;
        }
        Object objP = th == null ? y42.p(g52Var) : null;
        if (th == null) {
            l(objP);
            return;
        }
        if (!cls.isInstance(th)) {
            n(g52Var);
            return;
        }
        try {
            Object objF = F(f2, th);
            this.f5571m = null;
            this.n = null;
            E(objF);
        } catch (Throwable th2) {
            try {
                m(th2);
            } finally {
                this.f5571m = null;
                this.n = null;
            }
        }
    }
}