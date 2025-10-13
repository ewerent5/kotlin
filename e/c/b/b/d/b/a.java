package e.c.b.b.d.b;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.b;
import com.google.android.gms.common.internal.p;
import com.google.android.gms.common.internal.q;

/* loaded from: classes.dex */
public class a extends com.google.android.gms.common.internal.h<g> implements e.c.b.b.d.f {

    /* renamed from: d, reason: collision with root package name */
    private final boolean f14990d;

    /* renamed from: e, reason: collision with root package name */
    private final com.google.android.gms.common.internal.c f14991e;

    /* renamed from: f, reason: collision with root package name */
    private final Bundle f14992f;

    /* renamed from: g, reason: collision with root package name */
    private Integer f14993g;

    private a(Context context, Looper looper, boolean z, com.google.android.gms.common.internal.c cVar, Bundle bundle, com.google.android.gms.common.api.f fVar, com.google.android.gms.common.api.g gVar) {
        super(context, looper, 44, cVar, fVar, gVar);
        this.f14990d = true;
        this.f14991e = cVar;
        this.f14992f = bundle;
        this.f14993g = cVar.d();
    }

    public static Bundle g(com.google.android.gms.common.internal.c cVar) {
        e.c.b.b.d.a aVarH = cVar.h();
        Integer numD = cVar.d();
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", cVar.a());
        if (numD != null) {
            bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", numD.intValue());
        }
        if (aVarH != null) {
            bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", aVarH.i());
            bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", aVarH.h());
            bundle.putString("com.google.android.gms.signin.internal.serverClientId", aVarH.f());
            bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
            bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", aVarH.g());
            bundle.putString("com.google.android.gms.signin.internal.hostedDomain", aVarH.d());
            bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", aVarH.j());
            if (aVarH.c() != null) {
                bundle.putLong("com.google.android.gms.signin.internal.authApiSignInModuleVersion", aVarH.c().longValue());
            }
            if (aVarH.e() != null) {
                bundle.putLong("com.google.android.gms.signin.internal.realClientLibraryVersion", aVarH.e().longValue());
            }
        }
        return bundle;
    }

    @Override // e.c.b.b.d.f
    public final void a() {
        connect(new b.d());
    }

    @Override // e.c.b.b.d.f
    public final void b(e eVar) {
        p.k(eVar, "Expecting a valid ISignInCallbacks");
        try {
            Account accountB = this.f14991e.b();
            ((g) getService()).I1(new i(new q(accountB, this.f14993g.intValue(), com.google.android.gms.common.internal.b.DEFAULT_ACCOUNT.equals(accountB.name) ? com.google.android.gms.auth.api.signin.a.a.a(getContext()).b() : null)), eVar);
        } catch (RemoteException e2) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                eVar.A0(new k(8));
            } catch (RemoteException unused) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e2);
            }
        }
    }

    @Override // com.google.android.gms.common.internal.b
    protected /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return iInterfaceQueryLocalInterface instanceof g ? (g) iInterfaceQueryLocalInterface : new h(iBinder);
    }

    @Override // com.google.android.gms.common.internal.b
    protected Bundle getGetServiceRequestExtraArgs() {
        if (!getContext().getPackageName().equals(this.f14991e.f())) {
            this.f14992f.putString("com.google.android.gms.signin.internal.realClientPackageName", this.f14991e.f());
        }
        return this.f14992f;
    }

    @Override // com.google.android.gms.common.internal.h, com.google.android.gms.common.internal.b, com.google.android.gms.common.api.a.f
    public int getMinApkVersion() {
        return 12451000;
    }

    @Override // com.google.android.gms.common.internal.b
    protected String getServiceDescriptor() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override // com.google.android.gms.common.internal.b
    protected String getStartServiceAction() {
        return "com.google.android.gms.signin.service.START";
    }

    @Override // com.google.android.gms.common.internal.b, com.google.android.gms.common.api.a.f
    public boolean requiresSignIn() {
        return this.f14990d;
    }

    public a(Context context, Looper looper, boolean z, com.google.android.gms.common.internal.c cVar, e.c.b.b.d.a aVar, com.google.android.gms.common.api.f fVar, com.google.android.gms.common.api.g gVar) {
        this(context, looper, true, cVar, g(cVar), fVar, gVar);
    }
}