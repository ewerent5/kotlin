package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class t20 {
    private final String a;

    /* renamed from: b, reason: collision with root package name */
    private final ef f9060b;

    /* renamed from: c, reason: collision with root package name */
    private final Executor f9061c;

    /* renamed from: d, reason: collision with root package name */
    private y20 f9062d;

    /* renamed from: e, reason: collision with root package name */
    private final ba<Object> f9063e = new q20(this);

    /* renamed from: f, reason: collision with root package name */
    private final ba<Object> f9064f = new s20(this);

    public t20(String str, ef efVar, Executor executor) {
        this.a = str;
        this.f9060b = efVar;
        this.f9061c = executor;
    }

    static /* synthetic */ boolean e(t20 t20Var, Map map) {
        if (map == null) {
            return false;
        }
        String str = (String) map.get("hashCode");
        return !TextUtils.isEmpty(str) && str.equals(t20Var.a);
    }

    public final void a(y20 y20Var) {
        this.f9060b.b("/updateActiveView", this.f9063e);
        this.f9060b.b("/untrackActiveViewUnit", this.f9064f);
        this.f9062d = y20Var;
    }

    public final void b(ew ewVar) {
        ewVar.T("/updateActiveView", this.f9063e);
        ewVar.T("/untrackActiveViewUnit", this.f9064f);
    }

    public final void c(ew ewVar) {
        ewVar.M("/updateActiveView", this.f9063e);
        ewVar.M("/untrackActiveViewUnit", this.f9064f);
    }

    public final void d() {
        this.f9060b.c("/updateActiveView", this.f9063e);
        this.f9060b.c("/untrackActiveViewUnit", this.f9064f);
    }
}