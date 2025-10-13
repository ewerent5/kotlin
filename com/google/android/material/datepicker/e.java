package com.google.android.material.datepicker;

import android.content.Context;
import android.os.Build;
import android.text.format.DateUtils;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* compiled from: DateStrings.java */
/* loaded from: classes.dex */
class e {
    static String a(long j2) {
        return b(j2, Locale.getDefault());
    }

    static String b(long j2, Locale locale) {
        return Build.VERSION.SDK_INT >= 24 ? s.b(locale).format(new Date(j2)) : s.f(locale).format(new Date(j2));
    }

    static String c(Context context, long j2) {
        return DateUtils.formatDateTime(context, j2 - TimeZone.getDefault().getOffset(j2), 36);
    }

    static String d(long j2) {
        return e(j2, Locale.getDefault());
    }

    static String e(long j2, Locale locale) {
        return Build.VERSION.SDK_INT >= 24 ? s.m(locale).format(new Date(j2)) : s.f(locale).format(new Date(j2));
    }
}