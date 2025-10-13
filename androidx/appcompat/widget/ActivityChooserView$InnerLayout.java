package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;

/* loaded from: classes.dex */
public class ActivityChooserView$InnerLayout extends LinearLayout {

    /* renamed from: e, reason: collision with root package name */
    private static final int[] f331e = {R.attr.background};

    public ActivityChooserView$InnerLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        w0 w0VarU = w0.u(context, attributeSet, f331e);
        setBackgroundDrawable(w0VarU.g(0));
        w0VarU.w();
    }
}