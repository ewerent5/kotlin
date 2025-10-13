package c.h.l;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.Objects;

/* compiled from: OneShotPreDrawListener.java */
/* loaded from: classes.dex */
public final class q implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: e, reason: collision with root package name */
    private final View f3152e;

    /* renamed from: f, reason: collision with root package name */
    private ViewTreeObserver f3153f;

    /* renamed from: g, reason: collision with root package name */
    private final Runnable f3154g;

    private q(View view, Runnable runnable) {
        this.f3152e = view;
        this.f3153f = view.getViewTreeObserver();
        this.f3154g = runnable;
    }

    public static q a(View view, Runnable runnable) {
        Objects.requireNonNull(view, "view == null");
        Objects.requireNonNull(runnable, "runnable == null");
        q qVar = new q(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(qVar);
        view.addOnAttachStateChangeListener(qVar);
        return qVar;
    }

    public void b() {
        if (this.f3153f.isAlive()) {
            this.f3153f.removeOnPreDrawListener(this);
        } else {
            this.f3152e.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        this.f3152e.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        b();
        this.f3154g.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        this.f3153f = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        b();
    }
}