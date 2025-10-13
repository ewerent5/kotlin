package androidx.coordinatorlayout.widget;

import c.e.g;
import c.h.k.e;
import c.h.k.f;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* compiled from: DirectedAcyclicGraph.java */
/* loaded from: classes.dex */
public final class a<T> {
    private final e<ArrayList<T>> a = new f(10);

    /* renamed from: b, reason: collision with root package name */
    private final g<T, ArrayList<T>> f810b = new g<>();

    /* renamed from: c, reason: collision with root package name */
    private final ArrayList<T> f811c = new ArrayList<>();

    /* renamed from: d, reason: collision with root package name */
    private final HashSet<T> f812d = new HashSet<>();

    private void e(T t, ArrayList<T> arrayList, HashSet<T> hashSet) {
        if (arrayList.contains(t)) {
            return;
        }
        if (hashSet.contains(t)) {
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
        hashSet.add(t);
        ArrayList<T> arrayList2 = this.f810b.get(t);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i2 = 0; i2 < size; i2++) {
                e(arrayList2.get(i2), arrayList, hashSet);
            }
        }
        hashSet.remove(t);
        arrayList.add(t);
    }

    private ArrayList<T> f() {
        ArrayList<T> arrayListB = this.a.b();
        return arrayListB == null ? new ArrayList<>() : arrayListB;
    }

    private void k(ArrayList<T> arrayList) {
        arrayList.clear();
        this.a.a(arrayList);
    }

    public void a(T t, T t2) {
        if (!this.f810b.containsKey(t) || !this.f810b.containsKey(t2)) {
            throw new IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
        }
        ArrayList<T> arrayListF = this.f810b.get(t);
        if (arrayListF == null) {
            arrayListF = f();
            this.f810b.put(t, arrayListF);
        }
        arrayListF.add(t2);
    }

    public void b(T t) {
        if (this.f810b.containsKey(t)) {
            return;
        }
        this.f810b.put(t, null);
    }

    public void c() {
        int size = this.f810b.size();
        for (int i2 = 0; i2 < size; i2++) {
            ArrayList<T> arrayListM = this.f810b.m(i2);
            if (arrayListM != null) {
                k(arrayListM);
            }
        }
        this.f810b.clear();
    }

    public boolean d(T t) {
        return this.f810b.containsKey(t);
    }

    public List g(T t) {
        return this.f810b.get(t);
    }

    public List<T> h(T t) {
        int size = this.f810b.size();
        ArrayList arrayList = null;
        for (int i2 = 0; i2 < size; i2++) {
            ArrayList<T> arrayListM = this.f810b.m(i2);
            if (arrayListM != null && arrayListM.contains(t)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(this.f810b.i(i2));
            }
        }
        return arrayList;
    }

    public ArrayList<T> i() {
        this.f811c.clear();
        this.f812d.clear();
        int size = this.f810b.size();
        for (int i2 = 0; i2 < size; i2++) {
            e(this.f810b.i(i2), this.f811c, this.f812d);
        }
        return this.f811c;
    }

    public boolean j(T t) {
        int size = this.f810b.size();
        for (int i2 = 0; i2 < size; i2++) {
            ArrayList<T> arrayListM = this.f810b.m(i2);
            if (arrayListM != null && arrayListM.contains(t)) {
                return true;
            }
        }
        return false;
    }
}