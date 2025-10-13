package j$.util;

import j$.time.Instant;
import j$.time.ZonedDateTime;
import java.util.GregorianCalendar;

/* loaded from: classes2.dex */
public class DesugarGregorianCalendar {
    private DesugarGregorianCalendar() {
    }

    public static ZonedDateTime toZonedDateTime(GregorianCalendar gregorianCalendar) {
        return ZonedDateTime.t(Instant.y(gregorianCalendar.getTimeInMillis()), j$.time.j.v(gregorianCalendar.getTimeZone().getID(), j$.time.j.a));
    }
}