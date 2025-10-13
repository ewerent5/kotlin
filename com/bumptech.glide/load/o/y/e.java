package com.bumptech.glide.load.o.y;

import com.bumptech.glide.load.i;
import com.bumptech.glide.load.o.g;
import com.bumptech.glide.load.o.n;
import com.bumptech.glide.load.o.o;
import com.bumptech.glide.load.o.r;
import java.io.InputStream;
import java.net.URL;

/* compiled from: UrlLoader.java */
/* loaded from: classes.dex */
public class e implements n<URL, InputStream> {
    private final n<g, InputStream> a;

    /* compiled from: UrlLoader.java */
    public static class a implements o<URL, InputStream> {
        @Override // com.bumptech.glide.load.o.o
        public n<URL, InputStream> b(r rVar) {
            return new e(rVar.d(g.class, InputStream.class));
        }
    }

    public e(n<g, InputStream> nVar) {
        this.a = nVar;
    }

    @Override // com.bumptech.glide.load.o.n
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public n.a<InputStream> b(URL url, int i2, int i3, i iVar) {
        return this.a.b(new g(url), i2, i3, iVar);
    }

    @Override // com.bumptech.glide.load.o.n
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(URL url) {
        return true;
    }
}