package com.parizene.netmonitor.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;

/* loaded from: classes3.dex */
public class DbmBar extends androidx.appcompat.widget.z {
    public DbmBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private void h(float f2, int i2) {
        Drawable drawable = ((LayerDrawable) getBackground()).getDrawable(0);
        drawable.setColorFilter(i2, PorterDuff.Mode.MULTIPLY);
        drawable.setLevel((int) (f2 * 10000.0f));
        drawableStateChanged();
    }

    public void g(int[] iArr, int i2, int[] iArr2, boolean z) {
        String string;
        float f2;
        if (i2 != Integer.MAX_VALUE) {
            string = Integer.toString(i2);
            int i3 = iArr[0];
            int i4 = iArr[1];
            if (i2 < i3) {
                i2 = i3;
            } else if (i2 > i4) {
                i2 = i4;
            }
            f2 = (i2 - i3) / (i4 - i3);
        } else {
            string = "-";
            f2 = 0.0f;
        }
        setText(string);
        h(f2, z ? i2 > iArr2[1] ? -16711936 : i2 > iArr2[0] ? -256 : -65536 : com.parizene.netmonitor.j0.e(f2));
    }
}