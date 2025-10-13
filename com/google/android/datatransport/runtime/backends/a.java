package com.google.android.datatransport.runtime.backends;

import com.google.android.datatransport.runtime.backends.f;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: AutoValue_BackendRequest.java */
/* loaded from: classes.dex */
final class a extends f {
    private final Iterable<e.c.b.a.i.h> a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f4371b;

    /* compiled from: AutoValue_BackendRequest.java */
    static final class b extends f.a {
        private Iterable<e.c.b.a.i.h> a;

        /* renamed from: b, reason: collision with root package name */
        private byte[] f4372b;

        b() {
        }

        @Override // com.google.android.datatransport.runtime.backends.f.a
        public f a() {
            String str = "";
            if (this.a == null) {
                str = " events";
            }
            if (str.isEmpty()) {
                return new a(this.a, this.f4372b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.android.datatransport.runtime.backends.f.a
        public f.a b(Iterable<e.c.b.a.i.h> iterable) {
            Objects.requireNonNull(iterable, "Null events");
            this.a = iterable;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.backends.f.a
        public f.a c(byte[] bArr) {
            this.f4372b = bArr;
            return this;
        }
    }

    @Override // com.google.android.datatransport.runtime.backends.f
    public Iterable<e.c.b.a.i.h> b() {
        return this.a;
    }

    @Override // com.google.android.datatransport.runtime.backends.f
    public byte[] c() {
        return this.f4371b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (this.a.equals(fVar.b())) {
            if (Arrays.equals(this.f4371b, fVar instanceof a ? ((a) fVar).f4371b : fVar.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f4371b);
    }

    public String toString() {
        return "BackendRequest{events=" + this.a + ", extras=" + Arrays.toString(this.f4371b) + "}";
    }

    private a(Iterable<e.c.b.a.i.h> iterable, byte[] bArr) {
        this.a = iterable;
        this.f4371b = bArr;
    }
}