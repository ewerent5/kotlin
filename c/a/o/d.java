package c.a.o;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.view.LayoutInflater;

/* compiled from: ContextThemeWrapper.java */
/* loaded from: classes.dex */
public class d extends ContextWrapper {
    private int a;

    /* renamed from: b, reason: collision with root package name */
    private Resources.Theme f2578b;

    /* renamed from: c, reason: collision with root package name */
    private LayoutInflater f2579c;

    /* renamed from: d, reason: collision with root package name */
    private Configuration f2580d;

    /* renamed from: e, reason: collision with root package name */
    private Resources f2581e;

    public d() {
        super(null);
    }

    private Resources b() {
        if (this.f2581e == null) {
            Configuration configuration = this.f2580d;
            if (configuration == null) {
                this.f2581e = super.getResources();
            } else if (Build.VERSION.SDK_INT >= 17) {
                this.f2581e = createConfigurationContext(configuration).getResources();
            } else {
                Resources resources = super.getResources();
                Configuration configuration2 = new Configuration(resources.getConfiguration());
                configuration2.updateFrom(this.f2580d);
                this.f2581e = new Resources(resources.getAssets(), resources.getDisplayMetrics(), configuration2);
            }
        }
        return this.f2581e;
    }

    private void d() {
        boolean z = this.f2578b == null;
        if (z) {
            this.f2578b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f2578b.setTo(theme);
            }
        }
        e(this.f2578b, this.a, z);
    }

    public void a(Configuration configuration) {
        if (this.f2581e != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        }
        if (this.f2580d != null) {
            throw new IllegalStateException("Override configuration has already been set");
        }
        this.f2580d = new Configuration(configuration);
    }

    @Override // android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public int c() {
        return this.a;
    }

    protected void e(Resources.Theme theme, int i2, boolean z) {
        theme.applyStyle(i2, true);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return getResources().getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return b();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f2579c == null) {
            this.f2579c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f2579c;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f2578b;
        if (theme != null) {
            return theme;
        }
        if (this.a == 0) {
            this.a = c.a.i.f2520d;
        }
        d();
        return this.f2578b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i2) {
        if (this.a != i2) {
            this.a = i2;
            d();
        }
    }

    public d(Context context, int i2) {
        super(context);
        this.a = i2;
    }

    public d(Context context, Resources.Theme theme) {
        super(context);
        this.f2578b = theme;
    }
}