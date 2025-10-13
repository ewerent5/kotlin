package e.c.b.b.c.e;

/* compiled from: com.google.android.gms:play-services-measurement-base@@18.0.0 */
/* loaded from: classes.dex */
final class l8 extends k8 {
    private l8() {
        super();
    }

    private static <E> x7<E> e(Object obj, long j2) {
        return (x7) qa.F(obj, j2);
    }

    @Override // e.c.b.b.c.e.k8
    final <E> void b(Object obj, Object obj2, long j2) {
        x7 x7VarE = e(obj, j2);
        x7 x7VarE2 = e(obj2, j2);
        int size = x7VarE.size();
        int size2 = x7VarE2.size();
        if (size > 0 && size2 > 0) {
            if (!x7VarE.zza()) {
                x7VarE = x7VarE.b(size2 + size);
            }
            x7VarE.addAll(x7VarE2);
        }
        if (size > 0) {
            x7VarE2 = x7VarE;
        }
        qa.j(obj, j2, x7VarE2);
    }

    @Override // e.c.b.b.c.e.k8
    final void d(Object obj, long j2) {
        e(obj, j2).C0();
    }
}