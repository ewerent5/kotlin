package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class vq2 extends pr2 {
    public vq2(gq2 gq2Var, String str, String str2, eu0 eu0Var, int i2, int i3) {
        super(gq2Var, "HDBr8nc5ubdBn1y5M6IpuatOFh1+XK9blifaQQrU1HNvfw3hhdVJEUnkWE7sod57", "A6vbZ9nEwiHcLSfXI6B1ZE45FocqpxNzrogO6LWG5xM=", eu0Var, i2, 24);
    }

    private final void c() throws ExecutionException, InterruptedException, TimeoutException {
        AdvertisingIdClient advertisingIdClientR = this.f8253b.r();
        if (advertisingIdClientR == null) {
            return;
        }
        try {
            AdvertisingIdClient.Info info = advertisingIdClientR.getInfo();
            String strA = jq2.a(info.getId());
            if (strA != null) {
                synchronized (this.f8256e) {
                    this.f8256e.O(strA);
                    this.f8256e.Q(info.isLimitAdTrackingEnabled());
                    this.f8256e.P(k01.DEVICE_IDENTIFIER_ANDROID_AD_ID);
                }
            }
        } catch (IOException unused) {
        }
    }

    @Override // com.google.android.gms.internal.ads.pr2
    protected final void a() throws ExecutionException, InterruptedException, TimeoutException {
        if (this.f8253b.h()) {
            c();
            return;
        }
        synchronized (this.f8256e) {
            this.f8256e.O((String) this.f8257f.invoke(null, this.f8253b.b()));
        }
    }

    @Override // com.google.android.gms.internal.ads.pr2
    public final Void b() throws ExecutionException, InterruptedException, TimeoutException {
        if (this.f8253b.c()) {
            super.b();
            return null;
        }
        if (this.f8253b.h()) {
            c();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.pr2, java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        b();
        return null;
    }
}