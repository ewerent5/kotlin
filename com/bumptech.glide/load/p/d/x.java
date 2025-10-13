package com.bumptech.glide.load.p.d;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;

/* compiled from: ResourceBitmapDecoder.java */
/* loaded from: classes.dex */
public class x implements com.bumptech.glide.load.k<Uri, Bitmap> {
    private final com.bumptech.glide.load.p.f.d a;

    /* renamed from: b, reason: collision with root package name */
    private final com.bumptech.glide.load.n.a0.e f4018b;

    public x(com.bumptech.glide.load.p.f.d dVar, com.bumptech.glide.load.n.a0.e eVar) {
        this.a = dVar;
        this.f4018b = eVar;
    }

    @Override // com.bumptech.glide.load.k
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public com.bumptech.glide.load.n.v<Bitmap> b(Uri uri, int i2, int i3, com.bumptech.glide.load.i iVar) {
        com.bumptech.glide.load.n.v<Drawable> vVarB = this.a.b(uri, i2, i3, iVar);
        if (vVarB == null) {
            return null;
        }
        return n.a(this.f4018b, vVarB.get(), i2, i3);
    }

    @Override // com.bumptech.glide.load.k
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(Uri uri, com.bumptech.glide.load.i iVar) {
        return "android.resource".equals(uri.getScheme());
    }
}