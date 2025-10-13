package i.t;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

/* compiled from: _Collections.kt */
/* loaded from: classes3.dex */
public class t extends s {

    /* compiled from: Sequences.kt */
    public static final class a<T> implements i.c0.d<T> {
        final /* synthetic */ Iterable a;

        public a(Iterable iterable) {
            this.a = iterable;
        }

        @Override // i.c0.d
        public Iterator<T> iterator() {
            return this.a.iterator();
        }
    }

    public static /* synthetic */ String A(Iterable iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i2, CharSequence charSequence4, i.y.c.l lVar, int i3, Object obj) {
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
        return z(iterable, charSequence, charSequence5, charSequence6, i4, charSequence7, lVar);
    }

    public static <T> T B(List<? extends T> list) {
        i.y.d.l.d(list, "$this$last");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(l.g(list));
    }

    public static <T extends Comparable<? super T>> T C(Iterable<? extends T> iterable) {
        i.y.d.l.d(iterable, "$this$minOrNull");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            if (next.compareTo(next2) > 0) {
                next = next2;
            }
        }
        return next;
    }

    public static <T> List<T> D(Collection<? extends T> collection, Iterable<? extends T> iterable) {
        i.y.d.l.d(collection, "$this$plus");
        i.y.d.l.d(iterable, "elements");
        if (!(iterable instanceof Collection)) {
            ArrayList arrayList = new ArrayList(collection);
            q.q(arrayList, iterable);
            return arrayList;
        }
        Collection collection2 = (Collection) iterable;
        ArrayList arrayList2 = new ArrayList(collection.size() + collection2.size());
        arrayList2.addAll(collection);
        arrayList2.addAll(collection2);
        return arrayList2;
    }

    public static <T> List<T> E(Collection<? extends T> collection, T t) {
        i.y.d.l.d(collection, "$this$plus");
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(t);
        return arrayList;
    }

    public static <T> T F(Iterable<? extends T> iterable) {
        i.y.d.l.d(iterable, "$this$single");
        if (iterable instanceof List) {
            return (T) G((List) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        T next = it.next();
        if (it.hasNext()) {
            throw new IllegalArgumentException("Collection has more than one element.");
        }
        return next;
    }

    public static final <T> T G(List<? extends T> list) {
        i.y.d.l.d(list, "$this$single");
        int size = list.size();
        if (size == 0) {
            throw new NoSuchElementException("List is empty.");
        }
        if (size == 1) {
            return list.get(0);
        }
        throw new IllegalArgumentException("List has more than one element.");
    }

    public static final <T> List<T> H(Iterable<? extends T> iterable, int i2) {
        i.y.d.l.d(iterable, "$this$take");
        int i3 = 0;
        if (!(i2 >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i2 + " is less than zero.").toString());
        }
        if (i2 == 0) {
            return l.f();
        }
        if (iterable instanceof Collection) {
            if (i2 >= ((Collection) iterable).size()) {
                return J(iterable);
            }
            if (i2 == 1) {
                return k.b(u(iterable));
            }
        }
        ArrayList arrayList = new ArrayList(i2);
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
            i3++;
            if (i3 == i2) {
                break;
            }
        }
        return l.k(arrayList);
    }

    public static final <T, C extends Collection<? super T>> C I(Iterable<? extends T> iterable, C c2) {
        i.y.d.l.d(iterable, "$this$toCollection");
        i.y.d.l.d(c2, "destination");
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            c2.add(it.next());
        }
        return c2;
    }

    public static <T> List<T> J(Iterable<? extends T> iterable) {
        i.y.d.l.d(iterable, "$this$toList");
        if (!(iterable instanceof Collection)) {
            return l.k(K(iterable));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return l.f();
        }
        if (size != 1) {
            return L(collection);
        }
        return k.b(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
    }

    public static final <T> List<T> K(Iterable<? extends T> iterable) {
        i.y.d.l.d(iterable, "$this$toMutableList");
        return iterable instanceof Collection ? L((Collection) iterable) : (List) I(iterable, new ArrayList());
    }

    public static <T> List<T> L(Collection<? extends T> collection) {
        i.y.d.l.d(collection, "$this$toMutableList");
        return new ArrayList(collection);
    }

    public static <T> Set<T> M(Iterable<? extends T> iterable) {
        i.y.d.l.d(iterable, "$this$toSet");
        if (!(iterable instanceof Collection)) {
            return g0.c((Set) I(iterable, new LinkedHashSet()));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return g0.b();
        }
        if (size != 1) {
            return (Set) I(iterable, new LinkedHashSet(b0.a(collection.size())));
        }
        return f0.a(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
    }

    public static <T> i.c0.d<T> s(Iterable<? extends T> iterable) {
        i.y.d.l.d(iterable, "$this$asSequence");
        return new a(iterable);
    }

    public static <T> List<T> t(List<? extends T> list, int i2) {
        i.y.d.l.d(list, "$this$dropLast");
        if (i2 >= 0) {
            return H(list, i.a0.f.b(list.size() - i2, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i2 + " is less than zero.").toString());
    }

    public static final <T> T u(Iterable<? extends T> iterable) {
        i.y.d.l.d(iterable, "$this$first");
        if (iterable instanceof List) {
            return (T) j.v((List) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static <T> T v(List<? extends T> list) {
        i.y.d.l.d(list, "$this$first");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(0);
    }

    public static <T> T w(List<? extends T> list) {
        i.y.d.l.d(list, "$this$firstOrNull");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static final <T, A extends Appendable> A x(Iterable<? extends T> iterable, A a2, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i2, CharSequence charSequence4, i.y.c.l<? super T, ? extends CharSequence> lVar) throws IOException {
        i.y.d.l.d(iterable, "$this$joinTo");
        i.y.d.l.d(a2, "buffer");
        i.y.d.l.d(charSequence, "separator");
        i.y.d.l.d(charSequence2, "prefix");
        i.y.d.l.d(charSequence3, "postfix");
        i.y.d.l.d(charSequence4, "truncated");
        a2.append(charSequence2);
        int i3 = 0;
        for (T t : iterable) {
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

    public static final <T> String z(Iterable<? extends T> iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i2, CharSequence charSequence4, i.y.c.l<? super T, ? extends CharSequence> lVar) {
        i.y.d.l.d(iterable, "$this$joinToString");
        i.y.d.l.d(charSequence, "separator");
        i.y.d.l.d(charSequence2, "prefix");
        i.y.d.l.d(charSequence3, "postfix");
        i.y.d.l.d(charSequence4, "truncated");
        String string = ((StringBuilder) x(iterable, new StringBuilder(), charSequence, charSequence2, charSequence3, i2, charSequence4, lVar)).toString();
        i.y.d.l.c(string, "joinTo(StringBuilder(), …ed, transform).toString()");
        return string;
    }
}