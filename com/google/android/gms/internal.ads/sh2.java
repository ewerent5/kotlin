package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class sh2 extends uh2 {

    /* renamed from: e, reason: collision with root package name */
    private int f8870e = 0;

    /* renamed from: f, reason: collision with root package name */
    private final int f8871f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ ci2 f8872g;

    sh2(ci2 ci2Var) {
        this.f8872g = ci2Var;
        this.f8871f = ci2Var.l();
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        return this.f8870e < this.f8871f;
    }

    @Override // com.google.android.gms.internal.ads.xh2
    public final byte zza() {
        int i2 = this.f8870e;
        if (i2 >= this.f8871f) {
            throw new NoSuchElementException();
        }
        this.f8870e = i2 + 1;
        return this.f8872g.k(i2);
    }
}