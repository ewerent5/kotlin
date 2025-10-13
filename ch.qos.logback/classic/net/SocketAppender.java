package ch.qos.logback.classic.net;

import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.net.AbstractSocketAppender;
import ch.qos.logback.core.spi.PreSerializationTransformer;
import java.net.InetAddress;

/* loaded from: classes.dex */
public class SocketAppender extends AbstractSocketAppender<ILoggingEvent> {
    private static final PreSerializationTransformer<ILoggingEvent> pst = new LoggingEventPreSerializationTransformer();
    private boolean includeCallerData;

    public SocketAppender() {
        this.includeCallerData = false;
    }

    @Deprecated
    public SocketAppender(String str, int i2) {
        super(str, i2);
        this.includeCallerData = false;
    }

    @Deprecated
    public SocketAppender(InetAddress inetAddress, int i2) {
        super(inetAddress.getHostAddress(), i2);
        this.includeCallerData = false;
    }

    @Override // ch.qos.logback.core.net.AbstractSocketAppender
    public PreSerializationTransformer<ILoggingEvent> getPST() {
        return pst;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ch.qos.logback.core.net.AbstractSocketAppender
    public void postProcessEvent(ILoggingEvent iLoggingEvent) {
        if (this.includeCallerData) {
            iLoggingEvent.getCallerData();
        }
    }

    public void setIncludeCallerData(boolean z) {
        this.includeCallerData = z;
    }
}