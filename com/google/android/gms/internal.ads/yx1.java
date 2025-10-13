package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.internal.b;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class yx1 implements b.a, b.InterfaceC0113b {
    private final zy1 a;

    /* renamed from: b, reason: collision with root package name */
    private final ry1 f10505b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f10506c = new Object();

    /* renamed from: d, reason: collision with root package name */
    private boolean f10507d = false;

    /* renamed from: e, reason: collision with root package name */
    private boolean f10508e = false;

    yx1(Context context, Looper looper, ry1 ry1Var) {
        this.f10505b = ry1Var;
        this.a = new zy1(context, looper, this, this, 12800000);
    }

    private final void b() {
        synchronized (this.f10506c) {
            if (this.a.isConnected() || this.a.isConnecting()) {
                this.a.disconnect();
            }
            Binder.flushPendingCommands();
        }
    }

    @Override // com.google.android.gms.common.internal.b.a
    public final void R(int i2) {
    }

    @Override // com.google.android.gms.common.internal.b.InterfaceC0113b
    public final void U(com.google.android.gms.common.b bVar) {
    }

    @Override // com.google.android.gms.common.internal.b.a
    public final void Y(Bundle bundle) {
        synchronized (this.f10506c) {
            if (this.f10508e) {
                return;
            }
            this.f10508e = true;
            try {
                this.a.c().U(new xy1(this.f10505b.i()));
            } catch (Exception unused) {
            } catch (Throwable th) {
                b();
                throw th;
            }
            b();
        }
    }

    final void a() {
        synchronized (this.f10506c) {
            if (!this.f10507d) {
                this.f10507d = true;
                this.a.checkAvailabilityAndConnect();
            }
        }
    }
}