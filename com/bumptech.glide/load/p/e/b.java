package com.bumptech.glide.load.p.e;

import com.bumptech.glide.load.n.v;
import com.bumptech.glide.t.j;

/* compiled from: BytesResource.java */
/* loaded from: classes.dex */
public class b implements v<byte[]> {

    /* renamed from: e, reason: collision with root package name */
    private final byte[] f4025e;

    public b(byte[] bArr) {
        this.f4025e = (byte[]) j.d(bArr);
    }

    @Override // com.bumptech.glide.load.n.v
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public byte[] get() {
        return this.f4025e;
    }

    @Override // com.bumptech.glide.load.n.v
    public void b() {
    }

    @Override // com.bumptech.glide.load.n.v
    public int c() {
        return this.f4025e.length;
    }

    @Override // com.bumptech.glide.load.n.v
    public Class<byte[]> d() {
        return byte[].class;
    }
}