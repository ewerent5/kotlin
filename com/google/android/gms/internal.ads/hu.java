package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import com.google.android.gms.ads.internal.zzs;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class hu implements pz2 {

    /* renamed from: b, reason: collision with root package name */
    private final e03<pz2> f6383b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f6384c;

    /* renamed from: d, reason: collision with root package name */
    private final pz2 f6385d;

    /* renamed from: e, reason: collision with root package name */
    private final gu f6386e;

    /* renamed from: f, reason: collision with root package name */
    private final String f6387f;

    /* renamed from: g, reason: collision with root package name */
    private final int f6388g;

    /* renamed from: i, reason: collision with root package name */
    private InputStream f6390i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f6391j;

    /* renamed from: k, reason: collision with root package name */
    private Uri f6392k;

    /* renamed from: l, reason: collision with root package name */
    private volatile h43 f6393l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f6394m = false;
    private boolean n = false;
    private boolean o = false;
    private boolean p = false;
    private long q = 0;
    private final AtomicLong s = new AtomicLong(-1);
    private g52<Long> r = null;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f6389h = ((Boolean) c.c().b(w3.j1)).booleanValue();

    public hu(Context context, pz2 pz2Var, String str, int i2, e03<pz2> e03Var, gu guVar) {
        this.f6384c = context;
        this.f6385d = pz2Var;
        this.f6383b = e03Var;
        this.f6386e = guVar;
        this.f6387f = str;
        this.f6388g = i2;
    }

    private final void j(rz2 rz2Var) {
        e03<pz2> e03Var = this.f6383b;
        if (e03Var != null) {
            ((tu) e03Var).g(this, rz2Var);
        }
    }

    private final boolean k() {
        if (!this.f6389h) {
            return false;
        }
        if (!((Boolean) c.c().b(w3.A2)).booleanValue() || this.o) {
            return ((Boolean) c.c().b(w3.B2)).booleanValue() && !this.p;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01e0  */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.StringBuilder] */
    @Override // com.google.android.gms.internal.ads.pz2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long a(com.google.android.gms.internal.ads.rz2 r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 519
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.hu.a(com.google.android.gms.internal.ads.rz2):long");
    }

    @Override // com.google.android.gms.internal.ads.pz2
    public final int b(byte[] bArr, int i2, int i3) throws IOException {
        e03<pz2> e03Var;
        if (!this.f6391j) {
            throw new IOException("Attempt to read closed CacheDataSource.");
        }
        InputStream inputStream = this.f6390i;
        int iB = inputStream != null ? inputStream.read(bArr, i2, i3) : this.f6385d.b(bArr, i2, i3);
        if ((!this.f6389h || this.f6390i != null) && (e03Var = this.f6383b) != null) {
            ((tu) e03Var).o(this, iB);
        }
        return iB;
    }

    public final boolean c() {
        return this.f6394m;
    }

    public final boolean d() {
        return this.n;
    }

    public final boolean e() {
        return this.o;
    }

    public final boolean f() {
        return this.p;
    }

    public final long g() {
        return this.q;
    }

    public final long h() {
        if (this.f6393l == null) {
            return -1L;
        }
        if (this.s.get() != -1) {
            return this.s.get();
        }
        synchronized (this) {
            if (this.r == null) {
                this.r = qr.a.N(new Callable(this) { // from class: com.google.android.gms.internal.ads.fu
                    private final hu a;

                    {
                        this.a = this;
                    }

                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return this.a.i();
                    }
                });
            }
        }
        if (!this.r.isDone()) {
            return -1L;
        }
        try {
            this.s.compareAndSet(-1L, this.r.get().longValue());
            return this.s.get();
        } catch (InterruptedException | ExecutionException unused) {
            return -1L;
        }
    }

    final /* synthetic */ Long i() {
        return Long.valueOf(zzs.zzi().d(this.f6393l));
    }

    @Override // com.google.android.gms.internal.ads.pz2
    public final Uri zzc() {
        return this.f6392k;
    }

    @Override // com.google.android.gms.internal.ads.pz2
    public final void zzd() throws IOException {
        if (!this.f6391j) {
            throw new IOException("Attempt to close an already closed CacheDataSource.");
        }
        this.f6391j = false;
        this.f6392k = null;
        InputStream inputStream = this.f6390i;
        if (inputStream == null) {
            this.f6385d.zzd();
        } else {
            com.google.android.gms.common.util.l.a(inputStream);
            this.f6390i = null;
        }
    }
}