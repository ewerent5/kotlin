package com.google.firebase.analytics.a;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.p;
import com.google.firebase.analytics.a.a;
import e.c.b.b.c.e.h;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-api@@18.0.0 */
/* loaded from: classes.dex */
public class b implements com.google.firebase.analytics.a.a {
    private static volatile com.google.firebase.analytics.a.a a;

    /* renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.measurement.a.a f12246b;

    /* renamed from: c, reason: collision with root package name */
    final Map<String, ?> f12247c;

    /* compiled from: com.google.android.gms:play-services-measurement-api@@18.0.0 */
    class a implements a.InterfaceC0127a {
        private final /* synthetic */ String a;

        a(String str) {
            this.a = str;
        }
    }

    private b(com.google.android.gms.measurement.a.a aVar) {
        p.j(aVar);
        this.f12246b = aVar;
        this.f12247c = new ConcurrentHashMap();
    }

    public static com.google.firebase.analytics.a.a g(com.google.firebase.c cVar, Context context, com.google.firebase.l.d dVar) {
        p.j(cVar);
        p.j(context);
        p.j(dVar);
        p.j(context.getApplicationContext());
        if (a == null) {
            synchronized (b.class) {
                if (a == null) {
                    Bundle bundle = new Bundle(1);
                    if (cVar.q()) {
                        dVar.a(com.google.firebase.a.class, d.f12249e, c.a);
                        bundle.putBoolean("dataCollectionDefaultEnabled", cVar.p());
                    }
                    a = new b(h.c(context, null, null, null, bundle).f());
                }
            }
        }
        return a;
    }

    static final /* synthetic */ void h(com.google.firebase.l.a aVar) {
        boolean z = ((com.google.firebase.a) aVar.a()).a;
        synchronized (b.class) {
            ((b) a).f12246b.v(z);
        }
    }

    private final boolean i(String str) {
        return (str.isEmpty() || !this.f12247c.containsKey(str) || this.f12247c.get(str) == null) ? false : true;
    }

    @Override // com.google.firebase.analytics.a.a
    public Map<String, Object> a(boolean z) {
        return this.f12246b.m(null, null, z);
    }

    @Override // com.google.firebase.analytics.a.a
    public void b(a.c cVar) {
        if (com.google.firebase.analytics.connector.internal.c.b(cVar)) {
            this.f12246b.r(com.google.firebase.analytics.connector.internal.c.g(cVar));
        }
    }

    @Override // com.google.firebase.analytics.a.a
    public void c(String str, String str2, Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (com.google.firebase.analytics.connector.internal.c.c(str) && com.google.firebase.analytics.connector.internal.c.d(str2, bundle) && com.google.firebase.analytics.connector.internal.c.f(str, str2, bundle)) {
            com.google.firebase.analytics.connector.internal.c.h(str, str2, bundle);
            this.f12246b.n(str, str2, bundle);
        }
    }

    @Override // com.google.firebase.analytics.a.a
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        if (str2 == null || com.google.firebase.analytics.connector.internal.c.d(str2, bundle)) {
            this.f12246b.b(str, str2, bundle);
        }
    }

    @Override // com.google.firebase.analytics.a.a
    public int d(String str) {
        return this.f12246b.l(str);
    }

    @Override // com.google.firebase.analytics.a.a
    public List<a.c> e(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        Iterator<Bundle> it = this.f12246b.g(str, str2).iterator();
        while (it.hasNext()) {
            arrayList.add(com.google.firebase.analytics.connector.internal.c.a(it.next()));
        }
        return arrayList;
    }

    @Override // com.google.firebase.analytics.a.a
    public a.InterfaceC0127a f(String str, a.b bVar) {
        p.j(bVar);
        if (!com.google.firebase.analytics.connector.internal.c.c(str) || i(str)) {
            return null;
        }
        com.google.android.gms.measurement.a.a aVar = this.f12246b;
        Object bVar2 = "fiam".equals(str) ? new com.google.firebase.analytics.connector.internal.b(aVar, bVar) : ("crash".equals(str) || "clx".equals(str)) ? new com.google.firebase.analytics.connector.internal.d(aVar, bVar) : null;
        if (bVar2 == null) {
            return null;
        }
        this.f12247c.put(str, bVar2);
        return new a(str);
    }
}