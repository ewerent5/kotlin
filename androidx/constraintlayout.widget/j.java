package androidx.constraintlayout.widget;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import c.f.b.k.k;

/* compiled from: VirtualLayout.java */
/* loaded from: classes.dex */
public abstract class j extends b {
    private boolean n;
    private boolean o;

    @Override // androidx.constraintlayout.widget.b
    protected void h(AttributeSet attributeSet) throws IllegalAccessException, Resources.NotFoundException, IllegalArgumentException {
        super.h(attributeSet);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, i.a1);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i2);
                if (index == i.c1) {
                    this.n = true;
                } else if (index == i.h1) {
                    this.o = true;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public void o(k kVar, int i2, int i3) {
    }

    @Override // androidx.constraintlayout.widget.b, android.view.View
    public void onAttachedToWindow() throws IllegalAccessException, Resources.NotFoundException, IllegalArgumentException {
        ViewParent parent;
        super.onAttachedToWindow();
        if ((this.n || this.o) && (parent = getParent()) != null && (parent instanceof ConstraintLayout)) {
            ConstraintLayout constraintLayout = (ConstraintLayout) parent;
            int visibility = getVisibility();
            float elevation = Build.VERSION.SDK_INT >= 21 ? getElevation() : 0.0f;
            for (int i2 = 0; i2 < this.f706f; i2++) {
                View viewI = constraintLayout.i(this.f705e[i2]);
                if (viewI != null) {
                    if (this.n) {
                        viewI.setVisibility(visibility);
                    }
                    if (this.o && elevation > 0.0f && Build.VERSION.SDK_INT >= 21) {
                        viewI.setTranslationZ(viewI.getTranslationZ() + elevation);
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f2) {
        super.setElevation(f2);
        d();
    }

    @Override // android.view.View
    public void setVisibility(int i2) {
        super.setVisibility(i2);
        d();
    }
}