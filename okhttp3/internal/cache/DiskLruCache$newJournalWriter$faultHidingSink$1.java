package okhttp3.internal.cache;

import i.s;
import i.y.c.l;
import i.y.d.m;
import java.io.IOException;
import okhttp3.internal.Util;

/* compiled from: DiskLruCache.kt */
/* loaded from: classes3.dex */
final class DiskLruCache$newJournalWriter$faultHidingSink$1 extends m implements l<IOException, s> {
    final /* synthetic */ DiskLruCache this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DiskLruCache$newJournalWriter$faultHidingSink$1(DiskLruCache diskLruCache) {
        super(1);
        this.this$0 = diskLruCache;
    }

    @Override // i.y.c.l
    public /* bridge */ /* synthetic */ s invoke(IOException iOException) {
        invoke2(iOException);
        return s.a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(IOException iOException) {
        i.y.d.l.d(iOException, "it");
        DiskLruCache diskLruCache = this.this$0;
        if (!Util.assertionsEnabled || Thread.holdsLock(diskLruCache)) {
            this.this$0.hasJournalErrors = true;
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Thread ");
        Thread threadCurrentThread = Thread.currentThread();
        i.y.d.l.c(threadCurrentThread, "Thread.currentThread()");
        sb.append(threadCurrentThread.getName());
        sb.append(" MUST hold lock on ");
        sb.append(diskLruCache);
        throw new AssertionError(sb.toString());
    }
}