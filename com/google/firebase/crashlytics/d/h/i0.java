package com.google.firebase.crashlytics.d.h;

import j$.util.Spliterator;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collections;
import java.util.Map;

/* compiled from: UserMetadata.java */
/* loaded from: classes.dex */
public class i0 {
    private String a = null;

    /* renamed from: b, reason: collision with root package name */
    private final ConcurrentHashMap<String, String> f12374b = new ConcurrentHashMap<>();

    private static String c(String str) {
        if (str == null) {
            return str;
        }
        String strTrim = str.trim();
        return strTrim.length() > 1024 ? strTrim.substring(0, Spliterator.IMMUTABLE) : strTrim;
    }

    public Map<String, String> a() {
        return Collections.unmodifiableMap(this.f12374b);
    }

    public String b() {
        return this.a;
    }

    public void d(String str) {
        this.a = c(str);
    }
}