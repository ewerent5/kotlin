package e.c.b.c.q;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.g;
import androidx.core.widget.c;
import com.google.android.material.internal.j;
import e.c.b.c.b;
import e.c.b.c.k;
import e.c.b.c.l;

/* compiled from: MaterialCheckBox.java */
/* loaded from: classes.dex */
public class a extends g {

    /* renamed from: h, reason: collision with root package name */
    private static final int f15300h = k.q;

    /* renamed from: i, reason: collision with root package name */
    private static final int[][] f15301i = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* renamed from: j, reason: collision with root package name */
    private ColorStateList f15302j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f15303k;

    public a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, b.f15073d);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f15302j == null) {
            int[][] iArr = f15301i;
            int[] iArr2 = new int[iArr.length];
            int iC = e.c.b.c.s.a.c(this, b.f15076g);
            int iC2 = e.c.b.c.s.a.c(this, b.f15081l);
            int iC3 = e.c.b.c.s.a.c(this, b.f15078i);
            iArr2[0] = e.c.b.c.s.a.f(iC2, iC, 1.0f);
            iArr2[1] = e.c.b.c.s.a.f(iC2, iC3, 0.54f);
            iArr2[2] = e.c.b.c.s.a.f(iC2, iC3, 0.38f);
            iArr2[3] = e.c.b.c.s.a.f(iC2, iC3, 0.38f);
            this.f15302j = new ColorStateList(iArr, iArr2);
        }
        return this.f15302j;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f15303k && c.b(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.f15303k = z;
        if (z) {
            c.c(this, getMaterialThemeColorsTintList());
        } else {
            c.c(this, null);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public a(Context context, AttributeSet attributeSet, int i2) {
        int i3 = f15300h;
        super(com.google.android.material.theme.a.a.c(context, attributeSet, i2, i3), attributeSet, i2);
        Context context2 = getContext();
        TypedArray typedArrayH = j.h(context2, attributeSet, l.N2, i2, i3, new int[0]);
        int i4 = l.O2;
        if (typedArrayH.hasValue(i4)) {
            c.c(this, e.c.b.c.z.c.a(context2, typedArrayH, i4));
        }
        this.f15303k = typedArrayH.getBoolean(l.P2, false);
        typedArrayH.recycle();
    }
}