package com.google.android.gms.internal.ads;

import j$.util.concurrent.ConcurrentHashMap;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.List;
import java.util.Vector;

/* compiled from: com.google.android.gms:play-services-ads-base@@20.1.0 */
/* loaded from: classes.dex */
final class eh2 {
    private final ConcurrentHashMap<dh2, List<Throwable>> a = new ConcurrentHashMap<>(16, 0.75f, 10);

    /* renamed from: b, reason: collision with root package name */
    private final ReferenceQueue<Throwable> f5637b = new ReferenceQueue<>();

    eh2() {
    }

    public final List<Throwable> a(Throwable th, boolean z) {
        ReferenceQueue<Throwable> referenceQueue = this.f5637b;
        while (true) {
            Reference<? extends Throwable> referencePoll = referenceQueue.poll();
            if (referencePoll == null) {
                break;
            }
            this.a.remove(referencePoll);
            referenceQueue = this.f5637b;
        }
        List<Throwable> list = (List) this.a.get(new dh2(th, null));
        if (!z || list != null) {
            return list;
        }
        Vector vector = new Vector(2);
        List<Throwable> list2 = (List) this.a.putIfAbsent(new dh2(th, this.f5637b), vector);
        return list2 == null ? vector : list2;
    }
}