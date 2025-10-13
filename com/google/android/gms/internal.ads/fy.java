package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzi;
import com.google.android.gms.ads.internal.zzs;
import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class fy {
    private final kr a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f5966b;

    /* renamed from: c, reason: collision with root package name */
    private final WeakReference<Context> f5967c;

    /* synthetic */ fy(ey eyVar, dy dyVar) {
        this.a = eyVar.a;
        this.f5966b = eyVar.f5741b;
        this.f5967c = eyVar.f5742c;
    }

    final Context a() {
        return this.f5966b;
    }

    final WeakReference<Context> b() {
        return this.f5967c;
    }

    final kr c() {
        return this.a;
    }

    final String d() {
        return zzs.zzc().zze(this.f5966b, this.a.f7054e);
    }

    public final ip2 e() {
        return new ip2(new zzi(this.f5966b, this.a));
    }
}