package androidx.work.impl.l;

/* compiled from: SystemIdInfo.java */
/* loaded from: classes.dex */
public class d {
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2293b;

    public d(String str, int i2) {
        this.a = str;
        this.f2293b = i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f2293b != dVar.f2293b) {
            return false;
        }
        return this.a.equals(dVar.a);
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.f2293b;
    }
}