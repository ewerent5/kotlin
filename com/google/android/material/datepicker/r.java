package com.google.android.material.datepicker;

import java.util.Calendar;
import java.util.TimeZone;

/* compiled from: TimeSource.java */
/* loaded from: classes.dex */
class r {
    private static final r a = new r(null, null);

    /* renamed from: b, reason: collision with root package name */
    private final Long f11615b;

    /* renamed from: c, reason: collision with root package name */
    private final TimeZone f11616c;

    private r(Long l2, TimeZone timeZone) {
        this.f11615b = l2;
        this.f11616c = timeZone;
    }

    static r c() {
        return a;
    }

    Calendar a() {
        return b(this.f11616c);
    }

    Calendar b(TimeZone timeZone) {
        Calendar calendar = timeZone == null ? Calendar.getInstance() : Calendar.getInstance(timeZone);
        Long l2 = this.f11615b;
        if (l2 != null) {
            calendar.setTimeInMillis(l2.longValue());
        }
        return calendar;
    }
}