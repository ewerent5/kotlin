package com.google.android.flexbox;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import c.h.l.t;
import ch.qos.logback.classic.Level;
import com.google.android.flexbox.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import okhttp3.internal.http2.Http2Connection;

/* loaded from: classes.dex */
public class FlexboxLayout extends ViewGroup implements com.google.android.flexbox.a {

    /* renamed from: e, reason: collision with root package name */
    private int f4438e;

    /* renamed from: f, reason: collision with root package name */
    private int f4439f;

    /* renamed from: g, reason: collision with root package name */
    private int f4440g;

    /* renamed from: h, reason: collision with root package name */
    private int f4441h;

    /* renamed from: i, reason: collision with root package name */
    private int f4442i;

    /* renamed from: j, reason: collision with root package name */
    private int f4443j;

    /* renamed from: k, reason: collision with root package name */
    private Drawable f4444k;

    /* renamed from: l, reason: collision with root package name */
    private Drawable f4445l;

    /* renamed from: m, reason: collision with root package name */
    private int f4446m;
    private int n;
    private int o;
    private int p;
    private int[] q;
    private SparseIntArray r;
    private d s;
    private List<c> t;
    private d.b u;

    public FlexboxLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void A() {
        if (this.f4444k == null && this.f4445l == null) {
            setWillNotDraw(true);
        } else {
            setWillNotDraw(false);
        }
    }

