package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zzas;
import com.google.android.gms.ads.internal.util.zze;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class fe extends ds<ad> {

    /* renamed from: d, reason: collision with root package name */
    private final zzas<ad> f5856d;

    /* renamed from: c, reason: collision with root package name */
    private final Object f5855c = new Object();

    /* renamed from: e, reason: collision with root package name */
    private boolean f5857e = false;

    /* renamed from: f, reason: collision with root package name */
    private int f5858f = 0;

    public fe(zzas<ad> zzasVar) {
        this.f5856d = zzasVar;
    }

    public final ae f() {
        ae aeVar = new ae(this);
        synchronized (this.f5855c) {
            a(new be(this, aeVar), new ce(this, aeVar));
            com.google.android.gms.common.internal.p.m(this.f5858f >= 0);
            this.f5858f++;
        }
        return aeVar;
    }

    protected final void g() {
        synchronized (this.f5855c) {
            com.google.android.gms.common.internal.p.m(this.f5858f > 0);
            zze.zza("Releasing 1 reference for JS Engine");
            this.f5858f--;
            i();
        }
    }

    public final void h() {
        synchronized (this.f5855c) {
            com.google.android.gms.common.internal.p.m(this.f5858f >= 0);
            zze.zza("Releasing root reference. JS Engine will be destroyed once other references are released.");
            this.f5857e = true;
            i();
        }
    }

    protected final void i() {
        synchronized (this.f5855c) {
            com.google.android.gms.common.internal.p.m(this.f5858f >= 0);
            if (this.f5857e && this.f5858f == 0) {
                zze.zza("No reference is left (including root). Cleaning up engine.");
                a(new ee(this), new zr());
            } else {
                zze.zza("There are still references to the engine. Not destroying.");
            }
        }
    }
}