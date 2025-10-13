package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;

/* loaded from: classes.dex */
public class Barrier extends b {
    private int n;
    private int o;
    private c.f.b.k.a p;

    public Barrier(Context context) {
        super(context);
        super.setVisibility(8);
    }

    private void p(c.f.b.k.e eVar, int i2, boolean z) {
        this.o = i2;
        if (Build.VERSION.SDK_INT < 17) {
            int i3 = this.n;
            if (i3 == 5) {
                this.o = 0;
            } else if (i3 == 6) {
                this.o = 1;
            }
        } else if (z) {
            int i4 = this.n;
            if (i4 == 5) {
                this.o = 1;
            } else if (i4 == 6) {
                this.o = 0;
            }
        } else {
            int i5 = this.n;
            if (i5 == 5) {
                this.o = 0;
            } else if (i5 == 6) {
                this.o = 1;
            }
        }
        if (eVar instanceof c.f.b.k.a) {
            ((c.f.b.k.a) eVar).j1(this.o);
        }
    }

    public int getMargin() {
        return this.p.f1();
    }

    public int getType() {
        return this.n;
    }

    @Override // androidx.constraintlayout.widget.b
    protected void h(AttributeSet attributeSet) throws IllegalAccessException, Resources.NotFoundException, IllegalArgumentException {
        super.h(attributeSet);
        this.p = new c.f.b.k.a();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, i.a1);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i2);
                if (index == i.j1) {
                    setType(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == i.i1) {
                    this.p.i1(typedArrayObtainStyledAttributes.getBoolean(index, true));
                } else if (index == i.k1) {
                    this.p.k1(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.f708h = this.p;
        n();
    }

    @Override // androidx.constraintlayout.widget.b
    public void i(c.f.b.k.e eVar, boolean z) {
        p(eVar, this.n, z);
    }

    public boolean o() {
        return this.p.d1();
    }

    public void setAllowsGoneWidget(boolean z) {
        this.p.i1(z);
    }

    public void setDpMargin(int i2) {
        this.p.k1((int) ((i2 * getResources().getDisplayMetrics().density) + 0.5f));
    }

    public void setMargin(int i2) {
        this.p.k1(i2);
    }

    public void setType(int i2) {
        this.n = i2;
    }

    public Barrier(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }
}