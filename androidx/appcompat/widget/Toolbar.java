package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.a;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.widget.ActionMenuView;
import ch.qos.logback.classic.Level;
import ch.qos.logback.core.net.SyslogConstants;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class Toolbar extends ViewGroup {
    private int A;
    private CharSequence B;
    private CharSequence C;
    private ColorStateList D;
    private ColorStateList E;
    private boolean F;
    private boolean G;
    private final ArrayList<View> H;
    private final ArrayList<View> I;
    private final int[] J;
    f K;
    private final ActionMenuView.e L;
    private x0 M;
    private androidx.appcompat.widget.c N;
    private d O;
    private m.a P;
    private g.a Q;
    private boolean R;
    private final Runnable S;

    /* renamed from: e */
    private ActionMenuView f374e;

    /* renamed from: f */
    private TextView f375f;

    /* renamed from: g */
    private TextView f376g;

    /* renamed from: h */
    private ImageButton f377h;

    /* renamed from: i */
    private ImageView f378i;

    /* renamed from: j */
    private Drawable f379j;

    /* renamed from: k */
    private CharSequence f380k;

    /* renamed from: l */
    ImageButton f381l;

    /* renamed from: m */
    View f382m;
    private Context n;
    private int o;
    private int p;
    private int q;
    int r;
    private int s;
    private int t;
    private int u;
    private int v;
    private int w;
    private o0 x;
    private int y;
    private int z;

    class a implements ActionMenuView.e {
        a() {
        }

        @Override // androidx.appcompat.widget.ActionMenuView.e
        public boolean onMenuItemClick(MenuItem menuItem) {
            f fVar = Toolbar.this.K;
            if (fVar != null) {
                return fVar.onMenuItemClick(menuItem);
            }
            return false;
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Toolbar.this.O();
        }
    }

    class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Toolbar.this.e();
        }
    }

    private class d implements androidx.appcompat.view.menu.m {

        /* renamed from: e */
        androidx.appcompat.view.menu.g f385e;

        /* renamed from: f */
        androidx.appcompat.view.menu.i f386f;

        d() {
        }

        @Override // androidx.appcompat.view.menu.m
        public void c(androidx.appcompat.view.menu.g gVar, boolean z) {
        }

        @Override // androidx.appcompat.view.menu.m
        public void d(boolean z) {
            if (this.f386f != null) {
                androidx.appcompat.view.menu.g gVar = this.f385e;
                boolean z2 = false;
                if (gVar != null) {
                    int size = gVar.size();
                    int i2 = 0;
                    while (true) {
                        if (i2 >= size) {
                            break;
                        }
                        if (this.f385e.getItem(i2) == this.f386f) {
                            z2 = true;
                            break;
                        }
                        i2++;
                    }
                }
                if (z2) {
                    return;
                }
                f(this.f385e, this.f386f);
            }
        }

        @Override // androidx.appcompat.view.menu.m
        public boolean e() {
            return false;
        }

        @Override // androidx.appcompat.view.menu.m
        public boolean f(androidx.appcompat.view.menu.g gVar, androidx.appcompat.view.menu.i iVar) {
            KeyEvent.Callback callback = Toolbar.this.f382m;
            if (callback instanceof c.a.o.c) {
                ((c.a.o.c) callback).f();
            }
            Toolbar toolbar = Toolbar.this;
            toolbar.removeView(toolbar.f382m);
            Toolbar toolbar2 = Toolbar.this;
            toolbar2.removeView(toolbar2.f381l);
            Toolbar toolbar3 = Toolbar.this;
            toolbar3.f382m = null;
            toolbar3.a();
            this.f386f = null;
            Toolbar.this.requestLayout();
            iVar.r(false);
            return true;
        }

        @Override // androidx.appcompat.view.menu.m
        public boolean g(androidx.appcompat.view.menu.g gVar, androidx.appcompat.view.menu.i iVar) {
            Toolbar.this.g();
            ViewParent parent = Toolbar.this.f381l.getParent();
            Toolbar toolbar = Toolbar.this;
            if (parent != toolbar) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(toolbar.f381l);
                }
                Toolbar toolbar2 = Toolbar.this;
                toolbar2.addView(toolbar2.f381l);
            }
            Toolbar.this.f382m = iVar.getActionView();
            this.f386f = iVar;
            ViewParent parent2 = Toolbar.this.f382m.getParent();
            Toolbar toolbar3 = Toolbar.this;
            if (parent2 != toolbar3) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(toolbar3.f382m);
                }
                e eVarGenerateDefaultLayoutParams = Toolbar.this.generateDefaultLayoutParams();
                Toolbar toolbar4 = Toolbar.this;
                eVarGenerateDefaultLayoutParams.a = 8388611 | (toolbar4.r & SyslogConstants.LOG_ALERT);
                eVarGenerateDefaultLayoutParams.f388b = 2;
                toolbar4.f382m.setLayoutParams(eVarGenerateDefaultLayoutParams);
                Toolbar toolbar5 = Toolbar.this;
                toolbar5.addView(toolbar5.f382m);
            }
            Toolbar.this.G();
            Toolbar.this.requestLayout();
            iVar.r(true);
            KeyEvent.Callback callback = Toolbar.this.f382m;
            if (callback instanceof c.a.o.c) {
                ((c.a.o.c) callback).c();
            }
            return true;
        }

        @Override // androidx.appcompat.view.menu.m
        public void i(Context context, androidx.appcompat.view.menu.g gVar) {
            androidx.appcompat.view.menu.i iVar;
            androidx.appcompat.view.menu.g gVar2 = this.f385e;
            if (gVar2 != null && (iVar = this.f386f) != null) {
                gVar2.f(iVar);
            }
            this.f385e = gVar;
        }

        @Override // androidx.appcompat.view.menu.m
        public boolean k(androidx.appcompat.view.menu.r rVar) {
            return false;
        }
    }

    public interface f {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, c.a.a.N);
    }

    private int B(View view, int i2, int[] iArr, int i3) {
        e eVar = (e) view.getLayoutParams();
        int i4 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin - iArr[0];
        int iMax = i2 + Math.max(0, i4);
        iArr[0] = Math.max(0, -i4);
        int iQ = q(view, i3);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax, iQ, iMax + measuredWidth, view.getMeasuredHeight() + iQ);
        return iMax + measuredWidth + ((ViewGroup.MarginLayoutParams) eVar).rightMargin;
    }

    private int C(View view, int i2, int[] iArr, int i3) {
        e eVar = (e) view.getLayoutParams();
        int i4 = ((ViewGroup.MarginLayoutParams) eVar).rightMargin - iArr[1];
        int iMax = i2 - Math.max(0, i4);
        iArr[1] = Math.max(0, -i4);
        int iQ = q(view, i3);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax - measuredWidth, iQ, iMax, view.getMeasuredHeight() + iQ);
        return iMax - (measuredWidth + ((ViewGroup.MarginLayoutParams) eVar).leftMargin);
    }

    private int D(View view, int i2, int i3, int i4, int i5, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i6 = marginLayoutParams.leftMargin - iArr[0];
        int i7 = marginLayoutParams.rightMargin - iArr[1];
        int iMax = Math.max(0, i6) + Math.max(0, i7);
        iArr[0] = Math.max(0, -i6);
        iArr[1] = Math.max(0, -i7);
        view.measure(ViewGroup.getChildMeasureSpec(i2, getPaddingLeft() + getPaddingRight() + iMax + i3, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i4, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i5, marginLayoutParams.height));
        return view.getMeasuredWidth() + iMax;
    }

    private void E(View view, int i2, int i3, int i4, int i5, int i6) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i3, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i4, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i5, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i6 >= 0) {
            if (mode != 0) {
                i6 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i6);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i6, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    private void F() {
        removeCallbacks(this.S);
        post(this.S);
    }

    private boolean M() {
        if (!this.R) {
            return false;
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (N(childAt) && childAt.getMeasuredWidth() > 0 && childAt.getMeasuredHeight() > 0) {
                return false;
            }
        }
        return true;
    }

    private boolean N(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    private void b(List<View> list, int i2) {
        boolean z = c.h.l.t.B(this) == 1;
        int childCount = getChildCount();
        int iB = c.h.l.d.b(i2, c.h.l.t.B(this));
        list.clear();
        if (!z) {
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                e eVar = (e) childAt.getLayoutParams();
                if (eVar.f388b == 0 && N(childAt) && p(eVar.a) == iB) {
                    list.add(childAt);
                }
            }
            return;
        }
        for (int i4 = childCount - 1; i4 >= 0; i4--) {
            View childAt2 = getChildAt(i4);
            e eVar2 = (e) childAt2.getLayoutParams();
            if (eVar2.f388b == 0 && N(childAt2) && p(eVar2.a) == iB) {
                list.add(childAt2);
            }
        }
    }

    private void c(View view, boolean z) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        e eVarGenerateDefaultLayoutParams = layoutParams == null ? generateDefaultLayoutParams() : !checkLayoutParams(layoutParams) ? generateLayoutParams(layoutParams) : (e) layoutParams;
        eVarGenerateDefaultLayoutParams.f388b = 1;
        if (!z || this.f382m == null) {
            addView(view, eVarGenerateDefaultLayoutParams);
        } else {
            view.setLayoutParams(eVarGenerateDefaultLayoutParams);
            this.I.add(view);
        }
    }

    private MenuInflater getMenuInflater() {
        return new c.a.o.g(getContext());
    }

    private void h() {
        if (this.x == null) {
            this.x = new o0();
        }
    }

    private void i() {
        if (this.f378i == null) {
            this.f378i = new o(getContext());
        }
    }

    private void j() {
        k();
        if (this.f374e.N() == null) {
            androidx.appcompat.view.menu.g gVar = (androidx.appcompat.view.menu.g) this.f374e.getMenu();
            if (this.O == null) {
                this.O = new d();
            }
            this.f374e.setExpandedActionViewsExclusive(true);
            gVar.c(this.O, this.n);
        }
    }

    private void k() {
        if (this.f374e == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext());
            this.f374e = actionMenuView;
            actionMenuView.setPopupTheme(this.o);
            this.f374e.setOnMenuItemClickListener(this.L);
            this.f374e.O(this.P, this.Q);
            e eVarGenerateDefaultLayoutParams = generateDefaultLayoutParams();
            eVarGenerateDefaultLayoutParams.a = 8388613 | (this.r & SyslogConstants.LOG_ALERT);
            this.f374e.setLayoutParams(eVarGenerateDefaultLayoutParams);
            c(this.f374e, false);
        }
    }

    private void l() {
        if (this.f377h == null) {
            this.f377h = new m(getContext(), null, c.a.a.M);
            e eVarGenerateDefaultLayoutParams = generateDefaultLayoutParams();
            eVarGenerateDefaultLayoutParams.a = 8388611 | (this.r & SyslogConstants.LOG_ALERT);
            this.f377h.setLayoutParams(eVarGenerateDefaultLayoutParams);
        }
    }

    private int p(int i2) {
        int iB = c.h.l.t.B(this);
        int iB2 = c.h.l.d.b(i2, iB) & 7;
        return (iB2 == 1 || iB2 == 3 || iB2 == 5) ? iB2 : iB == 1 ? 5 : 3;
    }

    private int q(View view, int i2) {
        e eVar = (e) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i3 = i2 > 0 ? (measuredHeight - i2) / 2 : 0;
        int iR = r(eVar.a);
        if (iR == 48) {
            return getPaddingTop() - i3;
        }
        if (iR == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) eVar).bottomMargin) - i3;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int iMax = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i4 = ((ViewGroup.MarginLayoutParams) eVar).topMargin;
        if (iMax < i4) {
            iMax = i4;
        } else {
            int i5 = (((height - paddingBottom) - measuredHeight) - iMax) - paddingTop;
            int i6 = ((ViewGroup.MarginLayoutParams) eVar).bottomMargin;
            if (i5 < i6) {
                iMax = Math.max(0, iMax - (i6 - i5));
            }
        }
        return paddingTop + iMax;
    }

    private int r(int i2) {
        int i3 = i2 & SyslogConstants.LOG_ALERT;
        return (i3 == 16 || i3 == 48 || i3 == 80) ? i3 : this.A & SyslogConstants.LOG_ALERT;
    }

    private int s(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return c.h.l.g.b(marginLayoutParams) + c.h.l.g.a(marginLayoutParams);
    }

    private int t(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    private int u(List<View> list, int[] iArr) {
        int i2 = iArr[0];
        int i3 = iArr[1];
        int size = list.size();
        int i4 = 0;
        int measuredWidth = 0;
        while (i4 < size) {
            View view = list.get(i4);
            e eVar = (e) view.getLayoutParams();
            int i5 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin - i2;
            int i6 = ((ViewGroup.MarginLayoutParams) eVar).rightMargin - i3;
            int iMax = Math.max(0, i5);
            int iMax2 = Math.max(0, i6);
            int iMax3 = Math.max(0, -i5);
            int iMax4 = Math.max(0, -i6);
            measuredWidth += iMax + view.getMeasuredWidth() + iMax2;
            i4++;
            i3 = iMax4;
            i2 = iMax3;
        }
        return measuredWidth;
    }

    private boolean y(View view) {
        return view.getParent() == this || this.I.contains(view);
    }

    public boolean A() {
        ActionMenuView actionMenuView = this.f374e;
        return actionMenuView != null && actionMenuView.J();
    }

    void G() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (((e) childAt.getLayoutParams()).f388b != 2 && childAt != this.f374e) {
                removeViewAt(childCount);
                this.I.add(childAt);
            }
        }
    }

    public void H(int i2, int i3) {
        h();
        this.x.g(i2, i3);
    }

    public void I(androidx.appcompat.view.menu.g gVar, androidx.appcompat.widget.c cVar) {
        if (gVar == null && this.f374e == null) {
            return;
        }
        k();
        androidx.appcompat.view.menu.g gVarN = this.f374e.N();
        if (gVarN == gVar) {
            return;
        }
        if (gVarN != null) {
            gVarN.O(this.N);
            gVarN.O(this.O);
        }
        if (this.O == null) {
            this.O = new d();
        }
        cVar.G(true);
        if (gVar != null) {
            gVar.c(cVar, this.n);
            gVar.c(this.O, this.n);
        } else {
            cVar.i(this.n, null);
            this.O.i(this.n, null);
            cVar.d(true);
            this.O.d(true);
        }
        this.f374e.setPopupTheme(this.o);
        this.f374e.setPresenter(cVar);
        this.N = cVar;
    }

    public void J(m.a aVar, g.a aVar2) {
        this.P = aVar;
        this.Q = aVar2;
        ActionMenuView actionMenuView = this.f374e;
        if (actionMenuView != null) {
            actionMenuView.O(aVar, aVar2);
        }
    }

    public void K(Context context, int i2) {
        this.q = i2;
        TextView textView = this.f376g;
        if (textView != null) {
            textView.setTextAppearance(context, i2);
        }
    }

    public void L(Context context, int i2) {
        this.p = i2;
        TextView textView = this.f375f;
        if (textView != null) {
            textView.setTextAppearance(context, i2);
        }
    }

    public boolean O() {
        ActionMenuView actionMenuView = this.f374e;
        return actionMenuView != null && actionMenuView.P();
    }

    void a() {
        for (int size = this.I.size() - 1; size >= 0; size--) {
            addView(this.I.get(size));
        }
        this.I.clear();
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof e);
    }

    public boolean d() {
        ActionMenuView actionMenuView;
        return getVisibility() == 0 && (actionMenuView = this.f374e) != null && actionMenuView.K();
    }

    public void e() {
        d dVar = this.O;
        androidx.appcompat.view.menu.i iVar = dVar == null ? null : dVar.f386f;
        if (iVar != null) {
            iVar.collapseActionView();
        }
    }

    public void f() {
        ActionMenuView actionMenuView = this.f374e;
        if (actionMenuView != null) {
            actionMenuView.B();
        }
    }

    void g() {
        if (this.f381l == null) {
            m mVar = new m(getContext(), null, c.a.a.M);
            this.f381l = mVar;
            mVar.setImageDrawable(this.f379j);
            this.f381l.setContentDescription(this.f380k);
            e eVarGenerateDefaultLayoutParams = generateDefaultLayoutParams();
            eVarGenerateDefaultLayoutParams.a = 8388611 | (this.r & SyslogConstants.LOG_ALERT);
            eVarGenerateDefaultLayoutParams.f388b = 2;
            this.f381l.setLayoutParams(eVarGenerateDefaultLayoutParams);
            this.f381l.setOnClickListener(new c());
        }
    }

    public CharSequence getCollapseContentDescription() {
        ImageButton imageButton = this.f381l;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        ImageButton imageButton = this.f381l;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        o0 o0Var = this.x;
        if (o0Var != null) {
            return o0Var.a();
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i2 = this.z;
        return i2 != Integer.MIN_VALUE ? i2 : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        o0 o0Var = this.x;
        if (o0Var != null) {
            return o0Var.b();
        }
        return 0;
    }

    public int getContentInsetRight() {
        o0 o0Var = this.x;
        if (o0Var != null) {
            return o0Var.c();
        }
        return 0;
    }

    public int getContentInsetStart() {
        o0 o0Var = this.x;
        if (o0Var != null) {
            return o0Var.d();
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i2 = this.y;
        return i2 != Integer.MIN_VALUE ? i2 : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        androidx.appcompat.view.menu.g gVarN;
        ActionMenuView actionMenuView = this.f374e;
        return actionMenuView != null && (gVarN = actionMenuView.N()) != null && gVarN.hasVisibleItems() ? Math.max(getContentInsetEnd(), Math.max(this.z, 0)) : getContentInsetEnd();
    }

    public int getCurrentContentInsetLeft() {
        return c.h.l.t.B(this) == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return c.h.l.t.B(this) == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.y, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        ImageView imageView = this.f378i;
        if (imageView != null) {
            return imageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        ImageView imageView = this.f378i;
        if (imageView != null) {
            return imageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        j();
        return this.f374e.getMenu();
    }

    public CharSequence getNavigationContentDescription() {
        ImageButton imageButton = this.f377h;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        ImageButton imageButton = this.f377h;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    androidx.appcompat.widget.c getOuterActionMenuPresenter() {
        return this.N;
    }

    public Drawable getOverflowIcon() {
        j();
        return this.f374e.getOverflowIcon();
    }

    Context getPopupContext() {
        return this.n;
    }

    public int getPopupTheme() {
        return this.o;
    }

    public CharSequence getSubtitle() {
        return this.C;
    }

    final TextView getSubtitleTextView() {
        return this.f376g;
    }

    public CharSequence getTitle() {
        return this.B;
    }

    public int getTitleMarginBottom() {
        return this.w;
    }

    public int getTitleMarginEnd() {
        return this.u;
    }

    public int getTitleMarginStart() {
        return this.t;
    }

    public int getTitleMarginTop() {
        return this.v;
    }

    final TextView getTitleTextView() {
        return this.f375f;
    }

    public d0 getWrapper() {
        if (this.M == null) {
            this.M = new x0(this, true);
        }
        return this.M;
    }

    @Override // android.view.ViewGroup
    /* renamed from: m */
    public e generateDefaultLayoutParams() {
        return new e(-2, -2);
    }

    @Override // android.view.ViewGroup
    /* renamed from: n */
    public e generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    /* renamed from: o */
    public e generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e ? new e((e) layoutParams) : layoutParams instanceof a.C0000a ? new e((a.C0000a) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new e((ViewGroup.MarginLayoutParams) layoutParams) : new e(layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.S);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.G = false;
        }
        if (!this.G) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.G = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.G = false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:142:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x029f A[LOOP:0: B:227:0x029d->B:228:0x029f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:231:0x02c1 A[LOOP:1: B:230:0x02bf->B:231:0x02c1, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:235:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x02fa A[LOOP:2: B:239:0x02f8->B:240:0x02fa, LOOP_END] */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void onLayout(boolean r20, int r21, int r22, int r23, int r24) throws java.lang.NoSuchFieldException {
        /*
            Method dump skipped, instructions count: 783
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    protected void onMeasure(int i2, int i3) {
        char c2;
        char c3;
        int measuredWidth;
        int iMax;
        int iCombineMeasuredStates;
        int measuredWidth2;
        int iCombineMeasuredStates2;
        int iMax2;
        int measuredHeight;
        int[] iArr = this.J;
        if (c1.b(this)) {
            c2 = 1;
            c3 = 0;
        } else {
            c2 = 0;
            c3 = 1;
        }
        if (N(this.f377h)) {
            E(this.f377h, i2, 0, i3, 0, this.s);
            measuredWidth = this.f377h.getMeasuredWidth() + s(this.f377h);
            iMax = Math.max(0, this.f377h.getMeasuredHeight() + t(this.f377h));
            iCombineMeasuredStates = View.combineMeasuredStates(0, this.f377h.getMeasuredState());
        } else {
            measuredWidth = 0;
            iMax = 0;
            iCombineMeasuredStates = 0;
        }
        if (N(this.f381l)) {
            E(this.f381l, i2, 0, i3, 0, this.s);
            measuredWidth = this.f381l.getMeasuredWidth() + s(this.f381l);
            iMax = Math.max(iMax, this.f381l.getMeasuredHeight() + t(this.f381l));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f381l.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int iMax3 = 0 + Math.max(currentContentInsetStart, measuredWidth);
        iArr[c2] = Math.max(0, currentContentInsetStart - measuredWidth);
        if (N(this.f374e)) {
            E(this.f374e, i2, iMax3, i3, 0, this.s);
            measuredWidth2 = this.f374e.getMeasuredWidth() + s(this.f374e);
            iMax = Math.max(iMax, this.f374e.getMeasuredHeight() + t(this.f374e));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f374e.getMeasuredState());
        } else {
            measuredWidth2 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int iMax4 = iMax3 + Math.max(currentContentInsetEnd, measuredWidth2);
        iArr[c3] = Math.max(0, currentContentInsetEnd - measuredWidth2);
        if (N(this.f382m)) {
            iMax4 += D(this.f382m, i2, iMax4, i3, 0, iArr);
            iMax = Math.max(iMax, this.f382m.getMeasuredHeight() + t(this.f382m));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f382m.getMeasuredState());
        }
        if (N(this.f378i)) {
            iMax4 += D(this.f378i, i2, iMax4, i3, 0, iArr);
            iMax = Math.max(iMax, this.f378i.getMeasuredHeight() + t(this.f378i));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f378i.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (((e) childAt.getLayoutParams()).f388b == 0 && N(childAt)) {
                iMax4 += D(childAt, i2, iMax4, i3, 0, iArr);
                iMax = Math.max(iMax, childAt.getMeasuredHeight() + t(childAt));
                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState());
            }
        }
        int i5 = this.v + this.w;
        int i6 = this.t + this.u;
        if (N(this.f375f)) {
            D(this.f375f, i2, iMax4 + i6, i3, i5, iArr);
            int measuredWidth3 = this.f375f.getMeasuredWidth() + s(this.f375f);
            measuredHeight = this.f375f.getMeasuredHeight() + t(this.f375f);
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.f375f.getMeasuredState());
            iMax2 = measuredWidth3;
        } else {
            iCombineMeasuredStates2 = iCombineMeasuredStates;
            iMax2 = 0;
            measuredHeight = 0;
        }
        if (N(this.f376g)) {
            iMax2 = Math.max(iMax2, D(this.f376g, i2, iMax4 + i6, i3, measuredHeight + i5, iArr));
            measuredHeight += this.f376g.getMeasuredHeight() + t(this.f376g);
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, this.f376g.getMeasuredState());
        }
        int iMax5 = Math.max(iMax, measuredHeight);
        setMeasuredDimension(View.resolveSizeAndState(Math.max(iMax4 + iMax2 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i2, (-16777216) & iCombineMeasuredStates2), M() ? 0 : View.resolveSizeAndState(Math.max(iMax5 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i3, iCombineMeasuredStates2 << 16));
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem menuItemFindItem;
        if (!(parcelable instanceof g)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        g gVar = (g) parcelable;
        super.onRestoreInstanceState(gVar.a());
        ActionMenuView actionMenuView = this.f374e;
        androidx.appcompat.view.menu.g gVarN = actionMenuView != null ? actionMenuView.N() : null;
        int i2 = gVar.f389g;
        if (i2 != 0 && this.O != null && gVarN != null && (menuItemFindItem = gVarN.findItem(i2)) != null) {
            menuItemFindItem.expandActionView();
        }
        if (gVar.f390h) {
            F();
        }
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i2) {
        if (Build.VERSION.SDK_INT >= 17) {
            super.onRtlPropertiesChanged(i2);
        }
        h();
        this.x.f(i2 == 1);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        androidx.appcompat.view.menu.i iVar;
        g gVar = new g(super.onSaveInstanceState());
        d dVar = this.O;
        if (dVar != null && (iVar = dVar.f386f) != null) {
            gVar.f389g = iVar.getItemId();
        }
        gVar.f390h = A();
        return gVar;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.F = false;
        }
        if (!this.F) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.F = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.F = false;
        }
        return true;
    }

    public void setCollapseContentDescription(int i2) {
        setCollapseContentDescription(i2 != 0 ? getContext().getText(i2) : null);
    }

    public void setCollapseIcon(int i2) {
        setCollapseIcon(c.a.k.a.a.d(getContext(), i2));
    }

    public void setCollapsible(boolean z) {
        this.R = z;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i2) {
        if (i2 < 0) {
            i2 = Level.ALL_INT;
        }
        if (i2 != this.z) {
            this.z = i2;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i2) {
        if (i2 < 0) {
            i2 = Level.ALL_INT;
        }
        if (i2 != this.y) {
            this.y = i2;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i2) {
        setLogo(c.a.k.a.a.d(getContext(), i2));
    }

    public void setLogoDescription(int i2) {
        setLogoDescription(getContext().getText(i2));
    }

    public void setNavigationContentDescription(int i2) {
        setNavigationContentDescription(i2 != 0 ? getContext().getText(i2) : null);
    }

    public void setNavigationIcon(int i2) {
        setNavigationIcon(c.a.k.a.a.d(getContext(), i2));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        l();
        this.f377h.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(f fVar) {
        this.K = fVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        j();
        this.f374e.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i2) {
        if (this.o != i2) {
            this.o = i2;
            if (i2 == 0) {
                this.n = getContext();
            } else {
                this.n = new ContextThemeWrapper(getContext(), i2);
            }
        }
    }

    public void setSubtitle(int i2) {
        setSubtitle(getContext().getText(i2));
    }

    public void setSubtitleTextColor(int i2) {
        setSubtitleTextColor(ColorStateList.valueOf(i2));
    }

    public void setTitle(int i2) {
        setTitle(getContext().getText(i2));
    }

    public void setTitleMarginBottom(int i2) {
        this.w = i2;
        requestLayout();
    }

    public void setTitleMarginEnd(int i2) {
        this.u = i2;
        requestLayout();
    }

    public void setTitleMarginStart(int i2) {
        this.t = i2;
        requestLayout();
    }

    public void setTitleMarginTop(int i2) {
        this.v = i2;
        requestLayout();
    }

    public void setTitleTextColor(int i2) {
        setTitleTextColor(ColorStateList.valueOf(i2));
    }

    public boolean v() {
        d dVar = this.O;
        return (dVar == null || dVar.f386f == null) ? false : true;
    }

    public boolean w() {
        ActionMenuView actionMenuView = this.f374e;
        return actionMenuView != null && actionMenuView.H();
    }

    public void x(int i2) {
        getMenuInflater().inflate(i2, getMenu());
    }

    public boolean z() {
        ActionMenuView actionMenuView = this.f374e;
        return actionMenuView != null && actionMenuView.I();
    }

    public static class e extends a.C0000a {

        /* renamed from: b */
        int f388b;

        public e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f388b = 0;
        }

        void a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) this).leftMargin = marginLayoutParams.leftMargin;
            ((ViewGroup.MarginLayoutParams) this).topMargin = marginLayoutParams.topMargin;
            ((ViewGroup.MarginLayoutParams) this).rightMargin = marginLayoutParams.rightMargin;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = marginLayoutParams.bottomMargin;
        }

        public e(int i2, int i3) {
            super(i2, i3);
            this.f388b = 0;
            this.a = 8388627;
        }

        public e(e eVar) {
            super((a.C0000a) eVar);
            this.f388b = 0;
            this.f388b = eVar.f388b;
        }

        public e(a.C0000a c0000a) {
            super(c0000a);
            this.f388b = 0;
        }

        public e(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f388b = 0;
            a(marginLayoutParams);
        }

        public e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f388b = 0;
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.A = 8388627;
        this.H = new ArrayList<>();
        this.I = new ArrayList<>();
        this.J = new int[2];
        this.L = new a();
        this.S = new b();
        Context context2 = getContext();
        int[] iArr = c.a.j.k3;
        w0 w0VarV = w0.v(context2, attributeSet, iArr, i2, 0);
        c.h.l.t.i0(this, context, iArr, attributeSet, w0VarV.r(), i2, 0);
        this.p = w0VarV.n(c.a.j.M3, 0);
        this.q = w0VarV.n(c.a.j.D3, 0);
        this.A = w0VarV.l(c.a.j.l3, this.A);
        this.r = w0VarV.l(c.a.j.m3, 48);
        int iE = w0VarV.e(c.a.j.G3, 0);
        int i3 = c.a.j.L3;
        iE = w0VarV.s(i3) ? w0VarV.e(i3, iE) : iE;
        this.w = iE;
        this.v = iE;
        this.u = iE;
        this.t = iE;
        int iE2 = w0VarV.e(c.a.j.J3, -1);
        if (iE2 >= 0) {
            this.t = iE2;
        }
        int iE3 = w0VarV.e(c.a.j.I3, -1);
        if (iE3 >= 0) {
            this.u = iE3;
        }
        int iE4 = w0VarV.e(c.a.j.K3, -1);
        if (iE4 >= 0) {
            this.v = iE4;
        }
        int iE5 = w0VarV.e(c.a.j.H3, -1);
        if (iE5 >= 0) {
            this.w = iE5;
        }
        this.s = w0VarV.f(c.a.j.x3, -1);
        int iE6 = w0VarV.e(c.a.j.t3, Level.ALL_INT);
        int iE7 = w0VarV.e(c.a.j.p3, Level.ALL_INT);
        int iF = w0VarV.f(c.a.j.r3, 0);
        int iF2 = w0VarV.f(c.a.j.s3, 0);
        h();
        this.x.e(iF, iF2);
        if (iE6 != Integer.MIN_VALUE || iE7 != Integer.MIN_VALUE) {
            this.x.g(iE6, iE7);
        }
        this.y = w0VarV.e(c.a.j.u3, Level.ALL_INT);
        this.z = w0VarV.e(c.a.j.q3, Level.ALL_INT);
        this.f379j = w0VarV.g(c.a.j.o3);
        this.f380k = w0VarV.p(c.a.j.n3);
        CharSequence charSequenceP = w0VarV.p(c.a.j.F3);
        if (!TextUtils.isEmpty(charSequenceP)) {
            setTitle(charSequenceP);
        }
        CharSequence charSequenceP2 = w0VarV.p(c.a.j.C3);
        if (!TextUtils.isEmpty(charSequenceP2)) {
            setSubtitle(charSequenceP2);
        }
        this.n = getContext();
        setPopupTheme(w0VarV.n(c.a.j.B3, 0));
        Drawable drawableG = w0VarV.g(c.a.j.A3);
        if (drawableG != null) {
            setNavigationIcon(drawableG);
        }
        CharSequence charSequenceP3 = w0VarV.p(c.a.j.z3);
        if (!TextUtils.isEmpty(charSequenceP3)) {
            setNavigationContentDescription(charSequenceP3);
        }
        Drawable drawableG2 = w0VarV.g(c.a.j.v3);
        if (drawableG2 != null) {
            setLogo(drawableG2);
        }
        CharSequence charSequenceP4 = w0VarV.p(c.a.j.w3);
        if (!TextUtils.isEmpty(charSequenceP4)) {
            setLogoDescription(charSequenceP4);
        }
        int i4 = c.a.j.N3;
        if (w0VarV.s(i4)) {
            setTitleTextColor(w0VarV.c(i4));
        }
        int i5 = c.a.j.E3;
        if (w0VarV.s(i5)) {
            setSubtitleTextColor(w0VarV.c(i5));
        }
        int i6 = c.a.j.y3;
        if (w0VarV.s(i6)) {
            x(w0VarV.n(i6, 0));
        }
        w0VarV.w();
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            g();
        }
        ImageButton imageButton = this.f381l;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            g();
            this.f381l.setImageDrawable(drawable);
        } else {
            ImageButton imageButton = this.f381l;
            if (imageButton != null) {
                imageButton.setImageDrawable(this.f379j);
            }
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            i();
            if (!y(this.f378i)) {
                c(this.f378i, true);
            }
        } else {
            ImageView imageView = this.f378i;
            if (imageView != null && y(imageView)) {
                removeView(this.f378i);
                this.I.remove(this.f378i);
            }
        }
        ImageView imageView2 = this.f378i;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            i();
        }
        ImageView imageView = this.f378i;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            l();
        }
        ImageButton imageButton = this.f377h;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            l();
            if (!y(this.f377h)) {
                c(this.f377h, true);
            }
        } else {
            ImageButton imageButton = this.f377h;
            if (imageButton != null && y(imageButton)) {
                removeView(this.f377h);
                this.I.remove(this.f377h);
            }
        }
        ImageButton imageButton2 = this.f377h;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            TextView textView = this.f376g;
            if (textView != null && y(textView)) {
                removeView(this.f376g);
                this.I.remove(this.f376g);
            }
        } else {
            if (this.f376g == null) {
                Context context = getContext();
                z zVar = new z(context);
                this.f376g = zVar;
                zVar.setSingleLine();
                this.f376g.setEllipsize(TextUtils.TruncateAt.END);
                int i2 = this.q;
                if (i2 != 0) {
                    this.f376g.setTextAppearance(context, i2);
                }
                ColorStateList colorStateList = this.E;
                if (colorStateList != null) {
                    this.f376g.setTextColor(colorStateList);
                }
            }
            if (!y(this.f376g)) {
                c(this.f376g, true);
            }
        }
        TextView textView2 = this.f376g;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.C = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.E = colorStateList;
        TextView textView = this.f376g;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            TextView textView = this.f375f;
            if (textView != null && y(textView)) {
                removeView(this.f375f);
                this.I.remove(this.f375f);
            }
        } else {
            if (this.f375f == null) {
                Context context = getContext();
                z zVar = new z(context);
                this.f375f = zVar;
                zVar.setSingleLine();
                this.f375f.setEllipsize(TextUtils.TruncateAt.END);
                int i2 = this.p;
                if (i2 != 0) {
                    this.f375f.setTextAppearance(context, i2);
                }
                ColorStateList colorStateList = this.D;
                if (colorStateList != null) {
                    this.f375f.setTextColor(colorStateList);
                }
            }
            if (!y(this.f375f)) {
                c(this.f375f, true);
            }
        }
        TextView textView2 = this.f375f;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.B = charSequence;
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.D = colorStateList;
        TextView textView = this.f375f;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public static class g extends c.j.a.a {
        public static final Parcelable.Creator<g> CREATOR = new a();

        /* renamed from: g */
        int f389g;

        /* renamed from: h */
        boolean f390h;

        class a implements Parcelable.ClassLoaderCreator<g> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public g createFromParcel(Parcel parcel) {
                return new g(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b */
            public g createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new g(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c */
            public g[] newArray(int i2) {
                return new g[i2];
            }
        }

        public g(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f389g = parcel.readInt();
            this.f390h = parcel.readInt() != 0;
        }

        @Override // c.j.a.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeInt(this.f389g);
            parcel.writeInt(this.f390h ? 1 : 0);
        }

        public g(Parcelable parcelable) {
            super(parcelable);
        }
    }
}