package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.util.Stack;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class nv2 {
    private final byte[] a = new byte[8];

    /* renamed from: b, reason: collision with root package name */
    private final Stack<mv2> f7801b = new Stack<>();

    /* renamed from: c, reason: collision with root package name */
    private final tv2 f7802c = new tv2();

    /* renamed from: d, reason: collision with root package name */
    private int f7803d;

    /* renamed from: e, reason: collision with root package name */
    private int f7804e;

    /* renamed from: f, reason: collision with root package name */
    private long f7805f;

    /* renamed from: g, reason: collision with root package name */
    private pv2 f7806g;

    nv2() {
    }

    private final long d(zu2 zu2Var, int i2) throws InterruptedException, EOFException {
        zu2Var.b(this.a, 0, i2, false);
        long j2 = 0;
        for (int i3 = 0; i3 < i2; i3++) {
            j2 = (j2 << 8) | (this.a[i3] & 255);
        }
        return j2;
    }

    public final void a() {
        this.f7803d = 0;
        this.f7801b.clear();
        this.f7802c.a();
    }

    public final void b(pv2 pv2Var) {
        this.f7806g = pv2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:73:0x0193 A[LOOP:0: B:7:0x000c->B:73:0x0193, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00a5 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean c(com.google.android.gms.internal.ads.zu2 r12) throws com.google.android.gms.internal.ads.at2, java.lang.InterruptedException, java.io.EOFException {
        /*
            Method dump skipped, instructions count: 413
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.nv2.c(com.google.android.gms.internal.ads.zu2):boolean");
    }
}