package androidx.lifecycle;

import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: ViewModel.java */
/* loaded from: classes.dex */
public abstract class x {
    private final Map<String, Object> a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private volatile boolean f1242b = false;

    private static void b(Object obj) throws IOException {
        if (obj instanceof Closeable) {
            try {
                ((Closeable) obj).close();
            } catch (IOException e2) {
                throw new RuntimeException(e2);
            }
        }
    }

    final void a() {
        this.f1242b = true;
        Map<String, Object> map = this.a;
        if (map != null) {
            synchronized (map) {
                Iterator<Object> it = this.a.values().iterator();
                while (it.hasNext()) {
                    b(it.next());
                }
            }
        }
        d();
    }

    <T> T c(String str) {
        T t;
        Map<String, Object> map = this.a;
        if (map == null) {
            return null;
        }
        synchronized (map) {
            t = (T) this.a.get(str);
        }
        return t;
    }

    protected void d() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    <T> T e(String str, T t) throws IOException {
        Object obj;
        synchronized (this.a) {
            obj = this.a.get(str);
            if (obj == 0) {
                this.a.put(str, t);
            }
        }
        if (obj != 0) {
            t = obj;
        }
        if (this.f1242b) {
            b(t);
        }
        return t;
    }
}