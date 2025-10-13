package e.c.d.y;

import e.c.d.t;
import e.c.d.y.n.n;
import java.io.EOFException;
import java.io.IOException;

/* compiled from: Streams.java */
/* loaded from: classes.dex */
public final class l {
    public static e.c.d.l a(e.c.d.a0.a aVar) {
        boolean z;
        try {
            try {
                aVar.k0();
                z = false;
                try {
                    return n.X.b(aVar);
                } catch (EOFException e2) {
                    e = e2;
                    if (z) {
                        return e.c.d.n.a;
                    }
                    throw new t(e);
                }
            } catch (e.c.d.a0.d e3) {
                throw new t(e3);
            } catch (IOException e4) {
                throw new e.c.d.m(e4);
            } catch (NumberFormatException e5) {
                throw new t(e5);
            }
        } catch (EOFException e6) {
            e = e6;
            z = true;
        }
    }

    public static void b(e.c.d.l lVar, e.c.d.a0.c cVar) {
        n.X.d(cVar, lVar);
    }
}