package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.widget.i0;
import ch.qos.logback.classic.Level;

/* loaded from: classes.dex */
public class ActionMenuView extends i0 implements g.b, androidx.appcompat.view.menu.n {
    private boolean A;
    private int B;
    private int C;
    private int D;
    e E;
    private androidx.appcompat.view.menu.g t;
    private Context u;
    private int v;
    private boolean w;
    private androidx.appcompat.widget.c x;
    private m.a y;
    g.a z;

    public interface a {
        boolean b();

        boolean c();
    }

    private static class b implements m.a {
        b() {
        }

        @Override // androidx.appcompat.view.menu.m.a
        public void c(androidx.appcompat.view.menu.g gVar, boolean z) {
        }

        @Override // androidx.appcompat.view.menu.m.a
        public boolean d(androidx.appcompat.view.menu.g gVar) {
            return false;
        }
    }

    public static class c extends i0.a {

        /* renamed from: c, reason: collision with root package name */
        @ViewDebug.ExportedProperty
        public boolean f324c;

        /* renamed from: d, reason: collision with root package name */
        @ViewDebug.ExportedProperty
        public int f325d;

        /* renamed from: e, reason: collision with root package name */
        @ViewDebug.ExportedProperty
        public int f326e;

        /* renamed from: f, reason: collision with root package name */
        @ViewDebug.ExportedProperty
        public boolean f327f;

        /* renamed from: g, reason: collision with root package name */
        @ViewDebug.ExportedProperty
        public boolean f328g;

        /* renamed from: h, reason: collision with root package name */
        boolean f329h;

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public c(c cVar) {
            super(cVar);
            this.f324c = cVar.f324c;
        }

        public c(int i2, int i3) {
            super(i2, i3);
            this.f324c = false;
        }
    }

    private class d implements g.a {
        d() {
        }

        @Override // androidx.appcompat.view.menu.g.a
        public boolean a(androidx.appcompat.view.menu.g gVar, MenuItem menuItem) {
            e eVar = ActionMenuView.this.E;
            return eVar != null && eVar.onMenuItemClick(menuItem);
        }

        @Override // androidx.appcompat.view.menu.g.a
        public void b(androidx.appcompat.view.menu.g gVar) {
            g.a aVar = ActionMenuView.this.z;
            if (aVar != null) {
                aVar.b(gVar);
            }
        }
    }

    public interface e {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public ActionMenuView(Context context) {
        this(context, null);
    }

