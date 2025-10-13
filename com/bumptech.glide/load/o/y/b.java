package com.bumptech.glide.load.o.y;

import android.content.Context;
import android.net.Uri;
import com.bumptech.glide.load.i;
import com.bumptech.glide.load.o.n;
import com.bumptech.glide.load.o.o;
import com.bumptech.glide.load.o.r;
import java.io.InputStream;

/* compiled from: MediaStoreImageThumbLoader.java */
/* loaded from: classes.dex */
public class b implements n<Uri, InputStream> {
    private final Context a;

    /* compiled from: MediaStoreImageThumbLoader.java */
    public static class a implements o<Uri, InputStream> {
        private final Context a;

        public a(Context context) {
            this.a = context;
        }

        @Override // com.bumptech.glide.load.o.o
        public n<Uri, InputStream> b(r rVar) {
            return new b(this.a);
        }
    }

    public b(Context context) {
        this.a = context.getApplicationContext();
    }

    @Override // com.bumptech.glide.load.o.n
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public n.a<InputStream> b(Uri uri, int i2, int i3, i iVar) {
        if (com.bumptech.glide.load.data.o.b.d(i2, i3)) {
            return new n.a<>(new com.bumptech.glide.s.b(uri), com.bumptech.glide.load.data.o.c.f(this.a, uri));
        }
        return null;
    }

    @Override // com.bumptech.glide.load.o.n
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(Uri uri) {
        return com.bumptech.glide.load.data.o.b.a(uri);
    }
}