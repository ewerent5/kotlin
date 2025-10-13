package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class ku2 implements nt2 {

    /* renamed from: b, reason: collision with root package name */
    private int f7081b = -1;

    /* renamed from: c, reason: collision with root package name */
    private int f7082c = -1;

    /* renamed from: d, reason: collision with root package name */
    private int f7083d = 0;

    /* renamed from: e, reason: collision with root package name */
    private ByteBuffer f7084e;

    /* renamed from: f, reason: collision with root package name */
    private ByteBuffer f7085f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f7086g;

    public ku2() {
        ByteBuffer byteBuffer = nt2.a;
        this.f7084e = byteBuffer;
        this.f7085f = byteBuffer;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0080 A[ADDED_TO_REGION, LOOP:2: B:25:0x0080->B:26:0x0082, LOOP_START, PHI: r0
  0x0080: PHI (r0v1 int) = (r0v0 int), (r0v2 int) binds: [B:16:0x0040, B:26:0x0082] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.android.gms.internal.ads.nt2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(java.nio.ByteBuffer r8) {
        /*
            r7 = this;
            int r0 = r8.position()
            int r1 = r8.limit()
            int r2 = r1 - r0
            int r3 = r7.f7083d
            r4 = 1073741824(0x40000000, float:2.0)
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = 3
            if (r3 == r5) goto L20
            if (r3 == r6) goto L21
            if (r3 != r4) goto L1a
            int r2 = r2 / 2
            goto L22
        L1a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r8.<init>()
            throw r8
        L20:
            int r2 = r2 / r6
        L21:
            int r2 = r2 + r2
        L22:
            java.nio.ByteBuffer r3 = r7.f7084e
            int r3 = r3.capacity()
            if (r3 >= r2) goto L39
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocateDirect(r2)
            java.nio.ByteOrder r3 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteBuffer r2 = r2.order(r3)
            r7.f7084e = r2
            goto L3e
        L39:
            java.nio.ByteBuffer r2 = r7.f7084e
            r2.clear()
        L3e:
            int r2 = r7.f7083d
            if (r2 == r5) goto L80
            if (r2 == r6) goto L67
            if (r2 != r4) goto L61
        L46:
            if (r0 >= r1) goto L9b
            java.nio.ByteBuffer r2 = r7.f7084e
            int r3 = r0 + 2
            byte r3 = r8.get(r3)
            r2.put(r3)
            java.nio.ByteBuffer r2 = r7.f7084e
            int r3 = r0 + 3
            byte r3 = r8.get(r3)
            r2.put(r3)
            int r0 = r0 + 4
            goto L46
        L61:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r8.<init>()
            throw r8
        L67:
            if (r0 >= r1) goto L9b
            java.nio.ByteBuffer r2 = r7.f7084e
            r3 = 0
            r2.put(r3)
            java.nio.ByteBuffer r2 = r7.f7084e
            byte r3 = r8.get(r0)
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r3 = r3 + (-128)
            byte r3 = (byte) r3
            r2.put(r3)
            int r0 = r0 + 1
            goto L67
        L80:
            if (r0 >= r1) goto L9b
            java.nio.ByteBuffer r2 = r7.f7084e
            int r3 = r0 + 1
            byte r3 = r8.get(r3)
            r2.put(r3)
            java.nio.ByteBuffer r2 = r7.f7084e
            int r3 = r0 + 2
            byte r3 = r8.get(r3)
            r2.put(r3)
            int r0 = r0 + 3
            goto L80
        L9b:
            int r0 = r8.limit()
            r8.position(r0)
            java.nio.ByteBuffer r8 = r7.f7084e
            r8.flip()
            java.nio.ByteBuffer r8 = r7.f7084e
            r7.f7085f = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ku2.a(java.nio.ByteBuffer):void");
    }

    @Override // com.google.android.gms.internal.ads.nt2
    public final boolean b(int i2, int i3, int i4) throws mt2 {
        if (i4 != 3 && i4 != 2 && i4 != Integer.MIN_VALUE && i4 != 1073741824) {
            throw new mt2(i2, i3, i4);
        }
        if (this.f7081b == i2 && this.f7082c == i3 && this.f7083d == i4) {
            return false;
        }
        this.f7081b = i2;
        this.f7082c = i3;
        this.f7083d = i4;
        if (i4 != 2) {
            return true;
        }
        this.f7084e = nt2.a;
        return true;
    }

    @Override // com.google.android.gms.internal.ads.nt2
    public final boolean zzb() {
        int i2 = this.f7083d;
        return (i2 == 0 || i2 == 2) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.nt2
    public final int zzc() {
        return this.f7082c;
    }

    @Override // com.google.android.gms.internal.ads.nt2
    public final int zzd() {
        return 2;
    }

    @Override // com.google.android.gms.internal.ads.nt2
    public final void zzf() {
        this.f7086g = true;
    }

    @Override // com.google.android.gms.internal.ads.nt2
    public final ByteBuffer zzg() {
        ByteBuffer byteBuffer = this.f7085f;
        this.f7085f = nt2.a;
        return byteBuffer;
    }

    @Override // com.google.android.gms.internal.ads.nt2
    public final boolean zzh() {
        return this.f7086g && this.f7085f == nt2.a;
    }

    @Override // com.google.android.gms.internal.ads.nt2
    public final void zzi() {
        this.f7085f = nt2.a;
        this.f7086g = false;
    }

    @Override // com.google.android.gms.internal.ads.nt2
    public final void zzj() {
        zzi();
        this.f7084e = nt2.a;
        this.f7081b = -1;
        this.f7082c = -1;
        this.f7083d = 0;
    }
}