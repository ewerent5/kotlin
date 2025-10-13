package com.bumptech.glide.load.p.d;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import java.io.File;

/* compiled from: BitmapDrawableEncoder.java */
/* loaded from: classes.dex */
public class b implements com.bumptech.glide.load.l<BitmapDrawable> {
    private final com.bumptech.glide.load.n.a0.e a;

    /* renamed from: b, reason: collision with root package name */
    private final com.bumptech.glide.load.l<Bitmap> f3954b;

    public b(com.bumptech.glide.load.n.a0.e eVar, com.bumptech.glide.load.l<Bitmap> lVar) {
        this.a = eVar;
        this.f3954b = lVar;
    }

    @Override // com.bumptech.glide.load.l
    public com.bumptech.glide.load.c b(com.bumptech.glide.load.i iVar) {
        return this.f3954b.b(iVar);
    }

    @Override // com.bumptech.glide.load.d
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean a(com.bumptech.glide.load.n.v<BitmapDrawable> vVar, File file, com.bumptech.glide.load.i iVar) {
        return this.f3954b.a(new e(vVar.get().getBitmap(), this.a), file, iVar);
    }
}