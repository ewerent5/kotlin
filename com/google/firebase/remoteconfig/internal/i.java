package com.google.firebase.remoteconfig.internal;

import java.util.Date;

/* compiled from: ConfigFetchHandler.java */
/* loaded from: classes.dex */
final /* synthetic */ class i implements e.c.b.b.e.a {
    private final k a;

    /* renamed from: b, reason: collision with root package name */
    private final Date f12940b;

    private i(k kVar, Date date) {
        this.a = kVar;
        this.f12940b = date;
    }

    public static e.c.b.b.e.a b(k kVar, Date date) {
        return new i(kVar, date);
    }

    @Override // e.c.b.b.e.a
    public Object a(e.c.b.b.e.h hVar) {
        return k.p(this.a, this.f12940b, hVar);
    }
}