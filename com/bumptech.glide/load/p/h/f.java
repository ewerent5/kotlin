package com.bumptech.glide.load.p.h;

import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.load.m;
import com.bumptech.glide.load.n.v;
import java.security.MessageDigest;

/* compiled from: GifDrawableTransformation.java */
/* loaded from: classes.dex */
public class f implements m<c> {

    /* renamed from: b */
    private final m<Bitmap> f4043b;

    public f(m<Bitmap> mVar) {
        this.f4043b = (m) com.bumptech.glide.t.j.d(mVar);
    }

    @Override // com.bumptech.glide.load.g
    public void a(MessageDigest messageDigest) {
        this.f4043b.a(messageDigest);
    }

    @Override // com.bumptech.glide.load.m
    public v<c> b(Context context, v<c> vVar, int i2, int i3) {
        c cVar = vVar.get();
        v<Bitmap> eVar = new com.bumptech.glide.load.p.d.e(cVar.e(), com.bumptech.glide.b.c(context).f());
        v<Bitmap> vVarB = this.f4043b.b(context, eVar, i2, i3);
        if (!eVar.equals(vVarB)) {
            eVar.b();
        }
        cVar.m(this.f4043b, vVarB.get());
        return vVar;
    }

    @Override // com.bumptech.glide.load.g
    public boolean equals(Object obj) {
        if (obj instanceof f) {
            return this.f4043b.equals(((f) obj).f4043b);
        }
        return false;
    }

    @Override // com.bumptech.glide.load.g
    public int hashCode() {
        return this.f4043b.hashCode();
    }
}