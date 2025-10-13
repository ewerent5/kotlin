package com.bumptech.glide.load.n.b0;

import com.bumptech.glide.load.n.b0.a;
import java.io.File;

/* compiled from: DiskLruCacheFactory.java */
/* loaded from: classes.dex */
public class d implements a.InterfaceC0081a {
    private final long a;

    /* renamed from: b, reason: collision with root package name */
    private final a f3684b;

    /* compiled from: DiskLruCacheFactory.java */
    public interface a {
        File a();
    }

    public d(a aVar, long j2) {
        this.a = j2;
        this.f3684b = aVar;
    }

    @Override // com.bumptech.glide.load.n.b0.a.InterfaceC0081a
    public com.bumptech.glide.load.n.b0.a a() {
        File fileA = this.f3684b.a();
        if (fileA == null) {
            return null;
        }
        if (fileA.isDirectory() || fileA.mkdirs()) {
            return e.c(fileA, this.a);
        }
        return null;
    }
}