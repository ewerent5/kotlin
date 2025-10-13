package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: AdapterListUpdateCallback.java */
/* loaded from: classes.dex */
public final class b implements n {
    private final RecyclerView.g a;

    public b(RecyclerView.g gVar) {
        this.a = gVar;
    }

    @Override // androidx.recyclerview.widget.n
    public void a(int i2, int i3) {
        this.a.l(i2, i3);
    }

    @Override // androidx.recyclerview.widget.n
    public void b(int i2, int i3) {
        this.a.n(i2, i3);
    }

    @Override // androidx.recyclerview.widget.n
    public void c(int i2, int i3) {
        this.a.o(i2, i3);
    }

    @Override // androidx.recyclerview.widget.n
    public void d(int i2, int i3, Object obj) {
        this.a.m(i2, i3, obj);
    }
}