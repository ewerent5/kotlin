package com.google.firebase.crashlytics.d.k;

import ch.qos.logback.core.spi.AbstractComponentTracker;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import okhttp3.CacheControl;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;

/* compiled from: HttpRequest.java */
/* loaded from: classes.dex */
public class b {
    private static final OkHttpClient a = new OkHttpClient().newBuilder().callTimeout(AbstractComponentTracker.LINGERING_TIMEOUT, TimeUnit.MILLISECONDS).build();

    /* renamed from: b, reason: collision with root package name */
    private final a f12660b;

    /* renamed from: c, reason: collision with root package name */
    private final String f12661c;

    /* renamed from: d, reason: collision with root package name */
    private final Map<String, String> f12662d;

    /* renamed from: f, reason: collision with root package name */
    private MultipartBody.Builder f12664f = null;

    /* renamed from: e, reason: collision with root package name */
    private final Map<String, String> f12663e = new HashMap();

    public b(a aVar, String str, Map<String, String> map) {
        this.f12660b = aVar;
        this.f12661c = str;
        this.f12662d = map;
    }

    private Request a() {
        Request.Builder builderCacheControl = new Request.Builder().cacheControl(new CacheControl.Builder().noCache().build());
        HttpUrl.Builder builderNewBuilder = HttpUrl.parse(this.f12661c).newBuilder();
        for (Map.Entry<String, String> entry : this.f12662d.entrySet()) {
            builderNewBuilder = builderNewBuilder.addEncodedQueryParameter(entry.getKey(), entry.getValue());
        }
        Request.Builder builderUrl = builderCacheControl.url(builderNewBuilder.build());
        for (Map.Entry<String, String> entry2 : this.f12663e.entrySet()) {
            builderUrl = builderUrl.header(entry2.getKey(), entry2.getValue());
        }
        MultipartBody.Builder builder = this.f12664f;
        return builderUrl.method(this.f12660b.name(), builder == null ? null : builder.build()).build();
    }

    private MultipartBody.Builder c() {
        if (this.f12664f == null) {
            this.f12664f = new MultipartBody.Builder().setType(MultipartBody.FORM);
        }
        return this.f12664f;
    }

    public d b() {
        return d.c(a.newCall(a()).execute());
    }

    public b d(String str, String str2) {
        this.f12663e.put(str, str2);
        return this;
    }

    public b e(Map.Entry<String, String> entry) {
        return d(entry.getKey(), entry.getValue());
    }

    public String f() {
        return this.f12660b.name();
    }

    public b g(String str, String str2) {
        this.f12664f = c().addFormDataPart(str, str2);
        return this;
    }

    public b h(String str, String str2, String str3, File file) {
        this.f12664f = c().addFormDataPart(str, str2, RequestBody.create(MediaType.parse(str3), file));
        return this;
    }
}