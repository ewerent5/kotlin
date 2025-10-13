package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final /* synthetic */ class yw implements Runnable {

    /* renamed from: e */
    private final bx f10496e;

    /* renamed from: f */
    private final Map f10497f;

    yw(bx bxVar, Map map) {
        this.f10496e = bxVar;
        this.f10497f = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f10496e.N4(this.f10497f);
    }
}