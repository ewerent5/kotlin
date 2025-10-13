package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzs;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public class sf0<ListenerT> {

    /* renamed from: e, reason: collision with root package name */
    @GuardedBy("this")
    protected final Map<ListenerT, Executor> f8860e = new HashMap();

    protected sf0(Set<nh0<ListenerT>> set) {
        I0(set);
    }

    public final synchronized void G0(nh0<ListenerT> nh0Var) {
        H0(nh0Var.a, nh0Var.f7705b);
    }

    public final synchronized void H0(ListenerT listenert, Executor executor) {
        this.f8860e.put(listenert, executor);
    }

    public final synchronized void I0(Set<nh0<ListenerT>> set) {
        Iterator<nh0<ListenerT>> it = set.iterator();
        while (it.hasNext()) {
            G0(it.next());
        }
    }

    protected final synchronized void J0(final rf0<ListenerT> rf0Var) {
        for (Map.Entry<ListenerT, Executor> entry : this.f8860e.entrySet()) {
            final ListenerT key = entry.getKey();
            entry.getValue().execute(new Runnable(rf0Var, key) { // from class: com.google.android.gms.internal.ads.qf0

                /* renamed from: e, reason: collision with root package name */
                private final rf0 f8367e;

                /* renamed from: f, reason: collision with root package name */
                private final Object f8368f;

                {
                    this.f8367e = rf0Var;
                    this.f8368f = key;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        this.f8367e.zza(this.f8368f);
                    } catch (Throwable th) {
                        zzs.zzg().h(th, "EventEmitter.notify");
                        zze.zzb("Event emitter exception.", th);
                    }
                }
            });
        }
    }
}