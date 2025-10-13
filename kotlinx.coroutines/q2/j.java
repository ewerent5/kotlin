package kotlinx.coroutines.q2;

import kotlinx.coroutines.internal.m;
import kotlinx.coroutines.internal.x;
import kotlinx.coroutines.n0;

/* compiled from: AbstractChannel.kt */
/* loaded from: classes3.dex */
public final class j<E> extends s implements q<E> {

    /* renamed from: h, reason: collision with root package name */
    public final Throwable f17057h;

    @Override // kotlinx.coroutines.q2.s
    public x B(m.b bVar) {
        x xVar = kotlinx.coroutines.m.a;
        if (bVar == null) {
            return xVar;
        }
        throw null;
    }

    @Override // kotlinx.coroutines.q2.q
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public j<E> a() {
        return this;
    }

    @Override // kotlinx.coroutines.q2.s
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public j<E> A() {
        return this;
    }

    public final Throwable F() {
        Throwable th = this.f17057h;
        return th != null ? th : new k("Channel was closed");
    }

    public final Throwable G() {
        Throwable th = this.f17057h;
        return th != null ? th : new l("Channel was closed");
    }

    @Override // kotlinx.coroutines.q2.q
    public void g(E e2) {
    }

    @Override // kotlinx.coroutines.q2.q
    public x h(E e2, m.b bVar) {
        x xVar = kotlinx.coroutines.m.a;
        if (bVar == null) {
            return xVar;
        }
        throw null;
    }

    @Override // kotlinx.coroutines.internal.m
    public String toString() {
        return "Closed@" + n0.b(this) + '[' + this.f17057h + ']';
    }

    @Override // kotlinx.coroutines.q2.s
    public void z() {
    }
}