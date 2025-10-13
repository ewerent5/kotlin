package com.parizene.netmonitor.q0;

import android.content.Context;

/* compiled from: AppModule_ProvideReviewManagerFactory.java */
/* loaded from: classes3.dex */
public final class l0 implements f.c.c<com.google.android.play.core.review.a> {
    private final h.a.a<Context> a;

    public l0(h.a.a<Context> aVar) {
        this.a = aVar;
    }

    public static l0 a(h.a.a<Context> aVar) {
        return new l0(aVar);
    }

    public static com.google.android.play.core.review.a c(Context context) {
        return (com.google.android.play.core.review.a) f.c.f.c(t.r(context), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // h.a.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.google.android.play.core.review.a get() {
        return c(this.a.get());
    }
}