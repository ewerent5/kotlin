package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Stack;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class jw2 implements av2 {
    public static final cv2 a = new fw2();

    /* renamed from: b, reason: collision with root package name */
    private static final int f6873b = v03.l("seig");

    /* renamed from: c, reason: collision with root package name */
    private static final byte[] f6874c = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};

    /* renamed from: m, reason: collision with root package name */
    private int f6884m;
    private int n;
    private long o;
    private int p;
    private o03 q;
    private long r;
    private iw2 t;
    private int u;
    private int v;
    private int w;
    private bv2 x;
    private boolean y;

    /* renamed from: i, reason: collision with root package name */
    private final o03 f6880i = new o03(16);

    /* renamed from: e, reason: collision with root package name */
    private final o03 f6876e = new o03(m03.a);

    /* renamed from: f, reason: collision with root package name */
    private final o03 f6877f = new o03(5);

    /* renamed from: g, reason: collision with root package name */
    private final o03 f6878g = new o03();

    /* renamed from: h, reason: collision with root package name */
    private final o03 f6879h = new o03(1);

    /* renamed from: j, reason: collision with root package name */
    private final byte[] f6881j = new byte[16];

    /* renamed from: k, reason: collision with root package name */
    private final Stack<uv2> f6882k = new Stack<>();

    /* renamed from: l, reason: collision with root package name */
    private final LinkedList<gw2> f6883l = new LinkedList<>();

    /* renamed from: d, reason: collision with root package name */
    private final SparseArray<iw2> f6875d = new SparseArray<>();
    private long s = -9223372036854775807L;

    public jw2(int i2, s03 s03Var, pw2 pw2Var) {
        a();
    }

    private final void a() {
        this.f6884m = 0;
        this.p = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:241:0x0631, code lost:
    
        a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x0635, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x058f  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0599  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x05d4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void e(long r50) throws com.google.android.gms.internal.ads.at2 {
        /*
            Method dump skipped, instructions count: 1590
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.jw2.e(long):void");
    }

    private static void g(o03 o03Var, int i2, rw2 rw2Var) throws at2 {
        o03Var.i(i2 + 8);
        int iB = wv2.b(o03Var.r());
        if ((iB & 1) != 0) {
            throw new at2("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z = (iB & 2) != 0;
        int iU = o03Var.u();
        int i3 = rw2Var.f8782e;
        if (iU == i3) {
            Arrays.fill(rw2Var.f8790m, 0, iU, z);
            rw2Var.a(o03Var.d());
            o03Var.k(rw2Var.p.a, 0, rw2Var.o);
            rw2Var.p.i(0);
            rw2Var.q = false;
            return;
        }
        StringBuilder sb = new StringBuilder(41);
        sb.append("Length mismatch: ");
        sb.append(iU);
        sb.append(", ");
        sb.append(i3);
        throw new at2(sb.toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static com.google.android.gms.internal.ads.wu2 h(java.util.List<com.google.android.gms.internal.ads.vv2> r14) {
        /*
            int r0 = r14.size()
            r1 = 0
            r2 = 0
            r4 = r2
            r3 = 0
        L8:
            if (r3 >= r0) goto Lb7
            java.lang.Object r5 = r14.get(r3)
            com.google.android.gms.internal.ads.vv2 r5 = (com.google.android.gms.internal.ads.vv2) r5
            int r6 = r5.O0
            int r7 = com.google.android.gms.internal.ads.wv2.U
            if (r6 != r7) goto Lb3
            if (r4 != 0) goto L1d
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
        L1d:
            com.google.android.gms.internal.ads.o03 r5 = r5.P0
            byte[] r5 = r5.a
            com.google.android.gms.internal.ads.o03 r6 = new com.google.android.gms.internal.ads.o03
            r6.<init>(r5)
            int r8 = r6.e()
            r9 = 32
            if (r8 >= r9) goto L30
        L2e:
            r6 = r2
            goto L97
        L30:
            r6.i(r1)
            int r8 = r6.r()
            int r9 = r6.d()
            int r9 = r9 + 4
            if (r8 == r9) goto L40
            goto L2e
        L40:
            int r8 = r6.r()
            if (r8 == r7) goto L47
            goto L2e
        L47:
            int r7 = r6.r()
            int r7 = com.google.android.gms.internal.ads.wv2.a(r7)
            r8 = 1
            if (r7 <= r8) goto L6b
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r8 = 37
            r6.<init>(r8)
            java.lang.String r8 = "Unsupported pssh version: "
            r6.append(r8)
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            java.lang.String r7 = "PsshAtomUtil"
            android.util.Log.w(r7, r6)
            goto L2e
        L6b:
            java.util.UUID r9 = new java.util.UUID
            long r10 = r6.s()
            long r12 = r6.s()
            r9.<init>(r10, r12)
            if (r7 != r8) goto L83
            int r7 = r6.u()
            int r7 = r7 * 16
            r6.j(r7)
        L83:
            int r7 = r6.u()
            int r8 = r6.d()
            if (r7 == r8) goto L8e
            goto L2e
        L8e:
            byte[] r8 = new byte[r7]
            r6.k(r8, r1, r7)
            android.util.Pair r6 = android.util.Pair.create(r9, r8)
        L97:
            if (r6 != 0) goto L9b
            r6 = r2
            goto L9f
        L9b:
            java.lang.Object r6 = r6.first
            java.util.UUID r6 = (java.util.UUID) r6
        L9f:
            if (r6 != 0) goto La9
            java.lang.String r5 = "FragmentedMp4Extractor"
            java.lang.String r6 = "Skipped pssh atom (failed to extract uuid)"
            android.util.Log.w(r5, r6)
            goto Lb3
        La9:
            com.google.android.gms.internal.ads.vu2 r7 = new com.google.android.gms.internal.ads.vu2
            java.lang.String r8 = "video/mp4"
            r7.<init>(r6, r8, r5, r1)
            r4.add(r7)
        Lb3:
            int r3 = r3 + 1
            goto L8
        Lb7:
            if (r4 != 0) goto Lba
            return r2
        Lba:
            com.google.android.gms.internal.ads.wu2 r14 = new com.google.android.gms.internal.ads.wu2
            r14.<init>(r4)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.jw2.h(java.util.List):com.google.android.gms.internal.ads.wu2");
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x007f, code lost:
    
        r2 = r24.t;
        r3 = r2.a;
        r5 = r3.f8785h;
        r9 = r2.f6630e;
        r5 = r5[r9];
        r24.u = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x008d, code lost:
    
        if (r3.f8789l == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x008f, code lost:
    
        r5 = r3.p;
        r10 = r3.a.a;
        r11 = r3.n;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0097, code lost:
    
        if (r11 == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x009a, code lost:
    
        r11 = r2.f6628c.f8290h[r10];
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a0, code lost:
    
        r10 = r11.a;
        r3 = r3.f8790m[r9];
        r9 = r24.f6879h;
        r11 = r9.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00aa, code lost:
    
        if (true == r3) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ac, code lost:
    
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ae, code lost:
    
        r12 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b0, code lost:
    
        r11[0] = (byte) (r12 | r10);
        r9.i(0);
        r2 = r2.f6627b;
        r2.c(r24.f6879h, 1);
        r2.c(r5, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00c1, code lost:
    
        if (r3 != false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00c3, code lost:
    
        r10 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00c5, code lost:
    
        r3 = r5.m();
        r5.j(-2);
        r3 = (r3 * 6) + 2;
        r2.c(r5, r3);
        r10 = (r10 + 1) + r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00d5, code lost:
    
        r24.v = r10;
        r5 = r24.u + r10;
        r24.u = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00de, code lost:
    
        r24.v = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00e6, code lost:
    
        if (r24.t.f6628c.f8289g != 1) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00e8, code lost:
    
        r24.u = r5 - 8;
        r1.d(8, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00ef, code lost:
    
        r24.f6884m = 4;
        r24.w = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00f4, code lost:
    
        r2 = r24.t;
        r3 = r2.a;
        r5 = r2.f6628c;
        r9 = r2.f6627b;
        r2 = r2.f6630e;
        r6 = r5.f8293k;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0100, code lost:
    
        if (r6 != 0) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0102, code lost:
    
        r4 = r24.v;
        r6 = r24.u;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0106, code lost:
    
        if (r4 >= r6) goto L300;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0108, code lost:
    
        r24.v += r9.d(r1, r6 - r4, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0113, code lost:
    
        r10 = r24.f6877f.a;
        r10[0] = 0;
        r10[1] = 0;
        r10[2] = 0;
        r4 = r6 + 1;
        r6 = 4 - r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0126, code lost:
    
        if (r24.v >= r24.u) goto L301;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0128, code lost:
    
        r11 = r24.w;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x012a, code lost:
    
        if (r11 != 0) goto L302;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x012c, code lost:
    
        r1.b(r10, r6, r4, false);
        r24.f6877f.i(0);
        r24.w = r24.f6877f.u() - 1;
        r24.f6876e.i(0);
        r9.c(r24.f6876e, 4);
        r9.c(r24.f6877f, 1);
        r24.v += 5;
        r24.u += r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x015a, code lost:
    
        r11 = r9.d(r1, r11, false);
        r24.v += r11;
        r24.w -= r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0169, code lost:
    
        r10 = (r3.f8787j[r2] + r3.f8786i[r2]) * 1000;
        r1 = r3.f8789l;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0179, code lost:
    
        if (true == r1) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x017b, code lost:
    
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x017d, code lost:
    
        r4 = 1073741824;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x017f, code lost:
    
        r12 = r4 | (r3.f8788k[r2] ? 1 : 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0185, code lost:
    
        if (r1 == false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0187, code lost:
    
        r1 = r3.n;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0189, code lost:
    
        if (r1 != null) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x018b, code lost:
    
        r1 = r5.f8290h[r3.a.a];
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0193, code lost:
    
        r2 = r24.t;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0197, code lost:
    
        if (r1 == r2.f6634i) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0199, code lost:
    
        r2 = new com.google.android.gms.internal.ads.jv2(1, r1.f8517b);
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01a1, code lost:
    
        r2 = r2.f6633h;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01a3, code lost:
    
        r15 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01a5, code lost:
    
        r1 = null;
        r15 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01a7, code lost:
    
        r2 = r24.t;
        r2.f6633h = r15;
        r2.f6634i = r1;
        r9.b(r10, r12, r24.u, 0, r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01b9, code lost:
    
        if (r24.f6883l.isEmpty() == false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01bb, code lost:
    
        r1 = r24.t;
        r1.f6630e++;
        r2 = r1.f6631f + 1;
        r1.f6631f = r2;
        r3 = r3.f8784g;
        r4 = r1.f6632g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01cd, code lost:
    
        if (r2 != r3[r4]) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01cf, code lost:
    
        r1.f6632g = r4 + 1;
        r1.f6631f = 0;
        r24.t = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01d7, code lost:
    
        r24.f6884m = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01da, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01db, code lost:
    
        r2 = r24.f6883l.removeFirst().a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01e6, code lost:
    
        throw null;
     */
    @Override // com.google.android.gms.internal.ads.av2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int b(com.google.android.gms.internal.ads.zu2 r25, com.google.android.gms.internal.ads.fv2 r26) throws com.google.android.gms.internal.ads.at2, java.lang.InterruptedException, java.io.EOFException {
        /*
            Method dump skipped, instructions count: 1223
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.jw2.b(com.google.android.gms.internal.ads.zu2, com.google.android.gms.internal.ads.fv2):int");
    }

    @Override // com.google.android.gms.internal.ads.av2
    public final boolean c(zu2 zu2Var) {
        return ow2.a(zu2Var);
    }

    @Override // com.google.android.gms.internal.ads.av2
    public final void d(bv2 bv2Var) {
        this.x = bv2Var;
    }

    @Override // com.google.android.gms.internal.ads.av2
    public final void f(long j2, long j3) {
        int size = this.f6875d.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.f6875d.valueAt(i2).b();
        }
        this.f6883l.clear();
        this.f6882k.clear();
        a();
    }
}