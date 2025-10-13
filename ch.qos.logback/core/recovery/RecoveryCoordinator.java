package ch.qos.logback.core.recovery;

/* loaded from: classes.dex */
public class RecoveryCoordinator {
    static long BACKOFF_COEFFICIENT_MAX = 327680;
    public static final long BACKOFF_COEFFICIENT_MIN = 20;
    private static long UNSET = -1;
    private long backOffCoefficient = 20;
    private long currentTime = UNSET;
    long next = System.currentTimeMillis() + getBackoffCoefficient();

    private long getBackoffCoefficient() {
        long j2 = this.backOffCoefficient;
        if (j2 < BACKOFF_COEFFICIENT_MAX) {
            this.backOffCoefficient = 4 * j2;
        }
        return j2;
    }

    private long getCurrentTime() {
        long j2 = this.currentTime;
        return j2 != UNSET ? j2 : System.currentTimeMillis();
    }

    public boolean isTooSoon() {
        long currentTime = getCurrentTime();
        if (currentTime <= this.next) {
            return true;
        }
        this.next = currentTime + getBackoffCoefficient();
        return false;
    }

    void setCurrentTime(long j2) {
        this.currentTime = j2;
    }
}