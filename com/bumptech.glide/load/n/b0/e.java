package com.bumptech.glide.load.n.b0;

import android.util.Log;
import com.bumptech.glide.load.n.b0.a;
import com.bumptech.glide.m.a;
import java.io.File;
import java.io.IOException;

/* compiled from: DiskLruCacheWrapper.java */
/* loaded from: classes.dex */
public class e implements a {

    /* renamed from: b, reason: collision with root package name */
    private final File f3685b;

    /* renamed from: c, reason: collision with root package name */
    private final long f3686c;

    /* renamed from: e, reason: collision with root package name */
    private com.bumptech.glide.m.a f3688e;

    /* renamed from: d, reason: collision with root package name */
    private final c f3687d = new c();
    private final j a = new j();

    @Deprecated
    protected e(File file, long j2) {
        this.f3685b = file;
        this.f3686c = j2;
    }

    public static a c(File file, long j2) {
        return new e(file, j2);
    }

    private synchronized com.bumptech.glide.m.a d() {
        if (this.f3688e == null) {
            this.f3688e = com.bumptech.glide.m.a.a0(this.f3685b, 1, 1, this.f3686c);
        }
        return this.f3688e;
    }

    @Override // com.bumptech.glide.load.n.b0.a
    public void a(com.bumptech.glide.load.g gVar, a.b bVar) {
        com.bumptech.glide.m.a aVarD;
        String strB = this.a.b(gVar);
        this.f3687d.a(strB);
        try {
            if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
                Log.v("DiskLruCacheWrapper", "Put: Obtained: " + strB + " for for Key: " + gVar);
            }
            try {
                aVarD = d();
            } catch (IOException e2) {
                if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                    Log.w("DiskLruCacheWrapper", "Unable to put to disk cache", e2);
                }
            }
            if (aVarD.W(strB) != null) {
                return;
            }
            a.c cVarK = aVarD.K(strB);
            if (cVarK == null) {
                throw new IllegalStateException("Had two simultaneous puts for: " + strB);
            }
            try {
                if (bVar.a(cVarK.f(0))) {
                    cVarK.e();
                }
                cVarK.b();
            } catch (Throwable th) {
                cVarK.b();
                throw th;
            }
        } finally {
            this.f3687d.b(strB);
        }
    }

    @Override // com.bumptech.glide.load.n.b0.a
    public File b(com.bumptech.glide.load.g gVar) {
        String strB = this.a.b(gVar);
        if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
            Log.v("DiskLruCacheWrapper", "Get: Obtained: " + strB + " for for Key: " + gVar);
        }
        try {
            a.e eVarW = d().W(strB);
            if (eVarW != null) {
                return eVarW.a(0);
            }
            return null;
        } catch (IOException e2) {
            if (!Log.isLoggable("DiskLruCacheWrapper", 5)) {
                return null;
            }
            Log.w("DiskLruCacheWrapper", "Unable to get from disk cache", e2);
            return null;
        }
    }
}