package e.c.b.b.c.e;

import j$.util.concurrent.ConcurrentHashMap;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.List;
import java.util.Vector;

/* compiled from: com.google.android.gms:play-services-measurement-base@@18.0.0 */
/* loaded from: classes.dex */
final class u5 {
    private final ConcurrentHashMap<t5, List<Throwable>> a = new ConcurrentHashMap<>(16, 0.75f, 10);

    /* renamed from: b, reason: collision with root package name */
    private final ReferenceQueue<Throwable> f14873b = new ReferenceQueue<>();

    u5() {
    }

    public final List<Throwable> a(Throwable th, boolean z) {
        Reference<? extends Throwable> referencePoll = this.f14873b.poll();
        while (referencePoll != null) {
            this.a.remove(referencePoll);
            referencePoll = this.f14873b.poll();
        }
        List<Throwable> list = (List) this.a.get(new t5(th, null));
        if (list != null) {
            return list;
        }
        Vector vector = new Vector(2);
        List<Throwable> list2 = (List) this.a.putIfAbsent(new t5(th, this.f14873b), vector);
        return list2 == null ? vector : list2;
    }
}