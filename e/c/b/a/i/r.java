package e.c.b.a.i;

import android.content.Context;
import java.io.Closeable;
import java.io.IOException;

/* compiled from: TransportRuntimeComponent.java */
/* loaded from: classes.dex */
abstract class r implements Closeable {

    /* compiled from: TransportRuntimeComponent.java */
    interface a {
        r a();

        a b(Context context);
    }

    r() {
    }

    abstract e.c.b.a.i.w.j.c b();

    abstract q c();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        b().close();
    }
}