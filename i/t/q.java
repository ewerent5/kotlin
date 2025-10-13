package i.t;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MutableCollections.kt */
/* loaded from: classes3.dex */
public class q extends p {
    public static <T> boolean q(Collection<? super T> collection, Iterable<? extends T> iterable) {
        i.y.d.l.d(collection, "$this$addAll");
        i.y.d.l.d(iterable, "elements");
        if (iterable instanceof Collection) {
            return collection.addAll((Collection) iterable);
        }
        boolean z = false;
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            if (collection.add(it.next())) {
                z = true;
            }
        }
        return z;
    }

    public static <T> boolean r(Collection<? super T> collection, T[] tArr) {
        i.y.d.l.d(collection, "$this$addAll");
        i.y.d.l.d(tArr, "elements");
        return collection.addAll(g.b(tArr));
    }
}