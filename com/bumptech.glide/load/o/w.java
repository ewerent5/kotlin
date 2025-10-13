package com.bumptech.glide.load.o;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import ch.qos.logback.core.joran.action.Action;
import com.bumptech.glide.load.o.n;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: UriLoader.java */
/* loaded from: classes.dex */
public class w<Data> implements n<Uri, Data> {
    private static final Set<String> a = Collections.unmodifiableSet(new HashSet(Arrays.asList(Action.FILE_ATTRIBUTE, "android.resource", "content")));

    /* renamed from: b, reason: collision with root package name */
    private final c<Data> f3928b;

    /* compiled from: UriLoader.java */
    public static final class a implements o<Uri, AssetFileDescriptor>, c<AssetFileDescriptor> {
        private final ContentResolver a;

        public a(ContentResolver contentResolver) {
            this.a = contentResolver;
        }

        @Override // com.bumptech.glide.load.o.w.c
        public com.bumptech.glide.load.data.d<AssetFileDescriptor> a(Uri uri) {
            return new com.bumptech.glide.load.data.a(this.a, uri);
        }

        @Override // com.bumptech.glide.load.o.o
        public n<Uri, AssetFileDescriptor> b(r rVar) {
            return new w(this);
        }
    }

    /* compiled from: UriLoader.java */
    public static class b implements o<Uri, ParcelFileDescriptor>, c<ParcelFileDescriptor> {
        private final ContentResolver a;

        public b(ContentResolver contentResolver) {
            this.a = contentResolver;
        }

        @Override // com.bumptech.glide.load.o.w.c
        public com.bumptech.glide.load.data.d<ParcelFileDescriptor> a(Uri uri) {
            return new com.bumptech.glide.load.data.i(this.a, uri);
        }

        @Override // com.bumptech.glide.load.o.o
        public n<Uri, ParcelFileDescriptor> b(r rVar) {
            return new w(this);
        }
    }

    /* compiled from: UriLoader.java */
    public interface c<Data> {
        com.bumptech.glide.load.data.d<Data> a(Uri uri);
    }

    /* compiled from: UriLoader.java */
    public static class d implements o<Uri, InputStream>, c<InputStream> {
        private final ContentResolver a;

        public d(ContentResolver contentResolver) {
            this.a = contentResolver;
        }

        @Override // com.bumptech.glide.load.o.w.c
        public com.bumptech.glide.load.data.d<InputStream> a(Uri uri) {
            return new com.bumptech.glide.load.data.n(this.a, uri);
        }

        @Override // com.bumptech.glide.load.o.o
        public n<Uri, InputStream> b(r rVar) {
            return new w(this);
        }
    }

    public w(c<Data> cVar) {
        this.f3928b = cVar;
    }

    @Override // com.bumptech.glide.load.o.n
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public n.a<Data> b(Uri uri, int i2, int i3, com.bumptech.glide.load.i iVar) {
        return new n.a<>(new com.bumptech.glide.s.b(uri), this.f3928b.a(uri));
    }

    @Override // com.bumptech.glide.load.o.n
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(Uri uri) {
        return a.contains(uri.getScheme());
    }
}