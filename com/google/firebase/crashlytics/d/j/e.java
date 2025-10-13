package com.google.firebase.crashlytics.d.j;

import com.google.firebase.crashlytics.d.j.v;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: AutoValue_CrashlyticsReport_FilesPayload_File.java */
/* loaded from: classes.dex */
final class e extends v.c.b {
    private final String a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f12534b;

    /* compiled from: AutoValue_CrashlyticsReport_FilesPayload_File.java */
    static final class b extends v.c.b.a {
        private String a;

        /* renamed from: b, reason: collision with root package name */
        private byte[] f12535b;

        b() {
        }

        @Override // com.google.firebase.crashlytics.d.j.v.c.b.a
        public v.c.b a() {
            String str = "";
            if (this.a == null) {
                str = " filename";
            }
            if (this.f12535b == null) {
                str = str + " contents";
            }
            if (str.isEmpty()) {
                return new e(this.a, this.f12535b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.crashlytics.d.j.v.c.b.a
        public v.c.b.a b(byte[] bArr) {
            Objects.requireNonNull(bArr, "Null contents");
            this.f12535b = bArr;
            return this;
        }

        @Override // com.google.firebase.crashlytics.d.j.v.c.b.a
        public v.c.b.a c(String str) {
            Objects.requireNonNull(str, "Null filename");
            this.a = str;
            return this;
        }
    }

    @Override // com.google.firebase.crashlytics.d.j.v.c.b
    public byte[] b() {
        return this.f12534b;
    }

    @Override // com.google.firebase.crashlytics.d.j.v.c.b
    public String c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof v.c.b)) {
            return false;
        }
        v.c.b bVar = (v.c.b) obj;
        if (this.a.equals(bVar.c())) {
            if (Arrays.equals(this.f12534b, bVar instanceof e ? ((e) bVar).f12534b : bVar.b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f12534b);
    }

    public String toString() {
        return "File{filename=" + this.a + ", contents=" + Arrays.toString(this.f12534b) + "}";
    }

    private e(String str, byte[] bArr) {
        this.a = str;
        this.f12534b = bArr;
    }
}