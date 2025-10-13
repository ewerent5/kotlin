package com.google.firebase;

import android.content.Context;
import com.google.firebase.p.h;

/* compiled from: FirebaseCommonRegistrar.java */
/* loaded from: classes.dex */
final /* synthetic */ class f implements h.a {
    private static final f a = new f();

    private f() {
    }

    public static h.a b() {
        return a;
    }

    @Override // com.google.firebase.p.h.a
    public String a(Object obj) {
        return FirebaseCommonRegistrar.c((Context) obj);
    }
}