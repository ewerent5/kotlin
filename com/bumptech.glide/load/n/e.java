package com.bumptech.glide.load.n;

import com.bumptech.glide.load.n.b0.a;
import java.io.File;

/* compiled from: DataCacheWriter.java */
/* loaded from: classes.dex */
class e<DataType> implements a.b {
    private final com.bumptech.glide.load.d<DataType> a;

    /* renamed from: b, reason: collision with root package name */
    private final DataType f3731b;

    /* renamed from: c, reason: collision with root package name */
    private final com.bumptech.glide.load.i f3732c;

    e(com.bumptech.glide.load.d<DataType> dVar, DataType datatype, com.bumptech.glide.load.i iVar) {
        this.a = dVar;
        this.f3731b = datatype;
        this.f3732c = iVar;
    }

    @Override // com.bumptech.glide.load.n.b0.a.b
    public boolean a(File file) {
        return this.a.a(this.f3731b, file, this.f3732c);
    }
}