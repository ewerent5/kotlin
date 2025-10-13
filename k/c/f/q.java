package k.c.f;

/* compiled from: PointL.java */
/* loaded from: classes3.dex */
public class q {
    public long a;

    /* renamed from: b, reason: collision with root package name */
    public long f16763b;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return this.a == qVar.a && this.f16763b == qVar.f16763b;
    }

    public String toString() {
        return "PointL(" + this.a + ", " + this.f16763b + ")";
    }
}