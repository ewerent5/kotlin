package j;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: SegmentPool.kt */
/* loaded from: classes3.dex */
public final class z {

    /* renamed from: c, reason: collision with root package name */
    private static final int f16508c;

    /* renamed from: d, reason: collision with root package name */
    private static final AtomicReference<y>[] f16509d;

    /* renamed from: e, reason: collision with root package name */
    public static final z f16510e = new z();
    private static final int a = 65536;

    /* renamed from: b, reason: collision with root package name */
    private static final y f16507b = new y(new byte[0], 0, 0, false, false);

    static {
        int iHighestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f16508c = iHighestOneBit;
        AtomicReference<y>[] atomicReferenceArr = new AtomicReference[iHighestOneBit];
        for (int i2 = 0; i2 < iHighestOneBit; i2++) {
            atomicReferenceArr[i2] = new AtomicReference<>();
        }
        f16509d = atomicReferenceArr;
    }

    private z() {
    }

    private final AtomicReference<y> a() {
        Thread threadCurrentThread = Thread.currentThread();
        i.y.d.l.c(threadCurrentThread, "Thread.currentThread()");
        return f16509d[(int) (threadCurrentThread.getId() & (f16508c - 1))];
    }

    public static final void b(y yVar) {
        AtomicReference<y> atomicReferenceA;
        y yVar2;
        i.y.d.l.d(yVar, "segment");
        if (!(yVar.f16505g == null && yVar.f16506h == null)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (yVar.f16503e || (yVar2 = (atomicReferenceA = f16510e.a()).get()) == f16507b) {
            return;
        }
        int i2 = yVar2 != null ? yVar2.f16502d : 0;
        if (i2 >= a) {
            return;
        }
        yVar.f16505g = yVar2;
        yVar.f16501c = 0;
        yVar.f16502d = i2 + 8192;
        if (atomicReferenceA.compareAndSet(yVar2, yVar)) {
            return;
        }
        yVar.f16505g = null;
    }

    public static final y c() {
        AtomicReference<y> atomicReferenceA = f16510e.a();
        y yVar = f16507b;
        y andSet = atomicReferenceA.getAndSet(yVar);
        if (andSet == yVar) {
            return new y();
        }
        if (andSet == null) {
            atomicReferenceA.set(null);
            return new y();
        }
        atomicReferenceA.set(andSet.f16505g);
        andSet.f16505g = null;
        andSet.f16502d = 0;
        return andSet;
    }
}