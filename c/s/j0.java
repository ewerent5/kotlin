package c.s;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import c.s.a;
import c.s.m;
import java.lang.reflect.InvocationTargetException;

/* compiled from: Visibility.java */
/* loaded from: classes.dex */
public abstract class j0 extends m {
    private static final String[] O = {"android:visibility:visibility", "android:visibility:parent"};
    private int P = 3;

    /* compiled from: Visibility.java */
    class a extends n {
        final /* synthetic */ ViewGroup a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f3379b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f3380c;

        a(ViewGroup viewGroup, View view, View view2) {
            this.a = viewGroup;
            this.f3379b = view;
            this.f3380c = view2;
        }

        @Override // c.s.n, c.s.m.f
        public void b(m mVar) {
            x.a(this.a).d(this.f3379b);
        }

        @Override // c.s.m.f
        public void c(m mVar) {
            this.f3380c.setTag(j.f3376b, null);
            x.a(this.a).d(this.f3379b);
            mVar.Q(this);
        }

        @Override // c.s.n, c.s.m.f
        public void e(m mVar) {
            if (this.f3379b.getParent() == null) {
                x.a(this.a).c(this.f3379b);
            } else {
                j0.this.cancel();
            }
        }
    }

    /* compiled from: Visibility.java */
    private static class b extends AnimatorListenerAdapter implements m.f, a.InterfaceC0071a {
        private final View a;

        /* renamed from: b, reason: collision with root package name */
        private final int f3382b;

        /* renamed from: c, reason: collision with root package name */
        private final ViewGroup f3383c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f3384d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f3385e;

        /* renamed from: f, reason: collision with root package name */
        boolean f3386f = false;

        b(View view, int i2, boolean z) throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
            this.a = view;
            this.f3382b = i2;
            this.f3383c = (ViewGroup) view.getParent();
            this.f3384d = z;
            g(true);
        }

        private void f() throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
            if (!this.f3386f) {
                c0.h(this.a, this.f3382b);
                ViewGroup viewGroup = this.f3383c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            g(false);
        }

