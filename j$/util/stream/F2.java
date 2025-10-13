package j$.util.stream;

import j$.util.stream.A2;
import java.util.Comparator;

/* loaded from: classes2.dex */
abstract class F2<T> extends A2.d<T, T> {

    /* renamed from: b, reason: collision with root package name */
    protected final Comparator f16133b;

    /* renamed from: c, reason: collision with root package name */
    protected boolean f16134c;

    F2(A2 a2, Comparator comparator) {
        super(a2);
        this.f16133b = comparator;
    }

    @Override // j$.util.stream.A2.d, j$.util.stream.A2
    public final boolean o() {
        this.f16134c = true;
        return false;
    }
}