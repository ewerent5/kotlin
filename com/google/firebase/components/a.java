package com.google.firebase.components;

import java.util.Set;

/* compiled from: AbstractComponentContainer.java */
/* loaded from: classes.dex */
abstract class a implements e {
    a() {
    }

    @Override // com.google.firebase.components.e
    public <T> T a(Class<T> cls) {
        com.google.firebase.n.a<T> aVarB = b(cls);
        if (aVarB == null) {
            return null;
        }
        return aVarB.get();
    }

    @Override // com.google.firebase.components.e
    public <T> Set<T> d(Class<T> cls) {
        return c(cls).get();
    }
}