package k.c.e.m;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: GEMFFileArchive.java */
/* loaded from: classes3.dex */
public class e implements f {
    private k.c.f.c a;

    @Override // k.c.e.m.f
    public void a(File file) {
        this.a = new k.c.f.c(file);
    }

    @Override // k.c.e.m.f
    public void b(boolean z) {
    }

    @Override // k.c.e.m.f
    public InputStream c(k.c.e.n.d dVar, long j2) {
        return this.a.b(k.c.f.m.c(j2), k.c.f.m.d(j2), k.c.f.m.e(j2));
    }

    @Override // k.c.e.m.f
    public void close() {
        try {
            this.a.a();
        } catch (IOException unused) {
        }
    }

    public String toString() {
        return "GEMFFileArchive [mGEMFFile=" + this.a.c() + "]";
    }
}