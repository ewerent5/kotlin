package ch.qos.logback.core.util;

import okhttp3.internal.ws.WebSocketProtocol;

/* loaded from: classes.dex */
public class InvocationGate {
    private static final int MAX_MASK = 65535;
    private static final long thresholdForMaskIncrease = 100;
    private volatile long mask = 15;
    private volatile long lastMaskCheck = System.currentTimeMillis();
    private long invocationCounter = 0;
    private final long thresholdForMaskDecrease = 800;

    public boolean skipFurtherWork() {
        long j2 = this.invocationCounter;
        this.invocationCounter = 1 + j2;
        return (j2 & this.mask) != this.mask;
    }

    public void updateMaskIfNecessary(long j2) {
        long j3;
        long j4 = j2 - this.lastMaskCheck;
        this.lastMaskCheck = j2;
        if (j4 < thresholdForMaskIncrease && this.mask < WebSocketProtocol.PAYLOAD_SHORT_MAX) {
            j3 = (this.mask << 1) | 1;
        } else if (j4 <= 800) {
            return;
        } else {
            j3 = this.mask >>> 2;
        }
        this.mask = j3;
    }
}