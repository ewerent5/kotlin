package kotlinx.coroutines;

import java.util.Objects;
import kotlinx.coroutines.o1;

/* compiled from: JobSupport.kt */
/* loaded from: classes3.dex */
public abstract class u1<J extends o1> extends y implements u0, j1 {

    /* renamed from: h, reason: collision with root package name */
    public final J f17154h;

    public u1(J j2) {
        this.f17154h = j2;
    }

    @Override // kotlinx.coroutines.j1
    public boolean b() {
        return true;
    }

    @Override // kotlinx.coroutines.j1
    public z1 e() {
        return null;
    }

    @Override // kotlinx.coroutines.u0
    public void f() {
        J j2 = this.f17154h;
        Objects.requireNonNull(j2, "null cannot be cast to non-null type kotlinx.coroutines.JobSupport");
        ((v1) j2).p0(this);
    }

    @Override // kotlinx.coroutines.internal.m
    public String toString() {
        return n0.a(this) + '@' + n0.b(this) + "[job@" + n0.b(this.f17154h) + ']';
    }
}