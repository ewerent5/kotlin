package okhttp3.internal.concurrent;

import i.s;
import i.y.d.l;
import java.util.logging.Level;

/* compiled from: TaskRunner.kt */
/* loaded from: classes3.dex */
public final class TaskRunner$runnable$1 implements Runnable {
    TaskRunner$runnable$1() {
    }

    @Override // java.lang.Runnable
    public void run() {
        Task taskAwaitTaskToRun;
        while (true) {
            synchronized (this.this$0) {
                taskAwaitTaskToRun = this.this$0.awaitTaskToRun();
            }
            if (taskAwaitTaskToRun == null) {
                return;
            }
            TaskQueue queue$okhttp = taskAwaitTaskToRun.getQueue$okhttp();
            l.b(queue$okhttp);
            long jNanoTime = -1;
            boolean zIsLoggable = TaskRunner.Companion.getLogger().isLoggable(Level.FINE);
            if (zIsLoggable) {
                jNanoTime = queue$okhttp.getTaskRunner$okhttp().getBackend().nanoTime();
                TaskLoggerKt.log(taskAwaitTaskToRun, queue$okhttp, "starting");
            }
            try {
                try {
                    this.this$0.runTask(taskAwaitTaskToRun);
                    s sVar = s.a;
                    if (zIsLoggable) {
                        TaskLoggerKt.log(taskAwaitTaskToRun, queue$okhttp, "finished run in " + TaskLoggerKt.formatDuration(queue$okhttp.getTaskRunner$okhttp().getBackend().nanoTime() - jNanoTime));
                    }
                } finally {
                }
            } catch (Throwable th) {
                if (zIsLoggable) {
                    TaskLoggerKt.log(taskAwaitTaskToRun, queue$okhttp, "failed a run in " + TaskLoggerKt.formatDuration(queue$okhttp.getTaskRunner$okhttp().getBackend().nanoTime() - jNanoTime));
                }
                throw th;
            }
        }
    }
}