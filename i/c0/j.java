package i.c0;

import i.y.d.l;
import j$.lang.Iterable;
import j$.util.Spliterator;
import j$.util.function.Consumer;
import j$.util.v;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* compiled from: _Sequences.kt */
/* loaded from: classes3.dex */
public class j extends i {

    /* compiled from: Iterables.kt */
    public static final class a<T> implements Iterable<T>, i.y.d.z.a, Iterable {

        /* renamed from: e */
        final /* synthetic */ d f15787e;

        public a(d dVar) {
            this.f15787e = dVar;
        }

        @Override // j$.lang.Iterable
        public /* synthetic */ void forEach(Consumer consumer) {
            Iterable.CC.$default$forEach(this, consumer);
        }

        @Override // java.lang.Iterable, j$.lang.Iterable
        public Iterator<T> iterator() {
            return this.f15787e.iterator();
        }

        @Override // java.lang.Iterable, j$.lang.Iterable
        public /* synthetic */ Spliterator spliterator() {
            return v.o(iterator(), 0);
        }
    }

    public static <T> Iterable<T> c(d<? extends T> dVar) {
        l.d(dVar, "$this$asIterable");
        return new a(dVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> d<T> d(d<? extends T> dVar, int i2) {
        l.d(dVar, "$this$drop");
        if (i2 >= 0) {
            return i2 == 0 ? dVar : dVar instanceof c ? ((c) dVar).a(i2) : new b(dVar, i2);
        }
        throw new IllegalArgumentException(("Requested element count " + i2 + " is less than zero.").toString());
    }

    public static final <T, A extends Appendable> A e(d<? extends T> dVar, A a2, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i2, CharSequence charSequence4, i.y.c.l<? super T, ? extends CharSequence> lVar) throws IOException {
        l.d(dVar, "$this$joinTo");
        l.d(a2, "buffer");
        l.d(charSequence, "separator");
        l.d(charSequence2, "prefix");
        l.d(charSequence3, "postfix");
        l.d(charSequence4, "truncated");
        a2.append(charSequence2);
        int i3 = 0;
        for (T t : dVar) {
            i3++;
            if (i3 > 1) {
                a2.append(charSequence);
            }
            if (i2 >= 0 && i3 > i2) {
                break;
            }
            i.d0.h.a(a2, t, lVar);
        }
        if (i2 >= 0 && i3 > i2) {
            a2.append(charSequence4);
        }
        a2.append(charSequence3);
        return a2;
    }

    public static final <T> String f(d<? extends T> dVar, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i2, CharSequence charSequence4, i.y.c.l<? super T, ? extends CharSequence> lVar) {
        l.d(dVar, "$this$joinToString");
        l.d(charSequence, "separator");
        l.d(charSequence2, "prefix");
        l.d(charSequence3, "postfix");
        l.d(charSequence4, "truncated");
        String string = ((StringBuilder) e(dVar, new StringBuilder(), charSequence, charSequence2, charSequence3, i2, charSequence4, lVar)).toString();
        l.c(string, "joinTo(StringBuilder(), …ed, transform).toString()");
        return string;
    }

    public static /* synthetic */ String g(d dVar, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i2, CharSequence charSequence4, i.y.c.l lVar, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = (i3 & 2) != 0 ? "" : charSequence2;
        CharSequence charSequence6 = (i3 & 4) == 0 ? charSequence3 : "";
        int i4 = (i3 & 8) != 0 ? -1 : i2;
        if ((i3 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i3 & 32) != 0) {
            lVar = null;
        }
        return f(dVar, charSequence, charSequence5, charSequence6, i4, charSequence7, lVar);
    }

    public static <T, R> d<R> h(d<? extends T> dVar, i.y.c.l<? super T, ? extends R> lVar) {
        l.d(dVar, "$this$map");
        l.d(lVar, "transform");
        return new k(dVar, lVar);
    }

    public static final <T, C extends Collection<? super T>> C i(d<? extends T> dVar, C c2) {
        l.d(dVar, "$this$toCollection");
        l.d(c2, "destination");
        Iterator<? extends T> it = dVar.iterator();
        while (it.hasNext()) {
            c2.add(it.next());
        }
        return c2;
    }

    public static <T> List<T> j(d<? extends T> dVar) {
        l.d(dVar, "$this$toList");
        return i.t.l.k(k(dVar));
    }

    public static final <T> List<T> k(d<? extends T> dVar) {
        l.d(dVar, "$this$toMutableList");
        return (List) i(dVar, new ArrayList());
    }
}