    private boolean a(int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            if (this.t.get(i3).c() > 0) {
                return false;
            }
        }
        return true;
    }

    private boolean l(int i2, int i3) {
        for (int i4 = 1; i4 <= i3; i4++) {
            View viewR = r(i2 - i4);
            if (viewR != null && viewR.getVisibility() != 8) {
                return false;
            }
        }
        return true;
    }

    private void m(Canvas canvas, boolean z, boolean z2) {
        int paddingLeft = getPaddingLeft();
        int iMax = Math.max(0, (getWidth() - getPaddingRight()) - paddingLeft);
        int size = this.t.size();
        for (int i2 = 0; i2 < size; i2++) {
            c cVar = this.t.get(i2);
            for (int i3 = 0; i3 < cVar.f4485h; i3++) {
                int i4 = cVar.o + i3;
                View viewR = r(i4);
                if (viewR != null && viewR.getVisibility() != 8) {
                    a aVar = (a) viewR.getLayoutParams();
                    if (s(i4, i3)) {
                        p(canvas, z ? viewR.getRight() + ((ViewGroup.MarginLayoutParams) aVar).rightMargin : (viewR.getLeft() - ((ViewGroup.MarginLayoutParams) aVar).leftMargin) - this.p, cVar.f4479b, cVar.f4484g);
                    }
                    if (i3 == cVar.f4485h - 1 && (this.n & 4) > 0) {
                        p(canvas, z ? (viewR.getLeft() - ((ViewGroup.MarginLayoutParams) aVar).leftMargin) - this.p : viewR.getRight() + ((ViewGroup.MarginLayoutParams) aVar).rightMargin, cVar.f4479b, cVar.f4484g);
                    }
                }
            }
            if (t(i2)) {
                o(canvas, paddingLeft, z2 ? cVar.f4481d : cVar.f4479b - this.o, iMax);
            }
            if (u(i2) && (this.f4446m & 4) > 0) {
                o(canvas, paddingLeft, z2 ? cVar.f4479b - this.o : cVar.f4481d, iMax);
            }
        }
    }

    private void n(Canvas canvas, boolean z, boolean z2) {
        int paddingTop = getPaddingTop();
        int iMax = Math.max(0, (getHeight() - getPaddingBottom()) - paddingTop);
        int size = this.t.size();
        for (int i2 = 0; i2 < size; i2++) {
            c cVar = this.t.get(i2);
            for (int i3 = 0; i3 < cVar.f4485h; i3++) {
                int i4 = cVar.o + i3;
                View viewR = r(i4);
                if (viewR != null && viewR.getVisibility() != 8) {
                    a aVar = (a) viewR.getLayoutParams();
                    if (s(i4, i3)) {
                        o(canvas, cVar.a, z2 ? viewR.getBottom() + ((ViewGroup.MarginLayoutParams) aVar).bottomMargin : (viewR.getTop() - ((ViewGroup.MarginLayoutParams) aVar).topMargin) - this.o, cVar.f4484g);
                    }
                    if (i3 == cVar.f4485h - 1 && (this.f4446m & 4) > 0) {
                        o(canvas, cVar.a, z2 ? (viewR.getTop() - ((ViewGroup.MarginLayoutParams) aVar).topMargin) - this.o : viewR.getBottom() + ((ViewGroup.MarginLayoutParams) aVar).bottomMargin, cVar.f4484g);
                    }
                }
            }
            if (t(i2)) {
                p(canvas, z ? cVar.f4480c : cVar.a - this.p, paddingTop, iMax);
            }
            if (u(i2) && (this.n & 4) > 0) {
                p(canvas, z ? cVar.a - this.p : cVar.f4480c, paddingTop, iMax);
            }
        }
    }

    private void o(Canvas canvas, int i2, int i3, int i4) {
        Drawable drawable = this.f4444k;
        if (drawable == null) {
            return;
        }
        drawable.setBounds(i2, i3, i4 + i2, this.o + i3);
        this.f4444k.draw(canvas);
    }

    private void p(Canvas canvas, int i2, int i3, int i4) {
        Drawable drawable = this.f4445l;
        if (drawable == null) {
            return;
        }
        drawable.setBounds(i2, i3, this.p + i2, i4 + i3);
        this.f4445l.draw(canvas);
    }

    private boolean s(int i2, int i3) {
        return l(i2, i3) ? j() ? (this.n & 1) != 0 : (this.f4446m & 1) != 0 : j() ? (this.n & 2) != 0 : (this.f4446m & 2) != 0;
    }

    private boolean t(int i2) {
        if (i2 < 0 || i2 >= this.t.size()) {
            return false;
        }
        return a(i2) ? j() ? (this.f4446m & 1) != 0 : (this.n & 1) != 0 : j() ? (this.f4446m & 2) != 0 : (this.n & 2) != 0;
    }

    private boolean u(int i2) {
        if (i2 < 0 || i2 >= this.t.size()) {
            return false;
        }
        for (int i3 = i2 + 1; i3 < this.t.size(); i3++) {
            if (this.t.get(i3).c() > 0) {
                return false;
            }
        }
        return j() ? (this.f4446m & 4) != 0 : (this.n & 4) != 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00d4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void v(boolean r29, int r30, int r31, int r32, int r33) {
        /*
            Method dump skipped, instructions count: 544
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayout.v(boolean, int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00d2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void w(boolean r30, boolean r31, int r32, int r33, int r34, int r35) {
        /*
            Method dump skipped, instructions count: 532
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayout.w(boolean, boolean, int, int, int, int):void");
    }

    private void x(int i2, int i3) throws NoSuchFieldException {
        this.t.clear();
        this.u.a();
        this.s.c(this.u, i2, i3);
        this.t = this.u.a;
        this.s.p(i2, i3);
        if (this.f4441h == 3) {
            for (c cVar : this.t) {
                int iMax = Level.ALL_INT;
                for (int i4 = 0; i4 < cVar.f4485h; i4++) {
                    View viewR = r(cVar.o + i4);
                    if (viewR != null && viewR.getVisibility() != 8) {
                        a aVar = (a) viewR.getLayoutParams();
                        iMax = this.f4439f != 2 ? Math.max(iMax, viewR.getMeasuredHeight() + Math.max(cVar.f4489l - viewR.getBaseline(), ((ViewGroup.MarginLayoutParams) aVar).topMargin) + ((ViewGroup.MarginLayoutParams) aVar).bottomMargin) : Math.max(iMax, viewR.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) aVar).topMargin + Math.max((cVar.f4489l - viewR.getMeasuredHeight()) + viewR.getBaseline(), ((ViewGroup.MarginLayoutParams) aVar).bottomMargin));
                    }
                }
                cVar.f4484g = iMax;
            }
        }
        this.s.o(i2, i3, getPaddingTop() + getPaddingBottom());
        this.s.X();
        z(this.f4438e, i2, i3, this.u.f4495b);
    }

    private void y(int i2, int i3) throws NoSuchFieldException {
        this.t.clear();
        this.u.a();
        this.s.f(this.u, i2, i3);
        this.t = this.u.a;
        this.s.p(i2, i3);
        this.s.o(i2, i3, getPaddingLeft() + getPaddingRight());
        this.s.X();
        z(this.f4438e, i2, i3, this.u.f4495b);
    }

    private void z(int i2, int i3, int i4, int i5) {
        int sumOfCrossSize;
        int largestMainSize;
        int iResolveSizeAndState;
        int iResolveSizeAndState2;
        int mode = View.MeasureSpec.getMode(i3);
        int size = View.MeasureSpec.getSize(i3);
        int mode2 = View.MeasureSpec.getMode(i4);
        int size2 = View.MeasureSpec.getSize(i4);
        if (i2 == 0 || i2 == 1) {
            sumOfCrossSize = getSumOfCrossSize() + getPaddingTop() + getPaddingBottom();
            largestMainSize = getLargestMainSize();
        } else {
            if (i2 != 2 && i2 != 3) {
                throw new IllegalArgumentException("Invalid flex direction: " + i2);
            }
            sumOfCrossSize = getLargestMainSize();
            largestMainSize = getSumOfCrossSize() + getPaddingLeft() + getPaddingRight();
        }
        if (mode == Integer.MIN_VALUE) {
            if (size < largestMainSize) {
                i5 = View.combineMeasuredStates(i5, Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE);
            } else {
                size = largestMainSize;
            }
            iResolveSizeAndState = View.resolveSizeAndState(size, i3, i5);
        } else if (mode == 0) {
            iResolveSizeAndState = View.resolveSizeAndState(largestMainSize, i3, i5);
        } else {
            if (mode != 1073741824) {
                throw new IllegalStateException("Unknown width mode is set: " + mode);
            }
            if (size < largestMainSize) {
                i5 = View.combineMeasuredStates(i5, Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE);
            }
            iResolveSizeAndState = View.resolveSizeAndState(size, i3, i5);
        }
        if (mode2 == Integer.MIN_VALUE) {
            if (size2 < sumOfCrossSize) {
                i5 = View.combineMeasuredStates(i5, 256);
            } else {
                size2 = sumOfCrossSize;
            }
            iResolveSizeAndState2 = View.resolveSizeAndState(size2, i4, i5);
        } else if (mode2 == 0) {
            iResolveSizeAndState2 = View.resolveSizeAndState(sumOfCrossSize, i4, i5);
        } else {
            if (mode2 != 1073741824) {
                throw new IllegalStateException("Unknown height mode is set: " + mode2);
            }
            if (size2 < sumOfCrossSize) {
                i5 = View.combineMeasuredStates(i5, 256);
            }
            iResolveSizeAndState2 = View.resolveSizeAndState(size2, i4, i5);
        }
        setMeasuredDimension(iResolveSizeAndState, iResolveSizeAndState2);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        if (this.r == null) {
            this.r = new SparseIntArray(getChildCount());
        }
        this.q = this.s.n(view, i2, layoutParams, this.r);
        super.addView(view, i2, layoutParams);
    }

    @Override // com.google.android.flexbox.a
    public void b(View view, int i2, int i3, c cVar) {
        if (s(i2, i3)) {
            if (j()) {
                int i4 = cVar.f4482e;
                int i5 = this.p;
                cVar.f4482e = i4 + i5;
                cVar.f4483f += i5;
                return;
            }
            int i6 = cVar.f4482e;
            int i7 = this.o;
            cVar.f4482e = i6 + i7;
            cVar.f4483f += i7;
        }
    }

    @Override // com.google.android.flexbox.a
    public void c(c cVar) {
        if (j()) {
            if ((this.n & 4) > 0) {
                int i2 = cVar.f4482e;
                int i3 = this.p;
                cVar.f4482e = i2 + i3;
                cVar.f4483f += i3;
                return;
            }
            return;
        }
        if ((this.f4446m & 4) > 0) {
            int i4 = cVar.f4482e;
            int i5 = this.o;
            cVar.f4482e = i4 + i5;
            cVar.f4483f += i5;
        }
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a;
    }

    @Override // com.google.android.flexbox.a
    public View d(int i2) {
        return r(i2);
    }

    @Override // com.google.android.flexbox.a
    public int e(int i2, int i3, int i4) {
        return ViewGroup.getChildMeasureSpec(i2, i3, i4);
    }

    @Override // com.google.android.flexbox.a
    public void f(int i2, View view) {
    }

    @Override // com.google.android.flexbox.a
    public View g(int i2) {
        return getChildAt(i2);
    }

    @Override // com.google.android.flexbox.a
    public int getAlignContent() {
        return this.f4442i;
    }

    @Override // com.google.android.flexbox.a
    public int getAlignItems() {
        return this.f4441h;
    }

    public Drawable getDividerDrawableHorizontal() {
        return this.f4444k;
    }

    public Drawable getDividerDrawableVertical() {
        return this.f4445l;
    }

    @Override // com.google.android.flexbox.a
    public int getFlexDirection() {
        return this.f4438e;
    }

    @Override // com.google.android.flexbox.a
    public int getFlexItemCount() {
        return getChildCount();
    }

    public List<c> getFlexLines() {
        ArrayList arrayList = new ArrayList(this.t.size());
        for (c cVar : this.t) {
            if (cVar.c() != 0) {
                arrayList.add(cVar);
            }
        }
        return arrayList;
    }

    @Override // com.google.android.flexbox.a
    public List<c> getFlexLinesInternal() {
        return this.t;
    }

    @Override // com.google.android.flexbox.a
    public int getFlexWrap() {
        return this.f4439f;
    }

    public int getJustifyContent() {
        return this.f4440g;
    }

    @Override // com.google.android.flexbox.a
    public int getLargestMainSize() {
        Iterator<c> it = this.t.iterator();
        int iMax = Level.ALL_INT;
        while (it.hasNext()) {
            iMax = Math.max(iMax, it.next().f4482e);
        }
        return iMax;
    }

    @Override // com.google.android.flexbox.a
    public int getMaxLine() {
        return this.f4443j;
    }

    public int getShowDividerHorizontal() {
        return this.f4446m;
    }

    public int getShowDividerVertical() {
        return this.n;
    }

    @Override // com.google.android.flexbox.a
    public int getSumOfCrossSize() {
        int size = this.t.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            c cVar = this.t.get(i3);
            if (t(i3)) {
                i2 += j() ? this.o : this.p;
            }
            if (u(i3)) {
                i2 += j() ? this.o : this.p;
            }
            i2 += cVar.f4484g;
        }
        return i2;
    }

    @Override // com.google.android.flexbox.a
    public int h(View view, int i2, int i3) {
        int i4;
        int i5;
        if (j()) {
            i4 = s(i2, i3) ? 0 + this.p : 0;
            if ((this.n & 4) <= 0) {
                return i4;
            }
            i5 = this.p;
        } else {
            i4 = s(i2, i3) ? 0 + this.o : 0;
            if ((this.f4446m & 4) <= 0) {
                return i4;
            }
            i5 = this.o;
        }
        return i4 + i5;
    }

    @Override // com.google.android.flexbox.a
    public int i(int i2, int i3, int i4) {
        return ViewGroup.getChildMeasureSpec(i2, i3, i4);
    }

    @Override // com.google.android.flexbox.a
    public boolean j() {
        int i2 = this.f4438e;
        return i2 == 0 || i2 == 1;
    }

    @Override // com.google.android.flexbox.a
    public int k(View view) {
        return 0;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        if (this.f4445l == null && this.f4444k == null) {
            return;
        }
        if (this.f4446m == 0 && this.n == 0) {
            return;
        }
        int iB = t.B(this);
        int i2 = this.f4438e;
        if (i2 == 0) {
            m(canvas, iB == 1, this.f4439f == 2);
            return;
        }
        if (i2 == 1) {
            m(canvas, iB != 1, this.f4439f == 2);
            return;
        }
        if (i2 == 2) {
            boolean z = iB == 1;
            if (this.f4439f == 2) {
                z = !z;
            }
            n(canvas, z, false);
            return;
        }
        if (i2 != 3) {
            return;
        }
        boolean z2 = iB == 1;
        if (this.f4439f == 2) {
            z2 = !z2;
        }
        n(canvas, z2, true);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        boolean z2;
        int iB = t.B(this);
        int i6 = this.f4438e;
        if (i6 == 0) {
            v(iB == 1, i2, i3, i4, i5);
            return;
        }
        if (i6 == 1) {
            v(iB != 1, i2, i3, i4, i5);
            return;
        }
        if (i6 == 2) {
            z2 = iB == 1;
            w(this.f4439f == 2 ? !z2 : z2, false, i2, i3, i4, i5);
        } else if (i6 == 3) {
            z2 = iB == 1;
            w(this.f4439f == 2 ? !z2 : z2, true, i2, i3, i4, i5);
        } else {
            throw new IllegalStateException("Invalid flex direction is set: " + this.f4438e);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i2, int i3) throws NoSuchFieldException {
        if (this.r == null) {
            this.r = new SparseIntArray(getChildCount());
        }
        if (this.s.O(this.r)) {
            this.q = this.s.m(this.r);
        }
        int i4 = this.f4438e;
        if (i4 == 0 || i4 == 1) {
            x(i2, i3);
            return;
        }
        if (i4 == 2 || i4 == 3) {
            y(i2, i3);
            return;
        }
        throw new IllegalStateException("Invalid value for the flex direction is set: " + this.f4438e);
    }

    @Override // android.view.ViewGroup
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public a generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    public View r(int i2) {
        if (i2 < 0) {
            return null;
        }
        int[] iArr = this.q;
        if (i2 >= iArr.length) {
            return null;
        }
        return getChildAt(iArr[i2]);
    }

    public void setAlignContent(int i2) {
        if (this.f4442i != i2) {
            this.f4442i = i2;
            requestLayout();
        }
    }

    public void setAlignItems(int i2) {
        if (this.f4441h != i2) {
            this.f4441h = i2;
            requestLayout();
        }
    }

    public void setDividerDrawable(Drawable drawable) {
        setDividerDrawableHorizontal(drawable);
        setDividerDrawableVertical(drawable);
    }

    public void setDividerDrawableHorizontal(Drawable drawable) {
        if (drawable == this.f4444k) {
            return;
        }
        this.f4444k = drawable;
        if (drawable != null) {
            this.o = drawable.getIntrinsicHeight();
        } else {
            this.o = 0;
        }
        A();
        requestLayout();
    }

    public void setDividerDrawableVertical(Drawable drawable) {
        if (drawable == this.f4445l) {
            return;
        }
        this.f4445l = drawable;
        if (drawable != null) {
            this.p = drawable.getIntrinsicWidth();
        } else {
            this.p = 0;
        }
        A();
        requestLayout();
    }

    public void setFlexDirection(int i2) {
        if (this.f4438e != i2) {
            this.f4438e = i2;
            requestLayout();
        }
    }

    @Override // com.google.android.flexbox.a
    public void setFlexLines(List<c> list) {
        this.t = list;
    }

    public void setFlexWrap(int i2) {
        if (this.f4439f != i2) {
            this.f4439f = i2;
            requestLayout();
        }
    }

    public void setJustifyContent(int i2) {
        if (this.f4440g != i2) {
            this.f4440g = i2;
            requestLayout();
        }
    }

    public void setMaxLine(int i2) {
        if (this.f4443j != i2) {
            this.f4443j = i2;
            requestLayout();
        }
    }

    public void setShowDivider(int i2) {
        setShowDividerVertical(i2);
        setShowDividerHorizontal(i2);
    }

    public void setShowDividerHorizontal(int i2) {
        if (i2 != this.f4446m) {
            this.f4446m = i2;
            requestLayout();
        }
    }

    public void setShowDividerVertical(int i2) {
        if (i2 != this.n) {
            this.n = i2;
            requestLayout();
        }
    }

    public FlexboxLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f4443j = -1;
        this.s = new d(this);
        this.t = new ArrayList();
        this.u = new d.b();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e.a, i2, 0);
        this.f4438e = typedArrayObtainStyledAttributes.getInt(e.f4503g, 0);
        this.f4439f = typedArrayObtainStyledAttributes.getInt(e.f4504h, 0);
        this.f4440g = typedArrayObtainStyledAttributes.getInt(e.f4505i, 0);
        this.f4441h = typedArrayObtainStyledAttributes.getInt(e.f4499c, 0);
        this.f4442i = typedArrayObtainStyledAttributes.getInt(e.f4498b, 0);
        this.f4443j = typedArrayObtainStyledAttributes.getInt(e.f4506j, -1);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(e.f4500d);
        if (drawable != null) {
            setDividerDrawableHorizontal(drawable);
            setDividerDrawableVertical(drawable);
        }
        Drawable drawable2 = typedArrayObtainStyledAttributes.getDrawable(e.f4501e);
        if (drawable2 != null) {
            setDividerDrawableHorizontal(drawable2);
        }
        Drawable drawable3 = typedArrayObtainStyledAttributes.getDrawable(e.f4502f);
        if (drawable3 != null) {
            setDividerDrawableVertical(drawable3);
        }
        int i3 = typedArrayObtainStyledAttributes.getInt(e.f4507k, 0);
        if (i3 != 0) {
            this.n = i3;
            this.f4446m = i3;
        }
        int i4 = typedArrayObtainStyledAttributes.getInt(e.f4509m, 0);
        if (i4 != 0) {
            this.n = i4;
        }
        int i5 = typedArrayObtainStyledAttributes.getInt(e.f4508l, 0);
        if (i5 != 0) {
            this.f4446m = i5;
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a ? new a((a) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new a((ViewGroup.MarginLayoutParams) layoutParams) : new a(layoutParams);
    }

    public static class a extends ViewGroup.MarginLayoutParams implements b {
        public static final Parcelable.Creator<a> CREATOR = new C0108a();

        /* renamed from: e, reason: collision with root package name */
        private int f4447e;

        /* renamed from: f, reason: collision with root package name */
        private float f4448f;

        /* renamed from: g, reason: collision with root package name */
        private float f4449g;

        /* renamed from: h, reason: collision with root package name */
        private int f4450h;

        /* renamed from: i, reason: collision with root package name */
        private float f4451i;

        /* renamed from: j, reason: collision with root package name */
        private int f4452j;

        /* renamed from: k, reason: collision with root package name */
        private int f4453k;

        /* renamed from: l, reason: collision with root package name */
        private int f4454l;

        /* renamed from: m, reason: collision with root package name */
        private int f4455m;
        private boolean n;

        /* renamed from: com.google.android.flexbox.FlexboxLayout$a$a, reason: collision with other inner class name */
        static class C0108a implements Parcelable.Creator<a> {
            C0108a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public a createFromParcel(Parcel parcel) {
                return new a(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public a[] newArray(int i2) {
                return new a[i2];
            }
        }

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f4447e = 1;
            this.f4448f = 0.0f;
            this.f4449g = 1.0f;
            this.f4450h = -1;
            this.f4451i = -1.0f;
            this.f4452j = -1;
            this.f4453k = -1;
            this.f4454l = 16777215;
            this.f4455m = 16777215;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e.n);
            this.f4447e = typedArrayObtainStyledAttributes.getInt(e.w, 1);
            this.f4448f = typedArrayObtainStyledAttributes.getFloat(e.q, 0.0f);
            this.f4449g = typedArrayObtainStyledAttributes.getFloat(e.r, 1.0f);
            this.f4450h = typedArrayObtainStyledAttributes.getInt(e.o, -1);
            this.f4451i = typedArrayObtainStyledAttributes.getFraction(e.p, 1, 1, -1.0f);
            this.f4452j = typedArrayObtainStyledAttributes.getDimensionPixelSize(e.v, -1);
            this.f4453k = typedArrayObtainStyledAttributes.getDimensionPixelSize(e.u, -1);
            this.f4454l = typedArrayObtainStyledAttributes.getDimensionPixelSize(e.t, 16777215);
            this.f4455m = typedArrayObtainStyledAttributes.getDimensionPixelSize(e.s, 16777215);
            this.n = typedArrayObtainStyledAttributes.getBoolean(e.x, false);
            typedArrayObtainStyledAttributes.recycle();
        }

        @Override // com.google.android.flexbox.b
        public boolean E() {
            return this.n;
        }

        @Override // com.google.android.flexbox.b
        public int F() {
            return this.f4455m;
        }

        @Override // com.google.android.flexbox.b
        public int H() {
            return this.f4454l;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.google.android.flexbox.b
        public int getHeight() {
            return ((ViewGroup.MarginLayoutParams) this).height;
        }

        @Override // com.google.android.flexbox.b
        public int getMarginBottom() {
            return ((ViewGroup.MarginLayoutParams) this).bottomMargin;
        }

        @Override // com.google.android.flexbox.b
        public int getMarginLeft() {
            return ((ViewGroup.MarginLayoutParams) this).leftMargin;
        }

        @Override // com.google.android.flexbox.b
        public int getMarginRight() {
            return ((ViewGroup.MarginLayoutParams) this).rightMargin;
        }

        @Override // com.google.android.flexbox.b
        public int getMarginTop() {
            return ((ViewGroup.MarginLayoutParams) this).topMargin;
        }

        @Override // com.google.android.flexbox.b
        public int getOrder() {
            return this.f4447e;
        }

        @Override // com.google.android.flexbox.b
        public int getWidth() {
            return ((ViewGroup.MarginLayoutParams) this).width;
        }

        @Override // com.google.android.flexbox.b
        public int h() {
            return this.f4450h;
        }

        @Override // com.google.android.flexbox.b
        public float k() {
            return this.f4449g;
        }

        @Override // com.google.android.flexbox.b
        public int l() {
            return this.f4452j;
        }

        @Override // com.google.android.flexbox.b
        public void m(int i2) {
            this.f4452j = i2;
        }

        @Override // com.google.android.flexbox.b
        public void o(int i2) {
            this.f4453k = i2;
        }

        @Override // com.google.android.flexbox.b
        public float p() {
            return this.f4448f;
        }

        @Override // com.google.android.flexbox.b
        public float u() {
            return this.f4451i;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeInt(this.f4447e);
            parcel.writeFloat(this.f4448f);
            parcel.writeFloat(this.f4449g);
            parcel.writeInt(this.f4450h);
            parcel.writeFloat(this.f4451i);
            parcel.writeInt(this.f4452j);
            parcel.writeInt(this.f4453k);
            parcel.writeInt(this.f4454l);
            parcel.writeInt(this.f4455m);
            parcel.writeByte(this.n ? (byte) 1 : (byte) 0);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).bottomMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).leftMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).rightMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).topMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).height);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).width);
        }

        @Override // com.google.android.flexbox.b
        public int z() {
            return this.f4453k;
        }

        public a(a aVar) {
            super((ViewGroup.MarginLayoutParams) aVar);
            this.f4447e = 1;
            this.f4448f = 0.0f;
            this.f4449g = 1.0f;
            this.f4450h = -1;
            this.f4451i = -1.0f;
            this.f4452j = -1;
            this.f4453k = -1;
            this.f4454l = 16777215;
            this.f4455m = 16777215;
            this.f4447e = aVar.f4447e;
            this.f4448f = aVar.f4448f;
            this.f4449g = aVar.f4449g;
            this.f4450h = aVar.f4450h;
            this.f4451i = aVar.f4451i;
            this.f4452j = aVar.f4452j;
            this.f4453k = aVar.f4453k;
            this.f4454l = aVar.f4454l;
            this.f4455m = aVar.f4455m;
            this.n = aVar.n;
        }

        public a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f4447e = 1;
            this.f4448f = 0.0f;
            this.f4449g = 1.0f;
            this.f4450h = -1;
            this.f4451i = -1.0f;
            this.f4452j = -1;
            this.f4453k = -1;
            this.f4454l = 16777215;
            this.f4455m = 16777215;
        }

        public a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f4447e = 1;
            this.f4448f = 0.0f;
            this.f4449g = 1.0f;
            this.f4450h = -1;
            this.f4451i = -1.0f;
            this.f4452j = -1;
            this.f4453k = -1;
            this.f4454l = 16777215;
            this.f4455m = 16777215;
        }

        protected a(Parcel parcel) {
            super(0, 0);
            this.f4447e = 1;
            this.f4448f = 0.0f;
            this.f4449g = 1.0f;
            this.f4450h = -1;
            this.f4451i = -1.0f;
            this.f4452j = -1;
            this.f4453k = -1;
            this.f4454l = 16777215;
            this.f4455m = 16777215;
            this.f4447e = parcel.readInt();
            this.f4448f = parcel.readFloat();
            this.f4449g = parcel.readFloat();
            this.f4450h = parcel.readInt();
            this.f4451i = parcel.readFloat();
            this.f4452j = parcel.readInt();
            this.f4453k = parcel.readInt();
            this.f4454l = parcel.readInt();
            this.f4455m = parcel.readInt();
            this.n = parcel.readByte() != 0;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).leftMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).rightMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).topMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).height = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).width = parcel.readInt();
        }
    }
}