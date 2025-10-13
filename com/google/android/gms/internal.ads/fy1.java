package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Base64;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.nio.ByteBuffer;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class fy1 {
    private final Context a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f5968b;

    /* renamed from: c, reason: collision with root package name */
    private final lx1 f5969c;

    /* renamed from: d, reason: collision with root package name */
    private final nx1 f5970d;

    /* renamed from: e, reason: collision with root package name */
    private final ey1 f5971e;

    /* renamed from: f, reason: collision with root package name */
    private final ey1 f5972f;

    /* renamed from: g, reason: collision with root package name */
    private e.c.b.b.e.h<u91> f5973g;

    /* renamed from: h, reason: collision with root package name */
    private e.c.b.b.e.h<u91> f5974h;

    fy1(Context context, Executor executor, lx1 lx1Var, nx1 nx1Var, cy1 cy1Var, dy1 dy1Var) {
        this.a = context;
        this.f5968b = executor;
        this.f5969c = lx1Var;
        this.f5970d = nx1Var;
        this.f5971e = cy1Var;
        this.f5972f = dy1Var;
    }

    public static fy1 a(Context context, Executor executor, lx1 lx1Var, nx1 nx1Var) {
        final fy1 fy1Var = new fy1(context, executor, lx1Var, nx1Var, new cy1(), new dy1());
        if (fy1Var.f5970d.b()) {
            fy1Var.f5973g = fy1Var.g(new Callable(fy1Var) { // from class: com.google.android.gms.internal.ads.zx1
                private final fy1 a;

                {
                    this.a = fy1Var;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.a.f();
                }
            });
        } else {
            fy1Var.f5973g = e.c.b.b.e.k.d(fy1Var.f5971e.zza());
        }
        fy1Var.f5974h = fy1Var.g(new Callable(fy1Var) { // from class: com.google.android.gms.internal.ads.ay1
            private final fy1 a;

            {
                this.a = fy1Var;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.e();
            }
        });
        return fy1Var;
    }

    private final e.c.b.b.e.h<u91> g(Callable<u91> callable) {
        return e.c.b.b.e.k.b(this.f5968b, callable).d(this.f5968b, new e.c.b.b.e.d(this) { // from class: com.google.android.gms.internal.ads.by1
            private final fy1 a;

            {
                this.a = this;
            }

            @Override // e.c.b.b.e.d
            public final void a(Exception exc) {
                this.a.d(exc);
            }
        });
    }

    private static u91 h(e.c.b.b.e.h<u91> hVar, u91 u91Var) {
        return !hVar.n() ? u91Var : hVar.k();
    }

    public final u91 b() {
        return h(this.f5973g, this.f5971e.zza());
    }

    public final u91 c() {
        return h(this.f5974h, this.f5972f.zza());
    }

    final /* synthetic */ void d(Exception exc) {
        if (exc instanceof InterruptedException) {
            Thread.currentThread().interrupt();
        }
        this.f5969c.d(2025, -1L, exc);
    }

    final /* synthetic */ u91 e() throws PackageManager.NameNotFoundException {
        Context context = this.a;
        return ux1.a(context, context.getPackageName(), Integer.toString(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode));
    }

    final /* synthetic */ u91 f() {
        Context context = this.a;
        eu0 eu0VarZ0 = u91.z0();
        AdvertisingIdClient advertisingIdClient = new AdvertisingIdClient(context);
        advertisingIdClient.start();
        AdvertisingIdClient.Info info = advertisingIdClient.getInfo();
        String id = info.getId();
        if (id != null && id.matches("^[a-fA-F0-9]{8}-([a-fA-F0-9]{4}-){3}[a-fA-F0-9]{12}$")) {
            UUID uuidFromString = UUID.fromString(id);
            byte[] bArr = new byte[16];
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
            byteBufferWrap.putLong(uuidFromString.getMostSignificantBits());
            byteBufferWrap.putLong(uuidFromString.getLeastSignificantBits());
            id = Base64.encodeToString(bArr, 11);
        }
        if (id != null) {
            eu0VarZ0.O(id);
            eu0VarZ0.Q(info.isLimitAdTrackingEnabled());
            eu0VarZ0.P(k01.DEVICE_IDENTIFIER_ANDROID_AD_ID);
        }
        return eu0VarZ0.n();
    }
}