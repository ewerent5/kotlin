package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.os.Build;
import android.view.Surface;
import android.view.TextureView;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzr;
import com.google.android.gms.ads.internal.zzs;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
@TargetApi(16)
/* loaded from: classes.dex */
public final class cu extends ts implements TextureView.SurfaceTextureListener, su {

    /* renamed from: g */
    private final lt f5364g;

    /* renamed from: h */
    private final mt f5365h;

    /* renamed from: i */
    private final boolean f5366i;

    /* renamed from: j */
    private final kt f5367j;

    /* renamed from: k */
    private ss f5368k;

    /* renamed from: l */
    private Surface f5369l;

    /* renamed from: m */
    private tu f5370m;
    private String n;
    private String[] o;
    private boolean p;
    private int q;
    private jt r;
    private final boolean s;
    private boolean t;
    private boolean u;
    private int v;
    private int w;
    private int x;
    private int y;
    private float z;

    public cu(Context context, mt mtVar, lt ltVar, boolean z, boolean z2, kt ktVar) {
        super(context);
        this.q = 1;
        this.f5366i = z2;
        this.f5364g = ltVar;
        this.f5365h = mtVar;
        this.s = z;
        this.f5367j = ktVar;
        setSurfaceTextureListener(this);
        mtVar.a(this);
    }

    private final boolean M() {
        tu tuVar = this.f5370m;
        return (tuVar == null || tuVar.z() == null || this.p) ? false : true;
    }

    private final boolean N() {
        return M() && this.q != 1;
    }

    private final void O() {
        String str;
        if (this.f5370m != null || (str = this.n) == null || this.f5369l == null) {
            return;
        }
        if (str.startsWith("cache:")) {
            lv lvVarZ = this.f5364g.z(this.n);
            if (lvVarZ instanceof tv) {
                tu tuVarV = ((tv) lvVarZ).v();
                this.f5370m = tuVarV;
                if (tuVarV.z() == null) {
                    er.zzi("Precached video player has been released.");
                    return;
                }
            } else {
                if (!(lvVarZ instanceof rv)) {
                    String strValueOf = String.valueOf(this.n);
                    er.zzi(strValueOf.length() != 0 ? "Stream cache miss: ".concat(strValueOf) : new String("Stream cache miss: "));
                    return;
                }
                rv rvVar = (rv) lvVarZ;
                String strY = Y();
                ByteBuffer byteBufferX = rvVar.x();
                boolean zW = rvVar.w();
                String strV = rvVar.v();
                if (strV == null) {
                    er.zzi("Stream cache URL is null.");
                    return;
                } else {
                    tu tuVarX = X();
                    this.f5370m = tuVarX;
                    tuVarX.F(new Uri[]{Uri.parse(strV)}, strY, byteBufferX, zW);
                }
            }
        } else {
            this.f5370m = X();
            String strY2 = Y();
            Uri[] uriArr = new Uri[this.o.length];
            int i2 = 0;
            while (true) {
                String[] strArr = this.o;
                if (i2 >= strArr.length) {
                    break;
                }
                uriArr[i2] = Uri.parse(strArr[i2]);
                i2++;
            }
            this.f5370m.E(uriArr, strY2);
        }
        this.f5370m.C(this);
        P(this.f5369l, false);
        if (this.f5370m.z() != null) {
            int iZzc = this.f5370m.z().zzc();
            this.q = iZzc;
            if (iZzc == 3) {
                R();
            }
        }
    }

    private final void P(Surface surface, boolean z) {
        tu tuVar = this.f5370m;
        if (tuVar != null) {
            tuVar.q(surface, z);
        } else {
            er.zzi("Trying to set surface before player is initialized.");
        }
    }

    private final void Q(float f2, boolean z) {
        tu tuVar = this.f5370m;
        if (tuVar != null) {
            tuVar.r(f2, z);
        } else {
            er.zzi("Trying to set volume before player is initialized.");
        }
    }

