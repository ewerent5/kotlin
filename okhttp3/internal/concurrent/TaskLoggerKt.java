package okhttp3.internal.concurrent;

import ch.qos.logback.core.CoreConstants;
import i.y.c.a;
import i.y.d.k;
import i.y.d.l;
import i.y.d.x;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import okhttp3.internal.http2.Http2Connection;

/* compiled from: TaskLogger.kt */
/* loaded from: classes3.dex */
public final class TaskLoggerKt {
    public static final String formatDuration(long j2) {
        String str;
        if (j2 <= -999500000) {
            str = ((j2 - 500000000) / Http2Connection.DEGRADED_PONG_TIMEOUT_NS) + " s ";
        } else if (j2 <= -999500) {
            str = ((j2 - 500000) / 1000000) + " ms";
        } else if (j2 <= 0) {
            str = ((j2 - 500) / CoreConstants.MILLIS_IN_ONE_SECOND) + " µs";
        } else if (j2 < 999500) {
            str = ((j2 + 500) / CoreConstants.MILLIS_IN_ONE_SECOND) + " µs";
        } else if (j2 < 999500000) {
            str = ((j2 + 500000) / 1000000) + " ms";
        } else {
            str = ((j2 + 500000000) / Http2Connection.DEGRADED_PONG_TIMEOUT_NS) + " s ";
        }
        x xVar = x.a;
        String str2 = String.format("%6s", Arrays.copyOf(new Object[]{str}, 1));
        l.c(str2, "java.lang.String.format(format, *args)");
        return str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void log(Task task, TaskQueue taskQueue, String str) {
        Logger logger = TaskRunner.Companion.getLogger();
        StringBuilder sb = new StringBuilder();
        sb.append(taskQueue.getName$okhttp());
        sb.append(' ');
        x xVar = x.a;
        String str2 = String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1));
        l.c(str2, "java.lang.String.format(format, *args)");
        sb.append(str2);
        sb.append(": ");
        sb.append(task.getName());
        logger.fine(sb.toString());
    }

    public static final <T> T logElapsed(Task task, TaskQueue taskQueue, a<? extends T> aVar) {
        long jNanoTime;
        l.d(task, "task");
        l.d(taskQueue, "queue");
        l.d(aVar, "block");
        boolean zIsLoggable = TaskRunner.Companion.getLogger().isLoggable(Level.FINE);
        if (zIsLoggable) {
            jNanoTime = taskQueue.getTaskRunner$okhttp().getBackend().nanoTime();
            log(task, taskQueue, "starting");
        } else {
            jNanoTime = -1;
        }
        try {
            T tInvoke = aVar.invoke();
            k.b(1);
            if (zIsLoggable) {
                log(task, taskQueue, "finished run in " + formatDuration(taskQueue.getTaskRunner$okhttp().getBackend().nanoTime() - jNanoTime));
            }
            k.a(1);
            return tInvoke;
        } catch (Throwable th) {
            k.b(1);
            if (zIsLoggable) {
                log(task, taskQueue, "failed a run in " + formatDuration(taskQueue.getTaskRunner$okhttp().getBackend().nanoTime() - jNanoTime));
            }
            k.a(1);
            throw th;
        }
    }

    public static final void taskLog(Task task, TaskQueue taskQueue, a<String> aVar) {
        l.d(task, "task");
        l.d(taskQueue, "queue");
        l.d(aVar, "messageBlock");
        if (TaskRunner.Companion.getLogger().isLoggable(Level.FINE)) {
            log(task, taskQueue, aVar.invoke());
        }
    }
}