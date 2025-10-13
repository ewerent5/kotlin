package j$.util.stream;

import j$.util.stream.A2;

/* loaded from: classes2.dex */
abstract class E2 extends A2.c<Long> {

    /* renamed from: b, reason: collision with root package name */
    protected boolean f16130b;

    E2(A2 a2) {
        super(a2);
    }

    @Override // j$.util.stream.A2.c, j$.util.stream.A2
    public final boolean o() {
        this.f16130b = true;
        return false;
    }
}