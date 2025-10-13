package i.y.d;

/* compiled from: PackageReference.kt */
/* loaded from: classes3.dex */
public final class q implements d {

    /* renamed from: e, reason: collision with root package name */
    private final Class<?> f15889e;

    /* renamed from: f, reason: collision with root package name */
    private final String f15890f;

    public q(Class<?> cls, String str) {
        l.d(cls, "jClass");
        l.d(str, "moduleName");
        this.f15889e = cls;
        this.f15890f = str;
    }

    @Override // i.y.d.d
    public Class<?> a() {
        return this.f15889e;
    }

    public boolean equals(Object obj) {
        return (obj instanceof q) && l.a(a(), ((q) obj).a());
    }

    public int hashCode() {
        return a().hashCode();
    }

    public String toString() {
        return a().toString() + " (Kotlin reflection is not available)";
    }
}