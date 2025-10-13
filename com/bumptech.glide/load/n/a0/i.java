package com.bumptech.glide.load.n.a0;

/* compiled from: IntegerArrayAdapter.java */
/* loaded from: classes.dex */
public final class i implements a<int[]> {
    @Override // com.bumptech.glide.load.n.a0.a
    public int a() {
        return 4;
    }

    @Override // com.bumptech.glide.load.n.a0.a
    public String b() {
        return "IntegerArrayPool";
    }

    @Override // com.bumptech.glide.load.n.a0.a
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public int c(int[] iArr) {
        return iArr.length;
    }

    @Override // com.bumptech.glide.load.n.a0.a
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public int[] newArray(int i2) {
        return new int[i2];
    }
}