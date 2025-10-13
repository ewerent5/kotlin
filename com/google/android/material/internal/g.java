package com.google.android.material.internal;

import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import java.lang.reflect.Constructor;

/* compiled from: StaticLayoutBuilderCompat.java */
/* loaded from: classes.dex */
final class g {
    private static boolean a;

    /* renamed from: b, reason: collision with root package name */
    private static Constructor<StaticLayout> f11695b;

    /* renamed from: c, reason: collision with root package name */
    private static Object f11696c;

    /* renamed from: d, reason: collision with root package name */
    private CharSequence f11697d;

    /* renamed from: e, reason: collision with root package name */
    private final TextPaint f11698e;

    /* renamed from: f, reason: collision with root package name */
    private final int f11699f;

    /* renamed from: h, reason: collision with root package name */
    private int f11701h;

    /* renamed from: l, reason: collision with root package name */
    private boolean f11705l;

    /* renamed from: g, reason: collision with root package name */
    private int f11700g = 0;

    /* renamed from: i, reason: collision with root package name */
    private Layout.Alignment f11702i = Layout.Alignment.ALIGN_NORMAL;

    /* renamed from: j, reason: collision with root package name */
    private int f11703j = Integer.MAX_VALUE;

    /* renamed from: k, reason: collision with root package name */
    private boolean f11704k = true;

    /* renamed from: m, reason: collision with root package name */
    private TextUtils.TruncateAt f11706m = null;

    /* compiled from: StaticLayoutBuilderCompat.java */
    static class a extends Exception {
        a(Throwable th) {
            super("Error thrown initializing StaticLayout " + th.getMessage(), th);
        }
    }

    private g(CharSequence charSequence, TextPaint textPaint, int i2) {
        this.f11697d = charSequence;
        this.f11698e = textPaint;
        this.f11699f = i2;
        this.f11701h = charSequence.length();
    }

    private void b() throws a, NoSuchMethodException, SecurityException, ClassNotFoundException {
        Class<?> cls;
        if (a) {
            return;
        }
        try {
            boolean z = this.f11705l && Build.VERSION.SDK_INT >= 23;
            if (Build.VERSION.SDK_INT >= 18) {
                cls = TextDirectionHeuristic.class;
                f11696c = z ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
            } else {
                ClassLoader classLoader = g.class.getClassLoader();
                String str = this.f11705l ? "RTL" : "LTR";
                Class<?> clsLoadClass = classLoader.loadClass("android.text.TextDirectionHeuristic");
                Class<?> clsLoadClass2 = classLoader.loadClass("android.text.TextDirectionHeuristics");
                f11696c = clsLoadClass2.getField(str).get(clsLoadClass2);
                cls = clsLoadClass;
            }
            Class cls2 = Integer.TYPE;
            Class cls3 = Float.TYPE;
            Constructor<StaticLayout> declaredConstructor = StaticLayout.class.getDeclaredConstructor(CharSequence.class, cls2, cls2, TextPaint.class, cls2, Layout.Alignment.class, cls, cls3, cls3, Boolean.TYPE, TextUtils.TruncateAt.class, cls2, cls2);
            f11695b = declaredConstructor;
            declaredConstructor.setAccessible(true);
            a = true;
        } catch (Exception e2) {
            throw new a(e2);
        }
    }

    public static g c(CharSequence charSequence, TextPaint textPaint, int i2) {
        return new g(charSequence, textPaint, i2);
    }

    public StaticLayout a() throws a, NoSuchMethodException, SecurityException, ClassNotFoundException {
        if (this.f11697d == null) {
            this.f11697d = "";
        }
        int iMax = Math.max(0, this.f11699f);
        CharSequence charSequenceEllipsize = this.f11697d;
        if (this.f11703j == 1) {
            charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, this.f11698e, iMax, this.f11706m);
        }
        int iMin = Math.min(charSequenceEllipsize.length(), this.f11701h);
        this.f11701h = iMin;
        if (Build.VERSION.SDK_INT < 23) {
            b();
            try {
                return (StaticLayout) ((Constructor) c.h.k.h.c(f11695b)).newInstance(charSequenceEllipsize, Integer.valueOf(this.f11700g), Integer.valueOf(this.f11701h), this.f11698e, Integer.valueOf(iMax), this.f11702i, c.h.k.h.c(f11696c), Float.valueOf(1.0f), Float.valueOf(0.0f), Boolean.valueOf(this.f11704k), null, Integer.valueOf(iMax), Integer.valueOf(this.f11703j));
            } catch (Exception e2) {
                throw new a(e2);
            }
        }
        if (this.f11705l) {
            this.f11702i = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequenceEllipsize, this.f11700g, iMin, this.f11698e, iMax);
        builderObtain.setAlignment(this.f11702i);
        builderObtain.setIncludePad(this.f11704k);
        builderObtain.setTextDirection(this.f11705l ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
        TextUtils.TruncateAt truncateAt = this.f11706m;
        if (truncateAt != null) {
            builderObtain.setEllipsize(truncateAt);
        }
        builderObtain.setMaxLines(this.f11703j);
        return builderObtain.build();
    }

    public g d(Layout.Alignment alignment) {
        this.f11702i = alignment;
        return this;
    }

    public g e(TextUtils.TruncateAt truncateAt) {
        this.f11706m = truncateAt;
        return this;
    }

    public g f(boolean z) {
        this.f11704k = z;
        return this;
    }

    public g g(boolean z) {
        this.f11705l = z;
        return this;
    }

    public g h(int i2) {
        this.f11703j = i2;
        return this;
    }
}