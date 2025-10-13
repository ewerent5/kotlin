package e.c.b.c.r;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.os.Build;
import android.util.Property;
import android.view.View;
import android.view.ViewAnimationUtils;
import e.c.b.c.r.d;

/* compiled from: CircularRevealCompat.java */
/* loaded from: classes.dex */
public final class a {

    /* compiled from: CircularRevealCompat.java */
    /* renamed from: e.c.b.c.r.a$a, reason: collision with other inner class name */
    static class C0183a extends AnimatorListenerAdapter {
        final /* synthetic */ d a;

        C0183a(d dVar) {
            this.a = dVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.a.b();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.a.a();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Animator a(d dVar, float f2, float f3, float f4) {
        ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(dVar, (Property<d, V>) d.c.a, (TypeEvaluator) d.b.a, (Object[]) new d.e[]{new d.e(f2, f3, f4)});
        if (Build.VERSION.SDK_INT < 21) {
            return objectAnimatorOfObject;
        }
        d.e revealInfo = dVar.getRevealInfo();
        if (revealInfo == null) {
            throw new IllegalStateException("Caller must set a non-null RevealInfo before calling this.");
        }
        Animator animatorCreateCircularReveal = ViewAnimationUtils.createCircularReveal((View) dVar, (int) f2, (int) f3, revealInfo.f15307c, f4);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(objectAnimatorOfObject, animatorCreateCircularReveal);
        return animatorSet;
    }

    public static Animator.AnimatorListener b(d dVar) {
        return new C0183a(dVar);
    }
}