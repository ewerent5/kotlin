package androidx.room;

import java.util.ArrayList;
import java.util.List;

/* compiled from: QueryInterceptorProgram.java */
/* loaded from: classes.dex */
final class n0 implements c.r.a.d {

    /* renamed from: e, reason: collision with root package name */
    private List<Object> f1900e = new ArrayList();

    n0() {
    }

    private void c(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 >= this.f1900e.size()) {
            for (int size = this.f1900e.size(); size <= i3; size++) {
                this.f1900e.add(null);
            }
        }
        this.f1900e.set(i3, obj);
    }

    @Override // c.r.a.d
    public void E(int i2, double d2) {
        c(i2, Double.valueOf(d2));
    }

    @Override // c.r.a.d
    public void R(int i2, long j2) {
        c(i2, Long.valueOf(j2));
    }

    @Override // c.r.a.d
    public void X(int i2, byte[] bArr) {
        c(i2, bArr);
    }

    List<Object> b() {
        return this.f1900e;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // c.r.a.d
    public void r(int i2, String str) {
        c(i2, str);
    }

    @Override // c.r.a.d
    public void t0(int i2) {
        c(i2, null);
    }
}