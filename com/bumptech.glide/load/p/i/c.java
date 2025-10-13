package com.bumptech.glide.load.p.i;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.i;
import com.bumptech.glide.load.n.v;

/* compiled from: DrawableBytesTranscoder.java */
/* loaded from: classes.dex */
public final class c implements e<Drawable, byte[]> {
    private final com.bumptech.glide.load.n.a0.e a;

    /* renamed from: b, reason: collision with root package name */
    private final e<Bitmap, byte[]> f4065b;

    /* renamed from: c, reason: collision with root package name */
    private final e<com.bumptech.glide.load.p.h.c, byte[]> f4066c;

    public c(com.bumptech.glide.load.n.a0.e eVar, e<Bitmap, byte[]> eVar2, e<com.bumptech.glide.load.p.h.c, byte[]> eVar3) {
        this.a = eVar;
        this.f4065b = eVar2;
        this.f4066c = eVar3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static v<com.bumptech.glide.load.p.h.c> b(v<Drawable> vVar) {
        return vVar;
    }

    @Override // com.bumptech.glide.load.p.i.e
    public v<byte[]> a(v<Drawable> vVar, i iVar) {
        Drawable drawable = vVar.get();
        if (drawable instanceof BitmapDrawable) {
            return this.f4065b.a(com.bumptech.glide.load.p.d.e.f(((BitmapDrawable) drawable).getBitmap(), this.a), iVar);
        }
        if (drawable instanceof com.bumptech.glide.load.p.h.c) {
            return this.f4066c.a(b(vVar), iVar);
        }
        return null;
    }
}