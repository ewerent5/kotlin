package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.Property;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import c.h.l.t;
import ch.qos.logback.core.net.SyslogConstants;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import e.c.b.c.f;
import e.c.b.c.m.h;
import e.c.b.c.m.i;
import e.c.b.c.m.j;
import e.c.b.c.r.d;
import java.util.ArrayList;
import java.util.List;

@Deprecated
/* loaded from: classes.dex */
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {

    /* renamed from: c, reason: collision with root package name */
    private final Rect f11907c;

    /* renamed from: d, reason: collision with root package name */
    private final RectF f11908d;

    /* renamed from: e, reason: collision with root package name */
    private final RectF f11909e;

    /* renamed from: f, reason: collision with root package name */
    private final int[] f11910f;

    /* renamed from: g, reason: collision with root package name */
    private float f11911g;

    /* renamed from: h, reason: collision with root package name */
    private float f11912h;

    class a extends AnimatorListenerAdapter {
        final /* synthetic */ boolean a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f11913b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f11914c;

        a(boolean z, View view, View view2) {
            this.a = z;
            this.f11913b = view;
            this.f11914c = view2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.a) {
                return;
            }
            this.f11913b.setVisibility(4);
            this.f11914c.setAlpha(1.0f);
            this.f11914c.setVisibility(0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (this.a) {
                this.f11913b.setVisibility(0);
                this.f11914c.setAlpha(0.0f);
                this.f11914c.setVisibility(4);
            }
        }
    }

    class b implements ValueAnimator.AnimatorUpdateListener {
        final /* synthetic */ View a;

        b(View view) {
            this.a = view;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.a.invalidate();
        }
    }

    class c extends AnimatorListenerAdapter {
        final /* synthetic */ e.c.b.c.r.d a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Drawable f11917b;

        c(e.c.b.c.r.d dVar, Drawable drawable) {
            this.a = dVar;
            this.f11917b = drawable;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.a.setCircularRevealOverlayDrawable(null);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.a.setCircularRevealOverlayDrawable(this.f11917b);
        }
    }

    class d extends AnimatorListenerAdapter {
        final /* synthetic */ e.c.b.c.r.d a;

        d(e.c.b.c.r.d dVar) {
            this.a = dVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            d.e revealInfo = this.a.getRevealInfo();
            revealInfo.f15307c = Float.MAX_VALUE;
            this.a.setRevealInfo(revealInfo);
        }
    }

    protected static class e {
        public h a;

        /* renamed from: b, reason: collision with root package name */
        public j f11920b;

        protected e() {
        }
    }

    public FabTransformationBehavior() {
        this.f11907c = new Rect();
        this.f11908d = new RectF();
        this.f11909e = new RectF();
        this.f11910f = new int[2];
    }

    private ViewGroup K(View view) {
        View viewFindViewById = view.findViewById(f.A);
        return viewFindViewById != null ? f0(viewFindViewById) : ((view instanceof com.google.android.material.transformation.b) || (view instanceof com.google.android.material.transformation.a)) ? f0(((ViewGroup) view).getChildAt(0)) : f0(view);
    }

    private void L(View view, e eVar, i iVar, i iVar2, float f2, float f3, float f4, float f5, RectF rectF) {
        float fS = S(eVar, iVar, f2, f4);
        float fS2 = S(eVar, iVar2, f3, f5);
        Rect rect = this.f11907c;
        view.getWindowVisibleDisplayFrame(rect);
        RectF rectF2 = this.f11908d;
        rectF2.set(rect);
        RectF rectF3 = this.f11909e;
        T(view, rectF3);
        rectF3.offset(fS, fS2);
        rectF3.intersect(rectF2);
        rectF.set(rectF3);
    }

    private void M(View view, RectF rectF) {
        T(view, rectF);
        rectF.offset(this.f11911g, this.f11912h);
    }

    private Pair<i, i> N(float f2, float f3, boolean z, e eVar) {
        i iVarE;
        i iVarE2;
        if (f2 == 0.0f || f3 == 0.0f) {
            iVarE = eVar.a.e("translationXLinear");
            iVarE2 = eVar.a.e("translationYLinear");
        } else if ((!z || f3 >= 0.0f) && (z || f3 <= 0.0f)) {
            iVarE = eVar.a.e("translationXCurveDownwards");
            iVarE2 = eVar.a.e("translationYCurveDownwards");
        } else {
            iVarE = eVar.a.e("translationXCurveUpwards");
            iVarE2 = eVar.a.e("translationYCurveUpwards");
        }
        return new Pair<>(iVarE, iVarE2);
    }

    private float O(View view, View view2, j jVar) {
        RectF rectF = this.f11908d;
        RectF rectF2 = this.f11909e;
        M(view, rectF);
        T(view2, rectF2);
        rectF2.offset(-Q(view, view2, jVar), 0.0f);
        return rectF.centerX() - rectF2.left;
    }

    private float P(View view, View view2, j jVar) {
        RectF rectF = this.f11908d;
        RectF rectF2 = this.f11909e;
        M(view, rectF);
        T(view2, rectF2);
        rectF2.offset(0.0f, -R(view, view2, jVar));
        return rectF.centerY() - rectF2.top;
    }

    private float Q(View view, View view2, j jVar) {
        float fCenterX;
        float fCenterX2;
        float f2;
        RectF rectF = this.f11908d;
        RectF rectF2 = this.f11909e;
        M(view, rectF);
        T(view2, rectF2);
        int i2 = jVar.a & 7;
        if (i2 == 1) {
            fCenterX = rectF2.centerX();
            fCenterX2 = rectF.centerX();
        } else if (i2 == 3) {
            fCenterX = rectF2.left;
            fCenterX2 = rectF.left;
        } else {
            if (i2 != 5) {
                f2 = 0.0f;
                return f2 + jVar.f15276b;
            }
            fCenterX = rectF2.right;
            fCenterX2 = rectF.right;
        }
        f2 = fCenterX - fCenterX2;
        return f2 + jVar.f15276b;
    }

    private float R(View view, View view2, j jVar) {
        float fCenterY;
        float fCenterY2;
        float f2;
        RectF rectF = this.f11908d;
        RectF rectF2 = this.f11909e;
        M(view, rectF);
        T(view2, rectF2);
        int i2 = jVar.a & SyslogConstants.LOG_ALERT;
        if (i2 == 16) {
            fCenterY = rectF2.centerY();
            fCenterY2 = rectF.centerY();
        } else if (i2 == 48) {
            fCenterY = rectF2.top;
            fCenterY2 = rectF.top;
        } else {
            if (i2 != 80) {
                f2 = 0.0f;
                return f2 + jVar.f15277c;
            }
            fCenterY = rectF2.bottom;
            fCenterY2 = rectF.bottom;
        }
        f2 = fCenterY - fCenterY2;
        return f2 + jVar.f15277c;
    }

    private float S(e eVar, i iVar, float f2, float f3) {
        long jC = iVar.c();
        long jD = iVar.d();
        i iVarE = eVar.a.e("expansion");
        return e.c.b.c.m.a.a(f2, f3, iVar.e().getInterpolation((((iVarE.c() + iVarE.d()) + 17) - jC) / jD));
    }

    private void T(View view, RectF rectF) {
        rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
        view.getLocationInWindow(this.f11910f);
        rectF.offsetTo(r0[0], r0[1]);
        rectF.offset((int) (-view.getTranslationX()), (int) (-view.getTranslationY()));
    }

    private void U(View view, View view2, boolean z, boolean z2, e eVar, List<Animator> list, List<Animator.AnimatorListener> list2) {
        ViewGroup viewGroupK;
        ObjectAnimator objectAnimatorOfFloat;
        if (view2 instanceof ViewGroup) {
            if (((view2 instanceof e.c.b.c.r.d) && e.c.b.c.r.c.a == 0) || (viewGroupK = K(view2)) == null) {
                return;
            }
            if (z) {
                if (!z2) {
                    e.c.b.c.m.d.a.set(viewGroupK, Float.valueOf(0.0f));
                }
                objectAnimatorOfFloat = ObjectAnimator.ofFloat(viewGroupK, e.c.b.c.m.d.a, 1.0f);
            } else {
                objectAnimatorOfFloat = ObjectAnimator.ofFloat(viewGroupK, e.c.b.c.m.d.a, 0.0f);
            }
            eVar.a.e("contentFade").a(objectAnimatorOfFloat);
            list.add(objectAnimatorOfFloat);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void V(View view, View view2, boolean z, boolean z2, e eVar, List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator objectAnimatorOfInt;
        if (view2 instanceof e.c.b.c.r.d) {
            e.c.b.c.r.d dVar = (e.c.b.c.r.d) view2;
            int iD0 = d0(view);
            int i2 = 16777215 & iD0;
            if (z) {
                if (!z2) {
                    dVar.setCircularRevealScrimColor(iD0);
                }
                objectAnimatorOfInt = ObjectAnimator.ofInt(dVar, d.C0184d.a, i2);
            } else {
                objectAnimatorOfInt = ObjectAnimator.ofInt(dVar, d.C0184d.a, iD0);
            }
            objectAnimatorOfInt.setEvaluator(e.c.b.c.m.c.b());
            eVar.a.e("color").a(objectAnimatorOfInt);
            list.add(objectAnimatorOfInt);
        }
    }

    private void W(View view, View view2, boolean z, e eVar, List<Animator> list) {
        float fQ = Q(view, view2, eVar.f11920b);
        float fR = R(view, view2, eVar.f11920b);
        Pair<i, i> pairN = N(fQ, fR, z, eVar);
        i iVar = (i) pairN.first;
        i iVar2 = (i) pairN.second;
        Property property = View.TRANSLATION_X;
        float[] fArr = new float[1];
        if (!z) {
            fQ = this.f11911g;
        }
        fArr[0] = fQ;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, fArr);
        Property property2 = View.TRANSLATION_Y;
        float[] fArr2 = new float[1];
        if (!z) {
            fR = this.f11912h;
        }
        fArr2[0] = fR;
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view, (Property<View, Float>) property2, fArr2);
        iVar.a(objectAnimatorOfFloat);
        iVar2.a(objectAnimatorOfFloat2);
        list.add(objectAnimatorOfFloat);
        list.add(objectAnimatorOfFloat2);
    }

    @TargetApi(21)
    private void X(View view, View view2, boolean z, boolean z2, e eVar, List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator objectAnimatorOfFloat;
        float fW = t.w(view2) - t.w(view);
        if (z) {
            if (!z2) {
                view2.setTranslationZ(-fW);
            }
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Z, 0.0f);
        } else {
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Z, -fW);
        }
        eVar.a.e("elevation").a(objectAnimatorOfFloat);
        list.add(objectAnimatorOfFloat);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void Y(View view, View view2, boolean z, boolean z2, e eVar, float f2, float f3, List<Animator> list, List<Animator.AnimatorListener> list2) {
        Animator animatorA;
        if (view2 instanceof e.c.b.c.r.d) {
            e.c.b.c.r.d dVar = (e.c.b.c.r.d) view2;
            float fO = O(view, view2, eVar.f11920b);
            float fP = P(view, view2, eVar.f11920b);
            ((FloatingActionButton) view).i(this.f11907c);
            float fWidth = this.f11907c.width() / 2.0f;
            i iVarE = eVar.a.e("expansion");
            if (z) {
                if (!z2) {
                    dVar.setRevealInfo(new d.e(fO, fP, fWidth));
                }
                if (z2) {
                    fWidth = dVar.getRevealInfo().f15307c;
                }
                animatorA = e.c.b.c.r.a.a(dVar, fO, fP, e.c.b.c.x.a.b(fO, fP, 0.0f, 0.0f, f2, f3));
                animatorA.addListener(new d(dVar));
                b0(view2, iVarE.c(), (int) fO, (int) fP, fWidth, list);
            } else {
                float f4 = dVar.getRevealInfo().f15307c;
                Animator animatorA2 = e.c.b.c.r.a.a(dVar, fO, fP, fWidth);
                int i2 = (int) fO;
                int i3 = (int) fP;
                b0(view2, iVarE.c(), i2, i3, f4, list);
                a0(view2, iVarE.c(), iVarE.d(), eVar.a.f(), i2, i3, fWidth, list);
                animatorA = animatorA2;
            }
            iVarE.a(animatorA);
            list.add(animatorA);
            list2.add(e.c.b.c.r.a.b(dVar));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void Z(View view, View view2, boolean z, boolean z2, e eVar, List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator objectAnimatorOfInt;
        if ((view2 instanceof e.c.b.c.r.d) && (view instanceof ImageView)) {
            e.c.b.c.r.d dVar = (e.c.b.c.r.d) view2;
            Drawable drawable = ((ImageView) view).getDrawable();
            if (drawable == null) {
                return;
            }
            drawable.mutate();
            if (z) {
                if (!z2) {
                    drawable.setAlpha(255);
                }
                objectAnimatorOfInt = ObjectAnimator.ofInt(drawable, e.c.b.c.m.e.a, 0);
            } else {
                objectAnimatorOfInt = ObjectAnimator.ofInt(drawable, e.c.b.c.m.e.a, 255);
            }
            objectAnimatorOfInt.addUpdateListener(new b(view2));
            eVar.a.e("iconFade").a(objectAnimatorOfInt);
            list.add(objectAnimatorOfInt);
            list2.add(new c(dVar, drawable));
        }
    }

    private void a0(View view, long j2, long j3, long j4, int i2, int i3, float f2, List<Animator> list) {
        if (Build.VERSION.SDK_INT >= 21) {
            long j5 = j2 + j3;
            if (j5 < j4) {
                Animator animatorCreateCircularReveal = ViewAnimationUtils.createCircularReveal(view, i2, i3, f2, f2);
                animatorCreateCircularReveal.setStartDelay(j5);
                animatorCreateCircularReveal.setDuration(j4 - j5);
                list.add(animatorCreateCircularReveal);
            }
        }
    }

    private void b0(View view, long j2, int i2, int i3, float f2, List<Animator> list) {
        if (Build.VERSION.SDK_INT < 21 || j2 <= 0) {
            return;
        }
        Animator animatorCreateCircularReveal = ViewAnimationUtils.createCircularReveal(view, i2, i3, f2, f2);
        animatorCreateCircularReveal.setStartDelay(0L);
        animatorCreateCircularReveal.setDuration(j2);
        list.add(animatorCreateCircularReveal);
    }

    private void c0(View view, View view2, boolean z, boolean z2, e eVar, List<Animator> list, List<Animator.AnimatorListener> list2, RectF rectF) {
        ObjectAnimator objectAnimatorOfFloat;
        ObjectAnimator objectAnimatorOfFloat2;
        float fQ = Q(view, view2, eVar.f11920b);
        float fR = R(view, view2, eVar.f11920b);
        Pair<i, i> pairN = N(fQ, fR, z, eVar);
        i iVar = (i) pairN.first;
        i iVar2 = (i) pairN.second;
        if (z) {
            if (!z2) {
                view2.setTranslationX(-fQ);
                view2.setTranslationY(-fR);
            }
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_X, 0.0f);
            objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Y, 0.0f);
            L(view2, eVar, iVar, iVar2, -fQ, -fR, 0.0f, 0.0f, rectF);
        } else {
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_X, -fQ);
            objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Y, -fR);
        }
        iVar.a(objectAnimatorOfFloat);
        iVar2.a(objectAnimatorOfFloat2);
        list.add(objectAnimatorOfFloat);
        list.add(objectAnimatorOfFloat2);
    }

    private int d0(View view) {
        ColorStateList colorStateListS = t.s(view);
        if (colorStateListS != null) {
            return colorStateListS.getColorForState(view.getDrawableState(), colorStateListS.getDefaultColor());
        }
        return 0;
    }

    private ViewGroup f0(View view) {
        if (view instanceof ViewGroup) {
            return (ViewGroup) view;
        }
        return null;
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    protected AnimatorSet J(View view, View view2, boolean z, boolean z2) {
        e eVarE0 = e0(view2.getContext(), z);
        if (z) {
            this.f11911g = view.getTranslationX();
            this.f11912h = view.getTranslationY();
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (Build.VERSION.SDK_INT >= 21) {
            X(view, view2, z, z2, eVarE0, arrayList, arrayList2);
        }
        RectF rectF = this.f11908d;
        c0(view, view2, z, z2, eVarE0, arrayList, arrayList2, rectF);
        float fWidth = rectF.width();
        float fHeight = rectF.height();
        W(view, view2, z, eVarE0, arrayList);
        Z(view, view2, z, z2, eVarE0, arrayList, arrayList2);
        Y(view, view2, z, z2, eVarE0, fWidth, fHeight, arrayList, arrayList2);
        V(view, view2, z, z2, eVarE0, arrayList, arrayList2);
        U(view, view2, z, z2, eVarE0, arrayList, arrayList2);
        AnimatorSet animatorSet = new AnimatorSet();
        e.c.b.c.m.b.a(animatorSet, arrayList);
        animatorSet.addListener(new a(z, view2, view));
        int size = arrayList2.size();
        for (int i2 = 0; i2 < size; i2++) {
            animatorSet.addListener(arrayList2.get(i2));
        }
        return animatorSet;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean e(CoordinatorLayout coordinatorLayout, View view, View view2) {
        if (view.getVisibility() == 8) {
            throw new IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
        }
        if (!(view2 instanceof FloatingActionButton)) {
            return false;
        }
        int expandedComponentIdHint = ((FloatingActionButton) view2).getExpandedComponentIdHint();
        return expandedComponentIdHint == 0 || expandedComponentIdHint == view.getId();
    }

    protected abstract e e0(Context context, boolean z);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void g(CoordinatorLayout.f fVar) {
        if (fVar.f802h == 0) {
            fVar.f802h = 80;
        }
    }

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f11907c = new Rect();
        this.f11908d = new RectF();
        this.f11909e = new RectF();
        this.f11910f = new int[2];
    }
}