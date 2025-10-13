package j$.util;

import java.util.NoSuchElementException;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class o<T> {
    private static final o a = new o();

    /* renamed from: b, reason: collision with root package name */
    private final Object f16083b;

    private o() {
        this.f16083b = null;
    }

    private o(Object obj) {
        Objects.requireNonNull(obj);
        this.f16083b = obj;
    }

    public static o a() {
        return a;
    }

    public static o d(Object obj) {
        return new o(obj);
    }

    public Object b() {
        Object obj = this.f16083b;
        if (obj != null) {
            return obj;
        }
        throw new NoSuchElementException("No value present");
    }

    public boolean c() {
        return this.f16083b != null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o) {
            return j$.time.a.v(this.f16083b, ((o) obj).f16083b);
        }
        return false;
    }

    public int hashCode() {
        Object obj = this.f16083b;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public String toString() {
        Object obj = this.f16083b;
        return obj != null ? String.format("Optional[%s]", obj) : "Optional.empty";
    }
}