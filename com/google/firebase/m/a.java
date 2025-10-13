package com.google.firebase.m;

import android.content.Context;

/* compiled from: DefaultHeartBeatInfo.java */
/* loaded from: classes.dex */
final /* synthetic */ class a implements com.google.firebase.n.a {
    private final Context a;

    private a(Context context) {
        this.a = context;
    }

    public static com.google.firebase.n.a a(Context context) {
        return new a(context);
    }

    @Override // com.google.firebase.n.a
    public Object get() {
        return e.a(this.a);
    }
}