package com.google.android.gms.internal.ads;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final /* synthetic */ class ln0 implements ViewTreeObserver.OnScrollChangedListener {

    /* renamed from: e */
    private final View f7268e;

    /* renamed from: f */
    private final ew f7269f;

    /* renamed from: g */
    private final String f7270g;

    /* renamed from: h */
    private final WindowManager.LayoutParams f7271h;

    /* renamed from: i */
    private final int f7272i;

    /* renamed from: j */
    private final WindowManager f7273j;

    ln0(View view, ew ewVar, String str, WindowManager.LayoutParams layoutParams, int i2, WindowManager windowManager) {
        this.f7268e = view;
        this.f7269f = ewVar;
        this.f7270g = str;
        this.f7271h = layoutParams;
        this.f7272i = i2;
        this.f7273j = windowManager;
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        View view = this.f7268e;
        ew ewVar = this.f7269f;
        String str = this.f7270g;
        WindowManager.LayoutParams layoutParams = this.f7271h;
        int i2 = this.f7272i;
        WindowManager windowManager = this.f7273j;
        Rect rect = new Rect();
        if (!view.getGlobalVisibleRect(rect) || ewVar.n().getWindowToken() == null) {
            return;
        }
        if ("1".equals(str) || "2".equals(str)) {
            layoutParams.y = rect.bottom - i2;
        } else {
            layoutParams.y = rect.top - i2;
        }
        windowManager.updateViewLayout(ewVar.n(), layoutParams);
    }
}