        private void g(boolean z) throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
            ViewGroup viewGroup;
            if (!this.f3384d || this.f3385e == z || (viewGroup = this.f3383c) == null) {
                return;
            }
            this.f3385e = z;
            x.c(viewGroup, z);
        }

        @Override // c.s.m.f
        public void a(m mVar) {
        }

        @Override // c.s.m.f
        public void b(m mVar) throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
            g(false);
        }

        @Override // c.s.m.f
        public void c(m mVar) throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
            f();
            mVar.Q(this);
        }

        @Override // c.s.m.f
        public void d(m mVar) {
        }

        @Override // c.s.m.f
        public void e(m mVar) throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
            g(true);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f3386f = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
            f();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener, c.s.a.InterfaceC0071a
        public void onAnimationPause(Animator animator) throws IllegalAccessException, NoSuchFieldException, IllegalArgumentException {
            if (this.f3386f) {
                return;
            }
            c0.h(this.a, this.f3382b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener, c.s.a.InterfaceC0071a
        public void onAnimationResume(Animator animator) throws IllegalAccessException, NoSuchFieldException, IllegalArgumentException {
            if (this.f3386f) {
                return;
            }
            c0.h(this.a, 0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* compiled from: Visibility.java */
    private static class c {
        boolean a;

        /* renamed from: b, reason: collision with root package name */
        boolean f3387b;

        /* renamed from: c, reason: collision with root package name */
        int f3388c;

        /* renamed from: d, reason: collision with root package name */
        int f3389d;

        /* renamed from: e, reason: collision with root package name */
        ViewGroup f3390e;

        /* renamed from: f, reason: collision with root package name */
        ViewGroup f3391f;

        c() {
        }
    }

    private void e0(s sVar) {
        sVar.a.put("android:visibility:visibility", Integer.valueOf(sVar.f3415b.getVisibility()));
        sVar.a.put("android:visibility:parent", sVar.f3415b.getParent());
        int[] iArr = new int[2];
        sVar.f3415b.getLocationOnScreen(iArr);
        sVar.a.put("android:visibility:screenLocation", iArr);
    }

    private c f0(s sVar, s sVar2) {
        c cVar = new c();
        cVar.a = false;
        cVar.f3387b = false;
        if (sVar == null || !sVar.a.containsKey("android:visibility:visibility")) {
            cVar.f3388c = -1;
            cVar.f3390e = null;
        } else {
            cVar.f3388c = ((Integer) sVar.a.get("android:visibility:visibility")).intValue();
            cVar.f3390e = (ViewGroup) sVar.a.get("android:visibility:parent");
        }
        if (sVar2 == null || !sVar2.a.containsKey("android:visibility:visibility")) {
            cVar.f3389d = -1;
            cVar.f3391f = null;
        } else {
            cVar.f3389d = ((Integer) sVar2.a.get("android:visibility:visibility")).intValue();
            cVar.f3391f = (ViewGroup) sVar2.a.get("android:visibility:parent");
        }
        if (sVar != null && sVar2 != null) {
            int i2 = cVar.f3388c;
            int i3 = cVar.f3389d;
            if (i2 == i3 && cVar.f3390e == cVar.f3391f) {
                return cVar;
            }
            if (i2 != i3) {
                if (i2 == 0) {
                    cVar.f3387b = false;
                    cVar.a = true;
                } else if (i3 == 0) {
                    cVar.f3387b = true;
                    cVar.a = true;
                }
            } else if (cVar.f3391f == null) {
                cVar.f3387b = false;
                cVar.a = true;
            } else if (cVar.f3390e == null) {
                cVar.f3387b = true;
                cVar.a = true;
            }
        } else if (sVar == null && cVar.f3389d == 0) {
            cVar.f3387b = true;
            cVar.a = true;
        } else if (sVar2 == null && cVar.f3388c == 0) {
            cVar.f3387b = false;
            cVar.a = true;
        }
        return cVar;
    }

    @Override // c.s.m
    public String[] D() {
        return O;
    }

    @Override // c.s.m
    public boolean F(s sVar, s sVar2) {
        if (sVar == null && sVar2 == null) {
            return false;
        }
        if (sVar != null && sVar2 != null && sVar2.a.containsKey("android:visibility:visibility") != sVar.a.containsKey("android:visibility:visibility")) {
            return false;
        }
        c cVarF0 = f0(sVar, sVar2);
        if (cVarF0.a) {
            return cVarF0.f3388c == 0 || cVarF0.f3389d == 0;
        }
        return false;
    }

    @Override // c.s.m
    public void g(s sVar) {
        e0(sVar);
    }

    public abstract Animator g0(ViewGroup viewGroup, View view, s sVar, s sVar2);

    public Animator h0(ViewGroup viewGroup, s sVar, int i2, s sVar2, int i3) {
        if ((this.P & 1) != 1 || sVar2 == null) {
            return null;
        }
        if (sVar == null) {
            View view = (View) sVar2.f3415b.getParent();
            if (f0(t(view, false), E(view, false)).a) {
                return null;
            }
        }
        return g0(viewGroup, sVar2.f3415b, sVar, sVar2);
    }

    public abstract Animator i0(ViewGroup viewGroup, View view, s sVar, s sVar2);

    @Override // c.s.m
    public void j(s sVar) {
        e0(sVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x008f A[PHI: r8
  0x008f: PHI (r8v3 android.view.View) = 
  (r8v2 android.view.View)
  (r8v2 android.view.View)
  (r8v2 android.view.View)
  (r8v2 android.view.View)
  (r8v2 android.view.View)
  (r8v2 android.view.View)
  (r8v6 android.view.View)
 binds: [B:26:0x0048, B:31:0x0057, B:36:0x007c, B:38:0x007f, B:40:0x0085, B:42:0x0089, B:34:0x006f] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.animation.Animator j0(android.view.ViewGroup r18, c.s.s r19, int r20, c.s.s r21, int r22) throws java.lang.IllegalAccessException, java.lang.NoSuchFieldException, java.lang.IllegalArgumentException {
        /*
            Method dump skipped, instructions count: 264
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c.s.j0.j0(android.view.ViewGroup, c.s.s, int, c.s.s, int):android.animation.Animator");
    }

    public void k0(int i2) {
        if ((i2 & (-4)) != 0) {
            throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
        }
        this.P = i2;
    }

    @Override // c.s.m
    public Animator n(ViewGroup viewGroup, s sVar, s sVar2) {
        c cVarF0 = f0(sVar, sVar2);
        if (!cVarF0.a) {
            return null;
        }
        if (cVarF0.f3390e == null && cVarF0.f3391f == null) {
            return null;
        }
        return cVarF0.f3387b ? h0(viewGroup, sVar, cVarF0.f3388c, sVar2, cVarF0.f3389d) : j0(viewGroup, sVar, cVarF0.f3388c, sVar2, cVarF0.f3389d);
    }
}