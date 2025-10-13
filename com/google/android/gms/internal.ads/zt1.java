package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class zt1 {
    private final Executor a;

    /* renamed from: b, reason: collision with root package name */
    private final jr f10638b;

    public zt1(Executor executor, jr jrVar) {
        this.a = executor;
        this.f10638b = jrVar;
    }

    public final void a(final String str) {
        this.a.execute(new Runnable(this, str) { // from class: com.google.android.gms.internal.ads.yt1

            /* renamed from: e, reason: collision with root package name */
            private final zt1 f10482e;

            /* renamed from: f, reason: collision with root package name */
            private final String f10483f;

            {
                this.f10482e = this;
                this.f10483f = str;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f10482e.b(this.f10483f);
            }
        });
    }

    final /* synthetic */ void b(String str) {
        this.f10638b.zza(str);
    }
}