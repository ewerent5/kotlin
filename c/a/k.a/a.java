package c.a.k.a;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import androidx.appcompat.widget.m0;
import java.util.WeakHashMap;

/* compiled from: AppCompatResources.java */
@SuppressLint({"RestrictedAPI"})
/* loaded from: classes.dex */
public final class a {
    private static final ThreadLocal<TypedValue> a = new ThreadLocal<>();

    /* renamed from: b */
    private static final WeakHashMap<Context, SparseArray<C0041a>> f2533b = new WeakHashMap<>(0);

    /* renamed from: c */
    private static final Object f2534c = new Object();

    /* compiled from: AppCompatResources.java */
    /* renamed from: c.a.k.a.a$a */
    private static class C0041a {
        final ColorStateList a;

        /* renamed from: b */
        final Configuration f2535b;

        C0041a(ColorStateList colorStateList, Configuration configuration) {
            this.a = colorStateList;
            this.f2535b = configuration;
        }
    }

    private static void a(Context context, int i2, ColorStateList colorStateList) {
        synchronized (f2534c) {
            WeakHashMap<Context, SparseArray<C0041a>> weakHashMap = f2533b;
            SparseArray<C0041a> sparseArray = weakHashMap.get(context);
            if (sparseArray == null) {
                sparseArray = new SparseArray<>();
                weakHashMap.put(context, sparseArray);
            }
            sparseArray.append(i2, new C0041a(colorStateList, context.getResources().getConfiguration()));
        }
    }

    private static ColorStateList b(Context context, int i2) {
        C0041a c0041a;
        synchronized (f2534c) {
            SparseArray<C0041a> sparseArray = f2533b.get(context);
            if (sparseArray != null && sparseArray.size() > 0 && (c0041a = sparseArray.get(i2)) != null) {
                if (c0041a.f2535b.equals(context.getResources().getConfiguration())) {
                    return c0041a.a;
                }
                sparseArray.remove(i2);
            }
            return null;
        }
    }

    public static ColorStateList c(Context context, int i2) throws Resources.NotFoundException {
        if (Build.VERSION.SDK_INT >= 23) {
            return context.getColorStateList(i2);
        }
        ColorStateList colorStateListB = b(context, i2);
        if (colorStateListB != null) {
            return colorStateListB;
        }
        ColorStateList colorStateListF = f(context, i2);
        if (colorStateListF == null) {
            return androidx.core.content.a.d(context, i2);
        }
        a(context, i2, colorStateListF);
        return colorStateListF;
    }

    public static Drawable d(Context context, int i2) {
        return m0.h().j(context, i2);
    }

    private static TypedValue e() {
        ThreadLocal<TypedValue> threadLocal = a;
        TypedValue typedValue = threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }

    private static ColorStateList f(Context context, int i2) throws Resources.NotFoundException {
        if (g(context, i2)) {
            return null;
        }
        Resources resources = context.getResources();
        try {
            return androidx.core.content.c.a.a(resources, resources.getXml(i2), context.getTheme());
        } catch (Exception e2) {
            Log.e("AppCompatResources", "Failed to inflate ColorStateList, leaving it to the framework", e2);
            return null;
        }
    }

    private static boolean g(Context context, int i2) throws Resources.NotFoundException {
        Resources resources = context.getResources();
        TypedValue typedValueE = e();
        resources.getValue(i2, typedValueE, true);
        int i3 = typedValueE.type;
        return i3 >= 28 && i3 <= 31;
    }
}