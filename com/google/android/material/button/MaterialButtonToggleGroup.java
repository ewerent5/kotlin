package com.google.android.material.button;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import c.h.l.c0.c;
import c.h.l.g;
import c.h.l.t;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.internal.j;
import e.c.b.c.c0.k;
import e.c.b.c.k;
import e.c.b.c.l;
import j$.util.Comparator;
import j$.util.function.Function;
import j$.util.function.ToDoubleFunction;
import j$.util.function.ToIntFunction;
import j$.util.function.ToLongFunction;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeMap;

/* loaded from: classes.dex */
public class MaterialButtonToggleGroup extends LinearLayout {

    /* renamed from: e, reason: collision with root package name */
    private static final String f11505e = MaterialButtonToggleGroup.class.getSimpleName();

    /* renamed from: f, reason: collision with root package name */
    private static final int f11506f = k.u;

    /* renamed from: g, reason: collision with root package name */
    private final List<d> f11507g;

    /* renamed from: h, reason: collision with root package name */
    private final c f11508h;

    /* renamed from: i, reason: collision with root package name */
    private final f f11509i;

    /* renamed from: j, reason: collision with root package name */
    private final LinkedHashSet<e> f11510j;

    /* renamed from: k, reason: collision with root package name */
    private final Comparator<MaterialButton> f11511k;

    /* renamed from: l, reason: collision with root package name */
    private Integer[] f11512l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f11513m;
    private boolean n;
    private boolean o;
    private int p;

    class a implements Comparator<MaterialButton>, j$.util.Comparator {
        a() {
        }

        @Override // java.util.Comparator, j$.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(MaterialButton materialButton, MaterialButton materialButton2) {
            int iCompareTo = Boolean.valueOf(materialButton.isChecked()).compareTo(Boolean.valueOf(materialButton2.isChecked()));
            if (iCompareTo != 0) {
                return iCompareTo;
            }
            int iCompareTo2 = Boolean.valueOf(materialButton.isPressed()).compareTo(Boolean.valueOf(materialButton2.isPressed()));
            return iCompareTo2 != 0 ? iCompareTo2 : Integer.valueOf(MaterialButtonToggleGroup.this.indexOfChild(materialButton)).compareTo(Integer.valueOf(MaterialButtonToggleGroup.this.indexOfChild(materialButton2)));
        }

        @Override // java.util.Comparator, j$.util.Comparator
        public /* synthetic */ Comparator reversed() {
            return Collections.reverseOrder(this);
        }

        @Override // j$.util.Comparator
        public /* synthetic */ Comparator thenComparing(Function function) {
            return Comparator.CC.$default$thenComparing(this, function);
        }

        @Override // j$.util.Comparator
        public /* synthetic */ java.util.Comparator thenComparing(Function function, java.util.Comparator comparator) {
            return Comparator.CC.$default$thenComparing(this, function, comparator);
        }

        @Override // java.util.Comparator, j$.util.Comparator
        public /* synthetic */ java.util.Comparator thenComparing(java.util.Comparator comparator) {
            return Comparator.CC.$default$thenComparing(this, comparator);
        }

        @Override // j$.util.Comparator
        public /* synthetic */ java.util.Comparator thenComparingDouble(ToDoubleFunction toDoubleFunction) {
            return Comparator.CC.$default$thenComparingDouble(this, toDoubleFunction);
        }

        @Override // j$.util.Comparator
        public /* synthetic */ java.util.Comparator thenComparingInt(ToIntFunction toIntFunction) {
            return Comparator.CC.$default$thenComparingInt(this, toIntFunction);
        }

