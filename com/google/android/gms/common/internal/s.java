package com.google.android.gms.common.internal;

import androidx.annotation.RecentlyNonNull;

/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
/* loaded from: classes.dex */
public final class s {
    private static s a;

    /* renamed from: b, reason: collision with root package name */
    private static final t f4729b = new t(0, false, false, 0, 0);

    /* renamed from: c, reason: collision with root package name */
    private t f4730c;

    private s() {
    }

    @RecentlyNonNull
    public static synchronized s a() {
        if (a == null) {
            a = new s();
        }
        return a;
    }

    public final synchronized void b(t tVar) {
        if (tVar == null) {
            this.f4730c = f4729b;
            return;
        }
        t tVar2 = this.f4730c;
        if (tVar2 == null || tVar2.L() < tVar.L()) {
            this.f4730c = tVar;
        }
    }
}