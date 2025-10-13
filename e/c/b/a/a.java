package e.c.b.a;

import java.util.Objects;

/* compiled from: AutoValue_Event.java */
/* loaded from: classes.dex */
final class a<T> extends c<T> {
    private final Integer a;

    /* renamed from: b, reason: collision with root package name */
    private final T f14223b;

    /* renamed from: c, reason: collision with root package name */
    private final d f14224c;

    a(Integer num, T t, d dVar) {
        this.a = num;
        Objects.requireNonNull(t, "Null payload");
        this.f14223b = t;
        Objects.requireNonNull(dVar, "Null priority");
        this.f14224c = dVar;
    }

    @Override // e.c.b.a.c
    public Integer a() {
        return this.a;
    }

    @Override // e.c.b.a.c
    public T b() {
        return this.f14223b;
    }

    @Override // e.c.b.a.c
    public d c() {
        return this.f14224c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        Integer num = this.a;
        if (num != null ? num.equals(cVar.a()) : cVar.a() == null) {
            if (this.f14223b.equals(cVar.b()) && this.f14224c.equals(cVar.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        Integer num = this.a;
        return (((((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003) ^ this.f14223b.hashCode()) * 1000003) ^ this.f14224c.hashCode();
    }

    public String toString() {
        return "Event{code=" + this.a + ", payload=" + this.f14223b + ", priority=" + this.f14224c + "}";
    }
}