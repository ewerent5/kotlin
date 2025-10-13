package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class bx extends m1 {

    /* renamed from: e, reason: collision with root package name */
    private final lt f5204e;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f5206g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f5207h;

    /* renamed from: i, reason: collision with root package name */
    @GuardedBy("lock")
    private int f5208i;

    /* renamed from: j, reason: collision with root package name */
    @GuardedBy("lock")
    private q1 f5209j;

    /* renamed from: k, reason: collision with root package name */
    @GuardedBy("lock")
    private boolean f5210k;

    /* renamed from: m, reason: collision with root package name */
    @GuardedBy("lock")
    private float f5212m;

    @GuardedBy("lock")
    private float n;

    @GuardedBy("lock")
    private float o;

    @GuardedBy("lock")
    private boolean p;

    @GuardedBy("lock")
    private boolean q;

    @GuardedBy("lock")
    private y7 r;

    /* renamed from: f, reason: collision with root package name */
    private final Object f5205f = new Object();

    /* renamed from: l, reason: collision with root package name */
    @GuardedBy("lock")
    private boolean f5211l = true;

    public bx(lt ltVar, float f2, boolean z, boolean z2) {
        this.f5204e = ltVar;
        this.f5212m = f2;
        this.f5206g = z;
        this.f5207h = z2;
    }

    private final void P4(String str, Map<String, String> map) {
        final HashMap map2 = map == null ? new HashMap() : new HashMap(map);
        map2.put("action", str);
        qr.f8450e.execute(new Runnable(this, map2) { // from class: com.google.android.gms.internal.ads.yw

            /* renamed from: e, reason: collision with root package name */
            private final bx f10496e;

            /* renamed from: f, reason: collision with root package name */
            private final Map f10497f;

            {
                this.f10496e = this;
                this.f10497f = map2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f10496e.N4(this.f10497f);
            }
        });
    }

    private final void Q4(final int i2, final int i3, final boolean z, final boolean z2) {
        qr.f8450e.execute(new Runnable(this, i2, i3, z, z2) { // from class: com.google.android.gms.internal.ads.ax

            /* renamed from: e, reason: collision with root package name */
            private final bx f5014e;

            /* renamed from: f, reason: collision with root package name */
            private final int f5015f;

            /* renamed from: g, reason: collision with root package name */
            private final int f5016g;

            /* renamed from: h, reason: collision with root package name */
            private final boolean f5017h;

            /* renamed from: i, reason: collision with root package name */
            private final boolean f5018i;

            {
                this.f5014e = this;
                this.f5015f = i2;
                this.f5016g = i3;
                this.f5017h = z;
                this.f5018i = z2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f5014e.M4(this.f5015f, this.f5016g, this.f5017h, this.f5018i);
            }
        });
    }

    public final void J4(d3 d3Var) {
        boolean z = d3Var.f5419e;
        boolean z2 = d3Var.f5420f;
        boolean z3 = d3Var.f5421g;
        synchronized (this.f5205f) {
            this.p = z2;
            this.q = z3;
        }
        P4("initialState", com.google.android.gms.common.util.g.d("muteStart", true != z ? "0" : "1", "customControlsRequested", true != z2 ? "0" : "1", "clickToExpandRequested", true != z3 ? "0" : "1"));
    }

    public final void K4(float f2) {
        synchronized (this.f5205f) {
            this.n = f2;
        }
    }

    public final void L4(float f2, float f3, int i2, boolean z, float f4) {
        boolean z2;
        boolean z3;
        int i3;
        synchronized (this.f5205f) {
            z2 = true;
            if (f3 == this.f5212m && f4 == this.o) {
                z2 = false;
            }
            this.f5212m = f3;
            this.n = f2;
            z3 = this.f5211l;
            this.f5211l = z;
            i3 = this.f5208i;
            this.f5208i = i2;
            float f5 = this.o;
            this.o = f4;
            if (Math.abs(f4 - f5) > 1.0E-4f) {
                this.f5204e.n().invalidate();
            }
        }
        if (z2) {
            try {
                y7 y7Var = this.r;
                if (y7Var != null) {
                    y7Var.zze();
                }
            } catch (RemoteException e2) {
                er.zzl("#007 Could not call remote method.", e2);
            }
        }
        Q4(i3, i2, z3, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x004f A[Catch: RemoteException -> 0x0039, all -> 0x006c, TryCatch #0 {RemoteException -> 0x0039, blocks: (B:28:0x0031, B:30:0x0035, B:34:0x003d, B:36:0x0041, B:38:0x0046, B:40:0x004a, B:42:0x004f, B:44:0x0053, B:45:0x0056, B:47:0x005d, B:49:0x0061), top: B:57:0x0031, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x006a A[Catch: all -> 0x006c, DONT_GENERATE, TryCatch #1 {, blocks: (B:4:0x0003, B:26:0x002d, B:28:0x0031, B:30:0x0035, B:34:0x003d, B:36:0x0041, B:38:0x0046, B:40:0x004a, B:42:0x004f, B:44:0x0053, B:45:0x0056, B:47:0x005d, B:49:0x0061, B:52:0x006a, B:51:0x0065), top: B:59:0x0003, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final /* synthetic */ void M4(int r9, int r10, boolean r11, boolean r12) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.f5205f
            monitor-enter(r0)
            boolean r1 = r8.f5210k     // Catch: java.lang.Throwable -> L6c
            r2 = 0
            r3 = 1
            if (r1 != 0) goto Le
            if (r10 != r3) goto Le
            r4 = 1
            r5 = 1
            goto L10
        Le:
            r4 = r10
            r5 = 0
        L10:
            if (r9 == r10) goto L17
            if (r4 != r3) goto L17
            r4 = 1
            r6 = 1
            goto L18
        L17:
            r6 = 0
        L18:
            if (r9 == r10) goto L1f
            r7 = 2
            if (r4 != r7) goto L1f
            r7 = 1
            goto L20
        L1f:
            r7 = 0
        L20:
            if (r9 == r10) goto L27
            r9 = 3
            if (r4 != r9) goto L27
            r9 = 1
            goto L28
        L27:
            r9 = 0
        L28:
            if (r1 != 0) goto L2c
            if (r5 == 0) goto L2d
        L2c:
            r2 = 1
        L2d:
            r8.f5210k = r2     // Catch: java.lang.Throwable -> L6c
            if (r5 == 0) goto L3b
            com.google.android.gms.internal.ads.q1 r10 = r8.f5209j     // Catch: android.os.RemoteException -> L39 java.lang.Throwable -> L6c
            if (r10 == 0) goto L3b
            r10.zze()     // Catch: android.os.RemoteException -> L39 java.lang.Throwable -> L6c
            goto L3b
        L39:
            r9 = move-exception
            goto L65
        L3b:
            if (r6 == 0) goto L44
            com.google.android.gms.internal.ads.q1 r10 = r8.f5209j     // Catch: android.os.RemoteException -> L39 java.lang.Throwable -> L6c
            if (r10 == 0) goto L44
            r10.zzf()     // Catch: android.os.RemoteException -> L39 java.lang.Throwable -> L6c
        L44:
            if (r7 == 0) goto L4d
            com.google.android.gms.internal.ads.q1 r10 = r8.f5209j     // Catch: android.os.RemoteException -> L39 java.lang.Throwable -> L6c
            if (r10 == 0) goto L4d
            r10.zzg()     // Catch: android.os.RemoteException -> L39 java.lang.Throwable -> L6c
        L4d:
            if (r9 == 0) goto L5b
            com.google.android.gms.internal.ads.q1 r9 = r8.f5209j     // Catch: android.os.RemoteException -> L39 java.lang.Throwable -> L6c
            if (r9 == 0) goto L56
            r9.zzh()     // Catch: android.os.RemoteException -> L39 java.lang.Throwable -> L6c
        L56:
            com.google.android.gms.internal.ads.lt r9 = r8.f5204e     // Catch: android.os.RemoteException -> L39 java.lang.Throwable -> L6c
            r9.zzA()     // Catch: android.os.RemoteException -> L39 java.lang.Throwable -> L6c
        L5b:
            if (r11 == r12) goto L6a
            com.google.android.gms.internal.ads.q1 r9 = r8.f5209j     // Catch: android.os.RemoteException -> L39 java.lang.Throwable -> L6c
            if (r9 == 0) goto L6a
            r9.S2(r12)     // Catch: android.os.RemoteException -> L39 java.lang.Throwable -> L6c
            goto L6a
        L65:
            java.lang.String r10 = "#007 Could not call remote method."
            com.google.android.gms.internal.ads.er.zzl(r10, r9)     // Catch: java.lang.Throwable -> L6c
        L6a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6c
            return
        L6c:
            r9 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6c
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.bx.M4(int, int, boolean, boolean):void");
    }

    final /* synthetic */ void N4(Map map) {
        this.f5204e.e0("pubVideoCmd", map);
    }

    public final void O4(y7 y7Var) {
        synchronized (this.f5205f) {
            this.r = y7Var;
        }
    }

    @Override // com.google.android.gms.internal.ads.n1
    public final void R2(q1 q1Var) {
        synchronized (this.f5205f) {
            this.f5209j = q1Var;
        }
    }

    @Override // com.google.android.gms.internal.ads.n1
    public final q1 a() {
        q1 q1Var;
        synchronized (this.f5205f) {
            q1Var = this.f5209j;
        }
        return q1Var;
    }

    @Override // com.google.android.gms.internal.ads.n1
    public final void zze() {
        P4("play", null);
    }

    @Override // com.google.android.gms.internal.ads.n1
    public final void zzf() {
        P4("pause", null);
    }

    @Override // com.google.android.gms.internal.ads.n1
    public final void zzg(boolean z) {
        P4(true != z ? "unmute" : "mute", null);
    }

    @Override // com.google.android.gms.internal.ads.n1
    public final boolean zzh() {
        boolean z;
        synchronized (this.f5205f) {
            z = this.f5211l;
        }
        return z;
    }

    @Override // com.google.android.gms.internal.ads.n1
    public final int zzi() {
        int i2;
        synchronized (this.f5205f) {
            i2 = this.f5208i;
        }
        return i2;
    }

    @Override // com.google.android.gms.internal.ads.n1
    public final float zzj() {
        float f2;
        synchronized (this.f5205f) {
            f2 = this.f5212m;
        }
        return f2;
    }

    @Override // com.google.android.gms.internal.ads.n1
    public final float zzk() {
        float f2;
        synchronized (this.f5205f) {
            f2 = this.n;
        }
        return f2;
    }

    @Override // com.google.android.gms.internal.ads.n1
    public final float zzm() {
        float f2;
        synchronized (this.f5205f) {
            f2 = this.o;
        }
        return f2;
    }

    @Override // com.google.android.gms.internal.ads.n1
    public final boolean zzn() {
        boolean z;
        synchronized (this.f5205f) {
            z = false;
            if (this.f5206g && this.p) {
                z = true;
            }
        }
        return z;
    }

    @Override // com.google.android.gms.internal.ads.n1
    public final boolean zzp() {
        boolean z;
        boolean zZzn = zzn();
        synchronized (this.f5205f) {
            z = false;
            if (!zZzn) {
                try {
                    if (this.q && this.f5207h) {
                        z = true;
                    }
                } finally {
                }
            }
        }
        return z;
    }

    @Override // com.google.android.gms.internal.ads.n1
    public final void zzq() {
        P4("stop", null);
    }

    public final void zzr() {
        boolean z;
        int i2;
        synchronized (this.f5205f) {
            z = this.f5211l;
            i2 = this.f5208i;
            this.f5208i = 3;
        }
        Q4(i2, 3, z, z);
    }
}