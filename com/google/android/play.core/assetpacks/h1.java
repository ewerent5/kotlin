package com.google.android.play.core.assetpacks;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FilenameFilter;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
final class h1 implements s2 {
    private static final e.c.b.d.a.b.f a = new e.c.b.d.a.b.f("FakeAssetPackService");

    /* renamed from: b, reason: collision with root package name */
    private static final AtomicInteger f12015b = new AtomicInteger(1);

    /* renamed from: c, reason: collision with root package name */
    private final String f12016c;

    /* renamed from: d, reason: collision with root package name */
    private final s f12017d;

    /* renamed from: e, reason: collision with root package name */
    private final o0 f12018e;

    /* renamed from: f, reason: collision with root package name */
    private final Context f12019f;

    /* renamed from: g, reason: collision with root package name */
    private final t1 f12020g;

    /* renamed from: h, reason: collision with root package name */
    private final e.c.b.d.a.b.e0<Executor> f12021h;

    /* renamed from: i, reason: collision with root package name */
    private final Handler f12022i = new Handler(Looper.getMainLooper());

    h1(File file, s sVar, o0 o0Var, Context context, t1 t1Var, e.c.b.d.a.b.e0<Executor> e0Var) {
        this.f12016c = file.getAbsolutePath();
        this.f12017d = sVar;
        this.f12018e = o0Var;
        this.f12019f = context;
        this.f12020g = t1Var;
        this.f12021h = e0Var;
    }

    static long h(int i2, long j2) {
        if (i2 == 2) {
            return j2 / 2;
        }
        if (i2 == 3 || i2 == 4) {
            return j2;
        }
        return 0L;
    }

    private final File[] k(final String str) throws com.google.android.play.core.common.a {
        File file = new File(this.f12016c);
        if (!file.isDirectory()) {
            throw new com.google.android.play.core.common.a(String.format("Local testing directory '%s' not found.", file));
        }
        File[] fileArrListFiles = file.listFiles(new FilenameFilter(str) { // from class: com.google.android.play.core.assetpacks.f1
            private final String a;

            {
                this.a = str;
            }

            @Override // java.io.FilenameFilter
            public final boolean accept(File file2, String str2) {
                return str2.startsWith(String.valueOf(this.a).concat("-")) && str2.endsWith(".apk");
            }
        });
        if (fileArrListFiles == null) {
            throw new com.google.android.play.core.common.a(String.format("Failed fetching APKs for pack '%s'.", str));
        }
        if (fileArrListFiles.length == 0) {
            throw new com.google.android.play.core.common.a(String.format("No APKs available for pack '%s'.", str));
        }
        for (File file2 : fileArrListFiles) {
            if (e.c.b.d.a.b.r.a(file2).equals(str)) {
                return fileArrListFiles;
            }
        }
        throw new com.google.android.play.core.common.a(String.format("No master slice available for pack '%s'.", str));
    }

    private static String l(File file) throws com.google.android.play.core.common.a {
        try {
            return i1.a(Arrays.asList(file));
        } catch (IOException e2) {
            throw new com.google.android.play.core.common.a(String.format("Could not digest file: %s.", file), e2);
        } catch (NoSuchAlgorithmException e3) {
            throw new com.google.android.play.core.common.a("SHA256 algorithm not supported.", e3);
        }
    }

