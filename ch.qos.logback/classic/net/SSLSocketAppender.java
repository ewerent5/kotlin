package ch.qos.logback.classic.net;

import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.net.AbstractSSLSocketAppender;
import ch.qos.logback.core.spi.PreSerializationTransformer;
import java.net.InetAddress;

/* loaded from: classes.dex */
public class SSLSocketAppender extends AbstractSSLSocketAppender<ILoggingEvent> {
    private boolean includeCallerData;
    private final PreSerializationTransformer<ILoggingEvent> pst;

    public SSLSocketAppender() {
        this.pst = new LoggingEventPreSerializationTransformer();
    }

    @Deprecated
    public SSLSocketAppender(String str, int i2) {
        super(str, i2);
        this.pst = new LoggingEventPreSerializationTransformer();
    }

    @Deprecated
    public SSLSocketAppender(InetAddress inetAddress, int i2) {
        super(inetAddress.getHostAddress(), i2);
        this.pst = new LoggingEventPreSerializationTransformer();
    }

    @Override // ch.qos.logback.core.net.AbstractSocketAppender
    public PreSerializationTransformer<ILoggingEvent> getPST() {
        return this.pst;
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