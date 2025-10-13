package com.google.firebase.remoteconfig.internal;

import android.content.SharedPreferences;
import java.util.Date;

/* compiled from: ConfigMetadataClient.java */
/* loaded from: classes.dex */
public class n {
    static final Date a = new Date(-1);

    /* renamed from: b, reason: collision with root package name */
    static final Date f12963b = new Date(-1);

    /* renamed from: c, reason: collision with root package name */
    private final SharedPreferences f12964c;

    /* renamed from: d, reason: collision with root package name */
    private final Object f12965d = new Object();

    /* renamed from: e, reason: collision with root package name */
    private final Object f12966e = new Object();

    /* compiled from: ConfigMetadataClient.java */
    static class a {
        private int a;

        /* renamed from: b, reason: collision with root package name */
        private Date f12967b;

        a(int i2, Date date) {
            this.a = i2;
            this.f12967b = date;
        }

        Date a() {
            return this.f12967b;
        }

        int b() {
            return this.a;
        }
    }

    public n(SharedPreferences sharedPreferences) {
        this.f12964c = sharedPreferences;
    }

    a a() {
        a aVar;
        synchronized (this.f12966e) {
            aVar = new a(this.f12964c.getInt("num_failed_fetches", 0), new Date(this.f12964c.getLong("backoff_end_time_in_millis", -1L)));
        }
        return aVar;
    }

    public long b() {
        return this.f12964c.getLong("fetch_timeout_in_seconds", 60L);
    }

    String c() {
        return this.f12964c.getString("last_fetch_etag", null);
    }

    Date d() {
        return new Date(this.f12964c.getLong("last_fetch_time_in_millis", -1L));
    }

    public long e() {
        return this.f12964c.getLong("minimum_fetch_interval_in_seconds", k.a);
    }

    void f() {
        g(0, f12963b);
    }

    void g(int i2, Date date) {
        synchronized (this.f12966e) {
            this.f12964c.edit().putInt("num_failed_fetches", i2).putLong("backoff_end_time_in_millis", date.getTime()).apply();
        }
    }

    public void h(com.google.firebase.remoteconfig.l lVar) {
        synchronized (this.f12965d) {
            this.f12964c.edit().putLong("fetch_timeout_in_seconds", lVar.a()).putLong("minimum_fetch_interval_in_seconds", lVar.b()).commit();
        }
    }

    void i(String str) {
        synchronized (this.f12965d) {
            this.f12964c.edit().putString("last_fetch_etag", str).apply();
        }
    }

    void j() {
        synchronized (this.f12965d) {
            this.f12964c.edit().putInt("last_fetch_status", 1).apply();
        }
    }

    void k(Date date) {
        synchronized (this.f12965d) {
            this.f12964c.edit().putInt("last_fetch_status", -1).putLong("last_fetch_time_in_millis", date.getTime()).apply();
        }
    }

    void l() {
        synchronized (this.f12965d) {
            this.f12964c.edit().putInt("last_fetch_status", 2).apply();
        }
    }
}