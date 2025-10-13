package androidx.activity;

import android.annotation.SuppressLint;
import androidx.lifecycle.g;
import androidx.lifecycle.i;
import androidx.lifecycle.k;
import java.util.ArrayDeque;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class OnBackPressedDispatcher {
    private final Runnable a;

    /* renamed from: b, reason: collision with root package name */
    final ArrayDeque<b> f14b = new ArrayDeque<>();

    private class LifecycleOnBackPressedCancellable implements i, androidx.activity.a {

        /* renamed from: e, reason: collision with root package name */
        private final g f15e;

        /* renamed from: f, reason: collision with root package name */
        private final b f16f;

        /* renamed from: g, reason: collision with root package name */
        private androidx.activity.a f17g;

        LifecycleOnBackPressedCancellable(g gVar, b bVar) {
            this.f15e = gVar;
            this.f16f = bVar;
            gVar.a(this);
        }

        @Override // androidx.lifecycle.i
        public void c(k kVar, g.b bVar) {
            if (bVar == g.b.ON_START) {
                this.f17g = OnBackPressedDispatcher.this.b(this.f16f);
                return;
            }
            if (bVar != g.b.ON_STOP) {
                if (bVar == g.b.ON_DESTROY) {
                    cancel();
                }
            } else {
                androidx.activity.a aVar = this.f17g;
                if (aVar != null) {
                    aVar.cancel();
                }
            }
        }

        @Override // androidx.activity.a
        public void cancel() {
            this.f15e.c(this);
            this.f16f.e(this);
            androidx.activity.a aVar = this.f17g;
            if (aVar != null) {
                aVar.cancel();
                this.f17g = null;
            }
        }
    }

    private class a implements androidx.activity.a {

        /* renamed from: e, reason: collision with root package name */
        private final b f19e;

        a(b bVar) {
            this.f19e = bVar;
        }

        @Override // androidx.activity.a
        public void cancel() {
            OnBackPressedDispatcher.this.f14b.remove(this.f19e);
            this.f19e.e(this);
        }
    }

    public OnBackPressedDispatcher(Runnable runnable) {
        this.a = runnable;
    }

    @SuppressLint({"LambdaLast"})
    public void a(k kVar, b bVar) {
        g gVarI = kVar.i();
        if (gVarI.b() == g.c.DESTROYED) {
            return;
        }
        bVar.a(new LifecycleOnBackPressedCancellable(gVarI, bVar));
    }

    androidx.activity.a b(b bVar) {
        this.f14b.add(bVar);
        a aVar = new a(bVar);
        bVar.a(aVar);
        return aVar;
    }

    public void c() {
        Iterator<b> itDescendingIterator = this.f14b.descendingIterator();
        while (itDescendingIterator.hasNext()) {
            b next = itDescendingIterator.next();
            if (next.c()) {
                next.b();
                return;
            }
        }
        Runnable runnable = this.a;
        if (runnable != null) {
            runnable.run();
        }
    }
}