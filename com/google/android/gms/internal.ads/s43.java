package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import com.google.android.gms.ads.internal.zzs;
import java.util.concurrent.Future;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class s43 {

    @GuardedBy("lock")
    private g43 a;

    /* renamed from: b, reason: collision with root package name */
    @GuardedBy("lock")
    private boolean f8814b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f8815c;

    /* renamed from: d, reason: collision with root package name */
    private final Object f8816d = new Object();

    s43(Context context) {
        this.f8815c = context;
    }

    static /* synthetic */ void b(s43 s43Var) {
        synchronized (s43Var.f8816d) {
            g43 g43Var = s43Var.a;
            if (g43Var == null) {
                return;
            }
            g43Var.disconnect();
            s43Var.a = null;
            Binder.flushPendingCommands();
        }
    }

    static /* synthetic */ boolean e(s43 s43Var, boolean z) {
        s43Var.f8814b = true;
        return true;
    }

    final Future<u43> a(h43 h43Var) {
        l43 l43Var = new l43(this);
        q43 q43Var = new q43(this, h43Var, l43Var);
        r43 r43Var = new r43(this, l43Var);
        synchronized (this.f8816d) {
            g43 g43Var = new g43(this.f8815c, zzs.zzq().zza(), q43Var, r43Var);
            this.a = g43Var;
            g43Var.checkAvailabilityAndConnect();
        }
        return l43Var;
    }
}