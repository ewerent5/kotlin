package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* loaded from: classes.dex */
final class n8 implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ AtomicReference f11060e;

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ String f11061f;

    /* renamed from: g, reason: collision with root package name */
    private final /* synthetic */ String f11062g;

    /* renamed from: h, reason: collision with root package name */
    private final /* synthetic */ String f11063h;

    /* renamed from: i, reason: collision with root package name */
    private final /* synthetic */ ka f11064i;

    /* renamed from: j, reason: collision with root package name */
    private final /* synthetic */ y7 f11065j;

    n8(y7 y7Var, AtomicReference atomicReference, String str, String str2, String str3, ka kaVar) {
        this.f11065j = y7Var;
        this.f11060e = atomicReference;
        this.f11061f = str;
        this.f11062g = str2;
        this.f11063h = str3;
        this.f11064i = kaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        n3 n3Var;
        synchronized (this.f11060e) {
            try {
                try {
                    n3Var = this.f11065j.f11352d;
                } catch (RemoteException e2) {
                    this.f11065j.zzq().A().d("(legacy) Failed to get conditional properties; remote exception", v3.s(this.f11061f), this.f11062g, e2);
                    this.f11060e.set(Collections.emptyList());
                }
                if (n3Var == null) {
                    this.f11065j.zzq().A().d("(legacy) Failed to get conditional properties; not connected to service", v3.s(this.f11061f), this.f11062g, this.f11063h);
                    this.f11060e.set(Collections.emptyList());
                    return;
                }
                if (TextUtils.isEmpty(this.f11061f)) {
                    this.f11060e.set(n3Var.T1(this.f11062g, this.f11063h, this.f11064i));
                } else {
                    this.f11060e.set(n3Var.N1(this.f11061f, this.f11062g, this.f11063h));
                }
                this.f11065j.Z();
                this.f11060e.notify();
            } finally {
                this.f11060e.notify();
            }
        }
    }
}