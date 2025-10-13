package com.google.firebase.installations;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* compiled from: Utils.java */
/* loaded from: classes.dex */
public final class o {
    public static final long a = TimeUnit.HOURS.toSeconds(1);

    /* renamed from: b, reason: collision with root package name */
    private static final Pattern f12809b = Pattern.compile("\\AA[\\w-]{38}\\z");

    /* renamed from: c, reason: collision with root package name */
    private static o f12810c;

    /* renamed from: d, reason: collision with root package name */
    private final com.google.firebase.installations.r.a f12811d;

    private o(com.google.firebase.installations.r.a aVar) {
        this.f12811d = aVar;
    }

    public static o c() {
        return d(com.google.firebase.installations.r.b.b());
    }

    public static o d(com.google.firebase.installations.r.a aVar) {
        if (f12810c == null) {
            f12810c = new o(aVar);
        }
        return f12810c;
    }

    static boolean g(String str) {
        return f12809b.matcher(str).matches();
    }

    static boolean h(String str) {
        return str.contains(":");
    }

    public long a() {
        return this.f12811d.a();
    }

    public long b() {
        return TimeUnit.MILLISECONDS.toSeconds(a());
    }

    public long e() {
        return (long) (Math.random() * 1000.0d);
    }

    public boolean f(com.google.firebase.installations.p.d dVar) {
        return TextUtils.isEmpty(dVar.b()) || dVar.h() + dVar.c() < b() + a;
    }
}