        @Override // j$.util.Comparator
        public /* synthetic */ java.util.Comparator thenComparingLong(ToLongFunction toLongFunction) {
            return Comparator.CC.$default$thenComparingLong(this, toLongFunction);
        }
    }

    class b extends c.h.l.a {
        b() {
        }

        @Override // c.h.l.a
        public void g(View view, c.h.l.c0.c cVar) {
            super.g(view, cVar);
            cVar.b0(c.C0058c.f(0, 1, MaterialButtonToggleGroup.this.n(view), 1, false, ((MaterialButton) view).isChecked()));
        }
    }

    private class c implements MaterialButton.a {
        private c() {
        }

        @Override // com.google.android.material.button.MaterialButton.a
        public void a(MaterialButton materialButton, boolean z) {
            if (MaterialButtonToggleGroup.this.f11513m) {
                return;
            }
            if (MaterialButtonToggleGroup.this.n) {
                MaterialButtonToggleGroup.this.p = z ? materialButton.getId() : -1;
            }
            if (MaterialButtonToggleGroup.this.u(materialButton.getId(), z)) {
                MaterialButtonToggleGroup.this.l(materialButton.getId(), materialButton.isChecked());
            }
            MaterialButtonToggleGroup.this.invalidate();
        }

        /* synthetic */ c(MaterialButtonToggleGroup materialButtonToggleGroup, a aVar) {
            this();
        }
    }

    private static class d {
        private static final e.c.b.c.c0.c a = new e.c.b.c.c0.a(0.0f);

        /* renamed from: b, reason: collision with root package name */
        e.c.b.c.c0.c f11516b;

        /* renamed from: c, reason: collision with root package name */
        e.c.b.c.c0.c f11517c;

        /* renamed from: d, reason: collision with root package name */
        e.c.b.c.c0.c f11518d;

        /* renamed from: e, reason: collision with root package name */
        e.c.b.c.c0.c f11519e;

        d(e.c.b.c.c0.c cVar, e.c.b.c.c0.c cVar2, e.c.b.c.c0.c cVar3, e.c.b.c.c0.c cVar4) {
            this.f11516b = cVar;
            this.f11517c = cVar3;
            this.f11518d = cVar4;
            this.f11519e = cVar2;
        }

        public static d a(d dVar) {
            e.c.b.c.c0.c cVar = a;
            return new d(cVar, dVar.f11519e, cVar, dVar.f11518d);
        }

        public static d b(d dVar, View view) {
            return com.google.android.material.internal.k.d(view) ? c(dVar) : d(dVar);
        }

        public static d c(d dVar) {
            e.c.b.c.c0.c cVar = dVar.f11516b;
            e.c.b.c.c0.c cVar2 = dVar.f11519e;
            e.c.b.c.c0.c cVar3 = a;
            return new d(cVar, cVar2, cVar3, cVar3);
        }

        public static d d(d dVar) {
            e.c.b.c.c0.c cVar = a;
            return new d(cVar, cVar, dVar.f11517c, dVar.f11518d);
        }

        public static d e(d dVar, View view) {
            return com.google.android.material.internal.k.d(view) ? d(dVar) : c(dVar);
        }

        public static d f(d dVar) {
            e.c.b.c.c0.c cVar = dVar.f11516b;
            e.c.b.c.c0.c cVar2 = a;
            return new d(cVar, cVar2, dVar.f11517c, cVar2);
        }
    }

    public interface e {
        void a(MaterialButtonToggleGroup materialButtonToggleGroup, int i2, boolean z);
    }

    private class f implements MaterialButton.b {
        private f() {
        }

        @Override // com.google.android.material.button.MaterialButton.b
        public void a(MaterialButton materialButton, boolean z) {
            MaterialButtonToggleGroup.this.invalidate();
        }

        /* synthetic */ f(MaterialButtonToggleGroup materialButtonToggleGroup, a aVar) {
            this();
        }
    }

    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, e.c.b.c.b.r);
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            if (p(i2)) {
                return i2;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (p(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    private int getVisibleButtonCount() {
        int i2 = 0;
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            if ((getChildAt(i3) instanceof MaterialButton) && p(i3)) {
                i2++;
            }
        }
        return i2;
    }

    private void h() {
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex == -1) {
            return;
        }
        for (int i2 = firstVisibleChildIndex + 1; i2 < getChildCount(); i2++) {
            MaterialButton materialButtonM = m(i2);
            int iMin = Math.min(materialButtonM.getStrokeWidth(), m(i2 - 1).getStrokeWidth());
            LinearLayout.LayoutParams layoutParamsI = i(materialButtonM);
            if (getOrientation() == 0) {
                g.c(layoutParamsI, 0);
                g.d(layoutParamsI, -iMin);
                layoutParamsI.topMargin = 0;
            } else {
                layoutParamsI.bottomMargin = 0;
                layoutParamsI.topMargin = -iMin;
                g.d(layoutParamsI, 0);
            }
            materialButtonM.setLayoutParams(layoutParamsI);
        }
        r(firstVisibleChildIndex);
    }

    private LinearLayout.LayoutParams i(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        return layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : new LinearLayout.LayoutParams(layoutParams.width, layoutParams.height);
    }

    private void j(int i2) {
        s(i2, true);
        u(i2, true);
        setCheckedId(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l(int i2, boolean z) {
        Iterator<e> it = this.f11510j.iterator();
        while (it.hasNext()) {
            it.next().a(this, i2, z);
        }
    }

    private MaterialButton m(int i2) {
        return (MaterialButton) getChildAt(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int n(View view) {
        if (!(view instanceof MaterialButton)) {
            return -1;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            if (getChildAt(i3) == view) {
                return i2;
            }
            if ((getChildAt(i3) instanceof MaterialButton) && p(i3)) {
                i2++;
            }
        }
        return -1;
    }

    private d o(int i2, int i3, int i4) {
        d dVar = this.f11507g.get(i2);
        if (i3 == i4) {
            return dVar;
        }
        boolean z = getOrientation() == 0;
        if (i2 == i3) {
            return z ? d.e(dVar, this) : d.f(dVar);
        }
        if (i2 == i4) {
            return z ? d.b(dVar, this) : d.a(dVar);
        }
        return null;
    }

    private boolean p(int i2) {
        return getChildAt(i2).getVisibility() != 8;
    }

    private void r(int i2) {
        if (getChildCount() == 0 || i2 == -1) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) m(i2).getLayoutParams();
        if (getOrientation() == 1) {
            layoutParams.topMargin = 0;
            layoutParams.bottomMargin = 0;
        } else {
            g.c(layoutParams, 0);
            g.d(layoutParams, 0);
            layoutParams.leftMargin = 0;
            layoutParams.rightMargin = 0;
        }
    }

    private void s(int i2, boolean z) {
        View viewFindViewById = findViewById(i2);
        if (viewFindViewById instanceof MaterialButton) {
            this.f11513m = true;
            ((MaterialButton) viewFindViewById).setChecked(z);
            this.f11513m = false;
        }
    }

    private void setCheckedId(int i2) {
        this.p = i2;
        l(i2, true);
    }

    private void setGeneratedIdIfNeeded(MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            materialButton.setId(t.k());
        }
    }

    private void setupButtonChild(MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.a(this.f11508h);
        materialButton.setOnPressedChangeListenerInternal(this.f11509i);
        materialButton.setShouldDrawSurfaceColorStroke(true);
    }

    private static void t(k.b bVar, d dVar) {
        if (dVar == null) {
            bVar.o(0.0f);
        } else {
            bVar.B(dVar.f11516b).t(dVar.f11519e).F(dVar.f11517c).x(dVar.f11518d);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean u(int i2, boolean z) {
        List<Integer> checkedButtonIds = getCheckedButtonIds();
        if (this.o && checkedButtonIds.isEmpty()) {
            s(i2, true);
            this.p = i2;
            return false;
        }
        if (z && this.n) {
            checkedButtonIds.remove(Integer.valueOf(i2));
            Iterator<Integer> it = checkedButtonIds.iterator();
            while (it.hasNext()) {
                int iIntValue = it.next().intValue();
                s(iIntValue, false);
                l(iIntValue, false);
            }
        }
        return true;
    }

    private void v() {
        TreeMap treeMap = new TreeMap(this.f11511k);
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            treeMap.put(m(i2), Integer.valueOf(i2));
        }
        this.f11512l = (Integer[]) treeMap.values().toArray(new Integer[0]);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e(f11505e, "Child views must be of type MaterialButton.");
            return;
        }
        super.addView(view, i2, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        setGeneratedIdIfNeeded(materialButton);
        setupButtonChild(materialButton);
        if (materialButton.isChecked()) {
            u(materialButton.getId(), true);
            setCheckedId(materialButton.getId());
        }
        e.c.b.c.c0.k shapeAppearanceModel = materialButton.getShapeAppearanceModel();
        this.f11507g.add(new d(shapeAppearanceModel.r(), shapeAppearanceModel.j(), shapeAppearanceModel.t(), shapeAppearanceModel.l()));
        t.k0(materialButton, new b());
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        v();
        super.dispatchDraw(canvas);
    }

    public void g(e eVar) {
        this.f11510j.add(eVar);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return MaterialButtonToggleGroup.class.getName();
    }

    public int getCheckedButtonId() {
        if (this.n) {
            return this.p;
        }
        return -1;
    }

    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            MaterialButton materialButtonM = m(i2);
            if (materialButtonM.isChecked()) {
                arrayList.add(Integer.valueOf(materialButtonM.getId()));
            }
        }
        return arrayList;
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i2, int i3) {
        Integer[] numArr = this.f11512l;
        if (numArr != null && i3 < numArr.length) {
            return numArr[i3].intValue();
        }
        Log.w(f11505e, "Child order wasn't updated");
        return i3;
    }

    public void k() {
        this.f11513m = true;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            MaterialButton materialButtonM = m(i2);
            materialButtonM.setChecked(false);
            l(materialButtonM.getId(), false);
        }
        this.f11513m = false;
        setCheckedId(-1);
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        int i2 = this.p;
        if (i2 != -1) {
            j(i2);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        c.h.l.c0.c.y0(accessibilityNodeInfo).a0(c.b.a(1, getVisibleButtonCount(), false, q() ? 1 : 2));
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i2, int i3) {
        w();
        h();
        super.onMeasure(i2, i3);
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            MaterialButton materialButton = (MaterialButton) view;
            materialButton.h(this.f11508h);
            materialButton.setOnPressedChangeListenerInternal(null);
        }
        int iIndexOfChild = indexOfChild(view);
        if (iIndexOfChild >= 0) {
            this.f11507g.remove(iIndexOfChild);
        }
        w();
        h();
    }

    public boolean q() {
        return this.n;
    }

    public void setSelectionRequired(boolean z) {
        this.o = z;
    }

    public void setSingleSelection(boolean z) {
        if (this.n != z) {
            this.n = z;
            k();
        }
    }

    void w() {
        int childCount = getChildCount();
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        for (int i2 = 0; i2 < childCount; i2++) {
            MaterialButton materialButtonM = m(i2);
            if (materialButtonM.getVisibility() != 8) {
                k.b bVarV = materialButtonM.getShapeAppearanceModel().v();
                t(bVarV, o(i2, firstVisibleChildIndex, lastVisibleChildIndex));
                materialButtonM.setShapeAppearanceModel(bVarV.m());
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet, int i2) {
        int i3 = f11506f;
        super(com.google.android.material.theme.a.a.c(context, attributeSet, i2, i3), attributeSet, i2);
        this.f11507g = new ArrayList();
        a aVar = null;
        this.f11508h = new c(this, aVar);
        this.f11509i = new f(this, aVar);
        this.f11510j = new LinkedHashSet<>();
        this.f11511k = new a();
        this.f11513m = false;
        TypedArray typedArrayH = j.h(getContext(), attributeSet, l.o2, i2, i3, new int[0]);
        setSingleSelection(typedArrayH.getBoolean(l.r2, false));
        this.p = typedArrayH.getResourceId(l.p2, -1);
        this.o = typedArrayH.getBoolean(l.q2, false);
        setChildrenDrawingOrderEnabled(true);
        typedArrayH.recycle();
        t.u0(this, 1);
    }

    public void setSingleSelection(int i2) {
        setSingleSelection(getResources().getBoolean(i2));
    }
}