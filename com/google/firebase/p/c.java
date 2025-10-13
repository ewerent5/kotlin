package com.google.firebase.p;

import com.google.firebase.components.n;
import java.util.Iterator;
import java.util.Set;

/* compiled from: DefaultUserAgentPublisher.java */
/* loaded from: classes.dex */
public class c implements i {
    private final String a;

    /* renamed from: b, reason: collision with root package name */
    private final d f12896b;

    c(Set<f> set, d dVar) {
        this.a = d(set);
        this.f12896b = dVar;
    }

    public static com.google.firebase.components.d<i> b() {
        return com.google.firebase.components.d.a(i.class).b(n.h(f.class)).e(b.b()).c();
    }

    static /* synthetic */ i c(com.google.firebase.components.e eVar) {
        return new c(eVar.d(f.class), d.a());
    }

    private static String d(Set<f> set) {
        StringBuilder sb = new StringBuilder();
        Iterator<f> it = set.iterator();
        while (it.hasNext()) {
            f next = it.next();
            sb.append(next.b());
            sb.append('/');
            sb.append(next.c());
            if (it.hasNext()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }

    @Override // com.google.firebase.p.i
    public String a() {
        if (this.f12896b.b().isEmpty()) {
            return this.a;
        }
        return this.a + ' ' + d(this.f12896b.b());
    }
}