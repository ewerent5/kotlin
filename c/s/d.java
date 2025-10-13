package c.s;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: Fade.java */
/* loaded from: classes.dex */
public class d extends j0 {

    /* compiled from: Fade.java */
    class a extends n {
        final /* synthetic */ View a;

        a(View view) {
            this.a = view;
        }

        @Override // c.s.m.f
        public void c(m mVar) {
            c0.g(this.a, 1.0f);
            c0.a(this.a);
            mVar.Q(this);
        }
    }

    /* compiled from: Fade.java */
    private static class b extends AnimatorListenerAdapter {
        private final View a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f3350b = false;

        b(View view) {
            this.a = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            c0.g(this.a, 1.0f);
            if (this.f3350b) {
                this.a.setLayerType(0, null);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (c.h.l.t.M(this.a) && this.a.getLayerType() == 0) {
                this.f3350b = true;
                this.a.setLayerType(2, null);
            }
        }
    }

    public d(int i2) {
        k0(i2);
    }

    private Animator l0(View view, float f2, float f3) {
        if (f2 == f3) {
            return null;
        }
        c0.g(view, f2);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, c0.f3347b, f3);
        objectAnimatorOfFloat.addListener(new b(view));
        a(new a(view));
        return objectAnimatorOfFloat;
    }

    private static float m0(s sVar, float f2) {
        Float f3;
        return (sVar == null || (f3 = (Float) sVar.a.get("android:fade:transitionAlpha")) == null) ? f2 : f3.floatValue();
    }

    @Override // c.s.j0
    public Animator g0(ViewGroup viewGroup, View view, s sVar, s sVar2) {
        float fM0 = m0(sVar, 0.0f);
        return l0(view, fM0 != 1.0f ? fM0 : 0.0f, 1.0f);
    }

    @Override // c.s.j0
    public Animator i0(ViewGroup viewGroup, View view, s sVar, s sVar2) {
        c0.e(view);
        return l0(view, m0(sVar, 1.0f), 0.0f);
    }

    @Override // c.s.j0, c.s.m
    public void j(s sVar) {
        super.j(sVar);
        sVar.a.put("android:fade:transitionAlpha", Float.valueOf(c0.c(sVar.f3415b)));
    }
}