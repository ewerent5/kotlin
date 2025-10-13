package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.nativead.NativeAd;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public final class xi extends NativeAd.AdChoicesInfo {
    private final List<NativeAd.Image> a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private String f10170b;

    public xi(l6 l6Var) {
        try {
            this.f10170b = l6Var.zzb();
        } catch (RemoteException e2) {
            er.zzg("", e2);
            this.f10170b = "";
        }
        try {
            for (t6 t6Var : l6Var.zzc()) {
                t6 t6VarI4 = t6Var instanceof IBinder ? s6.I4((IBinder) t6Var) : null;
                if (t6VarI4 != null) {
                    this.a.add(new zi(t6VarI4));
                }
            }
        } catch (RemoteException e3) {
            er.zzg("", e3);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd.AdChoicesInfo
    public final List<NativeAd.Image> getImages() {
        return this.a;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd.AdChoicesInfo
    public final CharSequence getText() {
        return this.f10170b;
    }
}