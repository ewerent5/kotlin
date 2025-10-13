package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageInfo;
import ch.qos.logback.core.CoreConstants;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class eq2 implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ int f5687e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ gq2 f5688f;

    eq2(gq2 gq2Var, int i2, boolean z) {
        this.f5688f = gq2Var;
        this.f5687e = i2;
    }

    @Override // java.lang.Runnable
    public final void run() throws InterruptedException {
        u91 u91VarA;
        gq2 gq2Var = this.f5688f;
        if (this.f5687e > 0) {
            try {
                Thread.sleep(r1 * CoreConstants.MILLIS_IN_ONE_SECOND);
            } catch (InterruptedException unused) {
            }
        }
        try {
            PackageInfo packageInfo = gq2Var.f6158b.getPackageManager().getPackageInfo(gq2Var.f6158b.getPackageName(), 0);
            Context context = gq2Var.f6158b;
            u91VarA = ux1.a(context, context.getPackageName(), Integer.toString(packageInfo.versionCode));
        } catch (Throwable unused2) {
            u91VarA = null;
        }
        this.f5688f.f6167k = u91VarA;
        if (this.f5687e < 4) {
            if (u91VarA != null && u91VarA.e0() && !u91VarA.s0().equals("0000000000000000000000000000000000000000000000000000000000000000") && u91VarA.w0() && u91VarA.x0().D() && u91VarA.x0().E() != -2) {
                return;
            }
            this.f5688f.q(this.f5687e + 1, true);
        }
    }
}