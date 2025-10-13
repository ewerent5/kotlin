package c.h.d;

import android.graphics.Insets;
import ch.qos.logback.core.CoreConstants;

/* compiled from: Insets.java */
/* loaded from: classes.dex */
public final class b {
    public static final b a = new b(0, 0, 0, 0);

    /* renamed from: b, reason: collision with root package name */
    public final int f2994b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2995c;

    /* renamed from: d, reason: collision with root package name */
    public final int f2996d;

    /* renamed from: e, reason: collision with root package name */
    public final int f2997e;

    private b(int i2, int i3, int i4, int i5) {
        this.f2994b = i2;
        this.f2995c = i3;
        this.f2996d = i4;
        this.f2997e = i5;
    }

    public static b a(int i2, int i3, int i4, int i5) {
        return (i2 == 0 && i3 == 0 && i4 == 0 && i5 == 0) ? a : new b(i2, i3, i4, i5);
    }

    public static b b(Insets insets) {
        return a(insets.left, insets.top, insets.right, insets.bottom);
    }

    public Insets c() {
        return Insets.of(this.f2994b, this.f2995c, this.f2996d, this.f2997e);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return this.f2997e == bVar.f2997e && this.f2994b == bVar.f2994b && this.f2996d == bVar.f2996d && this.f2995c == bVar.f2995c;
    }

    public int hashCode() {
        return (((((this.f2994b * 31) + this.f2995c) * 31) + this.f2996d) * 31) + this.f2997e;
    }

    public String toString() {
        return "Insets{left=" + this.f2994b + ", top=" + this.f2995c + ", right=" + this.f2996d + ", bottom=" + this.f2997e + CoreConstants.CURLY_RIGHT;
    }
}