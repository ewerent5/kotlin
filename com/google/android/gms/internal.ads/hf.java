package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzs;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class hf<I, O> implements e42<I, O> {
    private final me<O> a;

    /* renamed from: b, reason: collision with root package name */
    private final ne<I> f6327b;

    /* renamed from: c, reason: collision with root package name */
    private final String f6328c = "google.afma.activeView.handleUpdate";

    /* renamed from: d, reason: collision with root package name */
    private final g52<he> f6329d;

    hf(g52<he> g52Var, String str, ne<I> neVar, me<O> meVar) {
        this.f6329d = g52Var;
        this.f6327b = neVar;
        this.a = meVar;
    }

    final /* synthetic */ g52 a(Object obj, he heVar) throws JSONException {
        wr wrVar = new wr();
        zzs.zzc();
        String string = UUID.randomUUID().toString();
        aa.p.b(string, new gf(this, wrVar));
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", string);
        jSONObject.put("args", (JSONObject) obj);
        heVar.j0(this.f6328c, jSONObject);
        return wrVar;
    }

    @Override // com.google.android.gms.internal.ads.e42
    public final g52<O> zza(I i2) {
        return zzb(i2);
    }

    public final g52<O> zzb(final I i2) {
        return y42.h(this.f6329d, new e42(this, i2) { // from class: com.google.android.gms.internal.ads.ff
            private final hf a;

            /* renamed from: b, reason: collision with root package name */
            private final Object f5860b;

            {
                this.a = this;
                this.f5860b = i2;
            }

            @Override // com.google.android.gms.internal.ads.e42
            public final g52 zza(Object obj) {
                return this.a.a(this.f5860b, (he) obj);
            }
        }, qr.f8451f);
    }
}