package j$.util.stream;

import j$.util.Spliterator;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.stream.R1;
import java.util.Objects;
import java.util.concurrent.CountedCompleter;

/* renamed from: j$.util.stream.x1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C0376x1<S, T> extends CountedCompleter<Void> {
    public static final /* synthetic */ int a = 0;

    /* renamed from: b, reason: collision with root package name */
    private final T1 f16371b;

    /* renamed from: c, reason: collision with root package name */
    private Spliterator f16372c;

    /* renamed from: d, reason: collision with root package name */
    private final long f16373d;

    /* renamed from: e, reason: collision with root package name */
    private final ConcurrentHashMap f16374e;

    /* renamed from: f, reason: collision with root package name */
    private final A2 f16375f;

    /* renamed from: g, reason: collision with root package name */
    private final C0376x1 f16376g;

    /* renamed from: h, reason: collision with root package name */
    private R1 f16377h;

    protected C0376x1(T1 t1, Spliterator spliterator, A2 a2) {
        super(null);
        this.f16371b = t1;
        this.f16372c = spliterator;
        this.f16373d = AbstractC0325k1.h(spliterator.estimateSize());
        this.f16374e = new ConcurrentHashMap(Math.max(16, AbstractC0325k1.a << 1));
        this.f16375f = a2;
        this.f16376g = null;
    }

    C0376x1(C0376x1 c0376x1, Spliterator spliterator, C0376x1 c0376x12) {
        super(c0376x1);
        this.f16371b = c0376x1.f16371b;
        this.f16372c = spliterator;
        this.f16373d = c0376x1.f16373d;
        this.f16374e = c0376x1.f16374e;
        this.f16375f = c0376x1.f16375f;
        this.f16376g = c0376x12;
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        Spliterator spliteratorTrySplit;
        Spliterator spliterator = this.f16372c;
        long j2 = this.f16373d;
        boolean z = false;
        C0376x1<S, T> c0376x1 = this;
        while (spliterator.estimateSize() > j2 && (spliteratorTrySplit = spliterator.trySplit()) != null) {
            C0376x1<S, T> c0376x12 = new C0376x1<>(c0376x1, spliteratorTrySplit, c0376x1.f16376g);
            C0376x1<S, T> c0376x13 = new C0376x1<>(c0376x1, spliterator, c0376x12);
            c0376x1.addToPendingCount(1);
            c0376x13.addToPendingCount(1);
            c0376x1.f16374e.put(c0376x12, c0376x13);
            if (c0376x1.f16376g != null) {
                c0376x12.addToPendingCount(1);
                if (c0376x1.f16374e.replace(c0376x1.f16376g, c0376x1, c0376x12)) {
                    c0376x1.addToPendingCount(-1);
                } else {
                    c0376x12.addToPendingCount(-1);
                }
            }
            if (z) {
                spliterator = spliteratorTrySplit;
                c0376x1 = c0376x12;
                c0376x12 = c0376x13;
            } else {
                c0376x1 = c0376x13;
            }
            z = !z;
            c0376x12.fork();
        }
        if (c0376x1.getPendingCount() > 0) {
            C0382z c0382z = new j$.util.function.x() { // from class: j$.util.stream.z
                @Override // j$.util.function.x
                public final Object apply(int i2) {
                    int i3 = C0376x1.a;
                    return new Object[i2];
                }
            };
            T1 t1 = c0376x1.f16371b;
            R1.a aVarS0 = t1.s0(t1.p0(spliterator), c0382z);
            AbstractC0313h1 abstractC0313h1 = (AbstractC0313h1) c0376x1.f16371b;
            Objects.requireNonNull(abstractC0313h1);
            Objects.requireNonNull(aVarS0);
            abstractC0313h1.m0(abstractC0313h1.u0(aVarS0), spliterator);
            c0376x1.f16377h = aVarS0.a();
            c0376x1.f16372c = null;
        }
        c0376x1.tryComplete();
    }

    @Override // java.util.concurrent.CountedCompleter
    public void onCompletion(CountedCompleter countedCompleter) {
        R1 r1 = this.f16377h;
        if (r1 != null) {
            r1.forEach(this.f16375f);
            this.f16377h = null;
        } else {
            Spliterator spliterator = this.f16372c;
            if (spliterator != null) {
                T1 t1 = this.f16371b;
                A2 a2 = this.f16375f;
                AbstractC0313h1 abstractC0313h1 = (AbstractC0313h1) t1;
                Objects.requireNonNull(abstractC0313h1);
                Objects.requireNonNull(a2);
                abstractC0313h1.m0(abstractC0313h1.u0(a2), spliterator);
                this.f16372c = null;
            }
        }
        C0376x1 c0376x1 = (C0376x1) this.f16374e.remove(this);
        if (c0376x1 != null) {
            c0376x1.tryComplete();
        }
    }
}