package com.google.android.datatransport.runtime.backends;

import android.content.Context;

/* compiled from: CreationContextFactory.java */
/* loaded from: classes.dex */
class i {
    private final Context a;

    /* renamed from: b, reason: collision with root package name */
    private final e.c.b.a.i.y.a f4381b;

    /* renamed from: c, reason: collision with root package name */
    private final e.c.b.a.i.y.a f4382c;

    i(Context context, e.c.b.a.i.y.a aVar, e.c.b.a.i.y.a aVar2) {
        this.a = context;
        this.f4381b = aVar;
        this.f4382c = aVar2;
    }

    h a(String str) {
        return h.a(this.a, this.f4381b, this.f4382c, str);
    }
}