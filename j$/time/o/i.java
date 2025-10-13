package j$.time.o;

import j$.time.Duration;

/* loaded from: classes2.dex */
public enum i implements o {
    NANOS("Nanos", Duration.j(1)),
    MICROS("Micros", Duration.j(1000)),
    MILLIS("Millis", Duration.j(1000000)),
    SECONDS("Seconds", Duration.l(1)),
    MINUTES("Minutes", Duration.l(60)),
    HOURS("Hours", Duration.l(3600)),
    HALF_DAYS("HalfDays", Duration.l(43200)),
    DAYS("Days", Duration.l(86400)),
    WEEKS("Weeks", Duration.l(604800)),
    MONTHS("Months", Duration.l(2629746)),
    YEARS("Years", Duration.l(31556952)),
    DECADES("Decades", Duration.l(315569520)),
    CENTURIES("Centuries", Duration.l(3155695200L)),
    MILLENNIA("Millennia", Duration.l(31556952000L)),
    ERAS("Eras", Duration.l(31556952000000000L)),
    FOREVER("Forever", Duration.n(Long.MAX_VALUE, 999999999));


    /* renamed from: b, reason: collision with root package name */
    private final String f15975b;

    i(String str, Duration duration) {
        this.f15975b = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f15975b;
    }
}