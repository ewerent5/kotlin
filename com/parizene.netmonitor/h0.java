package com.parizene.netmonitor;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

/* compiled from: UiUtils.java */
/* loaded from: classes.dex */
public class h0 {
    public static Drawable a(Drawable drawable, int i2, boolean z) {
        Drawable drawableR = androidx.core.graphics.drawable.a.r(drawable);
        if (z) {
            drawableR = drawableR.mutate();
        }
        androidx.core.graphics.drawable.a.n(drawableR, i2);
        return drawableR;
    }

    public static String b(Context context, double d2, String str) {
        Locale localeC = c(context);
        try {
            Currency currency = Currency.getInstance(str);
            NumberFormat currencyInstance = NumberFormat.getCurrencyInstance(localeC);
            currencyInstance.setCurrency(currency);
            currencyInstance.setMaximumFractionDigits(currency.getDefaultFractionDigits());
            return currencyInstance.format(d2);
        } catch (IllegalArgumentException e2) {
            m.a.a.g(e2);
            return String.format(localeC, "%s%.2f", str, Double.valueOf(d2));
        }
    }

    public static Locale c(Context context) {
        return c.h.h.b.a(context.getResources().getConfiguration()).c(0);
    }

    public static int d(Context context, int i2) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new int[]{i2});
        try {
            return typedArrayObtainStyledAttributes.getColor(0, 0);
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }
}