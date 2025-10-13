package androidx.appcompat.widget;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.os.Build;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* compiled from: TintContextWrapper.java */
/* loaded from: classes.dex */
public class t0 extends ContextWrapper {
    private static final Object a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private static ArrayList<WeakReference<t0>> f576b;

    /* renamed from: c, reason: collision with root package name */
    private final Resources f577c;

    /* renamed from: d, reason: collision with root package name */
    private final Resources.Theme f578d;

    private t0(Context context) {
        super(context);
        if (!b1.b()) {
            this.f577c = new v0(this, context.getResources());
            this.f578d = null;
            return;
        }
        b1 b1Var = new b1(this, context.getResources());
        this.f577c = b1Var;
        Resources.Theme themeNewTheme = b1Var.newTheme();
        this.f578d = themeNewTheme;
        themeNewTheme.setTo(context.getTheme());
    }

    private static boolean a(Context context) {
        if ((context instanceof t0) || (context.getResources() instanceof v0) || (context.getResources() instanceof b1)) {
            return false;
        }
        return Build.VERSION.SDK_INT < 21 || b1.b();
    }

    public static Context b(Context context) {
        if (!a(context)) {
            return context;
        }
        synchronized (a) {
            ArrayList<WeakReference<t0>> arrayList = f576b;
            if (arrayList == null) {
                f576b = new ArrayList<>();
            } else {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    WeakReference<t0> weakReference = f576b.get(size);
                    if (weakReference == null || weakReference.get() == null) {
                        f576b.remove(size);
                    }
                }
                for (int size2 = f576b.size() - 1; size2 >= 0; size2--) {
                    WeakReference<t0> weakReference2 = f576b.get(size2);
                    t0 t0Var = weakReference2 != null ? weakReference2.get() : null;
                    if (t0Var != null && t0Var.getBaseContext() == context) {
                        return t0Var;
                    }
                }
            }
            t0 t0Var2 = new t0(context);
            f576b.add(new WeakReference<>(t0Var2));
            return t0Var2;
        }
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return this.f577c.getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return this.f577c;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f578d;
        return theme == null ? super.getTheme() : theme;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i2) {
        Resources.Theme theme = this.f578d;
        if (theme == null) {
            super.setTheme(i2);
        } else {
            theme.applyStyle(i2, true);
        }
    }
}