package e.c.b.d.a.c;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import e.c.b.d.a.b.f;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class c<StateT> {
    protected final f a;

    /* renamed from: b, reason: collision with root package name */
    private final IntentFilter f15363b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f15364c;

    /* renamed from: d, reason: collision with root package name */
    protected final Set<a<StateT>> f15365d = new HashSet();

    /* renamed from: e, reason: collision with root package name */
    private b f15366e = null;

    /* renamed from: f, reason: collision with root package name */
    private volatile boolean f15367f = false;

    protected c(f fVar, IntentFilter intentFilter, Context context) {
        this.a = fVar;
        this.f15363b = intentFilter;
        this.f15364c = e.c.b.d.a.d.a.b(context);
    }

    private final void b() {
        b bVar;
        if ((this.f15367f || !this.f15365d.isEmpty()) && this.f15366e == null) {
            b bVar2 = new b(this);
            this.f15366e = bVar2;
            this.f15364c.registerReceiver(bVar2, this.f15363b);
        }
        if (this.f15367f || !this.f15365d.isEmpty() || (bVar = this.f15366e) == null) {
            return;
        }
        this.f15364c.unregisterReceiver(bVar);
        this.f15366e = null;
    }

    protected abstract void a(Context context, Intent intent);

    public final synchronized void c(boolean z) {
        this.f15367f = z;
        b();
    }

    public final synchronized void d(StateT statet) {
        Iterator it = new HashSet(this.f15365d).iterator();
        while (it.hasNext()) {
            ((a) it.next()).a(statet);
        }
    }

    public final synchronized boolean e() {
        return this.f15366e != null;
    }
}