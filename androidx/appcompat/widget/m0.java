package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: ResourceManagerInternal.java */
/* loaded from: classes.dex */
public final class m0 {

    /* renamed from: b, reason: collision with root package name */
    private static m0 f513b;

    /* renamed from: d, reason: collision with root package name */
    private WeakHashMap<Context, c.e.h<ColorStateList>> f515d;

    /* renamed from: e, reason: collision with root package name */
    private c.e.g<String, d> f516e;

    /* renamed from: f, reason: collision with root package name */
    private c.e.h<String> f517f;

    /* renamed from: g, reason: collision with root package name */
    private final WeakHashMap<Context, c.e.d<WeakReference<Drawable.ConstantState>>> f518g = new WeakHashMap<>(0);

    /* renamed from: h, reason: collision with root package name */
    private TypedValue f519h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f520i;

    /* renamed from: j, reason: collision with root package name */
    private e f521j;
    private static final PorterDuff.Mode a = PorterDuff.Mode.SRC_IN;

    /* renamed from: c, reason: collision with root package name */
    private static final c f514c = new c(6);

    /* compiled from: ResourceManagerInternal.java */
    static class a implements d {
        a() {
        }

        @Override // androidx.appcompat.widget.m0.d
        public Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return c.a.l.a.a.m(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e2) {
                Log.e("AsldcInflateDelegate", "Exception while inflating <animated-selector>", e2);
                return null;
            }
        }
    }

    /* compiled from: ResourceManagerInternal.java */
    private static class b implements d {
        b() {
        }

        @Override // androidx.appcompat.widget.m0.d
        public Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return c.t.a.a.c.a(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e2) {
                Log.e("AvdcInflateDelegate", "Exception while inflating <animated-vector>", e2);
                return null;
            }
        }
    }

    /* compiled from: ResourceManagerInternal.java */
    private static class c extends c.e.e<Integer, PorterDuffColorFilter> {
        public c(int i2) {
            super(i2);
        }

        private static int h(int i2, PorterDuff.Mode mode) {
            return ((i2 + 31) * 31) + mode.hashCode();
        }

        PorterDuffColorFilter i(int i2, PorterDuff.Mode mode) {
            return c(Integer.valueOf(h(i2, mode)));
        }

        PorterDuffColorFilter j(int i2, PorterDuff.Mode mode, PorterDuffColorFilter porterDuffColorFilter) {
            return d(Integer.valueOf(h(i2, mode)), porterDuffColorFilter);
        }
    }

    /* compiled from: ResourceManagerInternal.java */
    private interface d {
        Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme);
    }

    /* compiled from: ResourceManagerInternal.java */
    interface e {
        boolean a(Context context, int i2, Drawable drawable);

        PorterDuff.Mode b(int i2);

        Drawable c(m0 m0Var, Context context, int i2);

        ColorStateList d(Context context, int i2);

        boolean e(Context context, int i2, Drawable drawable);
    }

    /* compiled from: ResourceManagerInternal.java */
    private static class f implements d {
        f() {
        }

        @Override // androidx.appcompat.widget.m0.d
        public Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return c.t.a.a.i.c(context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e2) {
                Log.e("VdcInflateDelegate", "Exception while inflating <vector>", e2);
                return null;
            }
        }
    }

    private void a(String str, d dVar) {
        if (this.f516e == null) {
            this.f516e = new c.e.g<>();
        }
        this.f516e.put(str, dVar);
    }

    private synchronized boolean b(Context context, long j2, Drawable drawable) {
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState == null) {
            return false;
        }
        c.e.d<WeakReference<Drawable.ConstantState>> dVar = this.f518g.get(context);
        if (dVar == null) {
            dVar = new c.e.d<>();
            this.f518g.put(context, dVar);
        }
        dVar.j(j2, new WeakReference<>(constantState));
        return true;
    }

    private void c(Context context, int i2, ColorStateList colorStateList) {
        if (this.f515d == null) {
            this.f515d = new WeakHashMap<>();
        }
        c.e.h<ColorStateList> hVar = this.f515d.get(context);
        if (hVar == null) {
            hVar = new c.e.h<>();
            this.f515d.put(context, hVar);
        }
        hVar.a(i2, colorStateList);
    }

    private void d(Context context) {
        if (this.f520i) {
            return;
        }
        this.f520i = true;
        Drawable drawableJ = j(context, c.a.m.a.a);
        if (drawableJ == null || !q(drawableJ)) {
            this.f520i = false;
            throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
        }
    }

    private static long e(TypedValue typedValue) {
        return (typedValue.assetCookie << 32) | typedValue.data;
    }

    private Drawable f(Context context, int i2) throws Resources.NotFoundException {
        if (this.f519h == null) {
            this.f519h = new TypedValue();
        }
        TypedValue typedValue = this.f519h;
        context.getResources().getValue(i2, typedValue, true);
        long jE = e(typedValue);
        Drawable drawableI = i(context, jE);
        if (drawableI != null) {
            return drawableI;
        }
        e eVar = this.f521j;
        Drawable drawableC = eVar == null ? null : eVar.c(this, context, i2);
        if (drawableC != null) {
            drawableC.setChangingConfigurations(typedValue.changingConfigurations);
            b(context, jE, drawableC);
        }
        return drawableC;
    }

    private static PorterDuffColorFilter g(ColorStateList colorStateList, PorterDuff.Mode mode, int[] iArr) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return l(colorStateList.getColorForState(iArr, 0), mode);
    }

    public static synchronized m0 h() {
        if (f513b == null) {
            m0 m0Var = new m0();
            f513b = m0Var;
            p(m0Var);
        }
        return f513b;
    }

    private synchronized Drawable i(Context context, long j2) {
        c.e.d<WeakReference<Drawable.ConstantState>> dVar = this.f518g.get(context);
        if (dVar == null) {
            return null;
        }
        WeakReference<Drawable.ConstantState> weakReferenceF = dVar.f(j2);
        if (weakReferenceF != null) {
            Drawable.ConstantState constantState = weakReferenceF.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            dVar.k(j2);
        }
        return null;
    }

    public static synchronized PorterDuffColorFilter l(int i2, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilterI;
        c cVar = f514c;
        porterDuffColorFilterI = cVar.i(i2, mode);
        if (porterDuffColorFilterI == null) {
            porterDuffColorFilterI = new PorterDuffColorFilter(i2, mode);
            cVar.j(i2, mode, porterDuffColorFilterI);
        }
        return porterDuffColorFilterI;
    }

    private ColorStateList n(Context context, int i2) {
        c.e.h<ColorStateList> hVar;
        WeakHashMap<Context, c.e.h<ColorStateList>> weakHashMap = this.f515d;
        if (weakHashMap == null || (hVar = weakHashMap.get(context)) == null) {
            return null;
        }
        return hVar.f(i2);
    }

    private static void p(m0 m0Var) {
        if (Build.VERSION.SDK_INT < 24) {
            m0Var.a("vector", new f());
            m0Var.a("animated-vector", new b());
            m0Var.a("animated-selector", new a());
        }
    }

    private static boolean q(Drawable drawable) {
        return (drawable instanceof c.t.a.a.i) || "android.graphics.drawable.VectorDrawable".equals(drawable.getClass().getName());
    }

    private Drawable r(Context context, int i2) throws XmlPullParserException, Resources.NotFoundException, IOException {
        int next;
        c.e.g<String, d> gVar = this.f516e;
        if (gVar == null || gVar.isEmpty()) {
            return null;
        }
        c.e.h<String> hVar = this.f517f;
        if (hVar != null) {
            String strF = hVar.f(i2);
            if ("appcompat_skip_skip".equals(strF) || (strF != null && this.f516e.get(strF) == null)) {
                return null;
            }
        } else {
            this.f517f = new c.e.h<>();
        }
        if (this.f519h == null) {
            this.f519h = new TypedValue();
        }
        TypedValue typedValue = this.f519h;
        Resources resources = context.getResources();
        resources.getValue(i2, typedValue, true);
        long jE = e(typedValue);
        Drawable drawableI = i(context, jE);
        if (drawableI != null) {
            return drawableI;
        }
        CharSequence charSequence = typedValue.string;
        if (charSequence != null && charSequence.toString().endsWith(".xml")) {
            try {
                XmlResourceParser xml = resources.getXml(i2);
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                String name = xml.getName();
                this.f517f.a(i2, name);
                d dVar = this.f516e.get(name);
                if (dVar != null) {
                    drawableI = dVar.a(context, xml, attributeSetAsAttributeSet, context.getTheme());
                }
                if (drawableI != null) {
                    drawableI.setChangingConfigurations(typedValue.changingConfigurations);
                    b(context, jE, drawableI);
                }
            } catch (Exception e2) {
                Log.e("ResourceManagerInternal", "Exception while inflating drawable", e2);
            }
        }
        if (drawableI == null) {
            this.f517f.a(i2, "appcompat_skip_skip");
        }
        return drawableI;
    }

    private Drawable v(Context context, int i2, boolean z, Drawable drawable) {
        ColorStateList colorStateListM = m(context, i2);
        if (colorStateListM == null) {
            e eVar = this.f521j;
            if ((eVar == null || !eVar.e(context, i2, drawable)) && !x(context, i2, drawable) && z) {
                return null;
            }
            return drawable;
        }
        if (e0.a(drawable)) {
            drawable = drawable.mutate();
        }
        Drawable drawableR = androidx.core.graphics.drawable.a.r(drawable);
        androidx.core.graphics.drawable.a.o(drawableR, colorStateListM);
        PorterDuff.Mode modeO = o(i2);
        if (modeO == null) {
            return drawableR;
        }
        androidx.core.graphics.drawable.a.p(drawableR, modeO);
        return drawableR;
    }

    static void w(Drawable drawable, u0 u0Var, int[] iArr) {
        if (e0.a(drawable) && drawable.mutate() != drawable) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        boolean z = u0Var.f582d;
        if (z || u0Var.f581c) {
            drawable.setColorFilter(g(z ? u0Var.a : null, u0Var.f581c ? u0Var.f580b : a, iArr));
        } else {
            drawable.clearColorFilter();
        }
        if (Build.VERSION.SDK_INT <= 23) {
            drawable.invalidateSelf();
        }
    }

    public synchronized Drawable j(Context context, int i2) {
        return k(context, i2, false);
    }

    synchronized Drawable k(Context context, int i2, boolean z) {
        Drawable drawableR;
        d(context);
        drawableR = r(context, i2);
        if (drawableR == null) {
            drawableR = f(context, i2);
        }
        if (drawableR == null) {
            drawableR = androidx.core.content.a.e(context, i2);
        }
        if (drawableR != null) {
            drawableR = v(context, i2, z, drawableR);
        }
        if (drawableR != null) {
            e0.b(drawableR);
        }
        return drawableR;
    }

    synchronized ColorStateList m(Context context, int i2) {
        ColorStateList colorStateListN;
        colorStateListN = n(context, i2);
        if (colorStateListN == null) {
            e eVar = this.f521j;
            colorStateListN = eVar == null ? null : eVar.d(context, i2);
            if (colorStateListN != null) {
                c(context, i2, colorStateListN);
            }
        }
        return colorStateListN;
    }

    PorterDuff.Mode o(int i2) {
        e eVar = this.f521j;
        if (eVar == null) {
            return null;
        }
        return eVar.b(i2);
    }

    public synchronized void s(Context context) {
        c.e.d<WeakReference<Drawable.ConstantState>> dVar = this.f518g.get(context);
        if (dVar != null) {
            dVar.b();
        }
    }

    synchronized Drawable t(Context context, b1 b1Var, int i2) {
        Drawable drawableR = r(context, i2);
        if (drawableR == null) {
            drawableR = b1Var.c(i2);
        }
        if (drawableR == null) {
            return null;
        }
        return v(context, i2, false, drawableR);
    }

    public synchronized void u(e eVar) {
        this.f521j = eVar;
    }

    boolean x(Context context, int i2, Drawable drawable) {
        e eVar = this.f521j;
        return eVar != null && eVar.a(context, i2, drawable);
    }
}