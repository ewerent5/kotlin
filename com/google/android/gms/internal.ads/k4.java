package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
@ParametersAreNonnullByDefault
@Deprecated
/* loaded from: classes.dex */
public final class k4 {
    private final Map<String, j4> a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final m4 f6949b;

    public k4(m4 m4Var) {
        this.f6949b = m4Var;
    }

    public final void a(String str, j4 j4Var) {
        this.a.put(str, j4Var);
    }

    public final void b(String str, String str2, long j2) {
        m4 m4Var = this.f6949b;
        j4 j4Var = this.a.get(str2);
        String[] strArr = {str};
        if (j4Var != null) {
            m4Var.b(j4Var, j2, strArr);
        }
        this.a.put(str, new j4(j2, null, null));
    }

    public final m4 c() {
        return this.f6949b;
    }
}