package okhttp3.internal.concurrent;

import ch.qos.logback.core.joran.action.Action;
import i.y.d.g;
import i.y.d.l;

/* compiled from: Task.kt */
/* loaded from: classes3.dex */
public abstract class Task {
    private final boolean cancelable;
    private final String name;
    private long nextExecuteNanoTime;
    private TaskQueue queue;

    public Task(String str, boolean z) {
        l.d(str, Action.NAME_ATTRIBUTE);
        this.name = str;
        this.cancelable = z;
        this.nextExecuteNanoTime = -1L;
    }

    public final boolean getCancelable() {
        return this.cancelable;
    }

    public final String getName() {
        return this.name;
    }

    public final long getNextExecuteNanoTime$okhttp() {
        return this.nextExecuteNanoTime;
    }

    public final TaskQueue getQueue$okhttp() {
        return this.queue;
    }

    public final void initQueue$okhttp(TaskQueue taskQueue) {
        l.d(taskQueue, "queue");
        TaskQueue taskQueue2 = this.queue;
        if (taskQueue2 == taskQueue) {
            return;
        }
        if (!(taskQueue2 == null)) {
            throw new IllegalStateException("task is in multiple queues".toString());
        }
        this.queue = taskQueue;
    }

    public abstract long runOnce();

    public final void setNextExecuteNanoTime$okhttp(long j2) {
        this.nextExecuteNanoTime = j2;
    }

    public final void setQueue$okhttp(TaskQueue taskQueue) {
        this.queue = taskQueue;
    }

    public String toString() {
        return this.name;
    }

    public /* synthetic */ Task(String str, boolean z, int i2, g gVar) {
        this(str, (i2 & 2) != 0 ? true : z);
    }
}