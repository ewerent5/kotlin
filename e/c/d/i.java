package e.c.d;

import j$.lang.Iterable;
import j$.util.Spliterator;
import j$.util.function.Consumer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: JsonArray.java */
/* loaded from: classes.dex */
public final class i extends l implements Iterable<l>, Iterable {

    /* renamed from: e, reason: collision with root package name */
    private final List<l> f15449e = new ArrayList();

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof i) && ((i) obj).f15449e.equals(this.f15449e));
    }

    @Override // e.c.d.l
    public String f() {
        if (this.f15449e.size() == 1) {
            return this.f15449e.get(0).f();
        }
        throw new IllegalStateException();
    }

    @Override // j$.lang.Iterable
    public /* synthetic */ void forEach(Consumer consumer) {
        Iterable.CC.$default$forEach(this, consumer);
    }

    public int hashCode() {
        return this.f15449e.hashCode();
    }

    @Override // java.lang.Iterable, j$.lang.Iterable
    public Iterator<l> iterator() {
        return this.f15449e.iterator();
    }

    public void n(l lVar) {
        if (lVar == null) {
            lVar = n.a;
        }
        this.f15449e.add(lVar);
    }

    @Override // java.lang.Iterable, j$.lang.Iterable
    public /* synthetic */ Spliterator spliterator() {
        return j$.util.v.o(iterator(), 0);
    }
}