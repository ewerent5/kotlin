package com.google.firebase.abt.component;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.components.d;
import com.google.firebase.components.e;
import com.google.firebase.components.h;
import com.google.firebase.components.n;
import java.util.Arrays;
import java.util.List;

@Keep
/* loaded from: classes.dex */
public class AbtRegistrar implements h {
    static /* synthetic */ a lambda$getComponents$0(e eVar) {
        return new a((Context) eVar.a(Context.class), (com.google.firebase.analytics.a.a) eVar.a(com.google.firebase.analytics.a.a.class));
    }

    @Override // com.google.firebase.components.h
    public List<d<?>> getComponents() {
        return Arrays.asList(d.a(a.class).b(n.g(Context.class)).b(n.e(com.google.firebase.analytics.a.a.class)).e(b.b()).c(), com.google.firebase.p.h.a("fire-abt", "20.0.0"));
    }
}