package com.parizene.netmonitor;

import android.content.Context;

/* compiled from: AppFilesProvider_Factory.java */
/* loaded from: classes.dex */
public final class l implements f.c.c<k> {
    private final h.a.a<Context> a;

    public l(h.a.a<Context> aVar) {
        this.a = aVar;
    }

    public static l a(h.a.a<Context> aVar) {
        return new l(aVar);
    }

    public static k c(Context context) {
        return new k(context);
    }

    @Override // h.a.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public k get() {
        return c(this.a.get());
    }
}