package com.google.android.gms.common.api.internal;

import android.util.Log;
import com.google.android.gms.common.api.internal.b;
import java.util.Collections;

/* loaded from: classes.dex */
final class q implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.common.b f4605e;

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ b.c f4606f;

    q(b.c cVar, com.google.android.gms.common.b bVar) {
        this.f4606f = cVar;
        this.f4605e = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (!this.f4605e.L()) {
            ((b.a) b.this.q.get(this.f4606f.f4581b)).U(this.f4605e);
            return;
        }
        b.c.e(this.f4606f, true);
        if (this.f4606f.a.requiresSignIn()) {
            this.f4606f.g();
            return;
        }
        try {
            this.f4606f.a.getRemoteService(null, Collections.emptySet());
        } catch (SecurityException e2) {
            Log.e("GoogleApiManager", "Failed to get service from broker. ", e2);
            ((b.a) b.this.q.get(this.f4606f.f4581b)).U(new com.google.android.gms.common.b(10));
        }
    }
}