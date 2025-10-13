package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import com.google.android.gms.internal.ads.es;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class zzby {
    private final View zza;
    private Activity zzb;
    private boolean zzc;
    private boolean zzd;
    private boolean zze;
    private final ViewTreeObserver.OnGlobalLayoutListener zzf;

    public zzby(Activity activity, View view, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener onScrollChangedListener) {
        this.zzb = activity;
        this.zza = view;
        this.zzf = onGlobalLayoutListener;
    }

    private final void zzf() {
        ViewTreeObserver viewTreeObserverZzh;
        if (this.zzc) {
            return;
        }
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = this.zzf;
        Activity activity = this.zzb;
        if (activity != null && (viewTreeObserverZzh = zzh(activity)) != null) {
            viewTreeObserverZzh.addOnGlobalLayoutListener(onGlobalLayoutListener);
        }
        com.google.android.gms.ads.internal.zzs.zzz();
        es.a(this.zza, this.zzf);
        this.zzc = true;
    }

    private final void zzg() {
        Activity activity = this.zzb;
        if (activity != null && this.zzc) {
            ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = this.zzf;
            ViewTreeObserver viewTreeObserverZzh = zzh(activity);
            if (viewTreeObserverZzh != null) {
                com.google.android.gms.ads.internal.zzs.zze();
                viewTreeObserverZzh.removeOnGlobalLayoutListener(onGlobalLayoutListener);
            }
            this.zzc = false;
        }
    }

    private static ViewTreeObserver zzh(Activity activity) {
        View decorView;
        Window window = activity.getWindow();
        if (window == null || (decorView = window.getDecorView()) == null) {
            return null;
        }
        return decorView.getViewTreeObserver();
    }

    public final void zza(Activity activity) {
        this.zzb = activity;
    }

    public final void zzb() {
        this.zze = true;
        if (this.zzd) {
            zzf();
        }
    }

    public final void zzc() {
        this.zze = false;
        zzg();
    }

    public final void zzd() {
        this.zzd = true;
        if (this.zze) {
            zzf();
        }
    }

    public final void zze() {
        this.zzd = false;
        zzg();
    }
}