package kotlinx.coroutines.internal;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: LockFreeLinkedList.kt */
/* loaded from: classes3.dex */
public class m {

    /* renamed from: e, reason: collision with root package name */
    static final AtomicReferenceFieldUpdater f16982e = AtomicReferenceFieldUpdater.newUpdater(m.class, Object.class, "_next");

    /* renamed from: f, reason: collision with root package name */
    static final AtomicReferenceFieldUpdater f16983f = AtomicReferenceFieldUpdater.newUpdater(m.class, Object.class, "_prev");

    /* renamed from: g, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f16984g = AtomicReferenceFieldUpdater.newUpdater(m.class, Object.class, "_removedRef");
    volatile Object _next = this;
    volatile Object _prev = this;
    private volatile Object _removedRef = null;

    /* compiled from: LockFreeLinkedList.kt */
    public static abstract class a extends c<m> {

        /* renamed from: b, reason: collision with root package name */
        public m f16985b;

        /* renamed from: c, reason: collision with root package name */
        public final m f16986c;

        public a(m mVar) {
            this.f16986c = mVar;
        }

        @Override // kotlinx.coroutines.internal.c
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public void d(m mVar, Object obj) {
            boolean z = obj == null;
            m mVar2 = z ? this.f16986c : this.f16985b;
            if (mVar2 != null && m.f16982e.compareAndSet(mVar, this, mVar2) && z) {
                m mVar3 = this.f16986c;
                m mVar4 = this.f16985b;
                i.y.d.l.b(mVar4);
                mVar3.o(mVar4);
            }
        }
    }

    /* compiled from: LockFreeLinkedList.kt */
    public static final class b extends t {
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0048, code lost:
    
        if (kotlinx.coroutines.internal.m.f16982e.compareAndSet(r3, r2, ((kotlinx.coroutines.internal.u) r4).a) != false) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final kotlinx.coroutines.internal.m m(kotlinx.coroutines.internal.t r7) {
        /*
            r6 = this;
        L0:
            java.lang.Object r0 = r6._prev
            kotlinx.coroutines.internal.m r0 = (kotlinx.coroutines.internal.m) r0
            r1 = 0
            r2 = r0
        L6:
            r3 = r1
        L7:
            java.lang.Object r4 = r2._next
            if (r4 != r6) goto L18
            if (r0 != r2) goto Le
            return r2
        Le:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = kotlinx.coroutines.internal.m.f16983f
            boolean r0 = r1.compareAndSet(r6, r0, r2)
            if (r0 != 0) goto L17
            goto L0
        L17:
            return r2
        L18:
            boolean r5 = r6.u()
            if (r5 == 0) goto L1f
            return r1
        L1f:
            if (r4 != r7) goto L22
            return r2
        L22:
            boolean r5 = r4 instanceof kotlinx.coroutines.internal.t
            if (r5 == 0) goto L38
            if (r7 == 0) goto L32
            r0 = r4
            kotlinx.coroutines.internal.t r0 = (kotlinx.coroutines.internal.t) r0
            boolean r0 = r7.b(r0)
            if (r0 == 0) goto L32
            return r1
        L32:
            kotlinx.coroutines.internal.t r4 = (kotlinx.coroutines.internal.t) r4
            r4.c(r2)
            goto L0
        L38:
            boolean r5 = r4 instanceof kotlinx.coroutines.internal.u
            if (r5 == 0) goto L52
            if (r3 == 0) goto L4d
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = kotlinx.coroutines.internal.m.f16982e
            kotlinx.coroutines.internal.u r4 = (kotlinx.coroutines.internal.u) r4
            kotlinx.coroutines.internal.m r4 = r4.a
            boolean r2 = r5.compareAndSet(r3, r2, r4)
            if (r2 != 0) goto L4b
            goto L0
        L4b:
            r2 = r3
            goto L6
        L4d:
            java.lang.Object r2 = r2._prev
            kotlinx.coroutines.internal.m r2 = (kotlinx.coroutines.internal.m) r2
            goto L7
        L52:
        */
        //  java.lang.String r3 = "null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */"
        /*
            java.util.Objects.requireNonNull(r4, r3)
            kotlinx.coroutines.internal.m r4 = (kotlinx.coroutines.internal.m) r4
            r3 = r2
            r2 = r4
            goto L7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.m.m(kotlinx.coroutines.internal.t):kotlinx.coroutines.internal.m");
    }

    private final m n(m mVar) {
        while (mVar.u()) {
            mVar = (m) mVar._prev;
        }
        return mVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o(m mVar) {
        m mVar2;
        do {
            mVar2 = (m) mVar._prev;
            if (p() != mVar) {
                return;
            }
        } while (!f16983f.compareAndSet(mVar, mVar2, this));
        if (u()) {
            mVar.m(null);
        }
    }

    private final u x() {
        u uVar = (u) this._removedRef;
        if (uVar != null) {
            return uVar;
        }
        u uVar2 = new u(this);
        f16984g.lazySet(this, uVar2);
        return uVar2;
    }

    public final boolean k(m mVar, m mVar2) {
        f16983f.lazySet(mVar, this);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f16982e;
        atomicReferenceFieldUpdater.lazySet(mVar, mVar2);
        if (!atomicReferenceFieldUpdater.compareAndSet(this, mVar2, mVar)) {
            return false;
        }
        mVar.o(mVar2);
        return true;
    }

    public final boolean l(m mVar) {
        f16983f.lazySet(mVar, this);
        f16982e.lazySet(mVar, this);
        while (p() == this) {
            if (f16982e.compareAndSet(this, this, mVar)) {
                mVar.o(this);
                return true;
            }
        }
        return false;
    }

    public final Object p() {
        while (true) {
            Object obj = this._next;
            if (!(obj instanceof t)) {
                return obj;
            }
            ((t) obj).c(this);
        }
    }

    public final m q() {
        return l.b(p());
    }

    public final m r() {
        m mVarM = m(null);
        return mVarM != null ? mVarM : n((m) this._prev);
    }

    public final void s() {
        Object objP = p();
        Objects.requireNonNull(objP, "null cannot be cast to non-null type kotlinx.coroutines.internal.Removed");
        ((u) objP).a.m(null);
    }

    public final void t() {
        m mVar = this;
        while (true) {
            Object objP = mVar.p();
            if (!(objP instanceof u)) {
                mVar.m(null);
                return;
            }
            mVar = ((u) objP).a;
        }
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + Integer.toHexString(System.identityHashCode(this));
    }

    public boolean u() {
        return p() instanceof u;
    }

    public boolean v() {
        return w() == null;
    }

    public final m w() {
        Object objP;
        m mVar;
        do {
            objP = p();
            if (objP instanceof u) {
                return ((u) objP).a;
            }
            if (objP == this) {
                return (m) objP;
            }
            Objects.requireNonNull(objP, "null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
            mVar = (m) objP;
        } while (!f16982e.compareAndSet(this, objP, mVar.x()));
        mVar.m(null);
        return null;
    }

    public final int y(m mVar, m mVar2, a aVar) {
        f16983f.lazySet(mVar, this);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f16982e;
        atomicReferenceFieldUpdater.lazySet(mVar, mVar2);
        aVar.f16985b = mVar2;
        if (atomicReferenceFieldUpdater.compareAndSet(this, mVar2, aVar)) {
            return aVar.c(this) == null ? 1 : 2;
        }
        return 0;
    }
}