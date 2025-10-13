package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.a;
import java.util.Set;

/* loaded from: classes.dex */
public final class u extends e.c.b.b.d.b.d implements com.google.android.gms.common.api.f, com.google.android.gms.common.api.g {

    /* renamed from: e, reason: collision with root package name */
    private static a.AbstractC0109a<? extends e.c.b.b.d.f, e.c.b.b.d.a> f4609e = e.c.b.b.d.c.f15003c;

    /* renamed from: f, reason: collision with root package name */
    private final Context f4610f;

    /* renamed from: g, reason: collision with root package name */
    private final Handler f4611g;

    /* renamed from: h, reason: collision with root package name */
    private final a.AbstractC0109a<? extends e.c.b.b.d.f, e.c.b.b.d.a> f4612h;

    /* renamed from: i, reason: collision with root package name */
    private Set<Scope> f4613i;

    /* renamed from: j, reason: collision with root package name */
    private com.google.android.gms.common.internal.c f4614j;

    /* renamed from: k, reason: collision with root package name */
    private e.c.b.b.d.f f4615k;

    /* renamed from: l, reason: collision with root package name */
    private x f4616l;

    public u(Context context, Handler handler, com.google.android.gms.common.internal.c cVar) {
        this(context, handler, cVar, f4609e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void M4(e.c.b.b.d.b.k kVar) {
        com.google.android.gms.common.b bVarC = kVar.c();
        if (bVarC.L()) {
            com.google.android.gms.common.internal.r rVarI = kVar.I();
            com.google.android.gms.common.b bVarI = rVarI.I();
            if (!bVarI.L()) {
                String strValueOf = String.valueOf(bVarI);
                StringBuilder sb = new StringBuilder(strValueOf.length() + 48);
                sb.append("Sign-in succeeded with resolve account failure: ");
                sb.append(strValueOf);
                Log.wtf("SignInCoordinator", sb.toString(), new Exception());
                this.f4616l.c(bVarI);
                this.f4615k.disconnect();
                return;
            }
            this.f4616l.b(rVarI.c(), this.f4613i);
        } else {
            this.f4616l.c(bVarC);
        }
        this.f4615k.disconnect();
    }

    @Override // e.c.b.b.d.b.e
    public final void A0(e.c.b.b.d.b.k kVar) {
        this.f4611g.post(new w(this, kVar));
    }

    public final void K4(x xVar) {
        e.c.b.b.d.f fVar = this.f4615k;
        if (fVar != null) {
            fVar.disconnect();
        }
        this.f4614j.i(Integer.valueOf(System.identityHashCode(this)));
        a.AbstractC0109a<? extends e.c.b.b.d.f, e.c.b.b.d.a> abstractC0109a = this.f4612h;
        Context context = this.f4610f;
        Looper looper = this.f4611g.getLooper();
        com.google.android.gms.common.internal.c cVar = this.f4614j;
        this.f4615k = (e.c.b.b.d.f) abstractC0109a.a(context, looper, cVar, cVar.h(), this, this);
        this.f4616l = xVar;
        Set<Scope> set = this.f4613i;
        if (set == null || set.isEmpty()) {
            this.f4611g.post(new v(this));
        } else {
            this.f4615k.a();
        }
    }

    public final void L4() {
        e.c.b.b.d.f fVar = this.f4615k;
        if (fVar != null) {
            fVar.disconnect();
        }
    }

    @Override // com.google.android.gms.common.api.f
    public final void R(int i2) {
        this.f4615k.disconnect();
    }

    @Override // com.google.android.gms.common.api.g
    public final void U(com.google.android.gms.common.b bVar) {
        this.f4616l.c(bVar);
    }

    @Override // com.google.android.gms.common.api.f
    public final void Y(Bundle bundle) {
        this.f4615k.b(this);
    }

    public u(Context context, Handler handler, com.google.android.gms.common.internal.c cVar, a.AbstractC0109a<? extends e.c.b.b.d.f, e.c.b.b.d.a> abstractC0109a) {
        this.f4610f = context;
        this.f4611g = handler;
        this.f4614j = (com.google.android.gms.common.internal.c) com.google.android.gms.common.internal.p.k(cVar, "ClientSettings must not be null");
        this.f4613i = cVar.g();
        this.f4612h = abstractC0109a;
    }
}