package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class wx2 implements b03 {
    private final Uri a;

    /* renamed from: b, reason: collision with root package name */
    private final pz2 f10071b;

    /* renamed from: c, reason: collision with root package name */
    private final xx2 f10072c;

    /* renamed from: d, reason: collision with root package name */
    private final h03 f10073d;

    /* renamed from: e, reason: collision with root package name */
    private final fv2 f10074e;

    /* renamed from: f, reason: collision with root package name */
    private volatile boolean f10075f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f10076g;

    /* renamed from: h, reason: collision with root package name */
    private long f10077h;

    /* renamed from: i, reason: collision with root package name */
    private long f10078i;

    /* renamed from: j, reason: collision with root package name */
    final /* synthetic */ zx2 f10079j;

    public wx2(zx2 zx2Var, Uri uri, pz2 pz2Var, xx2 xx2Var, h03 h03Var) {
        this.f10079j = zx2Var;
        Objects.requireNonNull(uri);
        this.a = uri;
        Objects.requireNonNull(pz2Var);
        this.f10071b = pz2Var;
        Objects.requireNonNull(xx2Var);
        this.f10072c = xx2Var;
        this.f10073d = h03Var;
        this.f10074e = new fv2();
        this.f10076g = true;
        this.f10078i = -1L;
    }

    public final void a(long j2, long j3) {
        this.f10074e.a = j2;
        this.f10077h = j3;
        this.f10076g = true;
    }

    @Override // com.google.android.gms.internal.ads.b03
    public final void zzb() {
        this.f10075f = true;
    }

    @Override // com.google.android.gms.internal.ads.b03
    public final boolean zzc() {
        return this.f10075f;
    }

    @Override // com.google.android.gms.internal.ads.b03
    public final void zzd() throws Throwable {
        zu2 zu2Var;
        long j2;
        while (!this.f10075f) {
            int i2 = 0;
            try {
                long j3 = this.f10074e.a;
                long jA = this.f10071b.a(new rz2(this.a, null, j3, j3, -1L, null, 0));
                this.f10078i = jA;
                if (jA != -1) {
                    j2 = j3;
                    jA += j2;
                    this.f10078i = jA;
                } else {
                    j2 = j3;
                }
                zu2Var = new zu2(this.f10071b, j2, jA);
                try {
                    av2 av2VarB = this.f10072c.b(zu2Var, this.f10071b.zzc());
                    if (this.f10076g) {
                        av2VarB.f(j2, this.f10077h);
                        this.f10076g = false;
                    }
                    long jH = j2;
                    int iB = 0;
                    while (true) {
                        if (iB != 0) {
                            break;
                        }
                        try {
                            if (this.f10075f) {
                                iB = 0;
                                break;
                            }
                            this.f10073d.c();
                            iB = av2VarB.b(zu2Var, this.f10074e);
                            if (zu2Var.h() > this.f10079j.f10659k + jH) {
                                jH = zu2Var.h();
                                this.f10073d.b();
                                this.f10079j.q.post(this.f10079j.p);
                            }
                        } catch (Throwable th) {
                            th = th;
                            i2 = iB;
                            if (i2 != 1 && zu2Var != null) {
                                this.f10074e.a = zu2Var.h();
                            }
                            v03.c(this.f10071b);
                            throw th;
                        }
                    }
                    if (iB != 1) {
                        this.f10074e.a = zu2Var.h();
                        i2 = iB;
                    }
                    v03.c(this.f10071b);
                    if (i2 != 0) {
                        return;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
                zu2Var = null;
            }
        }
    }
}