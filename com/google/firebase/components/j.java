package com.google.firebase.components;

import java.util.Set;

/* compiled from: ComponentRuntime.java */
/* loaded from: classes.dex */
final /* synthetic */ class j implements com.google.firebase.n.a {
    private final Set a;

    private j(Set set) {
        this.a = set;
    }

    public static com.google.firebase.n.a a(Set set) {
        return new j(set);
    }

    @Override // com.google.firebase.n.a
    public Object get() {
        return l.g(this.a);
    }
}