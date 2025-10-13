package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.view.ViewGroup;
import android.view.Window;
import com.google.android.gms.ads.AdRequest;
import java.util.Set;
import java.util.concurrent.Callable;
import okhttp3.internal.http2.Http2Connection;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class qe1 implements ah1<re1> {
    private final h52 a;

    /* renamed from: b, reason: collision with root package name */
    private final ViewGroup f8364b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f8365c;

    /* renamed from: d, reason: collision with root package name */
    private final Set<String> f8366d;

    public qe1(h52 h52Var, ViewGroup viewGroup, Context context, Set<String> set) {
        this.a = h52Var;
        this.f8366d = set;
        this.f8364b = viewGroup;
        this.f8365c = context;
    }

    final /* synthetic */ re1 a() {
        if (((Boolean) c.c().b(w3.Z3)).booleanValue() && this.f8364b != null && this.f8366d.contains("banner")) {
            return new re1(Boolean.valueOf(this.f8364b.isHardwareAccelerated()));
        }
        Boolean boolValueOf = null;
        if (((Boolean) c.c().b(w3.a4)).booleanValue() && this.f8366d.contains("native")) {
            Context context = this.f8365c;
            if (context instanceof Activity) {
                Activity activity = (Activity) context;
                Window window = activity.getWindow();
                if (window == null || (window.getAttributes().flags & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) == 0) {
                    try {
                        boolValueOf = Boolean.valueOf((activity.getPackageManager().getActivityInfo(activity.getComponentName(), 0).flags & AdRequest.MAX_CONTENT_URL_LENGTH) != 0);
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                } else {
                    boolValueOf = Boolean.TRUE;
                }
                return new re1(boolValueOf);
            }
        }
        return new re1(null);
    }

    @Override // com.google.android.gms.internal.ads.ah1
    public final g52<re1> zza() {
        return this.a.N(new Callable(this) { // from class: com.google.android.gms.internal.ads.pe1
            private final qe1 a;

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