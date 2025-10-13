package com.bumptech.glide.load.o.y;

import com.bumptech.glide.load.data.j;
import com.bumptech.glide.load.h;
import com.bumptech.glide.load.i;
import com.bumptech.glide.load.o.g;
import com.bumptech.glide.load.o.m;
import com.bumptech.glide.load.o.n;
import com.bumptech.glide.load.o.o;
import com.bumptech.glide.load.o.r;
import java.io.InputStream;

/* compiled from: HttpGlideUrlLoader.java */
/* loaded from: classes.dex */
public class a implements n<g, InputStream> {
    public static final h<Integer> a = h.f("com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout", 2500);

    /* renamed from: b, reason: collision with root package name */
    private final m<g, g> f3930b;

    /* compiled from: HttpGlideUrlLoader.java */
    /* renamed from: com.bumptech.glide.load.o.y.a$a, reason: collision with other inner class name */
    public static class C0092a implements o<g, InputStream> {
        private final m<g, g> a = new m<>(500);

        @Override // com.bumptech.glide.load.o.o
        public n<g, InputStream> b(r rVar) {
            return new a(this.a);
        }
    }

    public a(m<g, g> mVar) {
        this.f3930b = mVar;
    }

    @Override // com.bumptech.glide.load.o.n
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public n.a<InputStream> b(g gVar, int i2, int i3, i iVar) {
        m<g, g> mVar = this.f3930b;
        if (mVar != null) {
            g gVarA = mVar.a(gVar, 0, 0);
            if (gVarA == null) {
                this.f3930b.b(gVar, 0, 0, gVar);
            } else {
                gVar = gVarA;
            }
        }
        return new n.a<>(gVar, new j(gVar, ((Integer) iVar.c(a)).intValue()));
    }

    @Override // com.bumptech.glide.load.o.n
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(g gVar) {
        return true;
    }
}