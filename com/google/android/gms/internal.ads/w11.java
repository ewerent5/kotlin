package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class w11 {
    private final s11 a;

    /* renamed from: b, reason: collision with root package name */
    private final h52 f9845b;

    public w11(s11 s11Var, h52 h52Var) {
        this.a = s11Var;
        this.f9845b = h52Var;
    }

    public final void a(vs1<SQLiteDatabase, Void> vs1Var) {
        y42.o(this.f9845b.N(u11.a(this.a)), new v11(this, vs1Var), this.f9845b);
    }
}