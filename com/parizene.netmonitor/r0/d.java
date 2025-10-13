package com.parizene.netmonitor.r0;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import okhttp3.OkHttpClient;

/* compiled from: GeolocationHelper.java */
/* loaded from: classes3.dex */
public class d {
    private final Map<e, a> a;

    /* renamed from: b, reason: collision with root package name */
    private final Map<e, ?> f13646b;

    public d(OkHttpClient okHttpClient, String str, String str2, boolean z) {
        HashMap map = new HashMap();
        this.a = map;
        HashMap map2 = new HashMap();
        this.f13646b = map2;
        map.put(e.MYLNIKOV, new com.parizene.netmonitor.r0.f.b(okHttpClient, z));
        if (!TextUtils.isEmpty(str)) {
            map.put(e.OPENCELLID, new com.parizene.netmonitor.r0.g.b(okHttpClient, str));
        }
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        com.parizene.netmonitor.r0.h.b bVar = new com.parizene.netmonitor.r0.h.b(okHttpClient, str2);
        e eVar = e.YANDEX;
        map.put(eVar, bVar);
        map2.put(eVar, bVar);
    }

    public b a(e eVar, c cVar) {
        a aVar = this.a.get(eVar);
        if (aVar != null) {
            return aVar.a(cVar);
        }
        throw new IllegalStateException();
    }
}