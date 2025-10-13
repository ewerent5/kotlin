package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class sm0 implements e6 {
    final /* synthetic */ pn0 a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ViewGroup f8916b;

    sm0(tm0 tm0Var, pn0 pn0Var, ViewGroup viewGroup) {
        this.a = pn0Var;
        this.f8916b = viewGroup;
    }

    @Override // com.google.android.gms.internal.ads.e6
    public final void a(MotionEvent motionEvent) {
        this.a.onTouch(null, motionEvent);
    }

    @Override // com.google.android.gms.internal.ads.e6
    public final void zza() {
        pn0 pn0Var = this.a;
        b22<String> b22Var = pm0.f8197e;
        Map<String, WeakReference<View>> mapZzk = pn0Var.zzk();
        if (mapZzk == null) {
            return;
        }
        int size = b22Var.size();
        int i2 = 0;
        while (i2 < size) {
            int i3 = i2 + 1;
            if (mapZzk.get(b22Var.get(i2)) != null) {
                this.a.onClick(this.f8916b);
                return;
            }
            i2 = i3;
        }
    }

    @Override // com.google.android.gms.internal.ads.e6
    public final JSONObject zzc() {
        return this.a.zzp();
    }
}