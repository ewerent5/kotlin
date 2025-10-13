package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.DialogInterface;
import com.google.android.gms.ads.internal.overlay.zzm;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final /* synthetic */ class b31 implements DialogInterface.OnClickListener {

    /* renamed from: e */
    private final x21 f5056e;

    /* renamed from: f */
    private final String f5057f;

    /* renamed from: g */
    private final nu0 f5058g;

    /* renamed from: h */
    private final Activity f5059h;

    /* renamed from: i */
    private final cu1 f5060i;

    /* renamed from: j */
    private final zzm f5061j;

    b31(x21 x21Var, String str, nu0 nu0Var, Activity activity, cu1 cu1Var, zzm zzmVar) {
        this.f5056e = x21Var;
        this.f5057f = str;
        this.f5058g = nu0Var;
        this.f5059h = activity;
        this.f5060i = cu1Var;
        this.f5061j = zzmVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i2) {
        x21 x21Var = this.f5056e;
        String str = this.f5057f;
        nu0 nu0Var = this.f5058g;
        Activity activity = this.f5059h;
        cu1 cu1Var = this.f5060i;
        zzm zzmVar = this.f5061j;
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