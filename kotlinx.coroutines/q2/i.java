package kotlinx.coroutines.q2;

/* compiled from: Channel.kt */
/* loaded from: classes3.dex */
public final class i {
    public static final <E> g<E> a(int i2, f fVar, i.y.c.l<? super E, i.s> lVar) {
        if (i2 == -2) {
            return new e(fVar == f.SUSPEND ? g.a.a() : 1, fVar, lVar);
        }
        if (i2 != -1) {
            return i2 != 0 ? i2 != Integer.MAX_VALUE ? (i2 == 1 && fVar == f.DROP_OLDEST) ? new m(lVar) : new e(i2, fVar, lVar) : new n(lVar) : fVar == f.SUSPEND ? new r(lVar) : new e(1, fVar, lVar);
        }
        if ((fVar != f.SUSPEND ? 0 : 1) != 0) {
            return new m(lVar);
        }
        throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow".toString());
    }

    public static /* synthetic */ g b(int i2, f fVar, i.y.c.l lVar, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = 0;
        }
        if ((i3 & 2) != 0) {
            fVar = f.SUSPEND;
        }
        if ((i3 & 4) != 0) {
            lVar = null;
        }
        return a(i2, fVar, lVar);
    }
}