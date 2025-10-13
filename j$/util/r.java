package j$.util;

import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class r {
    private static final r a = new r();

    /* renamed from: b, reason: collision with root package name */
    private final boolean f16088b;

    /* renamed from: c, reason: collision with root package name */
    private final long f16089c;

    private r() {
        this.f16088b = false;
        this.f16089c = 0L;
    }

    private r(long j2) {
        this.f16088b = true;
        this.f16089c = j2;
    }

    public static r a() {
        return a;
    }

    public static r d(long j2) {
        return new r(j2);
    }

    public long b() {
        if (this.f16088b) {
            return this.f16089c;
        }
        throw new NoSuchElementException("No value present");
    }

    public boolean c() {
        return this.f16088b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        boolean z = this.f16088b;
        if (z && rVar.f16088b) {
            if (this.f16089c == rVar.f16089c) {
                return true;
            }
        } else if (z == rVar.f16088b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (!this.f16088b) {
            return 0;
        }
        long j2 = this.f16089c;
        return (int) (j2 ^ (j2 >>> 32));
    }

    public String toString() {
        return this.f16088b ? String.format("OptionalLong[%s]", Long.valueOf(this.f16089c)) : "OptionalLong.empty";
    }
}