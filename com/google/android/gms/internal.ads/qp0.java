package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import com.google.android.gms.ads.internal.util.zzr;
import com.google.android.gms.ads.internal.zzs;
import java.util.Collections;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class qp0 extends lc implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, b6 {

    /* renamed from: e, reason: collision with root package name */
    private View f8420e;

    /* renamed from: f, reason: collision with root package name */
    private n1 f8421f;

    /* renamed from: g, reason: collision with root package name */
    private ol0 f8422g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f8423h = false;

    /* renamed from: i, reason: collision with root package name */
    private boolean f8424i = false;

    public qp0(ol0 ol0Var, tl0 tl0Var) {
        this.f8420e = tl0Var.f();
        this.f8421f = tl0Var.Y();
        this.f8422g = ol0Var;
        if (tl0Var.o() != null) {
            tl0Var.o().C(this);
        }
    }

    private static final void I4(qc qcVar, int i2) {
        try {
            qcVar.j(i2);
        } catch (RemoteException e2) {
            er.zzl("#007 Could not call remote method.", e2);
        }
    }

    private final void zzg() {
        View view = this.f8420e;
        if (view == null) {
            return;
        }
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.f8420e);
        }
    }

    private final void zzh() {
        View view;
        ol0 ol0Var = this.f8422g;
        if (ol0Var == null || (view = this.f8420e) == null) {
            return;
        }
        ol0Var.F(view, Collections.emptyMap(), Collections.emptyMap(), ol0.P(this.f8420e));
    }

    @Override // com.google.android.gms.internal.ads.mc
    public final void i(e.c.b.b.b.b bVar) {
        com.google.android.gms.common.internal.p.e("#008 Must be called on the main UI thread.");
        x2(bVar, new pp0(this));
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        zzh();
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        zzh();
    }

    @Override // com.google.android.gms.internal.ads.mc
    public final void x2(e.c.b.b.b.b bVar, qc qcVar) {
        com.google.android.gms.common.internal.p.e("#008 Must be called on the main UI thread.");
        if (this.f8423h) {
            er.zzf("Instream ad can not be shown after destroy().");
            I4(qcVar, 2);
            return;
        }
        View view = this.f8420e;
        if (view == null || this.f8421f == null) {
            String str = view == null ? "can not get video view." : "can not get video controller.";
            er.zzf(str.length() != 0 ? "Instream internal error: ".concat(str) : new String("Instream internal error: "));
            I4(qcVar, 0);
            return;
        }
        if (this.f8424i) {
            er.zzf("Instream ad should not be used again.");
            I4(qcVar, 1);
            return;
        }
        this.f8424i = true;
        zzg();
        ((ViewGroup) e.c.b.b.b.d.Y(bVar)).addView(this.f8420e, new ViewGroup.LayoutParams(-1, -1));
        zzs.zzz();
        es.a(this.f8420e, this);
        zzs.zzz();
        es.b(this.f8420e, this);
        zzh();
        try {
            qcVar.zze();
        } catch (RemoteException e2) {
            er.zzl("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.b6
    public final void zza() {
        zzr.zza.post(new Runnable(this) { // from class: com.google.android.gms.internal.ads.op0

            /* renamed from: e, reason: collision with root package name */
            private final qp0 f7987e;

            {
                this.f7987e = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                try {
                    this.f7987e.zzc();
                } catch (RemoteException e2) {
                    er.zzl("#007 Could not call remote method.", e2);
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.mc
    public final n1 zzb() {
        com.google.android.gms.common.internal.p.e("#008 Must be called on the main UI thread.");
        if (!this.f8423h) {
            return this.f8421f;
        }
        er.zzf("getVideoController: Instream ad should not be used after destroyed");
        return null;
    }

    @Override // com.google.android.gms.internal.ads.mc
    public final void zzc() {
        com.google.android.gms.common.internal.p.e("#008 Must be called on the main UI thread.");
        zzg();
        ol0 ol0Var = this.f8422g;
        if (ol0Var != null) {
            ol0Var.b();
        }
        this.f8422g = null;
        this.f8420e = null;
        this.f8421f = null;
        this.f8423h = true;
    }

    @Override // com.google.android.gms.internal.ads.mc
    public final q6 zzf() {
        com.google.android.gms.common.internal.p.e("#008 Must be called on the main UI thread.");
        if (this.f8423h) {
            er.zzf("getVideoController: Instream ad should not be used after destroyed");
            return null;
        }
        ol0 ol0Var = this.f8422g;
        if (ol0Var == null || ol0Var.l() == null) {
            return null;
        }
        return this.f8422g.l().a();
    }
}