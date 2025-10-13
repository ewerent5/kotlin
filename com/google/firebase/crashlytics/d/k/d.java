package com.google.firebase.crashlytics.d.k;

import okhttp3.Headers;
import okhttp3.Response;

/* compiled from: HttpResponse.java */
/* loaded from: classes.dex */
public class d {
    private int a;

    /* renamed from: b, reason: collision with root package name */
    private String f12665b;

    /* renamed from: c, reason: collision with root package name */
    private Headers f12666c;

    d(int i2, String str, Headers headers) {
        this.a = i2;
        this.f12665b = str;
        this.f12666c = headers;
    }

    static d c(Response response) {
        return new d(response.code(), response.body() == null ? null : response.body().string(), response.headers());
    }

    public String a() {
        return this.f12665b;
    }

    public int b() {
        return this.a;
    }

    public String d(String str) {
        return this.f12666c.get(str);
    }
}