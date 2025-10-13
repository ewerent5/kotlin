package okhttp3.internal.cache;

import j.q;
import java.io.IOException;
import okhttp3.internal.concurrent.Task;

/* compiled from: DiskLruCache.kt */
/* loaded from: classes3.dex */
public final class DiskLruCache$cleanupTask$1 extends Task {
    DiskLruCache$cleanupTask$1(String str) {
        super(str, false, 2, null);
    }

    @Override // okhttp3.internal.concurrent.Task
    public long runOnce() {
        synchronized (this.this$0) {
            if (!this.this$0.initialized || this.this$0.getClosed$okhttp()) {
                return -1L;
            }
            try {
                this.this$0.trimToSize();
            } catch (IOException unused) {
                this.this$0.mostRecentTrimFailed = true;
            }
            try {
                if (this.this$0.journalRebuildRequired()) {
                    this.this$0.rebuildJournal$okhttp();
                    this.this$0.redundantOpCount = 0;
                }
            } catch (IOException unused2) {
                this.this$0.mostRecentRebuildFailed = true;
                this.this$0.journalWriter = q.c(q.b());
            }
            return -1L;
        }
    }
}