package c.h.l;

import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.Objects;

/* compiled from: WindowInsetsCompat.java */
/* loaded from: classes.dex */
public class b0 {
    public static final b0 a = new a().a().a().b().c();

    /* renamed from: b, reason: collision with root package name */
    private final i f3112b;

    /* compiled from: WindowInsetsCompat.java */
    private static class d {
        private final b0 a;

        d() {
            this(new b0((b0) null));
        }

        b0 a() {
            return this.a;
        }

        void b(c.h.d.b bVar) {
        }

        void c(c.h.d.b bVar) {
        }

        d(b0 b0Var) {
            this.a = b0Var;
        }
    }

    /* compiled from: WindowInsetsCompat.java */
    private static class g extends f {
        g(b0 b0Var, WindowInsets windowInsets) {
            super(b0Var, windowInsets);
        }

        @Override // c.h.l.b0.i
        b0 a() {
            return b0.o(this.f3119b.consumeDisplayCutout());
        }

        @Override // c.h.l.b0.i
        c.h.l.c d() {
            return c.h.l.c.a(this.f3119b.getDisplayCutout());
        }

        @Override // c.h.l.b0.i
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof g) {
                return Objects.equals(this.f3119b, ((g) obj).f3119b);
            }
            return false;
        }

        @Override // c.h.l.b0.i
        public int hashCode() {
            return this.f3119b.hashCode();
        }

        g(b0 b0Var, g gVar) {
            super(b0Var, gVar);
        }
    }

    /* compiled from: WindowInsetsCompat.java */
    private static class i {
        final b0 a;

        i(b0 b0Var) {
            this.a = b0Var;
        }

        b0 a() {
            return this.a;
        }

        b0 b() {
            return this.a;
        }

        b0 c() {
            return this.a;
        }

        c.h.l.c d() {
            return null;
        }

        c.h.d.b e() {
            return g();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return j() == iVar.j() && i() == iVar.i() && c.h.k.c.a(g(), iVar.g()) && c.h.k.c.a(f(), iVar.f()) && c.h.k.c.a(d(), iVar.d());
        }

        c.h.d.b f() {
            return c.h.d.b.a;
        }

        c.h.d.b g() {
            return c.h.d.b.a;
        }

        b0 h(int i2, int i3, int i4, int i5) {
            return b0.a;
        }

        public int hashCode() {
            return c.h.k.c.b(Boolean.valueOf(j()), Boolean.valueOf(i()), g(), f(), d());
        }

        boolean i() {
            return false;
        }

        boolean j() {
            return false;
        }
    }

    private b0(WindowInsets windowInsets) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29) {
            this.f3112b = new h(this, windowInsets);
            return;
        }
        if (i2 >= 28) {
            this.f3112b = new g(this, windowInsets);
            return;
        }
        if (i2 >= 21) {
            this.f3112b = new f(this, windowInsets);
        } else if (i2 >= 20) {
            this.f3112b = new e(this, windowInsets);
        } else {
            this.f3112b = new i(this);
        }
    }

    static c.h.d.b k(c.h.d.b bVar, int i2, int i3, int i4, int i5) {
        int iMax = Math.max(0, bVar.f2994b - i2);
        int iMax2 = Math.max(0, bVar.f2995c - i3);
        int iMax3 = Math.max(0, bVar.f2996d - i4);
        int iMax4 = Math.max(0, bVar.f2997e - i5);
        return (iMax == i2 && iMax2 == i3 && iMax3 == i4 && iMax4 == i5) ? bVar : c.h.d.b.a(iMax, iMax2, iMax3, iMax4);
    }

    public static b0 o(WindowInsets windowInsets) {
        return new b0((WindowInsets) c.h.k.h.c(windowInsets));
    }

    public b0 a() {
        return this.f3112b.a();
    }

    public b0 b() {
        return this.f3112b.b();
    }

    public b0 c() {
        return this.f3112b.c();
    }

    public c.h.d.b d() {
        return this.f3112b.e();
    }

    public int e() {
        return i().f2997e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b0) {
            return c.h.k.c.a(this.f3112b, ((b0) obj).f3112b);
        }
        return false;
    }

    public int f() {
        return i().f2994b;
    }

    public int g() {
        return i().f2996d;
    }

    public int h() {
        return i().f2995c;
    }

    public int hashCode() {
        i iVar = this.f3112b;
        if (iVar == null) {
            return 0;
        }
        return iVar.hashCode();
    }

    public c.h.d.b i() {
        return this.f3112b.g();
    }

    public b0 j(int i2, int i3, int i4, int i5) {
        return this.f3112b.h(i2, i3, i4, i5);
    }

    public boolean l() {
        return this.f3112b.i();
    }

    @Deprecated
    public b0 m(int i2, int i3, int i4, int i5) {
        return new a(this).c(c.h.d.b.a(i2, i3, i4, i5)).a();
    }

    public WindowInsets n() {
        i iVar = this.f3112b;
        if (iVar instanceof e) {
            return ((e) iVar).f3119b;
        }
        return null;
    }

    /* compiled from: WindowInsetsCompat.java */
    private static class b extends d {

        /* renamed from: b, reason: collision with root package name */
        private static Field f3113b = null;

        /* renamed from: c, reason: collision with root package name */
        private static boolean f3114c = false;

        /* renamed from: d, reason: collision with root package name */
        private static Constructor<WindowInsets> f3115d = null;

        /* renamed from: e, reason: collision with root package name */
        private static boolean f3116e = false;

        /* renamed from: f, reason: collision with root package name */
        private WindowInsets f3117f;

        b() {
            this.f3117f = d();
        }

        private static WindowInsets d() {
            if (!f3114c) {
                try {
                    f3113b = WindowInsets.class.getDeclaredField("CONSUMED");
                } catch (ReflectiveOperationException e2) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e2);
                }
                f3114c = true;
            }
            Field field = f3113b;
            if (field != null) {
                try {
                    WindowInsets windowInsets = (WindowInsets) field.get(null);
                    if (windowInsets != null) {
                        return new WindowInsets(windowInsets);
                    }
                } catch (ReflectiveOperationException e3) {
                    Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e3);
                }
            }
            if (!f3116e) {
                try {
                    f3115d = WindowInsets.class.getConstructor(Rect.class);
                } catch (ReflectiveOperationException e4) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e4);
                }
                f3116e = true;
            }
            Constructor<WindowInsets> constructor = f3115d;
            if (constructor != null) {
                try {
                    return constructor.newInstance(new Rect());
                } catch (ReflectiveOperationException e5) {
                    Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e5);
                }
            }
            return null;
        }

        @Override // c.h.l.b0.d
        b0 a() {
            return b0.o(this.f3117f);
        }

        @Override // c.h.l.b0.d
        void c(c.h.d.b bVar) {
            WindowInsets windowInsets = this.f3117f;
            if (windowInsets != null) {
                this.f3117f = windowInsets.replaceSystemWindowInsets(bVar.f2994b, bVar.f2995c, bVar.f2996d, bVar.f2997e);
            }
        }

        b(b0 b0Var) {
            this.f3117f = b0Var.n();
        }
    }

    /* compiled from: WindowInsetsCompat.java */
    private static class c extends d {

        /* renamed from: b, reason: collision with root package name */
        final WindowInsets.Builder f3118b;

        c() {
            this.f3118b = new WindowInsets.Builder();
        }

        @Override // c.h.l.b0.d
        b0 a() {
            return b0.o(this.f3118b.build());
        }

        @Override // c.h.l.b0.d
        void b(c.h.d.b bVar) {
            this.f3118b.setStableInsets(bVar.c());
        }

        @Override // c.h.l.b0.d
        void c(c.h.d.b bVar) {
            this.f3118b.setSystemWindowInsets(bVar.c());
        }

        c(b0 b0Var) {
            WindowInsets.Builder builder;
            WindowInsets windowInsetsN = b0Var.n();
            if (windowInsetsN != null) {
                builder = new WindowInsets.Builder(windowInsetsN);
            } else {
                builder = new WindowInsets.Builder();
            }
            this.f3118b = builder;
        }
    }

    /* compiled from: WindowInsetsCompat.java */
    private static class f extends e {

        /* renamed from: d, reason: collision with root package name */
        private c.h.d.b f3121d;

        f(b0 b0Var, WindowInsets windowInsets) {
            super(b0Var, windowInsets);
            this.f3121d = null;
        }

        @Override // c.h.l.b0.i
        b0 b() {
            return b0.o(this.f3119b.consumeStableInsets());
        }

        @Override // c.h.l.b0.i
        b0 c() {
            return b0.o(this.f3119b.consumeSystemWindowInsets());
        }

        @Override // c.h.l.b0.i
        final c.h.d.b f() {
            if (this.f3121d == null) {
                this.f3121d = c.h.d.b.a(this.f3119b.getStableInsetLeft(), this.f3119b.getStableInsetTop(), this.f3119b.getStableInsetRight(), this.f3119b.getStableInsetBottom());
            }
            return this.f3121d;
        }

        @Override // c.h.l.b0.i
        boolean i() {
            return this.f3119b.isConsumed();
        }

        f(b0 b0Var, f fVar) {
            super(b0Var, fVar);
            this.f3121d = null;
        }
    }

    /* compiled from: WindowInsetsCompat.java */
    private static class e extends i {

        /* renamed from: b, reason: collision with root package name */
        final WindowInsets f3119b;

        /* renamed from: c, reason: collision with root package name */
        private c.h.d.b f3120c;

        e(b0 b0Var, WindowInsets windowInsets) {
            super(b0Var);
            this.f3120c = null;
            this.f3119b = windowInsets;
        }

        @Override // c.h.l.b0.i
        final c.h.d.b g() {
            if (this.f3120c == null) {
                this.f3120c = c.h.d.b.a(this.f3119b.getSystemWindowInsetLeft(), this.f3119b.getSystemWindowInsetTop(), this.f3119b.getSystemWindowInsetRight(), this.f3119b.getSystemWindowInsetBottom());
            }
            return this.f3120c;
        }

        @Override // c.h.l.b0.i
        b0 h(int i2, int i3, int i4, int i5) {
            a aVar = new a(b0.o(this.f3119b));
            aVar.c(b0.k(g(), i2, i3, i4, i5));
            aVar.b(b0.k(f(), i2, i3, i4, i5));
            return aVar.a();
        }

        @Override // c.h.l.b0.i
        boolean j() {
            return this.f3119b.isRound();
        }

        e(b0 b0Var, e eVar) {
            this(b0Var, new WindowInsets(eVar.f3119b));
        }
    }

    /* compiled from: WindowInsetsCompat.java */
    private static class h extends g {

        /* renamed from: e, reason: collision with root package name */
        private c.h.d.b f3122e;

        /* renamed from: f, reason: collision with root package name */
        private c.h.d.b f3123f;

        /* renamed from: g, reason: collision with root package name */
        private c.h.d.b f3124g;

        h(b0 b0Var, WindowInsets windowInsets) {
            super(b0Var, windowInsets);
            this.f3122e = null;
            this.f3123f = null;
            this.f3124g = null;
        }

        @Override // c.h.l.b0.i
        c.h.d.b e() {
            if (this.f3123f == null) {
                this.f3123f = c.h.d.b.b(this.f3119b.getMandatorySystemGestureInsets());
            }
            return this.f3123f;
        }

        @Override // c.h.l.b0.e, c.h.l.b0.i
        b0 h(int i2, int i3, int i4, int i5) {
            return b0.o(this.f3119b.inset(i2, i3, i4, i5));
        }

        h(b0 b0Var, h hVar) {
            super(b0Var, hVar);
            this.f3122e = null;
            this.f3123f = null;
            this.f3124g = null;
        }
    }

    /* compiled from: WindowInsetsCompat.java */
    public static final class a {
        private final d a;

        public a() {
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 29) {
                this.a = new c();
            } else if (i2 >= 20) {
                this.a = new b();
            } else {
                this.a = new d();
            }
        }

        public b0 a() {
            return this.a.a();
        }

        public a b(c.h.d.b bVar) {
            this.a.b(bVar);
            return this;
        }

        public a c(c.h.d.b bVar) {
            this.a.c(bVar);
            return this;
        }

        public a(b0 b0Var) {
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 29) {
                this.a = new c(b0Var);
            } else if (i2 >= 20) {
                this.a = new b(b0Var);
            } else {
                this.a = new d(b0Var);
            }
        }
    }

    public b0(b0 b0Var) {
        if (b0Var != null) {
            i iVar = b0Var.f3112b;
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 29 && (iVar instanceof h)) {
                this.f3112b = new h(this, (h) iVar);
                return;
            }
            if (i2 >= 28 && (iVar instanceof g)) {
                this.f3112b = new g(this, (g) iVar);
                return;
            }
            if (i2 >= 21 && (iVar instanceof f)) {
                this.f3112b = new f(this, (f) iVar);
                return;
            } else if (i2 >= 20 && (iVar instanceof e)) {
                this.f3112b = new e(this, (e) iVar);
                return;
            } else {
                this.f3112b = new i(this);
                return;
            }
        }
        this.f3112b = new i(this);
    }
}