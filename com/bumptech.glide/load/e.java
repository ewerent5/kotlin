package com.bumptech.glide.load;

import java.io.IOException;

/* compiled from: HttpException.java */
/* loaded from: classes.dex */
public final class e extends IOException {

    /* renamed from: e, reason: collision with root package name */
    private final int f3625e;

    public e(int i2) {
        this("Http request failed", i2);
    }

    public e(String str, int i2) {
        this(str, i2, null);
    }

    public e(String str, int i2, Throwable th) {
        super(str + ", status code: " + i2, th);
        this.f3625e = i2;
    }
}