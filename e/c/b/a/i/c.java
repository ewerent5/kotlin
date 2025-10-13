package e.c.b.a.i;

import e.c.b.a.i.m;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: AutoValue_TransportContext.java */
/* loaded from: classes.dex */
final class c extends m {
    private final String a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f14247b;

    /* renamed from: c, reason: collision with root package name */
    private final e.c.b.a.d f14248c;

    /* compiled from: AutoValue_TransportContext.java */
    static final class b extends m.a {
        private String a;

        /* renamed from: b, reason: collision with root package name */
        private byte[] f14249b;

        /* renamed from: c, reason: collision with root package name */
        private e.c.b.a.d f14250c;

        b() {
        }

        @Override // e.c.b.a.i.m.a
        public m a() {
            String str = "";
            if (this.a == null) {
                str = " backendName";
            }
            if (this.f14250c == null) {
                str = str + " priority";
            }
            if (str.isEmpty()) {
                return new c(this.a, this.f14249b, this.f14250c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // e.c.b.a.i.m.a
        public m.a b(String str) {
            Objects.requireNonNull(str, "Null backendName");
            this.a = str;
            return this;
        }

        @Override // e.c.b.a.i.m.a
        public m.a c(byte[] bArr) {
            this.f14249b = bArr;
            return this;
        }

        @Override // e.c.b.a.i.m.a
        public m.a d(e.c.b.a.d dVar) {
            Objects.requireNonNull(dVar, "Null priority");
            this.f14250c = dVar;
            return this;
        }
    }

    @Override // e.c.b.a.i.m
    public String b() {
        return this.a;
    }

    @Override // e.c.b.a.i.m
    public byte[] c() {
        return this.f14247b;
    }

    @Override // e.c.b.a.i.m
    public e.c.b.a.d d() {
        return this.f14248c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        if (this.a.equals(mVar.b())) {
            if (Arrays.equals(this.f14247b, mVar instanceof c ? ((c) mVar).f14247b : mVar.c()) && this.f14248c.equals(mVar.d())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f14247b)) * 1000003) ^ this.f14248c.hashCode();
    }

    private c(String str, byte[] bArr, e.c.b.a.d dVar) {
        this.a = str;
        this.f14247b = bArr;
        this.f14248c = dVar;
    }
}