package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzs;
import java.util.UUID;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class ze<I, O> implements ke<I, O> {
    private final me<O> a;

    /* renamed from: b, reason: collision with root package name */
    private final ne<I> f10583b;

    /* renamed from: c, reason: collision with root package name */
    private final ge f10584c;

    /* renamed from: d, reason: collision with root package name */
    private final String f10585d;

    ze(ge geVar, String str, ne<I> neVar, me<O> meVar) {
        this.f10584c = geVar;
        this.f10585d = str;
        this.f10583b = neVar;
        this.a = meVar;
    }

    static /* synthetic */ void a(ze zeVar, ae aeVar, he heVar, Object obj, wr wrVar) throws JSONException {
        try {
            zzs.zzc();
            String string = UUID.randomUUID().toString();
            aa.p.b(string, new ye(zeVar, aeVar, wrVar));
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", string);
            jSONObject.put("args", zeVar.f10583b.zzb(obj));
            heVar.j0(zeVar.f10585d, jSONObject);
        } catch (Exception e2) {
            try {
                wrVar.zzd(e2);
                er.zzg("Unable to invokeJavascript", e2);
            } finally {
                aeVar.f();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.e42
    public final g52<O> zza(I i2) {
        return zzb(i2);
    }

    @Override // com.google.android.gms.internal.ads.ke
    public final g52<O> zzb(I i2) {
        wr wrVar = new wr();
        ae aeVarB = this.f10584c.b(null);
        aeVarB.a(new we(this, aeVarB, i2, wrVar), new xe(this, wrVar, aeVarB));
        return wrVar;
    }
}