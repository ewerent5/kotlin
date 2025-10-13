package com.google.android.material.datepicker;

import android.annotation.TargetApi;
import android.icu.text.DateFormat;
import ch.qos.logback.core.net.SyslogConstants;
import j$.util.DesugarTimeZone;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: UtcDates.java */
/* loaded from: classes.dex */
class s {
    static AtomicReference<r> a = new AtomicReference<>();

    static long a(long j2) {
        Calendar calendarK = k();
        calendarK.setTimeInMillis(j2);
        return d(calendarK).getTimeInMillis();
    }

    @TargetApi(SyslogConstants.LOG_DAEMON)
    static DateFormat b(Locale locale) {
        return c("MMMEd", locale);
    }

    @TargetApi(SyslogConstants.LOG_DAEMON)
    private static DateFormat c(String str, Locale locale) {
        DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton(str, locale);
        instanceForSkeleton.setTimeZone(j());
        return instanceForSkeleton;
    }

    static Calendar d(Calendar calendar) {
        Calendar calendarL = l(calendar);
        Calendar calendarK = k();
        calendarK.set(calendarL.get(1), calendarL.get(2), calendarL.get(5));
        return calendarK;
    }

    private static java.text.DateFormat e(int i2, Locale locale) {
        java.text.DateFormat dateInstance = java.text.DateFormat.getDateInstance(i2, locale);
        dateInstance.setTimeZone(h());
        return dateInstance;
    }

    static java.text.DateFormat f(Locale locale) {
        return e(0, locale);
    }

    static r g() {
        r rVar = a.get();
        return rVar == null ? r.c() : rVar;
    }

    private static TimeZone h() {
        return DesugarTimeZone.getTimeZone("UTC");
    }

    static Calendar i() {
        Calendar calendarA = g().a();
        calendarA.set(11, 0);
        calendarA.set(12, 0);
        calendarA.set(13, 0);
        calendarA.set(14, 0);
        calendarA.setTimeZone(h());
        return calendarA;
    }

    @TargetApi(SyslogConstants.LOG_DAEMON)
    private static android.icu.util.TimeZone j() {
        return android.icu.util.TimeZone.getTimeZone("UTC");
    }

    static Calendar k() {
        return l(null);
    }

    static Calendar l(Calendar calendar) {
        Calendar calendar2 = Calendar.getInstance(h());
        if (calendar == null) {
            calendar2.clear();
        } else {
            calendar2.setTimeInMillis(calendar.getTimeInMillis());
        }
        return calendar2;
    }

    @TargetApi(SyslogConstants.LOG_DAEMON)
    static DateFormat m(Locale locale) {
        return c("yMMMEd", locale);
    }
}