package com.google.firebase.installations;

import androidx.annotation.Keep;
import java.util.Arrays;
import java.util.List;

@Keep
/* loaded from: classes.dex */
public class FirebaseInstallationsRegistrar implements com.google.firebase.components.h {
    static /* synthetic */ g lambda$getComponents$0(com.google.firebase.components.e eVar) {
        return new f((com.google.firebase.c) eVar.a(com.google.firebase.c.class), eVar.b(com.google.firebase.p.i.class), eVar.b(com.google.firebase.m.d.class));
    }

    @Override // com.google.firebase.components.h
    public List<com.google.firebase.components.d<?>> getComponents() {
        return Arrays.asList(com.google.firebase.components.d.a(g.class).b(com.google.firebase.components.n.g(com.google.firebase.c.class)).b(com.google.firebase.components.n.f(com.google.firebase.m.d.class)).b(com.google.firebase.components.n.f(com.google.firebase.p.i.class)).e(i.b()).c(), com.google.firebase.p.h.a("fire-installations", "16.3.4"));
    }
}