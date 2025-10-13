package c.a.o;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.e0;
import androidx.appcompat.widget.w0;
import j$.util.Spliterator;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import okhttp3.internal.http2.Settings;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: SupportMenuInflater.java */
/* loaded from: classes.dex */
public class g extends MenuInflater {
    static final Class<?>[] a;

    /* renamed from: b, reason: collision with root package name */
    static final Class<?>[] f2593b;

    /* renamed from: c, reason: collision with root package name */
    final Object[] f2594c;

    /* renamed from: d, reason: collision with root package name */
    final Object[] f2595d;

    /* renamed from: e, reason: collision with root package name */
    Context f2596e;

    /* renamed from: f, reason: collision with root package name */
    private Object f2597f;

    /* compiled from: SupportMenuInflater.java */
    private static class a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: e, reason: collision with root package name */
        private static final Class<?>[] f2598e = {MenuItem.class};

        /* renamed from: f, reason: collision with root package name */
        private Object f2599f;

        /* renamed from: g, reason: collision with root package name */
        private Method f2600g;

        public a(Object obj, String str) {
            this.f2599f = obj;
            Class<?> cls = obj.getClass();
            try {
                this.f2600g = cls.getMethod(str, f2598e);
            } catch (Exception e2) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str + " in class " + cls.getName());
                inflateException.initCause(e2);
                throw inflateException;
            }
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            try {
                if (this.f2600g.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.f2600g.invoke(this.f2599f, menuItem)).booleanValue();
                }
                this.f2600g.invoke(this.f2599f, menuItem);
                return true;
            } catch (Exception e2) {
                throw new RuntimeException(e2);
            }
        }
    }

    /* compiled from: SupportMenuInflater.java */
    private class b {
        c.h.l.b A;
        private CharSequence B;
        private CharSequence C;
        private ColorStateList D = null;
        private PorterDuff.Mode E = null;
        private Menu a;

        /* renamed from: b, reason: collision with root package name */
        private int f2601b;

        /* renamed from: c, reason: collision with root package name */
        private int f2602c;

        /* renamed from: d, reason: collision with root package name */
        private int f2603d;

        /* renamed from: e, reason: collision with root package name */
        private int f2604e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f2605f;

        /* renamed from: g, reason: collision with root package name */
        private boolean f2606g;

        /* renamed from: h, reason: collision with root package name */
        private boolean f2607h;

        /* renamed from: i, reason: collision with root package name */
        private int f2608i;

        /* renamed from: j, reason: collision with root package name */
        private int f2609j;

        /* renamed from: k, reason: collision with root package name */
        private CharSequence f2610k;

        /* renamed from: l, reason: collision with root package name */
        private CharSequence f2611l;

        /* renamed from: m, reason: collision with root package name */
        private int f2612m;
        private char n;
        private int o;
        private char p;
        private int q;
        private int r;
        private boolean s;
        private boolean t;
        private boolean u;
        private int v;
        private int w;
        private String x;
        private String y;
        private String z;

        public b(Menu menu) {
            this.a = menu;
            h();
        }

        private char c(String str) {
            if (str == null) {
                return (char) 0;
            }
            return str.charAt(0);
        }

        private <T> T e(String str, Class<?>[] clsArr, Object[] objArr) throws NoSuchMethodException, SecurityException {
            try {
                Constructor<?> constructor = Class.forName(str, false, g.this.f2596e.getClassLoader()).getConstructor(clsArr);
                constructor.setAccessible(true);
                return (T) constructor.newInstance(objArr);
            } catch (Exception e2) {
                Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e2);
                return null;
            }
        }

        private void i(MenuItem menuItem) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            boolean z = false;
            menuItem.setChecked(this.s).setVisible(this.t).setEnabled(this.u).setCheckable(this.r >= 1).setTitleCondensed(this.f2611l).setIcon(this.f2612m);
            int i2 = this.v;
            if (i2 >= 0) {
                menuItem.setShowAsAction(i2);
            }
            if (this.z != null) {
                if (g.this.f2596e.isRestricted()) {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
                menuItem.setOnMenuItemClickListener(new a(g.this.b(), this.z));
            }
            if (this.r >= 2) {
                if (menuItem instanceof androidx.appcompat.view.menu.i) {
                    ((androidx.appcompat.view.menu.i) menuItem).t(true);
                } else if (menuItem instanceof j) {
                    ((j) menuItem).h(true);
                }
            }
            String str = this.x;
            if (str != null) {
                menuItem.setActionView((View) e(str, g.a, g.this.f2594c));
                z = true;
            }
            int i3 = this.w;
            if (i3 > 0) {
                if (z) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                } else {
                    menuItem.setActionView(i3);
                }
            }
            c.h.l.b bVar = this.A;
            if (bVar != null) {
                c.h.l.h.a(menuItem, bVar);
            }
            c.h.l.h.c(menuItem, this.B);
            c.h.l.h.g(menuItem, this.C);
            c.h.l.h.b(menuItem, this.n, this.o);
            c.h.l.h.f(menuItem, this.p, this.q);
            PorterDuff.Mode mode = this.E;
            if (mode != null) {
                c.h.l.h.e(menuItem, mode);
            }
            ColorStateList colorStateList = this.D;
            if (colorStateList != null) {
                c.h.l.h.d(menuItem, colorStateList);
            }
        }

        public void a() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            this.f2607h = true;
            i(this.a.add(this.f2601b, this.f2608i, this.f2609j, this.f2610k));
        }

        public SubMenu b() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            this.f2607h = true;
            SubMenu subMenuAddSubMenu = this.a.addSubMenu(this.f2601b, this.f2608i, this.f2609j, this.f2610k);
            i(subMenuAddSubMenu.getItem());
            return subMenuAddSubMenu;
        }

        public boolean d() {
            return this.f2607h;
        }

        public void f(AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = g.this.f2596e.obtainStyledAttributes(attributeSet, c.a.j.r1);
            this.f2601b = typedArrayObtainStyledAttributes.getResourceId(c.a.j.t1, 0);
            this.f2602c = typedArrayObtainStyledAttributes.getInt(c.a.j.v1, 0);
            this.f2603d = typedArrayObtainStyledAttributes.getInt(c.a.j.w1, 0);
            this.f2604e = typedArrayObtainStyledAttributes.getInt(c.a.j.x1, 0);
            this.f2605f = typedArrayObtainStyledAttributes.getBoolean(c.a.j.u1, true);
            this.f2606g = typedArrayObtainStyledAttributes.getBoolean(c.a.j.s1, true);
            typedArrayObtainStyledAttributes.recycle();
        }

        public void g(AttributeSet attributeSet) {
            w0 w0VarU = w0.u(g.this.f2596e, attributeSet, c.a.j.y1);
            this.f2608i = w0VarU.n(c.a.j.B1, 0);
            this.f2609j = (w0VarU.k(c.a.j.E1, this.f2602c) & (-65536)) | (w0VarU.k(c.a.j.F1, this.f2603d) & Settings.DEFAULT_INITIAL_WINDOW_SIZE);
            this.f2610k = w0VarU.p(c.a.j.G1);
            this.f2611l = w0VarU.p(c.a.j.H1);
            this.f2612m = w0VarU.n(c.a.j.z1, 0);
            this.n = c(w0VarU.o(c.a.j.I1));
            this.o = w0VarU.k(c.a.j.P1, Spliterator.CONCURRENT);
            this.p = c(w0VarU.o(c.a.j.J1));
            this.q = w0VarU.k(c.a.j.T1, Spliterator.CONCURRENT);
            int i2 = c.a.j.K1;
            if (w0VarU.s(i2)) {
                this.r = w0VarU.a(i2, false) ? 1 : 0;
            } else {
                this.r = this.f2604e;
            }
            this.s = w0VarU.a(c.a.j.C1, false);
            this.t = w0VarU.a(c.a.j.D1, this.f2605f);
            this.u = w0VarU.a(c.a.j.A1, this.f2606g);
            this.v = w0VarU.k(c.a.j.U1, -1);
            this.z = w0VarU.o(c.a.j.L1);
            this.w = w0VarU.n(c.a.j.M1, 0);
            this.x = w0VarU.o(c.a.j.O1);
            String strO = w0VarU.o(c.a.j.N1);
            this.y = strO;
            boolean z = strO != null;
            if (z && this.w == 0 && this.x == null) {
                this.A = (c.h.l.b) e(strO, g.f2593b, g.this.f2595d);
            } else {
                if (z) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                }
                this.A = null;
            }
            this.B = w0VarU.p(c.a.j.Q1);
            this.C = w0VarU.p(c.a.j.V1);
            int i3 = c.a.j.S1;
            if (w0VarU.s(i3)) {
                this.E = e0.e(w0VarU.k(i3, -1), this.E);
            } else {
                this.E = null;
            }
            int i4 = c.a.j.R1;
            if (w0VarU.s(i4)) {
                this.D = w0VarU.c(i4);
            } else {
                this.D = null;
            }
            w0VarU.w();
            this.f2607h = false;
        }

        public void h() {
            this.f2601b = 0;
            this.f2602c = 0;
            this.f2603d = 0;
            this.f2604e = 0;
            this.f2605f = true;
            this.f2606g = true;
        }
    }

    static {
        Class<?>[] clsArr = {Context.class};
        a = clsArr;
        f2593b = clsArr;
    }

    public g(Context context) {
        super(context);
        this.f2596e = context;
        Object[] objArr = {context};
        this.f2594c = objArr;
        this.f2595d = objArr;
    }

    private Object a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    private void c(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        b bVar = new b(menu);
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (!name.equals("menu")) {
                    throw new RuntimeException("Expecting menu, got " + name);
                }
                eventType = xmlPullParser.next();
            } else {
                eventType = xmlPullParser.next();
                if (eventType == 1) {
                    break;
                }
            }
        }
        String str = null;
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            if (eventType == 1) {
                throw new RuntimeException("Unexpected end of document");
            }
            if (eventType != 2) {
                if (eventType == 3) {
                    String name2 = xmlPullParser.getName();
                    if (z2 && name2.equals(str)) {
                        str = null;
                        z2 = false;
                    } else if (name2.equals("group")) {
                        bVar.h();
                    } else if (name2.equals("item")) {
                        if (!bVar.d()) {
                            c.h.l.b bVar2 = bVar.A;
                            if (bVar2 == null || !bVar2.a()) {
                                bVar.a();
                            } else {
                                bVar.b();
                            }
                        }
                    } else if (name2.equals("menu")) {
                        z = true;
                    }
                }
            } else if (!z2) {
                String name3 = xmlPullParser.getName();
                if (name3.equals("group")) {
                    bVar.f(attributeSet);
                } else if (name3.equals("item")) {
                    bVar.g(attributeSet);
                } else if (name3.equals("menu")) {
                    c(xmlPullParser, attributeSet, bVar.b());
                } else {
                    str = name3;
                    z2 = true;
                }
            }
            eventType = xmlPullParser.next();
        }
    }

    Object b() {
        if (this.f2597f == null) {
            this.f2597f = a(this.f2596e);
        }
        return this.f2597f;
    }

    @Override // android.view.MenuInflater
    public void inflate(int i2, Menu menu) {
        if (!(menu instanceof c.h.e.a.a)) {
            super.inflate(i2, menu);
            return;
        }
        XmlResourceParser layout = null;
        try {
            try {
                try {
                    layout = this.f2596e.getResources().getLayout(i2);
                    c(layout, Xml.asAttributeSet(layout), menu);
                } catch (IOException e2) {
                    throw new InflateException("Error inflating menu XML", e2);
                }
            } catch (XmlPullParserException e3) {
                throw new InflateException("Error inflating menu XML", e3);
            }
        } finally {
            if (layout != null) {
                layout.close();
            }
        }
    }
}