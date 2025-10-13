package k.c.e.m;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* compiled from: ZipFileArchive.java */
/* loaded from: classes3.dex */
public class v implements f {
    protected ZipFile a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f16678b = false;

    private String d(long j2, String str) {
        return str + '/' + k.c.f.m.e(j2) + '/' + k.c.f.m.c(j2) + '/' + k.c.f.m.d(j2) + ".png";
    }

    @Override // k.c.e.m.f
    public void a(File file) {
        this.a = new ZipFile(file);
    }

    @Override // k.c.e.m.f
    public void b(boolean z) {
        this.f16678b = z;
    }

    @Override // k.c.e.m.f
    public InputStream c(k.c.e.n.d dVar, long j2) {
        try {
            if (!this.f16678b) {
                ZipEntry entry = this.a.getEntry(dVar.b(j2));
                if (entry != null) {
                    return this.a.getInputStream(entry);
                }
                return null;
            }
            Enumeration<? extends ZipEntry> enumerationEntries = this.a.entries();
            while (enumerationEntries.hasMoreElements()) {
                String name = enumerationEntries.nextElement().getName();
                if (name.contains("/")) {
                    ZipEntry entry2 = this.a.getEntry(d(j2, name.split("/")[0]));
                    if (entry2 != null) {
                        return this.a.getInputStream(entry2);
                    }
                }
            }
            return null;
        } catch (IOException e2) {
            Log.w("OsmDroid", "Error getting zip stream: " + k.c.f.m.h(j2), e2);
            return null;
        }
    }

    @Override // k.c.e.m.f
    public void close() throws IOException {
        try {
            this.a.close();
        } catch (IOException unused) {
        }
    }

    public String toString() {
        return "ZipFileArchive [mZipFile=" + this.a.getName() + "]";
    }
}