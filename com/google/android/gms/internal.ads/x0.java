package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.MuteThisAdReason;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public final class x0 implements MuteThisAdReason {
    private final String a;

    /* renamed from: b, reason: collision with root package name */
    private final w0 f10093b;

    public x0(w0 w0Var) {
        String strZze;
        this.f10093b = w0Var;
        try {
            strZze = w0Var.zze();
        } catch (RemoteException e2) {
            er.zzg("", e2);
            strZze = null;
        }
        this.a = strZze;
    }

    public final w0 a() {
        return this.f10093b;
    }

    @Override // com.google.android.gms.ads.MuteThisAdReason
    public final String getDescription() {
        return this.a;
    }

    public final String toString() {
        return this.a;
    }
}