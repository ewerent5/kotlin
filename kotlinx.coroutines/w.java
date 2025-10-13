package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: CompletionState.kt */
/* loaded from: classes3.dex */
public class w {
    private static final AtomicIntegerFieldUpdater a = AtomicIntegerFieldUpdater.newUpdater(w.class, "_handled");
    private volatile int _handled;

    /* renamed from: b, reason: collision with root package name */
    public final Throwable f17169b;

    public w(Throwable th, boolean z) {
        this.f17169b = th;
        this._handled = z ? 1 : 0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
    public final boolean a() {
        return this._handled;
    }

    public final boolean b() {
        return a.compareAndSet(this, 0, 1);
    }

    public String toString() {
        return n0.a(this) + '[' + this.f17169b + ']';
    }

    public /* synthetic */ w(Throwable th, boolean z, int i2, i.y.d.g gVar) {
        this(th, (i2 & 2) != 0 ? false : z);
    }
}