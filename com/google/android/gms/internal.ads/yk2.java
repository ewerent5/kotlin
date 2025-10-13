package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class yk2 extends uh2 {

    /* renamed from: e, reason: collision with root package name */
    final al2 f10439e;

    /* renamed from: f, reason: collision with root package name */
    xh2 f10440f = a();

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ cl2 f10441g;

    yk2(cl2 cl2Var) {
        this.f10441g = cl2Var;
        this.f10439e = new al2(cl2Var, null);
    }

    private final xh2 a() {
        if (this.f10439e.hasNext()) {
            return this.f10439e.next().iterator();
        }
        return null;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        return this.f10440f != null;
    }

    @Override // com.google.android.gms.internal.ads.xh2
    public final byte zza() {
        xh2 xh2Var = this.f10440f;
        if (xh2Var == null) {
            throw new NoSuchElementException();
        }
        byte bZza = xh2Var.zza();
        if (!this.f10440f.hasNext()) {
            this.f10440f = a();
        }
        return bZza;
    }
}