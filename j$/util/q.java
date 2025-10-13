package j$.util;

import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class q {
    private static final q a = new q();

    /* renamed from: b, reason: collision with root package name */
    private final boolean f16086b;

    /* renamed from: c, reason: collision with root package name */
    private final int f16087c;

    private q() {
        this.f16086b = false;
        this.f16087c = 0;
    }

    private q(int i2) {
        this.f16086b = true;
        this.f16087c = i2;
    }

    public static q a() {
        return a;
    }

    public static q d(int i2) {
        return new q(i2);
    }

    public int b() {
        if (this.f16086b) {
            return this.f16087c;
        }
        throw new NoSuchElementException("No value present");
    }

    public boolean c() {
        return this.f16086b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        boolean z = this.f16086b;
        if (z && qVar.f16086b) {
            if (this.f16087c == qVar.f16087c) {
                return true;
            }
        } else if (z == qVar.f16086b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (this.f16086b) {
            return this.f16087c;
        }
        return 0;
    }

    public String toString() {
        return this.f16086b ? String.format("OptionalInt[%s]", Integer.valueOf(this.f16087c)) : "OptionalInt.empty";
    }
}