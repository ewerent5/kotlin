package com.google.firebase.m;

import android.content.Context;
import android.content.SharedPreferences;

/* compiled from: HeartBeatInfoStorage.java */
/* loaded from: classes.dex */
class e {
    private static e a;

    /* renamed from: b, reason: collision with root package name */
    private final SharedPreferences f12891b;

    private e(Context context) {
        this.f12891b = context.getSharedPreferences("FirebaseAppHeartBeat", 0);
    }

    static synchronized e a(Context context) {
        if (a == null) {
            a = new e(context);
        }
        return a;
    }

    synchronized boolean b(long j2) {
        return c("fire-global", j2);
    }

    synchronized boolean c(String str, long j2) {
        if (!this.f12891b.contains(str)) {
            this.f12891b.edit().putLong(str, j2).apply();
            return true;
        }
        if (j2 - this.f12891b.getLong(str, -1L) < 86400000) {
            return false;
        }
        this.f12891b.edit().putLong(str, j2).apply();
        return true;
    }
}