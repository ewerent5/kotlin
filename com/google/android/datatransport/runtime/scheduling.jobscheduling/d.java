package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.runtime.scheduling.jobscheduling.g;
import java.util.Objects;
import java.util.Set;

/* compiled from: AutoValue_SchedulerConfig_ConfigValue.java */
/* loaded from: classes.dex */
final class d extends g.b {
    private final long a;

    /* renamed from: b, reason: collision with root package name */
    private final long f4395b;

    /* renamed from: c, reason: collision with root package name */
    private final Set<g.c> f4396c;

    /* compiled from: AutoValue_SchedulerConfig_ConfigValue.java */
    static final class b extends g.b.a {
        private Long a;

        /* renamed from: b, reason: collision with root package name */
        private Long f4397b;

        /* renamed from: c, reason: collision with root package name */
        private Set<g.c> f4398c;

        b() {
        }

        @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.g.b.a
        public g.b a() {
            String str = "";
            if (this.a == null) {
                str = " delta";
            }
            if (this.f4397b == null) {
                str = str + " maxAllowedDelay";
            }
            if (this.f4398c == null) {
                str = str + " flags";
            }
            if (str.isEmpty()) {
                return new d(this.a.longValue(), this.f4397b.longValue(), this.f4398c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.g.b.a
        public g.b.a b(long j2) {
            this.a = Long.valueOf(j2);
            return this;
        }

        @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.g.b.a
        public g.b.a c(Set<g.c> set) {
            Objects.requireNonNull(set, "Null flags");
            this.f4398c = set;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.g.b.a
        public g.b.a d(long j2) {
            this.f4397b = Long.valueOf(j2);
            return this;
        }
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.g.b
    long b() {
        return this.a;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.g.b
    Set<g.c> c() {
        return this.f4396c;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.g.b
    long d() {
        return this.f4395b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g.b)) {
            return false;
        }
        g.b bVar = (g.b) obj;
        return this.a == bVar.b() && this.f4395b == bVar.d() && this.f4396c.equals(bVar.c());
    }

    public int hashCode() {
        long j2 = this.a;
        int i2 = (((int) (j2 ^ (j2 >>> 32))) ^ 1000003) * 1000003;
        long j3 = this.f4395b;
        return this.f4396c.hashCode() ^ ((i2 ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003);
    }

    public String toString() {
        return "ConfigValue{delta=" + this.a + ", maxAllowedDelay=" + this.f4395b + ", flags=" + this.f4396c + "}";
    }

    private d(long j2, long j3, Set<g.c> set) {
        this.a = j2;
        this.f4395b = j3;
        this.f4396c = set;
    }
}