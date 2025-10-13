package k.c.f;

import j$.lang.Iterable;
import j$.util.Iterator;
import j$.util.Spliterator;
import j$.util.function.Consumer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: MapTileAreaList.java */
/* loaded from: classes3.dex */
public class j implements l, Iterable, Iterable {

    /* renamed from: e, reason: collision with root package name */
    private final List<g> f16756e = new ArrayList();

    /* compiled from: MapTileAreaList.java */
    class a implements Iterator<Long>, j$.util.Iterator {

        /* renamed from: e, reason: collision with root package name */
        private int f16757e;

        /* renamed from: f, reason: collision with root package name */
        private Iterator<Long> f16758f;

        a() {
        }

        private Iterator<Long> a() {
            Iterator<Long> it = this.f16758f;
            if (it != null) {
                return it;
            }
            if (this.f16757e >= j.this.f16756e.size()) {
                return null;
            }
            List list = j.this.f16756e;
            int i2 = this.f16757e;
            this.f16757e = i2 + 1;
            Iterator<Long> it2 = ((g) list.get(i2)).iterator();
            this.f16758f = it2;
            return it2;
        }

        @Override // java.util.Iterator, j$.util.Iterator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Long next() {
            long jLongValue = a().next().longValue();
            if (!a().hasNext()) {
                this.f16758f = null;
            }
            return Long.valueOf(jLongValue);
        }

        @Override // j$.util.Iterator
        public /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public boolean hasNext() {
            java.util.Iterator<Long> itA = a();
            return itA != null && itA.hasNext();
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public List<g> c() {
        return this.f16756e;
    }

    @Override // k.c.f.l
    public boolean e(long j2) {
        java.util.Iterator<g> it = this.f16756e.iterator();
        while (it.hasNext()) {
            if (it.next().e(j2)) {
                return true;
            }
        }
        return false;
    }

    @Override // j$.lang.Iterable
    public /* synthetic */ void forEach(Consumer consumer) {
        Iterable.CC.$default$forEach(this, consumer);
    }

    @Override // j$.lang.Iterable
    public java.util.Iterator<Long> iterator() {
        return new a();
    }

    public int size() {
        java.util.Iterator<g> it = this.f16756e.iterator();
        int size = 0;
        while (it.hasNext()) {
            size += it.next().size();
        }
        return size;
    }

    @Override // j$.lang.Iterable
    public /* synthetic */ Spliterator spliterator() {
        return j$.util.v.o(iterator(), 0);
    }
}