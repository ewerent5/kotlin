package j$.util.function;

import java.util.Objects;

/* renamed from: j$.util.function.h, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0280h implements C {
    public final /* synthetic */ C a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C f16077b;

    public /* synthetic */ C0280h(C c2, C c3) {
        this.a = c2;
        this.f16077b = c3;
    }

    @Override // j$.util.function.C
    public final void accept(long j2) {
        C c2 = this.a;
        C c3 = this.f16077b;
        c2.accept(j2);
        c3.accept(j2);
    }

    @Override // j$.util.function.C
    public C f(C c2) {
        Objects.requireNonNull(c2);
        return new C0280h(this, c2);
    }
}