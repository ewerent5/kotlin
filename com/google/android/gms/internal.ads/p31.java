package com.google.android.gms.internal.ads;

import android.os.Bundle;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class p31 {

    /* renamed from: c, reason: collision with root package name */
    private xo1 f8079c = null;

    /* renamed from: b, reason: collision with root package name */
    private final Map<String, w93> f8078b = DesugarCollections.synchronizedMap(new HashMap());
    private final List<w93> a = Collections.synchronizedList(new ArrayList());

    public final void a(xo1 xo1Var) {
        String str = xo1Var.v;
        if (this.f8078b.containsKey(str)) {
            return;
        }
        Bundle bundle = new Bundle();
        Iterator<String> itKeys = xo1Var.u.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            try {
                bundle.putString(next, xo1Var.u.getString(next));
            } catch (JSONException unused) {
            }
        }
        w93 w93Var = new w93(xo1Var.D, 0L, null, bundle);
        this.a.add(w93Var);
        this.f8078b.put(str, w93Var);
    }

    public final void b(xo1 xo1Var, long j2, g93 g93Var) {
        String str = xo1Var.v;
        if (this.f8078b.containsKey(str)) {
            if (this.f8079c == null) {
                this.f8079c = xo1Var;
            }
            w93 w93Var = this.f8078b.get(str);
            w93Var.f9934f = j2;
            w93Var.f9935g = g93Var;
        }
    }

    public final ia0 c() {
        return new ia0(this.f8079c, "", this);
    }

    public final List<w93> d() {
        return this.a;
    }
}