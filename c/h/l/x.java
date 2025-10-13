package c.h.l;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.os.Build;
import android.view.View;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;

/* compiled from: ViewPropertyAnimatorCompat.java */
/* loaded from: classes.dex */
public final class x {
    private WeakReference<View> a;

    /* renamed from: b, reason: collision with root package name */
    Runnable f3172b = null;

    /* renamed from: c, reason: collision with root package name */
    Runnable f3173c = null;

    /* renamed from: d, reason: collision with root package name */
    int f3174d = -1;

    /* compiled from: ViewPropertyAnimatorCompat.java */
    class a extends AnimatorListenerAdapter {
        final /* synthetic */ y a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f3175b;

        a(y yVar, View view) {
            this.a = yVar;
            this.f3175b = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.a.a(this.f3175b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.a.b(this.f3175b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.a.c(this.f3175b);
        }
    }

    /* compiled from: ViewPropertyAnimatorCompat.java */
    class b implements ValueAnimator.AnimatorUpdateListener {
        final /* synthetic */ a0 a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f3177b;

        b(a0 a0Var, View view) {
            this.a = a0Var;
            this.f3177b = view;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.a.a(this.f3177b);
        }
    }

    /* compiled from: ViewPropertyAnimatorCompat.java */
    static class c implements y {
        x a;

        /* renamed from: b, reason: collision with root package name */
        boolean f3179b;

        c(x xVar) {
            this.a = xVar;
        }

        @Override // c.h.l.y
        public void a(View view) {
            Object tag = view.getTag(2113929216);
            y yVar = tag instanceof y ? (y) tag : null;
            if (yVar != null) {
                yVar.a(view);
            }
        }

        @Override // c.h.l.y
        @SuppressLint({"WrongConstant"})
        public void b(View view) {
            int i2 = this.a.f3174d;
            if (i2 > -1) {
                view.setLayerType(i2, null);
                this.a.f3174d = -1;
            }
            if (Build.VERSION.SDK_INT >= 16 || !this.f3179b) {
                x xVar = this.a;
                Runnable runnable = xVar.f3173c;
                if (runnable != null) {
                    xVar.f3173c = null;
                    runnable.run();
                }
                Object tag = view.getTag(2113929216);
                y yVar = tag instanceof y ? (y) tag : null;
                if (yVar != null) {
                    yVar.b(view);
                }
                this.f3179b = true;
            }
        }

        @Override // c.h.l.y
        public void c(View view) {
            this.f3179b = false;
            if (this.a.f3174d > -1) {
                view.setLayerType(2, null);
            }
            x xVar = this.a;
            Runnable runnable = xVar.f3172b;
            if (runnable != null) {
                xVar.f3172b = null;
                runnable.run();
            }
            Object tag = view.getTag(2113929216);
            y yVar = tag instanceof y ? (y) tag : null;
            if (yVar != null) {
                yVar.c(view);
            }
        }
    }

    x(View view) {
        this.a = new WeakReference<>(view);
    }

    private void g(View view, y yVar) {
        if (yVar != null) {
            view.animate().setListener(new a(yVar, view));
        } else {
            view.animate().setListener(null);
        }
    }

    public x a(float f2) {
        View view = this.a.get();
        if (view != null) {
            view.animate().alpha(f2);
        }
        return this;
    }

    public void b() {
        View view = this.a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public long c() {
        View view = this.a.get();
        if (view != null) {
            return view.animate().getDuration();
        }
        return 0L;
    }

    public x d(long j2) {
        View view = this.a.get();
        if (view != null) {
            view.animate().setDuration(j2);
        }
        return this;
    }

    public x e(Interpolator interpolator) {
        View view = this.a.get();
        if (view != null) {
            view.animate().setInterpolator(interpolator);
        }
        return this;
    }

    public x f(y yVar) {
        View view = this.a.get();
        if (view != null) {
            if (Build.VERSION.SDK_INT >= 16) {
                g(view, yVar);
            } else {
                view.setTag(2113929216, yVar);
                g(view, new c(this));
            }
        }
        return this;
    }

    public x h(long j2) {
        View view = this.a.get();
        if (view != null) {
            view.animate().setStartDelay(j2);
        }
        return this;
    }

    public x i(a0 a0Var) {
        View view = this.a.get();
        if (view != null && Build.VERSION.SDK_INT >= 19) {
            view.animate().setUpdateListener(a0Var != null ? new b(a0Var, view) : null);
        }
        return this;
    }

    public void j() {
        View view = this.a.get();
        if (view != null) {
            view.animate().start();
        }
    }

    public x k(float f2) {
        View view = this.a.get();
        if (view != null) {
            view.animate().translationY(f2);
        }
        return this;
    }
}