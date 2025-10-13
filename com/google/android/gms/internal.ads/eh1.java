package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzs;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class eh1<T> {
    private final Set<ah1<? extends zg1<T>>> a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f5636b;

    public eh1(Executor executor, Set<ah1<? extends zg1<T>>> set) {
        this.f5636b = executor;
        this.a = set;
    }

    public final g52<T> a(final T t) {
        final ArrayList arrayList = new ArrayList(this.a.size());
        for (final ah1<? extends zg1<T>> ah1Var : this.a) {
            g52<S> g52VarZza = ah1Var.zza();
            if (m5.a.e().booleanValue()) {
                final long jC = zzs.zzj().c();
                g52VarZza.zze(new Runnable(ah1Var, jC) { // from class: com.google.android.gms.internal.ads.ch1

                    /* renamed from: e, reason: collision with root package name */
                    private final ah1 f5317e;

                    /* renamed from: f, reason: collision with root package name */
                    private final long f5318f;

                    {
                        this.f5317e = ah1Var;
                        this.f5318f = jC;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        ah1 ah1Var2 = this.f5317e;
                        long j2 = this.f5318f;
                        String canonicalName = ah1Var2.getClass().getCanonicalName();
                        long jC2 = zzs.zzj().c();
                        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 40);
                        sb.append("Signal runtime : ");
                        sb.append(canonicalName);
                        sb.append(" = ");
                        sb.append(jC2 - j2);
                        zze.zza(sb.toString());
                    }
                }, qr.f8451f);
            }
            arrayList.add(g52VarZza);
        }
        return y42.n(arrayList).a(new Callable(arrayList, t) { // from class: com.google.android.gms.internal.ads.dh1
            private final List a;

            /* renamed from: b, reason: collision with root package name */
            private final Object f5473b;

            {
                this.a = arrayList;
                this.f5473b = t;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                List list = this.a;
                Object obj = this.f5473b;
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    zg1 zg1Var = (zg1) ((g52) it.next()).get();
                    if (zg1Var != null) {
                        zg1Var.a(obj);
                    }
                }
                return obj;
            }
        }, this.f5636b);
    }
}