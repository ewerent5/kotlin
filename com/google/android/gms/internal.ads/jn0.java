package com.google.android.gms.internal.ads;

import android.view.View;
import android.view.WindowManager;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final /* synthetic */ class jn0 implements ba {
    private final nn0 a;

    /* renamed from: b */
    private final View f6783b;

    /* renamed from: c */
    private final WindowManager f6784c;

    jn0(nn0 nn0Var, View view, WindowManager windowManager) {
        this.a = nn0Var;
        this.f6783b = view;
        this.f6784c = windowManager;
    }

    @Override // com.google.android.gms.internal.ads.ba
    public final void a(Object obj, Map map) throws NumberFormatException {
        this.a.b(this.f6783b, this.f6784c, (ew) obj, map);
    }
}