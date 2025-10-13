package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class sp {
    private final int a;

    /* renamed from: b, reason: collision with root package name */
    private final List<p43> f8952b;

    /* renamed from: c, reason: collision with root package name */
    private final int f8953c;

    /* renamed from: d, reason: collision with root package name */
    private final InputStream f8954d;

    public sp(int i2, List<p43> list, int i3, InputStream inputStream) {
        this.a = i2;
        this.f8952b = list;
        this.f8953c = i3;
        this.f8954d = inputStream;
    }

    public final int a() {
        return this.a;
    }

    public final List<p43> b() {
        return Collections.unmodifiableList(this.f8952b);
    }

    public final int c() {
        return this.f8953c;
    }

    public final InputStream d() {
        InputStream inputStream = this.f8954d;
        if (inputStream != null) {
            return inputStream;
        }
        return null;
    }
}