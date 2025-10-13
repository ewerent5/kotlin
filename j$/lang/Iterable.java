package j$.lang;

import j$.util.DesugarCollections;
import j$.util.Spliterator;
import j$.util.function.Consumer;
import java.util.Iterator;
import java.util.Objects;

/* loaded from: classes2.dex */
public interface Iterable<T> {

    /* renamed from: j$.lang.Iterable$-CC */
    public final /* synthetic */ class CC {
        public static void $default$forEach(java.lang.Iterable iterable, Consumer consumer) {
            if (DesugarCollections.a.isInstance(iterable)) {
                DesugarCollections.c(iterable, consumer);
                return;
            }
            Objects.requireNonNull(consumer);
            Iterator<T> it = iterable.iterator();
            while (it.hasNext()) {
                consumer.accept(it.next());
            }
        }
    }

    void forEach(Consumer consumer);

    Iterator iterator();

    Spliterator spliterator();
}