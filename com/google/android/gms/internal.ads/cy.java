package com.google.android.gms.internal.ads;

import android.app.NotificationManager;
import android.content.Context;
import com.google.android.gms.ads.internal.util.zzd;
import com.google.android.gms.ads.internal.zzs;
import com.google.android.gms.ads.nonagon.signalgeneration.zza;
import com.google.android.gms.ads.nonagon.signalgeneration.zzp;
import java.util.Arrays;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public abstract class cy implements q10 {

    @GuardedBy("AppComponent.class")
    private static cy a;

    public static cy d(Context context, tf tfVar, int i2) {
        cy cyVarE = e(context, i2);
        cyVarE.l().a(tfVar);
        return cyVarE;
    }

    @Deprecated
    public static cy e(Context context, int i2) {
        synchronized (cy.class) {
            cy cyVar = a;
            return cyVar != null ? cyVar : f(new kr(210890000, i2, true, false), context, new cz());
        }
    }

    @Deprecated
    public static synchronized cy f(kr krVar, Context context, q00 q00Var) {
        if (a == null) {
            xz xzVar = new xz(null);
            ey eyVar = new ey();
            eyVar.a(krVar);
            eyVar.b(context);
            xzVar.a(new fy(eyVar, null));
            xzVar.b(new r00(q00Var));
            a = xzVar.c();
            w3.a(context);
            zzs.zzg().e(context, krVar);
            zzs.zzi().a(context);
            zzs.zzc().zzc(context);
            zzs.zzc().zzd(context);
            zzs.zzc().zzn(context);
            zzd.zza(context);
            zzs.zzf().a(context);
            zzs.zzc();
            if (com.google.android.gms.common.util.n.k() && !Arrays.asList(context.databaseList()).contains("AdMobOfflineBufferedPings.db")) {
                ((NotificationManager) context.getSystemService("notification")).deleteNotificationChannel("offline_notification_channel");
            }
            zzs.zzx().zza(context);
            lp.d(context);
            if (((Boolean) c.c().b(w3.o4)).booleanValue()) {
                if (!((Boolean) c.c().b(w3.p0)).booleanValue()) {
                    w43 w43Var = new w43(new c53(context));
                    w11 w11Var = new w11(new s11(context), a.j());
                    zzs.zzc();
                    new p21(context, krVar, w43Var, w11Var, UUID.randomUUID().toString(), a.g()).a(zzs.zzg().l().zzB());
                }
            }
        }
        return a;
    }

    public abstract iq1<pq0> A();

    public abstract gx0 B();

    @Override // com.google.android.gms.internal.ads.q10
    public final th1 a(ql qlVar, int i2) {
        return b(new bj1(qlVar, i2));
    }

    protected abstract th1 b(bj1 bj1Var);

    public abstract vv0 c();

    public abstract cu1 g();

    public abstract Executor h();

    public abstract ScheduledExecutorService i();

    public abstract h52 j();

    public abstract ed0 k();

    public abstract js0 l();

    public abstract y00 m();

    public abstract o50 n();

    public abstract il1 o();

    public abstract s30 p();

    public abstract d40 q();

    public abstract wj1 r();

    public abstract ij0 s();

    public abstract cn1 t();

    public abstract fk0 u();

    public abstract cr0 v();

    public abstract qo1 w();

    public abstract zza x();

    public abstract zzp y();

    public abstract f31 z();
}