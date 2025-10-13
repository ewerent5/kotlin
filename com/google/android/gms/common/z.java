package com.google.android.gms.common;

import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
/* loaded from: classes.dex */
abstract class z extends x {

    /* renamed from: f, reason: collision with root package name */
    private static final WeakReference<byte[]> f4782f = new WeakReference<>(null);

    /* renamed from: g, reason: collision with root package name */
    private WeakReference<byte[]> f4783g;

    z(byte[] bArr) {
        super(bArr);
        this.f4783g = f4782f;
    }

    protected abstract byte[] I4();

    @Override // com.google.android.gms.common.x
    final byte[] Y() {
        byte[] bArrI4;
        synchronized (this) {
            bArrI4 = this.f4783g.get();
            if (bArrI4 == null) {
                bArrI4 = I4();
                this.f4783g = new WeakReference<>(bArrI4);
            }
        }
        return bArrI4;
    }
}