package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class hb1 {
    private final mb1<s60> a;

    /* renamed from: b, reason: collision with root package name */
    private final String f6319b;

    /* renamed from: c, reason: collision with root package name */
    @GuardedBy("this")
    private k1 f6320c;

    public hb1(mb1<s60> mb1Var, String str) {
        this.a = mb1Var;
        this.f6319b = str;
    }

    public final synchronized boolean a() {
        return this.a.zzb();
    }

    public final synchronized void b(m93 m93Var, int i2) {
        this.f6320c = null;
        this.a.a(m93Var, this.f6319b, new nb1(i2), new gb1(this));
    }

    public final synchronized String c() {
        k1 k1Var;
        try {
            k1Var = this.f6320c;
        } catch (RemoteException e2) {
            er.zzl("#007 Could not call remote method.", e2);
            return null;
        }
        return k1Var != null ? k1Var.zze() : null;
    }

    public final synchronized String d() {
        k1 k1Var;
        try {
            k1Var = this.f6320c;
        } catch (RemoteException e2) {
            er.zzl("#007 Could not call remote method.", e2);
            return null;
        }
        return k1Var != null ? k1Var.zze() : null;
    }
}