    private final void R() {
        if (this.t) {
            return;
        }
        this.t = true;
        zzr.zza.post(new Runnable(this) { // from class: com.google.android.gms.internal.ads.qt

            /* renamed from: e, reason: collision with root package name */
            private final cu f8467e;

            {
                this.f8467e = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f8467e.L();
            }
        });
        zzq();
        this.f5365h.b();
        if (this.u) {
            j();
        }
    }

    private static String S(String str, Exception exc) {
        String canonicalName = exc.getClass().getCanonicalName();
        String message = exc.getMessage();
        int length = str.length();
        StringBuilder sb = new StringBuilder(length + 2 + String.valueOf(canonicalName).length() + String.valueOf(message).length());
        sb.append(str);
        sb.append("/");
        sb.append(canonicalName);
        sb.append(":");
        sb.append(message);
        return sb.toString();
    }

    private final void T() {
        U(this.v, this.w);
    }

    private final void U(int i2, int i3) {
        float f2 = i3 > 0 ? i2 / i3 : 1.0f;
        if (this.z != f2) {
            this.z = f2;
            requestLayout();
        }
    }

    private final void V() {
        tu tuVar = this.f5370m;
        if (tuVar != null) {
            tuVar.s(true);
        }
    }

    private final void W() {
        tu tuVar = this.f5370m;
        if (tuVar != null) {
            tuVar.s(false);
        }
    }

    @Override // com.google.android.gms.internal.ads.ts
    public final void A(int i2) {
        tu tuVar = this.f5370m;
        if (tuVar != null) {
            tuVar.p(i2);
        }
    }

    final /* synthetic */ void B(String str) {
        ss ssVar = this.f5368k;
        if (ssVar != null) {
            ssVar.b("ExoPlayerAdapter exception", str);
        }
    }

    final /* synthetic */ void C(boolean z, long j2) {
        this.f5364g.B0(z, j2);
    }

    final /* synthetic */ void D(int i2) {
        ss ssVar = this.f5368k;
        if (ssVar != null) {
            ssVar.onWindowVisibilityChanged(i2);
        }
    }

    final /* synthetic */ void E() {
        ss ssVar = this.f5368k;
        if (ssVar != null) {
            ssVar.zzh();
        }
    }

    final /* synthetic */ void F(int i2, int i3) {
        ss ssVar = this.f5368k;
        if (ssVar != null) {
            ssVar.a(i2, i3);
        }
    }

    final /* synthetic */ void G() {
        ss ssVar = this.f5368k;
        if (ssVar != null) {
            ssVar.zza();
        }
    }

    final /* synthetic */ void H() {
        ss ssVar = this.f5368k;
        if (ssVar != null) {
            ssVar.zzd();
        }
    }

    final /* synthetic */ void I() {
        ss ssVar = this.f5368k;
        if (ssVar != null) {
            ssVar.zzc();
        }
    }

    final /* synthetic */ void J(String str) {
        ss ssVar = this.f5368k;
        if (ssVar != null) {
            ssVar.c("ExoPlayerAdapter error", str);
        }
    }

    final /* synthetic */ void K() {
        ss ssVar = this.f5368k;
        if (ssVar != null) {
            ssVar.zze();
        }
    }

    final /* synthetic */ void L() {
        ss ssVar = this.f5368k;
        if (ssVar != null) {
            ssVar.zzb();
        }
    }

    final tu X() {
        return new tu(this.f5364g.getContext(), this.f5367j, this.f5364g);
    }

    final String Y() {
        return zzs.zzc().zze(this.f5364g.getContext(), this.f5364g.zzt().f7054e);
    }

    @Override // com.google.android.gms.internal.ads.ts
    public final String a() {
        String str = true != this.s ? "" : " spherical";
        return str.length() != 0 ? "ExoPlayer/3".concat(str) : new String("ExoPlayer/3");
    }

