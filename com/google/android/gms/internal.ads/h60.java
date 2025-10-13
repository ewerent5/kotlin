package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.gms.ads.internal.zzs;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class h60 extends FrameLayout implements ViewTreeObserver.OnScrollChangedListener, ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: e */
    private final Context f6298e;

    /* renamed from: f */
    private View f6299f;

    private h60(Context context) {
        super(context);
        this.f6298e = context;
    }

    public static h60 a(Context context, View view, xo1 xo1Var) {
        Resources resources;
        DisplayMetrics displayMetrics;
        h60 h60Var = new h60(context);
        if (!xo1Var.t.isEmpty() && (resources = h60Var.f6298e.getResources()) != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
            float f2 = xo1Var.t.get(0).a;
            float f3 = displayMetrics.density;
            h60Var.setLayoutParams(new FrameLayout.LayoutParams((int) (f2 * f3), (int) (r1.f10458b * f3)));
        }
        h60Var.f6299f = view;
        h60Var.addView(view);
        zzs.zzz();
        es.b(h60Var, h60Var);
        zzs.zzz();
        es.a(h60Var, h60Var);
        JSONObject jSONObject = xo1Var.c0;
        RelativeLayout relativeLayout = new RelativeLayout(h60Var.f6298e);
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("header");
        if (jSONObjectOptJSONObject != null) {
            h60Var.b(jSONObjectOptJSONObject, relativeLayout, 10);
        }
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("footer");
        if (jSONObjectOptJSONObject2 != null) {
            h60Var.b(jSONObjectOptJSONObject2, relativeLayout, 12);
        }
        h60Var.addView(relativeLayout);
        return h60Var;
    }

    private final void b(JSONObject jSONObject, RelativeLayout relativeLayout, int i2) {
        TextView textView = new TextView(this.f6298e);
        textView.setTextColor(-1);
        textView.setBackgroundColor(-16777216);
        textView.setGravity(17);
        textView.setText(jSONObject.optString("text", ""));
        textView.setTextSize((float) jSONObject.optDouble("text_size", 11.0d));
        int iC = c(jSONObject.optDouble("padding", 0.0d));
        textView.setPadding(0, iC, 0, iC);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, c(jSONObject.optDouble("height", 15.0d)));
        layoutParams.addRule(i2);
        relativeLayout.addView(textView, layoutParams);
    }

    private final int c(double d2) {
        ta3.a();
        return xq.s(this.f6298e, (int) d2);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        getLocationInWindow(new int[2]);
        this.f6299f.setY(-r0[1]);
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        getLocationInWindow(new int[2]);
        this.f6299f.setY(-r0[1]);
    }
}