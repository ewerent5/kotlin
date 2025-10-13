package com.google.firebase;

import android.content.Context;

/* compiled from: FirebaseApp.java */
/* loaded from: classes.dex */
final /* synthetic */ class b implements com.google.firebase.n.a {
    private final c a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f12260b;

    private b(c cVar, Context context) {
        this.a = cVar;
        this.f12260b = context;
    }

    public static com.google.firebase.n.a a(c cVar, Context context) {
        return new b(cVar, context);
    }

    @Override // com.google.firebase.n.a
    public Object get() {
        return c.r(this.a, this.f12260b);
    }
}