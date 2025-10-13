package com.google.android.gms.measurement.internal;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* loaded from: classes.dex */
final /* synthetic */ class l7 implements Runnable {

    /* renamed from: e */
    private final m7 f11008e;

    /* renamed from: f */
    private final int f11009f;

    /* renamed from: g */
    private final Exception f11010g;

    /* renamed from: h */
    private final byte[] f11011h;

    /* renamed from: i */
    private final Map f11012i;

    l7(m7 m7Var, int i2, Exception exc, byte[] bArr, Map map) {
        this.f11008e = m7Var;
        this.f11009f = i2;
        this.f11010g = exc;
        this.f11011h = bArr;
        this.f11012i = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f11008e.a(this.f11009f, this.f11010g, this.f11011h, this.f11012i);
    }
}