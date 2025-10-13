package e.c.b.d.a.b;

import java.io.InputStream;

/* loaded from: classes.dex */
public final class w extends v {

    /* renamed from: e, reason: collision with root package name */
    private final v f15359e;

    /* renamed from: f, reason: collision with root package name */
    private final long f15360f;

    /* renamed from: g, reason: collision with root package name */
    private final long f15361g;

    public w(v vVar, long j2, long j3) {
        this.f15359e = vVar;
        long jG = g(j2);
        this.f15360f = jG;
        this.f15361g = g(jG + j3);
    }

    private final long g(long j2) {
        if (j2 < 0) {
            return 0L;
        }
        return j2 > this.f15359e.b() ? this.f15359e.b() : j2;
    }

    @Override // e.c.b.d.a.b.v
    public final long b() {
        return this.f15361g - this.f15360f;
    }

    @Override // e.c.b.d.a.b.v
    protected final InputStream c(long j2, long j3) {
        long jG = g(this.f15360f);
        return this.f15359e.c(jG, g(j3 + jG) - jG);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}