package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.d0;
import androidx.recyclerview.widget.c;
import androidx.recyclerview.widget.d;
import androidx.recyclerview.widget.h;
import java.util.List;

/* compiled from: ListAdapter.java */
/* loaded from: classes.dex */
public abstract class m<T, VH extends RecyclerView.d0> extends RecyclerView.g<VH> {

    /* renamed from: c, reason: collision with root package name */
    final d<T> f1764c;

    /* renamed from: d, reason: collision with root package name */
    private final d.b<T> f1765d;

    /* compiled from: ListAdapter.java */
    class a implements d.b<T> {
        a() {
        }

        @Override // androidx.recyclerview.widget.d.b
        public void a(List<T> list, List<T> list2) {
            m.this.C(list, list2);
        }
    }

    protected m(h.d<T> dVar) {
        a aVar = new a();
        this.f1765d = aVar;
        d<T> dVar2 = new d<>(new b(this), new c.a(dVar).a());
        this.f1764c = dVar2;
        dVar2.a(aVar);
    }

    protected T B(int i2) {
        return this.f1764c.b().get(i2);
    }

    public void C(List<T> list, List<T> list2) {
    }

    public void D(List<T> list) {
        this.f1764c.e(list);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int e() {
        return this.f1764c.b().size();
    }
}