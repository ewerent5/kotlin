package com.google.firebase.remoteconfig;

import android.content.Context;
import androidx.annotation.Keep;
import java.util.Arrays;
import java.util.List;

@Keep
/* loaded from: classes.dex */
public class RemoteConfigRegistrar implements com.google.firebase.components.h {
    static /* synthetic */ o lambda$getComponents$0(com.google.firebase.components.e eVar) {
        return new o((Context) eVar.a(Context.class), (com.google.firebase.c) eVar.a(com.google.firebase.c.class), (com.google.firebase.installations.g) eVar.a(com.google.firebase.installations.g.class), ((com.google.firebase.abt.component.a) eVar.a(com.google.firebase.abt.component.a.class)).b("frc"), (com.google.firebase.analytics.a.a) eVar.a(com.google.firebase.analytics.a.a.class));
    }

    @Override // com.google.firebase.components.h
    public List<com.google.firebase.components.d<?>> getComponents() {
        return Arrays.asList(com.google.firebase.components.d.a(o.class).b(com.google.firebase.components.n.g(Context.class)).b(com.google.firebase.components.n.g(com.google.firebase.c.class)).b(com.google.firebase.components.n.g(com.google.firebase.installations.g.class)).b(com.google.firebase.components.n.g(com.google.firebase.abt.component.a.class)).b(com.google.firebase.components.n.e(com.google.firebase.analytics.a.a.class)).e(p.b()).d().c(), com.google.firebase.p.h.a("fire-rc", "20.0.2"));
    }
}