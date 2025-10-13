package k.c.g.g;

import android.graphics.Canvas;
import android.graphics.Point;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import j$.lang.Iterable;
import j$.util.Collection;
import j$.util.Iterator;
import j$.util.List;
import j$.util.Spliterator;
import j$.util.function.Consumer;
import j$.util.function.Predicate;
import j$.util.function.UnaryOperator;
import j$.util.stream.Q1;
import j$.util.stream.Stream;
import j$.util.v;
import java.util.AbstractList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import k.c.g.g.e;

/* compiled from: DefaultOverlayManager.java */
/* loaded from: classes3.dex */
public class a extends AbstractList<e> implements g, List {

    /* renamed from: e */
    private h f16863e;

    /* renamed from: f */
    private final CopyOnWriteArrayList<e> f16864f;

    /* compiled from: DefaultOverlayManager.java */
    /* renamed from: k.c.g.g.a$a */
    class C0220a implements Iterable<e>, Iterable {

        /* compiled from: DefaultOverlayManager.java */
        /* renamed from: k.c.g.g.a$a$a */
        class C0221a implements Iterator<e>, j$.util.Iterator {

            /* renamed from: e */
            final /* synthetic */ ListIterator f16866e;

            C0221a(ListIterator listIterator) {
                this.f16866e = listIterator;
            }

            @Override // java.util.Iterator, j$.util.Iterator
            /* renamed from: a */
            public e next() {
                return (e) this.f16866e.previous();
            }

            @Override // j$.util.Iterator
            public /* synthetic */ void forEachRemaining(Consumer consumer) {
                Iterator.CC.$default$forEachRemaining(this, consumer);
            }

            @Override // java.util.Iterator, j$.util.Iterator
            public boolean hasNext() {
                return this.f16866e.hasPrevious();
            }

            @Override // java.util.Iterator, j$.util.Iterator
            public void remove() {
                this.f16866e.remove();
            }
        }

        C0220a() {
        }

        private ListIterator<e> a() {
            while (true) {
                try {
                    return a.this.f16864f.listIterator(a.this.f16864f.size());
                } catch (IndexOutOfBoundsException unused) {
                }
            }
        }

        @Override // j$.lang.Iterable
        public /* synthetic */ void forEach(Consumer consumer) {
            Iterable.CC.$default$forEach(this, consumer);
        }

        @Override // java.lang.Iterable, j$.lang.Iterable
        public java.util.Iterator<e> iterator() {
            return new C0221a(a());
        }

        @Override // java.lang.Iterable, j$.lang.Iterable
        public /* synthetic */ Spliterator spliterator() {
            return v.o(iterator(), 0);
        }
    }

    public a(h hVar) {
        N(hVar);
        this.f16864f = new CopyOnWriteArrayList<>();
    }

    private void f(Canvas canvas, k.c.g.d dVar, k.c.g.f fVar) {
        h hVar = this.f16863e;
        if (hVar != null) {
            hVar.G(canvas, fVar);
        }
        java.util.Iterator<e> it = this.f16864f.iterator();
        while (it.hasNext()) {
            e next = it.next();
            if (next != null && next.g() && (next instanceof h)) {
                ((h) next).G(canvas, fVar);
            }
        }
        h hVar2 = this.f16863e;
        if (hVar2 != null && hVar2.g()) {
            if (dVar != null) {
                this.f16863e.b(canvas, dVar, false);
            } else {
                this.f16863e.c(canvas, fVar);
            }
        }
        java.util.Iterator<e> it2 = this.f16864f.iterator();
        while (it2.hasNext()) {
            e next2 = it2.next();
            if (next2 != null && next2.g()) {
                if (dVar != null) {
                    next2.b(canvas, dVar, false);
                } else {
                    next2.c(canvas, fVar);
                }
            }
        }
    }

    @Override // k.c.g.g.g
    public boolean B(MotionEvent motionEvent, k.c.g.d dVar) {
        java.util.Iterator<e> it = h().iterator();
        while (it.hasNext()) {
            if (it.next().s(motionEvent, dVar)) {
                return true;
            }
        }
        return false;
    }

    @Override // k.c.g.g.g
    public void C(MotionEvent motionEvent, k.c.g.d dVar) {
        java.util.Iterator<e> it = h().iterator();
        while (it.hasNext()) {
            it.next().q(motionEvent, dVar);
        }
    }

    @Override // k.c.g.g.g
    public boolean H0(MotionEvent motionEvent, k.c.g.d dVar) {
        java.util.Iterator<e> it = h().iterator();
        while (it.hasNext()) {
            if (it.next().j(motionEvent, dVar)) {
                return true;
            }
        }
        return false;
    }

    @Override // k.c.g.g.g
    public void N(h hVar) {
        this.f16863e = hVar;
    }

    @Override // k.c.g.g.g
    public boolean O0(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3, k.c.g.d dVar) {
        java.util.Iterator<e> it = h().iterator();
        while (it.hasNext()) {
            if (it.next().l(motionEvent, motionEvent2, f2, f3, dVar)) {
                return true;
            }
        }
        return false;
    }

    @Override // k.c.g.g.g
    public boolean T(MotionEvent motionEvent, k.c.g.d dVar) {
        java.util.Iterator<e> it = h().iterator();
        while (it.hasNext()) {
            if (it.next().i(motionEvent, dVar)) {
                return true;
            }
        }
        return false;
    }

