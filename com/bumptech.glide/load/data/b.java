package com.bumptech.glide.load.data;

import android.content.res.AssetManager;
import android.util.Log;
import com.bumptech.glide.load.data.d;
import java.io.IOException;

/* compiled from: AssetPathFetcher.java */
/* loaded from: classes.dex */
public abstract class b<T> implements d<T> {

    /* renamed from: e, reason: collision with root package name */
    private final String f3591e;

    /* renamed from: f, reason: collision with root package name */
    private final AssetManager f3592f;

    /* renamed from: g, reason: collision with root package name */
    private T f3593g;

    public b(AssetManager assetManager, String str) {
        this.f3592f = assetManager;
        this.f3591e = str;
    }

    @Override // com.bumptech.glide.load.data.d
    public void b() {
        T t = this.f3593g;
        if (t == null) {
            return;
        }
        try {
            c(t);
        } catch (IOException unused) {
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
    public void e(com.bumptech.glide.g gVar, d.a<? super T> aVar) {
        try {
            T tF = f(this.f3592f, this.f3591e);
            this.f3593g = tF;
            aVar.f(tF);
        } catch (IOException e2) {
            if (Log.isLoggable("AssetPathFetcher", 3)) {
                Log.d("AssetPathFetcher", "Failed to load data from asset manager", e2);
            }
            aVar.c(e2);
        }
    }

    protected abstract T f(AssetManager assetManager, String str);
}