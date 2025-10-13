package com.google.firebase.analytics.connector.internal;

import com.google.firebase.analytics.a.a;
import java.util.HashSet;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-measurement-api@@18.0.0 */
/* loaded from: classes.dex */
public final class b {
    Set<String> a;

    /* renamed from: b, reason: collision with root package name */
    private a.b f12250b;

    /* renamed from: c, reason: collision with root package name */
    private com.google.android.gms.measurement.a.a f12251c;

    /* renamed from: d, reason: collision with root package name */
    private e f12252d;

    public b(com.google.android.gms.measurement.a.a aVar, a.b bVar) {
        this.f12250b = bVar;
        this.f12251c = aVar;
        e eVar = new e(this);
        this.f12252d = eVar;
        this.f12251c.q(eVar);
        this.a = new HashSet();
    }
}