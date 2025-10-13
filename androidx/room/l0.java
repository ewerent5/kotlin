package androidx.room;

import androidx.room.q0;
import java.util.concurrent.Executor;

/* compiled from: QueryInterceptorOpenHelper.java */
/* loaded from: classes.dex */
final class l0 implements c.r.a.c, c0 {

    /* renamed from: e, reason: collision with root package name */
    private final c.r.a.c f1891e;

    /* renamed from: f, reason: collision with root package name */
    private final q0.f f1892f;

    /* renamed from: g, reason: collision with root package name */
    private final Executor f1893g;

    l0(c.r.a.c cVar, q0.f fVar, Executor executor) {
        this.f1891e = cVar;
        this.f1892f = fVar;
        this.f1893g = executor;
    }

    @Override // c.r.a.c
    public c.r.a.b V() {
        return new k0(this.f1891e.V(), this.f1892f, this.f1893g);
    }

    @Override // c.r.a.c
    public c.r.a.b c0() {
        return new k0(this.f1891e.c0(), this.f1892f, this.f1893g);
    }

    @Override // c.r.a.c, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f1891e.close();
    }

    @Override // c.r.a.c
    public String getDatabaseName() {
        return this.f1891e.getDatabaseName();
    }

    @Override // androidx.room.c0
    public c.r.a.c getDelegate() {
        return this.f1891e;
    }

    @Override // c.r.a.c
    public void setWriteAheadLoggingEnabled(boolean z) {
        this.f1891e.setWriteAheadLoggingEnabled(z);
    }
}