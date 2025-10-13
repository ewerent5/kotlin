package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* loaded from: classes.dex */
final class l8 implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ boolean f11013e;

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ boolean f11014f;

    /* renamed from: g, reason: collision with root package name */
    private final /* synthetic */ r f11015g;

    /* renamed from: h, reason: collision with root package name */
    private final /* synthetic */ ka f11016h;

    /* renamed from: i, reason: collision with root package name */
    private final /* synthetic */ String f11017i;

    /* renamed from: j, reason: collision with root package name */
    private final /* synthetic */ y7 f11018j;

    l8(y7 y7Var, boolean z, boolean z2, r rVar, ka kaVar, String str) {
        this.f11018j = y7Var;
        this.f11013e = z;
        this.f11014f = z2;
        this.f11015g = rVar;
        this.f11016h = kaVar;
        this.f11017i = str;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        n3 n3Var = this.f11018j.f11352d;
        if (n3Var == null) {
            this.f11018j.zzq().A().a("Discarding data. Failed to send event to service");
            return;
        }
        if (this.f11013e) {
            this.f11018j.G(n3Var, this.f11014f ? null : this.f11015g, this.f11016h);
        } else {
            try {
                if (TextUtils.isEmpty(this.f11017i)) {
                    n3Var.L3(this.f11015g, this.f11016h);
                } else {
                    n3Var.H0(this.f11015g, this.f11017i, this.f11018j.zzq().J());
                }
            } catch (RemoteException e2) {
                this.f11018j.zzq().A().b("Failed to send event to the service", e2);
            }
        }
        this.f11018j.Z();
    }
}