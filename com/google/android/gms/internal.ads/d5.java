package com.google.android.gms.internal.ads;

import ch.qos.logback.core.spi.AbstractComponentTracker;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public final class d5 {
    public static final z4<Boolean> a = a5.f("gads:consent:gmscore:dsid:enabled", true);

    /* renamed from: b, reason: collision with root package name */
    public static final z4<Boolean> f5431b = a5.f("gads:consent:gmscore:lat:enabled", true);

    /* renamed from: c, reason: collision with root package name */
    public static final z4<String> f5432c = new a5("gads:consent:gmscore:backend_url", "https://adservice.google.com/getconfig/pubvendors", 4);

    /* renamed from: d, reason: collision with root package name */
    public static final z4<Long> f5433d = new a5("gads:consent:gmscore:time_out", Long.valueOf(AbstractComponentTracker.LINGERING_TIMEOUT), 2);

    /* renamed from: e, reason: collision with root package name */
    public static final z4<Boolean> f5434e = a5.f("gads:consent:gmscore:enabled", true);
}