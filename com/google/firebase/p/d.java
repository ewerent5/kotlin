package com.google.firebase.p;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: GlobalLibraryVersionRegistrar.java */
/* loaded from: classes.dex */
public class d {
    private static volatile d a;

    /* renamed from: b, reason: collision with root package name */
    private final Set<f> f12897b = new HashSet();

    d() {
    }

    public static d a() {
        d dVar = a;
        if (dVar == null) {
            synchronized (d.class) {
                dVar = a;
                if (dVar == null) {
                    dVar = new d();
                    a = dVar;
                }
            }
        }
        return dVar;
    }

    Set<f> b() {
        Set<f> setUnmodifiableSet;
        synchronized (this.f12897b) {
            setUnmodifiableSet = Collections.unmodifiableSet(this.f12897b);
        }
        return setUnmodifiableSet;
    }
}