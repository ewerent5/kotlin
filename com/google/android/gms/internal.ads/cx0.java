package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class cx0 {
    private final qw0 a;

    /* renamed from: b, reason: collision with root package name */
    private final gs0 f5383b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f5384c = new Object();

    /* renamed from: d, reason: collision with root package name */
    private final List<bx0> f5385d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    private boolean f5386e;

    cx0(qw0 qw0Var, gs0 gs0Var) {
        this.a = qw0Var;
        this.f5383b = gs0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d(List<xb> list) {
        gi giVar;
        synchronized (this.f5384c) {
            if (this.f5386e) {
                return;
            }
            for (xb xbVar : list) {
                List<bx0> list2 = this.f5385d;
                String str = xbVar.f10149e;
                fs0 fs0VarC = this.f5383b.c(str);
                String string = (fs0VarC == null || (giVar = fs0VarC.f5940b) == null) ? "" : giVar.toString();
                list2.add(new bx0(str, string, xbVar.f10150f ? 1 : 0, xbVar.f10152h, xbVar.f10151g));
            }
            this.f5386e = true;
        }
    }

    public final void a() {
        this.a.b(new ax0(this));
    }

    public final JSONArray b() {
        JSONArray jSONArray = new JSONArray();
        synchronized (this.f5384c) {
            if (!this.f5386e) {
                if (!this.a.e()) {
                    a();
                    return jSONArray;
                }
                d(this.a.d());
            }
            Iterator<bx0> it = this.f5385d.iterator();
            while (it.hasNext()) {
                jSONArray.put(it.next().a());
            }
            return jSONArray;
        }
    }
}