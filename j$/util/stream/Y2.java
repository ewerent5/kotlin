package j$.util.stream;

import j$.util.Spliterator;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.function.C0277e;
import j$.util.function.Consumer;
import java.util.Comparator;
import java.util.Objects;

/* loaded from: classes2.dex */
final class Y2<T> implements Spliterator<T>, Consumer<T> {
    private static final Object a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private final Spliterator f16252b;

    /* renamed from: c, reason: collision with root package name */
    private final ConcurrentHashMap f16253c;

    /* renamed from: d, reason: collision with root package name */
    private Object f16254d;

    Y2(Spliterator spliterator) {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.f16252b = spliterator;
        this.f16253c = concurrentHashMap;
    }

    private Y2(Spliterator spliterator, ConcurrentHashMap concurrentHashMap) {
        this.f16252b = spliterator;
        this.f16253c = concurrentHashMap;
    }

    @Override // j$.util.function.Consumer
    public void accept(Object obj) {
        this.f16254d = obj;
    }

    @Override // j$.util.Spliterator
    public int characteristics() {
        return (this.f16252b.characteristics() & (-16469)) | 1;
    }

    @Override // j$.util.function.Consumer
    public Consumer e(Consumer consumer) {
        Objects.requireNonNull(consumer);
        return new C0277e(this, consumer);
    }

    @Override // j$.util.Spliterator
    public long estimateSize() {
        return this.f16252b.estimateSize();
    }

    public void f(Consumer consumer, Object obj) {
        if (this.f16253c.putIfAbsent(obj != null ? obj : a, Boolean.TRUE) == null) {
            consumer.accept(obj);
        }
    }

    @Override // j$.util.Spliterator
    public void forEachRemaining(final Consumer consumer) {
        this.f16252b.forEachRemaining(new Consumer() { // from class: j$.util.stream.y0
            @Override // j$.util.function.Consumer
            public final void accept(Object obj) {
                this.a.f(consumer, obj);
            }

            @Override // j$.util.function.Consumer
            public Consumer e(Consumer consumer2) {
                Objects.requireNonNull(consumer2);
                return new C0277e(this, consumer2);
            }
        });
    }

    @Override // j$.util.Spliterator
    public Comparator getComparator() {
        return this.f16252b.getComparator();
    }

    @Override // j$.util.Spliterator
    public /* synthetic */ long getExactSizeIfKnown() {
        return Spliterator.CC.$default$getExactSizeIfKnown(this);
    }

    @Override // j$.util.Spliterator
    public /* synthetic */ boolean hasCharacteristics(int i2) {
        return Spliterator.CC.$default$hasCharacteristics(this, i2);
    }

    @Override // j$.util.Spliterator
    public boolean tryAdvance(Consumer consumer) {
        while (this.f16252b.tryAdvance(this)) {
            ConcurrentHashMap concurrentHashMap = this.f16253c;
            Object obj = this.f16254d;
            if (obj == null) {
                obj = a;
            }
            if (concurrentHashMap.putIfAbsent(obj, Boolean.TRUE) == null) {
                consumer.accept(this.f16254d);
                this.f16254d = null;
                return true;
            }
        }
        return false;
    }

    @Override // j$.util.Spliterator
    public Spliterator trySplit() {
        Spliterator spliteratorTrySplit = this.f16252b.trySplit();
        if (spliteratorTrySplit != null) {
            return new Y2(spliteratorTrySplit, this.f16253c);
        }
        return null;
    }
}