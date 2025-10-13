package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.util.DynamiteApi;
import e.c.b.b.c.e.ec;
import e.c.b.b.c.e.sf;
import e.c.b.b.c.e.uf;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-sdk@@18.0.0 */
@DynamiteApi
/* loaded from: classes.dex */
public class AppMeasurementDynamiteService extends sf {

    /* renamed from: e, reason: collision with root package name */
    z4 f10736e = null;

    /* renamed from: f, reason: collision with root package name */
    private final Map<Integer, f6> f10737f = new c.e.a();

    /* compiled from: com.google.android.gms:play-services-measurement-sdk@@18.0.0 */
    class a implements c6 {
        private e.c.b.b.c.e.c a;

        a(e.c.b.b.c.e.c cVar) {
            this.a = cVar;
        }

        @Override // com.google.android.gms.measurement.internal.c6
        public final void a(String str, String str2, Bundle bundle, long j2) {
            try {
                this.a.J2(str, str2, bundle, j2);
            } catch (RemoteException e2) {
                AppMeasurementDynamiteService.this.f10736e.zzq().D().b("Event interceptor threw exception", e2);
            }
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement-sdk@@18.0.0 */
    class b implements f6 {
        private e.c.b.b.c.e.c a;

        b(e.c.b.b.c.e.c cVar) {
            this.a = cVar;
        }

        @Override // com.google.android.gms.measurement.internal.f6
        public final void a(String str, String str2, Bundle bundle, long j2) {
            try {
                this.a.J2(str, str2, bundle, j2);
            } catch (RemoteException e2) {
                AppMeasurementDynamiteService.this.f10736e.zzq().D().b("Event listener threw exception", e2);
            }
        }
    }

    private final void U() {
        if (this.f10736e == null) {
            throw new IllegalStateException("Attempting to perform action before initialize.");
        }
    }

    private final void Y(uf ufVar, String str) {
        this.f10736e.B().M(ufVar, str);
    }

    @Override // e.c.b.b.c.e.tf
    public void beginAdUnitExposure(String str, long j2) {
        U();
        this.f10736e.N().u(str, j2);
    }

    @Override // e.c.b.b.c.e.tf
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        U();
        this.f10736e.A().p0(str, str2, bundle);
    }

    @Override // e.c.b.b.c.e.tf
    public void clearMeasurementEnabled(long j2) {
        U();
        this.f10736e.A().L(null);
    }

    @Override // e.c.b.b.c.e.tf
    public void endAdUnitExposure(String str, long j2) {
        U();
        this.f10736e.N().y(str, j2);
    }

    @Override // e.c.b.b.c.e.tf
    public void generateEventId(uf ufVar) {
        U();
        this.f10736e.B().K(ufVar, this.f10736e.B().z0());
    }

    @Override // e.c.b.b.c.e.tf
    public void getAppInstanceId(uf ufVar) {
        U();
        this.f10736e.zzp().u(new g6(this, ufVar));
    }

    @Override // e.c.b.b.c.e.tf
    public void getCachedAppInstanceId(uf ufVar) {
        U();
        Y(ufVar, this.f10736e.A().d0());
    }

    @Override // e.c.b.b.c.e.tf
    public void getConditionalUserProperties(String str, String str2, uf ufVar) {
        U();
        this.f10736e.zzp().u(new h9(this, ufVar, str, str2));
    }

    @Override // e.c.b.b.c.e.tf
    public void getCurrentScreenClass(uf ufVar) {
        U();
        Y(ufVar, this.f10736e.A().g0());
    }

    @Override // e.c.b.b.c.e.tf
    public void getCurrentScreenName(uf ufVar) {
        U();
        Y(ufVar, this.f10736e.A().f0());
    }

    @Override // e.c.b.b.c.e.tf
    public void getGmpAppId(uf ufVar) {
        U();
        Y(ufVar, this.f10736e.A().h0());
    }

