package com.google.android.gms.internal.ads;

import android.view.View;
import android.view.WindowManager;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final /* synthetic */ class in0 implements ba {
    private final nn0 a;

    /* renamed from: b */
    private final WindowManager f6553b;

    /* renamed from: c */
    private final View f6554c;

    in0(nn0 nn0Var, WindowManager windowManager, View view) {
        this.a = nn0Var;
        this.f6553b = windowManager;
        this.f6554c = view;
    }

    @Override // com.google.android.gms.internal.ads.ba
    public final void a(Object obj, Map map) {
        this.a.d(this.f6553b, this.f6554c, (ew) obj, map);
    }
}