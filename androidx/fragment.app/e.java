package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.Transformation;
import androidx.fragment.app.v;
import c.h.h.a;

/* compiled from: FragmentAnim.java */
/* loaded from: classes.dex */
class e {

    /* compiled from: FragmentAnim.java */
    static class a implements a.InterfaceC0050a {
        final /* synthetic */ Fragment a;

        a(Fragment fragment) {
            this.a = fragment;
        }

        @Override // c.h.h.a.InterfaceC0050a
        public void a() {
            if (this.a.m0() != null) {
                View viewM0 = this.a.m0();
                this.a.q2(null);
                viewM0.clearAnimation();
            }
            this.a.r2(null);
        }
    }

    /* compiled from: FragmentAnim.java */
    static class b implements Animation.AnimationListener {
        final /* synthetic */ ViewGroup a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Fragment f1011b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ v.g f1012c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ c.h.h.a f1013d;

        /* compiled from: FragmentAnim.java */
        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (b.this.f1011b.m0() != null) {
                    b.this.f1011b.q2(null);
                    b bVar = b.this;
                    bVar.f1012c.a(bVar.f1011b, bVar.f1013d);
                }
            }
        }

        b(ViewGroup viewGroup, Fragment fragment, v.g gVar, c.h.h.a aVar) {
            this.a = viewGroup;
            this.f1011b = fragment;
            this.f1012c = gVar;
            this.f1013d = aVar;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            this.a.post(new a());
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* compiled from: FragmentAnim.java */
    static class c extends AnimatorListenerAdapter {
        final /* synthetic */ ViewGroup a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f1015b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Fragment f1016c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ v.g f1017d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ c.h.h.a f1018e;

        c(ViewGroup viewGroup, View view, Fragment fragment, v.g gVar, c.h.h.a aVar) {
            this.a = viewGroup;
            this.f1015b = view;
            this.f1016c = fragment;
            this.f1017d = gVar;
            this.f1018e = aVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.a.endViewTransition(this.f1015b);
            Animator animatorN0 = this.f1016c.n0();
            this.f1016c.r2(null);
            if (animatorN0 == null || this.a.indexOfChild(this.f1015b) >= 0) {
                return;
            }
            this.f1017d.a(this.f1016c, this.f1018e);
        }
    }

    static void a(Fragment fragment, d dVar, v.g gVar) {
        View view = fragment.L;
        ViewGroup viewGroup = fragment.K;
        viewGroup.startViewTransition(view);
        c.h.h.a aVar = new c.h.h.a();
        aVar.c(new a(fragment));
        gVar.b(fragment, aVar);
        if (dVar.a != null) {
            RunnableC0014e runnableC0014e = new RunnableC0014e(dVar.a, viewGroup, view);
            fragment.q2(fragment.L);
            runnableC0014e.setAnimationListener(new b(viewGroup, fragment, gVar, aVar));
            fragment.L.startAnimation(runnableC0014e);
            return;
        }
        Animator animator = dVar.f1019b;
        fragment.r2(animator);
        animator.addListener(new c(viewGroup, view, fragment, gVar, aVar));
        animator.setTarget(fragment.L);
        animator.start();
    }

    static d b(Context context, f fVar, Fragment fragment, boolean z) {
        int iC;
        int iB0 = fragment.B0();
        int iA0 = fragment.A0();
        boolean z2 = false;
        fragment.w2(0);
        View viewB = fVar.b(fragment.B);
        if (viewB != null) {
            int i2 = c.l.b.f3252b;
            if (viewB.getTag(i2) != null) {
                viewB.setTag(i2, null);
            }
        }
        ViewGroup viewGroup = fragment.K;
        if (viewGroup != null && viewGroup.getLayoutTransition() != null) {
            return null;
        }
        Animation animationM1 = fragment.m1(iB0, z, iA0);
        if (animationM1 != null) {
            return new d(animationM1);
        }
        Animator animatorN1 = fragment.n1(iB0, z, iA0);
        if (animatorN1 != null) {
            return new d(animatorN1);
        }
        if (iA0 != 0) {
            boolean zEquals = "anim".equals(context.getResources().getResourceTypeName(iA0));
            if (zEquals) {
                try {
                    Animation animationLoadAnimation = AnimationUtils.loadAnimation(context, iA0);
                    if (animationLoadAnimation != null) {
                        return new d(animationLoadAnimation);
                    }
                    z2 = true;
                } catch (Resources.NotFoundException e2) {
                    throw e2;
                } catch (RuntimeException unused) {
                }
            }
            if (!z2) {
                try {
                    Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(context, iA0);
                    if (animatorLoadAnimator != null) {
                        return new d(animatorLoadAnimator);
                    }
                } catch (RuntimeException e3) {
                    if (zEquals) {
                        throw e3;
                    }
                    Animation animationLoadAnimation2 = AnimationUtils.loadAnimation(context, iA0);
                    if (animationLoadAnimation2 != null) {
                        return new d(animationLoadAnimation2);
                    }
                }
            }
        }
        if (iB0 != 0 && (iC = c(iB0, z)) >= 0) {
            return new d(AnimationUtils.loadAnimation(context, iC));
        }
        return null;
    }

    private static int c(int i2, boolean z) {
        if (i2 == 4097) {
            return z ? c.l.a.f3250e : c.l.a.f3251f;
        }
        if (i2 == 4099) {
            return z ? c.l.a.f3248c : c.l.a.f3249d;
        }
        if (i2 != 8194) {
            return -1;
        }
        return z ? c.l.a.a : c.l.a.f3247b;
    }

    /* compiled from: FragmentAnim.java */
    static class d {
        public final Animation a;

        /* renamed from: b, reason: collision with root package name */
        public final Animator f1019b;

        d(Animation animation) {
            this.a = animation;
            this.f1019b = null;
            if (animation == null) {
                throw new IllegalStateException("Animation cannot be null");
            }
        }

        d(Animator animator) {
            this.a = null;
            this.f1019b = animator;
            if (animator == null) {
                throw new IllegalStateException("Animator cannot be null");
            }
        }
    }

    /* compiled from: FragmentAnim.java */
    /* renamed from: androidx.fragment.app.e$e, reason: collision with other inner class name */
    private static class RunnableC0014e extends AnimationSet implements Runnable {

        /* renamed from: e, reason: collision with root package name */
        private final ViewGroup f1020e;

        /* renamed from: f, reason: collision with root package name */
        private final View f1021f;

        /* renamed from: g, reason: collision with root package name */
        private boolean f1022g;

        /* renamed from: h, reason: collision with root package name */
        private boolean f1023h;

        /* renamed from: i, reason: collision with root package name */
        private boolean f1024i;

        RunnableC0014e(Animation animation, ViewGroup viewGroup, View view) {
            super(false);
            this.f1024i = true;
            this.f1020e = viewGroup;
            this.f1021f = view;
            addAnimation(animation);
            viewGroup.post(this);
        }

        @Override // android.view.animation.AnimationSet, android.view.animation.Animation
        public boolean getTransformation(long j2, Transformation transformation) {
            this.f1024i = true;
            if (this.f1022g) {
                return !this.f1023h;
            }
            if (!super.getTransformation(j2, transformation)) {
                this.f1022g = true;
                c.h.l.q.a(this.f1020e, this);
            }
            return true;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f1022g || !this.f1024i) {
                this.f1020e.endViewTransition(this.f1021f);
                this.f1023h = true;
            } else {
                this.f1024i = false;
                this.f1020e.post(this);
            }
        }

        @Override // android.view.animation.Animation
        public boolean getTransformation(long j2, Transformation transformation, float f2) {
            this.f1024i = true;
            if (this.f1022g) {
                return !this.f1023h;
            }
            if (!super.getTransformation(j2, transformation, f2)) {
                this.f1022g = true;
                c.h.l.q.a(this.f1020e, this);
            }
            return true;
        }
    }
}