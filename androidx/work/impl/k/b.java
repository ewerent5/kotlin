package androidx.work.impl.k;

import j$.util.Spliterator;

/* compiled from: NetworkState.java */
/* loaded from: classes.dex */
public class b {
    private boolean a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f2259b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f2260c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f2261d;

    public b(boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = z;
        this.f2259b = z2;
        this.f2260c = z3;
        this.f2261d = z4;
    }

    public boolean a() {
        return this.a;
    }

    public boolean b() {
        return this.f2260c;
    }

    public boolean c() {
        return this.f2261d;
    }

    public boolean d() {
        return this.f2259b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return this.a == bVar.a && this.f2259b == bVar.f2259b && this.f2260c == bVar.f2260c && this.f2261d == bVar.f2261d;
    }

    public int hashCode() {
        int i2 = this.a ? 1 : 0;
        if (this.f2259b) {
            i2 += 16;
        }
        if (this.f2260c) {
            i2 += 256;
        }
        return this.f2261d ? i2 + Spliterator.CONCURRENT : i2;
    }

    public String toString() {
        return String.format("[ Connected=%b Validated=%b Metered=%b NotRoaming=%b ]", Boolean.valueOf(this.a), Boolean.valueOf(this.f2259b), Boolean.valueOf(this.f2260c), Boolean.valueOf(this.f2261d));
    }
}