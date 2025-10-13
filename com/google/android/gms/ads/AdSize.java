package com.google.android.gms.ads;

import android.content.Context;
import android.os.Parcelable;
import android.util.DisplayMetrics;
import androidx.annotation.RecentlyNonNull;
import ch.qos.logback.core.net.SyslogConstants;
import com.google.android.gms.internal.ads.er;
import com.google.android.gms.internal.ads.r93;
import com.google.android.gms.internal.ads.ta3;
import com.google.android.gms.internal.ads.xq;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public final class AdSize {
    public static final int AUTO_HEIGHT = -2;
    public static final int FULL_WIDTH = -1;
    private final int zzb;
    private final int zzc;
    private final String zzd;
    private boolean zze;
    private boolean zzf;
    private int zzg;
    private boolean zzh;
    private int zzi;

    @RecentlyNonNull
    public static final AdSize BANNER = new AdSize(320, 50, "320x50_mb");

    @RecentlyNonNull
    public static final AdSize FULL_BANNER = new AdSize(468, 60, "468x60_as");

    @RecentlyNonNull
    public static final AdSize LARGE_BANNER = new AdSize(320, 100, "320x100_as");

    @RecentlyNonNull
    public static final AdSize LEADERBOARD = new AdSize(728, 90, "728x90_as");

    @RecentlyNonNull
    public static final AdSize MEDIUM_RECTANGLE = new AdSize(300, 250, "300x250_as");

    @RecentlyNonNull
    public static final AdSize WIDE_SKYSCRAPER = new AdSize(SyslogConstants.LOG_LOCAL4, 600, "160x600_as");

    @RecentlyNonNull
    @Deprecated
    public static final AdSize SMART_BANNER = new AdSize(-1, -2, "smart_banner");

    @RecentlyNonNull
    public static final AdSize FLUID = new AdSize(-3, -4, "fluid");

    @RecentlyNonNull
    public static final AdSize INVALID = new AdSize(0, 0, "invalid");

    @RecentlyNonNull
    public static final AdSize zza = new AdSize(50, 50, "50x50_mb");

    @RecentlyNonNull
    public static final AdSize SEARCH = new AdSize(-3, 0, "search_v2");

    public AdSize(int i2, int i3) {
        String strValueOf = i2 == -1 ? "FULL" : String.valueOf(i2);
        String strValueOf2 = i3 == -2 ? "AUTO" : String.valueOf(i3);
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 4 + String.valueOf(strValueOf2).length());
        sb.append(strValueOf);
        sb.append("x");
        sb.append(strValueOf2);
        sb.append("_as");
        this(i2, i3, sb.toString());
    }

    @RecentlyNonNull
    public static AdSize getCurrentOrientationAnchoredAdaptiveBannerAdSize(@RecentlyNonNull Context context, int i2) {
        AdSize adSizeH = xq.h(context, i2, 50, 0);
        adSizeH.zze = true;
        return adSizeH;
    }

    @RecentlyNonNull
    public static AdSize getCurrentOrientationInlineAdaptiveBannerAdSize(@RecentlyNonNull Context context, int i2) {
        int iJ = xq.j(context, 0);
        if (iJ == -1) {
            return INVALID;
        }
        AdSize adSize = new AdSize(i2, 0);
        adSize.zzg = iJ;
        adSize.zzf = true;
        return adSize;
    }

    @RecentlyNonNull
    public static AdSize getCurrentOrientationInterscrollerAdSize(@RecentlyNonNull Context context, int i2) {
        return zzj(i2, xq.j(context, 0));
    }

    @RecentlyNonNull
    public static AdSize getInlineAdaptiveBannerAdSize(int i2, int i3) {
        AdSize adSize = new AdSize(i2, 0);
        adSize.zzg = i3;
        adSize.zzf = true;
        if (i3 < 32) {
            StringBuilder sb = new StringBuilder(129);
            sb.append("The maximum height set for the inline adaptive ad size was ");
            sb.append(i3);
            sb.append(" dp, which is below the minimum recommended value of 32 dp.");
            er.zzi(sb.toString());
        }
        return adSize;
    }

    @RecentlyNonNull
    public static AdSize getLandscapeAnchoredAdaptiveBannerAdSize(@RecentlyNonNull Context context, int i2) {
        AdSize adSizeH = xq.h(context, i2, 50, 2);
        adSizeH.zze = true;
        return adSizeH;
    }

    @RecentlyNonNull
    public static AdSize getLandscapeInlineAdaptiveBannerAdSize(@RecentlyNonNull Context context, int i2) {
        int iJ = xq.j(context, 2);
        AdSize adSize = new AdSize(i2, 0);
        if (iJ == -1) {
            return INVALID;
        }
        adSize.zzg = iJ;
        adSize.zzf = true;
        return adSize;
    }

    @RecentlyNonNull
    public static AdSize getLandscapeInterscrollerAdSize(@RecentlyNonNull Context context, int i2) {
        return zzj(i2, xq.j(context, 2));
    }

    @RecentlyNonNull
    public static AdSize getPortraitAnchoredAdaptiveBannerAdSize(@RecentlyNonNull Context context, int i2) {
        AdSize adSizeH = xq.h(context, i2, 50, 1);
        adSizeH.zze = true;
        return adSizeH;
    }

    @RecentlyNonNull
    public static AdSize getPortraitInlineAdaptiveBannerAdSize(@RecentlyNonNull Context context, int i2) {
        int iJ = xq.j(context, 1);
        AdSize adSize = new AdSize(i2, 0);
        if (iJ == -1) {
            return INVALID;
        }
        adSize.zzg = iJ;
        adSize.zzf = true;
        return adSize;
    }

    @RecentlyNonNull
    public static AdSize getPortraitInterscrollerAdSize(@RecentlyNonNull Context context, int i2) {
        return zzj(i2, xq.j(context, 1));
    }

    private static AdSize zzj(int i2, int i3) {
        if (i3 == -1) {
            return INVALID;
        }
        AdSize adSize = new AdSize(i2, 0);
        adSize.zzi = i3;
        adSize.zzh = true;
        return adSize;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AdSize)) {
            return false;
        }
        AdSize adSize = (AdSize) obj;
        return this.zzb == adSize.zzb && this.zzc == adSize.zzc && this.zzd.equals(adSize.zzd);
    }

    public int getHeight() {
        return this.zzc;
    }

    public int getHeightInPixels(@RecentlyNonNull Context context) {
        int i2 = this.zzc;
        if (i2 == -4 || i2 == -3) {
            return -1;
        }
        if (i2 == -2) {
            return r93.c(context.getResources().getDisplayMetrics());
        }
        ta3.a();
        return xq.s(context, this.zzc);
    }

    public int getWidth() {
        return this.zzb;
    }

    public int getWidthInPixels(@RecentlyNonNull Context context) {
        int i2 = this.zzb;
        if (i2 == -3) {
            return -1;
        }
        if (i2 != -1) {
            ta3.a();
            return xq.s(context, this.zzb);
        }
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        Parcelable.Creator<r93> creator = r93.CREATOR;
        return displayMetrics.widthPixels;
    }

    public int hashCode() {
        return this.zzd.hashCode();
    }

    public boolean isAutoHeight() {
        return this.zzc == -2;
    }

    public boolean isFluid() {
        return this.zzb == -3 && this.zzc == -4;
    }

    public boolean isFullWidth() {
        return this.zzb == -1;
    }

    @RecentlyNonNull
    public String toString() {
        return this.zzd;
    }

    final boolean zza() {
        return this.zze;
    }

    final boolean zzb() {
        return this.zzf;
    }

    final void zzc(boolean z) {
        this.zzf = true;
    }

    final void zzd(int i2) {
        this.zzg = i2;
    }

    final int zze() {
        return this.zzg;
    }

    final boolean zzf() {
        return this.zzh;
    }

    final void zzg(boolean z) {
        this.zzh = true;
    }

    final int zzh() {
        return this.zzi;
    }

    final void zzi(int i2) {
        this.zzi = i2;
    }

    AdSize(int i2, int i3, String str) {
        if (i2 < 0 && i2 != -1 && i2 != -3) {
            StringBuilder sb = new StringBuilder(37);
            sb.append("Invalid width for AdSize: ");
            sb.append(i2);
            throw new IllegalArgumentException(sb.toString());
        }
        if (i3 < 0 && i3 != -2 && i3 != -4) {
            StringBuilder sb2 = new StringBuilder(38);
            sb2.append("Invalid height for AdSize: ");
            sb2.append(i3);
            throw new IllegalArgumentException(sb2.toString());
        }
        this.zzb = i2;
        this.zzc = i3;
        this.zzd = str;
    }
}