package k.c.f;

import android.graphics.Rect;
import j$.lang.Iterable;
import j$.util.Iterator;
import j$.util.Spliterator;
import j$.util.function.Consumer;
import java.util.Iterator;

/* compiled from: MapTileArea.java */
/* loaded from: classes3.dex */
public class g implements l, Iterable, Iterable {

    /* renamed from: e, reason: collision with root package name */
    private int f16748e;

    /* renamed from: f, reason: collision with root package name */
    private int f16749f;

    /* renamed from: g, reason: collision with root package name */
    private int f16750g;

    /* renamed from: h, reason: collision with root package name */
    private int f16751h;

    /* renamed from: i, reason: collision with root package name */
    private int f16752i;

    /* renamed from: j, reason: collision with root package name */
    private int f16753j;

    /* compiled from: MapTileArea.java */
    class a implements Iterator<Long>, j$.util.Iterator {

        /* renamed from: e, reason: collision with root package name */
        private int f16754e;

        a() {
        }

        @Override // java.util.Iterator, j$.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Long next() {
            if (!hasNext()) {
                return null;
            }
            int i2 = g.this.f16749f + (this.f16754e % g.this.f16751h);
            int i3 = g.this.f16750g + (this.f16754e / g.this.f16751h);
            this.f16754e++;
            while (i2 >= g.this.f16753j) {
                i2 -= g.this.f16753j;
            }
            while (i3 >= g.this.f16753j) {
                i3 -= g.this.f16753j;
            }
            return Long.valueOf(m.b(g.this.f16748e, i2, i3));
        }

        @Override // j$.util.Iterator
        public /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public boolean hasNext() {
            return this.f16754e < g.this.size();
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    private int l(int i2) {
        while (i2 < 0) {
            i2 += this.f16753j;
        }
        while (true) {
            int i3 = this.f16753j;
            if (i2 < i3) {
                return i2;
            }
            i2 -= i3;
        }
    }

    private int m(int i2, int i3) {
        while (i2 > i3) {
            i3 += this.f16753j;
        }
        return Math.min(this.f16753j, (i3 - i2) + 1);
    }

    private boolean n(int i2, int i3, int i4) {
        while (i2 < i3) {
            i2 += this.f16753j;
        }
        return i2 < i3 + i4;
    }

    public g E(int i2, Rect rect) {
        return z(i2, rect.left, rect.top, rect.right, rect.bottom);
    }

    public g F(g gVar) {
        return gVar.size() == 0 ? y() : z(gVar.f16748e, gVar.f16749f, gVar.f16750g, gVar.t(), gVar.o());
    }

    @Override // k.c.f.l
    public boolean e(long j2) {
        if (m.e(j2) == this.f16748e && n(m.c(j2), this.f16749f, this.f16751h)) {
            return n(m.d(j2), this.f16750g, this.f16752i);
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

    public int o() {
        return (this.f16750g + this.f16752i) % this.f16753j;
    }

    public int p() {
        return this.f16752i;
    }

    public int r() {
        return this.f16749f;
    }

    public int size() {
        return this.f16751h * this.f16752i;
    }

    @Override // j$.lang.Iterable
    public /* synthetic */ Spliterator spliterator() {
        return j$.util.v.o(iterator(), 0);
    }

    public int t() {
        return (this.f16749f + this.f16751h) % this.f16753j;
    }

    public String toString() {
        if (this.f16751h == 0) {
            return "MapTileArea:empty";
        }
        return "MapTileArea:zoom=" + this.f16748e + ",left=" + this.f16749f + ",top=" + this.f16750g + ",width=" + this.f16751h + ",height=" + this.f16752i;
    }

    public int u() {
        return this.f16750g;
    }

    public int w() {
        return this.f16751h;
    }

    public int x() {
        return this.f16748e;
    }

    public g y() {
        this.f16751h = 0;
        return this;
    }

    public g z(int i2, int i3, int i4, int i5, int i6) {
        this.f16748e = i2;
        this.f16753j = 1 << i2;
        this.f16751h = m(i3, i5);
        this.f16752i = m(i4, i6);
        this.f16749f = l(i3);
        this.f16750g = l(i4);
        return this;
    }
}