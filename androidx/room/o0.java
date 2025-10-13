package androidx.room;

import androidx.room.q0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: QueryInterceptorStatement.java */
/* loaded from: classes.dex */
final class o0 implements c.r.a.f {

    /* renamed from: e, reason: collision with root package name */
    private final c.r.a.f f1902e;

    /* renamed from: f, reason: collision with root package name */
    private final q0.f f1903f;

    /* renamed from: g, reason: collision with root package name */
    private final String f1904g;

    /* renamed from: h, reason: collision with root package name */
    private final List<Object> f1905h = new ArrayList();

    /* renamed from: i, reason: collision with root package name */
    private final Executor f1906i;

    o0(c.r.a.f fVar, q0.f fVar2, String str, Executor executor) {
        this.f1902e = fVar;
        this.f1903f = fVar2;
        this.f1904g = str;
        this.f1906i = executor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void c() {
        this.f1903f.a(this.f1904g, this.f1905h);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void g() {
        this.f1903f.a(this.f1904g, this.f1905h);
    }

    private void i(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 >= this.f1905h.size()) {
            for (int size = this.f1905h.size(); size <= i3; size++) {
                this.f1905h.add(null);
            }
        }
        this.f1905h.set(i3, obj);
    }

    @Override // c.r.a.d
    public void E(int i2, double d2) {
        i(i2, Double.valueOf(d2));
        this.f1902e.E(i2, d2);
    }

    @Override // c.r.a.f
    public long N0() {
        this.f1906i.execute(new Runnable() { // from class: androidx.room.o
            @Override // java.lang.Runnable
            public final void run() {
                this.f1901e.c();
            }
        });
        return this.f1902e.N0();
    }

    @Override // c.r.a.d
    public void R(int i2, long j2) {
        i(i2, Long.valueOf(j2));
        this.f1902e.R(i2, j2);
    }

    @Override // c.r.a.d
    public void X(int i2, byte[] bArr) {
        i(i2, bArr);
        this.f1902e.X(i2, bArr);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f1902e.close();
    }

    @Override // c.r.a.d
    public void r(int i2, String str) {
        i(i2, str);
        this.f1902e.r(i2, str);
    }

    @Override // c.r.a.d
    public void t0(int i2) {
        i(i2, this.f1905h.toArray());
        this.f1902e.t0(i2);
    }

    @Override // c.r.a.f
    public int w() {
        this.f1906i.execute(new Runnable() { // from class: androidx.room.p
            @Override // java.lang.Runnable
            public final void run() {
                this.f1907e.g();
            }
        });
        return this.f1902e.w();
    }
}