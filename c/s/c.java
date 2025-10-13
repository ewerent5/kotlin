package c.s;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

/* compiled from: ChangeBounds.java */
/* loaded from: classes.dex */
public class c extends m {
    private static final String[] O = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};
    private static final Property<Drawable, PointF> P = new b(PointF.class, "boundsOrigin");
    private static final Property<k, PointF> Q = new C0072c(PointF.class, "topLeft");
    private static final Property<k, PointF> R = new d(PointF.class, "bottomRight");
    private static final Property<View, PointF> S = new e(PointF.class, "bottomRight");
    private static final Property<View, PointF> T = new f(PointF.class, "topLeft");
    private static final Property<View, PointF> U = new g(PointF.class, "position");
    private static c.s.k V = new c.s.k();
    private int[] W = new int[2];
    private boolean X = false;
    private boolean Y = false;

    /* compiled from: ChangeBounds.java */
    class a extends AnimatorListenerAdapter {
        final /* synthetic */ ViewGroup a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ BitmapDrawable f3327b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f3328c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ float f3329d;

        a(ViewGroup viewGroup, BitmapDrawable bitmapDrawable, View view, float f2) {
            this.a = viewGroup;
            this.f3327b = bitmapDrawable;
            this.f3328c = view;
            this.f3329d = f2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            c0.b(this.a).b(this.f3327b);
            c0.g(this.f3328c, this.f3329d);
        }
    }

    /* compiled from: ChangeBounds.java */
    static class b extends Property<Drawable, PointF> {
        private Rect a;

        b(Class cls, String str) {
            super(cls, str);
            this.a = new Rect();
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(Drawable drawable) {
            drawable.copyBounds(this.a);
            Rect rect = this.a;
            return new PointF(rect.left, rect.top);
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(Drawable drawable, PointF pointF) {
            drawable.copyBounds(this.a);
            this.a.offsetTo(Math.round(pointF.x), Math.round(pointF.y));
            drawable.setBounds(this.a);
        }
    }

    /* compiled from: ChangeBounds.java */
    /* renamed from: c.s.c$c, reason: collision with other inner class name */
    static class C0072c extends Property<k, PointF> {
        C0072c(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(k kVar) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(k kVar, PointF pointF) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
            kVar.c(pointF);
        }
    }

    /* compiled from: ChangeBounds.java */
    static class d extends Property<k, PointF> {
        d(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(k kVar) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(k kVar, PointF pointF) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
            kVar.a(pointF);
        }
    }

    /* compiled from: ChangeBounds.java */
    static class e extends Property<View, PointF> {
        e(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, PointF pointF) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
            c0.f(view, view.getLeft(), view.getTop(), Math.round(pointF.x), Math.round(pointF.y));
        }
    }

    /* compiled from: ChangeBounds.java */
    static class f extends Property<View, PointF> {
        f(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, PointF pointF) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
            c0.f(view, Math.round(pointF.x), Math.round(pointF.y), view.getRight(), view.getBottom());
        }
    }

    /* compiled from: ChangeBounds.java */
    static class g extends Property<View, PointF> {
        g(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, PointF pointF) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
            int iRound = Math.round(pointF.x);
            int iRound2 = Math.round(pointF.y);
            c0.f(view, iRound, iRound2, view.getWidth() + iRound, view.getHeight() + iRound2);
        }
    }

    /* compiled from: ChangeBounds.java */
    class h extends AnimatorListenerAdapter {
        final /* synthetic */ k a;
        private k mViewBounds;

        h(k kVar) {
            this.a = kVar;
            this.mViewBounds = kVar;
        }
    }

    /* compiled from: ChangeBounds.java */
    class i extends AnimatorListenerAdapter {
        private boolean a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f3332b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Rect f3333c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f3334d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f3335e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f3336f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f3337g;

        i(View view, Rect rect, int i2, int i3, int i4, int i5) {
            this.f3332b = view;
            this.f3333c = rect;
            this.f3334d = i2;
            this.f3335e = i3;
            this.f3336f = i4;
            this.f3337g = i5;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
            if (this.a) {
                return;
            }
            c.h.l.t.q0(this.f3332b, this.f3333c);
            c0.f(this.f3332b, this.f3334d, this.f3335e, this.f3336f, this.f3337g);
        }
    }

    /* compiled from: ChangeBounds.java */
    class j extends n {
        boolean a = false;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ViewGroup f3339b;

        j(ViewGroup viewGroup) {
            this.f3339b = viewGroup;
        }

        @Override // c.s.n, c.s.m.f
        public void b(m mVar) throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
            x.c(this.f3339b, false);
        }

        @Override // c.s.m.f
        public void c(m mVar) throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
            if (!this.a) {
                x.c(this.f3339b, false);
            }
            mVar.Q(this);
        }

        @Override // c.s.n, c.s.m.f
        public void d(m mVar) throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
            x.c(this.f3339b, false);
            this.a = true;
        }

        @Override // c.s.n, c.s.m.f
        public void e(m mVar) throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
            x.c(this.f3339b, true);
        }
    }

    /* compiled from: ChangeBounds.java */
    private static class k {
        private int a;

        /* renamed from: b, reason: collision with root package name */
        private int f3341b;

        /* renamed from: c, reason: collision with root package name */
        private int f3342c;

        /* renamed from: d, reason: collision with root package name */
        private int f3343d;

        /* renamed from: e, reason: collision with root package name */
        private View f3344e;

        /* renamed from: f, reason: collision with root package name */
        private int f3345f;

        /* renamed from: g, reason: collision with root package name */
        private int f3346g;

        k(View view) {
            this.f3344e = view;
        }

        private void b() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
            c0.f(this.f3344e, this.a, this.f3341b, this.f3342c, this.f3343d);
            this.f3345f = 0;
            this.f3346g = 0;
        }

        void a(PointF pointF) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
            this.f3342c = Math.round(pointF.x);
            this.f3343d = Math.round(pointF.y);
            int i2 = this.f3346g + 1;
            this.f3346g = i2;
            if (this.f3345f == i2) {
                b();
            }
        }

        void c(PointF pointF) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
            this.a = Math.round(pointF.x);
            this.f3341b = Math.round(pointF.y);
            int i2 = this.f3345f + 1;
            this.f3345f = i2;
            if (i2 == this.f3346g) {
                b();
            }
        }
    }

    private void e0(s sVar) {
        View view = sVar.f3415b;
        if (!c.h.l.t.Q(view) && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        sVar.a.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        sVar.a.put("android:changeBounds:parent", sVar.f3415b.getParent());
        if (this.Y) {
            sVar.f3415b.getLocationInWindow(this.W);
            sVar.a.put("android:changeBounds:windowX", Integer.valueOf(this.W[0]));
            sVar.a.put("android:changeBounds:windowY", Integer.valueOf(this.W[1]));
        }
        if (this.X) {
            sVar.a.put("android:changeBounds:clip", c.h.l.t.u(view));
        }
    }

    private boolean f0(View view, View view2) {
        if (!this.Y) {
            return true;
        }
        s sVarT = t(view, true);
        if (sVarT == null) {
            if (view == view2) {
                return true;
            }
        } else if (view2 == sVarT.f3415b) {
            return true;
        }
        return false;
    }

    @Override // c.s.m
    public String[] D() {
        return O;
    }

    @Override // c.s.m
    public void g(s sVar) {
        e0(sVar);
    }

    @Override // c.s.m
    public void j(s sVar) {
        e0(sVar);
    }

    @Override // c.s.m
    public Animator n(ViewGroup viewGroup, s sVar, s sVar2) throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        int i2;
        View view;
        int i3;
        Rect rect;
        ObjectAnimator objectAnimator;
        Animator animatorC;
        if (sVar == null || sVar2 == null) {
            return null;
        }
        Map<String, Object> map = sVar.a;
        Map<String, Object> map2 = sVar2.a;
        ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
        ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        View view2 = sVar2.f3415b;
        if (!f0(viewGroup2, viewGroup3)) {
            int iIntValue = ((Integer) sVar.a.get("android:changeBounds:windowX")).intValue();
            int iIntValue2 = ((Integer) sVar.a.get("android:changeBounds:windowY")).intValue();
            int iIntValue3 = ((Integer) sVar2.a.get("android:changeBounds:windowX")).intValue();
            int iIntValue4 = ((Integer) sVar2.a.get("android:changeBounds:windowY")).intValue();
            if (iIntValue == iIntValue3 && iIntValue2 == iIntValue4) {
                return null;
            }
            viewGroup.getLocationInWindow(this.W);
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(view2.getWidth(), view2.getHeight(), Bitmap.Config.ARGB_8888);
            view2.draw(new Canvas(bitmapCreateBitmap));
            BitmapDrawable bitmapDrawable = new BitmapDrawable(bitmapCreateBitmap);
            float fC = c0.c(view2);
            c0.g(view2, 0.0f);
            c0.b(viewGroup).a(bitmapDrawable);
            c.s.g gVarV = v();
            int[] iArr = this.W;
            ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(bitmapDrawable, c.s.i.a(P, gVarV.a(iIntValue - iArr[0], iIntValue2 - iArr[1], iIntValue3 - iArr[0], iIntValue4 - iArr[1])));
            objectAnimatorOfPropertyValuesHolder.addListener(new a(viewGroup, bitmapDrawable, view2, fC));
            return objectAnimatorOfPropertyValuesHolder;
        }
        Rect rect2 = (Rect) sVar.a.get("android:changeBounds:bounds");
        Rect rect3 = (Rect) sVar2.a.get("android:changeBounds:bounds");
        int i4 = rect2.left;
        int i5 = rect3.left;
        int i6 = rect2.top;
        int i7 = rect3.top;
        int i8 = rect2.right;
        int i9 = rect3.right;
        int i10 = rect2.bottom;
        int i11 = rect3.bottom;
        int i12 = i8 - i4;
        int i13 = i10 - i6;
        int i14 = i9 - i5;
        int i15 = i11 - i7;
        Rect rect4 = (Rect) sVar.a.get("android:changeBounds:clip");
        Rect rect5 = (Rect) sVar2.a.get("android:changeBounds:clip");
        if ((i12 == 0 || i13 == 0) && (i14 == 0 || i15 == 0)) {
            i2 = 0;
        } else {
            i2 = (i4 == i5 && i6 == i7) ? 0 : 1;
            if (i8 != i9 || i10 != i11) {
                i2++;
            }
        }
        if ((rect4 != null && !rect4.equals(rect5)) || (rect4 == null && rect5 != null)) {
            i2++;
        }
        if (i2 <= 0) {
            return null;
        }
        if (this.X) {
            view = view2;
            c0.f(view, i4, i6, Math.max(i12, i14) + i4, Math.max(i13, i15) + i6);
            ObjectAnimator objectAnimatorA = (i4 == i5 && i6 == i7) ? null : c.s.f.a(view, U, v().a(i4, i6, i5, i7));
            if (rect4 == null) {
                i3 = 0;
                rect = new Rect(0, 0, i12, i13);
            } else {
                i3 = 0;
                rect = rect4;
            }
            Rect rect6 = rect5 == null ? new Rect(i3, i3, i14, i15) : rect5;
            if (rect.equals(rect6)) {
                objectAnimator = null;
            } else {
                c.h.l.t.q0(view, rect);
                c.s.k kVar = V;
                Object[] objArr = new Object[2];
                objArr[i3] = rect;
                objArr[1] = rect6;
                ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(view, "clipBounds", kVar, objArr);
                objectAnimatorOfObject.addListener(new i(view, rect5, i5, i7, i9, i11));
                objectAnimator = objectAnimatorOfObject;
            }
            animatorC = r.c(objectAnimatorA, objectAnimator);
        } else {
            view = view2;
            c0.f(view, i4, i6, i8, i10);
            if (i2 != 2) {
                animatorC = (i4 == i5 && i6 == i7) ? c.s.f.a(view, S, v().a(i8, i10, i9, i11)) : c.s.f.a(view, T, v().a(i4, i6, i5, i7));
            } else if (i12 == i14 && i13 == i15) {
                animatorC = c.s.f.a(view, U, v().a(i4, i6, i5, i7));
            } else {
                k kVar2 = new k(view);
                ObjectAnimator objectAnimatorA2 = c.s.f.a(kVar2, Q, v().a(i4, i6, i5, i7));
                ObjectAnimator objectAnimatorA3 = c.s.f.a(kVar2, R, v().a(i8, i10, i9, i11));
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(objectAnimatorA2, objectAnimatorA3);
                animatorSet.addListener(new h(kVar2));
                animatorC = animatorSet;
            }
        }
        if (view.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup4 = (ViewGroup) view.getParent();
            x.c(viewGroup4, true);
            a(new j(viewGroup4));
        }
        return animatorC;
    }
}