package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.ads.internal.zzs;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class sn0 implements cm0 {
    private final ig a;

    /* renamed from: b, reason: collision with root package name */
    private final gb0 f8919b;

    /* renamed from: c, reason: collision with root package name */
    private final oa0 f8920c;

    /* renamed from: d, reason: collision with root package name */
    private final Context f8921d;

    /* renamed from: e, reason: collision with root package name */
    private final xo1 f8922e;

    /* renamed from: f, reason: collision with root package name */
    private final kr f8923f;

    /* renamed from: g, reason: collision with root package name */
    private final qp1 f8924g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f8925h = false;

    /* renamed from: i, reason: collision with root package name */
    private boolean f8926i = false;

    /* renamed from: j, reason: collision with root package name */
    private boolean f8927j = true;

    /* renamed from: k, reason: collision with root package name */
    private final eg f8928k;

    /* renamed from: l, reason: collision with root package name */
    private final fg f8929l;

    public sn0(eg egVar, fg fgVar, ig igVar, gb0 gb0Var, oa0 oa0Var, Context context, xo1 xo1Var, kr krVar, qp1 qp1Var, byte[] bArr) {
        this.f8928k = egVar;
        this.f8929l = fgVar;
        this.a = igVar;
        this.f8919b = gb0Var;
        this.f8920c = oa0Var;
        this.f8921d = context;
        this.f8922e = xo1Var;
        this.f8923f = krVar;
        this.f8924g = qp1Var;
    }

    private final void o(View view) {
        try {
            ig igVar = this.a;
            if (igVar != null && !igVar.zzu()) {
                this.a.B(e.c.b.b.b.d.m4(view));
                this.f8920c.onAdClicked();
                return;
            }
            eg egVar = this.f8928k;
            if (egVar != null && !egVar.zzq()) {
                this.f8928k.zzn(e.c.b.b.b.d.m4(view));
                this.f8920c.onAdClicked();
                return;
            }
            fg fgVar = this.f8929l;
            if (fgVar == null || fgVar.a()) {
                return;
            }
            this.f8929l.t4(e.c.b.b.b.d.m4(view));
            this.f8920c.onAdClicked();
        } catch (RemoteException e2) {
            er.zzj("Failed to call handleClick", e2);
        }
    }

    private static final HashMap<String, View> p(Map<String, WeakReference<View>> map) {
        HashMap<String, View> map2 = new HashMap<>();
        if (map == null) {
            return map2;
        }
        synchronized (map) {
            for (Map.Entry<String, WeakReference<View>> entry : map.entrySet()) {
                View view = entry.getValue().get();
                if (view != null) {
                    map2.put(entry.getKey(), view);
                }
            }
        }
        return map2;
    }

    @Override // com.google.android.gms.internal.ads.cm0
    public final void O(String str) {
    }

    @Override // com.google.android.gms.internal.ads.cm0
    public final void a(View view, MotionEvent motionEvent, View view2) {
    }

    @Override // com.google.android.gms.internal.ads.cm0
    public final void b(s0 s0Var) {
        er.zzi("Mute This Ad is not supported for 3rd party ads");
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00ce A[Catch: JSONException -> 0x0045, RemoteException -> 0x0124, TRY_LEAVE, TryCatch #0 {JSONException -> 0x0045, blocks: (B:48:0x00b3, B:49:0x00c8, B:51:0x00ce), top: B:72:0x00b3 }] */
    @Override // com.google.android.gms.internal.ads.cm0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(android.view.View r9, java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r10, java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r11, android.view.View.OnTouchListener r12, android.view.View.OnClickListener r13) {
        /*
            Method dump skipped, instructions count: 299
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.sn0.c(android.view.View, java.util.Map, java.util.Map, android.view.View$OnTouchListener, android.view.View$OnClickListener):void");
    }

    @Override // com.google.android.gms.internal.ads.cm0
    public final void d(View view, Map<String, WeakReference<View>> map) {
        try {
            e.c.b.b.b.b bVarM4 = e.c.b.b.b.d.m4(view);
            ig igVar = this.a;
            if (igVar != null) {
                igVar.m1(bVarM4);
                return;
            }
            eg egVar = this.f8928k;
            if (egVar != null) {
                egVar.Y(bVarM4);
                return;
            }
            fg fgVar = this.f8929l;
            if (fgVar != null) {
                fgVar.y1(bVarM4);
            }
        } catch (RemoteException e2) {
            er.zzj("Failed to call untrackView", e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.cm0
    public final void e(View view, View view2, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, boolean z) {
        if (this.f8926i && this.f8922e.G) {
            return;
        }
        o(view);
    }

    @Override // com.google.android.gms.internal.ads.cm0
    public final JSONObject f(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2) {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.cm0
    public final void g(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2) {
        try {
            if (!this.f8925h) {
                this.f8925h = zzs.zzm().zzc(this.f8921d, this.f8923f.f7054e, this.f8922e.B.toString(), this.f8924g.f8429f);
            }
            if (this.f8927j) {
                ig igVar = this.a;
                if (igVar != null && !igVar.zzt()) {
                    this.a.zzv();
                    this.f8919b.zza();
                    return;
                }
                eg egVar = this.f8928k;
                if (egVar != null && !egVar.zzp()) {
                    this.f8928k.zzm();
                    this.f8919b.zza();
                    return;
                }
                fg fgVar = this.f8929l;
                if (fgVar == null || fgVar.zzn()) {
                    return;
                }
                this.f8929l.zzk();
                this.f8919b.zza();
            }
        } catch (RemoteException e2) {
            er.zzj("Failed to call recordImpression", e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.cm0
    public final void h(View view) {
    }

    @Override // com.google.android.gms.internal.ads.cm0
    public final void i(l8 l8Var) {
    }

    @Override // com.google.android.gms.internal.ads.cm0
    public final boolean j(Bundle bundle) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.cm0
    public final void k(Bundle bundle) {
    }

    @Override // com.google.android.gms.internal.ads.cm0
    public final void l(Bundle bundle) {
    }

    @Override // com.google.android.gms.internal.ads.cm0
    public final void m(w0 w0Var) {
        er.zzi("Mute This Ad is not supported for 3rd party ads");
    }

    @Override // com.google.android.gms.internal.ads.cm0
    public final void n(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, boolean z) {
        if (!this.f8926i) {
            er.zzi("Custom click reporting for 3p ads failed. enableCustomClickGesture is not set.");
        } else if (this.f8922e.G) {
            o(view);
        } else {
            er.zzi("Custom click reporting for 3p ads failed. Ad unit id not in allow list.");
        }
    }

    @Override // com.google.android.gms.internal.ads.cm0
    public final void zzg() {
        this.f8926i = true;
    }

    @Override // com.google.android.gms.internal.ads.cm0
    public final boolean zzh() {
        return this.f8922e.G;
    }

    @Override // com.google.android.gms.internal.ads.cm0
    public final void zzm() {
    }

    @Override // com.google.android.gms.internal.ads.cm0
    public final void zzp() {
    }

    @Override // com.google.android.gms.internal.ads.cm0
    public final void zzs() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.cm0
    public final void zzu() {
    }

    @Override // com.google.android.gms.internal.ads.cm0
    public final void zzw() {
    }
}