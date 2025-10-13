package com.google.android.material.textview;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.z;
import com.google.android.material.theme.a.a;
import e.c.b.c.l;
import e.c.b.c.z.b;
import e.c.b.c.z.c;

/* loaded from: classes.dex */
public class MaterialTextView extends z {
    public MaterialTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    private void g(Resources.Theme theme, int i2) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(i2, l.W2);
        int iJ = j(getContext(), typedArrayObtainStyledAttributes, l.Y2, l.Z2);
        typedArrayObtainStyledAttributes.recycle();
        if (iJ >= 0) {
            setLineHeight(iJ);
        }
    }

    private static boolean h(Context context) {
        return b.b(context, e.c.b.c.b.H, true);
    }

    private static int i(Resources.Theme theme, AttributeSet attributeSet, int i2, int i3) {
        TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, l.a3, i2, i3);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(l.b3, -1);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }

    private static int j(Context context, TypedArray typedArray, int... iArr) {
        int iC = -1;
        for (int i2 = 0; i2 < iArr.length && iC < 0; i2++) {
            iC = c.c(context, typedArray, iArr[i2], -1);
        }
        return iC;
    }

    private static boolean k(Context context, Resources.Theme theme, AttributeSet attributeSet, int i2, int i3) {
        TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, l.a3, i2, i3);
        int iJ = j(context, typedArrayObtainStyledAttributes, l.c3, l.d3);
        typedArrayObtainStyledAttributes.recycle();
        return iJ != -1;
    }

    @Override // androidx.appcompat.widget.z, android.widget.TextView
    public void setTextAppearance(Context context, int i2) throws Resources.NotFoundException {
        super.setTextAppearance(context, i2);
        if (h(context)) {
            g(context.getTheme(), i2);
        }
    }

    public MaterialTextView(Context context, AttributeSet attributeSet, int i2) {
        this(context, attributeSet, i2, 0);
    }

    public MaterialTextView(Context context, AttributeSet attributeSet, int i2, int i3) throws Resources.NotFoundException {
        int i4;
        super(a.c(context, attributeSet, i2, i3), attributeSet, i2);
        Context context2 = getContext();
        if (h(context2)) {
            Resources.Theme theme = context2.getTheme();
            if (k(context2, theme, attributeSet, i2, i3) || (i4 = i(theme, attributeSet, i2, i3)) == -1) {
                return;
            }
            g(theme, i4);
        }
    }
}