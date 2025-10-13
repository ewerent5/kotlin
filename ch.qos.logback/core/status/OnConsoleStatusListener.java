package ch.qos.logback.core.status;

import ch.qos.logback.core.Context;
import java.io.PrintStream;

/* loaded from: classes.dex */
public class OnConsoleStatusListener extends OnPrintStreamStatusListenerBase {
    public static void addNewInstanceToContext(Context context) {
        OnConsoleStatusListener onConsoleStatusListener = new OnConsoleStatusListener();
        onConsoleStatusListener.setContext(context);
        if (context.getStatusManager().addUniquely(onConsoleStatusListener, context)) {
            onConsoleStatusListener.start();
        }
    }

    @Override // ch.qos.logback.core.status.OnPrintStreamStatusListenerBase, ch.qos.logback.core.status.StatusListener
    public /* bridge */ /* synthetic */ void addStatusEvent(Status status) {
        super.addStatusEvent(status);
    }

    @Override // ch.qos.logback.core.status.OnPrintStreamStatusListenerBase
    protected PrintStream getPrintStream() {
        return System.out;
    }

    @Override // ch.qos.logback.core.status.OnPrintStreamStatusListenerBase
    public /* bridge */ /* synthetic */ long getRetrospective() {
        return super.getRetrospective();
    }

    @Override // ch.qos.logback.core.status.OnPrintStreamStatusListenerBase, ch.qos.logback.core.spi.LifeCycle
    public /* bridge */ /* synthetic */ boolean isStarted() {
        return super.isStarted();
    }

    @Override // ch.qos.logback.core.status.OnPrintStreamStatusListenerBase
    public /* bridge */ /* synthetic */ void setRetrospective(long j2) {
        super.setRetrospective(j2);
    }

    @Override // ch.qos.logback.core.status.OnPrintStreamStatusListenerBase, ch.qos.logback.core.spi.LifeCycle
    public /* bridge */ /* synthetic */ void start() {
        super.start();
    }

    @Override // ch.qos.logback.core.status.OnPrintStreamStatusListenerBase, ch.qos.logback.core.spi.LifeCycle
    public /* bridge */ /* synthetic */ void stop() {
        super.stop();
    }
}