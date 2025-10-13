package com.parizene.netmonitor.q0;

import android.content.Context;
import android.content.pm.PackageManager;

/* compiled from: AndroidModule_ProvidePackageManagerFactory.java */
/* loaded from: classes3.dex */
public final class m implements f.c.c<PackageManager> {
    private final h.a.a<Context> a;

    public m(h.a.a<Context> aVar) {
        this.a = aVar;
    }

    public static m a(h.a.a<Context> aVar) {
        return new m(aVar);
    }

    public static PackageManager c(Context context) {
        return (PackageManager) f.c.f.c(d.i(context), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // h.a.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public PackageManager get() {
        return c(this.a.get());
    }
}