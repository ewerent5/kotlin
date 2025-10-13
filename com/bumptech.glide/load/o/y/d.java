package com.bumptech.glide.load.o.y;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.provider.MediaStore;
import android.text.TextUtils;
import com.bumptech.glide.g;
import com.bumptech.glide.load.data.d;
import com.bumptech.glide.load.i;
import com.bumptech.glide.load.o.n;
import com.bumptech.glide.load.o.o;
import com.bumptech.glide.load.o.r;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;

/* compiled from: QMediaStoreUriLoader.java */
/* loaded from: classes.dex */
public final class d<DataT> implements n<Uri, DataT> {
    private final Context a;

    /* renamed from: b, reason: collision with root package name */
    private final n<File, DataT> f3931b;

    /* renamed from: c, reason: collision with root package name */
    private final n<Uri, DataT> f3932c;

    /* renamed from: d, reason: collision with root package name */
    private final Class<DataT> f3933d;

    /* compiled from: QMediaStoreUriLoader.java */
    private static abstract class a<DataT> implements o<Uri, DataT> {
        private final Context a;

        /* renamed from: b, reason: collision with root package name */
        private final Class<DataT> f3934b;

        a(Context context, Class<DataT> cls) {
            this.a = context;
            this.f3934b = cls;
        }

        @Override // com.bumptech.glide.load.o.o
        public final n<Uri, DataT> b(r rVar) {
            return new d(this.a, rVar.d(File.class, this.f3934b), rVar.d(Uri.class, this.f3934b), this.f3934b);
        }
    }

    /* compiled from: QMediaStoreUriLoader.java */
    public static final class b extends a<ParcelFileDescriptor> {
        public b(Context context) {
            super(context, ParcelFileDescriptor.class);
        }
    }

    /* compiled from: QMediaStoreUriLoader.java */
    public static final class c extends a<InputStream> {
        public c(Context context) {
            super(context, InputStream.class);
        }
    }

    /* compiled from: QMediaStoreUriLoader.java */
    /* renamed from: com.bumptech.glide.load.o.y.d$d, reason: collision with other inner class name */
    private static final class C0093d<DataT> implements com.bumptech.glide.load.data.d<DataT> {

        /* renamed from: e, reason: collision with root package name */
        private static final String[] f3935e = {"_data"};

        /* renamed from: f, reason: collision with root package name */
        private final Context f3936f;

        /* renamed from: g, reason: collision with root package name */
        private final n<File, DataT> f3937g;

        /* renamed from: h, reason: collision with root package name */
        private final n<Uri, DataT> f3938h;

        /* renamed from: i, reason: collision with root package name */
        private final Uri f3939i;

        /* renamed from: j, reason: collision with root package name */
        private final int f3940j;

        /* renamed from: k, reason: collision with root package name */
        private final int f3941k;

        /* renamed from: l, reason: collision with root package name */
        private final i f3942l;

        /* renamed from: m, reason: collision with root package name */
        private final Class<DataT> f3943m;
        private volatile boolean n;
        private volatile com.bumptech.glide.load.data.d<DataT> o;

        C0093d(Context context, n<File, DataT> nVar, n<Uri, DataT> nVar2, Uri uri, int i2, int i3, i iVar, Class<DataT> cls) {
            this.f3936f = context.getApplicationContext();
            this.f3937g = nVar;
            this.f3938h = nVar2;
            this.f3939i = uri;
            this.f3940j = i2;
            this.f3941k = i3;
            this.f3942l = iVar;
            this.f3943m = cls;
        }

        private n.a<DataT> c() {
            if (Environment.isExternalStorageLegacy()) {
                return this.f3937g.b(h(this.f3939i), this.f3940j, this.f3941k, this.f3942l);
            }
            return this.f3938h.b(g() ? MediaStore.setRequireOriginal(this.f3939i) : this.f3939i, this.f3940j, this.f3941k, this.f3942l);
        }

        private com.bumptech.glide.load.data.d<DataT> f() {
            n.a<DataT> aVarC = c();
            if (aVarC != null) {
                return aVarC.f3909c;
            }
            return null;
        }

        private boolean g() {
            return this.f3936f.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION") == 0;
        }

        private File h(Uri uri) {
            Cursor cursor = null;
            try {
                Cursor cursorQuery = this.f3936f.getContentResolver().query(uri, f3935e, null, null, null);
                if (cursorQuery == null || !cursorQuery.moveToFirst()) {
                    throw new FileNotFoundException("Failed to media store entry for: " + uri);
                }
                String string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data"));
                if (!TextUtils.isEmpty(string)) {
                    File file = new File(string);
                    cursorQuery.close();
                    return file;
                }
                throw new FileNotFoundException("File path was empty in media store for: " + uri);
            } catch (Throwable th) {
                if (0 != 0) {
                    cursor.close();
                }
                throw th;
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public Class<DataT> a() {
            return this.f3943m;
        }

        @Override // com.bumptech.glide.load.data.d
        public void b() {
            com.bumptech.glide.load.data.d<DataT> dVar = this.o;
            if (dVar != null) {
                dVar.b();
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public void cancel() {
            this.n = true;
            com.bumptech.glide.load.data.d<DataT> dVar = this.o;
            if (dVar != null) {
                dVar.cancel();
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public com.bumptech.glide.load.a d() {
            return com.bumptech.glide.load.a.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.d
        public void e(g gVar, d.a<? super DataT> aVar) {
            try {
                com.bumptech.glide.load.data.d<DataT> dVarF = f();
                if (dVarF == null) {
                    aVar.c(new IllegalArgumentException("Failed to build fetcher for: " + this.f3939i));
                    return;
                }
                this.o = dVarF;
                if (this.n) {
                    cancel();
                } else {
                    dVarF.e(gVar, aVar);
                }
            } catch (FileNotFoundException e2) {
                aVar.c(e2);
            }
        }
    }

    d(Context context, n<File, DataT> nVar, n<Uri, DataT> nVar2, Class<DataT> cls) {
        this.a = context.getApplicationContext();
        this.f3931b = nVar;
        this.f3932c = nVar2;
        this.f3933d = cls;
    }

    @Override // com.bumptech.glide.load.o.n
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public n.a<DataT> b(Uri uri, int i2, int i3, i iVar) {
        return new n.a<>(new com.bumptech.glide.s.b(uri), new C0093d(this.a, this.f3931b, this.f3932c, uri, i2, i3, iVar, this.f3933d));
    }

    @Override // com.bumptech.glide.load.o.n
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(Uri uri) {
        return Build.VERSION.SDK_INT >= 29 && com.bumptech.glide.load.data.o.b.b(uri);
    }
}