package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
@Deprecated
/* loaded from: classes.dex */
public class ds<T> {
    private final wr<T> a;

    /* renamed from: b, reason: collision with root package name */
    private final AtomicInteger f5515b;

    public ds() {
        wr<T> wrVar = new wr<>();
        this.a = wrVar;
        this.f5515b = new AtomicInteger(0);
        y42.o(wrVar, new bs(this), qr.f8451f);
    }

    @Deprecated
    public final void a(as<T> asVar, yr yrVar) {
        y42.o(this.a, new cs(this, asVar, yrVar), qr.f8451f);
    }

    @Deprecated
    public final void b(T t) {
        this.a.zzc(t);
    }

    @Deprecated
    public final void c() {
        this.a.zzd(new Exception());
    }

    @Deprecated
    public final int d() {
        return this.f5515b.get();
    }
}