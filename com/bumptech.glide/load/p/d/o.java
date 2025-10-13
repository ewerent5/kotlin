package com.bumptech.glide.load.p.d;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import java.security.MessageDigest;

/* compiled from: DrawableTransformation.java */
/* loaded from: classes.dex */
public class o implements com.bumptech.glide.load.m<Drawable> {

    /* renamed from: b */
    private final com.bumptech.glide.load.m<Bitmap> f3993b;

    /* renamed from: c */
    private final boolean f3994c;

    public o(com.bumptech.glide.load.m<Bitmap> mVar, boolean z) {
        this.f3993b = mVar;
        this.f3994c = z;
    }

    private com.bumptech.glide.load.n.v<Drawable> d(Context context, com.bumptech.glide.load.n.v<Bitmap> vVar) {
        return u.f(context.getResources(), vVar);
    }

    @Override // com.bumptech.glide.load.g
    public void a(MessageDigest messageDigest) {
        this.f3993b.a(messageDigest);
    }

    @Override // com.bumptech.glide.load.m
    public com.bumptech.glide.load.n.v<Drawable> b(Context context, com.bumptech.glide.load.n.v<Drawable> vVar, int i2, int i3) {
        com.bumptech.glide.load.n.a0.e eVarF = com.bumptech.glide.b.c(context).f();
        Drawable drawable = vVar.get();
        com.bumptech.glide.load.n.v<Bitmap> vVarA = n.a(eVarF, drawable, i2, i3);
        if (vVarA != null) {
            com.bumptech.glide.load.n.v<Bitmap> vVarB = this.f3993b.b(context, vVarA, i2, i3);
            if (!vVarB.equals(vVarA)) {
                return d(context, vVarB);
            }
            vVarB.b();
            return vVar;
        }
        if (!this.f3994c) {
            return vVar;
        }
        throw new IllegalArgumentException("Unable to convert " + drawable + " to a Bitmap");
    }

    public com.bumptech.glide.load.m<BitmapDrawable> c() {
        return this;
    }

    @Override // com.bumptech.glide.load.g
    public boolean equals(Object obj) {
        if (obj instanceof o) {
            return this.f3993b.equals(((o) obj).f3993b);
        }
        return false;
    }

    @Override // com.bumptech.glide.load.g
    public int hashCode() {
        return this.f3993b.hashCode();
    }
}