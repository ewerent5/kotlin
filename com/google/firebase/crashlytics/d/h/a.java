package com.google.firebase.crashlytics.d.h;

import java.util.Collections;
import java.util.Map;
import java.util.regex.Pattern;

/* compiled from: AbstractSpiCall.java */
/* loaded from: classes.dex */
public abstract class a {
    private static final Pattern a = Pattern.compile("http(s?)://[^\\/]+", 2);

    /* renamed from: b, reason: collision with root package name */
    private final String f12336b;

    /* renamed from: c, reason: collision with root package name */
    private final com.google.firebase.crashlytics.d.k.c f12337c;

    /* renamed from: d, reason: collision with root package name */
    private final com.google.firebase.crashlytics.d.k.a f12338d;

    /* renamed from: e, reason: collision with root package name */
    private final String f12339e;

    public a(String str, String str2, com.google.firebase.crashlytics.d.k.c cVar, com.google.firebase.crashlytics.d.k.a aVar) {
        if (str2 == null) {
            throw new IllegalArgumentException("url must not be null.");
        }
        if (cVar == null) {
            throw new IllegalArgumentException("requestFactory must not be null.");
        }
        this.f12339e = str;
        this.f12336b = f(str2);
        this.f12337c = cVar;
        this.f12338d = aVar;
    }

    private String f(String str) {
        return !h.B(this.f12339e) ? a.matcher(str).replaceFirst(this.f12339e) : str;
    }

    protected com.google.firebase.crashlytics.d.k.b c() {
        return d(Collections.emptyMap());
    }

    protected com.google.firebase.crashlytics.d.k.b d(Map<String, String> map) {
        return this.f12337c.a(this.f12338d, e(), map).d("User-Agent", "Crashlytics Android SDK/" + m.i()).d("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa");
    }

    protected String e() {
        return this.f12336b;
    }
}