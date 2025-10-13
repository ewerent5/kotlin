package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.google.android.gms.ads.internal.util.zzbn;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzg;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class tm0 {
    private final zzg a;

    /* renamed from: b, reason: collision with root package name */
    private final qp1 f9201b;

    /* renamed from: c, reason: collision with root package name */
    private final zl0 f9202c;

    /* renamed from: d, reason: collision with root package name */
    private final tl0 f9203d;

    /* renamed from: e, reason: collision with root package name */
    private final fn0 f9204e;

    /* renamed from: f, reason: collision with root package name */
    private final nn0 f9205f;

    /* renamed from: g, reason: collision with root package name */
    private final Executor f9206g;

    /* renamed from: h, reason: collision with root package name */
    private final Executor f9207h;

    /* renamed from: i, reason: collision with root package name */
    private final g6 f9208i;

    /* renamed from: j, reason: collision with root package name */
    private final ql0 f9209j;

    public tm0(zzg zzgVar, qp1 qp1Var, zl0 zl0Var, tl0 tl0Var, fn0 fn0Var, nn0 nn0Var, Executor executor, Executor executor2, ql0 ql0Var) {
        this.a = zzgVar;
        this.f9201b = qp1Var;
        this.f9208i = qp1Var.f8432i;
        this.f9202c = zl0Var;
        this.f9203d = tl0Var;
        this.f9204e = fn0Var;
        this.f9205f = nn0Var;
        this.f9206g = executor;
        this.f9207h = executor2;
        this.f9209j = ql0Var;
    }

    private static void g(RelativeLayout.LayoutParams layoutParams, int i2) {
        if (i2 == 0) {
            layoutParams.addRule(10);
            layoutParams.addRule(9);
        } else if (i2 == 2) {
            layoutParams.addRule(12);
            layoutParams.addRule(11);
        } else if (i2 != 3) {
            layoutParams.addRule(10);
            layoutParams.addRule(11);
        } else {
            layoutParams.addRule(12);
            layoutParams.addRule(9);
        }
    }

    public final void a(final pn0 pn0Var) {
        this.f9206g.execute(new Runnable(this, pn0Var) { // from class: com.google.android.gms.internal.ads.qm0

            /* renamed from: e, reason: collision with root package name */
            private final tm0 f8410e;

            /* renamed from: f, reason: collision with root package name */
            private final pn0 f8411f;

            {
                this.f8410e = this;
                this.f8411f = pn0Var;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f8410e.f(this.f8411f);
            }
        });
    }

    public final void b(pn0 pn0Var) {
        if (pn0Var == null || this.f9204e == null || pn0Var.R() == null || !this.f9202c.b()) {
            return;
        }
        try {
            pn0Var.R().addView(this.f9204e.a());
        } catch (pw e2) {
            zze.zzb("web view can not be obtained", e2);
        }
    }

    public final void c(pn0 pn0Var) {
        if (pn0Var == null) {
            return;
        }
        Context context = pn0Var.Y().getContext();
        if (zzbn.zzi(context, this.f9202c.a)) {
            if (!(context instanceof Activity)) {
                er.zzd("Activity context is needed for policy validator.");
                return;
            }
            if (this.f9205f == null || pn0Var.R() == null) {
                return;
            }
            try {
                WindowManager windowManager = (WindowManager) context.getSystemService("window");
                windowManager.addView(this.f9205f.a(pn0Var.R(), windowManager), zzbn.zzj());
            } catch (pw e2) {
                zze.zzb("web view can not be obtained", e2);
            }
        }
    }

    public final boolean d(ViewGroup viewGroup) {
        View viewF = this.f9203d.f();
        if (viewF == null) {
            return false;
        }
        viewGroup.removeAllViews();
        if (viewF.getParent() instanceof ViewGroup) {
            ((ViewGroup) viewF.getParent()).removeView(viewF);
        }
        viewGroup.addView(viewF, ((Boolean) c.c().b(w3.e2)).booleanValue() ? new FrameLayout.LayoutParams(-1, -1, 17) : new FrameLayout.LayoutParams(-2, -2, 17));
        return true;
    }

    final /* synthetic */ void e(ViewGroup viewGroup) {
        boolean z = viewGroup != null;
        if (this.f9203d.f() != null) {
            if (this.f9203d.X() == 2 || this.f9203d.X() == 1) {
                this.a.zzv(this.f9201b.f8429f, String.valueOf(this.f9203d.X()), z);
            } else if (this.f9203d.X() == 6) {
                this.a.zzv(this.f9201b.f8429f, "2", z);
                this.a.zzv(this.f9201b.f8429f, "1", z);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x016f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final /* synthetic */ void f(com.google.android.gms.internal.ads.pn0 r8) {
        /*
            Method dump skipped, instructions count: 390
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.tm0.f(com.google.android.gms.internal.ads.pn0):void");
    }
}