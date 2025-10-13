package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import java.lang.ref.WeakReference;

/* compiled from: VectorEnabledTintResources.java */
/* loaded from: classes.dex */
public class b1 extends Resources {
    private static boolean a = false;

    /* renamed from: b, reason: collision with root package name */
    private final WeakReference<Context> f425b;

    public b1(Context context, Resources resources) {
        super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
        this.f425b = new WeakReference<>(context);
    }

    public static boolean a() {
        return a;
    }

    public static boolean b() {
        return a() && Build.VERSION.SDK_INT <= 20;
    }

    final Drawable c(int i2) {
        return super.getDrawable(i2);
    }

    @Override // android.content.res.Resources
    public Drawable getDrawable(int i2) {
        Context context = this.f425b.get();
        return context != null ? m0.h().t(context, this, i2) : super.getDrawable(i2);
    }
}