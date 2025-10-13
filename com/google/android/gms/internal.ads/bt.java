package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzr;
import com.google.android.gms.ads.internal.zzs;
import java.util.HashMap;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class bt extends FrameLayout implements ss {

    /* renamed from: e, reason: collision with root package name */
    private final lt f5178e;

    /* renamed from: f, reason: collision with root package name */
    private final FrameLayout f5179f;

    /* renamed from: g, reason: collision with root package name */
    private final m4 f5180g;

    /* renamed from: h, reason: collision with root package name */
    private final nt f5181h;

    /* renamed from: i, reason: collision with root package name */
    private final long f5182i;

    /* renamed from: j, reason: collision with root package name */
    private final ts f5183j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f5184k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f5185l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f5186m;
    private boolean n;
    private long o;
    private long p;
    private String q;
    private String[] r;
    private Bitmap s;
    private final ImageView t;
    private boolean u;

    public bt(Context context, lt ltVar, int i2, boolean z, m4 m4Var, kt ktVar) {
        ts cuVar;
        super(context);
        this.f5178e = ltVar;
        this.f5180g = m4Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f5179f = frameLayout;
        addView(frameLayout, new FrameLayout.LayoutParams(-1, -1));
        com.google.android.gms.common.internal.p.j(ltVar.zzk());
        us usVar = ltVar.zzk().zza;
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        if (applicationInfo == null || applicationInfo.targetSdkVersion >= 11) {
            cuVar = i2 == 2 ? new cu(context, new mt(context, ltVar.zzt(), ltVar.zzm(), m4Var, ltVar.zzi()), ltVar, z, us.a(ltVar), ktVar) : new rs(context, ltVar, z, us.a(ltVar), ktVar, new mt(context, ltVar.zzt(), ltVar.zzm(), m4Var, ltVar.zzi()));
        } else {
            cuVar = null;
        }
        this.f5183j = cuVar;
        if (cuVar != null) {
            frameLayout.addView(cuVar, new FrameLayout.LayoutParams(-1, -1, 17));
            if (((Boolean) c.c().b(w3.y)).booleanValue()) {
                e();
            }
        }
        this.t = new ImageView(context);
        this.f5182i = ((Long) c.c().b(w3.C)).longValue();
        boolean zBooleanValue = ((Boolean) c.c().b(w3.A)).booleanValue();
        this.n = zBooleanValue;
        if (m4Var != null) {
            m4Var.d("spinner_used", true != zBooleanValue ? "0" : "1");
        }
        this.f5181h = new nt(this);
        if (cuVar != null) {
            cuVar.g(this);
        }
        if (cuVar == null) {
            c("AdVideoUnderlay Error", "Allocating player failed.");
        }
    }

    private final boolean j() {
        return this.t.getParent() != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k(String str, String... strArr) {
        HashMap map = new HashMap();
        map.put("event", str);
        String str2 = null;
        for (String str3 : strArr) {
            if (str2 == null) {
                str2 = str3;
            } else {
                map.put(str2, str3);
                str2 = null;
            }
        }
        this.f5178e.e0("onVideoEvent", map);
    }

    private final void l() {
        if (this.f5178e.zzj() == null || !this.f5185l || this.f5186m) {
            return;
        }
        this.f5178e.zzj().getWindow().clearFlags(128);
        this.f5185l = false;
    }

    public final void A(int i2) {
        this.f5183j.z(i2);
    }

    public final void B(int i2) {
        this.f5183j.A(i2);
    }

    @Override // com.google.android.gms.internal.ads.ss
    public final void a(int i2, int i3) {
        if (this.n) {
            o3<Integer> o3Var = w3.B;
            int iMax = Math.max(i2 / ((Integer) c.c().b(o3Var)).intValue(), 1);
            int iMax2 = Math.max(i3 / ((Integer) c.c().b(o3Var)).intValue(), 1);
            Bitmap bitmap = this.s;
            if (bitmap != null && bitmap.getWidth() == iMax && this.s.getHeight() == iMax2) {
                return;
            }
            this.s = Bitmap.createBitmap(iMax, iMax2, Bitmap.Config.ARGB_8888);
            this.u = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.ss
    public final void b(String str, String str2) {
        k("exception", "what", "ExoPlayerAdapter exception", "extra", str2);
    }

    @Override // com.google.android.gms.internal.ads.ss
    public final void c(String str, String str2) {
        k("error", "what", str, "extra", str2);
    }

    @TargetApi(14)
    public final void d(MotionEvent motionEvent) {
        ts tsVar = this.f5183j;
        if (tsVar == null) {
            return;
        }
        tsVar.dispatchTouchEvent(motionEvent);
    }

    @TargetApi(14)
    public final void e() {
        ts tsVar = this.f5183j;
        if (tsVar == null) {
            return;
        }
        TextView textView = new TextView(tsVar.getContext());
        String strValueOf = String.valueOf(this.f5183j.a());
        textView.setText(strValueOf.length() != 0 ? "AdMob - ".concat(strValueOf) : new String("AdMob - "));
        textView.setTextColor(-65536);
        textView.setBackgroundColor(-256);
        this.f5179f.addView(textView, new FrameLayout.LayoutParams(-2, -2, 17));
        this.f5179f.bringChildToFront(textView);
    }

    public final void f() {
        this.f5181h.a();
        ts tsVar = this.f5183j;
        if (tsVar != null) {
            tsVar.i();
        }
        l();
    }

    public final void finalize() throws Throwable {
        try {
            this.f5181h.a();
            ts tsVar = this.f5183j;
            if (tsVar != null) {
                qr.f8450e.execute(ws.a(tsVar));
            }
        } finally {
            super.finalize();
        }
    }

    final void g() {
        ts tsVar = this.f5183j;
        if (tsVar == null) {
            return;
        }
        long jM = tsVar.m();
        if (this.o == jM || jM <= 0) {
            return;
        }
        float f2 = jM / 1000.0f;
        if (((Boolean) c.c().b(w3.j1)).booleanValue()) {
            k("timeupdate", "time", String.valueOf(f2), "totalBytes", String.valueOf(this.f5183j.t()), "qoeCachedBytes", String.valueOf(this.f5183j.s()), "qoeLoadedBytes", String.valueOf(this.f5183j.r()), "droppedFrames", String.valueOf(this.f5183j.u()), "reportTime", String.valueOf(zzs.zzj().a()));
        } else {
            k("timeupdate", "time", String.valueOf(f2));
        }
        this.o = jM;
    }

    final /* synthetic */ void h(boolean z) {
        k("windowFocusChanged", "hasWindowFocus", String.valueOf(z));
    }

    public final void m(int i2) {
        this.f5179f.setBackgroundColor(i2);
    }

    public final void n(int i2, int i3, int i4, int i5) {
        if (i4 == 0 || i5 == 0) {
            return;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i4, i5);
        layoutParams.setMargins(i2, i3, 0, 0);
        this.f5179f.setLayoutParams(layoutParams);
        requestLayout();
    }

    public final void o(String str, String[] strArr) {
        this.q = str;
        this.r = strArr;
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(final boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            this.f5181h.b();
        } else {
            this.f5181h.a();
            this.p = this.o;
        }
        zzr.zza.post(new Runnable(this, z) { // from class: com.google.android.gms.internal.ads.xs

            /* renamed from: e, reason: collision with root package name */
            private final bt f10239e;

            /* renamed from: f, reason: collision with root package name */
            private final boolean f10240f;

            {
                this.f10239e = this;
                this.f10240f = z;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f10239e.h(this.f10240f);
            }
        });
    }

    @Override // android.view.View, com.google.android.gms.internal.ads.ss
    public final void onWindowVisibilityChanged(int i2) {
        boolean z;
        super.onWindowVisibilityChanged(i2);
        if (i2 == 0) {
            this.f5181h.b();
            z = true;
        } else {
            this.f5181h.a();
            this.p = this.o;
            z = false;
        }
        zzr.zza.post(new at(this, z));
    }

    public final void p(float f2, float f3) {
        ts tsVar = this.f5183j;
        if (tsVar != null) {
            tsVar.o(f2, f3);
        }
    }

    public final void q() {
        if (this.f5183j == null) {
            return;
        }
        if (TextUtils.isEmpty(this.q)) {
            k("no_src", new String[0]);
        } else {
            this.f5183j.v(this.q, this.r);
        }
    }

    public final void r() {
        ts tsVar = this.f5183j;
        if (tsVar == null) {
            return;
        }
        tsVar.k();
    }

    public final void s() {
        ts tsVar = this.f5183j;
        if (tsVar == null) {
            return;
        }
        tsVar.j();
    }

    public final void t(int i2) {
        ts tsVar = this.f5183j;
        if (tsVar == null) {
            return;
        }
        tsVar.n(i2);
    }

    public final void u() {
        ts tsVar = this.f5183j;
        if (tsVar == null) {
            return;
        }
        tsVar.f9239f.a(true);
        tsVar.zzq();
    }

    public final void v() {
        ts tsVar = this.f5183j;
        if (tsVar == null) {
            return;
        }
        tsVar.f9239f.a(false);
        tsVar.zzq();
    }

    public final void w(float f2) {
        ts tsVar = this.f5183j;
        if (tsVar == null) {
            return;
        }
        tsVar.f9239f.b(f2);
        tsVar.zzq();
    }

    public final void x(int i2) {
        this.f5183j.w(i2);
    }

    public final void y(int i2) {
        this.f5183j.x(i2);
    }

    public final void z(int i2) {
        this.f5183j.y(i2);
    }

    @Override // com.google.android.gms.internal.ads.ss
    public final void zza() {
        this.f5181h.b();
        zzr.zza.post(new ys(this));
    }

    @Override // com.google.android.gms.internal.ads.ss
    public final void zzb() {
        if (this.f5183j != null && this.p == 0) {
            k("canplaythrough", "duration", String.valueOf(r0.l() / 1000.0f), "videoWidth", String.valueOf(this.f5183j.p()), "videoHeight", String.valueOf(this.f5183j.q()));
        }
    }

    @Override // com.google.android.gms.internal.ads.ss
    public final void zzc() {
        if (this.f5178e.zzj() != null && !this.f5185l) {
            boolean z = (this.f5178e.zzj().getWindow().getAttributes().flags & 128) != 0;
            this.f5186m = z;
            if (!z) {
                this.f5178e.zzj().getWindow().addFlags(128);
                this.f5185l = true;
            }
        }
        this.f5184k = true;
    }

    @Override // com.google.android.gms.internal.ads.ss
    public final void zzd() {
        k("pause", new String[0]);
        l();
        this.f5184k = false;
    }

    @Override // com.google.android.gms.internal.ads.ss
    public final void zze() {
        k("ended", new String[0]);
        l();
    }

    @Override // com.google.android.gms.internal.ads.ss
    public final void zzh() {
        if (this.u && this.s != null && !j()) {
            this.t.setImageBitmap(this.s);
            this.t.invalidate();
            this.f5179f.addView(this.t, new FrameLayout.LayoutParams(-1, -1));
            this.f5179f.bringChildToFront(this.t);
        }
        this.f5181h.a();
        this.p = this.o;
        zzr.zza.post(new zs(this));
    }

    @Override // com.google.android.gms.internal.ads.ss
    public final void zzi() {
        if (this.f5184k && j()) {
            this.f5179f.removeView(this.t);
        }
        if (this.s == null) {
            return;
        }
        long jC = zzs.zzj().c();
        if (this.f5183j.getBitmap(this.s) != null) {
            this.u = true;
        }
        long jC2 = zzs.zzj().c() - jC;
        if (zze.zzc()) {
            StringBuilder sb = new StringBuilder(46);
            sb.append("Spinner frame grab took ");
            sb.append(jC2);
            sb.append("ms");
            zze.zza(sb.toString());
        }
        if (jC2 > this.f5182i) {
            er.zzi("Spinner frame grab crossed jank threshold! Suspending spinner.");
            this.n = false;
            this.s = null;
            m4 m4Var = this.f5180g;
            if (m4Var != null) {
                m4Var.d("spinner_jank", Long.toString(jC2));
            }
        }
    }
}