package com.google.firebase.p;

import android.content.Context;
import com.google.firebase.p.h;

/* compiled from: LibraryVersionComponent.java */
/* loaded from: classes.dex */
final /* synthetic */ class g implements com.google.firebase.components.g {
    private final String a;

    /* renamed from: b, reason: collision with root package name */
    private final h.a f12898b;

    private g(String str, h.a aVar) {
        this.a = str;
        this.f12898b = aVar;
    }

    public static com.google.firebase.components.g b(String str, h.a aVar) {
        return new g(str, aVar);
    }

    @Override // com.google.firebase.components.g
    public Object a(com.google.firebase.components.e eVar) {
        return f.a(this.a, this.f12898b.a((Context) eVar.a(Context.class)));
    }
}