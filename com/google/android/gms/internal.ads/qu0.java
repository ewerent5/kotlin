package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class qu0 implements tt1 {

    /* renamed from: f, reason: collision with root package name */
    private final ju0 f8471f;

    /* renamed from: g, reason: collision with root package name */
    private final com.google.android.gms.common.util.f f8472g;

    /* renamed from: e, reason: collision with root package name */
    private final Map<lt1, Long> f8470e = new HashMap();

    /* renamed from: h, reason: collision with root package name */
    private final Map<lt1, pu0> f8473h = new HashMap();

    public qu0(ju0 ju0Var, Set<pu0> set, com.google.android.gms.common.util.f fVar) {
        this.f8471f = ju0Var;
        for (pu0 pu0Var : set) {
            this.f8473h.put(pu0Var.f8270c, pu0Var);
        }
        this.f8472g = fVar;
    }

    private final void a(lt1 lt1Var, boolean z) {
        lt1 lt1Var2 = this.f8473h.get(lt1Var).f8269b;
        String str = true != z ? "f." : "s.";
        if (this.f8470e.containsKey(lt1Var2)) {
            long jC = this.f8472g.c() - this.f8470e.get(lt1Var2).longValue();
            Map<String, String> mapC = this.f8471f.c();
            String str2 = this.f8473h.get(lt1Var).a;
            String strConcat = str2.length() != 0 ? "label.".concat(str2) : new String("label.");
            String strValueOf = String.valueOf(Long.toString(jC));
            mapC.put(strConcat, strValueOf.length() != 0 ? str.concat(strValueOf) : new String(str));
        }
    }

    @Override // com.google.android.gms.internal.ads.tt1
    public final void A(lt1 lt1Var, String str) {
        if (this.f8470e.containsKey(lt1Var)) {
            long jC = this.f8472g.c() - this.f8470e.get(lt1Var).longValue();
            Map<String, String> mapC = this.f8471f.c();
            String strValueOf = String.valueOf(str);
            String strConcat = strValueOf.length() != 0 ? "task.".concat(strValueOf) : new String("task.");
            String strValueOf2 = String.valueOf(Long.toString(jC));
            mapC.put(strConcat, strValueOf2.length() != 0 ? "s.".concat(strValueOf2) : new String("s."));
        }
        if (this.f8473h.containsKey(lt1Var)) {
            a(lt1Var, true);
        }
    }

    @Override // com.google.android.gms.internal.ads.tt1
    public final void m(lt1 lt1Var, String str) {
    }

    @Override // com.google.android.gms.internal.ads.tt1
    public final void o(lt1 lt1Var, String str) {
        this.f8470e.put(lt1Var, Long.valueOf(this.f8472g.c()));
    }

    @Override // com.google.android.gms.internal.ads.tt1
    public final void z(lt1 lt1Var, String str, Throwable th) {
        if (this.f8470e.containsKey(lt1Var)) {
            long jC = this.f8472g.c() - this.f8470e.get(lt1Var).longValue();
            Map<String, String> mapC = this.f8471f.c();
            String strValueOf = String.valueOf(str);
            String strConcat = strValueOf.length() != 0 ? "task.".concat(strValueOf) : new String("task.");
            String strValueOf2 = String.valueOf(Long.toString(jC));
            mapC.put(strConcat, strValueOf2.length() != 0 ? "f.".concat(strValueOf2) : new String("f."));
        }
        if (this.f8473h.containsKey(lt1Var)) {
            a(lt1Var, false);
        }
    }
}