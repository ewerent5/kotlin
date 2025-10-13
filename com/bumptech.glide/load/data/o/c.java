package com.bumptech.glide.load.data.o;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import android.util.Log;
import com.bumptech.glide.load.data.d;
import com.bumptech.glide.load.data.g;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: ThumbFetcher.java */
/* loaded from: classes.dex */
public class c implements com.bumptech.glide.load.data.d<InputStream> {

    /* renamed from: e, reason: collision with root package name */
    private final Uri f3615e;

    /* renamed from: f, reason: collision with root package name */
    private final e f3616f;

    /* renamed from: g, reason: collision with root package name */
    private InputStream f3617g;

    /* compiled from: ThumbFetcher.java */
    static class a implements d {
        private static final String[] a = {"_data"};

        /* renamed from: b, reason: collision with root package name */
        private final ContentResolver f3618b;

        a(ContentResolver contentResolver) {
            this.f3618b = contentResolver;
        }

        @Override // com.bumptech.glide.load.data.o.d
        public Cursor a(Uri uri) {
            return this.f3618b.query(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, a, "kind = 1 AND image_id = ?", new String[]{uri.getLastPathSegment()}, null);
        }
    }

    /* compiled from: ThumbFetcher.java */
    static class b implements d {
        private static final String[] a = {"_data"};

        /* renamed from: b, reason: collision with root package name */
        private final ContentResolver f3619b;

        b(ContentResolver contentResolver) {
            this.f3619b = contentResolver;
        }

        @Override // com.bumptech.glide.load.data.o.d
        public Cursor a(Uri uri) {
            return this.f3619b.query(MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI, a, "kind = 1 AND video_id = ?", new String[]{uri.getLastPathSegment()}, null);
        }
    }

    c(Uri uri, e eVar) {
        this.f3615e = uri;
        this.f3616f = eVar;
    }

    private static c c(Context context, Uri uri, d dVar) {
        return new c(uri, new e(com.bumptech.glide.b.c(context).j().g(), dVar, com.bumptech.glide.b.c(context).e(), context.getContentResolver()));
    }

    public static c f(Context context, Uri uri) {
        return c(context, uri, new a(context.getContentResolver()));
    }

    public static c g(Context context, Uri uri) {
        return c(context, uri, new b(context.getContentResolver()));
    }

    private InputStream h() throws Throwable {
        InputStream inputStreamD = this.f3616f.d(this.f3615e);
        int iA = inputStreamD != null ? this.f3616f.a(this.f3615e) : -1;
        return iA != -1 ? new g(inputStreamD, iA) : inputStreamD;
    }

    @Override // com.bumptech.glide.load.data.d
    public Class<InputStream> a() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.data.d
    public void b() throws IOException {
        InputStream inputStream = this.f3617g;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public void cancel() {
    }

    @Override // com.bumptech.glide.load.data.d
    public com.bumptech.glide.load.a d() {
        return com.bumptech.glide.load.a.LOCAL;
    }

    @Override // com.bumptech.glide.load.data.d
    public void e(com.bumptech.glide.g gVar, d.a<? super InputStream> aVar) throws Throwable {
        try {
            InputStream inputStreamH = h();
            this.f3617g = inputStreamH;
            aVar.f(inputStreamH);
        } catch (FileNotFoundException e2) {
            if (Log.isLoggable("MediaStoreThumbFetcher", 3)) {
                Log.d("MediaStoreThumbFetcher", "Failed to find thumbnail file", e2);
            }
            aVar.c(e2);
        }
    }
}