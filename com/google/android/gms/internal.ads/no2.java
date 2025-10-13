package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class no2<T> implements mo2, go2 {
    private static final no2<Object> a = new no2<>(null);

    /* renamed from: b, reason: collision with root package name */
    private final T f7764b;

    private no2(T t) {
        this.f7764b = t;
    }

    public static <T> mo2<T> a(T t) {
        ro2.a(t, "instance cannot be null");
        return new no2(t);
    }

    public static <T> mo2<T> b(T t) {
        return t == null ? a : new no2(t);
    }

    @Override // com.google.android.gms.internal.ads.wo2
    public final T zzb() {
        return this.f7764b;
    }
}