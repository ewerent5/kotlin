package com.bumptech.glide.load.o;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.bumptech.glide.load.data.d;
import com.bumptech.glide.load.o.n;
import java.io.File;
import java.io.FileNotFoundException;

/* compiled from: MediaStoreFileLoader.java */
/* loaded from: classes.dex */
public final class k implements n<Uri, File> {
    private final Context a;

    /* compiled from: MediaStoreFileLoader.java */
    public static final class a implements o<Uri, File> {
        private final Context a;

        public a(Context context) {
            this.a = context;
        }

        @Override // com.bumptech.glide.load.o.o
        public n<Uri, File> b(r rVar) {
            return new k(this.a);
        }
    }

    /* compiled from: MediaStoreFileLoader.java */
    private static class b implements com.bumptech.glide.load.data.d<File> {

        /* renamed from: e, reason: collision with root package name */
        private static final String[] f3901e = {"_data"};

        /* renamed from: f, reason: collision with root package name */
        private final Context f3902f;

        /* renamed from: g, reason: collision with root package name */
        private final Uri f3903g;

        b(Context context, Uri uri) {
            this.f3902f = context;
            this.f3903g = uri;
        }

        @Override // com.bumptech.glide.load.data.d
        public Class<File> a() {
            return File.class;
        }

        @Override // com.bumptech.glide.load.data.d
        public void b() {
        }

        @Override // com.bumptech.glide.load.data.d
        public void cancel() {
        }

        @Override // com.bumptech.glide.load.data.d
        public com.bumptech.glide.load.a d() {
            return com.bumptech.glide.load.a.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.d
        public void e(com.bumptech.glide.g gVar, d.a<? super File> aVar) {
            Cursor cursorQuery = this.f3902f.getContentResolver().query(this.f3903g, f3901e, null, null, null);
            if (cursorQuery != null) {
                try {
                    string = cursorQuery.moveToFirst() ? cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data")) : null;
                } finally {
                    cursorQuery.close();
                }
            }
            if (!TextUtils.isEmpty(string)) {
                aVar.f(new File(string));
                return;
            }
            aVar.c(new FileNotFoundException("Failed to find file path for: " + this.f3903g));
        }
    }

    public k(Context context) {
        this.a = context;
    }

    @Override // com.bumptech.glide.load.o.n
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public n.a<File> b(Uri uri, int i2, int i3, com.bumptech.glide.load.i iVar) {
        return new n.a<>(new com.bumptech.glide.s.b(uri), new b(this.a, uri));
    }

    @Override // com.bumptech.glide.load.o.n
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(Uri uri) {
        return com.bumptech.glide.load.data.o.b.b(uri);
    }
}