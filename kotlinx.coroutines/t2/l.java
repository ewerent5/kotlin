package kotlinx.coroutines.t2;

import java.util.concurrent.TimeUnit;
import kotlinx.coroutines.internal.a0;
import kotlinx.coroutines.internal.y;

/* compiled from: Tasks.kt */
/* loaded from: classes3.dex */
public final class l {
    public static final long a = a0.e("kotlinx.coroutines.scheduler.resolution.ns", 100000, 0, 0, 12, null);

    /* renamed from: b, reason: collision with root package name */
    public static final int f17145b = a0.d("kotlinx.coroutines.scheduler.blocking.parallelism", 16, 0, 0, 12, null);

    /* renamed from: c, reason: collision with root package name */
    public static final int f17146c;

    /* renamed from: d, reason: collision with root package name */
    public static final int f17147d;

    /* renamed from: e, reason: collision with root package name */
    public static final long f17148e;

    /* renamed from: f, reason: collision with root package name */
    public static m f17149f;

    static {
        int iD = a0.d("kotlinx.coroutines.scheduler.core.pool.size", i.a0.f.b(y.a(), 2), 1, 0, 8, null);
        f17146c = iD;
        f17147d = a0.d("kotlinx.coroutines.scheduler.max.pool.size", i.a0.f.f(y.a() * 128, iD, 2097150), 0, 2097150, 4, null);
        f17148e = TimeUnit.SECONDS.toNanos(a0.e("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 0L, 0L, 12, null));
        f17149f = g.a;
    }
}