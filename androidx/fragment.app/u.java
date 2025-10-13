package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.g;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* compiled from: FragmentTransaction.java */
/* loaded from: classes.dex */
public abstract class u {
    private final i a;

    /* renamed from: b, reason: collision with root package name */
    private final ClassLoader f1088b;

    /* renamed from: d, reason: collision with root package name */
    int f1090d;

    /* renamed from: e, reason: collision with root package name */
    int f1091e;

    /* renamed from: f, reason: collision with root package name */
    int f1092f;

    /* renamed from: g, reason: collision with root package name */
    int f1093g;

    /* renamed from: h, reason: collision with root package name */
    int f1094h;

    /* renamed from: i, reason: collision with root package name */
    boolean f1095i;

    /* renamed from: k, reason: collision with root package name */
    String f1097k;

    /* renamed from: l, reason: collision with root package name */
    int f1098l;

    /* renamed from: m, reason: collision with root package name */
    CharSequence f1099m;
    int n;
    CharSequence o;
    ArrayList<String> p;
    ArrayList<String> q;
    ArrayList<Runnable> s;

    /* renamed from: c, reason: collision with root package name */
    ArrayList<a> f1089c = new ArrayList<>();

    /* renamed from: j, reason: collision with root package name */
    boolean f1096j = true;
    boolean r = false;

    /* compiled from: FragmentTransaction.java */
    static final class a {
        int a;

        /* renamed from: b, reason: collision with root package name */
        Fragment f1100b;

        /* renamed from: c, reason: collision with root package name */
        int f1101c;

        /* renamed from: d, reason: collision with root package name */
        int f1102d;

        /* renamed from: e, reason: collision with root package name */
        int f1103e;

        /* renamed from: f, reason: collision with root package name */
        int f1104f;

        /* renamed from: g, reason: collision with root package name */
        g.c f1105g;

        /* renamed from: h, reason: collision with root package name */
        g.c f1106h;

        a() {
        }

        a(int i2, Fragment fragment) {
            this.a = i2;
            this.f1100b = fragment;
            g.c cVar = g.c.RESUMED;
            this.f1105g = cVar;
            this.f1106h = cVar;
        }

        a(int i2, Fragment fragment, g.c cVar) {
            this.a = i2;
            this.f1100b = fragment;
            this.f1105g = fragment.V;
            this.f1106h = cVar;
        }
    }

    u(i iVar, ClassLoader classLoader) {
        this.a = iVar;
        this.f1088b = classLoader;
    }

    public u b(int i2, Fragment fragment) {
        p(i2, fragment, null, 1);
        return this;
    }

    public u c(int i2, Fragment fragment, String str) {
        p(i2, fragment, str, 1);
        return this;
    }

    u d(ViewGroup viewGroup, Fragment fragment, String str) {
        fragment.K = viewGroup;
        return c(viewGroup.getId(), fragment, str);
    }

    public u e(Fragment fragment, String str) {
        p(0, fragment, str, 1);
        return this;
    }

    void f(a aVar) {
        this.f1089c.add(aVar);
        aVar.f1101c = this.f1090d;
        aVar.f1102d = this.f1091e;
        aVar.f1103e = this.f1092f;
        aVar.f1104f = this.f1093g;
    }

    public u g(View view, String str) {
        if (v.C()) {
            String strI = c.h.l.t.I(view);
            if (strI == null) {
                throw new IllegalArgumentException("Unique transitionNames are required for all sharedElements");
            }
            if (this.p == null) {
                this.p = new ArrayList<>();
                this.q = new ArrayList<>();
            } else {
                if (this.q.contains(str)) {
                    throw new IllegalArgumentException("A shared element with the target name '" + str + "' has already been added to the transaction.");
                }
                if (this.p.contains(strI)) {
                    throw new IllegalArgumentException("A shared element with the source name '" + strI + "' has already been added to the transaction.");
                }
            }
            this.p.add(strI);
            this.q.add(str);
        }
        return this;
    }

    public u h(String str) {
        if (!this.f1096j) {
            throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
        }
        this.f1095i = true;
        this.f1097k = str;
        return this;
    }

    public u i(Fragment fragment) {
        f(new a(7, fragment));
        return this;
    }

    public abstract int j();

    public abstract int k();

    public abstract void l();

    public abstract void m();

    public u n(Fragment fragment) {
        f(new a(6, fragment));
        return this;
    }

    public u o() {
        if (this.f1095i) {
            throw new IllegalStateException("This transaction is already being added to the back stack");
        }
        this.f1096j = false;
        return this;
    }

    void p(int i2, Fragment fragment, String str, int i3) {
        Class<?> cls = fragment.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str2 = fragment.C;
            if (str2 != null && !str.equals(str2)) {
                throw new IllegalStateException("Can't change tag of fragment " + fragment + ": was " + fragment.C + " now " + str);
            }
            fragment.C = str;
        }
        if (i2 != 0) {
            if (i2 == -1) {
                throw new IllegalArgumentException("Can't add fragment " + fragment + " with tag " + str + " to container view with no id");
            }
            int i4 = fragment.A;
            if (i4 != 0 && i4 != i2) {
                throw new IllegalStateException("Can't change container ID of fragment " + fragment + ": was " + fragment.A + " now " + i2);
            }
            fragment.A = i2;
            fragment.B = i2;
        }
        f(new a(i3, fragment));
    }

    public u q(Fragment fragment) {
        f(new a(3, fragment));
        return this;
    }

    public u r(int i2, Fragment fragment) {
        return s(i2, fragment, null);
    }

    public u s(int i2, Fragment fragment, String str) {
        if (i2 == 0) {
            throw new IllegalArgumentException("Must use non-zero containerViewId");
        }
        p(i2, fragment, str, 2);
        return this;
    }

    public u t(int i2, int i3, int i4, int i5) {
        this.f1090d = i2;
        this.f1091e = i3;
        this.f1092f = i4;
        this.f1093g = i5;
        return this;
    }

    public u u(Fragment fragment, g.c cVar) {
        f(new a(10, fragment, cVar));
        return this;
    }

    public u v(Fragment fragment) {
        f(new a(8, fragment));
        return this;
    }

    public u w(boolean z) {
        this.r = z;
        return this;
    }
}