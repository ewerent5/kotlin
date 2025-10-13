package com.google.firebase.crashlytics;

import com.google.firebase.components.d;
import com.google.firebase.components.e;
import com.google.firebase.components.h;
import com.google.firebase.components.n;
import com.google.firebase.installations.g;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public class CrashlyticsRegistrar implements h {
    /* JADX INFO: Access modifiers changed from: private */
    public c b(e eVar) {
        return c.b((com.google.firebase.c) eVar.a(com.google.firebase.c.class), (g) eVar.a(g.class), (com.google.firebase.crashlytics.d.a) eVar.a(com.google.firebase.crashlytics.d.a.class), (com.google.firebase.analytics.a.a) eVar.a(com.google.firebase.analytics.a.a.class));
    }

    @Override // com.google.firebase.components.h
    public List<d<?>> getComponents() {
        return Arrays.asList(d.a(c.class).b(n.g(com.google.firebase.c.class)).b(n.g(g.class)).b(n.e(com.google.firebase.analytics.a.a.class)).b(n.e(com.google.firebase.crashlytics.d.a.class)).e(b.b(this)).d().c(), com.google.firebase.p.h.a("fire-cls", "17.3.0"));
    }
}