package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingQueue;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class qe implements c0 {
    private final Map<String, List<d1<?>>> a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final jy2 f8361b;

    /* renamed from: c, reason: collision with root package name */
    private final BlockingQueue<d1<?>> f8362c;

    /* renamed from: d, reason: collision with root package name */
    private final o33 f8363d;

    /* JADX WARN: Multi-variable type inference failed */
    qe(jy2 jy2Var, jy2 jy2Var2, BlockingQueue<d1<?>> blockingQueue, o33 o33Var) {
        this.f8363d = blockingQueue;
        this.f8361b = jy2Var;
        this.f8362c = jy2Var2;
    }

    @Override // com.google.android.gms.internal.ads.c0
    public final synchronized void a(d1<?> d1Var) {
        String strZzi = d1Var.zzi();
        List<d1<?>> listRemove = this.a.remove(strZzi);
        if (listRemove == null || listRemove.isEmpty()) {
            return;
        }
        if (pd.f8137b) {
            pd.a("%d waiting requests for cacheKey=%s; resend to network", Integer.valueOf(listRemove.size()), strZzi);
        }
        d1<?> d1VarRemove = listRemove.remove(0);
        this.a.put(strZzi, listRemove);
        d1VarRemove.zzu(this);
        try {
            this.f8362c.put(d1VarRemove);
        } catch (InterruptedException e2) {
            pd.c("Couldn't add request to queue. %s", e2.toString());
            Thread.currentThread().interrupt();
            this.f8361b.a();
        }
    }

    @Override // com.google.android.gms.internal.ads.c0
    public final void b(d1<?> d1Var, j7<?> j7Var) {
        List<d1<?>> listRemove;
        gv2 gv2Var = j7Var.f6700b;
        if (gv2Var == null || gv2Var.a(System.currentTimeMillis())) {
            a(d1Var);
            return;
        }
        String strZzi = d1Var.zzi();
        synchronized (this) {
            listRemove = this.a.remove(strZzi);
        }
        if (listRemove != null) {
            if (pd.f8137b) {
                pd.a("Releasing %d waiting requests for cacheKey=%s.", Integer.valueOf(listRemove.size()), strZzi);
            }
            Iterator<d1<?>> it = listRemove.iterator();
            while (it.hasNext()) {
                this.f8363d.a(it.next(), j7Var, null);
            }
        }
    }

    final synchronized boolean c(d1<?> d1Var) {
        String strZzi = d1Var.zzi();
        if (!this.a.containsKey(strZzi)) {
            this.a.put(strZzi, null);
            d1Var.zzu(this);
            if (pd.f8137b) {
                pd.b("new request, sending to network %s", strZzi);
            }
            return false;
        }
        List<d1<?>> arrayList = this.a.get(strZzi);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        d1Var.zzc("waiting-for-response");
        arrayList.add(d1Var);
        this.a.put(strZzi, arrayList);
        if (pd.f8137b) {
            pd.b("Request for cacheKey=%s is in flight, putting on hold.", strZzi);
        }
        return true;
    }
}