package j$.util.stream;

import j$.util.function.C0277e;
import j$.util.function.Consumer;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Objects;

/* loaded from: classes2.dex */
final class N2<T> extends F2<T> {

    /* renamed from: d, reason: collision with root package name */
    private ArrayList f16151d;

    N2(A2 a2, Comparator comparator) {
        super(a2, comparator);
    }

    @Override // j$.util.function.Consumer
    public void accept(Object obj) {
        this.f16151d.add(obj);
    }

    @Override // j$.util.stream.A2.d, j$.util.stream.A2
    public void m() {
        j$.time.a.K(this.f16151d, this.f16133b);
        this.a.n(this.f16151d.size());
        if (this.f16134c) {
            Iterator it = this.f16151d.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (this.a.o()) {
                    break;
                } else {
                    this.a.accept(next);
                }
            }
        } else {
            ArrayList arrayList = this.f16151d;
            final A2 a2 = this.a;
            Objects.requireNonNull(a2);
            j$.time.a.w(arrayList, new Consumer() { // from class: j$.util.stream.b
                @Override // j$.util.function.Consumer
                public final void accept(Object obj) {
                    a2.accept(obj);
                }

                @Override // j$.util.function.Consumer
                public Consumer e(Consumer consumer) {
                    Objects.requireNonNull(consumer);
                    return new C0277e(this, consumer);
                }
            });
        }
        this.a.m();
        this.f16151d = null;
    }

    @Override // j$.util.stream.A2.d, j$.util.stream.A2
    public void n(long j2) {
        if (j2 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.f16151d = j2 >= 0 ? new ArrayList((int) j2) : new ArrayList();
    }
}