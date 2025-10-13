package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class vu1 {
    private final Executor a;

    /* renamed from: b, reason: collision with root package name */
    private final jr f9783b;

    public vu1(Executor executor, jr jrVar) {
        this.a = executor;
        this.f9783b = jrVar;
    }

    public final void a(List<String> list) {
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            b(it.next());
        }
    }

    public final void b(final String str) {
        this.a.execute(new Runnable(this, str) { // from class: com.google.android.gms.internal.ads.uu1

            /* renamed from: e, reason: collision with root package name */
            private final vu1 f9567e;

            /* renamed from: f, reason: collision with root package name */
            private final String f9568f;

            {
                this.f9567e = this;
                this.f9568f = str;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f9567e.c(this.f9568f);
            }
        });
    }

    final /* synthetic */ void c(String str) {
        this.f9783b.zza(str);
    }
}