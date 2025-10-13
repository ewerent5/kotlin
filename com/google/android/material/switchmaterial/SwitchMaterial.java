package com.google.android.material.switchmaterial;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.SwitchCompat;
import com.google.android.material.internal.j;
import e.c.b.c.b;
import e.c.b.c.d;
import e.c.b.c.k;
import e.c.b.c.l;
import e.c.b.c.v.a;

/* loaded from: classes.dex */
public class SwitchMaterial extends SwitchCompat {
    private static final int T = k.s;
    private static final int[][] U = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};
    private final a V;
    private ColorStateList W;
    private ColorStateList a0;
    private boolean b0;

    public SwitchMaterial(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, b.F);
    }

    private ColorStateList getMaterialThemeColorsThumbTintList() throws Resources.NotFoundException {
        if (this.W == null) {
            int iC = e.c.b.c.s.a.c(this, b.f15081l);
            int iC2 = e.c.b.c.s.a.c(this, b.f15076g);
            float dimension = getResources().getDimension(d.U);
            if (this.V.d()) {
                dimension += com.google.android.material.internal.k.c(this);
            }
            int iC3 = this.V.c(iC, dimension);
            int[][] iArr = U;
            int[] iArr2 = new int[iArr.length];
            iArr2[0] = e.c.b.c.s.a.f(iC, iC2, 1.0f);
            iArr2[1] = iC3;
            iArr2[2] = e.c.b.c.s.a.f(iC, iC2, 0.38f);
            iArr2[3] = iC3;
            this.W = new ColorStateList(iArr, iArr2);
        }
        return this.W;
    }

    private ColorStateList getMaterialThemeColorsTrackTintList() {
        if (this.a0 == null) {
            int[][] iArr = U;
            int[] iArr2 = new int[iArr.length];
            int iC = e.c.b.c.s.a.c(this, b.f15081l);
            int iC2 = e.c.b.c.s.a.c(this, b.f15076g);
            int iC3 = e.c.b.c.s.a.c(this, b.f15078i);
            iArr2[0] = e.c.b.c.s.a.f(iC, iC2, 0.54f);
            iArr2[1] = e.c.b.c.s.a.f(iC, iC3, 0.32f);
            iArr2[2] = e.c.b.c.s.a.f(iC, iC2, 0.12f);
            iArr2[3] = e.c.b.c.s.a.f(iC, iC3, 0.12f);
            this.a0 = new ColorStateList(iArr, iArr2);
        }
        return this.a0;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.b0 && getThumbTintList() == null) {
            setThumbTintList(getMaterialThemeColorsThumbTintList());
        }
        if (this.b0 && getTrackTintList() == null) {
            setTrackTintList(getMaterialThemeColorsTrackTintList());
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.b0 = z;
        if (z) {
            setThumbTintList(getMaterialThemeColorsThumbTintList());
            setTrackTintList(getMaterialThemeColorsTrackTintList());
        } else {
            setThumbTintList(null);
            setTrackTintList(null);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public SwitchMaterial(Context context, AttributeSet attributeSet, int i2) {
        int i3 = T;
        super(com.google.android.material.theme.a.a.c(context, attributeSet, i2, i3), attributeSet, i2);
        Context context2 = getContext();
        this.V = new a(context2);
        TypedArray typedArrayH = j.h(context2, attributeSet, l.i4, i2, i3, new int[0]);
        this.b0 = typedArrayH.getBoolean(l.j4, false);
        typedArrayH.recycle();
    }
}