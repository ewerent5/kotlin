package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.RemoteException;
import com.google.android.gms.ads.h5.OnH5AdsEventListener;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public final class eb {
    private final Context a;

    /* renamed from: b, reason: collision with root package name */
    private final OnH5AdsEventListener f5609b;

    /* renamed from: c, reason: collision with root package name */
    private ab f5610c;

    public eb(Context context, OnH5AdsEventListener onH5AdsEventListener) {
        com.google.android.gms.common.internal.p.n(Build.VERSION.SDK_INT >= 21, "Android version must be Lollipop or higher");
        com.google.android.gms.common.internal.p.j(context);
        com.google.android.gms.common.internal.p.j(onH5AdsEventListener);
        this.a = context;
        this.f5609b = onH5AdsEventListener;
    }

    public static final boolean c(String str) {
        if (!((Boolean) c.c().b(w3.f6)).booleanValue()) {
            return false;
        }
        com.google.android.gms.common.internal.p.j(str);
        if (str.length() > ((Integer) c.c().b(w3.h6)).intValue()) {
            er.zzd("H5 GMSG exceeds max length");
            return false;
        }
        Uri uri = Uri.parse(str);
        return "gmsg".equals(uri.getScheme()) && "mobileads.google.com".equals(uri.getHost()) && "/h5ads".equals(uri.getPath());
    }

    private final void d() {
        if (this.f5610c != null) {
            return;
        }
        this.f5610c = ta3.b().j(this.a, new pf(), this.f5609b);
    }

    public final boolean a(String str) {
        if (!c(str)) {
            return false;
        }
        d();
        ab abVar = this.f5610c;
        if (abVar == null) {
            return false;
        }
        try {
            abVar.zze(str);
            return true;
        } catch (RemoteException e2) {
            er.zzl("#007 Could not call remote method.", e2);
            return true;
        }
    }

    public final void b() {
        if (((Boolean) c.c().b(w3.f6)).booleanValue()) {
            d();
            ab abVar = this.f5610c;
            if (abVar != null) {
                try {
                    abVar.zzf();
                } catch (RemoteException e2) {
                    er.zzl("#007 Could not call remote method.", e2);
                }
            }
        }
    }
}