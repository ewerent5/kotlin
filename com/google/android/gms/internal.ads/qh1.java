package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class qh1 implements ah1<rh1> {
    private final Context a;

    /* renamed from: b, reason: collision with root package name */
    private final ScheduledExecutorService f8380b;

    /* renamed from: c, reason: collision with root package name */
    private final Executor f8381c;

    /* renamed from: d, reason: collision with root package name */
    private final int f8382d;

    /* renamed from: e, reason: collision with root package name */
    private final hq f8383e;

    public qh1(hq hqVar, Context context, ScheduledExecutorService scheduledExecutorService, Executor executor, int i2, byte[] bArr) {
        this.f8383e = hqVar;
        this.a = context;
        this.f8380b = scheduledExecutorService;
        this.f8381c = executor;
        this.f8382d = i2;
    }

    final /* synthetic */ rh1 a(Throwable th) {
        ta3.a();
        ContentResolver contentResolver = this.a.getContentResolver();
        return new rh1(null, contentResolver == null ? null : Settings.Secure.getString(contentResolver, "android_id"));
    }

    @Override // com.google.android.gms.internal.ads.ah1
    public final g52<rh1> zza() {
        if (!((Boolean) c.c().b(w3.F0)).booleanValue()) {
            return y42.b(new Exception("Did not ad Ad ID into query param."));
        }
        return y42.e((p42) y42.g(y42.i(p42.D(this.f8383e.a(this.a, this.f8382d)), oh1.a, this.f8381c), ((Long) c.c().b(w3.G0)).longValue(), TimeUnit.MILLISECONDS, this.f8380b), Throwable.class, new x02(this) { // from class: com.google.android.gms.internal.ads.ph1
            private final qh1 a;

            {
                this.a = this;
            }

            @Override // com.google.android.gms.internal.ads.x02
            public final Object apply(Object obj) {
                return this.a.a((Throwable) obj);
            }
        }, this.f8381c);
    }
}