package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class r52<V> implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    @NullableDecl
    t52<V> f8593e;

    r52(t52<V> t52Var) {
        this.f8593e = t52Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        g52<? extends V> g52Var;
        t52<V> t52Var = this.f8593e;
        if (t52Var == null || (g52Var = ((t52) t52Var).f9081l) == null) {
            return;
        }
        this.f8593e = null;
        if (g52Var.isDone()) {
            t52Var.n(g52Var);
            return;
        }
        try {
            ScheduledFuture scheduledFuture = ((t52) t52Var).f9082m;
            t52.H(t52Var, null);
            String string = "Timed out";
            if (scheduledFuture != null) {
                try {
                    long jAbs = Math.abs(scheduledFuture.getDelay(TimeUnit.MILLISECONDS));
                    if (jAbs > 10) {
                        StringBuilder sb = new StringBuilder(75);
                        sb.append("Timed out");
                        sb.append(" (timeout delayed by ");
                        sb.append(jAbs);
                        sb.append(" ms after scheduled time)");
                        string = sb.toString();
                    }
                } catch (Throwable th) {
                    t52Var.m(new s52(string, null));
                    throw th;
                }
            }
            String strValueOf = String.valueOf(string);
            String strValueOf2 = String.valueOf(g52Var);
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 2 + strValueOf2.length());
            sb2.append(strValueOf);
            sb2.append(": ");
            sb2.append(strValueOf2);
            t52Var.m(new s52(sb2.toString(), null));
        } finally {
            g52Var.cancel(true);
        }
    }
}