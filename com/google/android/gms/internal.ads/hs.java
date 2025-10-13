package com.google.android.gms.internal.ads;

import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
abstract class hs {

    /* renamed from: e, reason: collision with root package name */
    private final WeakReference<View> f6372e;

    public hs(View view) {
        this.f6372e = new WeakReference<>(view);
    }

    protected abstract void a(ViewTreeObserver viewTreeObserver);

    protected abstract void b(ViewTreeObserver viewTreeObserver);

    public final void c() {
        ViewTreeObserver viewTreeObserverE = e();
        if (viewTreeObserverE != null) {
            a(viewTreeObserverE);
        }
    }

    public final void d() {
        ViewTreeObserver viewTreeObserverE = e();
        if (viewTreeObserverE != null) {
            b(viewTreeObserverE);
        }
    }

    protected final ViewTreeObserver e() {
        ViewTreeObserver viewTreeObserver;
        View view = this.f6372e.get();
        if (view == null || (viewTreeObserver = view.getViewTreeObserver()) == null || !viewTreeObserver.isAlive()) {
            return null;
        }
        return viewTreeObserver;
    }
}