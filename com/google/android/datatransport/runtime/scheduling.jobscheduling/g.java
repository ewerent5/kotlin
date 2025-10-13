package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobInfo;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.d;
import com.google.auto.value.AutoValue;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* compiled from: SchedulerConfig.java */
@AutoValue
/* loaded from: classes.dex */
public abstract class g {

    /* compiled from: SchedulerConfig.java */
    public static class a {
        private e.c.b.a.i.y.a a;

        /* renamed from: b */
        private Map<e.c.b.a.d, b> f4403b = new HashMap();

        public a a(e.c.b.a.d dVar, b bVar) {
            this.f4403b.put(dVar, bVar);
            return this;
        }

        public g b() {
            Objects.requireNonNull(this.a, "missing required property: clock");
            if (this.f4403b.keySet().size() < e.c.b.a.d.values().length) {
                throw new IllegalStateException("Not all priorities have been configured");
            }
            Map<e.c.b.a.d, b> map = this.f4403b;
            this.f4403b = new HashMap();
            return g.d(this.a, map);
        }

        public a c(e.c.b.a.i.y.a aVar) {
            this.a = aVar;
            return this;
        }
    }

    /* compiled from: SchedulerConfig.java */
    @AutoValue
    public static abstract class b {

        /* compiled from: SchedulerConfig.java */
        @AutoValue.Builder
        public static abstract class a {
            public abstract b a();

            public abstract a b(long j2);

            public abstract a c(Set<c> set);

            public abstract a d(long j2);
        }

        public static a a() {
            return new d.b().c(Collections.emptySet());
        }

        abstract long b();

        abstract Set<c> c();

        abstract long d();
    }

    /* compiled from: SchedulerConfig.java */
    public enum c {
        NETWORK_UNMETERED,
        DEVICE_IDLE,
        DEVICE_CHARGING
    }

    private long a(int i2, long j2) {
        return (long) (Math.pow(3.0d, i2 - 1) * j2 * Math.max(1.0d, Math.log(10000.0d) / Math.log((j2 > 1 ? j2 : 2L) * r7)));
    }

    public static a b() {
        return new a();
    }

    static g d(e.c.b.a.i.y.a aVar, Map<e.c.b.a.d, b> map) {
        return new com.google.android.datatransport.runtime.scheduling.jobscheduling.c(aVar, map);
    }

    public static g f(e.c.b.a.i.y.a aVar) {
        return b().a(e.c.b.a.d.DEFAULT, b.a().b(30000L).d(86400000L).a()).a(e.c.b.a.d.HIGHEST, b.a().b(1000L).d(86400000L).a()).a(e.c.b.a.d.VERY_LOW, b.a().b(86400000L).d(86400000L).c(i(c.NETWORK_UNMETERED, c.DEVICE_IDLE)).a()).c(aVar).b();
    }

    private static <T> Set<T> i(T... tArr) {
        return Collections.unmodifiableSet(new HashSet(Arrays.asList(tArr)));
    }

    private void j(JobInfo.Builder builder, Set<c> set) {
        if (set.contains(c.NETWORK_UNMETERED)) {
            builder.setRequiredNetworkType(2);
        } else {
            builder.setRequiredNetworkType(1);
        }
        if (set.contains(c.DEVICE_CHARGING)) {
            builder.setRequiresCharging(true);
        }
        if (set.contains(c.DEVICE_IDLE)) {
            builder.setRequiresDeviceIdle(true);
        }
    }

    public JobInfo.Builder c(JobInfo.Builder builder, e.c.b.a.d dVar, long j2, int i2) {
        builder.setMinimumLatency(g(dVar, j2, i2));
        j(builder, h().get(dVar).c());
        return builder;
    }

    abstract e.c.b.a.i.y.a e();

    public long g(e.c.b.a.d dVar, long j2, int i2) {
        long jA = j2 - e().a();
        b bVar = h().get(dVar);
        return Math.min(Math.max(a(i2, bVar.b()), jA), bVar.d());
    }

    abstract Map<e.c.b.a.d, b> h();
}