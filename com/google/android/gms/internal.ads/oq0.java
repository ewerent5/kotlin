package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class oq0<T> implements ba<Object> {
    private final WeakReference<T> a;

    /* renamed from: b, reason: collision with root package name */
    private final String f7999b;

    /* renamed from: c, reason: collision with root package name */
    private final ba<T> f8000c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ pq0 f8001d;

    /* synthetic */ oq0(pq0 pq0Var, WeakReference weakReference, String str, ba baVar, fq0 fq0Var) {
        this.f8001d = pq0Var;
        this.a = weakReference;
        this.f7999b = str;
        this.f8000c = baVar;
    }

    @Override // com.google.android.gms.internal.ads.ba
    public final void a(Object obj, Map<String, String> map) {
        T t = this.a.get();
        if (t == null) {
            this.f8001d.e(this.f7999b, this);
        } else {
            this.f8000c.a(t, map);
        }
    }
}