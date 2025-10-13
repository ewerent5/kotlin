package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.b;
import java.io.IOException;
import java.util.concurrent.Future;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class q43 implements b.a {
    final /* synthetic */ h43 a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ wr f8327b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ s43 f8328c;

    q43(s43 s43Var, h43 h43Var, wr wrVar) {
        this.f8328c = s43Var;
        this.a = h43Var;
        this.f8327b = wrVar;
    }

    @Override // com.google.android.gms.common.internal.b.a
    public final void R(int i2) {
    }

    @Override // com.google.android.gms.common.internal.b.a
    public final void Y(Bundle bundle) {
        synchronized (this.f8328c.f8816d) {
            if (this.f8328c.f8814b) {
                return;
            }
            s43.e(this.f8328c, true);
            final g43 g43Var = this.f8328c.a;
            if (g43Var != null) {
                h52 h52Var = qr.a;
                final h43 h43Var = this.a;
                final wr wrVar = this.f8327b;
                final g52<?> g52VarC = h52Var.c(new Runnable(this, g43Var, h43Var, wrVar) { // from class: com.google.android.gms.internal.ads.m43

                    /* renamed from: e, reason: collision with root package name */
                    private final q43 f7424e;

                    /* renamed from: f, reason: collision with root package name */
                    private final g43 f7425f;

                    /* renamed from: g, reason: collision with root package name */
                    private final h43 f7426g;

                    /* renamed from: h, reason: collision with root package name */
                    private final wr f7427h;

                    {
                        this.f7424e = this;
                        this.f7425f = g43Var;
                        this.f7426g = h43Var;
                        this.f7427h = wrVar;
                    }

                    @Override // java.lang.Runnable
                    public final void run() throws IOException {
                        q43 q43Var = this.f7424e;
                        g43 g43Var2 = this.f7425f;
                        h43 h43Var2 = this.f7426g;
                        wr wrVar2 = this.f7427h;
                        try {
                            j43 j43VarD = g43Var2.d();
                            e43 e43VarU = g43Var2.c() ? j43VarD.U(h43Var2) : j43VarD.R(h43Var2);
                            if (!e43VarU.zza()) {
                                wrVar2.zzd(new RuntimeException("No entry contents."));
                                s43.b(q43Var.f8328c);
                                return;
                            }
                            o43 o43Var = new o43(q43Var, e43VarU.c(), 1);
                            int i2 = o43Var.read();
                            if (i2 == -1) {
                                throw new IOException("Unable to read from cache.");
                            }
                            o43Var.unread(i2);
                            wrVar2.zzc(u43.a(o43Var, e43VarU.J(), e43VarU.M(), e43VarU.L(), e43VarU.K()));
                        } catch (RemoteException | IOException e2) {
                            er.zzg("Unable to obtain a cache service instance.", e2);
                            wrVar2.zzd(e2);
                            s43.b(q43Var.f8328c);
                        }
                    }
                });
                final wr wrVar2 = this.f8327b;
                wrVar2.zze(new Runnable(wrVar2, g52VarC) { // from class: com.google.android.gms.internal.ads.n43

                    /* renamed from: e, reason: collision with root package name */
                    private final wr f7653e;

                    /* renamed from: f, reason: collision with root package name */
                    private final Future f7654f;

                    {
                        this.f7653e = wrVar2;
                        this.f7654f = g52VarC;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        wr wrVar3 = this.f7653e;
                        Future future = this.f7654f;
                        if (wrVar3.isCancelled()) {
                            future.cancel(true);
                        }
                    }
                }, qr.f8451f);
            }
        }
    }
}