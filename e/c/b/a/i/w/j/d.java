package e.c.b.a.i.w.j;

import ch.qos.logback.core.rolling.SizeBasedTriggeringPolicy;
import com.google.auto.value.AutoValue;
import e.c.b.a.i.w.j.a;

/* compiled from: EventStoreConfig.java */
@AutoValue
/* loaded from: classes.dex */
abstract class d {
    static final d a = a().f(SizeBasedTriggeringPolicy.DEFAULT_MAX_FILE_SIZE).d(200).b(10000).c(604800000).e(81920).a();

    /* compiled from: EventStoreConfig.java */
    @AutoValue.Builder
    static abstract class a {
        a() {
        }

        abstract d a();

        abstract a b(int i2);

        abstract a c(long j2);

        abstract a d(int i2);

        abstract a e(int i2);

        abstract a f(long j2);
    }

    d() {
    }

    static a a() {
        return new a.b();
    }

    abstract int b();

    abstract long c();

    abstract int d();

    abstract int e();

    abstract long f();
}