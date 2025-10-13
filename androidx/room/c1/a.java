package androidx.room.c1;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: CopyLock.java */
/* loaded from: classes.dex */
public class a {
    private static final Map<String, Lock> a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final File f1810b;

    /* renamed from: c, reason: collision with root package name */
    private final Lock f1811c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f1812d;

    /* renamed from: e, reason: collision with root package name */
    private FileChannel f1813e;

    public a(String str, File file, boolean z) {
        File file2 = new File(file, str + ".lck");
        this.f1810b = file2;
        this.f1811c = a(file2.getAbsolutePath());
        this.f1812d = z;
    }

    private static Lock a(String str) {
        Lock reentrantLock;
        Map<String, Lock> map = a;
        synchronized (map) {
            reentrantLock = map.get(str);
            if (reentrantLock == null) {
                reentrantLock = new ReentrantLock();
                map.put(str, reentrantLock);
            }
        }
        return reentrantLock;
    }

    public void b() throws IOException {
        this.f1811c.lock();
        if (this.f1812d) {
            try {
                FileChannel channel = new FileOutputStream(this.f1810b).getChannel();
                this.f1813e = channel;
                channel.lock();
            } catch (IOException e2) {
                throw new IllegalStateException("Unable to grab copy lock.", e2);
            }
        }
    }

    public void c() {
        FileChannel fileChannel = this.f1813e;
        if (fileChannel != null) {
            try {
                fileChannel.close();
            } catch (IOException unused) {
            }
        }
        this.f1811c.unlock();
    }
}