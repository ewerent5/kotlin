package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import com.google.android.gms.ads.internal.util.zzac;
import com.google.android.gms.ads.internal.util.zzr;
import com.google.android.gms.ads.internal.zzs;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class pg1 implements ah1<qg1> {
    private final h52 a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f8154b;

    /* renamed from: c, reason: collision with root package name */
    private final kr f8155c;

    public pg1(h52 h52Var, Context context, kr krVar) {
        this.a = h52Var;
        this.f8154b = context;
        this.f8155c = krVar;
    }

    final /* synthetic */ qg1 a() {
        boolean zG = com.google.android.gms.common.p.c.a(this.f8154b).g();
        zzs.zzc();
        boolean zZzG = zzr.zzG(this.f8154b);
        String str = this.f8155c.f7054e;
        zzs.zze();
        boolean zZzu = zzac.zzu();
        zzs.zzc();
        ApplicationInfo applicationInfo = this.f8154b.getApplicationInfo();
        return new qg1(zG, zZzG, str, zZzu, applicationInfo == null ? 0 : applicationInfo.targetSdkVersion, DynamiteModule.c(this.f8154b, ModuleDescriptor.MODULE_ID), DynamiteModule.a(this.f8154b, ModuleDescriptor.MODULE_ID));
    }

    @Override // com.google.android.gms.internal.ads.ah1
    public final g52<qg1> zza() {
        return this.a.N(new Callable(this) { // from class: com.google.android.gms.internal.ads.og1
            private final pg1 a;

            {
                this.a = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.a();
            }
        });
    }
}