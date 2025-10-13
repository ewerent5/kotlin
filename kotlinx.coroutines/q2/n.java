package kotlinx.coroutines.q2;

import kotlinx.coroutines.internal.x;

/* compiled from: LinkedListChannel.kt */
/* loaded from: classes3.dex */
public class n<E> extends a<E> {
    public n(i.y.c.l<? super E, i.s> lVar) {
        super(lVar);
    }

    @Override // kotlinx.coroutines.q2.c
    protected Object h(E e2) {
        q<?> qVarJ;
        do {
            Object objH = super.h(e2);
            x xVar = b.f17039b;
            if (objH == xVar) {
                return xVar;
            }
            if (objH != b.f17040c) {
                if (objH instanceof j) {
                    return objH;
                }
                throw new IllegalStateException(("Invalid offerInternal result " + objH).toString());
            }
            qVarJ = j(e2);
            if (qVarJ == null) {
                return xVar;
            }
        } while (!(qVarJ instanceof j));
        return qVarJ;
    }

    @Override // kotlinx.coroutines.q2.a
    protected final boolean q() {
        return true;
    }

    @Override // kotlinx.coroutines.q2.a
    protected final boolean r() {
        return true;
    }
}