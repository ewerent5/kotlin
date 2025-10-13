package com.google.android.material.transformation;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import c.h.l.t;
import com.google.android.material.transformation.FabTransformationBehavior;
import e.c.b.c.m.h;
import e.c.b.c.m.j;
import java.util.HashMap;
import java.util.Map;

@Deprecated
/* loaded from: classes.dex */
public class FabTransformationSheetBehavior extends FabTransformationBehavior {

    /* renamed from: i, reason: collision with root package name */
    private Map<View, Integer> f11925i;

    public FabTransformationSheetBehavior() {
    }

    private void g0(View view, boolean z) {
        ViewParent parent = view.getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (Build.VERSION.SDK_INT >= 16 && z) {
                this.f11925i = new HashMap(childCount);
            }
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = coordinatorLayout.getChildAt(i2);
                boolean z2 = (childAt.getLayoutParams() instanceof CoordinatorLayout.f) && (((CoordinatorLayout.f) childAt.getLayoutParams()).f() instanceof FabTransformationScrimBehavior);
                if (childAt != view && !z2) {
                    if (z) {
                        if (Build.VERSION.SDK_INT >= 16) {
                            this.f11925i.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        }
                        t.u0(childAt, 4);
                    } else {
                        Map<View, Integer> map = this.f11925i;
                        if (map != null && map.containsKey(childAt)) {
                            t.u0(childAt, this.f11925i.get(childAt).intValue());
                        }
                    }
                }
            }
            if (z) {
                return;
            }
            this.f11925i = null;
        }
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior, com.google.android.material.transformation.ExpandableBehavior
    protected boolean H(View view, View view2, boolean z, boolean z2) {
        g0(view2, z);
        return super.H(view, view2, z, z2);
    }

    @Override // com.google.android.material.transformation.FabTransformationBehavior
    protected FabTransformationBehavior.e e0(Context context, boolean z) {
        int i2 = z ? e.c.b.c.a.f15057d : e.c.b.c.a.f15056c;
        FabTransformationBehavior.e eVar = new FabTransformationBehavior.e();
        eVar.a = h.c(context, i2);
        eVar.f11920b = new j(17, 0.0f, 0.0f);
        return eVar;
    }

    public FabTransformationSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}