    @Override // com.google.android.gms.internal.ads.su
    public final void b(String str, Exception exc) {
        final String strS = S("onLoadException", exc);
        String strValueOf = String.valueOf(strS);
        er.zzi(strValueOf.length() != 0 ? "ExoPlayerAdapter exception: ".concat(strValueOf) : new String("ExoPlayerAdapter exception: "));
        zzr.zza.post(new Runnable(this, strS) { // from class: com.google.android.gms.internal.ads.rt

            /* renamed from: e, reason: collision with root package name */
            private final cu f8735e;

            /* renamed from: f, reason: collision with root package name */
            private final String f8736f;

            {
                this.f8735e = this;
                this.f8736f = strS;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f8735e.B(this.f8736f);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.su
    public final void c(String str, Exception exc) {
        final String strS = S(str, exc);
        String strValueOf = String.valueOf(strS);
        er.zzi(strValueOf.length() != 0 ? "ExoPlayerAdapter error: ".concat(strValueOf) : new String("ExoPlayerAdapter error: "));
        this.p = true;
        if (this.f5367j.a) {
            W();
        }
        zzr.zza.post(new Runnable(this, strS) { // from class: com.google.android.gms.internal.ads.tt

            /* renamed from: e, reason: collision with root package name */
            private final cu f9243e;

            /* renamed from: f, reason: collision with root package name */
            private final String f9244f;

            {
                this.f9243e = this;
                this.f9244f = strS;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f9243e.J(this.f9244f);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.su
    public final void d(final boolean z, final long j2) {
        if (this.f5364g != null) {
            qr.f8450e.execute(new Runnable(this, z, j2) { // from class: com.google.android.gms.internal.ads.bu

                /* renamed from: e, reason: collision with root package name */
                private final cu f5190e;

                /* renamed from: f, reason: collision with root package name */
                private final boolean f5191f;

                /* renamed from: g, reason: collision with root package name */
                private final long f5192g;

                {
                    this.f5190e = this;
                    this.f5191f = z;
                    this.f5192g = j2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.f5190e.C(this.f5191f, this.f5192g);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.su
    public final void e(int i2) {
        if (this.q != i2) {
            this.q = i2;
            if (i2 == 3) {
                R();
                return;
            }
            if (i2 != 4) {
                return;
            }
            if (this.f5367j.a) {
                W();
            }
            this.f5365h.f();
            this.f9239f.e();
            zzr.zza.post(new Runnable(this) { // from class: com.google.android.gms.internal.ads.st

                /* renamed from: e, reason: collision with root package name */
                private final cu f8983e;

                {
                    this.f8983e = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.f8983e.K();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.su
    public final void f(int i2, int i3) {
        this.v = i2;
        this.w = i3;
        T();
    }

    @Override // com.google.android.gms.internal.ads.ts
    public final void g(ss ssVar) {
        this.f5368k = ssVar;
    }

    @Override // com.google.android.gms.internal.ads.ts
    public final void h(String str) {
        if (str != null) {
            this.n = str;
            this.o = new String[]{str};
            O();
        }
    }

    @Override // com.google.android.gms.internal.ads.ts
    public final void i() {
        if (M()) {
            this.f5370m.z().zzh();
            if (this.f5370m != null) {
                P(null, true);
                tu tuVar = this.f5370m;
                if (tuVar != null) {
                    tuVar.C(null);
                    this.f5370m.G();
                    this.f5370m = null;
                }
                this.q = 1;
                this.p = false;
                this.t = false;
                this.u = false;
            }
        }
        this.f5365h.f();
        this.f9239f.e();
        this.f5365h.c();
    }

    @Override // com.google.android.gms.internal.ads.ts
    public final void j() {
        if (!N()) {
            this.u = true;
            return;
        }
        if (this.f5367j.a) {
            V();
        }
        this.f5370m.z().b(true);
        this.f5365h.e();
        this.f9239f.d();
        this.f9238e.a();
        zzr.zza.post(new Runnable(this) { // from class: com.google.android.gms.internal.ads.ut

            /* renamed from: e, reason: collision with root package name */
            private final cu f9553e;

            {
                this.f9553e = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f9553e.I();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.ts
    public final void k() {
        if (N()) {
            if (this.f5367j.a) {
                W();
            }
            this.f5370m.z().b(false);
            this.f5365h.f();
            this.f9239f.e();
            zzr.zza.post(new Runnable(this) { // from class: com.google.android.gms.internal.ads.vt

                /* renamed from: e, reason: collision with root package name */
                private final cu f9776e;

                {
                    this.f9776e = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.f9776e.H();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.ts
    public final int l() {
        if (N()) {
            return (int) this.f5370m.z().zzl();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.ts
    public final int m() {
        if (N()) {
            return (int) this.f5370m.z().zzm();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.ts
    public final void n(int i2) {
        if (N()) {
            this.f5370m.z().h(i2);
        }
    }

    @Override // com.google.android.gms.internal.ads.ts
    public final void o(float f2, float f3) {
        jt jtVar = this.r;
        if (jtVar != null) {
            jtVar.e(f2, f3);
        }
    }

    @Override // android.view.View
    protected final void onMeasure(int i2, int i3) {
        int i4;
        super.onMeasure(i2, i3);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f2 = this.z;
        if (f2 != 0.0f && this.r == null) {
            float f3 = measuredWidth;
            float f4 = f3 / measuredHeight;
            if (f2 > f4) {
                measuredHeight = (int) (f3 / f2);
            }
            if (f2 < f4) {
                measuredWidth = (int) (measuredHeight * f2);
            }
        }
        setMeasuredDimension(measuredWidth, measuredHeight);
        jt jtVar = this.r;
        if (jtVar != null) {
            jtVar.b(measuredWidth, measuredHeight);
        }
        if (Build.VERSION.SDK_INT == 16) {
            int i5 = this.x;
            if (((i5 > 0 && i5 != measuredWidth) || ((i4 = this.y) > 0 && i4 != measuredHeight)) && this.f5366i && M()) {
                ns2 ns2VarZ = this.f5370m.z();
                if (ns2VarZ.zzm() > 0 && !ns2VarZ.zzf()) {
                    Q(0.0f, true);
                    ns2VarZ.b(true);
                    long jZzm = ns2VarZ.zzm();
                    long jA = zzs.zzj().a();
                    while (M() && ns2VarZ.zzm() == jZzm && zzs.zzj().a() - jA <= 250) {
                    }
                    ns2VarZ.b(false);
                    zzq();
                }
            }
            this.x = measuredWidth;
            this.y = measuredHeight;
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i2, int i3) throws InterruptedException {
        if (this.s) {
            jt jtVar = new jt(getContext());
            this.r = jtVar;
            jtVar.a(surfaceTexture, i2, i3);
            this.r.start();
            SurfaceTexture surfaceTextureD = this.r.d();
            if (surfaceTextureD != null) {
                surfaceTexture = surfaceTextureD;
            } else {
                this.r.c();
                this.r = null;
            }
        }
        Surface surface = new Surface(surfaceTexture);
        this.f5369l = surface;
        if (this.f5370m == null) {
            O();
        } else {
            P(surface, true);
            if (!this.f5367j.a) {
                V();
            }
        }
        if (this.v == 0 || this.w == 0) {
            U(i2, i3);
        } else {
            T();
        }
        zzr.zza.post(new Runnable(this) { // from class: com.google.android.gms.internal.ads.xt

            /* renamed from: e, reason: collision with root package name */
            private final cu f10254e;

            {
                this.f10254e = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f10254e.G();
            }
        });
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        k();
        jt jtVar = this.r;
        if (jtVar != null) {
            jtVar.c();
            this.r = null;
        }
        if (this.f5370m != null) {
            W();
            Surface surface = this.f5369l;
            if (surface != null) {
                surface.release();
            }
            this.f5369l = null;
            P(null, true);
        }
        zzr.zza.post(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zt

            /* renamed from: e, reason: collision with root package name */
            private final cu f10632e;

            {
                this.f10632e = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f10632e.E();
            }
        });
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, final int i2, final int i3) {
        jt jtVar = this.r;
        if (jtVar != null) {
            jtVar.b(i2, i3);
        }
        zzr.zza.post(new Runnable(this, i2, i3) { // from class: com.google.android.gms.internal.ads.yt

            /* renamed from: e, reason: collision with root package name */
            private final cu f10471e;

            /* renamed from: f, reason: collision with root package name */
            private final int f10472f;

            /* renamed from: g, reason: collision with root package name */
            private final int f10473g;

            {
                this.f10471e = this;
                this.f10472f = i2;
                this.f10473g = i3;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f10471e.F(this.f10472f, this.f10473g);
            }
        });
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.f5365h.d(this);
        this.f9238e.b(surfaceTexture, this.f5368k);
    }

    @Override // android.view.View
    protected final void onWindowVisibilityChanged(final int i2) {
        StringBuilder sb = new StringBuilder(57);
        sb.append("AdExoPlayerView3 window visibility changed to ");
        sb.append(i2);
        zze.zza(sb.toString());
        zzr.zza.post(new Runnable(this, i2) { // from class: com.google.android.gms.internal.ads.au

            /* renamed from: e, reason: collision with root package name */
            private final cu f5000e;

            /* renamed from: f, reason: collision with root package name */
            private final int f5001f;

            {
                this.f5000e = this;
                this.f5001f = i2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f5000e.D(this.f5001f);
            }
        });
        super.onWindowVisibilityChanged(i2);
    }

    @Override // com.google.android.gms.internal.ads.ts
    public final int p() {
        return this.v;
    }

    @Override // com.google.android.gms.internal.ads.ts
    public final int q() {
        return this.w;
    }

    @Override // com.google.android.gms.internal.ads.ts
    public final long r() {
        tu tuVar = this.f5370m;
        if (tuVar != null) {
            return tuVar.I();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.ts
    public final long s() {
        tu tuVar = this.f5370m;
        if (tuVar != null) {
            return tuVar.J();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.ts
    public final long t() {
        tu tuVar = this.f5370m;
        if (tuVar != null) {
            return tuVar.K();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.ts
    public final int u() {
        tu tuVar = this.f5370m;
        if (tuVar != null) {
            return tuVar.m();
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.ts
    public final void v(String str, String[] strArr) {
        if (str != null) {
            if (strArr == null) {
                h(str);
            }
            this.n = str;
            this.o = (String[]) Arrays.copyOf(strArr, strArr.length);
            O();
        }
    }

    @Override // com.google.android.gms.internal.ads.ts
    public final void w(int i2) {
        tu tuVar = this.f5370m;
        if (tuVar != null) {
            tuVar.D().g(i2);
        }
    }

    @Override // com.google.android.gms.internal.ads.ts
    public final void x(int i2) {
        tu tuVar = this.f5370m;
        if (tuVar != null) {
            tuVar.D().h(i2);
        }
    }

    @Override // com.google.android.gms.internal.ads.ts
    public final void y(int i2) {
        tu tuVar = this.f5370m;
        if (tuVar != null) {
            tuVar.D().i(i2);
        }
    }

    @Override // com.google.android.gms.internal.ads.ts
    public final void z(int i2) {
        tu tuVar = this.f5370m;
        if (tuVar != null) {
            tuVar.D().j(i2);
        }
    }

    @Override // com.google.android.gms.internal.ads.ts, com.google.android.gms.internal.ads.ot
    public final void zzq() {
        Q(this.f9239f.c(), false);
    }
}