    static int L(View view, int i2, int i3, int i4, int i5) {
        c cVar = (c) view.getLayoutParams();
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i4) - i5, View.MeasureSpec.getMode(i4));
        ActionMenuItemView actionMenuItemView = view instanceof ActionMenuItemView ? (ActionMenuItemView) view : null;
        boolean z = actionMenuItemView != null && actionMenuItemView.g();
        int i6 = 2;
        if (i3 <= 0 || (z && i3 < 2)) {
            i6 = 0;
        } else {
            view.measure(View.MeasureSpec.makeMeasureSpec(i3 * i2, Level.ALL_INT), iMakeMeasureSpec);
            int measuredWidth = view.getMeasuredWidth();
            int i7 = measuredWidth / i2;
            if (measuredWidth % i2 != 0) {
                i7++;
            }
            if (!z || i7 >= 2) {
                i6 = i7;
            }
        }
        cVar.f327f = !cVar.f324c && z;
        cVar.f325d = i6;
        view.measure(View.MeasureSpec.makeMeasureSpec(i2 * i6, 1073741824), iMakeMeasureSpec);
        return i6;
    }

    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r14v9, types: [boolean, int] */
    private void M(int i2, int i3) {
        int i4;
        int i5;
        boolean z;
        int i6;
        boolean z2;
        boolean z3;
        int i7;
        ?? r14;
        int mode = View.MeasureSpec.getMode(i3);
        int size = View.MeasureSpec.getSize(i2);
        int size2 = View.MeasureSpec.getSize(i3);
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i3, paddingTop, -2);
        int i8 = size - paddingLeft;
        int i9 = this.C;
        int i10 = i8 / i9;
        int i11 = i8 % i9;
        if (i10 == 0) {
            setMeasuredDimension(i8, 0);
            return;
        }
        int i12 = i9 + (i11 / i10);
        int childCount = getChildCount();
        int iMax = 0;
        int i13 = 0;
        boolean z4 = false;
        int i14 = 0;
        int iMax2 = 0;
        int i15 = 0;
        long j2 = 0;
        while (i13 < childCount) {
            View childAt = getChildAt(i13);
            int i16 = size2;
            if (childAt.getVisibility() != 8) {
                boolean z5 = childAt instanceof ActionMenuItemView;
                int i17 = i14 + 1;
                if (z5) {
                    int i18 = this.D;
                    i7 = i17;
                    r14 = 0;
                    childAt.setPadding(i18, 0, i18, 0);
                } else {
                    i7 = i17;
                    r14 = 0;
                }
                c cVar = (c) childAt.getLayoutParams();
                cVar.f329h = r14;
                cVar.f326e = r14;
                cVar.f325d = r14;
                cVar.f327f = r14;
                ((ViewGroup.MarginLayoutParams) cVar).leftMargin = r14;
                ((ViewGroup.MarginLayoutParams) cVar).rightMargin = r14;
                cVar.f328g = z5 && ((ActionMenuItemView) childAt).g();
                int iL = L(childAt, i12, cVar.f324c ? 1 : i10, childMeasureSpec, paddingTop);
                iMax2 = Math.max(iMax2, iL);
                if (cVar.f327f) {
                    i15++;
                }
                if (cVar.f324c) {
                    z4 = true;
                }
                i10 -= iL;
                iMax = Math.max(iMax, childAt.getMeasuredHeight());
                if (iL == 1) {
                    j2 |= 1 << i13;
                    iMax = iMax;
                }
                i14 = i7;
            }
            i13++;
            size2 = i16;
        }
        int i19 = size2;
        boolean z6 = z4 && i14 == 2;
        boolean z7 = false;
        while (i15 > 0 && i10 > 0) {
            int i20 = 0;
            int i21 = 0;
            int i22 = Integer.MAX_VALUE;
            long j3 = 0;
            while (i21 < childCount) {
                boolean z8 = z7;
                c cVar2 = (c) getChildAt(i21).getLayoutParams();
                int i23 = iMax;
                if (cVar2.f327f) {
                    int i24 = cVar2.f325d;
                    if (i24 < i22) {
                        j3 = 1 << i21;
                        i22 = i24;
                        i20 = 1;
                    } else if (i24 == i22) {
                        i20++;
                        j3 |= 1 << i21;
                    }
                }
                i21++;
                iMax = i23;
                z7 = z8;
            }
            z = z7;
            i6 = iMax;
            j2 |= j3;
            if (i20 > i10) {
                i4 = mode;
                i5 = i8;
                break;
            }
            int i25 = i22 + 1;
            int i26 = 0;
            while (i26 < childCount) {
                View childAt2 = getChildAt(i26);
                c cVar3 = (c) childAt2.getLayoutParams();
                int i27 = i8;
                int i28 = mode;
                long j4 = 1 << i26;
                if ((j3 & j4) == 0) {
                    if (cVar3.f325d == i25) {
                        j2 |= j4;
                    }
                    z3 = z6;
                } else {
                    if (z6 && cVar3.f328g && i10 == 1) {
                        int i29 = this.D;
                        z3 = z6;
                        childAt2.setPadding(i29 + i12, 0, i29, 0);
                    } else {
                        z3 = z6;
                    }
                    cVar3.f325d++;
                    cVar3.f329h = true;
                    i10--;
                }
                i26++;
                mode = i28;
                i8 = i27;
                z6 = z3;
            }
            iMax = i6;
            z7 = true;
        }
        i4 = mode;
        i5 = i8;
        z = z7;
        i6 = iMax;
        boolean z9 = !z4 && i14 == 1;
        if (i10 <= 0 || j2 == 0 || (i10 >= i14 - 1 && !z9 && iMax2 <= 1)) {
            z2 = z;
        } else {
            float fBitCount = Long.bitCount(j2);
            if (!z9) {
                if ((j2 & 1) != 0 && !((c) getChildAt(0).getLayoutParams()).f328g) {
                    fBitCount -= 0.5f;
                }
                int i30 = childCount - 1;
                if ((j2 & (1 << i30)) != 0 && !((c) getChildAt(i30).getLayoutParams()).f328g) {
                    fBitCount -= 0.5f;
                }
            }
            int i31 = fBitCount > 0.0f ? (int) ((i10 * i12) / fBitCount) : 0;
            z2 = z;
            for (int i32 = 0; i32 < childCount; i32++) {
                if ((j2 & (1 << i32)) != 0) {
                    View childAt3 = getChildAt(i32);
                    c cVar4 = (c) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        cVar4.f326e = i31;
                        cVar4.f329h = true;
                        if (i32 == 0 && !cVar4.f328g) {
                            ((ViewGroup.MarginLayoutParams) cVar4).leftMargin = (-i31) / 2;
                        }
                    } else if (cVar4.f324c) {
                        cVar4.f326e = i31;
                        cVar4.f329h = true;
                        ((ViewGroup.MarginLayoutParams) cVar4).rightMargin = (-i31) / 2;
                    } else {
                        if (i32 != 0) {
                            ((ViewGroup.MarginLayoutParams) cVar4).leftMargin = i31 / 2;
                        }
                        if (i32 != childCount - 1) {
                            ((ViewGroup.MarginLayoutParams) cVar4).rightMargin = i31 / 2;
                        }
                    }
                    z2 = true;
                }
            }
        }
        if (z2) {
            for (int i33 = 0; i33 < childCount; i33++) {
                View childAt4 = getChildAt(i33);
                c cVar5 = (c) childAt4.getLayoutParams();
                if (cVar5.f329h) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((cVar5.f325d * i12) + cVar5.f326e, 1073741824), childMeasureSpec);
                }
            }
        }
        setMeasuredDimension(i5, i4 != 1073741824 ? i6 : i19);
    }

    public void B() {
        androidx.appcompat.widget.c cVar = this.x;
        if (cVar != null) {
            cVar.y();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.i0
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public c generateDefaultLayoutParams() {
        c cVar = new c(-2, -2);
        cVar.f486b = 16;
        return cVar;
    }

    @Override // androidx.appcompat.widget.i0
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public c generateLayoutParams(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.i0
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public c generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams == null) {
            return generateDefaultLayoutParams();
        }
        c cVar = layoutParams instanceof c ? new c((c) layoutParams) : new c(layoutParams);
        if (cVar.f486b <= 0) {
            cVar.f486b = 16;
        }
        return cVar;
    }

    public c F() {
        c cVarGenerateDefaultLayoutParams = generateDefaultLayoutParams();
        cVarGenerateDefaultLayoutParams.f324c = true;
        return cVarGenerateDefaultLayoutParams;
    }

    protected boolean G(int i2) {
        boolean zB = false;
        if (i2 == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i2 - 1);
        KeyEvent.Callback childAt2 = getChildAt(i2);
        if (i2 < getChildCount() && (childAt instanceof a)) {
            zB = false | ((a) childAt).b();
        }
        return (i2 <= 0 || !(childAt2 instanceof a)) ? zB : zB | ((a) childAt2).c();
    }

    public boolean H() {
        androidx.appcompat.widget.c cVar = this.x;
        return cVar != null && cVar.B();
    }

    public boolean I() {
        androidx.appcompat.widget.c cVar = this.x;
        return cVar != null && cVar.D();
    }

    public boolean J() {
        androidx.appcompat.widget.c cVar = this.x;
        return cVar != null && cVar.E();
    }

    public boolean K() {
        return this.w;
    }

    public androidx.appcompat.view.menu.g N() {
        return this.t;
    }

    public void O(m.a aVar, g.a aVar2) {
        this.y = aVar;
        this.z = aVar2;
    }

    public boolean P() {
        androidx.appcompat.widget.c cVar = this.x;
        return cVar != null && cVar.K();
    }

    @Override // androidx.appcompat.view.menu.g.b
    public boolean a(androidx.appcompat.view.menu.i iVar) {
        return this.t.L(iVar, 0);
    }

    @Override // androidx.appcompat.view.menu.n
    public void b(androidx.appcompat.view.menu.g gVar) {
        this.t = gVar;
    }

    @Override // androidx.appcompat.widget.i0, android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof c;
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    public Menu getMenu() {
        if (this.t == null) {
            Context context = getContext();
            androidx.appcompat.view.menu.g gVar = new androidx.appcompat.view.menu.g(context);
            this.t = gVar;
            gVar.R(new d());
            androidx.appcompat.widget.c cVar = new androidx.appcompat.widget.c(context);
            this.x = cVar;
            cVar.J(true);
            androidx.appcompat.widget.c cVar2 = this.x;
            m.a bVar = this.y;
            if (bVar == null) {
                bVar = new b();
            }
            cVar2.h(bVar);
            this.t.c(this.x, this.u);
            this.x.H(this);
        }
        return this.t;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        return this.x.A();
    }

    public int getPopupTheme() {
        return this.v;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        androidx.appcompat.widget.c cVar = this.x;
        if (cVar != null) {
            cVar.d(false);
            if (this.x.E()) {
                this.x.B();
                this.x.K();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        B();
    }

    @Override // androidx.appcompat.widget.i0, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        int width;
        int paddingLeft;
        if (!this.A) {
            super.onLayout(z, i2, i3, i4, i5);
            return;
        }
        int childCount = getChildCount();
        int i6 = (i5 - i3) / 2;
        int dividerWidth = getDividerWidth();
        int i7 = i4 - i2;
        int paddingRight = (i7 - getPaddingRight()) - getPaddingLeft();
        boolean zB = c1.b(this);
        int i8 = 0;
        int i9 = 0;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                c cVar = (c) childAt.getLayoutParams();
                if (cVar.f324c) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (G(i10)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (zB) {
                        paddingLeft = getPaddingLeft() + ((ViewGroup.MarginLayoutParams) cVar).leftMargin;
                        width = paddingLeft + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) cVar).rightMargin;
                        paddingLeft = width - measuredWidth;
                    }
                    int i11 = i6 - (measuredHeight / 2);
                    childAt.layout(paddingLeft, i11, width, measuredHeight + i11);
                    paddingRight -= measuredWidth;
                    i8 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) cVar).leftMargin) + ((ViewGroup.MarginLayoutParams) cVar).rightMargin;
                    G(i10);
                    i9++;
                }
            }
        }
        if (childCount == 1 && i8 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i12 = (i7 / 2) - (measuredWidth2 / 2);
            int i13 = i6 - (measuredHeight2 / 2);
            childAt2.layout(i12, i13, measuredWidth2 + i12, measuredHeight2 + i13);
            return;
        }
        int i14 = i9 - (i8 ^ 1);
        int iMax = Math.max(0, i14 > 0 ? paddingRight / i14 : 0);
        if (zB) {
            int width2 = getWidth() - getPaddingRight();
            for (int i15 = 0; i15 < childCount; i15++) {
                View childAt3 = getChildAt(i15);
                c cVar2 = (c) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !cVar2.f324c) {
                    int i16 = width2 - ((ViewGroup.MarginLayoutParams) cVar2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i17 = i6 - (measuredHeight3 / 2);
                    childAt3.layout(i16 - measuredWidth3, i17, i16, measuredHeight3 + i17);
                    width2 = i16 - ((measuredWidth3 + ((ViewGroup.MarginLayoutParams) cVar2).leftMargin) + iMax);
                }
            }
            return;
        }
        int paddingLeft2 = getPaddingLeft();
        for (int i18 = 0; i18 < childCount; i18++) {
            View childAt4 = getChildAt(i18);
            c cVar3 = (c) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !cVar3.f324c) {
                int i19 = paddingLeft2 + ((ViewGroup.MarginLayoutParams) cVar3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i20 = i6 - (measuredHeight4 / 2);
                childAt4.layout(i19, i20, i19 + measuredWidth4, measuredHeight4 + i20);
                paddingLeft2 = i19 + measuredWidth4 + ((ViewGroup.MarginLayoutParams) cVar3).rightMargin + iMax;
            }
        }
    }

    @Override // androidx.appcompat.widget.i0, android.view.View
    protected void onMeasure(int i2, int i3) {
        androidx.appcompat.view.menu.g gVar;
        boolean z = this.A;
        boolean z2 = View.MeasureSpec.getMode(i2) == 1073741824;
        this.A = z2;
        if (z != z2) {
            this.B = 0;
        }
        int size = View.MeasureSpec.getSize(i2);
        if (this.A && (gVar = this.t) != null && size != this.B) {
            this.B = size;
            gVar.K(true);
        }
        int childCount = getChildCount();
        if (this.A && childCount > 0) {
            M(i2, i3);
            return;
        }
        for (int i4 = 0; i4 < childCount; i4++) {
            c cVar = (c) getChildAt(i4).getLayoutParams();
            ((ViewGroup.MarginLayoutParams) cVar).rightMargin = 0;
            ((ViewGroup.MarginLayoutParams) cVar).leftMargin = 0;
        }
        super.onMeasure(i2, i3);
    }

    public void setExpandedActionViewsExclusive(boolean z) {
        this.x.G(z);
    }

    public void setOnMenuItemClickListener(e eVar) {
        this.E = eVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        this.x.I(drawable);
    }

    public void setOverflowReserved(boolean z) {
        this.w = z;
    }

    public void setPopupTheme(int i2) {
        if (this.v != i2) {
            this.v = i2;
            if (i2 == 0) {
                this.u = getContext();
            } else {
                this.u = new ContextThemeWrapper(getContext(), i2);
            }
        }
    }

    public void setPresenter(androidx.appcompat.widget.c cVar) {
        this.x = cVar;
        cVar.H(this);
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f2 = context.getResources().getDisplayMetrics().density;
        this.C = (int) (56.0f * f2);
        this.D = (int) (f2 * 4.0f);
        this.u = context;
        this.v = 0;
    }
}