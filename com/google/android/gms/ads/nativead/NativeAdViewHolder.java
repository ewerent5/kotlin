package com.google.android.gms.ads.nativead;

import android.os.RemoteException;
import android.view.View;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.p;
import com.google.android.gms.internal.ads.b7;
import com.google.android.gms.internal.ads.er;
import com.google.android.gms.internal.ads.ta3;
import e.c.b.b.b.d;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public final class NativeAdViewHolder {

    @RecentlyNonNull
    public static WeakHashMap<View, NativeAdViewHolder> zza = new WeakHashMap<>();

    @NotOnlyInitialized
    private b7 zzb;
    private WeakReference<View> zzc;

    public NativeAdViewHolder(@RecentlyNonNull View view, @RecentlyNonNull Map<String, View> map, @RecentlyNonNull Map<String, View> map2) {
        p.k(view, "ContainerView must not be null");
        if (view instanceof NativeAdView) {
            er.zzf("The provided containerView is of type of NativeAdView, which cannot be usedwith NativeAdViewHolder.");
            return;
        }
        if (zza.get(view) != null) {
            er.zzf("The provided containerView is already in use with another NativeAdViewHolder.");
            return;
        }
        zza.put(view, this);
        this.zzc = new WeakReference<>(view);
        this.zzb = ta3.b().e(view, zza(map), zza(map2));
    }

    private static final HashMap<String, View> zza(Map<String, View> map) {
        return map == null ? new HashMap<>() : new HashMap<>(map);
    }

    public final void setClickConfirmingView(@RecentlyNonNull View view) {
        try {
            this.zzb.v(d.m4(view));
        } catch (RemoteException e2) {
            er.zzg("Unable to call setClickConfirmingView on delegate", e2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [e.c.b.b.b.b, java.lang.Object] */
    public void setNativeAd(@RecentlyNonNull NativeAd nativeAd) {
        ?? Zza = nativeAd.zza();
        WeakReference<View> weakReference = this.zzc;
        View view = weakReference != null ? weakReference.get() : null;
        if (view == null) {
            er.zzi("NativeAdViewHolder.setNativeAd containerView doesn't exist, returning");
            return;
        }
        if (!zza.containsKey(view)) {
            zza.put(view, this);
        }
        b7 b7Var = this.zzb;
        if (b7Var != 0) {
            try {
                b7Var.k(Zza);
            } catch (RemoteException e2) {
                er.zzg("Unable to call setNativeAd on delegate", e2);
            }
        }
    }

    public void unregisterNativeAd() {
        b7 b7Var = this.zzb;
        if (b7Var != null) {
            try {
                b7Var.zzc();
            } catch (RemoteException e2) {
                er.zzg("Unable to call unregisterNativeAd on delegate", e2);
            }
        }
        WeakReference<View> weakReference = this.zzc;
        View view = weakReference != null ? weakReference.get() : null;
        if (view != null) {
            zza.remove(view);
        }
    }
}