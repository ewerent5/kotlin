package k.c.e.m;

import android.graphics.drawable.Drawable;
import android.util.Log;
import j$.util.Comparator;
import j$.util.function.Function;
import j$.util.function.ToDoubleFunction;
import j$.util.function.ToIntFunction;
import j$.util.function.ToLongFunction;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;

/* compiled from: TileWriter.java */
/* loaded from: classes3.dex */
public class u implements g {
    private static long a = 0;

    /* renamed from: b, reason: collision with root package name */
    static boolean f16673b = false;

    /* renamed from: c, reason: collision with root package name */
    Thread f16674c;

    /* renamed from: d, reason: collision with root package name */
    private long f16675d;

    /* compiled from: TileWriter.java */
    class a extends Thread {
        a() {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            long unused = u.a = 0L;
            u.this.g(k.c.b.a.a().h());
            if (u.a > k.c.b.a.a().j()) {
                u.this.i();
            }
            if (k.c.b.a.a().c()) {
                Log.d("OsmDroid", "Finished init thread");
            }
        }
    }

    /* compiled from: TileWriter.java */
    class b implements Comparator<File>, j$.util.Comparator {
        b() {
        }

        @Override // java.util.Comparator, j$.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(File file, File file2) {
            return Long.valueOf(file.lastModified()).compareTo(Long.valueOf(file2.lastModified()));
        }

        @Override // java.util.Comparator, j$.util.Comparator
        public /* synthetic */ Comparator reversed() {
            return Collections.reverseOrder(this);
        }

        @Override // j$.util.Comparator
        public /* synthetic */ Comparator thenComparing(Function function) {
            return Comparator.CC.$default$thenComparing(this, function);
        }

        @Override // j$.util.Comparator
        public /* synthetic */ java.util.Comparator thenComparing(Function function, java.util.Comparator comparator) {
            return Comparator.CC.$default$thenComparing(this, function, comparator);
        }

        @Override // java.util.Comparator, j$.util.Comparator
        public /* synthetic */ java.util.Comparator thenComparing(java.util.Comparator comparator) {
            return Comparator.CC.$default$thenComparing(this, comparator);
        }

        @Override // j$.util.Comparator
        public /* synthetic */ java.util.Comparator thenComparingDouble(ToDoubleFunction toDoubleFunction) {
            return Comparator.CC.$default$thenComparingDouble(this, toDoubleFunction);
        }

        @Override // j$.util.Comparator
        public /* synthetic */ java.util.Comparator thenComparingInt(ToIntFunction toIntFunction) {
            return Comparator.CC.$default$thenComparingInt(this, toIntFunction);
        }

        @Override // j$.util.Comparator
        public /* synthetic */ java.util.Comparator thenComparingLong(ToLongFunction toLongFunction) {
            return Comparator.CC.$default$thenComparingLong(this, toLongFunction);
        }
    }

    public u() {
        this.f16674c = null;
        if (f16673b) {
            return;
        }
        f16673b = true;
        a aVar = new a();
        this.f16674c = aVar;
        aVar.setName("TileWriter#init");
        this.f16674c.setPriority(1);
        this.f16674c.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g(File file) {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                if (file2.isFile()) {
                    a += file2.length();
                }
                if (file2.isDirectory() && !l(file, file2)) {
                    g(file2);
                }
            }
        }
    }

    private boolean h(File file) throws InterruptedException {
        if (file.mkdirs()) {
            return true;
        }
        if (k.c.b.a.a().c()) {
            Log.d("OsmDroid", "Failed to create " + file + " - wait and check again");
        }
        try {
            Thread.sleep(500L);
        } catch (InterruptedException unused) {
        }
        if (file.exists()) {
            if (k.c.b.a.a().c()) {
                Log.d("OsmDroid", "Seems like another thread created " + file);
            }
            return true;
        }
        if (!k.c.b.a.a().c()) {
            return false;
        }
        Log.d("OsmDroid", "File still doesn't exist: " + file);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        synchronized (k.c.b.a.a().h()) {
            if (a > k.c.b.a.a().H()) {
                Log.d("OsmDroid", "Trimming tile cache from " + a + " to " + k.c.b.a.a().H());
                File[] fileArr = (File[]) j(k.c.b.a.a().h()).toArray(new File[0]);
                Arrays.sort(fileArr, new b());
                for (File file : fileArr) {
                    if (a <= k.c.b.a.a().H()) {
                        break;
                    }
                    long length = file.length();
                    if (file.delete()) {
                        if (k.c.b.a.a().l()) {
                            Log.d("OsmDroid", "Cache trim deleting " + file.getAbsolutePath());
                        }
                        a -= length;
                    }
                }
                Log.d("OsmDroid", "Finished trimming tile cache");
            }
        }
    }

    private List<File> j(File file) {
        ArrayList arrayList = new ArrayList();
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                if (file2.isFile()) {
                    arrayList.add(file2);
                }
                if (file2.isDirectory()) {
                    arrayList.addAll(j(file2));
                }
            }
        }
        return arrayList;
    }

    private boolean l(File file, File file2) {
        try {
            return !file.getCanonicalPath().equals(file2.getCanonicalFile().getParent());
        } catch (IOException | NoSuchElementException unused) {
            return true;
        }
    }

    @Override // k.c.e.m.g
    public void a() {
        Thread thread = this.f16674c;
        if (thread != null) {
            try {
                thread.interrupt();
            } catch (Throwable unused) {
            }
        }
    }

    @Override // k.c.e.m.g
    public boolean b(k.c.e.n.d dVar, long j2, InputStream inputStream, Long l2) throws Throwable {
        File fileK = k(dVar, j2);
        if (k.c.b.a.a().l()) {
            Log.d("OsmDroid", "TileWrite " + fileK.getAbsolutePath());
        }
        File parentFile = fileK.getParentFile();
        if (!parentFile.exists() && !h(parentFile)) {
            return false;
        }
        BufferedOutputStream bufferedOutputStream = null;
        try {
            try {
                BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(new FileOutputStream(fileK.getPath()), 8192);
                try {
                    long jB = a + k.c.e.o.f.b(inputStream, bufferedOutputStream2);
                    a = jB;
                    if (jB > k.c.b.a.a().j()) {
                        i();
                    }
                    k.c.e.o.f.a(bufferedOutputStream2);
                    return true;
                } catch (IOException unused) {
                    bufferedOutputStream = bufferedOutputStream2;
                    k.c.e.o.b.f16709c++;
                    if (bufferedOutputStream != null) {
                        k.c.e.o.f.a(bufferedOutputStream);
                    }
                    return false;
                } catch (Throwable th) {
                    th = th;
                    bufferedOutputStream = bufferedOutputStream2;
                    if (bufferedOutputStream != null) {
                        k.c.e.o.f.a(bufferedOutputStream);
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException unused2) {
        }
    }

    public File k(k.c.e.n.d dVar, long j2) {
        return new File(k.c.b.a.a().h(), dVar.b(j2) + ".tile");
    }

    public Drawable m(k.c.e.n.d dVar, long j2) {
        File fileK = k(dVar, j2);
        if (!fileK.exists()) {
            return null;
        }
        Drawable drawableG = dVar.g(fileK.getPath());
        if ((fileK.lastModified() < System.currentTimeMillis() - this.f16675d) && drawableG != null) {
            if (k.c.b.a.a().c()) {
                Log.d("OsmDroid", "Tile expired: " + k.c.f.m.h(j2));
            }
            k.c.e.b.b(drawableG, -2);
        }
        return drawableG;
    }

    public void n(long j2) {
        this.f16675d = j2;
    }
}