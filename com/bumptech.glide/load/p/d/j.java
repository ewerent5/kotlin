package com.bumptech.glide.load.p.d;

import android.graphics.Bitmap;
import java.security.MessageDigest;

/* compiled from: CenterInside.java */
/* loaded from: classes.dex */
public class j extends f {

    /* renamed from: b, reason: collision with root package name */
    private static final byte[] f3968b = "com.bumptech.glide.load.resource.bitmap.CenterInside".getBytes(com.bumptech.glide.load.g.a);

    @Override // com.bumptech.glide.load.g
    public void a(MessageDigest messageDigest) {
        messageDigest.update(f3968b);
    }

    @Override // com.bumptech.glide.load.p.d.f
    protected Bitmap c(com.bumptech.glide.load.n.a0.e eVar, Bitmap bitmap, int i2, int i3) {
        return z.c(eVar, bitmap, i2, i3);
    }

    @Override // com.bumptech.glide.load.g
    public boolean equals(Object obj) {
        return obj instanceof j;
    }

    @Override // com.bumptech.glide.load.g
    public int hashCode() {
        return -670243078;
    }
}