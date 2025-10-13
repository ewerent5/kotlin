package androidx.activity;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: OnBackPressedCallback.java */
/* loaded from: classes.dex */
public abstract class b {
    private boolean a;

    /* renamed from: b, reason: collision with root package name */
    private CopyOnWriteArrayList<a> f21b = new CopyOnWriteArrayList<>();

    public b(boolean z) {
        this.a = z;
    }

    void a(a aVar) {
        this.f21b.add(aVar);
    }

    public abstract void b();

    public final boolean c() {
        return this.a;
    }

    public final void d() {
        Iterator<a> it = this.f21b.iterator();
        while (it.hasNext()) {
            it.next().cancel();
        }
    }

    void e(a aVar) {
        this.f21b.remove(aVar);
    }

    public final void f(boolean z) {
        this.a = z;
    }
}