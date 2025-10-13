package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final /* synthetic */ class m43 implements Runnable {

    /* renamed from: e */
    private final q43 f7424e;

    /* renamed from: f */
    private final g43 f7425f;

    /* renamed from: g */
    private final h43 f7426g;

    /* renamed from: h */
    private final wr f7427h;

    m43(q43 q43Var, g43 g43Var, h43 h43Var, wr wrVar) {
        this.f7424e = q43Var;
        this.f7425f = g43Var;
        this.f7426g = h43Var;
        this.f7427h = wrVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws IOException {
        q43 q43Var = this.f7424e;
        g43 g43Var = this.f7425f;
        h43 h43Var = this.f7426g;
        wr wrVar = this.f7427h;
        try {
            j43 j43VarD = g43Var.d();
            e43 e43VarU = g43Var.c() ? j43VarD.U(h43Var) : j43VarD.R(h43Var);
            if (!e43VarU.zza()) {
                wrVar.zzd(new RuntimeException("No entry contents."));
                s43.b(q43Var.f8328c);
                return;
            }
            o43 o43Var = new o43(q43Var, e43VarU.c(), 1);
            int i2 = o43Var.read();
            if (i2 == -1) {
                throw new IOException("Unable to read from cache.");
            }
            o43Var.unread(i2);
            wrVar.zzc(u43.a(o43Var, e43VarU.J(), e43VarU.M(), e43VarU.L(), e43VarU.K()));
        } catch (RemoteException | IOException e2) {
            er.zzg("Unable to obtain a cache service instance.", e2);
            wrVar.zzd(e2);
            s43.b(q43Var.f8328c);
        }
    }
}