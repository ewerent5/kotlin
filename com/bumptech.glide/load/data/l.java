package com.bumptech.glide.load.data;

import android.content.ContentResolver;
import android.net.Uri;
import android.util.Log;
import com.bumptech.glide.load.data.d;
import java.io.FileNotFoundException;
import java.io.IOException;

/* compiled from: LocalUriFetcher.java */
/* loaded from: classes.dex */
public abstract class l<T> implements d<T> {

    /* renamed from: e, reason: collision with root package name */
    private final Uri f3611e;

    /* renamed from: f, reason: collision with root package name */
    private final ContentResolver f3612f;

    /* renamed from: g, reason: collision with root package name */
    private T f3613g;

    public l(ContentResolver contentResolver, Uri uri) {
        this.f3612f = contentResolver;
        this.f3611e = uri;
    }

    @Override // com.bumptech.glide.load.data.d
    public void b() {
        T t = this.f3613g;
        if (t != null) {
            try {
                c(t);
            } catch (IOException unused) {
            }
        }
    }

    protected abstract void c(T t);

    @Override // com.bumptech.glide.load.data.d
    public void cancel() {
    }

    @Override // com.bumptech.glide.load.data.d
    public com.bumptech.glide.load.a d() {
        return com.bumptech.glide.load.a.LOCAL;
    }

    @Override // com.bumptech.glide.load.data.d
    public final void e(com.bumptech.glide.g gVar, d.a<? super T> aVar) {
        try {
            T tF = f(this.f3611e, this.f3612f);
            this.f3613g = tF;
            aVar.f(tF);
        } catch (FileNotFoundException e2) {
            if (Log.isLoggable("LocalUriFetcher", 3)) {
                Log.d("LocalUriFetcher", "Failed to open Uri", e2);
            }
            aVar.c(e2);
        }
    }

    protected abstract T f(Uri uri, ContentResolver contentResolver);
}