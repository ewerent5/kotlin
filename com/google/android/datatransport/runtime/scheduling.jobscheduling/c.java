package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.runtime.scheduling.jobscheduling.g;
import java.util.Map;
import java.util.Objects;

/* compiled from: AutoValue_SchedulerConfig.java */
/* loaded from: classes.dex */
final class c extends g {
    private final e.c.b.a.i.y.a a;

    /* renamed from: b, reason: collision with root package name */
    private final Map<e.c.b.a.d, g.b> f4394b;

    c(e.c.b.a.i.y.a aVar, Map<e.c.b.a.d, g.b> map) {
        Objects.requireNonNull(aVar, "Null clock");
        this.a = aVar;
        Objects.requireNonNull(map, "Null values");
        this.f4394b = map;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.g
    e.c.b.a.i.y.a e() {
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
        return this.a.equals(gVar.e()) && this.f4394b.equals(gVar.h());
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.g
    Map<e.c.b.a.d, g.b> h() {
        return this.f4394b;
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.f4394b.hashCode();
    }

    public String toString() {
        return "SchedulerConfig{clock=" + this.a + ", values=" + this.f4394b + "}";
    }
}