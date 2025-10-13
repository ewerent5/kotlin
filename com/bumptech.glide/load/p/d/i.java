package com.bumptech.glide.load.p.d;

import android.graphics.Bitmap;
import java.security.MessageDigest;

/* compiled from: CenterCrop.java */
/* loaded from: classes.dex */
public class i extends f {

    /* renamed from: b, reason: collision with root package name */
    private static final byte[] f3967b = "com.bumptech.glide.load.resource.bitmap.CenterCrop".getBytes(com.bumptech.glide.load.g.a);

    @Override // com.bumptech.glide.load.g
    public void a(MessageDigest messageDigest) {
        messageDigest.update(f3967b);
    }

    @Override // com.bumptech.glide.load.p.d.f
    protected Bitmap c(com.bumptech.glide.load.n.a0.e eVar, Bitmap bitmap, int i2, int i3) {
        return z.b(eVar, bitmap, i2, i3);
    }

    @Override // com.bumptech.glide.load.g
    public boolean equals(Object obj) {
        return obj instanceof i;
    }

    @Override // com.bumptech.glide.load.g
    public int hashCode() {
        return -599754482;
    }
}