    @Override // e.c.b.b.c.e.tf
    public void getMaxUserProperties(String str, uf ufVar) {
        U();
        this.f10736e.A();
        com.google.android.gms.common.internal.p.f(str);
        this.f10736e.B().J(ufVar, 25);
    }

    @Override // e.c.b.b.c.e.tf
    public void getTestFlag(uf ufVar, int i2) {
        U();
        if (i2 == 0) {
            this.f10736e.B().M(ufVar, this.f10736e.A().Z());
            return;
        }
        if (i2 == 1) {
            this.f10736e.B().K(ufVar, this.f10736e.A().a0().longValue());
            return;
        }
        if (i2 != 2) {
            if (i2 == 3) {
                this.f10736e.B().J(ufVar, this.f10736e.A().b0().intValue());
                return;
            } else {
                if (i2 != 4) {
                    return;
                }
                this.f10736e.B().O(ufVar, this.f10736e.A().Y().booleanValue());
                return;
            }
        }
        da daVarB = this.f10736e.B();
        double dDoubleValue = this.f10736e.A().c0().doubleValue();
        Bundle bundle = new Bundle();
        bundle.putDouble("r", dDoubleValue);
        try {
            ufVar.w(bundle);
        } catch (RemoteException e2) {
            daVarB.a.zzq().D().b("Error returning double value to wrapper", e2);
        }
    }

    @Override // e.c.b.b.c.e.tf
    public void getUserProperties(String str, String str2, boolean z, uf ufVar) {
        U();
        this.f10736e.zzp().u(new g7(this, ufVar, str, str2, z));
    }

    @Override // e.c.b.b.c.e.tf
    public void initForTests(Map map) {
        U();
    }

    @Override // e.c.b.b.c.e.tf
    public void initialize(e.c.b.b.b.b bVar, e.c.b.b.c.e.f fVar, long j2) {
        Context context = (Context) e.c.b.b.b.d.Y(bVar);
        z4 z4Var = this.f10736e;
        if (z4Var == null) {
            this.f10736e = z4.b(context, fVar, Long.valueOf(j2));
        } else {
            z4Var.zzq().D().a("Attempting to initialize multiple times");
        }
    }

    @Override // e.c.b.b.c.e.tf
    public void isDataCollectionEnabled(uf ufVar) {
        U();
        this.f10736e.zzp().u(new ja(this, ufVar));
    }

    @Override // e.c.b.b.c.e.tf
    public void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j2) {
        U();
        this.f10736e.A().T(str, str2, bundle, z, z2, j2);
    }

    @Override // e.c.b.b.c.e.tf
    public void logEventAndBundle(String str, String str2, Bundle bundle, uf ufVar, long j2) {
        U();
        com.google.android.gms.common.internal.p.f(str2);
        (bundle != null ? new Bundle(bundle) : new Bundle()).putString("_o", "app");
        this.f10736e.zzp().u(new g8(this, ufVar, new r(str2, new q(bundle), "app", j2), str));
    }

    @Override // e.c.b.b.c.e.tf
    public void logHealthData(int i2, String str, e.c.b.b.b.b bVar, e.c.b.b.b.b bVar2, e.c.b.b.b.b bVar3) {
        U();
        this.f10736e.zzq().w(i2, true, false, str, bVar == null ? null : e.c.b.b.b.d.Y(bVar), bVar2 == null ? null : e.c.b.b.b.d.Y(bVar2), bVar3 != null ? e.c.b.b.b.d.Y(bVar3) : null);
    }

    @Override // e.c.b.b.c.e.tf
    public void onActivityCreated(e.c.b.b.b.b bVar, Bundle bundle, long j2) {
        U();
        e7 e7Var = this.f10736e.A().f10937c;
        if (e7Var != null) {
            this.f10736e.A().X();
            e7Var.onActivityCreated((Activity) e.c.b.b.b.d.Y(bVar), bundle);
        }
    }

