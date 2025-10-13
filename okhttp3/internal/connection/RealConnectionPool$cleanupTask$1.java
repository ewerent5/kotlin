package okhttp3.internal.connection;

import okhttp3.internal.concurrent.Task;

/* compiled from: RealConnectionPool.kt */
/* loaded from: classes3.dex */
public final class RealConnectionPool$cleanupTask$1 extends Task {
    RealConnectionPool$cleanupTask$1(String str) {
        super(str, false, 2, null);
    }

    @Override // okhttp3.internal.concurrent.Task
    public long runOnce() {
        return this.this$0.cleanup(System.nanoTime());
    }
}