package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class gs0 {

    @GuardedBy("this")
    private final Map<String, fs0> a = new HashMap();

    gs0() {
    }

    final synchronized void a(String str, hq1 hq1Var) {
        if (this.a.containsKey(str)) {
            return;
        }
        try {
            this.a.put(str, new fs0(str, hq1Var.C(), hq1Var.a()));
        } catch (vp1 unused) {
        }
    }

    final synchronized void b(String str, th thVar) {
        if (this.a.containsKey(str)) {
            return;
        }
        try {
            this.a.put(str, new fs0(str, thVar.zzf(), thVar.zzg()));
        } catch (Throwable unused) {
        }
    }

    @Nullable
    public final synchronized fs0 c(String str) {
        return this.a.get(str);
    }

    @Nullable
    public final fs0 d(List<String> list) {
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            fs0 fs0VarC = c(it.next());
            if (fs0VarC != null) {
                return fs0VarC;
            }
        }
        return null;
    }
}