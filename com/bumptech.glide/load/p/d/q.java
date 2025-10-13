package com.bumptech.glide.load.p.d;

import android.graphics.Bitmap;
import java.security.MessageDigest;

/* compiled from: FitCenter.java */
/* loaded from: classes.dex */
public class q extends f {

    /* renamed from: b, reason: collision with root package name */
    private static final byte[] f3995b = "com.bumptech.glide.load.resource.bitmap.FitCenter".getBytes(com.bumptech.glide.load.g.a);

    @Override // com.bumptech.glide.load.g
    public void a(MessageDigest messageDigest) {
        messageDigest.update(f3995b);
    }

    @Override // com.bumptech.glide.load.p.d.f
    protected Bitmap c(com.bumptech.glide.load.n.a0.e eVar, Bitmap bitmap, int i2, int i3) {
        return z.e(eVar, bitmap, i2, i3);
    }

    @Override // com.bumptech.glide.load.g
    public boolean equals(Object obj) {
        return obj instanceof q;
    }

    @Override // com.bumptech.glide.load.g
    public int hashCode() {
        return 1572326941;
    }
}