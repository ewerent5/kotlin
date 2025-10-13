package com.google.firebase.m;

import android.content.Context;
import com.google.firebase.components.n;
import com.google.firebase.components.s;
import com.google.firebase.m.d;

/* compiled from: DefaultHeartBeatInfo.java */
/* loaded from: classes.dex */
public class c implements d {
    private com.google.firebase.n.a<e> a;

    private c(Context context) {
        this(new s(a.a(context)));
    }

    public static com.google.firebase.components.d<d> b() {
        return com.google.firebase.components.d.a(d.class).b(n.g(Context.class)).e(b.b()).c();
    }

    static /* synthetic */ d c(com.google.firebase.components.e eVar) {
        return new c((Context) eVar.a(Context.class));
    }

    @Override // com.google.firebase.m.d
    public d.a a(String str) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean zC = this.a.get().c(str, jCurrentTimeMillis);
        boolean zB = this.a.get().b(jCurrentTimeMillis);
        return (zC && zB) ? d.a.COMBINED : zB ? d.a.GLOBAL : zC ? d.a.SDK : d.a.NONE;
    }

    c(com.google.firebase.n.a<e> aVar) {
        this.a = aVar;
    }
}