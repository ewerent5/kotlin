package kotlinx.coroutines;

/* compiled from: CoroutineStart.kt */
/* loaded from: classes3.dex */
public enum k0 {
    DEFAULT,
    LAZY,
    ATOMIC,
    UNDISPATCHED;

    public final <R, T> void a(i.y.c.p<? super R, ? super i.v.d<? super T>, ? extends Object> pVar, R r, i.v.d<? super T> dVar) {
        int i2 = j0.f17003b[ordinal()];
        if (i2 == 1) {
            kotlinx.coroutines.s2.a.c(pVar, r, dVar, null, 4, null);
            return;
        }
        if (i2 == 2) {
            i.v.f.a(pVar, r, dVar);
        } else if (i2 == 3) {
            kotlinx.coroutines.s2.b.a(pVar, r, dVar);
        } else if (i2 != 4) {
            throw new i.k();
        }
    }

    public final boolean b() {
        return this == LAZY;
    }
}