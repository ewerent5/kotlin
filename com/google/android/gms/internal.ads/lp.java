package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.ads.internal.zzs;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public abstract class lp {
    static lp a;

    public static synchronized lp d(Context context) {
        lp lpVar = a;
        if (lpVar != null) {
            return lpVar;
        }
        Context applicationContext = context.getApplicationContext();
        w3.a(applicationContext);
        zzg zzgVarL = zzs.zzg().l();
        zzgVarL.zza(applicationContext);
        po poVar = new po(null);
        poVar.a(applicationContext);
        poVar.b(zzs.zzj());
        poVar.c(zzgVarL);
        poVar.d(zzs.zzA());
        lp lpVarE = poVar.e();
        a = lpVarE;
        lpVarE.a().a();
        a.b().e();
        final qp qpVarC = a.c();
        if (((Boolean) c.c().b(w3.l0)).booleanValue()) {
            final HashMap map = new HashMap();
            try {
                JSONObject jSONObject = new JSONObject((String) c.c().b(w3.n0));
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    HashSet hashSet = new HashSet();
                    JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(next);
                    if (jSONArrayOptJSONArray != null) {
                        for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
                            String strOptString = jSONArrayOptJSONArray.optString(i2);
                            if (strOptString != null) {
                                hashSet.add(strOptString);
                            }
                        }
                        map.put(next, hashSet);
                    }
                }
                Iterator it = map.keySet().iterator();
                while (it.hasNext()) {
                    qpVarC.b((String) it.next());
                }
                qpVarC.a(new pp(qpVarC, map) { // from class: com.google.android.gms.internal.ads.np
                    private final qp a;

                    /* renamed from: b, reason: collision with root package name */
                    private final Map f7765b;

                    {
                        this.a = qpVarC;
                        this.f7765b = map;
                    }

                    @Override // com.google.android.gms.internal.ads.pp
                    public final void a(SharedPreferences sharedPreferences, String str, String str2) {
                        this.a.c(this.f7765b, sharedPreferences, str, str2);
                    }
                });
            } catch (JSONException e2) {
                er.zze("Failed to parse listening list", e2);
            }
        }
        return a;
    }

    abstract io a();

    abstract mo b();

    abstract qp c();
}