package e.c.b.a.i;

import java.util.Arrays;
import java.util.Objects;

/* compiled from: EncodedPayload.java */
/* loaded from: classes.dex */
public final class g {
    private final e.c.b.a.b a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f14260b;

    public g(e.c.b.a.b bVar, byte[] bArr) {
        Objects.requireNonNull(bVar, "encoding is null");
        Objects.requireNonNull(bArr, "bytes is null");
        this.a = bVar;
        this.f14260b = bArr;
    }

    public byte[] a() {
        return this.f14260b;
    }

    public e.c.b.a.b b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (this.a.equals(gVar.a)) {
            return Arrays.equals(this.f14260b, gVar.f14260b);
        }
        return false;
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f14260b);
    }

    public String toString() {
        return "EncodedPayload{encoding=" + this.a + ", bytes=[...]}";
    }
}