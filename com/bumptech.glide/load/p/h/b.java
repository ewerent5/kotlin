package com.bumptech.glide.load.p.h;

import android.graphics.Bitmap;
import com.bumptech.glide.n.a;

/* compiled from: GifBitmapProvider.java */
/* loaded from: classes.dex */
public final class b implements a.InterfaceC0099a {
    private final com.bumptech.glide.load.n.a0.e a;

    /* renamed from: b, reason: collision with root package name */
    private final com.bumptech.glide.load.n.a0.b f4033b;

    public b(com.bumptech.glide.load.n.a0.e eVar, com.bumptech.glide.load.n.a0.b bVar) {
        this.a = eVar;
        this.f4033b = bVar;
    }

    @Override // com.bumptech.glide.n.a.InterfaceC0099a
    public Bitmap a(int i2, int i3, Bitmap.Config config) {
        return this.a.e(i2, i3, config);
    }

    @Override // com.bumptech.glide.n.a.InterfaceC0099a
    public int[] b(int i2) {
        com.bumptech.glide.load.n.a0.b bVar = this.f4033b;
        return bVar == null ? new int[i2] : (int[]) bVar.e(i2, int[].class);
    }

    @Override // com.bumptech.glide.n.a.InterfaceC0099a
    public void c(Bitmap bitmap) {
        this.a.c(bitmap);
    }

    @Override // com.bumptech.glide.n.a.InterfaceC0099a
    public void d(byte[] bArr) {
        com.bumptech.glide.load.n.a0.b bVar = this.f4033b;
        if (bVar == null) {
            return;
        }
        bVar.d(bArr);
    }

    @Override // com.bumptech.glide.n.a.InterfaceC0099a
    public byte[] e(int i2) {
        com.bumptech.glide.load.n.a0.b bVar = this.f4033b;
        return bVar == null ? new byte[i2] : (byte[]) bVar.e(i2, byte[].class);
    }

    @Override // com.bumptech.glide.n.a.InterfaceC0099a
    public void f(int[] iArr) {
        com.bumptech.glide.load.n.a0.b bVar = this.f4033b;
        if (bVar == null) {
            return;
        }
        bVar.d(iArr);
    }
}