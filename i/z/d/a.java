package i.z.d;

import i.y.d.l;
import j$.util.concurrent.ThreadLocalRandom;
import java.util.Random;

/* compiled from: PlatformThreadLocalRandom.kt */
/* loaded from: classes3.dex */
public final class a extends i.z.a {
    @Override // i.z.a
    public Random c() {
        ThreadLocalRandom threadLocalRandomCurrent = ThreadLocalRandom.current();
        l.c(threadLocalRandomCurrent, "ThreadLocalRandom.current()");
        return threadLocalRandomCurrent;
    }
}