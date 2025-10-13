package e.c.b.b.c.e;

import android.app.Activity;
import android.os.Bundle;
import e.c.b.b.c.e.h;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@18.0.0 */
/* loaded from: classes.dex */
final class i0 extends h.a {

    /* renamed from: i, reason: collision with root package name */
    private final /* synthetic */ Bundle f14599i;

    /* renamed from: j, reason: collision with root package name */
    private final /* synthetic */ Activity f14600j;

    /* renamed from: k, reason: collision with root package name */
    private final /* synthetic */ h.b f14601k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    i0(h.b bVar, Bundle bundle, Activity activity) {
        super(h.this);
        this.f14601k = bVar;
        this.f14599i = bundle;
        this.f14600j = activity;
    }

    @Override // e.c.b.b.c.e.h.a
    final void a() {
        Bundle bundle;
        if (this.f14599i != null) {
            bundle = new Bundle();
            if (this.f14599i.containsKey("com.google.app_measurement.screen_service")) {
                Object obj = this.f14599i.get("com.google.app_measurement.screen_service");
                if (obj instanceof Bundle) {
                    bundle.putBundle("com.google.app_measurement.screen_service", (Bundle) obj);
                }
            }
        } else {
            bundle = null;
        }
        h.this.f14570m.onActivityCreated(e.c.b.b.b.d.m4(this.f14600j), bundle, this.f14572f);
    }
}