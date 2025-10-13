package kotlinx.coroutines.t2;

import kotlinx.coroutines.n0;

/* compiled from: Tasks.kt */
/* loaded from: classes3.dex */
public final class k extends i {

    /* renamed from: g, reason: collision with root package name */
    public final Runnable f17144g;

    public k(Runnable runnable, long j2, j jVar) {
        super(j2, jVar);
        this.f17144g = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f17144g.run();
        } finally {
            this.f17143f.j();
        }
    }

    public String toString() {
        return "Task[" + n0.a(this.f17144g) + '@' + n0.b(this.f17144g) + ", " + this.f17142e + ", " + this.f17143f + ']';
    }
}