    private final void m(int i2, String str, int i3) throws com.google.android.play.core.common.a {
        Bundle bundle = new Bundle();
        bundle.putInt("app_version_code", this.f12020g.a());
        bundle.putInt("session_id", i2);
        File[] fileArrK = k(str);
        ArrayList<String> arrayList = new ArrayList<>();
        long length = 0;
        for (File file : fileArrK) {
            length += file.length();
            ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>();
            arrayList2.add(i3 == 3 ? new Intent().setData(Uri.EMPTY) : null);
            String strA = e.c.b.d.a.b.r.a(file);
            bundle.putParcelableArrayList(e.c.b.d.a.b.i0.b("chunk_intents", str, strA), arrayList2);
            bundle.putString(e.c.b.d.a.b.i0.b("uncompressed_hash_sha256", str, strA), l(file));
            bundle.putLong(e.c.b.d.a.b.i0.b("uncompressed_size", str, strA), file.length());
            arrayList.add(strA);
        }
        bundle.putStringArrayList(e.c.b.d.a.b.i0.a("slice_ids", str), arrayList);
        bundle.putLong(e.c.b.d.a.b.i0.a("pack_version", str), this.f12020g.a());
        bundle.putInt(e.c.b.d.a.b.i0.a("status", str), i3);
        bundle.putInt(e.c.b.d.a.b.i0.a("error_code", str), 0);
        bundle.putLong(e.c.b.d.a.b.i0.a("bytes_downloaded", str), h(i3, length));
        bundle.putLong(e.c.b.d.a.b.i0.a("total_bytes_to_download", str), length);
        bundle.putStringArrayList("pack_names", new ArrayList<>(Arrays.asList(str)));
        bundle.putLong("bytes_downloaded", h(i3, length));
        bundle.putLong("total_bytes_to_download", length);
        final Intent intentPutExtra = new Intent("com.google.android.play.core.assetpacks.receiver.ACTION_SESSION_UPDATE").putExtra("com.google.android.play.core.assetpacks.receiver.EXTRA_SESSION_STATE", bundle);
        this.f12022i.post(new Runnable(this, intentPutExtra) { // from class: com.google.android.play.core.assetpacks.g1

            /* renamed from: e, reason: collision with root package name */
            private final h1 f11985e;

            /* renamed from: f, reason: collision with root package name */
            private final Intent f11986f;

            {
                this.f11985e = this;
                this.f11986f = intentPutExtra;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f11985e.i(this.f11986f);
            }
        });
    }

    @Override // com.google.android.play.core.assetpacks.s2
    public final void a() {
        a.d("keepAlive", new Object[0]);
    }

    @Override // com.google.android.play.core.assetpacks.s2
    public final void b(int i2) {
        a.d("notifySessionFailed", new Object[0]);
    }

    @Override // com.google.android.play.core.assetpacks.s2
    public final void c(int i2, String str, String str2, int i3) {
        a.d("notifyChunkTransferred", new Object[0]);
    }

    @Override // com.google.android.play.core.assetpacks.s2
    public final void d(final int i2, final String str) {
        a.d("notifyModuleCompleted", new Object[0]);
        this.f12021h.a().execute(new Runnable(this, i2, str) { // from class: com.google.android.play.core.assetpacks.e1

            /* renamed from: e, reason: collision with root package name */
            private final h1 f11974e;

            /* renamed from: f, reason: collision with root package name */
            private final int f11975f;

            /* renamed from: g, reason: collision with root package name */
            private final String f11976g;

            {
                this.f11974e = this;
                this.f11975f = i2;
                this.f11976g = str;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f11974e.j(this.f11975f, this.f11976g);
            }
        });
    }

    @Override // com.google.android.play.core.assetpacks.s2
    public final e.c.b.d.a.f.e<ParcelFileDescriptor> e(int i2, String str, String str2, int i3) throws com.google.android.play.core.common.a {
        int i4;
        a.d("getChunkFileDescriptor(session=%d, %s, %s, %d)", Integer.valueOf(i2), str, str2, Integer.valueOf(i3));
        e.c.b.d.a.f.p pVar = new e.c.b.d.a.f.p();
        try {
        } catch (com.google.android.play.core.common.a e2) {
            a.e("getChunkFileDescriptor failed", e2);
            pVar.b(e2);
        } catch (FileNotFoundException e3) {
            a.e("getChunkFileDescriptor failed", e3);
            pVar.b(new com.google.android.play.core.common.a("Asset Slice file not found.", e3));
        }
        for (File file : k(str)) {
            if (e.c.b.d.a.b.r.a(file).equals(str2)) {
                pVar.a(ParcelFileDescriptor.open(file, 268435456));
                return pVar.c();
            }
        }
        throw new com.google.android.play.core.common.a(String.format("Local testing slice for '%s' not found.", str2));
    }

    @Override // com.google.android.play.core.assetpacks.s2
    public final e.c.b.d.a.f.e<List<String>> f(Map<String, Long> map) {
        a.d("syncPacks()", new Object[0]);
        return e.c.b.d.a.f.g.a(new ArrayList());
    }

    @Override // com.google.android.play.core.assetpacks.s2
    public final void g(List<String> list) {
        a.d("cancelDownload(%s)", list);
    }

    final /* synthetic */ void i(Intent intent) {
        this.f12017d.a(this.f12019f, intent);
    }

    final /* synthetic */ void j(int i2, String str) {
        try {
            m(i2, str, 4);
        } catch (com.google.android.play.core.common.a e2) {
            a.e("notifyModuleCompleted failed", e2);
        }
    }
}