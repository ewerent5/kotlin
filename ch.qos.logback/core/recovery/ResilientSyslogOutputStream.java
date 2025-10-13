package ch.qos.logback.core.recovery;

import ch.qos.logback.core.net.SyslogOutputStream;
import java.io.OutputStream;

/* loaded from: classes.dex */
public class ResilientSyslogOutputStream extends ResilientOutputStreamBase {
    int port;
    String syslogHost;

    public ResilientSyslogOutputStream(String str, int i2) {
        this.syslogHost = str;
        this.port = i2;
        this.os = new SyslogOutputStream(str, i2);
        this.presumedClean = true;
    }

    @Override // ch.qos.logback.core.recovery.ResilientOutputStreamBase
    String getDescription() {
        return "syslog [" + this.syslogHost + ":" + this.port + "]";
    }

    @Override // ch.qos.logback.core.recovery.ResilientOutputStreamBase
    OutputStream openNewOutputStream() {
        return new SyslogOutputStream(this.syslogHost, this.port);
    }

    public String toString() {
        return "c.q.l.c.recovery.ResilientSyslogOutputStream@" + System.identityHashCode(this);
    }
}