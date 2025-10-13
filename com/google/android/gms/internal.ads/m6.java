package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.NativeAd;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public final class m6 extends NativeAd.AdChoicesInfo {
    private final l6 a;

    /* renamed from: b, reason: collision with root package name */
    private final List<NativeAd.Image> f7433b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private String f7434c;

    public m6(l6 l6Var) {
        IBinder iBinder;
        this.a = l6Var;
        try {
            this.f7434c = l6Var.zzb();
        } catch (RemoteException e2) {
            er.zzg("", e2);
            this.f7434c = "";
        }
        try {
            for (t6 t6Var : l6Var.zzc()) {
                t6 r6Var = null;
                if ((t6Var instanceof IBinder) && (iBinder = (IBinder) t6Var) != null) {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
                    r6Var = iInterfaceQueryLocalInterface instanceof t6 ? (t6) iInterfaceQueryLocalInterface : new r6(iBinder);
                }
                if (r6Var != null) {
                    this.f7433b.add(new u6(r6Var));
                }
            }
        } catch (RemoteException e3) {
            er.zzg("", e3);
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.AdChoicesInfo
    public final List<NativeAd.Image> getImages() {
        return this.f7433b;
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.AdChoicesInfo
    public final CharSequence getText() {
        return this.f7434c;
    }
}