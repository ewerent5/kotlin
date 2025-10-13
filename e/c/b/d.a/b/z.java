package e.c.b.d.a.b;

import j$.util.concurrent.ConcurrentHashMap;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.List;
import java.util.Vector;

/* loaded from: classes.dex */
final class z {
    private final ConcurrentHashMap<y, List<Throwable>> a = new ConcurrentHashMap<>(16, 0.75f, 10);

    /* renamed from: b, reason: collision with root package name */
    private final ReferenceQueue<Throwable> f15362b = new ReferenceQueue<>();

    z() {
    }

    public final List<Throwable> a(Throwable th) {
        while (true) {
            Reference<? extends Throwable> referencePoll = this.f15362b.poll();
            if (referencePoll == null) {
                break;
            }
            this.a.remove(referencePoll);
        }
        List<Throwable> list = (List) this.a.get(new y(th, null));
        if (list != null) {
            return list;
        }
        Vector vector = new Vector(2);
        List<Throwable> list2 = (List) this.a.putIfAbsent(new y(th, this.f15362b), vector);
        return list2 == null ? vector : list2;
    }
}