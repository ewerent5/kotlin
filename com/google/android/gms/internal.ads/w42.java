package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class w42<V> implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    final Future<V> f9890e;

    /* renamed from: f, reason: collision with root package name */
    final u42<? super V> f9891f;

    w42(Future<V> future, u42<? super V> u42Var) {
        this.f9890e = future;
        this.f9891f = u42Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Throwable thA;
        Future<V> future = this.f9890e;
        if ((future instanceof z52) && (thA = a62.a((z52) future)) != null) {
            this.f9891f.zza(thA);
            return;
        }
        try {
            this.f9891f.zzb(y42.p(this.f9890e));
        } catch (Error e2) {
            e = e2;
            this.f9891f.zza(e);
        } catch (RuntimeException e3) {
            e = e3;
            this.f9891f.zza(e);
        } catch (ExecutionException e4) {
            this.f9891f.zza(e4.getCause());
        }
    }

    public final String toString() {
        b12 b12VarA = c12.a(this);
        b12VarA.a(this.f9891f);
        return b12VarA.toString();
    }
}