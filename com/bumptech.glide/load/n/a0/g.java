package com.bumptech.glide.load.n.a0;

/* compiled from: ByteArrayAdapter.java */
/* loaded from: classes.dex */
public final class g implements a<byte[]> {
    @Override // com.bumptech.glide.load.n.a0.a
    public int a() {
        return 1;
    }

    @Override // com.bumptech.glide.load.n.a0.a
    public String b() {
        return "ByteArrayPool";
    }

    @Override // com.bumptech.glide.load.n.a0.a
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public int c(byte[] bArr) {
        return bArr.length;
    }

    @Override // com.bumptech.glide.load.n.a0.a
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public byte[] newArray(int i2) {
        return new byte[i2];
    }
}