package com.google.android.datatransport.runtime.backends;

import com.google.android.datatransport.runtime.backends.g;
import java.util.Objects;

/* compiled from: AutoValue_BackendResponse.java */
/* loaded from: classes.dex */
final class b extends g {
    private final g.a a;

    /* renamed from: b, reason: collision with root package name */
    private final long f4373b;

    b(g.a aVar, long j2) {
        Objects.requireNonNull(aVar, "Null status");
        this.a = aVar;
        this.f4373b = j2;
    }

    @Override // com.google.android.datatransport.runtime.backends.g
    public long b() {
        return this.f4373b;
    }

    @Override // com.google.android.datatransport.runtime.backends.g
    public g.a c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.a.equals(gVar.c()) && this.f4373b == gVar.b();
    }

    public int hashCode() {
        int iHashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        long j2 = this.f4373b;
        return iHashCode ^ ((int) (j2 ^ (j2 >>> 32)));
    }

    public String toString() {
        return "BackendResponse{status=" + this.a + ", nextRequestWaitMillis=" + this.f4373b + "}";
    }
}