    @Override // e.c.b.b.c.e.tf
    public void onActivityDestroyed(e.c.b.b.b.b bVar, long j2) {
        U();
        e7 e7Var = this.f10736e.A().f10937c;
        if (e7Var != null) {
            this.f10736e.A().X();
            e7Var.onActivityDestroyed((Activity) e.c.b.b.b.d.Y(bVar));
        }
    }

    @Override // e.c.b.b.c.e.tf
    public void onActivityPaused(e.c.b.b.b.b bVar, long j2) {
        U();
        e7 e7Var = this.f10736e.A().f10937c;
        if (e7Var != null) {
            this.f10736e.A().X();
            e7Var.onActivityPaused((Activity) e.c.b.b.b.d.Y(bVar));
        }
    }

    @Override // e.c.b.b.c.e.tf
    public void onActivityResumed(e.c.b.b.b.b bVar, long j2) {
        U();
        e7 e7Var = this.f10736e.A().f10937c;
        if (e7Var != null) {
            this.f10736e.A().X();
            e7Var.onActivityResumed((Activity) e.c.b.b.b.d.Y(bVar));
        }
    }

    @Override // e.c.b.b.c.e.tf
    public void onActivitySaveInstanceState(e.c.b.b.b.b bVar, uf ufVar, long j2) {
        U();
        e7 e7Var = this.f10736e.A().f10937c;
        Bundle bundle = new Bundle();
        if (e7Var != null) {
            this.f10736e.A().X();
            e7Var.onActivitySaveInstanceState((Activity) e.c.b.b.b.d.Y(bVar), bundle);
        }
        try {
            ufVar.w(bundle);
        } catch (RemoteException e2) {
            this.f10736e.zzq().D().b("Error returning bundle value to wrapper", e2);
        }
    }

    @Override // e.c.b.b.c.e.tf
    public void onActivityStarted(e.c.b.b.b.b bVar, long j2) {
        U();
        e7 e7Var = this.f10736e.A().f10937c;
        if (e7Var != null) {
            this.f10736e.A().X();
            e7Var.onActivityStarted((Activity) e.c.b.b.b.d.Y(bVar));
        }
    }

    @Override // e.c.b.b.c.e.tf
    public void onActivityStopped(e.c.b.b.b.b bVar, long j2) {
        U();
        e7 e7Var = this.f10736e.A().f10937c;
        if (e7Var != null) {
            this.f10736e.A().X();
            e7Var.onActivityStopped((Activity) e.c.b.b.b.d.Y(bVar));
        }
    }

    @Override // e.c.b.b.c.e.tf
    public void performAction(Bundle bundle, uf ufVar, long j2) {
        U();
        ufVar.w(null);
    }

    @Override // e.c.b.b.c.e.tf
    public void registerOnMeasurementEventListener(e.c.b.b.c.e.c cVar) {
        f6 bVar;
        U();
        synchronized (this.f10737f) {
            bVar = this.f10737f.get(Integer.valueOf(cVar.zza()));
            if (bVar == null) {
                bVar = new b(cVar);
                this.f10737f.put(Integer.valueOf(cVar.zza()), bVar);
            }
        }
        this.f10736e.A().G(bVar);
    }

    @Override // e.c.b.b.c.e.tf
    public void resetAnalyticsData(long j2) {
        U();
        i6 i6VarA = this.f10736e.A();
        i6VarA.N(null);
        i6VarA.zzp().u(new r6(i6VarA, j2));
    }

    @Override // e.c.b.b.c.e.tf
    public void setConditionalUserProperty(Bundle bundle, long j2) {
        U();
        if (bundle == null) {
            this.f10736e.zzq().A().a("Conditional user property must not be null");
        } else {
            this.f10736e.A().B(bundle, j2);
        }
    }

