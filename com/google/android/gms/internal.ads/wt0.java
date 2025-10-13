package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class wt0 implements tt1 {

    /* renamed from: e, reason: collision with root package name */
    private final Map<lt1, vt0> f10033e;

    /* renamed from: f, reason: collision with root package name */
    private final w43 f10034f;

    wt0(w43 w43Var, Map<lt1, vt0> map) {
        this.f10033e = map;
        this.f10034f = w43Var;
    }

    @Override // com.google.android.gms.internal.ads.tt1
    public final void A(lt1 lt1Var, String str) {
        if (this.f10033e.containsKey(lt1Var)) {
            this.f10034f.b(this.f10033e.get(lt1Var).f9777b);
        }
    }

    @Override // com.google.android.gms.internal.ads.tt1
    public final void m(lt1 lt1Var, String str) {
    }

    @Override // com.google.android.gms.internal.ads.tt1
    public final void o(lt1 lt1Var, String str) {
        if (this.f10033e.containsKey(lt1Var)) {
            this.f10034f.b(this.f10033e.get(lt1Var).a);
        }
    }

    @Override // com.google.android.gms.internal.ads.tt1
    public final void z(lt1 lt1Var, String str, Throwable th) {
        if (this.f10033e.containsKey(lt1Var)) {
            this.f10034f.b(this.f10033e.get(lt1Var).f9778c);
        }
    }
}