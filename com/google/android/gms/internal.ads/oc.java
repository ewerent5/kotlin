package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class oc {
    public static final boolean a = pd.f8137b;

    /* renamed from: b, reason: collision with root package name */
    private final List<nb> f7934b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private boolean f7935c = false;

    oc() {
    }

    public final synchronized void a(String str, long j2) {
        if (this.f7935c) {
            throw new IllegalStateException("Marker added to finished log");
        }
        this.f7934b.add(new nb(str, j2, SystemClock.elapsedRealtime()));
    }

    public final synchronized void b(String str) {
        long j2;
        this.f7935c = true;
        if (this.f7934b.size() == 0) {
            j2 = 0;
        } else {
            j2 = this.f7934b.get(r1.size() - 1).f7691c - this.f7934b.get(0).f7691c;
        }
        if (j2 <= 0) {
            return;
        }
        long j3 = this.f7934b.get(0).f7691c;
        pd.b("(%-4d ms) %s", Long.valueOf(j2), str);
        for (nb nbVar : this.f7934b) {
            long j4 = nbVar.f7691c;
            pd.b("(+%-4d) [%2d] %s", Long.valueOf(j4 - j3), Long.valueOf(nbVar.f7690b), nbVar.a);
            j3 = j4;
        }
    }

    protected final void finalize() {
        if (this.f7935c) {
            return;
        }
        b("Request on the loose");
        pd.c("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
    }
}