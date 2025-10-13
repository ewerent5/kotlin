package androidx.browser.browseractions;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import c.c.a;

/* loaded from: classes.dex */
public class BrowserActionsFallbackMenuView extends LinearLayout {

    /* renamed from: e, reason: collision with root package name */
    private final int f661e;

    /* renamed from: f, reason: collision with root package name */
    private final int f662f;

    public BrowserActionsFallbackMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f661e = getResources().getDimensionPixelOffset(a.f2642b);
        this.f662f = getResources().getDimensionPixelOffset(a.a);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i2, int i3) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(getResources().getDisplayMetrics().widthPixels - (this.f661e * 2), this.f662f), 1073741824), i3);
    }
}