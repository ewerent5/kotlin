package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.view.Surface;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzr;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class tu implements e03, ay2, q13, vt2, ks2 {

    /* renamed from: e */
    static int f9249e;

    /* renamed from: f */
    static int f9250f;

    /* renamed from: g */
    private final Context f9251g;

    /* renamed from: h */
    private final iu f9252h;

    /* renamed from: i */
    private final ct2 f9253i;

    /* renamed from: j */
    private final ct2 f9254j;

    /* renamed from: k */
    private final fz2 f9255k;

    /* renamed from: l */
    private final kt f9256l;

    /* renamed from: m */
    private ns2 f9257m;
    private ByteBuffer n;
    private boolean o;
    private final WeakReference<lt> p;
    private su q;
    private int r;
    private int s;
    private long t;
    private final String u;
    private final int v;
    private final ArrayList<yz2> w;
    private volatile hu x;
    private final Set<WeakReference<eu>> y = new HashSet();

    public tu(Context context, kt ktVar, lt ltVar) {
        this.f9251g = context;
        this.f9256l = ktVar;
        this.p = new WeakReference<>(ltVar);
        iu iuVar = new iu();
        this.f9252h = iuVar;
        xw2 xw2Var = xw2.a;
        l02 l02Var = zzr.zza;
        e13 e13Var = new e13(context, xw2Var, 0L, l02Var, this, -1);
        this.f9253i = e13Var;
        ju2 ju2Var = new ju2(xw2Var, null, true, l02Var, this);
        this.f9254j = ju2Var;
        bz2 bz2Var = new bz2(null);
        this.f9255k = bz2Var;
        if (zze.zzc()) {
            String strValueOf = String.valueOf(this);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 28);
            sb.append("ExoPlayerAdapter initialize ");
            sb.append(strValueOf);
            zze.zza(sb.toString());
        }
        f9249e++;
        ns2 ns2VarA = os2.a(new ct2[]{ju2Var, e13Var}, bz2Var, iuVar);
        this.f9257m = ns2VarA;
        ns2VarA.g(this);
        this.r = 0;
        this.t = 0L;
        this.s = 0;
        this.w = new ArrayList<>();
        this.x = null;
        this.u = (ltVar == null || ltVar.zzn() == null) ? "" : ltVar.zzn();
        this.v = ltVar != null ? ltVar.zzp() : 0;
        if (((Boolean) c.c().b(w3.o)).booleanValue()) {
            this.f9257m.a();
        }
        if (ltVar != null && ltVar.zzD() > 0) {
            this.f9257m.j(ltVar.zzD());
        }
        if (ltVar == null || ltVar.zzE() <= 0) {
            return;
        }
        this.f9257m.f(ltVar.zzE());
    }

    public static int A() {
        return f9249e;
    }

    public static int B() {
        return f9250f;
    }

    private final boolean y() {
        return this.x != null && this.x.d();
    }

    public final void C(su suVar) {
        this.q = suVar;
    }

    public final iu D() {
        return this.f9252h;
    }

    public final void E(Uri[] uriArr, String str) {
        F(uriArr, str, ByteBuffer.allocate(0), false);
    }

    public final void F(Uri[] uriArr, String str, ByteBuffer byteBuffer, boolean z) {
        fy2 ky2Var;
        if (this.f9257m == null) {
            return;
        }
        this.n = byteBuffer;
        this.o = z;
        int length = uriArr.length;
        if (length == 1) {
            ky2Var = t(uriArr[0], str);
        } else {
            fy2[] fy2VarArr = new fy2[length];
            for (int i2 = 0; i2 < uriArr.length; i2++) {
                fy2VarArr[i2] = t(uriArr[i2], str);
            }
            ky2Var = new ky2(fy2VarArr);
        }
        this.f9257m.c(ky2Var);
        f9250f++;
    }

    public final void G() {
        ns2 ns2Var = this.f9257m;
        if (ns2Var != null) {
            ns2Var.i(this);
            this.f9257m.zzi();
            this.f9257m = null;
            f9250f--;
        }
    }

    public final long H() {
        return this.r;
    }

    public final long I() {
        if (y()) {
            return 0L;
        }
        return this.r;
    }

    public final long J() {
        if (y() && this.x.e()) {
            return Math.min(this.r, this.x.g());
        }
        return 0L;
    }

    public final long K() throws NumberFormatException {
        if (y()) {
            return this.x.h();
        }
        while (!this.w.isEmpty()) {
            long j2 = this.t;
            Map<String, List<String>> mapZze = this.w.remove(0).zze();
            long j3 = 0;
            if (mapZze != null) {
                Iterator<Map.Entry<String, List<String>>> it = mapZze.entrySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Map.Entry<String, List<String>> next = it.next();
                    if (next != null) {
                        try {
                            if (next.getKey() != null && o02.a("content-length", next.getKey()) && next.getValue() != null && next.getValue().get(0) != null) {
                                j3 = Long.parseLong(next.getValue().get(0));
                                break;
                            }
                        } catch (NumberFormatException unused) {
                        }
                    }
                }
            }
            this.t = j2 + j3;
        }
        return this.t;
    }

    @Override // com.google.android.gms.internal.ads.ay2
    public final void a(IOException iOException) {
        su suVar = this.q;
        if (suVar != null) {
            if (this.f9256l.f7073l) {
                suVar.b("onLoadException", iOException);
            } else {
                suVar.c("onLoadError", iOException);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.ks2
    public final void b(js2 js2Var) {
        su suVar = this.q;
        if (suVar != null) {
            suVar.c("onPlayerError", js2Var);
        }
    }

    @Override // com.google.android.gms.internal.ads.q13
    public final void c(int i2, int i3, int i4, float f2) {
        su suVar = this.q;
        if (suVar != null) {
            suVar.f(i2, i3);
        }
    }

    @Override // com.google.android.gms.internal.ads.q13
    public final void d(xs2 xs2Var) {
        lt ltVar = this.p.get();
        if (!((Boolean) c.c().b(w3.j1)).booleanValue() || ltVar == null || xs2Var == null) {
            return;
        }
        HashMap map = new HashMap();
        map.put("frameRate", String.valueOf(xs2Var.p));
        map.put("bitRate", String.valueOf(xs2Var.f10246f));
        int i2 = xs2Var.n;
        int i3 = xs2Var.o;
        StringBuilder sb = new StringBuilder(23);
        sb.append(i2);
        sb.append("x");
        sb.append(i3);
        map.put("resolution", sb.toString());
        map.put("videoMime", xs2Var.f10249i);
        map.put("videoSampleMime", xs2Var.f10250j);
        map.put("videoCodec", xs2Var.f10247g);
        ltVar.e0("onMetadataEvent", map);
    }

    @Override // com.google.android.gms.internal.ads.ks2
    public final void e(bt2 bt2Var) {
    }

    @Override // com.google.android.gms.internal.ads.ks2
    public final void f(vy2 vy2Var, hz2 hz2Var) {
    }

    public final void finalize() {
        f9249e--;
        if (zze.zzc()) {
            String strValueOf = String.valueOf(this);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 26);
            sb.append("ExoPlayerAdapter finalize ");
            sb.append(strValueOf);
            zze.zza(sb.toString());
        }
    }

    @Override // com.google.android.gms.internal.ads.ks2
    public final void h(jt2 jt2Var, Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.vt2
    public final void i(xs2 xs2Var) {
        lt ltVar = this.p.get();
        if (!((Boolean) c.c().b(w3.j1)).booleanValue() || ltVar == null || xs2Var == null) {
            return;
        }
        HashMap map = new HashMap();
        map.put("audioMime", xs2Var.f10249i);
        map.put("audioSampleMime", xs2Var.f10250j);
        map.put("audioCodec", xs2Var.f10247g);
        ltVar.e0("onMetadataEvent", map);
    }

    @Override // com.google.android.gms.internal.ads.ks2
    public final void j(boolean z, int i2) {
        su suVar = this.q;
        if (suVar != null) {
            suVar.e(i2);
        }
    }

    @Override // com.google.android.gms.internal.ads.e03
    public final /* bridge */ /* synthetic */ void k(Object obj, int i2) {
        this.r += i2;
    }

    @Override // com.google.android.gms.internal.ads.q13
    public final void l(int i2, long j2) {
        this.s += i2;
    }

    public final int m() {
        return this.s;
    }

    @Override // com.google.android.gms.internal.ads.e03
    /* renamed from: n */
    public final void g(pz2 pz2Var, rz2 rz2Var) {
        if (pz2Var instanceof yz2) {
            this.w.add((yz2) pz2Var);
            return;
        }
        if (pz2Var instanceof hu) {
            this.x = (hu) pz2Var;
            final lt ltVar = this.p.get();
            if (((Boolean) c.c().b(w3.j1)).booleanValue() && ltVar != null && this.x.c()) {
                final HashMap map = new HashMap();
                map.put("gcacheHit", String.valueOf(this.x.e()));
                map.put("gcacheDownloaded", String.valueOf(this.x.f()));
                zzr.zza.post(new Runnable(ltVar, map) { // from class: com.google.android.gms.internal.ads.ju

                    /* renamed from: e, reason: collision with root package name */
                    private final lt f6845e;

                    /* renamed from: f, reason: collision with root package name */
                    private final Map f6846f;

                    {
                        this.f6845e = ltVar;
                        this.f6846f = map;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f6845e.e0("onGcacheInfoEvent", this.f6846f);
                    }
                });
            }
        }
    }

    public final void o(pz2 pz2Var, int i2) {
        this.r += i2;
    }

    public final void p(int i2) {
        Iterator<WeakReference<eu>> it = this.y.iterator();
        while (it.hasNext()) {
            eu euVar = it.next().get();
            if (euVar != null) {
                euVar.c(i2);
            }
        }
    }

    final void q(Surface surface, boolean z) {
        if (this.f9257m == null) {
            return;
        }
        ms2 ms2Var = new ms2(this.f9253i, 1, surface);
        if (z) {
            this.f9257m.d(ms2Var);
        } else {
            this.f9257m.e(ms2Var);
        }
    }

    final void r(float f2, boolean z) {
        if (this.f9257m == null) {
            return;
        }
        ms2 ms2Var = new ms2(this.f9254j, 2, Float.valueOf(f2));
        if (z) {
            this.f9257m.d(ms2Var);
        } else {
            this.f9257m.e(ms2Var);
        }
    }

    final void s(boolean z) {
        if (this.f9257m != null) {
            for (int i2 = 0; i2 < 2; i2++) {
                this.f9255k.f(i2, !z);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x009e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final com.google.android.gms.internal.ads.fy2 t(android.net.Uri r11, final java.lang.String r12) {
        /*
            r10 = this;
            com.google.android.gms.internal.ads.by2 r9 = new com.google.android.gms.internal.ads.by2
            boolean r0 = r10.o
            if (r0 == 0) goto L22
            java.nio.ByteBuffer r0 = r10.n
            int r0 = r0.limit()
            if (r0 <= 0) goto L22
            java.nio.ByteBuffer r12 = r10.n
            int r12 = r12.limit()
            byte[] r12 = new byte[r12]
            java.nio.ByteBuffer r0 = r10.n
            r0.get(r12)
            com.google.android.gms.internal.ads.ku r0 = new com.google.android.gms.internal.ads.ku
            r0.<init>(r12)
        L20:
            r2 = r0
            goto L89
        L22:
            com.google.android.gms.internal.ads.o3<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.w3.l1
            com.google.android.gms.internal.ads.u3 r1 = com.google.android.gms.internal.ads.c.c()
            java.lang.Object r0 = r1.b(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = 1
            if (r0 == 0) goto L47
            com.google.android.gms.internal.ads.o3<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.w3.j1
            com.google.android.gms.internal.ads.u3 r2 = com.google.android.gms.internal.ads.c.c()
            java.lang.Object r0 = r2.b(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L4f
        L47:
            com.google.android.gms.internal.ads.kt r0 = r10.f9256l
            boolean r0 = r0.f7071j
            if (r0 != 0) goto L4e
            goto L4f
        L4e:
            r1 = 0
        L4f:
            com.google.android.gms.internal.ads.kt r0 = r10.f9256l
            int r0 = r0.f7070i
            if (r0 <= 0) goto L5b
            com.google.android.gms.internal.ads.lu r0 = new com.google.android.gms.internal.ads.lu
            r0.<init>(r10, r12, r1)
            goto L60
        L5b:
            com.google.android.gms.internal.ads.mu r0 = new com.google.android.gms.internal.ads.mu
            r0.<init>(r10, r12, r1)
        L60:
            com.google.android.gms.internal.ads.kt r12 = r10.f9256l
            boolean r12 = r12.f7071j
            if (r12 == 0) goto L6c
            com.google.android.gms.internal.ads.nu r12 = new com.google.android.gms.internal.ads.nu
            r12.<init>(r10, r0)
            r0 = r12
        L6c:
            java.nio.ByteBuffer r12 = r10.n
            if (r12 == 0) goto L20
            int r12 = r12.limit()
            if (r12 <= 0) goto L20
            java.nio.ByteBuffer r12 = r10.n
            int r12 = r12.limit()
            byte[] r12 = new byte[r12]
            java.nio.ByteBuffer r1 = r10.n
            r1.get(r12)
            com.google.android.gms.internal.ads.ou r1 = new com.google.android.gms.internal.ads.ou
            r1.<init>(r0, r12)
            r2 = r1
        L89:
            com.google.android.gms.internal.ads.o3<java.lang.Boolean> r12 = com.google.android.gms.internal.ads.w3.n
            com.google.android.gms.internal.ads.u3 r0 = com.google.android.gms.internal.ads.c.c()
            java.lang.Object r12 = r0.b(r12)
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            if (r12 == 0) goto L9e
            com.google.android.gms.internal.ads.cv2 r12 = com.google.android.gms.internal.ads.pu.a
            goto La0
        L9e:
            com.google.android.gms.internal.ads.cv2 r12 = com.google.android.gms.internal.ads.qu.a
        La0:
            r3 = r12
            com.google.android.gms.internal.ads.kt r12 = r10.f9256l
            int r4 = r12.f7072k
            com.google.android.gms.internal.ads.l02 r5 = com.google.android.gms.ads.internal.util.zzr.zza
            r7 = 0
            int r8 = r12.f7068g
            r0 = r9
            r1 = r11
            r6 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.tu.t(android.net.Uri, java.lang.String):com.google.android.gms.internal.ads.fy2");
    }

    final /* synthetic */ pz2 u(oz2 oz2Var) {
        return new hu(this.f9251g, oz2Var.zza(), this.u, this.v, this, new gu(this) { // from class: com.google.android.gms.internal.ads.ru
            private final tu a;

            {
                this.a = this;
            }

            @Override // com.google.android.gms.internal.ads.gu
            public final void a(boolean z, long j2) {
                this.a.v(z, j2);
            }
        });
    }

    final /* synthetic */ void v(boolean z, long j2) {
        su suVar = this.q;
        if (suVar != null) {
            suVar.d(z, j2);
        }
    }

    final /* synthetic */ pz2 w(String str, boolean z) {
        tu tuVar = true != z ? null : this;
        kt ktVar = this.f9256l;
        return new tz2(str, null, tuVar, ktVar.f7065d, ktVar.f7067f, true, null);
    }

    final /* synthetic */ pz2 x(String str, boolean z) {
        tu tuVar = true != z ? null : this;
        kt ktVar = this.f9256l;
        eu euVar = new eu(str, tuVar, ktVar.f7065d, ktVar.f7067f, ktVar.f7070i);
        this.y.add(new WeakReference<>(euVar));
        return euVar;
    }

    public final ns2 z() {
        return this.f9257m;
    }

    @Override // com.google.android.gms.internal.ads.ks2
    public final void zzc(boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.ks2
    public final void zzf() {
    }
}