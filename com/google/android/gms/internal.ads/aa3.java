package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.R;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public final class aa3 {
    private final AdSize[] a;

    /* renamed from: b, reason: collision with root package name */
    private final String f4889b;

    public aa3(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, R.styleable.AdsAttrs);
        String string = typedArrayObtainAttributes.getString(R.styleable.AdsAttrs_adSize);
        String string2 = typedArrayObtainAttributes.getString(R.styleable.AdsAttrs_adSizes);
        boolean z = !TextUtils.isEmpty(string);
        boolean z2 = !TextUtils.isEmpty(string2);
        if (z && !z2) {
            this.a = c(string);
        } else {
            if (z || !z2) {
                if (z) {
                    typedArrayObtainAttributes.recycle();
                    throw new IllegalArgumentException("Either XML attribute \"adSize\" or XML attribute \"supportedAdSizes\" should be specified, but not both.");
                }
                typedArrayObtainAttributes.recycle();
                throw new IllegalArgumentException("Required XML attribute \"adSize\" was missing.");
            }
            this.a = c(string2);
        }
        String string3 = typedArrayObtainAttributes.getString(R.styleable.AdsAttrs_adUnitId);
        this.f4889b = string3;
        typedArrayObtainAttributes.recycle();
        if (TextUtils.isEmpty(string3)) {
            throw new IllegalArgumentException("Required XML attribute \"adUnitId\" was missing.");
        }
    }

    private static AdSize[] c(String str) {
        String[] strArrSplit = str.split("\\s*,\\s*");
        int length = strArrSplit.length;
        AdSize[] adSizeArr = new AdSize[length];
        for (int i2 = 0; i2 < strArrSplit.length; i2++) {
            String strTrim = strArrSplit[i2].trim();
            if (strTrim.matches("^(\\d+|FULL_WIDTH)\\s*[xX]\\s*(\\d+|AUTO_HEIGHT)$")) {
                String[] strArrSplit2 = strTrim.split("[xX]");
                strArrSplit2[0] = strArrSplit2[0].trim();
                strArrSplit2[1] = strArrSplit2[1].trim();
                try {
                    adSizeArr[i2] = new AdSize("FULL_WIDTH".equals(strArrSplit2[0]) ? -1 : Integer.parseInt(strArrSplit2[0]), "AUTO_HEIGHT".equals(strArrSplit2[1]) ? -2 : Integer.parseInt(strArrSplit2[1]));
                } catch (NumberFormatException unused) {
                    throw new IllegalArgumentException(strTrim.length() != 0 ? "Could not parse XML attribute \"adSize\": ".concat(strTrim) : new String("Could not parse XML attribute \"adSize\": "));
                }
            } else if ("BANNER".equals(strTrim)) {
                adSizeArr[i2] = AdSize.BANNER;
            } else if ("LARGE_BANNER".equals(strTrim)) {
                adSizeArr[i2] = AdSize.LARGE_BANNER;
            } else if ("FULL_BANNER".equals(strTrim)) {
                adSizeArr[i2] = AdSize.FULL_BANNER;
            } else if ("LEADERBOARD".equals(strTrim)) {
                adSizeArr[i2] = AdSize.LEADERBOARD;
            } else if ("MEDIUM_RECTANGLE".equals(strTrim)) {
                adSizeArr[i2] = AdSize.MEDIUM_RECTANGLE;
            } else if ("SMART_BANNER".equals(strTrim)) {
                adSizeArr[i2] = AdSize.SMART_BANNER;
            } else if ("WIDE_SKYSCRAPER".equals(strTrim)) {
                adSizeArr[i2] = AdSize.WIDE_SKYSCRAPER;
            } else if ("FLUID".equals(strTrim)) {
                adSizeArr[i2] = AdSize.FLUID;
            } else {
                if (!"ICON".equals(strTrim)) {
                    throw new IllegalArgumentException(strTrim.length() != 0 ? "Could not parse XML attribute \"adSize\": ".concat(strTrim) : new String("Could not parse XML attribute \"adSize\": "));
                }
                adSizeArr[i2] = AdSize.zza;
            }
        }
        if (length == 0) {
            throw new IllegalArgumentException(str.length() != 0 ? "Could not parse XML attribute \"adSize\": ".concat(str) : new String("Could not parse XML attribute \"adSize\": "));
        }
        return adSizeArr;
    }

    public final AdSize[] a(boolean z) {
        if (z || this.a.length == 1) {
            return this.a;
        }
        throw new IllegalArgumentException("The adSizes XML attribute is only allowed on PublisherAdViews.");
    }

    public final String b() {
        return this.f4889b;
    }
}