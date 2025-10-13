package okhttp3.internal.cache;

import i.s;
import j.d0;
import j.l;
import okhttp3.internal.cache.DiskLruCache;

/* compiled from: DiskLruCache.kt */
/* loaded from: classes3.dex */
public final class DiskLruCache$Entry$newSource$1 extends l {
    final /* synthetic */ d0 $fileSource;
    private boolean closed;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DiskLruCache$Entry$newSource$1(d0 d0Var, d0 d0Var2) {
        super(d0Var2);
        d0VarSource = d0Var;
    }

    @Override // j.l, j.d0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        super.close();
        if (this.closed) {
            return;
        }
        this.closed = true;
        synchronized (this.this$0.this$0) {
            this.this$0.setLockingSourceCount$okhttp(r1.getLockingSourceCount$okhttp() - 1);
            if (this.this$0.getLockingSourceCount$okhttp() == 0 && this.this$0.getZombie$okhttp()) {
                DiskLruCache.Entry entry = this.this$0;
                entry.this$0.removeEntry$okhttp(entry);
            }
            s sVar = s.a;
        }
    }
}