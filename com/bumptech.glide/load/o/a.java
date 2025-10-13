package com.bumptech.glide.load.o;

import android.content.res.AssetManager;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import ch.qos.logback.core.joran.action.Action;
import com.bumptech.glide.load.o.n;
import java.io.InputStream;

/* compiled from: AssetUriLoader.java */
/* loaded from: classes.dex */
public class a<Data> implements n<Uri, Data> {
    private static final int a = 22;

    /* renamed from: b, reason: collision with root package name */
    private final AssetManager f3876b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC0088a<Data> f3877c;

    /* compiled from: AssetUriLoader.java */
    /* renamed from: com.bumptech.glide.load.o.a$a, reason: collision with other inner class name */
    public interface InterfaceC0088a<Data> {
        com.bumptech.glide.load.data.d<Data> a(AssetManager assetManager, String str);
    }

    /* compiled from: AssetUriLoader.java */
    public static class b implements o<Uri, ParcelFileDescriptor>, InterfaceC0088a<ParcelFileDescriptor> {
        private final AssetManager a;

        public b(AssetManager assetManager) {
            this.a = assetManager;
        }

        @Override // com.bumptech.glide.load.o.a.InterfaceC0088a
        public com.bumptech.glide.load.data.d<ParcelFileDescriptor> a(AssetManager assetManager, String str) {
            return new com.bumptech.glide.load.data.h(assetManager, str);
        }

        @Override // com.bumptech.glide.load.o.o
        public n<Uri, ParcelFileDescriptor> b(r rVar) {
            return new a(this.a, this);
        }
    }

    /* compiled from: AssetUriLoader.java */
    public static class c implements o<Uri, InputStream>, InterfaceC0088a<InputStream> {
        private final AssetManager a;

        public c(AssetManager assetManager) {
            this.a = assetManager;
        }

        @Override // com.bumptech.glide.load.o.a.InterfaceC0088a
        public com.bumptech.glide.load.data.d<InputStream> a(AssetManager assetManager, String str) {
            return new com.bumptech.glide.load.data.m(assetManager, str);
        }

        @Override // com.bumptech.glide.load.o.o
        public n<Uri, InputStream> b(r rVar) {
            return new a(this.a, this);
        }
    }

    public a(AssetManager assetManager, InterfaceC0088a<Data> interfaceC0088a) {
        this.f3876b = assetManager;
        this.f3877c = interfaceC0088a;
    }

    @Override // com.bumptech.glide.load.o.n
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public n.a<Data> b(Uri uri, int i2, int i3, com.bumptech.glide.load.i iVar) {
        return new n.a<>(new com.bumptech.glide.s.b(uri), this.f3877c.a(this.f3876b, uri.toString().substring(a)));
    }

    @Override // com.bumptech.glide.load.o.n
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(Uri uri) {
        return Action.FILE_ATTRIBUTE.equals(uri.getScheme()) && !uri.getPathSegments().isEmpty() && "android_asset".equals(uri.getPathSegments().get(0));
    }
}