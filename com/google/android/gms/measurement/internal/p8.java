package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* loaded from: classes.dex */
final class p8 implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ AtomicReference f11125e;

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ String f11126f;

    /* renamed from: g, reason: collision with root package name */
    private final /* synthetic */ String f11127g;

    /* renamed from: h, reason: collision with root package name */
    private final /* synthetic */ String f11128h;

    /* renamed from: i, reason: collision with root package name */
    private final /* synthetic */ boolean f11129i;

    /* renamed from: j, reason: collision with root package name */
    private final /* synthetic */ ka f11130j;

    /* renamed from: k, reason: collision with root package name */
    private final /* synthetic */ y7 f11131k;

    p8(y7 y7Var, AtomicReference atomicReference, String str, String str2, String str3, boolean z, ka kaVar) {
        this.f11131k = y7Var;
        this.f11125e = atomicReference;
        this.f11126f = str;
        this.f11127g = str2;
        this.f11128h = str3;
        this.f11129i = z;
        this.f11130j = kaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        n3 n3Var;
        synchronized (this.f11125e) {
            try {
                try {
                    n3Var = this.f11131k.f11352d;
                } finally {
                    this.f11125e.notify();
                }
            } catch (RemoteException e2) {
                this.f11131k.zzq().A().d("(legacy) Failed to get user properties; remote exception", v3.s(this.f11126f), this.f11127g, e2);
                this.f11125e.set(Collections.emptyList());
            }
            if (n3Var == null) {
                this.f11131k.zzq().A().d("(legacy) Failed to get user properties; not connected to service", v3.s(this.f11126f), this.f11127g, this.f11128h);
                this.f11125e.set(Collections.emptyList());
                return;
            }
            if (TextUtils.isEmpty(this.f11126f)) {
                this.f11125e.set(n3Var.n2(this.f11127g, this.f11128h, this.f11129i, this.f11130j));
            } else {
                this.f11125e.set(n3Var.I0(this.f11126f, this.f11127g, this.f11128h, this.f11129i));
            }
            this.f11131k.Z();
            this.f11125e.notify();
        }
    }
}