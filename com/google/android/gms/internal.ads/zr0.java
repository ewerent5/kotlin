package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.PopupWindow;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
@TargetApi(19)
/* loaded from: classes.dex */
public final class zr0 {
    private Context a;

    /* renamed from: b, reason: collision with root package name */
    private PopupWindow f10629b;

    public final void a(Context context, View view) {
        PopupWindow popupWindow;
        if (!com.google.android.gms.common.util.n.f() || com.google.android.gms.common.util.n.h()) {
            return;
        }
        Window window = context instanceof Activity ? ((Activity) context).getWindow() : null;
        if (window == null || window.getDecorView() == null || ((Activity) context).isDestroyed()) {
            popupWindow = null;
        } else {
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            frameLayout.addView(view, -1, -1);
            popupWindow = new PopupWindow((View) frameLayout, 1, 1, false);
            popupWindow.setOutsideTouchable(true);
            popupWindow.setClippingEnabled(false);
            er.zzd("Displaying the 1x1 popup off the screen.");
            try {
                popupWindow.showAtLocation(window.getDecorView(), 0, -1, -1);
            } catch (Exception unused) {
            }
        }
        this.f10629b = popupWindow;
        if (popupWindow == null) {
            context = null;
        }
        this.a = context;
    }

    public final void b() {
        Context context = this.a;
        if (context == null || this.f10629b == null) {
            return;
        }
        if ((!(context instanceof Activity) || !((Activity) context).isDestroyed()) && this.f10629b.isShowing()) {
            this.f10629b.dismiss();
        }
        this.a = null;
        this.f10629b = null;
    }
}