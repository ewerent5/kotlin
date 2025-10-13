package e.c.b.c.y;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.s;
import androidx.core.widget.c;
import com.google.android.material.internal.j;
import e.c.b.c.b;
import e.c.b.c.k;
import e.c.b.c.l;

/* compiled from: MaterialRadioButton.java */
/* loaded from: classes.dex */
public class a extends s {

    /* renamed from: h, reason: collision with root package name */
    private static final int f15315h = k.r;

    /* renamed from: i, reason: collision with root package name */
    private static final int[][] f15316i = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* renamed from: j, reason: collision with root package name */
    private ColorStateList f15317j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f15318k;

    public a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, b.w);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f15317j == null) {
            int iC = e.c.b.c.s.a.c(this, b.f15076g);
            int iC2 = e.c.b.c.s.a.c(this, b.f15078i);
            int iC3 = e.c.b.c.s.a.c(this, b.f15081l);
            int[][] iArr = f15316i;
            int[] iArr2 = new int[iArr.length];
            iArr2[0] = e.c.b.c.s.a.f(iC3, iC, 1.0f);
            iArr2[1] = e.c.b.c.s.a.f(iC3, iC2, 0.54f);
            iArr2[2] = e.c.b.c.s.a.f(iC3, iC2, 0.38f);
            iArr2[3] = e.c.b.c.s.a.f(iC3, iC2, 0.38f);
            this.f15317j = new ColorStateList(iArr, iArr2);
        }
        return this.f15317j;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f15318k && c.b(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.f15318k = z;
        if (z) {
            c.c(this, getMaterialThemeColorsTintList());
        } else {
            c.c(this, null);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public a(Context context, AttributeSet attributeSet, int i2) {
        int i3 = f15315h;
        super(com.google.android.material.theme.a.a.c(context, attributeSet, i2, i3), attributeSet, i2);
        Context context2 = getContext();
        TypedArray typedArrayH = j.h(context2, attributeSet, l.Q2, i2, i3, new int[0]);
        int i4 = l.R2;
        if (typedArrayH.hasValue(i4)) {
            c.c(this, e.c.b.c.z.c.a(context2, typedArrayH, i4));
        }
        this.f15318k = typedArrayH.getBoolean(l.S2, false);
        typedArrayH.recycle();
    }
}