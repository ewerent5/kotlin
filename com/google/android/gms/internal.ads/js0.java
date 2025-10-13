package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.mediation.AdUrlAdapter;
import com.google.ads.mediation.admob.AdMobAdapter;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class js0 {
    private final gs0 a;

    /* renamed from: b, reason: collision with root package name */
    private final AtomicReference<tf> f6830b = new AtomicReference<>();

    js0(gs0 gs0Var) {
        this.a = gs0Var;
    }

    private final tf e() throws RemoteException {
        tf tfVar = this.f6830b.get();
        if (tfVar != null) {
            return tfVar;
        }
        er.zzi("Unexpected call to adapter creator.");
        throw new RemoteException();
    }

    public final void a(tf tfVar) {
        this.f6830b.compareAndSet(null, tfVar);
    }

    public final hq1 b(String str, JSONObject jSONObject) throws vp1 {
        wf wfVarC;
        try {
            if ("com.google.ads.mediation.admob.AdMobAdapter".equals(str)) {
                wfVarC = new tg(new AdMobAdapter());
            } else if ("com.google.ads.mediation.AdUrlAdapter".equals(str)) {
                wfVarC = new tg(new AdUrlAdapter());
            } else if ("com.google.ads.mediation.admob.AdMobCustomTabsAdapter".equals(str)) {
                wfVarC = new tg(new zzasz());
            } else {
                tf tfVarE = e();
                if ("com.google.ads.mediation.customevent.CustomEventAdapter".equals(str) || "com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
                    try {
                        String string = jSONObject.getString("class_name");
                        wfVarC = tfVarE.d(string) ? tfVarE.c("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter") : tfVarE.O(string) ? tfVarE.c(string) : tfVarE.c("com.google.ads.mediation.customevent.CustomEventAdapter");
                    } catch (JSONException e2) {
                        er.zzg("Invalid custom event.", e2);
                    }
                } else {
                    wfVarC = tfVarE.c(str);
                }
            }
            hq1 hq1Var = new hq1(wfVarC);
            this.a.a(str, hq1Var);
            return hq1Var;
        } catch (Throwable th) {
            throw new vp1(th);
        }
    }

    public final th c(String str) {
        th thVarB = e().b(str);
        this.a.b(str, thVarB);
        return thVarB;
    }

    public final boolean d() {
        return this.f6830b.get() != null;
    }
}