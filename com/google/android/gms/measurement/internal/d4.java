package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement@@18.0.0 */
/* loaded from: classes.dex */
final class d4 implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    private final e4 f10801e;

    /* renamed from: f, reason: collision with root package name */
    private final int f10802f;

    /* renamed from: g, reason: collision with root package name */
    private final Throwable f10803g;

    /* renamed from: h, reason: collision with root package name */
    private final byte[] f10804h;

    /* renamed from: i, reason: collision with root package name */
    private final String f10805i;

    /* renamed from: j, reason: collision with root package name */
    private final Map<String, List<String>> f10806j;

    private d4(String str, e4 e4Var, int i2, Throwable th, byte[] bArr, Map<String, List<String>> map) {
        com.google.android.gms.common.internal.p.j(e4Var);
        this.f10801e = e4Var;
        this.f10802f = i2;
        this.f10803g = th;
        this.f10804h = bArr;
        this.f10805i = str;
        this.f10806j = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f10801e.a(this.f10805i, this.f10802f, this.f10803g, this.f10804h, this.f10806j);
    }
}