    @Override // e.c.b.b.c.e.tf
    public void setConsent(Bundle bundle, long j2) {
        U();
        i6 i6VarA = this.f10736e.A();
        if (ec.a() && i6VarA.i().v(null, t.J0)) {
            i6VarA.A(bundle, 30, j2);
        }
    }

    @Override // e.c.b.b.c.e.tf
    public void setConsentThirdParty(Bundle bundle, long j2) {
        U();
        i6 i6VarA = this.f10736e.A();
        if (ec.a() && i6VarA.i().v(null, t.K0)) {
            i6VarA.A(bundle, 10, j2);
        }
    }

    @Override // e.c.b.b.c.e.tf
    public void setCurrentScreen(e.c.b.b.b.b bVar, String str, String str2, long j2) {
        U();
        this.f10736e.J().D((Activity) e.c.b.b.b.d.Y(bVar), str, str2);
    }

    @Override // e.c.b.b.c.e.tf
    public void setDataCollectionEnabled(boolean z) {
        U();
        i6 i6VarA = this.f10736e.A();
        i6VarA.r();
        i6VarA.zzp().u(new m6(i6VarA, z));
    }

    @Override // e.c.b.b.c.e.tf
    public void setDefaultEventParameters(Bundle bundle) {
        U();
        final i6 i6VarA = this.f10736e.A();
        final Bundle bundle2 = bundle == null ? null : new Bundle(bundle);
        i6VarA.zzp().u(new Runnable(i6VarA, bundle2) { // from class: com.google.android.gms.measurement.internal.h6

            /* renamed from: e, reason: collision with root package name */
            private final i6 f10915e;

            /* renamed from: f, reason: collision with root package name */
            private final Bundle f10916f;

            {
                this.f10915e = i6VarA;
                this.f10916f = bundle2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f10915e.j0(this.f10916f);
            }
        });
    }

    @Override // e.c.b.b.c.e.tf
    public void setEventInterceptor(e.c.b.b.c.e.c cVar) {
        U();
        a aVar = new a(cVar);
        if (this.f10736e.zzp().D()) {
            this.f10736e.A().F(aVar);
        } else {
            this.f10736e.zzp().u(new ia(this, aVar));
        }
    }

    @Override // e.c.b.b.c.e.tf
    public void setInstanceIdProvider(e.c.b.b.c.e.d dVar) {
        U();
    }

    @Override // e.c.b.b.c.e.tf
    public void setMeasurementEnabled(boolean z, long j2) {
        U();
        this.f10736e.A().L(Boolean.valueOf(z));
    }

    @Override // e.c.b.b.c.e.tf
    public void setMinimumSessionDuration(long j2) {
        U();
        i6 i6VarA = this.f10736e.A();
        i6VarA.zzp().u(new o6(i6VarA, j2));
    }

    @Override // e.c.b.b.c.e.tf
    public void setSessionTimeoutDuration(long j2) {
        U();
        i6 i6VarA = this.f10736e.A();
        i6VarA.zzp().u(new n6(i6VarA, j2));
    }

    @Override // e.c.b.b.c.e.tf
    public void setUserId(String str, long j2) {
        U();
        this.f10736e.A().W(null, "_id", str, true, j2);
    }

    @Override // e.c.b.b.c.e.tf
    public void setUserProperty(String str, String str2, e.c.b.b.b.b bVar, boolean z, long j2) {
        U();
        this.f10736e.A().W(str, str2, e.c.b.b.b.d.Y(bVar), z, j2);
    }

    @Override // e.c.b.b.c.e.tf
    public void unregisterOnMeasurementEventListener(e.c.b.b.c.e.c cVar) {
        f6 f6VarRemove;
        U();
        synchronized (this.f10737f) {
            f6VarRemove = this.f10737f.remove(Integer.valueOf(cVar.zza()));
        }
        if (f6VarRemove == null) {
            f6VarRemove = new b(cVar);
        }
        this.f10736e.A().k0(f6VarRemove);
    }
}