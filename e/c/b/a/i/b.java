package e.c.b.a.i;

import e.c.b.a.i.l;
import java.util.Objects;

/* compiled from: AutoValue_SendRequest.java */
/* loaded from: classes.dex */
final class b extends l {
    private final m a;

    /* renamed from: b, reason: collision with root package name */
    private final String f14239b;

    /* renamed from: c, reason: collision with root package name */
    private final e.c.b.a.c<?> f14240c;

    /* renamed from: d, reason: collision with root package name */
    private final e.c.b.a.e<?, byte[]> f14241d;

    /* renamed from: e, reason: collision with root package name */
    private final e.c.b.a.b f14242e;

    /* compiled from: AutoValue_SendRequest.java */
    /* renamed from: e.c.b.a.i.b$b, reason: collision with other inner class name */
    static final class C0174b extends l.a {
        private m a;

        /* renamed from: b, reason: collision with root package name */
        private String f14243b;

        /* renamed from: c, reason: collision with root package name */
        private e.c.b.a.c<?> f14244c;

        /* renamed from: d, reason: collision with root package name */
        private e.c.b.a.e<?, byte[]> f14245d;

        /* renamed from: e, reason: collision with root package name */
        private e.c.b.a.b f14246e;

        C0174b() {
        }

        @Override // e.c.b.a.i.l.a
        public l a() {
            String str = "";
            if (this.a == null) {
                str = " transportContext";
            }
            if (this.f14243b == null) {
                str = str + " transportName";
            }
            if (this.f14244c == null) {
                str = str + " event";
            }
            if (this.f14245d == null) {
                str = str + " transformer";
            }
            if (this.f14246e == null) {
                str = str + " encoding";
            }
            if (str.isEmpty()) {
                return new b(this.a, this.f14243b, this.f14244c, this.f14245d, this.f14246e);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // e.c.b.a.i.l.a
        l.a b(e.c.b.a.b bVar) {
            Objects.requireNonNull(bVar, "Null encoding");
            this.f14246e = bVar;
            return this;
        }

        @Override // e.c.b.a.i.l.a
        l.a c(e.c.b.a.c<?> cVar) {
            Objects.requireNonNull(cVar, "Null event");
            this.f14244c = cVar;
            return this;
        }

        @Override // e.c.b.a.i.l.a
        l.a d(e.c.b.a.e<?, byte[]> eVar) {
            Objects.requireNonNull(eVar, "Null transformer");
            this.f14245d = eVar;
            return this;
        }

        @Override // e.c.b.a.i.l.a
        public l.a e(m mVar) {
            Objects.requireNonNull(mVar, "Null transportContext");
            this.a = mVar;
            return this;
        }

        @Override // e.c.b.a.i.l.a
        public l.a f(String str) {
            Objects.requireNonNull(str, "Null transportName");
            this.f14243b = str;
            return this;
        }
    }

    @Override // e.c.b.a.i.l
    public e.c.b.a.b b() {
        return this.f14242e;
    }

    @Override // e.c.b.a.i.l
    e.c.b.a.c<?> c() {
        return this.f14240c;
    }

    @Override // e.c.b.a.i.l
    e.c.b.a.e<?, byte[]> e() {
        return this.f14241d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.a.equals(lVar.f()) && this.f14239b.equals(lVar.g()) && this.f14240c.equals(lVar.c()) && this.f14241d.equals(lVar.e()) && this.f14242e.equals(lVar.b());
    }

    @Override // e.c.b.a.i.l
    public m f() {
        return this.a;
    }

    @Override // e.c.b.a.i.l
    public String g() {
        return this.f14239b;
    }

    public int hashCode() {
        return ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.f14239b.hashCode()) * 1000003) ^ this.f14240c.hashCode()) * 1000003) ^ this.f14241d.hashCode()) * 1000003) ^ this.f14242e.hashCode();
    }

    public String toString() {
        return "SendRequest{transportContext=" + this.a + ", transportName=" + this.f14239b + ", event=" + this.f14240c + ", transformer=" + this.f14241d + ", encoding=" + this.f14242e + "}";
    }

    private b(m mVar, String str, e.c.b.a.c<?> cVar, e.c.b.a.e<?, byte[]> eVar, e.c.b.a.b bVar) {
        this.a = mVar;
        this.f14239b = str;
        this.f14240c = cVar;
        this.f14241d = eVar;
        this.f14242e = bVar;
    }
}