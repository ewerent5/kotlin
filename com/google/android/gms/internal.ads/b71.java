package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class b71 {
    private final com.google.android.gms.common.util.f a;

    /* renamed from: b, reason: collision with root package name */
    private final c71 f5079b;

    /* renamed from: c, reason: collision with root package name */
    private final List<String> f5080c = Collections.synchronizedList(new ArrayList());

    /* renamed from: d, reason: collision with root package name */
    private final boolean f5081d = ((Boolean) c.c().b(w3.R4)).booleanValue();

    /* renamed from: e, reason: collision with root package name */
    private final p31 f5082e;

    public b71(com.google.android.gms.common.util.f fVar, c71 c71Var, p31 p31Var) {
        this.a = fVar;
        this.f5079b = c71Var;
        this.f5082e = p31Var;
    }

    static /* synthetic */ void d(b71 b71Var, String str, int i2, long j2, String str2) {
        StringBuilder sb = new StringBuilder(str.length() + 33);
        sb.append(str);
        sb.append(".");
        sb.append(i2);
        sb.append(".");
        sb.append(j2);
        String string = sb.toString();
        if (!TextUtils.isEmpty(str2)) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(string).length() + 1 + String.valueOf(str2).length());
            sb2.append(string);
            sb2.append(".");
            sb2.append(str2);
            string = sb2.toString();
        }
        b71Var.f5080c.add(string);
    }

    final <T> g52<T> a(ap1 ap1Var, xo1 xo1Var, g52<T> g52Var) {
        long jC = this.a.c();
        String str = xo1Var.v;
        if (str != null) {
            y42.o(g52Var, new a71(this, jC, str, xo1Var, ap1Var), qr.f8451f);
        }
        return g52Var;
    }

    public final String b() {
        return TextUtils.join("_", this.f5080c);
    }
}