    @Override // k.c.g.g.g
    public boolean a0(MotionEvent motionEvent, k.c.g.d dVar) {
        java.util.Iterator<e> it = h().iterator();
        while (it.hasNext()) {
            if (it.next().r(motionEvent, dVar)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List, j$.util.List
    /* renamed from: c */
    public void add(int i2, e eVar) {
        if (eVar == null) {
            Log.e("OsmDroid", "Attempt to add a null overlay to the collection. This is probably a bug and should be reported!", new Exception());
        } else {
            this.f16864f.add(i2, eVar);
        }
    }

    @Override // k.c.g.g.g
    public boolean d(int i2, int i3, Point point, k.c.a.c cVar) {
        for (Object obj : h()) {
            if ((obj instanceof e.a) && ((e.a) obj).d(i2, i3, point, cVar)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List, j$.util.List
    /* renamed from: e */
    public e get(int i2) {
        return this.f16864f.get(i2);
    }

    @Override // j$.util.Collection, j$.lang.Iterable
    public /* synthetic */ void forEach(Consumer consumer) {
        Iterable.CC.$default$forEach(this, consumer);
    }

    public Iterable<e> h() {
        return new C0220a();
    }

    @Override // k.c.g.g.g
    public boolean h0(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3, k.c.g.d dVar) {
        java.util.Iterator<e> it = h().iterator();
        while (it.hasNext()) {
            if (it.next().p(motionEvent, motionEvent2, f2, f3, dVar)) {
                return true;
            }
        }
        return false;
    }

    @Override // k.c.g.g.g
    public boolean j0(MotionEvent motionEvent, k.c.g.d dVar) {
        java.util.Iterator<e> it = h().iterator();
        while (it.hasNext()) {
            if (it.next().t(motionEvent, dVar)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List, j$.util.List
    /* renamed from: k */
    public e remove(int i2) {
        return this.f16864f.remove(i2);
    }

    @Override // k.c.g.g.g
    public boolean k0(MotionEvent motionEvent, k.c.g.d dVar) {
        java.util.Iterator<e> it = h().iterator();
        while (it.hasNext()) {
            if (it.next().k(motionEvent, dVar)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List, j$.util.List
    /* renamed from: l */
    public e set(int i2, e eVar) {
        if (eVar != null) {
            return this.f16864f.set(i2, eVar);
        }
        Log.e("OsmDroid", "Attempt to set a null overlay to the collection. This is probably a bug and should be reported!", new Exception());
        return null;
    }

    @Override // k.c.g.g.g
    public boolean l0(MotionEvent motionEvent, k.c.g.d dVar) {
        java.util.Iterator<e> it = h().iterator();
        while (it.hasNext()) {
            if (it.next().u(motionEvent, dVar)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Collection, j$.util.Collection
    public /* synthetic */ Stream parallelStream() {
        return Q1.v(j$.time.a.L(this), true);
    }

    @Override // k.c.g.g.g
    public void q(k.c.g.d dVar) {
        h hVar = this.f16863e;
        if (hVar != null) {
            hVar.h(dVar);
        }
        java.util.Iterator<e> it = h().iterator();
        while (it.hasNext()) {
            it.next().h(dVar);
        }
        clear();
    }

    @Override // k.c.g.g.g
    public boolean q0(int i2, KeyEvent keyEvent, k.c.g.d dVar) {
        java.util.Iterator<e> it = h().iterator();
        while (it.hasNext()) {
            if (it.next().n(i2, keyEvent, dVar)) {
                return true;
            }
        }
        return false;
    }

    @Override // k.c.g.g.g
    public boolean r0(int i2, KeyEvent keyEvent, k.c.g.d dVar) {
        java.util.Iterator<e> it = h().iterator();
        while (it.hasNext()) {
            if (it.next().m(i2, keyEvent, dVar)) {
                return true;
            }
        }
        return false;
    }

    @Override // j$.util.Collection
    public /* synthetic */ boolean removeIf(Predicate predicate) {
        return Collection.CC.$default$removeIf(this, predicate);
    }

    @Override // j$.util.List
    public /* synthetic */ void replaceAll(UnaryOperator unaryOperator) {
        List.CC.$default$replaceAll(this, unaryOperator);
    }

    @Override // k.c.g.g.g
    public java.util.List<e> s() {
        return this.f16864f;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List, j$.util.List, j$.util.Collection, java.util.Set, j$.util.Set
    public int size() {
        return this.f16864f.size();
    }

    @Override // java.util.List, j$.util.List
    public /* synthetic */ void sort(Comparator comparator) {
        List.CC.$default$sort(this, comparator);
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.List, j$.util.List, j$.util.Collection, java.util.Set, j$.lang.Iterable
    public /* synthetic */ Spliterator spliterator() {
        return List.CC.$default$spliterator(this);
    }

    @Override // java.util.Collection, j$.util.Collection
    public /* synthetic */ Stream stream() {
        return Q1.v(j$.time.a.L(this), false);
    }

    @Override // k.c.g.g.g
    public boolean v0(MotionEvent motionEvent, k.c.g.d dVar) {
        java.util.Iterator<e> it = h().iterator();
        while (it.hasNext()) {
            if (it.next().o(motionEvent, dVar)) {
                return true;
            }
        }
        return false;
    }

    @Override // k.c.g.g.g
    public void y0(Canvas canvas, k.c.g.d dVar) {
        f(canvas, dVar, dVar.getProjection());
    }
}