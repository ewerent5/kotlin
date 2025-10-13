package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zze;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class j30 implements v13 {

    /* renamed from: e, reason: collision with root package name */
    private ew f6665e;

    /* renamed from: f, reason: collision with root package name */
    private final Executor f6666f;

    /* renamed from: g, reason: collision with root package name */
    private final u20 f6667g;

    /* renamed from: h, reason: collision with root package name */
    private final com.google.android.gms.common.util.f f6668h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f6669i = false;

    /* renamed from: j, reason: collision with root package name */
    private boolean f6670j = false;

    /* renamed from: k, reason: collision with root package name */
    private final x20 f6671k = new x20();

    public j30(Executor executor, u20 u20Var, com.google.android.gms.common.util.f fVar) {
        this.f6666f = executor;
        this.f6667g = u20Var;
        this.f6668h = fVar;
    }

    private final void m() {
        try {
            final JSONObject jSONObjectA = this.f6667g.zzb(this.f6671k);
            if (this.f6665e != null) {
                this.f6666f.execute(new Runnable(this, jSONObjectA) { // from class: com.google.android.gms.internal.ads.i30

                    /* renamed from: e, reason: collision with root package name */
                    private final j30 f6468e;

                    /* renamed from: f, reason: collision with root package name */
                    private final JSONObject f6469f;

                    {
                        this.f6468e = this;
                        this.f6469f = jSONObjectA;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f6468e.f(this.f6469f);
                    }
                });
            }
        } catch (JSONException e2) {
            zze.zzb("Failed to call video active view js", e2);
        }
    }

    public final void a(ew ewVar) {
        this.f6665e = ewVar;
    }

    public final void b() {
        this.f6669i = false;
    }

    public final void c() {
        this.f6669i = true;
        m();
    }

    @Override // com.google.android.gms.internal.ads.v13
    public final void c0(u13 u13Var) {
        x20 x20Var = this.f6671k;
        x20Var.a = this.f6670j ? false : u13Var.f9355j;
        x20Var.f10106d = this.f6668h.c();
        this.f6671k.f10108f = u13Var;
        if (this.f6669i) {
            m();
        }
    }

    public final void d(boolean z) {
        this.f6670j = z;
    }

    final /* synthetic */ void f(JSONObject jSONObject) {
        this.f6665e.j0("AFMA_updateActiveView", jSONObject);
    }
}