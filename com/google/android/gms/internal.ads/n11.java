package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class n11 implements tt1 {

    /* renamed from: e, reason: collision with root package name */
    private final Map<lt1, String> f7613e = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    private final Map<lt1, String> f7614f = new HashMap();

    /* renamed from: g, reason: collision with root package name */
    private final bu1 f7615g;

    public n11(Set<m11> set, bu1 bu1Var) {
        this.f7615g = bu1Var;
        for (m11 m11Var : set) {
            this.f7613e.put(m11Var.f7395b, m11Var.a);
            this.f7614f.put(m11Var.f7396c, m11Var.a);
        }
    }

    @Override // com.google.android.gms.internal.ads.tt1
    public final void A(lt1 lt1Var, String str) {
        bu1 bu1Var = this.f7615g;
        String strValueOf = String.valueOf(str);
        bu1Var.e(strValueOf.length() != 0 ? "task.".concat(strValueOf) : new String("task."), "s.");
        if (this.f7614f.containsKey(lt1Var)) {
            bu1 bu1Var2 = this.f7615g;
            String strValueOf2 = String.valueOf(this.f7614f.get(lt1Var));
            bu1Var2.e(strValueOf2.length() != 0 ? "label.".concat(strValueOf2) : new String("label."), "s.");
        }
    }

    @Override // com.google.android.gms.internal.ads.tt1
    public final void m(lt1 lt1Var, String str) {
    }

    @Override // com.google.android.gms.internal.ads.tt1
    public final void o(lt1 lt1Var, String str) {
        bu1 bu1Var = this.f7615g;
        String strValueOf = String.valueOf(str);
        bu1Var.d(strValueOf.length() != 0 ? "task.".concat(strValueOf) : new String("task."));
        if (this.f7613e.containsKey(lt1Var)) {
            bu1 bu1Var2 = this.f7615g;
            String strValueOf2 = String.valueOf(this.f7613e.get(lt1Var));
            bu1Var2.d(strValueOf2.length() != 0 ? "label.".concat(strValueOf2) : new String("label."));
        }
    }

    @Override // com.google.android.gms.internal.ads.tt1
    public final void z(lt1 lt1Var, String str, Throwable th) {
        bu1 bu1Var = this.f7615g;
        String strValueOf = String.valueOf(str);
        bu1Var.e(strValueOf.length() != 0 ? "task.".concat(strValueOf) : new String("task."), "f.");
        if (this.f7614f.containsKey(lt1Var)) {
            bu1 bu1Var2 = this.f7615g;
            String strValueOf2 = String.valueOf(this.f7614f.get(lt1Var));
            bu1Var2.e(strValueOf2.length() != 0 ? "label.".concat(strValueOf2) : new String("label."), "f.");
        }
    }
}