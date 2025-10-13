package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.DialogInterface;
import com.google.android.gms.ads.internal.overlay.zzm;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final /* synthetic */ class c31 implements DialogInterface.OnCancelListener {

    /* renamed from: e */
    private final x21 f5251e;

    /* renamed from: f */
    private final String f5252f;

    /* renamed from: g */
    private final nu0 f5253g;

    /* renamed from: h */
    private final Activity f5254h;

    /* renamed from: i */
    private final cu1 f5255i;

    /* renamed from: j */
    private final zzm f5256j;

    c31(x21 x21Var, String str, nu0 nu0Var, Activity activity, cu1 cu1Var, zzm zzmVar) {
        this.f5251e = x21Var;
        this.f5252f = str;
        this.f5253g = nu0Var;
        this.f5254h = activity;
        this.f5255i = cu1Var;
        this.f5256j = zzmVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        x21 x21Var = this.f5251e;
        String str = this.f5252f;
        nu0 nu0Var = this.f5253g;
        Activity activity = this.f5254h;
        cu1 cu1Var = this.f5255i;
        zzm zzmVar = this.f5256j;
        x21Var.g(str);
        if (nu0Var != null) {
            HashMap map = new HashMap();
            map.put("dialog_action", "dismiss");
            f31.L4(activity, nu0Var, cu1Var, x21Var, str, "dialog_click", map);
        }
        if (zzmVar != null) {
            zzmVar.zzb();
        }
    }
}