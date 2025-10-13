package i.z;

import i.y.d.l;
import java.util.Random;

/* compiled from: PlatformRandom.kt */
/* loaded from: classes3.dex */
public final class b extends i.z.a {

    /* renamed from: g, reason: collision with root package name */
    private final a f15895g = new a();

    /* compiled from: PlatformRandom.kt */
    public static final class a extends ThreadLocal<Random> {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Random initialValue() {
            return new Random();
        }
    }

    @Override // i.z.a
    public Random c() {
        Random random = this.f15895g.get();
        l.c(random, "implStorage.get()");
        return random;
    }
}