package ch.qos.logback.core.util;

/* loaded from: classes.dex */
public class FixedDelay implements DelayStrategy {
    private long nextDelay;
    private final long subsequentDelay;

    /* JADX WARN: Illegal instructions before constructor call */
    public FixedDelay(int i2) {
        long j2 = i2;
        this(j2, j2);
    }

    public FixedDelay(long j2, long j3) {
        new String();
        this.nextDelay = j2;
        this.subsequentDelay = j3;
    }

    @Override // ch.qos.logback.core.util.DelayStrategy
    public long nextDelay() {
        long j2 = this.nextDelay;
        this.nextDelay = this.subsequentDelay;
        return j2;
    }
}