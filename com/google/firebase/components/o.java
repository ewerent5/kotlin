package com.google.firebase.components;

import java.util.Arrays;
import java.util.List;

/* compiled from: DependencyCycleException.java */
/* loaded from: classes.dex */
public class o extends p {

    /* renamed from: e, reason: collision with root package name */
    private final List<d<?>> f12295e;

    public o(List<d<?>> list) {
        super("Dependency cycle detected: " + Arrays.toString(list.toArray()));
        this.f12295e = list;
    }
}