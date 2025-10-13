package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zze;
import java.util.AbstractMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class ie implements xc, he {

    /* renamed from: e, reason: collision with root package name */
    private final he f6527e;

    /* renamed from: f, reason: collision with root package name */
    private final HashSet<AbstractMap.SimpleEntry<String, ba<? super he>>> f6528f = new HashSet<>();

    public ie(he heVar) {
        this.f6527e = heVar;
    }

    @Override // com.google.android.gms.internal.ads.he
    public final void A(String str, ba<? super he> baVar) {
        this.f6527e.A(str, baVar);
        this.f6528f.remove(new AbstractMap.SimpleEntry(str, baVar));
    }

    @Override // com.google.android.gms.internal.ads.he
    public final void I(String str, ba<? super he> baVar) {
        this.f6527e.I(str, baVar);
        this.f6528f.add(new AbstractMap.SimpleEntry<>(str, baVar));
    }

    @Override // com.google.android.gms.internal.ads.xc
    public final void a(String str, JSONObject jSONObject) {
        wc.c(this, str, jSONObject);
    }

    public final void c() {
        Iterator<AbstractMap.SimpleEntry<String, ba<? super he>>> it = this.f6528f.iterator();
        while (it.hasNext()) {
            AbstractMap.SimpleEntry<String, ba<? super he>> next = it.next();
            String strValueOf = String.valueOf(next.getValue().toString());
            zze.zza(strValueOf.length() != 0 ? "Unregistering eventhandler: ".concat(strValueOf) : new String("Unregistering eventhandler: "));
            this.f6527e.A(next.getKey(), next.getValue());
        }
        this.f6528f.clear();
    }

    @Override // com.google.android.gms.internal.ads.vc
    public final void e0(String str, Map map) {
        wc.d(this, str, map);
    }

    @Override // com.google.android.gms.internal.ads.jd
    public final void j0(String str, JSONObject jSONObject) {
        wc.a(this, str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.xc
    public final void o(String str, String str2) {
        wc.b(this, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.xc
    public final void zza(String str) {
        this.f6527e.zza(str);
    }
}