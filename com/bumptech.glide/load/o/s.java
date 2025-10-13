package com.bumptech.glide.load.o;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.bumptech.glide.load.o.n;
import java.io.InputStream;

/* compiled from: ResourceLoader.java */
/* loaded from: classes.dex */
public class s<Data> implements n<Integer, Data> {
    private final n<Uri, Data> a;

    /* renamed from: b, reason: collision with root package name */
    private final Resources f3926b;

    /* compiled from: ResourceLoader.java */
    public static final class a implements o<Integer, AssetFileDescriptor> {
        private final Resources a;

        public a(Resources resources) {
            this.a = resources;
        }

        @Override // com.bumptech.glide.load.o.o
        public n<Integer, AssetFileDescriptor> b(r rVar) {
            return new s(this.a, rVar.d(Uri.class, AssetFileDescriptor.class));
        }
    }

    /* compiled from: ResourceLoader.java */
    public static class b implements o<Integer, ParcelFileDescriptor> {
        private final Resources a;

        public b(Resources resources) {
            this.a = resources;
        }

        @Override // com.bumptech.glide.load.o.o
        public n<Integer, ParcelFileDescriptor> b(r rVar) {
            return new s(this.a, rVar.d(Uri.class, ParcelFileDescriptor.class));
        }
    }

    /* compiled from: ResourceLoader.java */
    public static class c implements o<Integer, InputStream> {
        private final Resources a;

        public c(Resources resources) {
            this.a = resources;
        }

        @Override // com.bumptech.glide.load.o.o
        public n<Integer, InputStream> b(r rVar) {
            return new s(this.a, rVar.d(Uri.class, InputStream.class));
        }
    }

    /* compiled from: ResourceLoader.java */
    public static class d implements o<Integer, Uri> {
        private final Resources a;

        public d(Resources resources) {
            this.a = resources;
        }

        @Override // com.bumptech.glide.load.o.o
        public n<Integer, Uri> b(r rVar) {
            return new s(this.a, v.c());
        }
    }

    public s(Resources resources, n<Uri, Data> nVar) {
        this.f3926b = resources;
        this.a = nVar;
    }

    private Uri d(Integer num) {
        try {
            return Uri.parse("android.resource://" + this.f3926b.getResourcePackageName(num.intValue()) + '/' + this.f3926b.getResourceTypeName(num.intValue()) + '/' + this.f3926b.getResourceEntryName(num.intValue()));
        } catch (Resources.NotFoundException e2) {
            if (!Log.isLoggable("ResourceLoader", 5)) {
                return null;
            }
            Log.w("ResourceLoader", "Received invalid resource id: " + num, e2);
            return null;
        }
    }

    @Override // com.bumptech.glide.load.o.n
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public n.a<Data> b(Integer num, int i2, int i3, com.bumptech.glide.load.i iVar) {
        Uri uriD = d(num);
        if (uriD == null) {
            return null;
        }
        return this.a.b(uriD, i2, i3, iVar);
    }

    @Override // com.bumptech.glide.load.o.n
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public boolean a(Integer num) {
        return true;
    }
}