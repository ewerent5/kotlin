package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class wm0 implements View.OnClickListener {

    /* renamed from: e, reason: collision with root package name */
    private final pq0 f9990e;

    /* renamed from: f, reason: collision with root package name */
    private final com.google.android.gms.common.util.f f9991f;

    /* renamed from: g, reason: collision with root package name */
    private l8 f9992g;

    /* renamed from: h, reason: collision with root package name */
    private ba<Object> f9993h;

    /* renamed from: i, reason: collision with root package name */
    String f9994i;

    /* renamed from: j, reason: collision with root package name */
    Long f9995j;

    /* renamed from: k, reason: collision with root package name */
    WeakReference<View> f9996k;

    public wm0(pq0 pq0Var, com.google.android.gms.common.util.f fVar) {
        this.f9990e = pq0Var;
        this.f9991f = fVar;
    }

    private final void e() {
        View view;
        this.f9994i = null;
        this.f9995j = null;
        WeakReference<View> weakReference = this.f9996k;
        if (weakReference == null || (view = weakReference.get()) == null) {
            return;
        }
        view.setClickable(false);
        view.setOnClickListener(null);
        this.f9996k = null;
    }

    public final void b(final l8 l8Var) {
        this.f9992g = l8Var;
        ba<Object> baVar = this.f9993h;
        if (baVar != null) {
            this.f9990e.e("/unconfirmedClick", baVar);
        }
        ba<Object> baVar2 = new ba(this, l8Var) { // from class: com.google.android.gms.internal.ads.vm0
            private final wm0 a;

            /* renamed from: b, reason: collision with root package name */
            private final l8 f9738b;

            {
                this.a = this;
                this.f9738b = l8Var;
            }

            @Override // com.google.android.gms.internal.ads.ba
            public final void a(Object obj, Map map) {
                wm0 wm0Var = this.a;
                l8 l8Var2 = this.f9738b;
                try {
                    wm0Var.f9995j = Long.valueOf(Long.parseLong((String) map.get("timestamp")));
                } catch (NumberFormatException unused) {
                    er.zzf("Failed to call parse unconfirmedClickTimestamp.");
                }
                wm0Var.f9994i = (String) map.get("id");
                String str = (String) map.get("asset_id");
                if (l8Var2 == null) {
                    er.zzd("Received unconfirmed click but UnconfirmedClickListener is null.");
                    return;
                }
                try {
                    l8Var2.zze(str);
                } catch (RemoteException e2) {
                    er.zzl("#007 Could not call remote method.", e2);
                }
            }
        };
        this.f9993h = baVar2;
        this.f9990e.d("/unconfirmedClick", baVar2);
    }

    public final l8 c() {
        return this.f9992g;
    }

    public final void d() {
        if (this.f9992g == null || this.f9995j == null) {
            return;
        }
        e();
        try {
            this.f9992g.zzf();
        } catch (RemoteException e2) {
            er.zzl("#007 Could not call remote method.", e2);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        WeakReference<View> weakReference = this.f9996k;
        if (weakReference == null || weakReference.get() != view) {
            return;
        }
        if (this.f9994i != null && this.f9995j != null) {
            HashMap map = new HashMap();
            map.put("id", this.f9994i);
            map.put("time_interval", String.valueOf(this.f9991f.a() - this.f9995j.longValue()));
            map.put("messageType", "onePointFiveClick");
            this.f9990e.f("sendMessageToNativeJs", map);
        }
        e();
    }
}